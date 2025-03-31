package app.model.swing.factory;

import app.model.Member;
import app.model.swing.MemberTableItem;

public class MemberTableItemFactory {

    public MemberTableItem create(Member member){
        return new MemberTableItem(member);
    }
}
