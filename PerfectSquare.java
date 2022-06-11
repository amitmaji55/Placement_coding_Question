import java.util.Scanner;

public class PerfectSquare {
    public static boolean isPerfectSquare(int num){
        for(int i=1; i*i<=num; i++) {
            if((num%i == 0) && (num/i==i))
                return true;
        }

        return false;
    }

    // main method
    public static void main(String[] args) {

        // declare variables
        int number = 0;
        boolean result = false;

        // create Scanner class object to
        // read input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number::");
        number = scan.nextInt();

        // check number
        result = isPerfectSquare(number);

        // display result
        if(result)
            System.out.println("Perfect Square");
        else
            System.out.println("Not a Perfect Square");

        // close Scanner class object
        scan.close();
    }
}