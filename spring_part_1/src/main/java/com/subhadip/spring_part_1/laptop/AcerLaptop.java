package com.subhadip.spring_part_1.laptop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.subhadip.spring_part_1.harddrive.SSD;

@Component
public class AcerLaptop {
  private String modelName = "Acer";

  @Autowired
  private SSD ssd;

  public AcerLaptop() {
    System.out.println("acer lapy ....");
  }

  public String getModelName() {
    return this.modelName;
  }

  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  public SSD getSsd() {
    return this.ssd;
  }

  public void setSsd(SSD ssd) {
    this.ssd = ssd;
  }

  public void printSSD() {
    System.out.println(ssd.getCompany()+" "+ssd.getStorage());
  }

}
