package visualizerAbstractFactory;

import java.util.ArrayList;

import org.apache.commons.lang.StringUtils;

import utility.*;

public class TUIVisualizer implements Visualizer{

	@Override
	public void showData( ArrayList<Pair> data ) {
		for( Pair pair: data ) {
			
			System.out.println( pair.getFirst() + "\t" + StringUtils.repeat("*", pair.getSecond()) );
			
		}
	}

}
