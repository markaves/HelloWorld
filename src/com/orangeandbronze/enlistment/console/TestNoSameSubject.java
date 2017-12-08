package com.orangeandbronze.enlistment.console;

import com.orangeandbronze.enlistment.*;

public class TestNoSameSubject {
  public static void main(String[] args) {
    Student sherlock = new CollegeStudent(123, "Sherlock", "Holmes");
    Section math1 = new Section("ABC999", Subject.MATH);
    Section his1 = new Section("GHI777", Subject.HISTORY);
    Section his2 = new Section("JKL123", Subject.HISTORY);
    Section eng1 = new Section("MNO555", Subject.ENGLISH);
    Section fr1 = new Section("MNO111", Subject.FRENCH);
    Section sc1 = new Section("MNO222", Subject.SCIENCE);
    Section art = new Section("MNO333", Subject.ART);
    Section r = new Section("MNO444", Subject.REDHORSE);
    
    System.out.println(sherlock);
    System.out.println(math1);
    System.out.println(eng1);
    System.out.println(his1);    
    System.out.println(fr1);
    System.out.println(his2);
    System.out.println(sc1);
    System.out.println(art);
    System.out.println(r);
    
    sherlock.enlist(math1);    
    sherlock.enlist(eng1);        
    sherlock.enlist(his1);
    //sherlock.enlist(fr1);       // Should throw InvalidSubjectException exception here.
    //sherlock.enlist(his2);      // Should throw SameSubjectException exception here.
    sherlock.enlist(sc1);
    sherlock.enlist(art);
    sherlock.enlist(r);           // Should throw ExceedsMaximumSectionsException exception here.
    
  }
}
