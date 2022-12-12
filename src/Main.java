import javax.swing.*;

public class Main {
    public static void main(String args[]){
        JFrame frame = new JFrame("Hello world in swing");
        frame.setContentPane(new HelloWorld().contentPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
