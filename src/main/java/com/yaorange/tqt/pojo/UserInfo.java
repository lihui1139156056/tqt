package com.yaorange.tqt.pojo;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "sys_user_info")
public class UserInfo {
  @Id
  private Integer id;
  private Integer userId;
  private String gender;
  private String email;
  private Date birthdayDate;
  private String phone;
  private String telephone;
  private String sortNumber;
  private String remake;
  private String name;
  private String school;
  private String major;
  private Date fraduationDate;
  private String noteAddress;
  private Integer age;
  private String eduction;
  private Integer salary;
  private Date joinDate;
  private Integer degree;
  private String experience;
  private Date graduationTime;
  private String orderNo;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Date getBirthdayDate() {
    return birthdayDate;
  }

  public void setBirthdayDate(Date birthdayDate) {
    this.birthdayDate = birthdayDate;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public String getSortNumber() {
    return sortNumber;
  }

  public void setSortNumber(String sortNumber) {
    this.sortNumber = sortNumber;
  }

  public String getRemake() {
    return remake;
  }

  public void setRemake(String remake) {
    this.remake = remake;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSchool() {
    return school;
  }

  public void setSchool(String school) {
    this.school = school;
  }

  public String getMajor() {
    return major;
  }

  public void setMajor(String major) {
    this.major = major;
  }

  public Date getFraduationDate() {
    return fraduationDate;
  }

  public void setFraduationDate(Date fraduationDate) {
    this.fraduationDate = fraduationDate;
  }

  public String getNoteAddress() {
    return noteAddress;
  }

  public void setNoteAddress(String noteAddress) {
    this.noteAddress = noteAddress;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getEduction() {
    return eduction;
  }

  public void setEduction(String eduction) {
    this.eduction = eduction;
  }

  public Integer getSalary() {
    return salary;
  }

  public void setSalary(Integer salary) {
    this.salary = salary;
  }

  public Date getJoinDate() {
    return joinDate;
  }

  public void setJoinDate(Date joinDate) {
    this.joinDate = joinDate;
  }

  public Integer getDegree() {
    return degree;
  }

  public void setDegree(Integer degree) {
    this.degree = degree;
  }

  public String getExperience() {
    return experience;
  }

  public void setExperience(String experience) {
    this.experience = experience;
  }

  public Date getGraduationTime() {
    return graduationTime;
  }

  public void setGraduationTime(Date graduationTime) {
    this.graduationTime = graduationTime;
  }

  public String getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }
}
