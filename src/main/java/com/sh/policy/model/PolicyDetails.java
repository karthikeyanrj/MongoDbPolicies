package com.sh.policy.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.sh.policy.model.InsuredDetails;
import com.sh.policy.model.PolicyCoverDetails;
@Document(collection= "policyDetails")
public class PolicyDetails {
	@Id
	private String polSysID;
	private String policyNo;
	private String policyEndNo;
	private String lob;
	private String productCode;
	private String productName;
	private String policyType;
	private String proposerCode;
	private String proposerName;
	private	String proposerDOB;
	private	String proposerAddress1;
	private	String proposerAddress2;
	private	String proposerAddress3;
	private	String proposerTelNo;
	private	String proposerMobileNo;
	private	String proposerFaxNo;
	private	String proposerEmail;
	private	String policyStartDate;
	private	String policyEndDate;
	private	String renewalPolicyNo;
	private	String officeCode;
	private	String proposerOfficeAddress1;
	private	String proposerOfficeAddress2;
	private	String proposerOfficeAddress3;
	private	String proposerOfficeTelNo;
	private	String proposerOfficeEmail;
	private	String proposerOfficeFaxNo;
	private	String proposerPanNo;
	private	String receiptNo;
	private	String receiptDate;
	private	String policySumInsured;
	private	String cumulativeBonus;
	private	String agentCode;
	private	String agentName;
	private	String smCode;
	private	String smName;
	private	String policyStatus;
	private	String policyApproveStatus;
	private	String policyRenewalStatus;
	private	String coPay;
	private	String grossPremium;
	private	String polType;
	private	String schemeType;
	private	String proposerTitle;
	private	String policyTerm;
	private	String paymentMade;
	private	String deductiableAmt;
	private	String zone;
	private	String plan;
	private	String city;
	private	String subDistrict;
	private	String district;
	private	String state;
	private	String pincode;
	private	String proposerGender;
	private String portedYN;
	private	String errDesc;
	private InsuredDetails insuredDetails;
	private ProposerNomineeDetails proposerNomineeDetails;
	public InsuredDetails getInsuredDetails() {
		return insuredDetails;
	}
	public void setInsuredDetails(InsuredDetails insuredDetails) {
		this.insuredDetails = insuredDetails;
	}
	public PolicyCoverDetails getPolicyCoverDetails() {
		return policyCoverDetails;
	}
	public void setPolicyCoverDetails(PolicyCoverDetails policyCoverDetails) {
		this.policyCoverDetails = policyCoverDetails;
	}



