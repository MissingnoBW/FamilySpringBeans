package app.model;

import lombok.Data;

@Data
public class Member {

    private String name;
    private Gender gender;
    private int age;
    private Role role;

    public Member(){
        this("Unnamed", Gender.UNDEFINED, 0, Role.UNDEFINED);
    }

    public Member(String name, Gender gender, int age, Role role){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.role = role;
    }
}
