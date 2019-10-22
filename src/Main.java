import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);



        System.out.println("Enter a number");
        int integer = key.nextInt();
        int doubledInt = integer*2;
        int result = (doubledInt + 5 - 7);

        System.out.println("After doubling your number, adding 5 and subtracted 7, it becomes " + result);

    };


}
