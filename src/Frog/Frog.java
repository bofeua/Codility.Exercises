package Frog;

public class Frog {
    public static int solution(int x, int y, int d) {
        if ((y - x) % d == 0) {
        	System.out.println("division exacta");
           return (y - x) / d;
       }
       else{
    	   return (y - x) / d + 1;}
   }
    
    
    public static void main(String[] args){
    	
    	long startTime = System.nanoTime();
    	System.out.println(solution(57,4500,505));
    	long endTime = System.nanoTime();
    	long duration = (endTime - startTime); 
    	System.out.println(duration);
    }
}
