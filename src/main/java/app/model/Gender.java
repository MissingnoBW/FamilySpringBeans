package app.model;

public enum Gender {
    MALE("Male"),
    FEMALE("Female"),
    UNDEFINED("Undefined");

    private final String gender;

    Gender(String gender){
        this.gender = gender;
    }

    public String toString(){
        return gender;
    }
}
