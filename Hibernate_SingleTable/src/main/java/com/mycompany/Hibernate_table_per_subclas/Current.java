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
@Table(name="Current")   
@PrimaryKeyJoinColumn(name = "ID")
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