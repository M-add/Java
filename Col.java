class Col{
	static boolean colindrome(String s)
	{
		int i1 = 0;
		for (int i = 0; i < s.length(); i++) 
		{
			int i2 = i1 + 3;

			String s1 = "";
			String s2 = "";
			int c1 = 0, c2 = 0;

			// Iterate upto 3 letters
			for (i1 = i1; i1 < s.length(); i1++) {
				c1++;

				// concat each word with taken String
				s1 = s1 + s.charAt(i1);
				if (c1 == 3) {
					break;
				}
			}

			// Iterate upto 3 letters
			for (i2 = i2; i2 < s.length(); i2++) {
				c2++;

				// concat each word with taken String
				s2 = s2 + s.charAt(i2);
				if (c2 == 3) {
					break;
				}
			}

			// Reverse the second String
			String s3 = "";
			for (int k = s2.length() - 1; k >= 0; k--) {
				s3 = s3 + s2.charAt(k);
			}

			// Checks equality of two strings
			if (s1.equals(s3) != true) {
				// If the two Strings are not same then return false
				return false;
			}

			// Increment first variable by 6 and second variable by 3
			i1 = i1 + 6;
			i2 = i2 + 3;
		}
		return true;
	}

	// Driver code
	public static void main(String[] args)
	{
		String s = "cbbbbc";
		boolean b = colindrome(s);
		if (b) {
			System.out.println("String is colindrome");
		}
		else {
			System.out.println("Not Colindrome");
		}
	}
}
