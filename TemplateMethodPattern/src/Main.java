import connection.AbstConnectHepler;
import connection.DefaultConnectHelper;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstConnectHepler helper = new DefaultConnectHelper();
		helper.requestConnection("아이디 암호등 인코딩된 접속 정보");
	}

}
 