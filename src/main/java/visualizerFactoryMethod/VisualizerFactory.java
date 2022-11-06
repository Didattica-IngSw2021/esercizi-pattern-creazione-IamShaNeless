package visualizerFactoryMethod;

import utility.FileManager;

public class VisualizerFactory {
	public Visualizer makeVisualizer( String type ) {
		switch ( type ) {
		case "tui": 
			return new TUIVisualizer();
		
		case "swing":
			return new SwingVisualizer();
			
		default:
			throw new IllegalArgumentException("Unexpected value: " +  type );
		}
		
		
	}
	

	public static void main(String[] args) {
		VisualizerFactory factory = new VisualizerFactory();
		Visualizer visualizer = factory.makeVisualizer("swing");
		
		visualizer.showData( FileManager.getInstance().getData() );
		

	}

}
