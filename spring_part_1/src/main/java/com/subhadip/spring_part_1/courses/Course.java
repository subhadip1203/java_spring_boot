package com.subhadip.spring_part_1.courses;

public class Course {
  private int id;
  private String name;
  private String authour;

  public Course() {
  }

  public Course(int id, String name, String authour) {
    this.id = id;
    this.name = name;
    this.authour = authour;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAuthour() {
    return this.authour;
  }

  public void setAuthour(String authour) {
    this.authour = authour;
  }
}
