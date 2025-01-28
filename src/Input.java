import java.util.Scanner;

public class Input{
    public static void main(String[] args){
        //open scanner
        Scanner scanner = new Scanner(System.in);

        //declare variables
        String name;
        int age;
        float weight;
        boolean smoker;

        //prompt user for input
        System.out.println("Name?");
        name = scanner.nextLine();
        System.out.println("Age? (in years)");
        age = scanner.nextInt();
        System.out.println("Weight? (in decimals)");
        weight = scanner.nextFloat();
        System.out.println("Smoker? (Enter true or false)");
        smoker = scanner.nextBoolean();
        //close scanner
        scanner.close();
        //output user input
        System.out.println("User info:" + "\nName: " + name + "\nAge: " + age + "\nWeight: " + weight + "\nSmoker?: " + smoker);
    }
}
