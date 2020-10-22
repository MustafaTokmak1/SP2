import javax.management.openmbean.ArrayType;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Garage {
    ArrayList<Bil>parkZone = new ArrayList<Bil>();

    public void addBil(Bil bil){
        parkZone.add(bil);
    }

    public double beregnGrønEjerAfgiftForParkZone(){
        double grønEjerAfgiftForParkZone = 0;
        for (int i = 0; i < parkZone.size(); i++) {
            grønEjerAfgiftForParkZone += parkZone.get(i).beregnGroenEjerAfgift();


        }
        return grønEjerAfgiftForParkZone;
    }

    @Override
    public String toString() {
        return "Garage \n "  + parkZone ;
    }

    public void format() {
        System.out.println(parkZone.stream().map(i -> i.toString()).collect(Collectors.joining("")));
    }
}
