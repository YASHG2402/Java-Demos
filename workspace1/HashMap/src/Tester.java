import java.util.*;

public class Tester {

	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<>();
		
		map.put(8, "P");
		map.put(24, "Y");
		map.put(11, "V");
		
		System.out.println(map);
		
		Set<Integer> keys=map.keySet();
		System.out.println(keys);
		
		for(Integer key:keys)
		{
			System.out.println(map.get(key));
		}
	}

}
