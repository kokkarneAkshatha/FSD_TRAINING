package com.mycompany.Hibernate_table_per_subclas;

import java.util.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@Table(name="Savings")   
@PrimaryKeyJoinColumn(name = "ID")
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