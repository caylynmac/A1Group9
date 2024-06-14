package shapeSortManager;

import java.util.Collections;

public class AppDriver {
	public static void main(String[] args) {
		Collections.sort( shapes, ( s1, s2 ) -> s1.typeCompare( s2, input ) );
	}
}
