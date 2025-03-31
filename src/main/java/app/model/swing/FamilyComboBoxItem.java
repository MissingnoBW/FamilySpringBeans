package app.model.swing;

import app.model.Family;
import app.view.ComboBoxItem;
import lombok.Getter;
import javax.swing.table.TableModel;

@Getter
public final class FamilyComboBoxItem implements ComboBoxItem {

    private final Family family;
    private final TableModel tableModel;

    public FamilyComboBoxItem(Family family, TableModel tableModel){
        this.family = family;
        this.tableModel = tableModel;
    }

    public String toString(){
        return family.getTitle();
    }
}
