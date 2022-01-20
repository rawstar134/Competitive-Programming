public class maximumAndMinumum {
    int min;
    int max;

    public maximumAndMinumum findMinMax(int a[]) {
        return getMinMax(a, 0, a.length - 1);

    }

    public maximumAndMinumum getMinMax(int a[], int start, int end) {
        maximumAndMinumum minmax = new maximumAndMinumum();
        maximumAndMinumum temmin = new maximumAndMinumum();
        maximumAndMinumum temmax = new maximumAndMinumum();
        int mid;
        // last element point;
        if (start == end) {
            minmax.min = a[start];
            minmax.max = a[end];
            return minmax;
        }
        // two element;
        if (start == (end + 1)) {

            if (a[end + 1] > a[start]) {
                minmax.min = a[start];
                minmax.max = a[end + 1];
                return minmax;
            } else {
                minmax.min = a[end + 1];
                minmax.max = a[start];
                return minmax;
            }
        }

        mid = (start + end) / 2;
        temmin = getMinMax(a, start, mid);
        temmax = getMinMax(a, mid + 1, end);
        // first half;
        if (temmax.min < temmin.min) {
            minmax.min = temmax.min;
        } else {
            minmax.min = temmin.min;
        }
        // second half;
        if (temmax.max > temmin.max) {
            minmax.max = temmax.max;
        } else {
            minmax.max = temmin.max;
        }
        
        // for left hand side
        return minmax;
    }

    public static void main(String[] args) {
        // find the minimum and maximum using recursion
        int arra[] = { 1, 2, 3, 4, 2, 1, 10 };
        maximumAndMinumum getValue = new maximumAndMinumum();
        getValue =getValue.findMinMax(arra);
        System.out.println("Minimum value from the list:"+getValue.min+"maximum value from the list:"+getValue.max);
    }
}
