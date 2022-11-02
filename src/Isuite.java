import org.testng.ISuite;
import org.testng.ISuiteListener;

public class Isuite implements ISuiteListener{

	

	@Override
	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		
		System.out.println("On start"+suite.getName());
	}

	@Override
	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		
		System.out.println("On Finish"+suite.getName());
		
	}

}
