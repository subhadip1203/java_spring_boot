package com.subhadip.spring_part_1.harddrive;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")

public class SSD {
  private int storage;
  private String company;

  public SSD() {
    super();
    System.out.println("constrructor running ...");
  }

  public SSD(int storage, String company) {
    this.storage = storage;
    this.company = company;
  }


  public int getStorage() {
    return this.storage;
  }

  public void setStorage(int storage) {
    this.storage = storage;
  }

  public String getCompany() {
    return this.company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  @Override
  public String toString() {
    return "{" +
      " storage='" + getStorage() + "'" +
      ", company='" + getCompany() + "'" +
      "}";
  }


}
