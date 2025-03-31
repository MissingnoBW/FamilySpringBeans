package app.model.swing;

import app.model.Member;
import lombok.Getter;

@Getter
public final class MemberTableItem implements TableItem {

    private final Member member;

    public MemberTableItem(Member member){
        this.member = member;
    }

    @Override
    public Object getProperty(int index){
        switch (index){
            case 0:
                return member.getName();
            case 1:
                return member.getGender();
            case 2:
                return member.getAge();
            case 3:
                return member.getRole();
            default:
                return null;
        }
    }

    public int getPropertiesAmount(){
        return 4;
    }

}
