
public class First {

	
	 public static void main(String[] args) {
	        int a=12;
	        int b=555;
	        int c=5555;
	        if(a>b&&a>c) {
	            System.out.println("a is biggest number");
	        }
	       else if(b>a&&b>c){
	           System.out.println("b is biggest number");
	        }
	        else if(c>a&&c>b){
	            System.out.println("c is biggest number");
	        }
	        else if((int)a==c && (int)a==b ){
	            System.out.println("All are same");
	        }
	        else if ((int) a == b)
	        {
	            System.out.println(" a and b is same");
	        } else if ((int)a==c)
	        {
	            System.out.println("a and c is same");
	        }
	        else if((int)b==c)
	        {
	            System.out.println("b and c is same");
	        }
	    }
	}



