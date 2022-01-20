public class reverseArray{

    public static void  getReverseArray(int arr[]){

        int start =0;
        int end= arr.length-1;

        while(start!=end && start<end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end]= temp;

            start++;
            end--;
        }
    }
    public static void printArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        //first method to reverse array by creating new array(simple one)
        //second methof to reverse array using the same array 
        
        int array[] ={1,2,3,4,5};
        getReverseArray(array);
        printArray(array);
        
    }
}