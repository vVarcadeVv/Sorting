import java.util.Arrays;
public class NewSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int arr[] = {70, 23, 25, 12, 1, 34, 90}; 
	       
	        bubbleSort(arr, arr.length); 
	          
	        System.out.println("Sorted array : "); 
	        System.out.println(Arrays.toString(arr));
	}
	 static void bubbleSort(int arr[], int n) 
	    { 
	        // Base case 
	        if (n == 1) 
	            return; 
	       

	        for (int i=0; i<n-1; i++) 
	            if (arr[i] > arr[i+1]) 
	            { 
	                
	                int temp = arr[i]; 
	                arr[i] = arr[i+1]; 
	                arr[i+1] = temp; 
	            } 
	     
	        bubbleSort(arr, n-1); 
	    } 

}
