package lesson14;

public interface Map {


    enum NMEA{// ключ - константа
        GPGGA("GPGGA"), GPGZA("GPGZA");
        private String meaning;

        NMEA(String meaning) {
            this.meaning = meaning;
        }

        public String getMeaning() {
            return meaning;
        }
    }
}
