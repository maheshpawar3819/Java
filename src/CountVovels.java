
public class CountVovels {

	public static void main(String[] args) {
		String name = "MAHESH PAWAR";

		// check how many vovels present in the given name
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i); // to get character at index i

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				count++;
			}
		}
		System.out.println("Number of Vovels present in the" + name + ":" + count);
	}

}
