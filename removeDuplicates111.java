
public class removeDuplicates111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="aabbccee";
		String result= removeAdjacentDuplicates(input);
		System.out.println(result);

	}

	private static String removeAdjacentDuplicates(String input) {
		// TODO Auto-generated method stub
		while(input.contains("(.)\\1+")) {
			input=input.replaceAll("(.)\\1+","$1");
		
			}
		
		return input;
	}
}
