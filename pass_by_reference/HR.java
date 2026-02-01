package pass_by_reference;

public class HR {
	public static void main(String[] args) {
		
		// Create Object For DevelopmentCandidate
		DevelopmentCandidate dev_candidate = new DevelopmentCandidate("Abhishek");
		
		// Create Object For TestingCandidate
		TestingCandidate test_candidate = new TestingCandidate("Aishwarya");
		
		// Create Reference Variable For Google
		Google g = new Google();
		
		dev_candidate.acceptOffer(g);
		test_candidate.acceptOffer(g);
	}
}
