public class DieselBil extends Bil{
    private boolean harPartikelFilter;
    private int kmPrL;
    public DieselBil(String regNr, String maerke, int aargang, int antalDore, boolean harPartikelFilter, int kmPrL) {
        super(regNr, maerke, aargang, antalDore);
    this.harPartikelFilter = harPartikelFilter;
    this.kmPrL = kmPrL;
    }

    public boolean isHarPartikelFilter() {
        return harPartikelFilter;
    }

    public void setHarPartikelFilter(boolean harPartikelFilter) {
        this.harPartikelFilter = harPartikelFilter;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "DieselBil: "  + " regNr = " + getRegNr() + ", maerke = " + getMaerke() + ", aargang = " + getAargang() + ", antalDore = "
                + getAntalDore()  +
                " harPartikelFilter = " + harPartikelFilter + ", kmPrL = " + kmPrL + "\n";
    }

    public double beregnGroenEjerAfgift() {
        double grønEjerAfgift;
        double udligningsAfgift;
        double partikelUdledningsAfgift = 1000;
        if(kmPrL >= 20 && kmPrL < 50){
            udligningsAfgift = 130;
            grønEjerAfgift = 330 + udligningsAfgift;
            if(harPartikelFilter == false){
                grønEjerAfgift = grønEjerAfgift + partikelUdledningsAfgift;
            }
            return grønEjerAfgift;
        } else if (kmPrL >= 15 && kmPrL < 20){
            udligningsAfgift = 1390;
            grønEjerAfgift = 1050 + udligningsAfgift;
            if(harPartikelFilter == false){
                grønEjerAfgift = grønEjerAfgift + partikelUdledningsAfgift;
            }
            return grønEjerAfgift;
        } else if (kmPrL >= 10 && kmPrL < 15){
            udligningsAfgift = 1850;
            grønEjerAfgift = 2340 + udligningsAfgift;
            if(harPartikelFilter == false){
                grønEjerAfgift = grønEjerAfgift + partikelUdledningsAfgift;
            }
            return grønEjerAfgift;
        }
        else if (kmPrL >= 5 && kmPrL > 10){
            udligningsAfgift = 2770;
            grønEjerAfgift = 5500 + udligningsAfgift;
            if(harPartikelFilter == false){
                grønEjerAfgift = grønEjerAfgift + partikelUdledningsAfgift;
            }
            return grønEjerAfgift;
        } else if (kmPrL > 0 && kmPrL < 5){
            udligningsAfgift = 15260;
            grønEjerAfgift = 10470 + udligningsAfgift;
            if(harPartikelFilter == false){
                grønEjerAfgift = grønEjerAfgift + partikelUdledningsAfgift;
            }
            return grønEjerAfgift;
        } else {
            System.out.println("Ugyldigt tal");
        }
        return 0;
    }
}
