import javax.swing.JOptionPane;

public class CalcIMC {
    public static void main(String[] args) {
        String peso = JOptionPane.showInputDialog("Insira o peso");
        String altura = JOptionPane.showInputDialog("Insira a altura");

        float number1 = Float.parseFloat(peso);
        float number2 = Float.parseFloat(altura);

        float calc = (float) (number1 / (Math.pow(number2, 2)));

        JOptionPane.showMessageDialog(null, String.format("IMC: %.2f", calc), "Cálculo IMC", JOptionPane.PLAIN_MESSAGE);
    }
}