
public class HelloWorld {
	static int number =0;

	public static void main(String[] args) {
	 
		 for(int a=1;a<1000000000 ;a++){
			 boolean isPrime=true;

			 number++;
		for(int i=2;i<= Math.sqrt(number)&&isPrime==true;i++){
			if(number%i==0){isPrime=false;
			i=number;
			
			}
			
		}
if(isPrime==true){System.out.println(number+" ");}
 
		 }
	}

}
