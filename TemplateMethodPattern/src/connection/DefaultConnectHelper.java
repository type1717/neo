package connection;

public class DefaultConnectHelper extends AbstConnectHepler {

	@Override
	protected String doSecurity(String str) {
		// TODO Auto-generated method stub
		System.out.println("decode");
		return str;
	}

	@Override
	protected boolean authentication(String id, String password) {
		// TODO Auto-generated method stub
		System.out.println("id pw check");
		return true;
	}

	@Override
	protected int authorization(String userName) {
		// TODO Auto-generated method stub
		System.out.println("auth check");
		return 0;
	}

	@Override
	protected String connection(String info) {
		// TODO Auto-generated method stub
		System.out.println("connection success");
		return null;
	}

}
