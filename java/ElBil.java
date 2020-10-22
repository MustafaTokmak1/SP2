public class ElBil extends Bil {
    private int batteriKapacitetKWh;
    private int maxKm;
    private int whPrKm;
    public ElBil(String regNr, String maerke, int aargang, int antalDore, int batteriKapacitetKWh, int maxKm, int whPrKm) {
        super(regNr, maerke, aargang, antalDore);
        this.batteriKapacitetKWh = batteriKapacitetKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    public int getBatteriKapacitetKWh() {
        return batteriKapacitetKWh;
    }

    public void setBatteriKapacitetKWh(int batteriKapacitetKWh) {
        this.batteriKapacitetKWh = batteriKapacitetKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public int getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }

    @Override
    public String toString() {
        return "ElBil: " +  " regNr = " + getRegNr() + ", maerke = " + getMaerke() + ", aargang = " + getAargang() + ", antalDore = "
                + getAntalDore()  + ", batteriKapacitetKWh = " + batteriKapacitetKWh + ", maxKm = " + maxKm +
                ", whPrKm = " + whPrKm + "\n";
    }

    public double beregnGroenEjerAfgift() {
        double kmPrL;
        double grønEjerAfgift;
        kmPrL = 100/(whPrKm/91.25);
        if(kmPrL >= 20 && kmPrL < 50){
            grønEjerAfgift = 330;
            return grønEjerAfgift;
        } else if (kmPrL >= 15 && kmPrL < 20){
            grønEjerAfgift = 1050;
            return grønEjerAfgift;
        } else if (kmPrL >= 10 && kmPrL < 15){
            grønEjerAfgift = 2340;
            return grønEjerAfgift;
        }
        else if (kmPrL >= 5 && kmPrL > 10){
            grønEjerAfgift = 5500;
            return grønEjerAfgift;
        } else if (kmPrL > 0 && kmPrL < 5){
            grønEjerAfgift = 10470;
            return grønEjerAfgift;
        } else {
            System.out.println("Ugyldigt tal");
        }
        return 0;
    }
}
