package lesson13online.enumx;

public class Main {
    enum NMEAtype{GPGAA, NPGSV};

    public  interface NMEA{
          NMEAtype getType();
    }

    static class GPGAA implements NMEA{
        final NMEAtype type=NMEAtype.GPGAA;

        @Override
        public NMEAtype getType() {
            return NMEAtype.GPGAA;
        }
    }

    static class NPGSV implements NMEA{
        final NMEAtype type=NMEAtype.NPGSV;

        @Override
        public  NMEAtype getType() {
            return NMEAtype.NPGSV;
        }
    }

    public static void main(String[] args) {
        NMEA[] nmeas= new NMEA[3];
        nmeas[0] = new GPGAA();
        nmeas[1] = new NPGSV();
        nmeas[2] = new GPGAA();

        //how define
        for (NMEA x:nmeas             ) {
            if(nmeas.getClass().equals(GPGAA.class));
            switch (x.getType()) {
                case GPGAA:
                    break;
                case NPGSV:
                    break;
            }
        }

//        if (x. instanceof GPGAA){
//
//        }


     }





//    enum DayOfWeek {Mondat, Tuesda, Wednesday, Thurthday, Friday, Saturday, Sunday}    ;
//    public static void main(String[] args) {
//        int i = 5;
//
//        DayOfWeek day = DayOfWeek.Mondat;
//
//        if (day.equals(DayOfWeek.Friday)){
//            System.out.println("All good");
//        }
//    }
}
