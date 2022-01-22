public class CyclicRotateByOne {
    
    int elements[] ={1,2,3,4,5};
    public static void main(String[] args) {
        
        CyclicRotateByOne getArray = new CyclicRotateByOne();
        printArray getPrint = new printArray();
        int arr[] =getArray.elements;
        System.out.println("Befor rotating Array:");
        int start = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            int temp = arr[i+1];
            arr[i+1] = start;
            start = temp;
        }
        arr[0]= start;
        // System.out.println(start);
        // arr[arr.length-1] = start;
        printArray parry = new printArray();
        parry.PrintArray(arr);

    }
}
