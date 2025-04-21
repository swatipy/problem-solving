package leetcode;

public class FindCommon {

    public static void main(String[] arg) {
        int[] nums1={1,2,4,6};
        int[] nums2={2,8};

        int n=0;

        for(int i=0; i<nums1.length; i++) {

            n = findNum(nums1[i],nums2);
            System.out.println(n);
            if(n!= -1) {
                System.out.println(n);
                break;
            }


        }

        //n=findNum(1,nums2);
        System.out.println(n);
    }

    public static int findNum(int target, int[] arr){
        int start=0;
        int end = arr.length-1;

        while(start<=end){

            int mid = (start + end)/2;

            if(target < arr[mid]) {
                end = mid-1;
            }
            else if (target > arr[mid]) {
                start = mid+1;
            }
            else
                return mid;

        }
        return -1;
    }
}
