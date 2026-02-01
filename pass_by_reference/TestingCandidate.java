package pass_by_reference;

public class TestingCandidate {
	
	String candidateName;
	
	public TestingCandidate(String candidateName) {
		this.candidateName = candidateName;
	}
	
	void acceptOffer(Google googleReference) {
		googleReference.joinCompany(candidateName);
	}
}
