package com.rosan.model;

import org.springframework.web.multipart.MultipartFile;

public class MarriageSeeker {
	private String profileName;
	public String getProfileName() {
		return profileName;
	}
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public MultipartFile getResume() {
		return resume;
	}
	public void setResume(MultipartFile resume) {
		this.resume = resume;
	}
	public MultipartFile getPhoto() {
		return photo;
	}
	public void setPhoto(MultipartFile photo) {
		this.photo = photo;
	}
	private String gender = "female";
	private MultipartFile resume;
	private MultipartFile photo;
}
