package com.sh.policy.model;

import java.util.List;



import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class PremiaPolicies {
	
	private List<PolicyDetails> policyDetails;

	
    public List<PolicyDetails> getPolicyDetails() {
		return policyDetails;
	}

	public void setPolicyDetails(List<PolicyDetails> policyDetails) {
		this.policyDetails = policyDetails;
	}

	@Override
	public String toString() {
		return "PremiaPolicies [policyDetails=" + policyDetails + "]";
	}


	

}
