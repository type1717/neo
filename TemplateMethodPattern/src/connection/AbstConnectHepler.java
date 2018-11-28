package connection;

public abstract class AbstConnectHepler {
	
	protected abstract String doSecurity(String str);
	protected abstract boolean authentication(String id, String password);
	protected abstract int authorization(String userName);
	protected abstract String connection(String info);
	
	//템플릿 메소드
	public String requestConnection(String encodedInfo) {
		
		//보안과정 (암호화 된 문자열 복호화)
		String decodedInfo = doSecurity(encodedInfo);
		//반환된 것을 가지고 아이디 암호를 할당
		
		String id = "aaa";
		String password = "bbb";
		
		boolean condition = authentication(id, password);
		if(!condition) {
			throw new Error("id, pw 불일치");
		}
		
		String userName = "username";
		
		int i = authorization(userName);
		switch (i) {
		case 0: //게임 메니저
			break;
		case 1: //유료회원
			break;
		case 2: //무료회원
			break;		
		case 3: //권한 없음
			break;
		default : //기타사항 
			break;
		}
		
		return connection(decodedInfo);
	}
	
}
