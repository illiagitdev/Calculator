package tasks;

import java.util.zip.Checksum;

public class MessagesReader {
    public static void main(String[] args) {
        String message = "$GPGSV,3,2,11,30,16,246,33,22,14,279,24,24,13,077,,26,09,172,22*7E";

        Boolean isNMEA = message.startsWith("$");

        if (isNMEA) {
            int checkSumAfter = message.indexOf("*");
            int messageChecksum=Integer.parseInt(message.substring(checkSumAfter + 1), 16);
            String head = message.substring(1, message.indexOf(","));
            System.out.println(head);

            String mesageType = head.substring(2);
            System.out.println(mesageType);

            String[] array = message.substring(message.indexOf(","), message.indexOf("*")).split(",");
            showArray(array);

            switch (mesageType){
                case "GSV":{
                    deshiferGSV(array);
                }
                case "GLL":{
                    deshiferGLL(array);
                }
                case "RMC":{
                    deshiferRMC(array);
                }
                case "VTG":{
                    deshiferVTG(array);
                }
                case "GGA":{
                    deshiferGGA(array);
                }
                case "GSA":{
                    deshiferGSA(array);
                }
                default:{
                    System.out.println("");
                }
            }

        } else {
            System.out.println("Not NMEA message!");
        }
    }

    private static void deshiferGSA(String[] array) {
        System.out.println("GSA - GNSS DOP and Active Satellites");
    }

    private static void deshiferGGA(String[] array) {
        System.out.println("GGA - Global Positioning System Fix Data");
    }

    private static void deshiferVTG(String[] array) {
        System.out.println("VTG - Course Over Ground and Ground Speed");
    }

    private static void deshiferRMC(String[] array) {
        System.out.println("RMC -  Recommended Minimum Specific GNSS Data");
    }

    private static void deshiferGLL(String[] array) {
        System.out.println("GLL - Geographic Position – Latitude/Longitude");
    }

    private static void deshiferGSV(String[] array) {
        System.out.println("GSV - GNSS DOP and Active Satellites");
    }

    /**
     * Prints array
     */
    private static void showArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
