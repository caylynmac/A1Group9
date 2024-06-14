package shapeSortManager;

public final class sortUtility {
	public static Integer[] bubbleSort(Integer[] args)
	{
		return args;
	
	}
	
	/**
	 * this method sorts an array by insertion sort
	 * @param args input array
	 * @return sorted array
	 */
	public static Integer[] insertionSort(Integer[] args)
	{
		int n = args.length;
		for (int i = 1; i <= (n-1); i++) { //starts at second element to look through unsorted portion
			int element = args[i];
			int j = i; //for sorted portion
			
			//this loop checks each i element in the sorted portion left to right against the unsorted portion j
			while (j > 0 && args[j - 1] > element) {
				args[j] = args[j - 1]; //move sorted element to the right
				j = j -1; //move j left
			}
			args[j] = element; //insert element i into sorted portion when a larger element in the sorted portion is found and the while loop is exited
		}
		
		return args;
	}
	
	/**
	 * sorts an array by looking for the minimum element 
	 * and swapping it with a larger element until everything is in order
	 * @param args
	 * @return
	 */
	public static Integer[] selectionSort(Integer[] args)
	{
		int n = args.length;
		for(int i = 1; i <= (n - 1); i++)
		{
			int minIndex = i; //start at first element
			
			for (int j = (i +1); j < (n - 1); j++) //iterate through unsorted portion to find a new minimum
			{
				if (args[j] < args[minIndex]) {
					minIndex = j;
				}
			}
			
			//swap element i with j if not the same
			if (minIndex != i)
			{
				int temp = args[i]; //put original i element in a temp variable
				args[i] = args[minIndex]; //put the minimum element in the i index
				args[minIndex] = temp; //put original i element into the other spot
			}			
		}
		return args;
	}
	
	/**
	 * uses recursion to divide array into subarrays of 2, sorting them, 
	 * and then sorting the larger subarrays until the whole array is sorted and merged.
	 * @param args
	 * @return
	 */
	public static void mergeSort(Integer[] args)
	{
		int length = args.length;
		//divide array into 2 subarrays if it's larger than 1 element
		if (length <= 1) {return;} //base case
		
			//find middle index. 
			//int floors it if needed
			int midIndex = length / 2;
			
			//make empty array of length up to middle index and copy args into it
			Integer[] firstHalf = new Integer[midIndex];
	        for (int i = 0; i < midIndex; i++)
	            {firstHalf[i] = args[i];}	            
			
			//make empty array of length args - first half length (middle index + 1)
			Integer[] secondHalf = new Integer[length - midIndex];
	        for (int j = 0; j < (secondHalf.length); j++)
	            {secondHalf[j] = args[j + midIndex];}
	            	        
	        //divide subarrays further with recursion
	        //sorting will then occur on next section of code back up from the smallest to largest arrays
	        mergeSort(firstHalf);
	        mergeSort(secondHalf);
	        
	        //start swapping values 
	        //here we iterate through each subarray at the same time and check if each element is
	        //less or greater than an element in the second subarray
	        //the smaller element is put into the next index in the merged array and the 
	        //index of that subarry is increased to then check the next element
	        
	        int k = 0; //index for merged array
	        int l = 0; //first half
	        int r = 0; //second half
	        while (l < firstHalf.length && r < secondHalf.length)
	        {
	        	
	        	if (firstHalf[l] < secondHalf[r])
	        	{
	        		args[k] = firstHalf[l];
	        		l++;
	        		k++;
	        		System.out.println(args[k]);
	        	}
	        	else
	        	{
	        		args[k] = secondHalf[r];
	        		r++;
	        		k++;
	        	}
	        }
	        
	        //these put the largest element left that may not have been sorted once r or l get out of bounds
	    	while(l < firstHalf.length) 
	    	{
				args[k] = firstHalf[l];
				k++;
				l++;
			}

			while(r < secondHalf.length) 
			{
				args[k] = secondHalf[r];
				k++;
				r++;
			}
		
		return;
	}
	
	/**
	 * set a "pivot" to the last element, find it's position in the code by sorting elements less than it
	 * then recursively partition the subarrays around the pivot and pivot them
	 * @param args
	 * @return
	 */
	public static void quickSort(Integer[] args, int start, int end)
	{
		if (end <= start) {return;} //base case
		
		int pivot = args[end];
		int pivotIndex = args[end];
		
		int i = start - 1; //index to log the last location of the numbers that get sorted, so the pivot can be moved there at the end
	    //int j = start; //to iterate through the whole array and check if each element is less than the pivot
	    
	    for (int j = start; j <= end; j++)
	    {
	    	if (args[j] < pivot) //then swap j to i 
	    	{
	    		i++;
	    		int temp = args[i];
	    		args[i] = args[j];
	    		args[j] = temp;
	    	}
	    }
	    	
	    	//after the loop ends, the pivot is moved to the space after the i index
	    	i++;
	    	pivotIndex = i; 
	    	int temp = args[pivotIndex];
	    	args[pivotIndex] = pivot;
	    	args[end] = temp;

	    

	    //call quick sort now on each other side

		quickSort(args, start, pivotIndex - 1); 

		quickSort(args, pivotIndex + 1, end);		
		return;
	}
}
