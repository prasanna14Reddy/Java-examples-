class HillStations {
    void location() {
        System.out.println("Location of hill station");
    }

    void famousFor() {
        System.out.println("Famous for something");
    }
}
class Manali extends HillStations {
    void location() {
        System.out.println("Manali is located in Himachal Pradesh");
    }
    void famousFor() {
        System.out.println("Manali is famous for its scenic beauty and adventure sports");
    }
}
class Mussoorie extends HillStations {
    void location() {
        System.out.println("Mussoorie is located in Uttarakhand");
    }
    void famousFor() {
        System.out.println("Mussoorie is famous for its lush green hills and pleasant weather");
    }
}
class Gulmarg extends HillStations {
    void location() {
        System.out.println("Gulmarg is located in Jammu and Kashmir");
    }
    void famousFor() {
        System.out.println("Gulmarg is famous for its skiing and winter sports");
    }
}
public class Main {
    public static void main(String[] args) {
        HillStations hillStation;

        hillStation = new Manali();
        hillStation.location();
        hillStation.famousFor();

        hillStation = new Mussoorie();
        hillStation.location();
        hillStation.famousFor();

        hillStation = new Gulmarg();
        hillStation.location();
        hillStation.famousFor();
    }
}
