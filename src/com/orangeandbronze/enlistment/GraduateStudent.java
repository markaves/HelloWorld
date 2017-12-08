package com.orangeandbronze.enlistment;

import java.util.*;

public class GraduateStudent extends Student {
	private static final int MAX_SECTIONS = 4;

    public GraduateStudent(Integer studentNumber, String firstname, String lastname){
        super(studentNumber, firstname, lastname, MAX_SECTIONS);
    }

    public GraduateStudent(Integer studentNumber, String firstname, String lastname, Collection<Section> enlistedSections){
        super(studentNumber, firstname, lastname, enlistedSections, MAX_SECTIONS);
    }
}