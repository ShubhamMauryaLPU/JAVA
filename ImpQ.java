import java.util.Scanner;
public class ImpQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Address 1:");
        String address1 = scanner.nextLine().trim().toLowerCase();

        System.out.println("Address 2:");
        String address2 = scanner.nextLine().trim().toLowerCase();

        if (address1.equals(address2)) {
            System.out.println("RED");
        } else if (address1.replaceAll("\\s+", "").equals(address2.replaceAll("\\s+", ""))) {
            System.out.println("YELLOW");
        } else if (address1.equalsIgnoreCase(address2)) {
            System.out.println("BLUE");
        } else {
            System.out.println("GREEN");
        }
    }


}
