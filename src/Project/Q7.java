package Project;
//Write a Java Program to print the first 10 numbers of Fibonacci series.
public class Q7 {
    public static void main(String[] args) {

        int n= 10;
        int first = 0;
        int second = 1;


        System.out.println("The following is the Fibonacci Series : ");

        for (int i = 0; i < n; i++) {
            System.out.print(first +" ");

            int next = first + second;
            first =second;
            second= next;

        }


    }
}
