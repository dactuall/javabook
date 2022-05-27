class	Books {
	String author;
	String title;
	public static void main (String[] argc) {
		Books[] myBook = new Books[3];
		myBook[0] = new Books();
		myBook[1] = new Books();
		myBook[2] = new Books();
		myBook[0].title = "Плоды java";
		myBook[1].title = "java гетсби";
		myBook[2].title = "Сборник рецептов по java";
		myBook[0].author = "Боб";
		myBook[1].author = "Сью";
		myBook[2].author = "Ян";
		
		int	i = 0;
		while (i < myBook.length) {
			System.out.println("Автор " + myBook[i].author);
			System.out.println("Книга " + myBook[i].title);
			i++;
		}
	}
}
