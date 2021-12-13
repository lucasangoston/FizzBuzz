import java.util.Scanner;

public class FizzBuzz {
    private int fizzNumber;
    private int buzzNumber;
    private int range;

    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("first divisor : ");
        System.out.println("second divisor : ");
        System.out.println("range : ");
        getFizzBuzz(3,5,100);
    }

    static public void getFizzBuzz(int fizzNumber, int buzzNumber,int range){
        if(fizzNumber >= 0 || buzzNumber >= 0){
            if(fizzNumber != buzzNumber){
                if(fizzNumber != 1 || buzzNumber != 1){
                    if(range >= 1 || range <= 100){
                        for(int i = 0; i<range;i++) {
                            if (i % fizzNumber == 0 && i % buzzNumber == 0) System.out.println(" FizzBuzz ");
                            else if (i % fizzNumber == 0 && i % buzzNumber != 0) System.out.println(" Fizz ");
                            else if (i % buzzNumber == 0) System.out.println(" Buzz ");
                            else System.out.println(" " + i + " ");
                        }
                    }
                    else throw new IllegalArgumentException("Range must be between 1 and 100");
                }
                else throw new IllegalArgumentException("Divisor cannot be 1");
            }
            else throw new IllegalArgumentException("Divisors must be distinct");
        }
        else throw new IllegalArgumentException("Divisor cannot be negative");
    }
}
