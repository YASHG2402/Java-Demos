
public class Tester {
	
	public static double divide(int num, int denm) throws Exception{
		if(denm==0) 
			throw new Exception("Denominator is zero");
		return (double)num/denm;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(divide(12,5));
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
