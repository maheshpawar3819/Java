
public class Test2 {
	static class Cars{
		void wheels() {
			System.out.println("There are 4 Wheels in the class");
		}
		
		void seets() {
			System.out.println("The model is 4 sitter");
		}
		
		void engine () {
			System.out.println("1.5 lr Engine");
		}
	}
	
	static class Curv extends Cars{
		void type() {
			System.out.println("Petrol Vehicle");
		}
	}
	
	  static class Nexon extends Cars {
     	 void type () {
     		 System.out.println("Electric Vehicle");
     	 }
      }
	
    public static void main(String[] args) {
    	
         Curv c1=new Curv();
         c1.wheels();
         c1.engine();
         c1.seets();
         c1.type();
         
       
         
         Nexon n1=new Nexon();
         n1.wheels();
         n1.seets();
         n1.type();
    }
    
    
   
}








