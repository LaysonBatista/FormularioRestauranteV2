package FormularioRestauranteV2;


import javax.swing.*;
import java.awt.*;

public class FormularioRestauranteV2 extends RadioButton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here

        //Configurando titulo e tamanho da janela
        JFrame janela = new JFrame("Pedido de Restaurante");
        janela.setBounds(50, 100, 1000, 150);

        //Escolhendo o tamanho e layout
        JPanel miJPanel = new JPanel();
        miJPanel.setSize(200, 400);
        miJPanel.setLayout(new FlowLayout());

        //Informando o que deve ser digitado
        JLabel nomeCliente = new JLabel();
        nomeCliente.setText("Nome do cliente: ");

        JLabel pedido = new JLabel();
        pedido.setText("Digite o pedido: ");
        JLabel numeroDaMesa = new JLabel();

        numeroDaMesa.setText("Informe o numero da mesa: ");

        //Configurando tamanho dos campos de texto
        JTextField campoDeTextoNomeCliente = new JTextField(null, 10);
        JTextField campoDeTextoPedido = new JTextField(null, 10);
        JTextField campoDeTextoNumeroMesa = new JTextField(null, 5);

        //Configurando botão de enviar pedido
        RadioButton radioButtonFrame = new RadioButton();
        radioButtonFrame.setSize(350, 100);
        radioButtonFrame.setVisible(true);


        //Adicionando tudo na janela
        miJPanel.add(nomeCliente);
        miJPanel.add(campoDeTextoNomeCliente);

        miJPanel.add(pedido);
        miJPanel.add(campoDeTextoPedido);

        miJPanel.add(numeroDaMesa);
        miJPanel.add(campoDeTextoNumeroMesa);

        miJPanel.add(radioButtonFrame);

        janela.add(miJPanel);
        janela.setVisible(true);

        FlowLayout flow = new FlowLayout();
        Container caixa = janela.getContentPane();
        caixa.setLayout(flow);
        for(int i=1; i<=1; i++){
            caixa.add(new JButton("Chamar garçom!"));
            janela.setVisible(true);
        }

        janela.setVisible(true);
    }

}






