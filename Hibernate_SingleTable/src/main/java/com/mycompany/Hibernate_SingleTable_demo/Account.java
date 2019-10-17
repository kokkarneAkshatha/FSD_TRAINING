package com.mycompany.Hibernate_SingleTable_demo;

import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Data;
@Entity
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Account_detail")
@DiscriminatorValue("Account")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Name;
	private String adress;
	private String AccountNo;
	

	public Account() {
	}

	public Account(String Name, String adress, String AccountNo) {
		this.Name=Name;
		this.adress=adress;
		this.AccountNo=AccountNo;
}
}
