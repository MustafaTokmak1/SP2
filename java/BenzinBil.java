public class BenzinBil extends Bil {

    private int oktanTal;
    private int kmPrL;
    public BenzinBil(String regNr, String maerke, int aargang, int antalDore, int oktanTal, int kmPrL) {
        super(regNr, maerke, aargang, antalDore);
        this.oktanTal = oktanTal;
        this.kmPrL = kmPrL;
    }

    public int getOktanTal() {
        return oktanTal;
    }

    public void setOktanTal(int oktanTal) {
        this.oktanTal = oktanTal;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "BenzinBil: " + " regNr = " + getRegNr() + ", maerke = " + getMaerke() + ", aargang = " + getAargang() + ", antalDore = "
                 + getAntalDore()  + ", oktanTal = " + oktanTal + ", kmPrL = " + kmPrL + "\n";
    }

    @Override
    public double beregnGroenEjerAfgift() {
        double grønEjerAfgift;
        if(kmPrL >= 20 && kmPrL < 50){
            grønEjerAfgift = 330;
            return grønEjerAfgift;
        } else if (kmPrL >= 15 && kmPrL < 20){
            grønEjerAfgift = 1050;
            return grønEjerAfgift;
        } else if (kmPrL >= 10 && kmPrL < 15){
            grønEjerAfgift = 2340;
            return grønEjerAfgift;
        } else if (kmPrL >= 5 && kmPrL < 10){
            grønEjerAfgift = 5500;
            return grønEjerAfgift;
        } else if (kmPrL > 0 && kmPrL < 5){
            grønEjerAfgift = 10470;
            return grønEjerAfgift;
        } else {
            System.out.println("Ugyldigt tal");
            return 0;
        }

    }
}
