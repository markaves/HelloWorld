package com.orangeandbronze.enlistment;

import java.util.*;

public class CollegeStudent extends Student {	
	private static final int MAX_SECTIONS = 5;

    public CollegeStudent(Integer studentNumber, String firstname, String lastname) {
      super(studentNumber, firstname, lastname, MAX_SECTIONS);
    }
    
    public CollegeStudent(Integer studentNumber, String firstname, String lastname, Collection<Section> enlistedSections) {
      super(studentNumber, firstname, lastname, enlistedSections, MAX_SECTIONS);
    }
    
	@Override
	public void enlist(Section newSection) {	  	  
	  if (!newSection.getSubject().getType().equals(Subject.Type.COLLEGE)) {
		  throw new InvalidSubjectException("College Student can only enlist in COLLEGE sections, the type of the new section was : " + newSection.getSubject().getType());
	  }
	  super.enlist(newSection);
	}
}
