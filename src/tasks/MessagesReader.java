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


            String[] array = message.substring(1, message.indexOf("*")).split(",");
            showArray(array);

        } else {
            System.out.println("Not NMEA message!");
        }
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
