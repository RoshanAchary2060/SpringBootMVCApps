package com.rosan.model;

import lombok.Data;

@Data
public class Customer {
	private Integer cno;
	private String cname;
	private String country = "Nepal";
	private String[] languages = new String[] { "Nepali", "English" };
	private String[] hb = new String[] { "Coding", "Hacking" };
}
