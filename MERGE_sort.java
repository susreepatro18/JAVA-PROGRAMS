public class MERGE_sort {
    public static void conquer(int[] arr, int si, int mid, int ei) {
        int n1 = mid - si + 1;  // Size of left subarray
        int n2 = ei - mid;      // Size of right subarray

        // Temporary arrays to hold the left and right subarrays
        int[] left = new int[n1];
        int[] right = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            left[i] = arr[si + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
        }

        // Merge the temporary arrays back into arr[si...ei]
        int i = 0, j = 0;  // Initial indices for left and right subarrays
        int k = si;        // Initial index for merged subarray in arr

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of left[] if any
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copy remaining elements of right[] if any
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void divide(int[] arr, int si, int ei) {
        if (si < ei) {
            int mid = si + (ei - si) / 2;
            divide(arr, si, mid);
            divide(arr, mid + 1, ei);
            conquer(arr, si, mid, ei);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int n = arr.length;

        System.out.println("Original Array:");
        printArray(arr);

        divide(arr, 0, n - 1);

        System.out.println("Sorted Array:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

// public class MERGE_sort {
//     public static void conquer(int arr[],int si,int mid,int ei)
//     {
//         int merged[]=new int[ei-si+1];
//         int idx1=si;
//         int idx2=mid+1;
//         int x=0;
//         while(idx1<=mid && idx2<=ei)
//         {
//             if(arr[idx1]<=arr[idx2])
//             {
//                 merged[x]=arr[idx1];
//                 x++;
//                 idx1++;

//             }
//             else
//             {
//                 merged[x]=arr[idx2];
//                 x++;
//                 idx2++;

//             }
//         while(idx1<=mid)
//             {
//                 merged[x++]=arr[idx1++];
//             }
//         while(idx2<=ei)
//             {
//                 merged[x++]=arr[idx2++];
//             }

//         for(int i=0, j=si;i<merged.length;i++,j++)
//             {
//                 arr[j]=merged[i];
//             }
//         }

//     }
//     public static void divide(int arr[],int si,int ei)
//     {
//         if(si>=ei)
//         {
//             return;
//         }
//         int mid=si+(ei-si)/2; //si+ei/2
//         divide(arr,si,mid);
//         divide(arr,mid+1,ei);
//         conquer(arr,si,mid,ei);
//     }
//     public static void main(String args[])
//     {
//         int arr[]={5,4,3,2,1};
//         int n=arr.length;
//         divide(arr,0,n-1);
//         System.out.println("sorted array");
//         for(int i=0;i<n;i++)
//         {
//             System.err.print(arr[i]+" ");
//         }
//         System.out.println();

//     }
    
// }
