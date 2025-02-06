import java.util.Arrays;

public class FindNumberInTwoDArray {

    public static void main(String[] args){

        int arr[][] = {
                {32,56,87},
                {43,90,75,64},
                {12,51,70,19,38}
        };
        int target = 909;
        System.out.println(Arrays.toString(numberIn2DArray(arr, target)));
    }
    public static int[] numberIn2DArray(int arr[][], int targetElement){

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){

                int currentElement = arr[i][j];

                if(arr[i][j] == targetElement){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
