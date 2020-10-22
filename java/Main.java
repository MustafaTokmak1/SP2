public class Main {
    public static void main(String [] args){
        DieselBil minBil = new DieselBil("AC 31 031", "BMW", 2014, 5, true,  18);
        BenzinBil farsBil = new BenzinBil("BJ 69 069", "Audi", 2011, 5, 95,8);
        ElBil morsBil = new ElBil("BD 01 101", "BMW", 2017, 3, 39,312,229);

        Garage garage1 = new Garage();
        garage1.addBil(minBil);
        garage1.addBil(farsBil);
        garage1.addBil(morsBil);
        //System.out.println(garage1);
        garage1.format();
        System.out.println("Grøn ejerafgift for garagen er " + garage1.beregnGrønEjerAfgiftForParkZone() + " kr.");

    }
}
