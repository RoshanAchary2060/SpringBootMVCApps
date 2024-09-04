package com.rosan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BOOT_MARRIAGE_SEEKER_INFO")
public class MarriageSeekerInfo {

	@Id
	@GeneratedValue
	private Integer profileId;
	public Integer getProfileId() {
		return profileId;
	}
	public void setProfileId(Integer profileId) {
		this.profileId = profileId;
	}
	@Override
	public String toString() {
		return "MarriageSeekerInfo [profileId=" + profileId + ", profileName=" + profileName + ", gender=" + gender
				+ ", resumePath=" + resumePath + ", photoPath=" + photoPath + "]";
	}
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
	public String getResumePath() {
		return resumePath;
	}
	public void setResumePath(String resumePath) {
		this.resumePath = resumePath;
	}
	public String getPhotoPath() {
		return photoPath;
	}
	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}
	@Column(length = 20)
	private String profileName;
	@Column(length = 10)
	private String gender;
	@Column(length = 150)
	private String resumePath;
	@Column(length=150)
	private String photoPath;
}
