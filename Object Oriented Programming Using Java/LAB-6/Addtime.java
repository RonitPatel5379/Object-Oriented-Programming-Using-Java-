class Time {
	int hour;
	int minute;
	
	public Time(int hour,int minute) {
		this.hour = hour;
		this.minute = minute;
	}

	public void addition(Time temp) {
		this.hour = this.hour + temp.hour;
		this.minute = this.minute + temp.minute;
		if(this.minute>=60) {
			this.hour++;
			this.minute-=60;
		}
		System.out.println("Ans=" + hour + ":" + minute);
	}

		public void add(int hour,int minute) {
		this.hour+=hour;
		this.minute+=minute;
		System.out.println("Ans=" + hour + ":" + minute);
	}
}

public class Addtime {
	public static void main(String[] args) {
		Time t1 = new Time(4,20);
		Time t2 = new Time(10,30);
		t1.addition(t2);	
	}
}