package backjoon_1920;
import java.util.Scanner;

public class backjoon_1920 {
	
	public static void merge(int[] arr, int left, int middle, int right) {
		int n1 = middle - left +1;
		int n2 = right - middle;
		
		int[] leftArr = new int[n1];
		int[] rightArr = new int[n2];
		
		System.arraycopy(arr,left, leftArr, 0, n1);
		System.arraycopy(arr, middle+1, rightArr, 0, n2);
		
		int i =0, j =0, k=left;
		
		while(i < n1 && j <n2) {
			if(leftArr[i] <= rightArr[j]) {
				arr[k] = leftArr[i++];
			} else {
				arr[k] = rightArr[j++];
			}
			k++;
		}
		
		while(i <n1) {
			
			arr[k++] = leftArr[i++];
		}
		
		while(j <n2) {
			arr[k++] = rightArr[j++];
		}
	}
	
	public static int binarySearch(int arr[], int key, int low, int high)
	{
		int mid;
		while(low <= high) {
			mid = (low + high)/2;
			if(key == arr[mid]) {
				return mid;
			} 
			else if(key < arr[mid]) {
				return binarySearch(arr, key, low, mid-1);
			}
			else
			{
				return binarySearch(arr, key, mid+1, high);
			}
		}
		return -1;
	}
	
	public static void mergeSort(int[] arr, int left, int right) {
		if(left < right) {
			int middle  = (left + right) / 2;
			mergeSort(arr, left, middle);
			mergeSort(arr, middle+1, right);
			merge(arr, left, middle , right);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n  = in.nextInt();
		int arr1[] = new int[n];
		for(int i =0; i<n; i++)
		{
			arr1[i] = in.nextInt();
		}
		
		mergeSort(arr1, 0, arr1.length-1);
		
		
		int num = in.nextInt();
		int arr2[]  = new int[num];
		for(int i =0; i<num; i++)
		{
			arr2[i] = in.nextInt();
		}
		for(int i = 0; i < arr2.length; i++) {
		    int result = binarySearch(arr1, arr2[i], 0, arr1.length - 1);
		    if(result != -1) {
		        System.out.println(1);
		    } else {
		        System.out.println(0);
		    }
		}

		
		
	}

}
