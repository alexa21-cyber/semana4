package ejemplo4;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("Ingrese el numero del dado 1");
        int dad1=scan.nextInt();
        System.out.println("Ingrese el numero del dado 2");
        int dad2=scan.nextInt();
        System.out.println("Ingrese el numero del dado 3");
        int dad3=scan.nextInt();
       if(dad1==6 & dad2==6 & dad3==6) 
        	System.out.println("excelente");else {
        		 if(dad1==6 & dad2==6 || dad3==6 & dad2==6 || dad1==6 &dad3==6) 
        	        	System.out.println("muy bien");else {
        	        		
        	        	} if(dad1==6 &dad2!=6&dad3!=6 || dad2==6&dad1!=6&dad3!=6 || dad3==6&dad1!=6&dad2!=6) 
        	            	System.out.println("regular");else {
        	            		if(dad1!=6 & dad2!=6 & dad3!=6)
        	            		System.out.println("pesimo");
        	            		
        	            	}
        	}
        	
        
        
	}

}
