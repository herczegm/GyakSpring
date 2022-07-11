package com.example.elsospring.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Table;

@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Company {

    int id;
    String companyName;
}
