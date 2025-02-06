public class FindNumberInOneDArray {
    public static void main(String[] args){
        int arr[] = {4, 56, 75,879,12, 78, 90};
        int target = 879;
        findNumber(arr, target);
        System.out.println(findNumber(arr, target));
    }
    public static int findNumber(int arr[], int targetElement){
        for(int i = 0 ; i< arr.length; i++){
            int currentElement = arr[i];
            if(currentElement == targetElement){
                return i;
            }
        }
        return -1;
    }
}
