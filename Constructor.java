public class Constructor {
	
	Constructor(){
		System.out.println("No argument constructor");
	}
	
	class ParaConst{
		 ParaConst(int a){
			System.out.println("parametarized constructor");
		}
	}

	public static void main(String[] args) {
//		User define constrctor
		Constructor c1=new Constructor();
		ParaConst p1=c1.new ParaConst(10);
	}

}


