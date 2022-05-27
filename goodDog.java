class GoodDog {
	private int	size;
	private String	name;

	public String	getName() {
		return name;
	}

	public void	setName(String s) {
		name = s;
	}

	public int	getSize() {
		return size;
	}

	public void	setSize(int	s) {
		size = s;
	}

	void bark() {
		if (size > 60)
			System.out.println("Гав Гав!");
		else if (size > 14)
			System.out.println("Вуф Вуф!");
		else
			System.out.println("Тяф Тяф!");
	}

	void goodboy() {
		System.out.println("Хороший мальчик!");
	}

	public static void main(String[] args) {
		System.out.println("class GodDog");
	}
}

class	GoodDogTestDrive {

	public static void main(String[] args) {
		GoodDog one = new GoodDog();
		one.setSize(70);
		one.setName("Bart");
		System.out.println("Размер первой собаки: " + one.getSize());
		System.out.println("Имя первой собаки: " + one.getName());
		one.bark();
		one.goodboy();

		GoodDog two = new GoodDog();
		two.setSize(50);
		two.setName("Jorg");
		System.out.println("Размер второй собаки: " + two.getSize());
		System.out.println("Имя второй собаки: " + two.getName());
		two.bark();
		two.goodboy();

		GoodDog three = new GoodDog();
		three.setSize(10);
		three.setName("Liza");
		System.out.println("Размер третей собаки: " + three.getSize());
		System.out.println("Имя третей собаки: " + three.getName());
		three.bark();
		three.goodboy();
	}
}
