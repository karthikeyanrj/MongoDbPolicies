package com.sh.policy.documentrepo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.sh.policy.model.PolicyDetails;
import com.sh.policy.model.PremiaPolicies;

@Repository
public interface PolicyDetailsRepository extends MongoRepository<PolicyDetails,String>{
	
	}
