package javac1;


import java.util.Scanner;

class task1 {  
    
    public static void main(String[] args) {  
    	Scanner sc=new Scanner(System.in);  
        //Initialize array   
       
        
        
    	int n;  
    	
    	System.out.print("Enter the number of elements you want to store: ");  

    	n=sc.nextInt();  
    	 
    	 
    	int[] arr = new int[n];  
    	System.out.println("Enter the elements of the array: ");  
    	for(int i=0; i<n; i++){  
    	arr[ i ]=sc.nextInt();  
    	}  
    	System.out.println("Array elements are: ");  
    	for (int i=0; i<n; i++){  
    	System.out.println( arr [i] );  
    	}  
        
        
     
        
        
        
        System.out.println("Enter the position:");
        int p =sc.nextInt();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        for (int i = 0; i < arr.length; i++) {   
            System.out.print(arr[i] + " ");   
        }    
          
        //Rotate the given array by p times toward left  
        for(int i = 0; i<p; i++){  
            int j, first;  
            //Stores the first element of the array  
            first = arr[0];  
          
            for(j = 0; j < arr.length-1; j++){  
                //Shift element of array by one  
                arr[j] = arr[j+1];  
            }  
            //First element of array will be added to the end  
            arr[j] = first;  
        }  
          
        System.out.println();  
          
        //Displays resulting array after rotation  
        System.out.println("Array after left rotation: ");  
        for(int i = 0; i< arr.length; i++){  
            System.out.print(arr[i] + " ");  
        }  
    }  
}  

