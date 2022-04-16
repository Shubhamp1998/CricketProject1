package com.cricket.CricketProject.model;

public class RefereeModel {
	int refereeID;
	String refereeName;
	int noOfMatches;

	public int getRefereeID() {
		return refereeID;
	}

	public void setRefereeID(int refereeID) {
		this.refereeID = refereeID;
	}

	public String getRefereeName() {
		return refereeName;
	}

	public void setRefereeName(String refereeName) {
		this.refereeName = refereeName;
	}

	public int getNoOfMatches() {
		return noOfMatches;
	}

	public void setNoOfMatches(int noOfMatches) {
		this.noOfMatches = noOfMatches;
	}

	public RefereeModel(int refereeID, String refereeName, int noOfMatches) {
		super();
		this.refereeID = refereeID;
		this.refereeName = refereeName;
		this.noOfMatches = noOfMatches;
	}

}
