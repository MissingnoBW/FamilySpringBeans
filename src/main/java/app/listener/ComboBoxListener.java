package app.listener;

import app.view.ComboBoxItem;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxListener implements ActionListener {

    private final JComboBox<ComboBoxItem> comboBox;
    private final JTable table;

    public ComboBoxListener(JComboBox<ComboBoxItem> comboBox, JTable table, JFrame frame){
        this.comboBox = comboBox;
        this.table = table;
        comboBox.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        TableModel model;
        model = ((ComboBoxItem)comboBox.getSelectedItem()).getTableModel();
        table.setModel(model);
    }
}
