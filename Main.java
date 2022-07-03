import java.util.Scanner;

public class Main {
    //create variables
    public static void main(String[] args) {
        int studentAge = 37;
        double studentGPA = 2.9;
        boolean hasPerfectAttendance = true;

        String studentFirstName = "Koki";
        String studentLastName = "Goudy";
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);

        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(hasPerfectAttendance);

        //concatenate variables
        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA);
        System.out.println("What would you like to update it to? ");

        //use Scanner to input new variable data
        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();

        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA);


    }
}
