
public class AdapterImpl implements Adapter {

	@Override
	public Float twiceOf(Float f) {
		// TODO Auto-generated method stub
		
		//아래와 같이 다른 알고르즘을 사용할 경우 impl만 수정 후 main수정 필요 없음
		//Float returnValue = (float) Math.twoTime(f.doubleValue());
		Float returnValue = Math.doubled(f.doubleValue()).floatValue();
		
		return returnValue;
	}

	@Override
	public Float halfOf(Float f) {
		// TODO Auto-generated method stub
		
		Float returnValue = (float) Math.half(f.doubleValue());
		
		return returnValue;
	}

}
