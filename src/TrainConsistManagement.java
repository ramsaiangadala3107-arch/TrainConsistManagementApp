import java.util.ArrayList;

public class TrainConsistManagement {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        ArrayList<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Passenger Bogies after addition: " + passengerBogies);

        passengerBogies.remove("AC Chair");

        System.out.println("After removing AC Chair: " + passengerBogies);

        System.out.println("Is Sleeper present? " + passengerBogies.contains("Sleeper"));

        System.out.println("Final Bogie List: " + passengerBogies);
    }
}