package interfaceGrafica;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Error {
    public Error() {

    }
    public void showSignInError(JFrame frame) {
        JOptionPane.showMessageDialog(frame, "Email ou senha incorretos.", "Sign-in Error", JOptionPane.WARNING_MESSAGE);
    }

    public void showEmailSignUpError(JFrame frame) {
        JOptionPane.showMessageDialog(frame, "O Email que você digitou não obedece as normas solicitadas", "Email Error", JOptionPane.WARNING_MESSAGE);
    }

    public void showPasswordSignUpError(JFrame frame) {
        JOptionPane.showMessageDialog(frame, "A senha que você digitou não obedece as normas solicitadas", "Password Error", JOptionPane.WARNING_MESSAGE);
    }
    public void AccountRegistered(JFrame frame) {
        JOptionPane.showMessageDialog(frame, "account successfully registered");
    }
}
