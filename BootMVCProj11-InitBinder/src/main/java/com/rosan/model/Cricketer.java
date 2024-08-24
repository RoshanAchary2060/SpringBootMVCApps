package com.rosan.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Cricketer_info")
@Data
public class Cricketer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cid;
	@Column(length = 20)
	private String name;
	@Column(length = 20)
	private String type;
	private Date dob;
	private Date doj = new Date(110, 9, 20);

}
