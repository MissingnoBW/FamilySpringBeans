package app.model.swing;

import lombok.Getter;

import javax.swing.event.TableModelListener;
import java.util.List;

@Getter
public class TableModel implements javax.swing.table.TableModel {

    private final List<TableItem> itemList;

    public TableModel(List<TableItem> itemList){
        this.itemList = itemList;
    }

    @Override
    public int getRowCount() {
        return itemList.size();
    }

    @Override
    public int getColumnCount() {
        return itemList.isEmpty() ? 0 : itemList.get(0).getPropertiesAmount();
    }

    @Override
    public String getColumnName(int columnIndex) {
        return "";
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return itemList.get(0).getProperty(columnIndex).getClass();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return itemList.get(rowIndex).getProperty(columnIndex);
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        // No implementation
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        // No implementation
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        // No implementation
    }

}
