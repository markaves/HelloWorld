package com.orangeandbronze.enlistment;

import java.util.*;

public abstract class Student {
  private final Integer studentNumber;
  private String firstname;
  private String lastname;
  private final Set<Section> sections = new HashSet<>();
  private final int maxSections;
  
  
  public Student(Integer studentNumber, String firstname, String lastname, int maxSections){
	  this.studentNumber = studentNumber;
	  this.firstname = firstname;
	  this.lastname = lastname;
	  this.maxSections = maxSections;
  }
  
  public Student(Integer studentNumber, String firstname, String lastname, Collection<Section> enlistedSections, int maxSections){
	this(studentNumber,firstname,lastname,maxSections);    
    this.sections.addAll(enlistedSections);
  }
  
  public void enlist(Section newSection) {
    if (sections.size() >= maxSections) {
	  throw new ExceedsMaximumSectionsException("Student already at maximum number of sections: " + sections.size());
	}
    for (Section currentSection : sections) {
    	currentSection.checkForConflict(newSection);
    }    
   	sections.add(newSection);
   }
   
  
  public Integer getStudentNumber() {
   return studentNumber;
  }	

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }
  
  public String getLastname() {
    return lastname;
  }
  
  public void setLastname(String lastname) {
    this.lastname = lastname;
  }
  
  public Collection<Section> getSections() {
    return new ArrayList<>(sections);     // defensive copy
  }
  
  @Override
  public String toString() {
      return "Student# " + studentNumber + ' ' + firstname + ' ' + lastname;
  }

  @Override
  public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((studentNumber == null) ? 0 : studentNumber.hashCode());
	return result;
  }

  @Override
  public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	if (studentNumber == null) {
		if (other.studentNumber != null)
			return false;
	} else if (!studentNumber.equals(other.studentNumber))
		return false;
	return true;
  }
}
