package Dec8;

public class findFirstOccurance {
    
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 2, 3, 4, 2};
        System.out.println(f1stOcc(arr, 0, 3));
        System.out.println(lastOcc(arr, 0, 3));
    }

    public static int f1stOcc(int[] arr, int idx, int ele) {
        
        if (idx > arr.length - 1) {
            return -1;
        }

        if (arr[idx] == ele) {
            return idx;
        }

        return f1stOcc(arr, idx + 1, ele);
    }

    public static int lastOcc(int[] arr, int idx, int ele) {
        
        if (idx == arr.length) {
            return -1;
        }

        int li = lastOcc(arr, idx + 1, ele);

        if (li == -1) {
            // compare current element with the given element
            if (arr[idx] == ele) {
                return idx;
            } else {
                return -1;
            }
        } else {
            return li;
        }

    }

}
