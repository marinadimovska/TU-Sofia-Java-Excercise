public class SickPatient {
        private String epicrisis;
        private String status;
        private int day;

        public SickPatient(String epicrisis, String status, int day) {
            this.epicrisis = epicrisis;
            this.status = status;
            this.day = day;
        }

        public String getEpicrisis() {
            return epicrisis;
        }

        public void setEpicrisis(String epicrisis) {
            this.epicrisis = epicrisis;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public void cure(String cureName, int amount){
            System.out.printf("%s the patient takes this medicine -> %s with this dosage %d",getEpicrisis(),cureName,amount);
        }
    }