	private PolicyCoverDetails policyCoverDetails;

	
	public String getPolSysID() {
		return polSysID;
	}
	public void setPolSysID(String polSysID) {
		this.polSysID = polSysID;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getPolicyEndNo() {
		return policyEndNo;
	}
	public void setPolicyEndNo(String policyEndNo) {
		this.policyEndNo = policyEndNo;
	}
	public String getLob() {
		return lob;
	}
	public void setLob(String lob) {
		this.lob = lob;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getPolicyType() {
		return policyType;
	}
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}
	public String getProposerCode() {
		return proposerCode;
	}
	public void setProposerCode(String proposerCode) {
		this.proposerCode = proposerCode;
	}
	public String getProposerName() {
		return proposerName;
	}
	public void setProposerName(String proposerName) {
		this.proposerName = proposerName;
	}
	public String getProposerDOB() {
		return proposerDOB;
	}
	public void setProposerDOB(String proposerDOB) {
		this.proposerDOB = proposerDOB;
	}
	public String getProposerAddress1() {
		return proposerAddress1;
	}
	public void setProposerAddress1(String proposerAddress1) {
		this.proposerAddress1 = proposerAddress1;
	}
	public String getProposerAddress2() {
		return proposerAddress2;
	}
	public void setProposerAddress2(String proposerAddress2) {
		this.proposerAddress2 = proposerAddress2;
	}
	public String getProposerAddress3() {
		return proposerAddress3;
	}
	public void setProposerAddress3(String proposerAddress3) {
		this.proposerAddress3 = proposerAddress3;
	}
	public String getProposerTelNo() {
		return proposerTelNo;
	}
	public void setProposerTelNo(String proposerTelNo) {
		this.proposerTelNo = proposerTelNo;
	}
	public String getProposerMobileNo() {
		return proposerMobileNo;
	}
	public void setProposerMobileNo(String proposerMobileNo) {
		this.proposerMobileNo = proposerMobileNo;
	}
	public String getProposerFaxNo() {
		return proposerFaxNo;
	}
	public void setProposerFaxNo(String proposerFaxNo) {
		this.proposerFaxNo = proposerFaxNo;
	}
	public String getProposerEmail() {
		return proposerEmail;
	}
	public void setProposerEmail(String proposerEmail) {
		this.proposerEmail = proposerEmail;
	}
	public String getPolicyStartDate() {
		return policyStartDate;
	}
	public void setPolicyStartDate(String policyStartDate) {
		this.policyStartDate = policyStartDate;
	}
	public String getPolicyEndDate() {
		return policyEndDate;
	}
	public void setPolicyEndDate(String policyEndDate) {
		this.policyEndDate = policyEndDate;
	}
	public String getRenewalPolicyNo() {
		return renewalPolicyNo;
	}
	public void setRenewalPolicyNo(String renewalPolicyNo) {
		this.renewalPolicyNo = renewalPolicyNo;
	}
	public String getOfficeCode() {
		return officeCode;
	}
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}
	public String getProposerOfficeAddress1() {
		return proposerOfficeAddress1;
	}
	public void setProposerOfficeAddress1(String proposerOfficeAddress1) {
		this.proposerOfficeAddress1 = proposerOfficeAddress1;
	}
	public String getProposerOfficeAddress2() {
		return proposerOfficeAddress2;
	}
	public void setProposerOfficeAddress2(String proposerOfficeAddress2) {
		this.proposerOfficeAddress2 = proposerOfficeAddress2;
	}
	public String getProposerOfficeAddress3() {
		return proposerOfficeAddress3;
	}
	public void setProposerOfficeAddress3(String proposerOfficeAddress3) {
		this.proposerOfficeAddress3 = proposerOfficeAddress3;
	}
	public String getProposerOfficeTelNo() {
		return proposerOfficeTelNo;
	}
	public void setProposerOfficeTelNo(String proposerOfficeTelNo) {
		this.proposerOfficeTelNo = proposerOfficeTelNo;
	}
	public String getProposerOfficeEmail() {
		return proposerOfficeEmail;
	}
	public void setProposerOfficeEmail(String proposerOfficeEmail) {
		this.proposerOfficeEmail = proposerOfficeEmail;
	}
	public String getProposerOfficeFaxNo() {
		return proposerOfficeFaxNo;
	}
	public void setProposerOfficeFaxNo(String proposerOfficeFaxNo) {
		this.proposerOfficeFaxNo = proposerOfficeFaxNo;
	}
	public String getProposerPanNo() {
		return proposerPanNo;
	}
	public void setProposerPanNo(String proposerPanNo) {
		this.proposerPanNo = proposerPanNo;
	}
	public String getReceiptNo() {
		return receiptNo;
	}
	public void setReceiptNo(String receiptNo) {
		this.receiptNo = receiptNo;
	}
	public String getReceiptDate() {
		return receiptDate;
	}
	public void setReceiptDate(String receiptDate) {
		this.receiptDate = receiptDate;
	}
	public String getPolicySumInsured() {
		return policySumInsured;
	}
	public void setPolicySumInsured(String policySumInsured) {
		this.policySumInsured = policySumInsured;
	}
	public String getCumulativeBonus() {
		return cumulativeBonus;
	}
	public void setCumulativeBonus(String cumulativeBonus) {
		this.cumulativeBonus = cumulativeBonus;
	}
	public String getAgentCode() {
		return agentCode;
	}
	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public String getSmCode() {
		return smCode;
	}
	public void setSmCode(String smCode) {
		this.smCode = smCode;
	}
	public String getSmName() {
		return smName;
	}
	public void setSmName(String smName) {
		this.smName = smName;
	}
	public String getPolicyStatus() {
		return policyStatus;
	}
	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}
	public String getPolicyApproveStatus() {
		return policyApproveStatus;
	}
	public void setPolicyApproveStatus(String policyApproveStatus) {
		this.policyApproveStatus = policyApproveStatus;
	}
	public String getPolicyRenewalStatus() {
		return policyRenewalStatus;
	}
	public void setPolicyRenewalStatus(String policyRenewalStatus) {
		this.policyRenewalStatus = policyRenewalStatus;
	}
	public String getCoPay() {
		return coPay;
	}
	public void setCoPay(String coPay) {
		this.coPay = coPay;
	}
	public String getGrossPremium() {
		return grossPremium;
	}
	public void setGrossPremium(String grossPremium) {
		this.grossPremium = grossPremium;
	}
	public String getPolType() {
		return polType;
	}
	public void setPolType(String polType) {
		this.polType = polType;
	}
	public String getSchemeType() {
		return schemeType;
	}
	public void setSchemeType(String schemeType) {
		this.schemeType = schemeType;
	}
	public String getProposerTitle() {
		return proposerTitle;
	}
	public void setProposerTitle(String proposerTitle) {
		this.proposerTitle = proposerTitle;
	}
	public String getPolicyTerm() {
		return policyTerm;
	}
	public void setPolicyTerm(String policyTerm) {
		this.policyTerm = policyTerm;
	}
	public String getPaymentMade() {
		return paymentMade;
	}
	public void setPaymentMade(String paymentMade) {
		this.paymentMade = paymentMade;
	}
	public String getDeductiableAmt() {
		return deductiableAmt;
	}
	public void setDeductiableAmt(String deductiableAmt) {
		this.deductiableAmt = deductiableAmt;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getSubDistrict() {
		return subDistrict;
	}
	public void setSubDistrict(String subDistrict) {
		this.subDistrict = subDistrict;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getProposerGender() {
		return proposerGender;
	}
	public void setProposerGender(String proposerGender) {
		this.proposerGender = proposerGender;
	}
	public String getPortedYN() {
		return portedYN;
	}
	public void setPortedYN(String portedYN) {
		this.portedYN = portedYN;
	}
	public String getErrDesc() {
		return errDesc;
	}
	public void setErrDesc(String errDesc) {
		this.errDesc = errDesc;
	}
	
	@Override
	public String toString() {
		return "PolicyDetails [polSysID=" + polSysID + ", policyNo=" + policyNo + ", policyEndNo=" + policyEndNo
				+ ", lob=" + lob + ", productCode=" + productCode + ", productName=" + productName + ", policyType="
				+ policyType + ", proposerCode=" + proposerCode + ", proposerName=" + proposerName + ", proposerDOB="
				+ proposerDOB + ", proposerAddress1=" + proposerAddress1 + ", proposerAddress2=" + proposerAddress2
				+ ", proposerAddress3=" + proposerAddress3 + ", proposerTelNo=" + proposerTelNo + ", proposerMobileNo="
				+ proposerMobileNo + ", proposerFaxNo=" + proposerFaxNo + ", proposerEmail=" + proposerEmail
				+ ", policyStartDate=" + policyStartDate + ", policyEndDate=" + policyEndDate + ", renewalPolicyNo="
				+ renewalPolicyNo + ", officeCode=" + officeCode + ", proposerOfficeAddress1=" + proposerOfficeAddress1
				+ ", proposerOfficeAddress2=" + proposerOfficeAddress2 + ", proposerOfficeAddress3="
				+ proposerOfficeAddress3 + ", proposerOfficeTelNo=" + proposerOfficeTelNo + ", proposerOfficeEmail="
				+ proposerOfficeEmail + ", proposerOfficeFaxNo=" + proposerOfficeFaxNo + ", proposerPanNo="
				+ proposerPanNo + ", receiptNo=" + receiptNo + ", receiptDate=" + receiptDate + ", policySumInsured="
				+ policySumInsured + ", cumulativeBonus=" + cumulativeBonus + ", agentCode=" + agentCode
				+ ", agentName=" + agentName + ", smCode=" + smCode + ", smName=" + smName + ", policyStatus="
				+ policyStatus + ", policyApproveStatus=" + policyApproveStatus + ", policyRenewalStatus="
				+ policyRenewalStatus + ", coPay=" + coPay + ", grossPremium=" + grossPremium + ", polType=" + polType
				+ ", schemeType=" + schemeType + ", proposerTitle=" + proposerTitle + ", policyTerm=" + policyTerm
				+ ", paymentMade=" + paymentMade + ", deductiableAmt=" + deductiableAmt + ", zone=" + zone + ", plan="
				+ plan + ", city=" + city + ", subDistrict=" + subDistrict + ", district=" + district + ", state="
				+ state + ", pincode=" + pincode + ", proposerGender=" + proposerGender + ", portedYN=" + portedYN
				+ ", errDesc=" + errDesc + ", insuredDetails=" + insuredDetails + ", policyCoverDetails="
				+ policyCoverDetails + "]";
	}
	
	
	
	}
