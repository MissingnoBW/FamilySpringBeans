package app.view.panel;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class BoxLayoutPanel extends JPanel {

    public BoxLayoutPanel(int axis, List<Component> componentList){
        setLayout(new BoxLayout(this, axis));

        for (Component component : componentList){
            add(component);
        }
    }
}
