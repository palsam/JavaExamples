import com.palani.examples.factoryPattern.Building;
import com.palani.examples.factoryPattern.BuildingFactory;

public class PalaniMain {
    public static void main(String args[]) {
        String location = "Home";
        BuildingFactory buildFactory = new BuildingFactory();
        // factory instantiates an object
        Building building = buildFactory.getMyLocation(location);
    }
}
