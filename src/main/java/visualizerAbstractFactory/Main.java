package visualizerAbstractFactory;

public class Main {
	public static void main(String[] args) {
		Factory factory = Factory.getFactory("tui");
		
		factory.getVisualizer().showData(utility.FileManager.getInstance().getData());
		
		factory = Factory.getFactory("swing");
		factory.getVisualizer().showData(utility.FileManager.getInstance().getData());
	}
}
