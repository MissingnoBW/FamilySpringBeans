package app.model;

import lombok.Data;

import java.util.List;

@Data
public class Family {

    private String title;
    private List<Member> memberList;

    public Family(){
        this("Unnamed", null);
    }

    public Family(String title, List<Member> memberList){
        this.title = title;
        this.memberList = memberList;
    }

    public Family(List<Member> memberList){
        this("Unnamed", memberList);
    }

    public Family(String title){
        this(title, null);
    }
}
