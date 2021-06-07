package com.DHacker.service;

import java.util.List;

import com.DHacker.model.Lead;

public interface LeadService {
	boolean saveLead(Lead lead);

	List<Lead> getLeads();


}
