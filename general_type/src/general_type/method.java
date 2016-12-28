package general_type;

public class method {
	public static <T extends Comparable> void quicksort(T[] array) {
        quicksort(array, 0, array.length-1);
    }
    
    private static <T extends Comparable> void quicksort(T[] array, int left, int right) {
        if(left < right) { 
            int q = partition(array, left, right); 
            quicksort(array, left, q-1); 
            quicksort(array, q+1, right); 
        } 
    }
    
    private static <T extends Comparable> int partition(T[] array, int left, int right) {  
        int i = left - 1; 
        for(int j = left; j < right; j++) {
            if(array[j].compareTo(array[right]) <= 0) {
                i++; 
                swap(array, i, j); 
            }
        }
        swap(array, i+1, right); 
        return i + 1; 
    }

    private static <T> void swap(T[] array, int i, int j) {
        T t = array[i]; 
        array[i] = array[j]; 
        array[j] = t;
    }
    public static <T extends Comparable> void bubblesort(T[] array){
    	for(int i =0 ; i < (array.length)-1 ; i++){
    		for(int j = 0; j<(array.length)-1-i ; j++){
    			if(array[j].compareTo(array[j+1]) >= 0) {
                    swap(array, j, j+1);
    			}
    		}
    	}
    }
    public static <T extends Comparable> void search(T[] array , T key){
    	for(int i =0 ; i<array.length ; i++){
    		if(array[i].compareTo(key)==0)System.out.println(array[i]);
    	}
    }
    public static <T extends Comparable> void binerysearch(T[] array , T key){
    	int c, first, last, middle;
    	first = 0;
    	last = array.length - 1;
    	middle = (first+last)/2;
    	 while (first <= last) {
    	      if (array[middle].compareTo(key)<0)
    	         first = middle + 1;    
    	      else if (array[middle].compareTo(key)==0) {
    	    	  System.out.println(key+" found at location "+(middle+1));
    	         break;
    	      }
    	      else
    	         last = middle - 1;
    	 
    	      middle = (first + last)/2;
    	   }
    	   if (first > last)System.out.println("Not found!" +key+" is not present in the list.\n");
    }
    public static <T extends Comparable> void printarray(T[] array){
    	for(int i =0; i < array.length ; i++){
    		System.out.println((i+1)+". "+ array[i]);
    	}
    }
}
