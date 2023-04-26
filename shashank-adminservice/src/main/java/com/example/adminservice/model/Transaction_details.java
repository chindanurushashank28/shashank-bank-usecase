package com.example.adminservice.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transaction_details")
public class Transaction_details {
	@Id
	String transaction_number;
	String account_number;
	Date date_of_transaction;
	String medium_of_transaction;
	String transaction_type;
	int transaction_amount;
	public Transaction_details() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Transaction_details(String transaction_number, String account_number, Date date_of_transaction,
			String medium_of_transaction, String transaction_type, int transaction_amount) {
		super();
		this.transaction_number = transaction_number;
		this.account_number = account_number;
		this.date_of_transaction = date_of_transaction;
		this.medium_of_transaction = medium_of_transaction;
		this.transaction_type = transaction_type;
		this.transaction_amount = transaction_amount;
	}
	public String getTransaction_number() {
		return transaction_number;
	}
	public void setTransaction_number(String transaction_number) {
		this.transaction_number = transaction_number;
	}
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	public Date getDate_of_transaction() {
		return date_of_transaction;
	}
	public void setDate_of_transaction(Date date_of_transaction) {
		this.date_of_transaction = date_of_transaction;
	}
	public String getMedium_of_transaction() {
		return medium_of_transaction;
	}
	public void setMedium_of_transaction(String medium_of_transaction) {
		this.medium_of_transaction = medium_of_transaction;
	}
	public String getTransaction_type() {
		return transaction_type;
	}
	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}
	public int getTransaction_amount() {
		return transaction_amount;
	}
	public void setTransaction_amount(int transaction_amount) {
		this.transaction_amount = transaction_amount;
	}
	@Override
	public String toString() {
		return "Transaction_details [transaction_number=" + transaction_number + ", account_number=" + account_number
				+ ", date_of_transaction=" + date_of_transaction + ", medium_of_transaction=" + medium_of_transaction
				+ ", transaction_type=" + transaction_type + ", transaction_amount=" + transaction_amount + "]";
	}
	
	

}
