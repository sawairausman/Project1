package Project;
/*Create a 2D array or integer type where you will store odd and even
 numbers. Develop a program which will identify/print the even
 numbers only*/
public class Q3 {
    public static void main(String[] args) {
        int [][] arr ={{2,4,6,8,10},
                       {6,5,2,3,5,8}
                       };
        for(int i =0; i<arr.length;i++){
            for(int j =0; j< arr[i].length;j++){
                if(arr[i][j] % 2==0){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}
