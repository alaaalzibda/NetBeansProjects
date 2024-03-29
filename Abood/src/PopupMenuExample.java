
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.BevelBorder;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

public class PopupMenuExample extends JPanel {

    public JPopupMenu popup;

    public PopupMenuExample() {
        popup = new JPopupMenu();
        ActionListener menuListener = new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.out.println("Popup menu item ["
                        + event.getActionCommand() + "] was pressed.");
            }
        };
        JMenuItem item;
        popup.add(item = new JMenuItem("Left", new ImageIcon("1.gif")));
        item.setHorizontalTextPosition(JMenuItem.RIGHT);
        item.addActionListener(menuListener);
        popup.add(item = new JMenuItem("Center", new ImageIcon("2.gif")));
        item.setHorizontalTextPosition(JMenuItem.RIGHT);
        item.addActionListener(menuListener);
        popup.add(item = new JMenuItem("Right", new ImageIcon("3.gif")));
        item.setHorizontalTextPosition(JMenuItem.RIGHT);
        item.addActionListener(menuListener);
        popup.add(item = new JMenuItem("Full", new ImageIcon("4.gif")));
        item.setHorizontalTextPosition(JMenuItem.RIGHT);
        item.addActionListener(menuListener);
        popup.addSeparator();
        popup.add(item = new JMenuItem("Settings . . ."));
        item.addActionListener(menuListener);

        popup.setLabel("Justification");
        popup.setBorder(new BevelBorder(BevelBorder.RAISED));
        popup.addPopupMenuListener(new PopupPrintListener());

        addMouseListener(new MousePopupListener());
    }

    // An inner class to check whether mouse events are the popup trigger
    class MousePopupListener extends MouseAdapter {

        public void mousePressed(MouseEvent e) {
            checkPopup(e);
        }

        public void mouseClicked(MouseEvent e) {
            checkPopup(e);
        }

        public void mouseReleased(MouseEvent e) {
            checkPopup(e);
        }

        private void checkPopup(MouseEvent e) {
            if (e.isPopupTrigger()) {
                popup.show(PopupMenuExample.this, e.getX(), e.getY());
            }
        }
    }

    // An inner class to show when popup events occur
    class PopupPrintListener implements PopupMenuListener {

        public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
            System.out.println("Popup menu will be visible!");
        }

        public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
            System.out.println("Popup menu will be invisible!");
        }

        public void popupMenuCanceled(PopupMenuEvent e) {
            System.out.println("Popup menu is hidden!");
        }
    }

    public static void main(String s[]) {
        JFrame frame = new JFrame("Popup Menu Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new PopupMenuExample());
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
class JPopupMenuDemo extends JFrame {

    JPopupMenu popup;

    public JPopupMenuDemo() {
        Container c = getContentPane();

        popup = new JPopupMenu();
        // add menu items to popup
        popup.add(new JMenuItem("undo"));
        popup.add(new JMenuItem("redo"));
        popup.addSeparator();
        popup.add(new JMenuItem("cut"));
        popup.add(new JMenuItem("copy"));
        popup.add(new JMenuItem("paste"));

        c.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                showPopup(e);                    // showPopup() is our own user-defined method
            }
        });

        setTitle("PopupMenu by S N Rao");
        setSize(300, 300);
        setVisible(true);
    }

    void showPopup(MouseEvent e) {
        if (e.isPopupTrigger()) {
            popup.show(e.getComponent(), e.getX(), e.getY());
        }
    }

    public static void main(String args[]) {
        new JPopupMenuDemo();
    }
}