package codingPrograms;

import java.util.ArrayList;

public class ReadandPrintArray {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("IRFANMS");
		al.add("MS");

		System.out.println("" + al.clone());
		for (Object i : al) {
			System.out.println(i);

		}

	}

}
