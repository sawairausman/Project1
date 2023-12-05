package Project;
//Write a program to swap 2 numbers without a temporary variable?
public class Q5 {

    public static void main(String[] args) {
        int a = 20, b = 30;
        System.out.println("num 1 : "+a);
        System.out.println("num 2 : "+b);

        a =a+b;
        b= a-b;
        a =a-b;

        System.out.println("num 1 : "+a);
        System.out.println("num 2 : "+b);
    }
}
