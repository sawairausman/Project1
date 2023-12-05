package Project;
//Write a java program to find the second largest number in the array?
public class Q9 {
    public static void main(String[] args) {
        int[] number = {16, 29, 21, 33, 40, 12};
        int max =0;
        int secondMax =0;

        for (int num : number) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax) {
                secondMax = num;

            }
        }

        System.out.println("The second largest number in the given array is " + secondMax);

    }
    }
