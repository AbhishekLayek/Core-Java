package pass_by_reference;

public class DevelopmentCandidate {
	
	String candidateName;
	
	public DevelopmentCandidate(String candidateName) {
		this.candidateName = candidateName;
	}
	
	void acceptOffer(Google googleReference) {
		googleReference.joinCompany(candidateName);
	}
}