package app.model.swing.factory;

import app.model.swing.TableItem;
import app.model.swing.TableModel;

import java.util.List;

public class TableModelFactory {

    public TableModel create(List<TableItem> itemList){
        return new TableModel(itemList);
    }
}
