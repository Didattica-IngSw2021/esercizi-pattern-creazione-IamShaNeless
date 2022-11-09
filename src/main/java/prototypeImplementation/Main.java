package prototypeImplementation;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Vehicle vec1 = new Car("Audi", "A4", "red", 6);
		
		List<Vehicle> copyList = new ArrayList<>();
		for( int i = 0; i < 10; i++ ) {
			copyList.add( vec1.clone() );
		}
	}

}
