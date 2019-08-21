package AssignmentSession9;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import java.util.*;
public class AnotherClass {

	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		HDTV hdtv = new HDTV();
		
		ArrayList<HDTV> al = new ArrayList<HDTV>();
		
		al.add(new HDTV("Samsung", 80));
		al.add(new HDTV("Lenovo", 60));
		al.add(new HDTV("Apple", 50));
		al.add(new HDTV("Google", 70));
		al.add(new HDTV("LG", 110));
		
		System.out.println("Here are a list of HDTV's not sorted: \n" + al);
		
		//System.out.println(al.toString());
		
		//System.out.println("The list sorted is: " + Collections.sort(al));
		Collections.sort(al);
		
		System.out.println("The list sorted is: \n" + al);

	}
	

}
