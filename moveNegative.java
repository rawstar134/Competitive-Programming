public class moveNegative {
    int a[] ={-12, 11, -13, -5, 6, -7, 5, -3, -6};
    int moveNegativeNumber(){
        
        int low =0;
        int high = a.length-1;
        // int i=0;
        while(low<=high){
            if(a[low] < 0 && a[high] < 0){
                low++;
            }
            else if(a[low] > 0){
                int temp = a[low];
                a[low] = a[high];
                a[high] = temp;
                low++;
                high--;
            }
            else{
                low++;
            }
        }        
        
        return 0;
    }
    public static void main(String[] args) {
        moveNegative getArray = new moveNegative();
        printArray printarray = new printArray();
        getArray.moveNegativeNumber();
        printarray.PrintArray(getArray.a);
    }
}
