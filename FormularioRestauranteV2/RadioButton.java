package FormularioRestauranteV2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class RadioButton extends JRadioButton {

    //Declarando os botões "Sim" e "Não"
    private final JRadioButton Sim, Nao;
    private RadioButtonHandler handler;

    //Método para tornar os botões JRadioButton funcional (Usando o "RadioButtonHandler")
    public RadioButton() {
        setLayout(new FlowLayout());
        handler = new RadioButtonHandler();

        JLabel myLabel = new JLabel("Enviar pedido?");
        Sim = new JRadioButton("Sim", false);
        Nao = new JRadioButton("Não", false);

        add(myLabel);
        add(Sim);
        add(Nao);

        Sim.addItemListener(handler);
        Nao.addItemListener(handler);
    }

    //Determinado o comportamento do JRadioButton usando o "ItemListener" e "ItemEvente"
    //Usando "JOptionPane" para exibir a mensagem de resultado do click
    private class RadioButtonHandler implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent event) {
            if (Sim.isSelected()) {
                JOptionPane.showMessageDialog(null, "Pedido enviado com sucesso!");
            } else if (Nao.isSelected()) {
                JOptionPane.showMessageDialog(null, "Pedido cancelado.");
            }
        }

    }

}
