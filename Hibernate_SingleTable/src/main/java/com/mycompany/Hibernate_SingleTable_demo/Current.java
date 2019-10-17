package com.mycompany.Hibernate_SingleTable_demo;

import java.util.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@DiscriminatorValue("CurrentAccount")
public class Current extends Account {
	private int interestrate;

	public Current() {
		super();
	}

	public Current(String Name, String adress, String AccountNo, int interestrate) {
		super(Name,adress,AccountNo);
		this.interestrate=interestrate;
	}
}