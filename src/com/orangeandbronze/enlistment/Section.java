package com.orangeandbronze.enlistment;

public class Section {
  private final String sectionId;
  private final Subject subject;
  
  public Section(String sectionId, Subject subject) {
    this.sectionId = sectionId;
    
    if (subject == null) {
    	throw new NullPointerException("Subject may not be null");
    }
    this.subject = subject;
  }
  
  public String getSectionId() {
    return sectionId;
  }

  public Subject getSubject() {
    return subject;
  }
  
  void checkForConflict(Section otherSection) {
    if(this.subject.equals(otherSection.getSubject())) {
    	throw new SameSubjectException("Conflict between this section: " + this + " and other section: " + otherSection);
    }
  }
  
  @Override
  public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((sectionId == null) ? 0 : sectionId.hashCode());
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
	Section other = (Section) obj;
	if (sectionId == null) {
		if (other.sectionId != null)
			return false;
	} else if (!sectionId.equals(other.sectionId))
		return false;
	return true;
  }

  @Override
  public String toString() {
      return sectionId + ' ' + subject;
  }
}
