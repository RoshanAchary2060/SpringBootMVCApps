package com.rosan.service;

import com.rosan.entity.MarriageSeekerInfo;

public interface IMatrimonyMgmtService {
	public String registerProfile(MarriageSeekerInfo entity);
	public Iterable<MarriageSeekerInfo> getAllProfiles();
}
