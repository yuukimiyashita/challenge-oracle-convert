import javax.swing.JOptionPane;
import javax.swing.plaf.TextUI;

public class App {
    public static void main(String[] args) throws Exception {
        boolean continueOpBool = true;
        while (continueOpBool == true) {

            Object[] options = { "Converter Moeda", "Converter Temperatura" };

            Object selectionObject = JOptionPane.showInputDialog(null, "O Que voce deseja fazer ?", null,
                    JOptionPane.PLAIN_MESSAGE,
                    null, options, options[0]);

            if (selectionObject.equals("Converter Moeda")) {

                Object[] options2 = { "Converter Dolar", "Converter Real", "Converter Chileno" };

                Object selectionObject2 = JOptionPane.showInputDialog(null, "O Que voce deseja fazer ?", null,
                        JOptionPane.PLAIN_MESSAGE,
                        null, options2, options2[0]);

                if (selectionObject2.equals("Converter Dolar")) {
                    float real = 5.22f;
                    float num = Float
                            .parseFloat(JOptionPane.showInputDialog(null, "Quantos dolares voce quer converter? "));
                    num = num * real;

                    JOptionPane.showMessageDialog(null, "Sua convercao: " + num);
                    String continueOp = JOptionPane.showInputDialog(null, "Deseja continuar? s - n");
                    if (continueOp.equals("s")) {
                        continueOpBool = true;
                    } else {
                        continueOpBool = false;
                    }
                } else {
                    if (selectionObject2.equals("Converter Real")) {
                        float dolar = 0.19f;
                        float num = Float
                                .parseFloat(JOptionPane.showInputDialog(null, "Quantos reais voce quer converter? "));
                        num = num * dolar;

                        JOptionPane.showMessageDialog(null, "Sua convercao: " + num);
                        String continueOp = JOptionPane.showInputDialog(null, "Deseja continuar? s - n");
                        if (continueOp.equals("s")) {
                            continueOpBool = true;
                        } else {
                            continueOpBool = false;
                        }
                    } else {
                        float chileno = 0.0063f;
                        float num = Float
                                .parseFloat(JOptionPane.showInputDialog(null,
                                        "Quantos reais voce quer converter para chilenos? "));
                        num = num * chileno;

                        JOptionPane.showMessageDialog(null, "Sua convercao: " + num);
                        String continueOp = JOptionPane.showInputDialog(null, "Deseja continuar? s - n");
                        if (continueOp.equals("s")) {
                            continueOpBool = true;
                        } else {
                            continueOpBool = false;
                        }
                    }

                }

            } else {
                Object[] options3 = { "Converter Fah para Celsius", "Converter Celsius para Fah" };

                Object selectionObject3 = JOptionPane.showInputDialog(null, "O Que voce deseja fazer ?", null,
                        JOptionPane.PLAIN_MESSAGE,
                        null, options3, options3[0]);

                if (selectionObject3.equals("Converter Fah para Celsius")) {
                    Double temp = Double
                            .parseDouble(
                                    JOptionPane.showInputDialog(null, "Quantos Fahreiheit voce deseja converter? "));
                    temp = (temp - 32) / 1.8;
                    JOptionPane.showMessageDialog(null, "Sua convercao : " + temp);
                    String continueOp = JOptionPane.showInputDialog(null, "Deseja continuar? s - n");
                    if (continueOp.equals("s")) {
                        continueOpBool = true;
                    } else {
                        continueOpBool = false;
                    }
                } else {
                    Double temp = Double
                            .parseDouble(JOptionPane.showInputDialog(null, "Quantos Celsius voce deseja converter? "));
                    temp = (temp * 1.8) + 32;
                    JOptionPane.showMessageDialog(null, "Sua convercao : " + temp);
                    String continueOp = JOptionPane.showInputDialog(null, "Deseja continuar? s - n");
                    if (continueOp.equals("s")) {
                        continueOpBool = true;
                    } else {
                        continueOpBool = false;
                    }
                }
            }
        }
    }
}
