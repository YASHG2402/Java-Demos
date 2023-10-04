import com.mindcraft.pack1.*;
import com.mindcraft.pack2.*;

public class Tester {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student(1002,"Sameer");
		Batch b1 = new Batch();
		Batch b2 = new Batch("Commerce", 80);
		s1.show();
		s2.show();
		b1.show();
		b2.show();

	}

}
