package com.org.jboss.cluster.client.gui;

import javax.swing.*;
import java.awt.event.ActionListener;

public interface MainPresenter {
    JComponent getComponent();

    interface Display {
        JComponent asComponent();

        void setSlsbNode(String result);

        void setSlsbActionListener(ActionListener actionListener);

        void setCreateSfsbActionListener(ActionListener actionListener);

        void setInvokeSfsbActionListener(ActionListener actionListener);

        void setDestroySfsbActionListener(ActionListener actionListener);

        void setSfsbCounterValue(int value);

        void setSfsbNode(String node);

        void toggleBetweenCreatableAndDestroyable();
    }
}
