import java.util.Scanner;
public class B3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        System.out.println("enter the amount of waste collected:");
        double wastecollected=sc.nextDouble();

         if (wastecollected >= 100.0) {
            System.out.println("Collection Target Achieved");
        } else {
            System.out.println("More Waste Collection Required");
        }

        sc.close();
    }
}
