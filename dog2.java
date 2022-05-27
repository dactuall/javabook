class Dog2 {
	String	name;
	int	size;
	public static void main(String[] argc) {
		Dog2 myDog = new Dog2();
		myDog.name = "Jorg";
		myDog.size = 50;
		System.out.println("Привет! имя моей собаки: " + myDog.name);
		System.out.println("Размер моей собаки: " + myDog.size + "см");
		myDog.bark(20, myDog.name);
	}
	void	bark(int	count_barks, String name) {
		System.out.println("Сейчас я дам команду моей собаке чтобы тот пролаял " + count_barks + " Раз");
		while (count_barks > 0) {
			System.out.print("Гав ");
			count_barks--;
		}
		System.out.println("Сказал: " + name);
		System.out.println("Хороший мальчик!");
	}
}
