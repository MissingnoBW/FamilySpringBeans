package app.model.swing.factory;

import app.model.Family;
import app.model.swing.FamilyComboBoxItem;

import javax.swing.table.TableModel;

public class FamilyComboBoxItemFactory {

    public FamilyComboBoxItem create(Family family, TableModel tableModel){
        return new FamilyComboBoxItem(family, tableModel);
    }
}
