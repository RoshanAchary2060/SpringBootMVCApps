package com.nt.model;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

@Entity
@Table(name = "boot_emp")
@Data
@SQLDelete(sql = "update boot_emp set status='deleted' where empno=?") // soft deletion
@Where(clause = "STATUS <>'deleted'") // global implicit condition
public class Employee {
	@Id
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "gen1", sequenceName = "emp_no_seq1", initialValue = 3000, allocationSize = 1)
	private Integer empno;
	@Column(length = 20)
	private String ename;
	@Column(length = 20)
	private String job;
	private Float sal;
	private Integer deptno;
	private String status = "active"; // default value to be inserted
	@Transient
	private String vflag = "no";
}
