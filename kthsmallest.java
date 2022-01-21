public class kthsmallest {
    int QuickFindIndex(int a[],int high, int low){
        int pivot = a[high];
        int pivotLoc = low;

        for (int i = low; i <high; i++) {
            if(a[i] < pivot){
                int temp = a[i];
                a[i] = a[pivotLoc];
                a[pivotLoc] = temp;
                pivotLoc++;
            }

        }
        int temp = a[high];
        a[high] = a[pivotLoc];
        a[pivotLoc] = temp;

        return pivotLoc;
    
    }
    int findKthsmallest(int a[],int low ,int high, int findIndex){

        int pivotIndex = QuickFindIndex(a, high, low);

        if (pivotIndex == findIndex-1){
            return a[findIndex-1];
        }
        if(pivotIndex < findIndex-1){
            return findKthsmallest(a, pivotIndex+1, high, findIndex);
        }
        else{
            return findKthsmallest(a,low, pivotIndex-1, findIndex);
        }
    }   
    
    public static void main(String[] args) {
        //find the kth smallest element using the quick select algorithms;
        int a[] ={7,10,4,3,20,15};
        kthsmallest getValue = new kthsmallest();
        int resultantValue= getValue.findKthsmallest(a, 0, a.length-1, 3);
        System.out.println(resultantValue);
        
    }
}
