
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode drinks = new TreeNode("Drinks");
		TreeNode hot = new TreeNode("Hot");
		TreeNode cold = new TreeNode("Cold");
		
		TreeNode tea = new TreeNode("Tea");
		TreeNode coffee = new TreeNode("Cofee");
		
		TreeNode wine = new TreeNode("wine");
		TreeNode beer = new TreeNode("beer");
		
		drinks.addChild(hot);
		drinks.addChild(cold);
		hot.addChild(tea);
		hot.addChild(coffee);
		
		cold.addChild(wine);
		cold.addChild(beer);
		
		System.out.println(drinks.print(0));
	}

}

