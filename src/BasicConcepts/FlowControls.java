package BasicConcepts;

public class FlowControls {

	public static void main(String[] args) {

		int x = 2;
		int y = 14;

		if (x + y > 10) {
			System.out.println("x+y is greater then 10");
		}else {
			System.out.println("x+y is lesser then 10");
		}if (x + y > 10) {
			System.out.println("x+y is greater then 10");
		}
		
		
		
		String today = "Sunday";
		
		if(today=="Friday") {
			System.out.println("Today is Friday");
		}else if(today =="Sunday") {
			System.out.println("Today is Sunday");
		}else if(today=="Saturday") {
			System.out.println("Today is Saturday");
		}
		
		
		
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
		

	}

}
