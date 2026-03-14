import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner  = new Scanner(System.in);

        Student student = null;
        int choice;

        do {

            System.out.println("1. Create Student");
            System.out.println("2. Display Student");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            choice = input.nextInt();
            input.nextLine();

            switch(choice) {

                case 1:

                    System.out.print("Enter name: ");
                    String name = input.nextLine();

                    System.out.print("Enter ID: ");
                    String id = input.nextLine();

                    System.out.print("Enter course: ");
                    String course = input.nextLine();

                    student = new Student(name, id, course);

                    System.out.println("Student created!");
                    break;

                case 2:

                    if(student != null){
                        student.displayInfo();
                    } else {
                        System.out.println("No student found.");
                    }

                    break;

                case 3:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice.");

            }

        } while(choice != 3);
    }
}
