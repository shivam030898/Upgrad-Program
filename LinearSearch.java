public class LinearSearch {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int x=10;
        System.out.println("The Number Found at "+linearSearch(arr,x));
        System.out.println("The Number Found at "+binarySearch(arr,x));

    }
    public static int binarySearch(int[] arr,int x){
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]<x){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return -1;
    }
    public static int linearSearch(int[] arr,int x){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}
