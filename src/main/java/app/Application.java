package app;

import app.view.ComboBoxItem;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");

        JFrame mainFrame = (JFrame) context.getBean("mainFrame");

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setResizable(false);
        mainFrame.setVisible(true);


        List<ComboBoxItem> comboBoxItemList = (List<ComboBoxItem>) context.getBean("familyItemList");
        JComboBox<ComboBoxItem> comboBox = (JComboBox<ComboBoxItem>) context.getBean("comboBox");

        for (ComboBoxItem item : comboBoxItemList){
            comboBox.addItem(item);
        }
        comboBox.updateUI();

        mainFrame.pack();
    }
}
