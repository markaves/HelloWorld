package com.orangeandbronze.enlistment;

import static com.orangeandbronze.enlistment.Subject.Type.*;

public enum Subject {
    ENGLISH(COLLEGE), MATH(COLLEGE), HISTORY(COLLEGE), 
    SCIENCE(COLLEGE), ART(COLLEGE), PE(GRADUATE), FILIPINO(GRADUATE), 
    CHINESE(GRADUATE), FRENCH(GRADUATE), REDHORSE(COLLEGE);
	
    enum Type {GRADUATE, COLLEGE};
    private final Type type;
    
    private Subject(Type type) {
        this.type = type;
    }
    public Type getType() {
        return type;
    }
}