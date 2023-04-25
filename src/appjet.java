package org.fifly.appjet;

import javax.swing.*;

class Jet extends JFrame{
    public Jet(String title) {
        super(title);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void show() {
        this.setVisible(true);
    }
}

class DefaultHandle {
    public DefaultHandle() {
        Jet jet = new Jet("An Appjet app - Appjet Version 1.0.0");
        jet.show();
    }
}