public class Wilder {

    // Attributs
    private String firstname;
    private boolean aware;
        
    
        // Constructors
        public Wilder(String firstname, boolean aware) {
            this.firstname = firstname;
            this.aware = aware;
        }
    
        //getters
        public String getFirstname() {
            return this.firstname;
        }
        public boolean isAware() {
            return this.aware;
        }
    
        //setters
        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }
        
        public void setAware(boolean aware) {
            this.aware = aware;
        }
    
        // Method
        public String whoAmI() {
            String awareStatus = aware ? "suis aware" : "ne suis pas aware";
            return "Je m'appelle " + this.firstname + " et je " + awareStatus;
    }
}