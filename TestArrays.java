class TestArrays {

	public static void main(String[] argc) {
		String[] islands = new String[4];
		islands[0] = "Бермуды";
		islands[1] = "Фиджи";
		islands[2] = "Азорские острова";
		islands[3] = "Косумель";
		int[] index = new int[4];
		index[0] = 1;
		index[1] = 3;
		index[2] = 0;
		index[3] = 2;
		int	i = 0;
		int	ref;
		System.out.println("Острова:");
		while (i < 4) {
			ref = index[i];
			System.out.println(islands[ref]);
			i++;
		}
	}
}
