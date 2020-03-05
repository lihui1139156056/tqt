package com.yaorange.tqt.pojo;


import lombok.Data;

import javax.persistence.Table;
//测试类
@Data
@Table(name = "student")
public class Student {

  private String sId;
  private String sName;
  private String sBirth;
  private String sSex;

  public String getSId() {
    return sId;
  }

  public void setSId(String sId) {
    this.sId = sId;
  }


  public String getSName() {
    return sName;
  }

  public void setSName(String sName) {
    this.sName = sName;
  }


  public String getSBirth() {
    return sBirth;
  }

  public void setSBirth(String sBirth) {
    this.sBirth = sBirth;
  }


  public String getSSex() {
    return sSex;
  }

  public void setSSex(String sSex) {
    this.sSex = sSex;
  }

}
