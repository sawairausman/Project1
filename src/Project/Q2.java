package Project;

/*Create an array of integer values. After the array is created, calculate
       the sum of all stored elements in that array.*/

public class Q2 {
    public static void main(String[] args) {
        int [] numbers={97,5,7,10,16,18};

        int sum=0;
        for (int i = 0; i < numbers.length ; i++) {
            sum=numbers[i]+sum;
        }
        System.out.println("The total sum is : " +sum);
    }
    }

