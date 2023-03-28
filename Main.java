import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a degree in Fahrenheit:");
        Double input = sc.nextDouble();
        Double result = (( 5 *(input - 32.0)) / 9.0);
        System.out.println(input+" degree Fahrenheit is equal to "+result+" in Celsius ");

    }
}

