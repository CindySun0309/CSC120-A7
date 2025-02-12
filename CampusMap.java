import java.util.ArrayList;

/* This class stores information about campus buildings */
public class CampusMap {

    /**
     * Create an empty arraylist to store building information
     */
    ArrayList<Building> buildings;

    /* Default constructor, initializes empty ArrayList */
    public CampusMap() {
        buildings = new ArrayList<Building>();
    }

    /**
     * Adds a Building to the map
     * @param b the Building to add
     */
    public void addBuilding(Building b) {
        System.out.println("Adding building...");
        buildings.add(b);
        System.out.println("-->Successfully added " + b.getName() + " to the map.");
    }

    /**
     * Removes a Building from the map
     * @param b the Building to remove
     * @return the removed Building
     */
    public Building removeBuilding(Building b) {
        System.out.println("Removing building...");
        buildings.remove(b);
        System.out.println("-->Successfully removed " + b.getName() + " to the map.");
        return b;
    }

    /* Print the arraylist into strings */
    public String toString() {
        String mapString = "DIRECTORY of BUILDINGS";

        for (int i = 0; i < this.buildings.size(); i ++) {
            mapString += "\n  " + (i+1) + ". "+ this.buildings.get(i).getName() + " (" + this.buildings.get(i).getAddress() + ")";
        }
        return mapString;
    }

    public static void main(String[] args) {
        CampusMap myMap = new CampusMap();
        myMap.addBuilding(new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Bass Hall", "4 Tyler Court Northampton, MA 01063", 4));
        myMap.addBuilding(new House("Ziskind House", "1 Henshaw Aevnue Northampton, Ma 01063", 4, true, true));
        myMap.addBuilding(new Building("Burton Hall", "46 College Lane Northampton, MA 01063", 5));
        myMap.addBuilding(new Building("Seelye Hall", "2 Seelye Drive Northampton, MA 01063", 5));
        myMap.addBuilding(new Cafe("Campus Center Cafe", "100 Elm Street Northampton, MA 01063", 3, false, 100, 100, 100, 100));
        myMap.addBuilding(new Library("Neilson Library", "7 Neilson Drive Northampton, MA 01063", 5, true));
        myMap.addBuilding(new Building("Alumnae Gymnasium", "83 Green Street Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("McConnell Hall", "2 Tyler Court Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Botanic Garden", "16 College Lane Northampton, MA 01063", 4));
        System.out.println(myMap);
    }
    
}
