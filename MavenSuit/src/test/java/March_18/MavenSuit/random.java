package March_18.MavenSuit;
public class random {
	public static void main(String[] args) {	
		int upperBound = 20;
	    int lowerBound = 10;
	    // upperBound 20 will also be included
	    int range = (upperBound - lowerBound) + 1;
	    System.out.println("Random Numbers between 10 and 20:");
	      int random = (int)(Math.random() * range) + lowerBound;
	      System.out.print(random + ", ");
	}
}
