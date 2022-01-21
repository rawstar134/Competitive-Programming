public class printArray {
    
    public void PrintArray(int a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public void PrintArray(int a[],int start,int end){
        for (int i = start; i < end; i++) {
            System.out.println(a[i]);
        }
    }
}
