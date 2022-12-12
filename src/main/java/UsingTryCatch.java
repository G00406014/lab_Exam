import java.util.Scanner;

public class UsingTryCatch {


    public static void main(String[] args) {
        System.out.println("please enter your age");
        Scanner myscan = new Scanner(System.in);
        double age = myscan.nextDouble();
        if (age >= 18) {
            System.out.println("you enetered " + age);

        } else {
            System.out.println("you hacve to be over 18");
        }

    }
}

