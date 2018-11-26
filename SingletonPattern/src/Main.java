
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SystemSpeaker speaker1 = SystemSpeaker.getInstance();
		SystemSpeaker speaker2 = SystemSpeaker.getInstance();
		speaker2.setVolume(10);
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
	}

}
