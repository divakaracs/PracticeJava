package practice;
class GFG { 
  
    // non-static method 
    public int sum(int a, int b) 
    { 
        return a + b; 
    } 
} 

  
class School { 
	
    public static void main(String[] args) 
    { 
        int n = 3, m = 6;
        
        GFG g = new GFG(); 
        
        int s = g.sum(n, m); 
        // call the non-static method 
  
        System.out.print("sum is = " + s); 
    } 
} 