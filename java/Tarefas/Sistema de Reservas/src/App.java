import java.util.List;
import java.util.ArrayList;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class App extends JFrame implements ActionListener {

    static List <Cliente> clientes = new ArrayList<>();

    static App app;
    JFrame welcome = new JFrame();
    JFrame registerFrame, clientsFrame, waitlistFrame;
    JLabel l1, l2, l3, l4, l5,l6, l7; 
    JTextField entry;
    JRadioButton checkbox1, checkbox2;
    JTextField nameTextField, cnpjJTextField, cpfJTextField;

    public App () {
        
        welcome.setSize(450,500);  
        welcome.setTitle("Faça sua reserva!");  

        // initializing the labels   
        l1 = new JLabel ("1 - Reservar Mesa");   
        l2 = new JLabel ("2 - Pesquisar reserva"); 
        l3 = new JLabel ("3 - Imprimir Reservas"); 
        l4 = new JLabel ("4 - Imprimir lista de espera"); 
        l5 = new JLabel ("5 - Cancelar reserva"); 
        l6 = new JLabel ("6 - Finalizar"); 
      
        // set the location of label 
        int labelLocation = 30; 
        l1.setBounds(100, labelLocation, 200, 30);    
        labelLocation += 50;
        l2.setBounds(100, labelLocation, 200, 30);  
        labelLocation += 50;
        l3.setBounds(100, labelLocation, 200, 30);  
        labelLocation += 50;
        l4.setBounds(100, labelLocation, 200, 30);  
        labelLocation += 50;
        l5.setBounds(100, labelLocation, 200, 30);  
        labelLocation += 50;
        l6.setBounds(100, labelLocation, 200, 30);  
        labelLocation += 50;

        welcome.add(l1);
        welcome.add(l2);
        welcome.add(l3);
        welcome.add(l4);
        welcome.add(l5);
        welcome.add(l6);

        entry = new JTextField();
        entry.setBounds(100, 330, 200, 30);
        entry.addActionListener(this);
        welcome.add(entry);

        JButton buttom=new JButton("Enviar");  
        buttom.setBounds(100, 370,90,30);
        buttom.addActionListener(this);
        welcome.add(buttom);
        
        JButton buttomOut=new JButton("Sair");  
        buttomOut.setBounds(210,370,80,30);
        buttomOut.addActionListener(this);
        welcome.add(buttomOut);

        welcome.setLayout(null);   
        welcome.setVisible(true);  
     }  
     
    public void novoClienteDialog(){
        
        registerFrame = new JFrame();
        registerFrame.setSize(450, 500);
        registerFrame.setTitle("Faça um cadastro!"); 

        JLabel nameLabel = new JLabel("Insira seu nome: ");
        nameLabel.setBounds(50, 30, 170, 30);
        registerFrame.add(nameLabel);

        JTextField nameTextField = new JTextField();
        nameTextField.setBounds(180, 30, 200, 30);
        registerFrame.add(nameTextField);

        // ----------------

       // creating the checkboxes  
        ButtonGroup bg = new ButtonGroup(); 

        checkbox1 = new JRadioButton("Pessoa Fisica", false);    
        checkbox1.setBounds(50, 80, 120, 30);    
        checkbox2 = new JRadioButton("Pessoa Juridica", false);    
        checkbox2.setBounds(200, 80, 120, 30);    
        // setting location of checkbox in frame          
        // adding checkboxes to frame  
        registerFrame.add(checkbox1);    
        bg.add(checkbox1);
        registerFrame.add(checkbox2);    
        bg.add(checkbox2);

        checkbox1.addActionListener(this);
        checkbox2.addActionListener(this);
        
        // buttom ---------
        JButton registerButton = new JButton("Cadastrar");
        registerButton.setBounds(130, 200, 140, 30);
        registerFrame.add(registerButton);
        registerButton.addActionListener(this);
        
        registerFrame.setLayout(null);
        registerFrame.setVisible(true);
    }  
     
    public void mostrarClientesDialog(){
        clientsFrame = new JFrame();
        clientsFrame.setSize(450, 500);
        clientsFrame.setTitle("Lista de Clientes"); 

        int clientFramePosition = 30;

        JLabel nameLabel[] = new JLabel[clientes.size()];

        int tamaho = (clientes.size() >= 6) ? 6 : clientes.size();

        for(int i =0 ; i<tamaho; i++){
            nameLabel[i] = new JLabel( clientes.get(i).toString() );
            nameLabel[i].setBounds(50, clientFramePosition + 50*i, 170, 30);
            clientsFrame.add(nameLabel[i]);
            clientsFrame.add( new JSeparator() );
        }

        clientFramePosition += tamaho*50;

        // buttom ---------
        JButton clientsFrameToMenButton = new JButton("Retornar ao menu");
        clientsFrameToMenButton.setBounds(130, clientFramePosition, 140, 30);
        clientsFrame.add(clientsFrameToMenButton);
        clientsFrameToMenButton.addActionListener(this);

        clientsFrame.setLayout(null);
        clientsFrame.setVisible(true);
    }   

     public static void main(String[] args) throws Exception { 
        
        app = new App();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Integer option;
        System.out.println(e.getActionCommand());

        try {
            option = Integer.parseInt(entry.getText());
        }catch(NumberFormatException nfex){
            System.out.println(nfex.getMessage());
            return;
        }

        if( e.getActionCommand() == "Sair" ||  option == 6){
            System.exit(0);
        } else if ( e.getActionCommand() == "Enviar" ){

            switch (option) {
                case 1:
                    welcome.setVisible(false);
                    novoClienteDialog();
                    break;
                case 2:
                    System.out.println("Search");
                    break;
                case 3:
                    welcome.setVisible(false);
                    mostrarClientesDialog();
                    break;
                // case 4:

                //     break;
                // case 5:

                //     break;
            }

        } else if(e.getActionCommand().equals("Cadastrar")){
            
            if(checkbox1.isEnabled() && nameTextField.getText() != null){
                clientes.add( new PessoaFisica(nameTextField.getText(), cpfJTextField.getText()) );
                registerFrame.setVisible(false);
                welcome.setVisible(true);    
            } else if(checkbox2.isEnabled() && nameTextField.getText() != null){
                clientes.add( new PessoaJuridica(nameTextField.getText(), cnpjJTextField.getText()) );
                registerFrame.setVisible(false);
                welcome.setVisible(true);  
            }

        } else if(e.getActionCommand().equals("Pessoa Fisica")){
                       
            registerFrame.setVisible(false);
            checkbox1.setEnabled(true);
            JLabel cpfJLabel = new JLabel("Insira seu CPF: ");
            cpfJLabel.setBounds(50, 130, 170, 30);
            registerFrame.add(cpfJLabel);

            cpfJTextField = new JTextField();
            cpfJTextField.setBounds(180, 130, 200, 30);
            registerFrame.add(cpfJTextField);
            registerFrame.setVisible(true);
            
        } else if(e.getActionCommand() == "Pessoa Juridica"){

            registerFrame.setVisible(false);
            checkbox2.setEnabled(true);
            JLabel cnpJLabel = new JLabel("Insira seu CNPJ: ");
            cnpJLabel.setBounds(50, 130, 170, 30);
            registerFrame.add(cnpJLabel);

            cnpjJTextField = new JTextField();
            cnpjJTextField.setBounds(180, 130, 200, 30);
            registerFrame.add(cnpjJTextField);
            registerFrame.setVisible(true);
            
        } else if ( e.getActionCommand() == "Retornar ao menu" ){
            
        }
        
    }
}
