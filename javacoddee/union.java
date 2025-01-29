import java.util.Arrays;

public class union {
    public static int[] unionOfTwoArray(int[]arr1,int[]arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] union = new int[n1+n2];
        int index = 0;
        for(int i=0;i<n1;i++){
            union[index++]=arr1[i];
        }
        for(int i=0;i<n2;i++){
            Boolean isDuplicate = false;
            for(int j=0;j<index;j++){
                if(arr2[j]==union[j]){
                    isDuplicate =true;
                    break;
                }

            }
            if(!isDuplicate){
                union[index++] = arr2[i];
            }
        }
        return Arrays.copyOf(union,index);
    }
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {3, 4, 5, 6, 7};

        // Find the union of arr1 and arr2
        int[] result = unionOfTwoArray(arr1, arr2);

        // Print the union of the two arrays
        System.out.println("Union of two arrays: " + Arrays.toString(result));
    }
}
