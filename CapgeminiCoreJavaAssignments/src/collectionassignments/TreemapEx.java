package collectionassignments;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreemapEx {

	static Long p1=12345l;
	static Long p2=54321l;
	static Long p3=23457l;
	
	
	
	public Long getP1() {
		return p1;
	}

	public Long getP2() {
		return p2;
	}

	public Long getP3() {
		return p3;
	}

	public TreemapEx(Long p1, Long p2, Long p3) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public static void main(String[] args) {
		
		
		
		Contacts c1=new Contacts("John","122,2nd cross");
		Contacts c2=new Contacts("Harry","123,2nd cross");
		Contacts c3=new Contacts("Larry","123,3rd cross");
						
		Map<Long,Contacts> map=new TreeMap<>(new MyComparator());
		map.put(p1, c1);
		map.put(p2, c2);
		map.put(p3, c3);
		
		Set<Entry<Long, Contacts>> set=map.entrySet();
		Iterator<Entry<Long,Contacts>> itr=set.iterator();
		while(itr.hasNext()) {
			Map.Entry<Long,Contacts> entry=(Map.Entry<Long,Contacts>)itr.next();
			Long phone=entry.getKey();
			Contacts contact=entry.getValue();
			System.out.println(phone);
			System.out.println(contact);
		}
	}

	
	

}

class Contacts {
	String name;
	String Address;

	public Contacts(String name, String address) {
		super();
		this.name = name;
		Address = address;
	}

	public Contacts() {
		super();
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return Address;
	}

	@Override
	public String toString() {
		return "Contacts [name=" + name + ", Address=" + Address + "]";
	}

	
	
}

class MyComparator implements Comparator<Long>{

	
	@Override
	public int compare(Long o1, Long o2) {
		// TODO Auto-generated method stub
		if(o1<o2) {
			return +1;
		}else if(o1>o2){
			return -1;
		}else
		return 0;
	}
	
}


