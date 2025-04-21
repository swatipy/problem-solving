public class BinarySearch {

    public static void main(String[] args){

        int[] arr = {1,3,4,6,7,12};
        int n=findNumber(arr,12 );
        System.out.println("Index of 12 in array is "+ n);
    }

    public static int findNumber(int[] arr,int target) {
        int start = 0;
        int end = arr.length-1;


        while(start<=end) {
            int mid = (start + end) / 2;

            if(target < arr[mid])
                end = mid-1;
            else if(target > arr[mid])
                start = mid+1;
            else
                return mid;

        }

        return -1;
    }
}
