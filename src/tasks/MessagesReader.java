package tasks;

import java.sql.Time;
import java.util.Date;
import java.util.zip.Checksum;

public class MessagesReader {
    public static void main(String[] args) {
        String message = "$GPGSA,A,3,05,17,22,09,14,04,30,,,,,,1.8,1.2,1.3*32";

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

            String[] array = message.substring(message.indexOf(",")+1, message.indexOf("*")).split(",");
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

        System.out.println("GSA - GNSS DOP and Active Satellites");

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    private static void deshiferGGA(String[] array) {
        Date timeUTC = new Date((long) (Double.parseDouble(array[0]) * 1000));//todo: fix formats;
        double latitude = Double.parseDouble(array[1]);
        String indicatorNS = array[2];
        double longitude = Double.parseDouble(array[3]);
        String indicatorEW = array[4];
        int qualityIndicator = Integer.parseInt(array[5]);
        int satellitesUsed = Integer.parseInt(array[6]);
        double HDOP = Double.parseDouble(array[7]);
        double altitude = Double.parseDouble(array[8]);
        String altitudeIndex = array[9];
        double geoidalSeparation = Double.parseDouble(array[10]);
        String geoidalSeparationIndex = array[11];
        Date alignmentDGPS= array[12].isEmpty() ? new Date(0) :new Date((long) (Double.parseDouble(array[12]) * 1000));
        int refStation = array[13].isEmpty() ? 0 : Integer.parseInt(array[13]);

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
        System.out.println("DGPS alignment "+alignmentDGPS);
        System.out.println("Differential reference station ID, 0000 ~ 1023\n" +
                "NULL when DGPS not used " + refStation);
    }

    private static void deshiferVTG(String[] array) {
        System.out.println("VTG - Course Over Ground and Ground Speed");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
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
}
