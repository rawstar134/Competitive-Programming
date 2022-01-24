public class subArrayMaximum {
    int arr[] ={-1,-2,-3,-4};
    int size = arr.length;
    int min =arr[0];
    void findMaxFromSubArray(){
        
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if(min<sum){
                min=sum;
            }
            if(sum <0){
                sum=0;
            }
        }
        
    }
    public static void main(String[] args) {
        //find the sum of sub array;
        subArrayMaximum getMaxSum  = new subArrayMaximum();
        getMaxSum.findMaxFromSubArray();
        System.out.println(getMaxSum.min);

    }
}
