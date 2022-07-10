package example01;

public class IncreDreEx {

	public static void main(String[] args) {
		int x = 10, y = 10;
		
		System.out.println("-------------------------");
		System.out.println((x++));
		System.out.println((++y));
		
		System.out.println(x);
		System.out.println(y);
		
		
		System.out.println("(x++) + (++y) = " + (x++) + (++y));   // 1112
		
		System.out.println("((x++) + (++y)) = " + ((x++) + (++y)));   // 25
	}

}
