class	Arrint {
	public static void main(String[] argc) {
		int	i;
		int[]	nums;

		nums = new int[10];
		i = 0;
		while (i < 10) {
			nums[i] = i * 2;
			System.out.print("nums = " + nums[i] + " ");
			nums[i] = i;
			System.out.println("nums index = " + nums[i]);
			i++;
		}
	}
}
