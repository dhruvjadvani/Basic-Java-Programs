import java.util.Scanner;
import java.util.*;
public class FourDiv {
	
	public static int ans(int[] arr){
        int[] comp = new int[1];
        boolean flag = true;
        
        for(int i = 0; i < arr.length; i++){ 
             
            if(arr[i] % 4 == 0 ) {
            	if(flag == true) {
            		comp[0] = arr[i];
            		flag = false;
            	}
                
               // System.out.println(comp[0]);
                if(comp[0] < arr[i]){
                    comp[0] = arr[i];
                    
                }           
            }
            
        }  
        
        return comp[0];
    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();  // 8
        
        int[] input = new int[n];
        
        for(int i = 0; i < n; i++){// 1 2 3 4 5 6 7 8
            int m = scanner.nextInt(); // 9 
            input[i] = m; // 
        }    
        
          
        
        System.out.println(ans(input));
	}

}
