package com.techprimers.domaincrawler;

import lombok.Data;

import java.util.List;
import java.util.Objects;

@Data
public class DomainList {

  List<Domain> domains;
}
