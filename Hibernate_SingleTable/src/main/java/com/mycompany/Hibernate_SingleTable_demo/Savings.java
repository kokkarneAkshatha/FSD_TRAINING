package com.mycompany.Hibernate_SingleTable_demo;

import java.util.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@DiscriminatorValue("Savings Account")
public class Savings extends Account {
	private int Balance;
	private String AccountType;

	public Savings() {
	}

	public Savings(String Name, String adress, String AccountNo,  int Balance, String AccountType) {
		super(Name,adress,AccountNo);
		this.Balance=Balance;
		this.AccountType=AccountType;
	}
}