class	Hobbits {
	String name;
	public static void main(String[] argc) {
		Hobbits[] h = new Hobbits[3];
		int	i = 0;
		while(i < 3) {
			h[i] = new Hobbits();
			h[i].name = "Бильбо";
			if (i == 1)
				h[i].name = "Фродо";
			if (i == 2)
				h[i].name = "Сэм";
			System.out.println(h[i].name + " - хороший хоббит");
			i++;
		}
	}
}
