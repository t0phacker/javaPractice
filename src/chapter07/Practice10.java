package chapter07;

// [7-11] 문제7-10에서 작성한 MyTv2클래스에 이전 채널(previous channel)로 이동하는 기능의
// 메서드를 추가해서 실행결과와 같은 결과를 얻도록 하시오.
// 메서드명 : gotoPrevChannel
// 기능 : 현재 채널을 이전 채널로 변경한다.
// 반환타입 : 없음
// 매개변수 : 없음

class MyTv2 {
	boolean isPowerOn;
	int channel;
	int volume;
	int prevChannel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public void setVolume(int volume) {
		if (volume > MAX_VOLUME || volume < MIN_VOLUME) {
			return;
		}
		this.volume = volume;
	}
	public int getVolume() {
		return volume;
	}
	
	public void setChannel(int channel) {
		prevChannel = this.channel;
		if (channel > MAX_CHANNEL || channel < MIN_CHANNEL) {
			return;
		}
		this.channel = channel;
	}
	public int getChannel() {
		return channel;
	}
	
	public void gotoPrevChannel() {
		setChannel(prevChannel);
	}
}

public class Practice10 {

	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH : " + t.getChannel());
		t.setChannel(20);
		System.out.println("CH : " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH : " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH : " + t.getChannel());
	}

}
