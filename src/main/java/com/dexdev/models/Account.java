/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dexdev.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.Data;

/**
 *
 * @author Moieen
 */

@Entity
@Data

public class Account extends CommonEntity implements Serializable{

private String title;
@OneToOne
private Customer customer;

@ManyToOne
private Account account;

@OneToMany(mappedBy = "account")
private List<TransactionDetail> transactionDetails;
    
}
