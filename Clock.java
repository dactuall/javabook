class	Clock {
	private String	time;

	public String getTime() {
		return time;	
	}

	public void setTime(String s) {
		time = s;
	}
}

class	ClockTestDrive {
	public static void main(String[] args) {
		Clock c = new Clock();
		c.setTime("12:45");
		System.out.println("Время: " + c.getTime());

		Clock b = new Clock();
		b.setTime("12:46");
		System.out.println("Время: " + b.getTime());
	}
}
