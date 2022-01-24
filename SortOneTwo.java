public class SortOneTwo {
    static int a[] ={0,2,1,2,0};
    public static void sortArray(){
        int arr[] = new int[3];
        for(int i=0;i< a.length;i++){
            if(a[i]==1){
                arr[1] = arr[1] + 1;
            }
            else if(a[i]==0){
                arr[0] = arr[0] + 1 ;
            }
            else{
                arr[2] = arr[2] + 1;
            }
        }
        printArray parray = new printArray();
        parray.PrintArray(arr);
        for(int i=0;i<a[0];i++){
           a[i] = 0;   
        }
             for(int i=a[0];i<a[1];i++){
             a[i]= 1;
        }
             for(int i=a[1];i<a[2];i++){
               a[i] = 2;
        }
        
        
    }
    public static void main(String[] args) {
        sortArray();
    }
}
