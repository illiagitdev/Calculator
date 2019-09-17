package tasks;

import java.sql.Time;
import java.util.Date;
import java.util.zip.Checksum;

public class MessagesReader {
    public static void main(String[] args) {
        String message = "$GPRMC,165110.000,A,5601.0318,N,01211.3503,E,0.09,28.11,190706,,*35";

//        $GPGSV,3,3,11,04,07,102,30,29,02,170,09,18,02,243,*42
//        $GPGSV,3,3,11,04,07,102,30,29,02,170,09,18,02,243,*42
//        $GPRMC,165110.000,A,5601.0318,N,01211.3503,E,0.09,28.11,190706,,*35
//        $GPVTG,45.67,T,,M,0.08,N,0.1,K*59
//        $GPGGA,165114.000,5601.0318,N,01211.3504,E,1,07,1.2,22.6,M,41.6,M,,0000*62
//        $GPGSA,A,3,05,17,22,09,14,04,30,,,,,,1.8,1.2,1.3*32


        Boolean isNMEA = message.startsWith("$");

        if (isNMEA) {
            int checkSumAfter = message.indexOf("*");
            int messageChecksum = Integer.parseInt(message.substring(checkSumAfter + 1), 16);
            String head = message.substring(1, message.indexOf(","));
            System.out.println(head);

            String mesageType = head.substring(2);
            System.out.println(mesageType);

            String[] array = message.substring(message.indexOf(",") + 1, message.indexOf("*")).split(",");
            showArray(array);

            switch (mesageType) {
                case "GSV": {
                    deshiferGSV(array);
                    break;
                }
                case "GLL": {
                    deshiferGLL(array);
                    break;
                }
                case "RMC": {
                    deshiferRMC(array);
                    break;
                }
                case "VTG": {
                    deshiferVTG(array);
                    break;
                }
                case "GGA": {
                    deshiferGGA(array);
                    break;
                }
                case "GSA": {
                    deshiferGSA(array);
                    break;
                }
                default: {
                    System.out.println("Not NMEA message or no metod to reat it.");
                    break;
                }
            }

        } else {
            System.out.println("Not NMEA message!");
        }
    }

    private static void deshiferGSA(String[] array) {
        String workMode = array[0];
        int fixType = returnInteger(array[1]);

        int[] satelliteID = new int[12];
        for (int i = 0; i < 12; i++) {
            satelliteID[i] = returnInteger(array[2 + i]);
        }

        double PDOP = returnDouble(array[14]);
        double HDOP = returnDouble(array[15]);
        double VDOP = returnDouble(array[16]);

        System.out.println("GSA - GNSS DOP and Active Satellites");

        System.out.println("Mode\n" +
                "‘M’ = Manual, forced to operate in 2D or 3D mode\n" +
                "‘A’ = Automatic, allowed to automatically switch 2D/3D " + workMode);
        System.out.println("Fix type\n" +
                "1 = Fix not available\n" +
                "2 = 2D\n" +
                "3 = 3D " + fixType);

        for (int i = 0; i < 12; i++) {
            System.out.println("Satellite ID "+(i+1)+": "+satelliteID[i]);
        }

        System.out.println("Position dilution of precision (00.0 to 99.9) " + PDOP);
        System.out.println("Horizontal dilution of precision (00.0 to 99.9) " + HDOP);
        System.out.println("Vertical dilution of precision (00.0 to 99.9) " + VDOP);
    }

    private static void deshiferGGA(String[] array) {
        Date timeUTC = new Date((long) (returnDouble(array[0]) * 1000));//todo: fix formats;
        double latitude = returnDouble(array[1]);
        String indicatorNS = array[2];
        double longitude = returnDouble(array[3]);
        String indicatorEW = array[4];
        int qualityIndicator = returnInteger(array[5]);
        int satellitesUsed = returnInteger(array[6]);
        double HDOP = returnDouble(array[7]);
        double altitude = returnDouble(array[8]);
        String altitudeIndex = array[9];
        double geoidalSeparation = returnDouble(array[10]);
        String geoidalSeparationIndex = array[11];
        Date alignmentDGPS = new Date((long) (returnDouble(array[12]) * 1000));
        int refStation = returnInteger(array[13]);

        System.out.println("GGA - Global Positioning System Fix Data");

        System.out.println("UTC of position in hhmmss.sss format, (000000.000 ~ 235959.999): " + timeUTC);
        System.out.println("Latitude in ddmm.mmmm format. Leading zeros are inserted. " + latitude);
        System.out.println("‘N’ = North, ‘S’ = South " + indicatorNS);
        System.out.println("Longitude in dddmm.mmmm format. Leading zeros are inserted. " + longitude);
        System.out.println("‘E’ = East, ‘W’ = West" + indicatorEW);
        System.out.println("GPS quality indicator\n" +
                "0: position fix unavailable\n" +
                "1: valid position fix, SPS mode\n" +
                "2: valid position fix, differential GPS mode " + qualityIndicator);
        System.out.println("Number of satellites in use, (00 ~ 24) " + satellitesUsed);
        System.out.println("Horizontal dilution of precision, (00.0 ~ 99.9) " + HDOP);
        System.out.println("Mean sea level altitude (-9999.9 ~ 17999.9) in meter " + altitude);
        System.out.println("altitudeIndex " + altitudeIndex);
        System.out.println("Geoidal Separation(meters) " + geoidalSeparation);
        System.out.println("geoidalSeparationIndex " + geoidalSeparationIndex);
        System.out.println("DGPS alignment " + alignmentDGPS);
        System.out.println("Differential reference station ID, 0000 ~ 1023\n" +
                "NULL when DGPS not used " + refStation);
    }

    private static void deshiferVTG(String[] array) {
        double courseTrue =returnDouble(array[0]);
        String courseTrueID=array[1];
        double courseMagnetic=returnDouble(array[2]);
        String courseMagneticID=array[3];
        double speedKnots =returnDouble(array[4]);
        String speedKnotsID=array[5];
        double speedKpH =returnDouble(array[6]);
        String speedKpHID=array[7];


        System.out.println("VTG - Course Over Ground and Ground Speed");

        System.out.println("Course over ground, degrees True (000.0 ~ 359.9) "+courseTrue);
        System.out.println("courseTrue "+courseTrueID);
        System.out.println("Course over ground, degrees Magnetic (000.0 ~ 359.9) "+courseMagnetic);
        System.out.println("courseMagnetic "+courseMagneticID);
        System.out.println("Speed over ground in knots (000.0 ~ 999.9) "+speedKnots);
        System.out.println("speedKnots "+speedKnotsID);
        System.out.println("Speed over ground in kilometers per hour (0000.0 ~ 1800.0) "+speedKpH);
        System.out.println("speedKpH "+speedKpHID);
    }

    private static void deshiferRMC(String[] array) {

        System.out.println("RMC -  Recommended Minimum Specific GNSS Data");

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    private static void deshiferGLL(String[] array) {
        System.out.println("GLL - Geographic Position – Latitude/Longitude");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    private static void deshiferGSV(String[] array) {
        System.out.println("GSV - GNSS DOP and Active Satellites");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    /**
     * Prints array
     */
    private static void showArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + ": " + array[i] + " ");
        }
        System.out.println();
    }

    /**
     * returns double or 0.0 if empty
     */
    private static double returnDouble(String s) {
        return s.isEmpty() ? 0.0 : Double.parseDouble(s);
    }

    /**
     * returns Integer or 0 if empty
     */
    private static int returnInteger(String s) {
        return s.isEmpty() ? 0 : Integer.parseInt(s);
    }
}

