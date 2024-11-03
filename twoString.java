
public class twoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value="Hello, World !";
		String searchvalue ="World";
		int index=findindex(value, searchvalue);
		System.out.println("index :"+index);

	}

	private static int findindex(String value, String searchvalue) {
		// TODO Auto-generated method stub
		return value.indexOf(searchvalue);
	}

}
