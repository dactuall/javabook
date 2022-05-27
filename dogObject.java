class	Dog {
	String	name;
	int	size;
	public void bark() {
		System.out.println(name + " сказал Гав");
	}
	public void eat() {
		System.out.println(name + " кушает");
	}
	public void chaseCat () {
		System.out.println(name + " гоняет кота");
	}
	public static void main(String[] argc) {
		Dog dog1 = new Dog();
		dog1.bark();
		dog1.name = "Bart";

		Dog[] myDog = new Dog[3];
		myDog[0] = new Dog();
		myDog[1] = new Dog();
		myDog[2] = dog1;

		myDog[0].name = "Fred";
		myDog[1].name = "Jorg";
		System.out.println("Имя последней собаки " + myDog[2].name);

		int	i = 0;
		while (i < myDog.length) {
			myDog[i].bark();
			myDog[i].eat();
			myDog[i].chaseCat();
			i++;
		}
		System.out.println();
		i = 0;
		myDog[0].size = 70;
		myDog[1].size = 50;
		myDog[2].size = 10;
		String s = "Размер собаки в см:\n";
		while (i < 3) {
			if (myDog[i].size > 60) {
				System.out.println(myDog[i].name + " Гав Гав!");
				System.out.println(s + myDog[i].size + "см\n");
			}
			else if (myDog[i].size > 14) {
				System.out.println(myDog[i].name + " Вуф Вуф!");
				System.out.println(s + myDog[i].size + "см\n");
			}
			else {
				System.out.println(myDog[i].name + " Тяф тяф!");
				System.out.println(s + myDog[i].size + "см\n");
			}
			i++;
		}
	}
}

