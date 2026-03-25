import java.util.LinkedList;
import java.util.LinkedHashSet;

public class TrainConsistManagement {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        LinkedHashSet<String> train = new LinkedHashSet<>();

        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");
        train.add("Sleeper");

        System.out.println("Final Train Formation: " + train);
    }
}