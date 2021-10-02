package condicionales;

import javax.swing.*;

public class Condicionales {
    public static void main(String[] args) {
        int dato;

        dato =Integer.parseInt( JOptionPane.showInputDialog("Dijite un munero entre 1 - 5"));

        switch (dato){
            case 1: JOptionPane.showMessageDialog(null,"Es el numero 1");
                    break;

            case 2: JOptionPane.showMessageDialog(null,"Es el numero 2");
                break;

            case 3: JOptionPane.showMessageDialog(null,"Es el numero 3");
                break;

            case 4: JOptionPane.showMessageDialog(null,"Es el numero 4");
                break;

            case 5: JOptionPane.showMessageDialog(null,"Es el numero 5");
                break;

            default: JOptionPane.showMessageDialog(null, "Numero fuera de rango.");
        }


    }
}
