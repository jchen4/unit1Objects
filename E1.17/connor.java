import java.net.URL;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class connor
{
    public static void main(String[] args)throws Exception
    {
        URL imageLocation = new URL(
            "http://imgur.com/yKmIesO.gif");
        JOptionPane.showMessageDialog(null, "MIHIR", "Title",
            JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
    }
}