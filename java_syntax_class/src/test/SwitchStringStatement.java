package test;

public class SwitchStringStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String key = "Blue";
		String shirt = " Shirt";
		
		switch ( key )  {
		case "Red":
			shirt = "Red " + shirt;
			break;
		case "Blue":
			shirt = "Blue " + shirt;
			break;
			
		default:
			shirt = "White " + shirt;
			break;
		}
		
		System.out.println("Shirt type : "+ shirt);
	}

}
