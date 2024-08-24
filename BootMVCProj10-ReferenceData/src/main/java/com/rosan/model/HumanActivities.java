package com.rosan.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Human_Activities")
public class HumanActivities {
	@Id
	private String hobbies;
}
