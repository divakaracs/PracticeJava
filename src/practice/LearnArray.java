package practice;
public class LearnArray {

    public static void main(String[] args) {

        int ncnt[]= {1,2,7,3,4,5,6,7,8,9};
        
        //I need find length of this array
    int nlen;
        nlen=ncnt.length;
        System.out.println("Length of the array ncnt is: "+ nlen); 
        
        //I need to find sum of all elements
        int nsum=0;
       // nsum=0;
        //System.out.println("i  "+"ncnt[i]  "+"nsum+   ");
       System.out.println("i  ncnt[i]  nsum   ");
        for (int i=0; i<ncnt.length ;i++)
        {
            nsum=nsum+ncnt[i];
            System.out.println(i+"    "+ncnt[i]+"     "+nsum+"  ");
        }     
        System.out.println("Sum of all element in array is : "+ nsum);
        
        //I need to find location of 7
        
        int nLoc = 0 ;
        System.out.println("i  "+"ncnt[i]  "+"nLoc+   ");
        for (int i=0; i<ncnt.length ;i++)
        {
            if (ncnt[i]==2) 
                nLoc=i;    
            
            System.out.println(i+"    "+ncnt[i]+"     "+nLoc+"  ");
         
        }
        System.out.println("Location of number 2 in array ncnt is:"+nLoc);
        
        }
    }    