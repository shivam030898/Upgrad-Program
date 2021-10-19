public class Search {
    public static void main(String[] args){
        int arr[]={9, 4, 9, 6, 7, 4};
        int n=arr.length;
        System.out.println("The Non Repeated Number is at Index: "+search(arr,n));
    }
    public static int search(int arr[],int n){
        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < n; j++)
                if (i != j && arr[i] == arr[j])
                    break;
            if (j == n)
                return arr[i];
        }
  
        return -1;
}
}
