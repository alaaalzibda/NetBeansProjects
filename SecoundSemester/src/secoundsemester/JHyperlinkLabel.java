
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ibrabelware
 */
class JLabeslLink extends JFrame {

    private JPanel pan;
    private JLabel contact;
    private JLabel website;

    /**
     * Creates new form JLabelLink
     */
    public JLabeslLink() {
        this.setTitle("jLabelLinkExample");
        this.setSize(300, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        pan = new JPanel();
        contact = new JLabel();
        website = new JLabel();

        contact.setText("<html> contact : <a href=\"\">YourEmailAddress@gmail.com</a></html>");
        contact.setCursor(new Cursor(Cursor.HAND_CURSOR));//To let the cursor click on it!x

        website.setText("<html> Website : <a href=\"\">http://www.facebook.com</a></html>");
        //website.setText("<html> Website : <a href=\"\">Click me!</a></html>");//click me 
        website.setCursor(new Cursor(Cursor.HAND_CURSOR));

        pan.add(contact);
        pan.add(website);
        this.setContentPane(pan);
        this.setVisible(true);
        sendMail(contact);
        goWebsite(website);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Create and display the form
         */
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                
                new JLabeslLink().setVisible(true);
            }
        });
    }

    private void goWebsite(JLabel website) {
        website.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("http://www.facebook.com"));
                } catch (URISyntaxException | IOException ex) {
                    //It looks like there's a problem
                }
            }
        });
    }

    private void sendMail(JLabel contact) {
        contact.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().mail(new URI("mailto:YourEmailAddress@gmail.com?subject=TEST"));
                } catch (URISyntaxException | IOException ex) {
                    //It looks like there's a problem
                }
            }
        });
    }
}
