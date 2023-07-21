class h1
{
static void alphabetPattern(int N)
{

	int left = 0, middle = N - 1, right = N + 1;
	for (int row = 0; row < 2 * N - 1; row++) {


		if (row < N)
			System.out.print( ++left);
		else
			System.out.print(--left);

		
		for (int col = 1; col < N - 1; col++) {

			if (row != N - 1)
			System.out.print( " ");
					
			else
				System.out.print( " " +middle--);
		}

		if (row < N)
			System.out.print( " " +--right);
		else
			System.out.print( " " + ++right);
		System.out.println();
	}
}

	public static void main(String[] args) {

	int N = 9;

	alphabetPattern(N);


}
}
