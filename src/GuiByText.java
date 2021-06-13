import javax.swing.*;

public class GuiByText extends JFrame {
    GuiByText(){
        setSize(640, 480);
        setLocationRelativeTo(null);
        setTitle("Gui By Text:Pertemuan 4");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        GuiByText guiByText = new GuiByText();
        guiByText.setVisible(true);
    }
}
