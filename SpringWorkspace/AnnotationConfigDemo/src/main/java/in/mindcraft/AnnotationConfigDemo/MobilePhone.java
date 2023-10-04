package in.mindcraft.AnnotationConfigDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class MobilePhone {
	private int mid;
	private String name;
	@Autowired
	private MemoryCard mcard;
	
	public MobilePhone() {
		mid = 111;
		name = "ASUS ROG";
		System.out.println("Mobile Phone Construtor");
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public MemoryCard getMcard() {
		return mcard;
	}

	public void setMcard(MemoryCard mcard) {
		this.mcard = mcard;
	}

	public void show() {
		System.out.println(mid+" " +name);
		mcard.show();
	}
}
