package com.sh.policy.controller;
import java.io.FileNotFoundException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sh.policy.documentrepo.PolicyDetailsRepository;
import com.sh.policy.model.PolicyDetails;
import com.sh.policy.model.PremiaPolicies;
import com.sh.policy.model.Sample;


@RestController
@RequestMapping(path = "/")
public class PolicyController {
	
	@Autowired
	private  PolicyDetailsRepository policyDetailsRepository ;
	
	PolicyDetails policyDetails = new PolicyDetails();
	PremiaPolicies premiaPolicy = new PremiaPolicies();
	Sample sample = new Sample();
	
	@RequestMapping(value = "/addPolicies", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(code = HttpStatus.CREATED)
	public ResponseEntity<String> addPolicies(@RequestBody PremiaPolicies premiaPolicy) throws FileNotFoundException {
		  for(PolicyDetails policy1 : premiaPolicy.getPolicyDetails()) { 
		       policyDetailsRepository.insert(policy1);
			  }
		  String response = "Policies inserted to Db";
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
	  
	@RequestMapping(value = "/getAllPolicyDetail", method = RequestMethod.GET)
	public List<PolicyDetails> getAll() {  
	    return policyDetailsRepository.findAll();
	}
	
	
	@RequestMapping(value = "/getFindOne/{polSysId}", method = RequestMethod.GET)
	public PolicyDetails getOne(@PathVariable String polSysId) {  
	    return policyDetailsRepository.findOne(polSysId);    		
	}
	
	
	@RequestMapping(value = "/updateDocument", method = RequestMethod.PUT)
	public PolicyDetails updateDocument(@RequestBody PolicyDetails pd) {  
	    return policyDetailsRepository.save(pd);
	}
	
	
	@RequestMapping(value = "/delete/{polSysId}", method = RequestMethod.DELETE)
	public void delete(@PathVariable String polSysId) {  
	   PolicyDetails p1 = policyDetailsRepository.findOne(polSysId);    
	    policyDetailsRepository.delete(p1);
	}
	
	@RequestMapping(value = "/deleteAll", method = RequestMethod.DELETE)
	public String deleteAll()
	{
		policyDetailsRepository.deleteAll();
		return "Documents deleted";
	}
	
}



	