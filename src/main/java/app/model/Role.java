package app.model;

public enum Role {
    MOTHER("Mother"),
    FATHER("Father"),
    SON("Son"),
    DAUGHTER("Daughter"),
    UNDEFINED("Undefined");

    private final String role;

    Role(String role){
        this.role = role;
    }

    public String toString(){
        return role;
    }
}
