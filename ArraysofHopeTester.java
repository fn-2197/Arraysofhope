package gamesnstuff;

public class ArraysofHopeTester {

	public static void main(String[] args) {
		char ch[] = new char[26];
		int b = 0;
		for(int a = 65; a < 91; a++){
			ch[b] = (char) a;
			b++;
		}
		for(int a = 0; a<26; a++)
			System.out.print(ch[a] + ", ");

	}

}
