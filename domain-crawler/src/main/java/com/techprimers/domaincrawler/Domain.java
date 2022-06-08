package com.techprimers.domaincrawler;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class Domain implements Serializable  {

  String domain;
  String create_date;
  String update_date;
  String country;
  boolean isDead;
  String A;
  String NS;
  String CNAME;
  String MX;
  String TXT;

  }