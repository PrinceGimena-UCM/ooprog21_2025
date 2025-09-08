import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        String nameInput;
        int yesOrNo;

        do {
            nameInput = JOptionPane.showInputDialog(null, "What is your name?");
            yesOrNo = JOptionPane.showConfirmDialog(
                    null,
                    "Do you want to proceed?",
                    "Confirmation",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE
            );
        } while (yesOrNo == JOptionPane.NO_OPTION);

        String outputMessage = "Hello " + nameInput + "!";
        JOptionPane.showMessageDialog(null, outputMessage);
    }
}
