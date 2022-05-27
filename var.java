class	Var {
	public static void main(String[] argc) {
		boolean b = true;
		char	c = 'B';
		byte	bt = -127;

		short	st = -32768;
		int	x = 2147483647;
		long	l = x * x;
		float	f = 1.12312251223f;
		double	d = 3245.98;

		System.out.println("boolean var = " + b);
		System.out.println("char    var = " + c);
		System.out.println("byte    var = " + bt);
		System.out.println("short   var = " + st);
		System.out.println("int     var = " + x);
		System.out.println("long    var = " + l);
		System.out.println("float   var = " + f);
		System.out.println("double  var = " + d);
	}
}
