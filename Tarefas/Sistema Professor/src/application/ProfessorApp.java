package application;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JTextField;

import entities.ArrayProfessor;
import entities.Professor;

public class ProfessorApp extends JFrame implements ActionListener {
  
  public static ArrayProfessor professores;

  public JFrame optionsFrame, registroFrame, buscaFrame, removeFrame, apresentaFrame;
  public JLabel mainLabel;
  public JTextField nomeTextField, cpfJTextField, aulasSemanaisTextField, horaAulaTextField, buscarCpfTextField, removeCpfTextField;
  public JButton registroButton, buscaButton, removeButton, apresentaButton, registraButton, buscarButton, continuarButton, removerButton;
  JScrollBar scroll = new JScrollBar();

  public ProfessorApp(){

    // capacidade da lista
    professores = new ArrayProfessor(5);

    optionsFrame = new JFrame("Super Professor App");
    optionsFrame.setSize(480, 460);
    
    mainLabel = new JLabel("Menu Principal");
    mainLabel.setBounds(130, 45, 260, 30);
    mainLabel.setFont(new Font("Verdana", Font.BOLD, 22));

    optionsFrame.add(mainLabel);

    registroButton = new JButton("Cadastrar novo professor!");
    registroButton.setBounds(100, 100 + 20, 240, 40);
    registroButton.setFont(new Font("Verdana", Font.BOLD , 14));
    registroButton.addActionListener(this);
    optionsFrame.add(registroButton);

    buscaButton = new JButton("Buscar professor no App!");
    buscaButton.setBounds(100, 160 + 20, 240, 40);
    buscaButton.setFont(new Font("Verdana", Font.BOLD , 14));
    buscaButton.addActionListener(this);
    optionsFrame.add(buscaButton);
    
    removeButton = new JButton("Remover professor!");
    removeButton.setBounds(100, 220 + 20, 240, 40);
    removeButton.setFont(new Font("Verdana", Font.BOLD , 14));
    removeButton.addActionListener(this);
    optionsFrame.add(removeButton);
    
    apresentaButton = new JButton("Apresentar professores!");
    apresentaButton.setBounds(100, 280 + 20, 240, 40);
    apresentaButton.setFont(new Font("Verdana", Font.BOLD , 14));
    apresentaButton.addActionListener(this);
    optionsFrame.add(apresentaButton);

    optionsFrame.setLayout(null);
    optionsFrame.setVisible(true);

  }

  public void option1(){
    optionsFrame.setVisible(false);
    registroFrame = new JFrame("Painel de registro");
    registroFrame.setSize(480, 460);

    JLabel label = new JLabel("Nome: ")	;
    label.setBounds(100, 40, 80, 40);
		registroFrame.add(label);
    nomeTextField = new JTextField();
    nomeTextField.setBounds(160, 40, 210, 40);
    registroFrame.add(nomeTextField);

    label = new JLabel("CPF: ")	;
    label.setBounds(100, 100, 80, 40);
		registroFrame.add(label);
    cpfJTextField = new JTextField();
    cpfJTextField.setBounds(160, 100 , 210, 40);
    registroFrame.add(cpfJTextField);

    label = new JLabel("Nº de aulas:")	;
    label.setBounds(100, 160, 120, 40);
		registroFrame.add(label);
    aulasSemanaisTextField = new JTextField();
    aulasSemanaisTextField.setBounds(190, 160, 180, 40);
    registroFrame.add(aulasSemanaisTextField);

    label = new JLabel("Hora/aula: ")	;
    label.setBounds(100, 210 + 10, 80, 40);
		registroFrame.add(label);
    horaAulaTextField = new JTextField();
    horaAulaTextField.setBounds(160, 210 + 10, 210, 40);
    registroFrame.add(horaAulaTextField);

    registraButton = new JButton("Registrar");
    registraButton.setBounds(120, 300, 220, 40);
    registraButton.setFont(new Font("Verdana", Font.BOLD , 16));
    registraButton.addActionListener(this);
    registroFrame.add(registraButton);

    registroFrame.setLayout(null);
    registroFrame.setVisible(true);
  }

  public void option2(){
    optionsFrame.setVisible(false);
    buscaFrame = new JFrame("Buscador de professores");
    buscaFrame.setSize(480, 460);

    JLabel label = new JLabel("CPF: ")	;
    label.setBounds(100, 40, 80, 40);
		buscaFrame.add(label);
    buscarCpfTextField = new JTextField();
    buscarCpfTextField.setBounds(160, 40, 210, 40);
    buscaFrame.add(buscarCpfTextField);

    buscarButton = new JButton("Buscar");
    buscarButton.setBounds(130, 100, 200, 40);
    buscarButton.setFont(new Font("Verdana", Font.BOLD , 16));
    buscarButton.addActionListener(this);
    buscaFrame.add(buscarButton);

    buscaFrame.setLayout(null);
    buscaFrame.setVisible(true);
  }

  public void option3(){
    optionsFrame.setVisible(false);
    removeFrame = new JFrame("Removedor de professores");
    removeFrame.setSize(480, 460);

    JLabel label = new JLabel("CPF: ")	;
    label.setBounds(100, 40, 80, 40);
		removeFrame.add(label);
    removeCpfTextField = new JTextField();
    removeCpfTextField.setBounds(160, 40, 210, 40);
    removeFrame.add(removeCpfTextField);

    removerButton = new JButton("Remover");
    removerButton.setBounds(130, 100, 200, 40);
    removerButton.setFont(new Font("Verdana", Font.BOLD , 16));
    removerButton.addActionListener(this);
    removeFrame.add(removerButton);

    removeFrame.setLayout(null);
    removeFrame.setVisible(true);
  }

  public void option4(){
    optionsFrame.setVisible(false);
    apresentaFrame = new JFrame("Apresentador de professores");
    apresentaFrame.setSize(480, 460);

    scroll = new JScrollBar(JScrollBar.VERTICAL);
    scroll.setBounds(440, 70, 20, 390);
    int pos = 80;
    int cont = 0;

    for(Professor prof : professores.getProfessores()){

      if(prof == null) continue;

      JLabel label1 = new JLabel();
      JLabel label2 = new JLabel();
      JLabel label3 = new JLabel();
      JLabel label4 = new JLabel();

      label1.setText("Nome: " + prof.getNome());
      label1.setBounds(100, pos, 280, 30);
      label1.setFont(new Font("Verdana", Font.BOLD , 14));
      apresentaFrame.add(label1);
      
      label3.setText("CPF: " + prof.getCpf());
      label3.setBounds(100, pos + 30, 280, 30);
      label3.setFont(new Font("Verdana", Font.BOLD , 14));
      apresentaFrame.add(label3);
      
      label2.setText("Aulas: " + prof.getAulasSemanais() + " | Hora/Aula: R$" + prof.getHoraAula());
      label2.setBounds(100, pos + 60, 280, 30);
      label2.setFont(new Font("Verdana", Font.BOLD , 14));
      apresentaFrame.add(label2);      

      label4.setText("Salario = " + prof.getSalario());
      label4.setBounds(100, pos + 90, 280, 30);
      label4.setFont(new Font("Verdana", Font.BOLD , 14));
      apresentaFrame.add(label4);  
      
      pos += 120;
      cont++;
    }

    scroll.setValue(cont*120 + 80);


    apresentaFrame.add(scroll);

    apresentaFrame.setLayout(null);
    apresentaFrame.setVisible(true);

  }

  public void option2_2(){
    buscaFrame.setVisible(false);
    
    continuarButton = new JButton("Retornar ao Menu");
    continuarButton.setBounds(130, 310, 200, 40);
    continuarButton.setFont(new Font("Verdana", Font.BOLD , 16));
    continuarButton.addActionListener(this);
    buscaFrame.add(continuarButton);

    buscaFrame.setVisible(true);
  }

  public void option3_2(){
    removeFrame.setVisible(false);
    
    continuarButton = new JButton("Retornar ao Menu");
    continuarButton.setBounds(130, 310, 200, 40);
    continuarButton.setFont(new Font("Verdana", Font.BOLD , 16));
    continuarButton.addActionListener(this);
    removeFrame.add(continuarButton);

    removeFrame.setVisible(true);
  }

  public static void main(String[] args) {

    ProfessorApp app = new ProfessorApp();

  }

  @Override
  public void actionPerformed(ActionEvent e) {
    
    System.out.println(e.getActionCommand());
   
    if(e.getActionCommand().equals("Cadastrar novo professor!") ){
      option1();
    } else if(e.getActionCommand().equals("Buscar professor no App!")) {
      option2();
    } else if(e.getActionCommand().equals("Remover professor!") ){
      option3();
    } else if(e.getActionCommand().equals("Apresentar professores!") ){      
      option4();
    } else if(e.getActionCommand().equals("Registrar")){
      
      String nome = nomeTextField.getText();
      String cpf = cpfJTextField.getText();
      int aulasSemanais = Integer.parseInt(aulasSemanaisTextField.getText());
      double horaAula = Double.parseDouble(horaAulaTextField.getText());

      professores.adiciona(new Professor(nome, cpf, aulasSemanais, horaAula));

      registroFrame.setVisible(false);
      optionsFrame.setVisible(true);
    } else if(e.getActionCommand().equals("Buscar")){

      String cpf = buscarCpfTextField.getText();
      Professor retorno = professores.busca(cpf);

      System.out.println(retorno);

      JLabel label1 = new JLabel();
      if(retorno == null) {
        label1.setText("Nao encontrado");
        label1.setBounds(100, 150, 280, 30);
        label1.setFont(new Font("Verdana", Font.BOLD , 14));
        label1.setForeground(Color.red);
        buscaFrame.add(label1);  
        option2_2();
        return;
      }

      JLabel label2 = new JLabel();
      JLabel label3 = new JLabel();
      JLabel label4 = new JLabel();

      label1.setText("Nome: " + retorno.getNome());
      label1.setBounds(100, 150, 280, 30);
      label1.setFont(new Font("Verdana", Font.BOLD , 14));
      buscaFrame.add(label1);
      
      label3.setText("CPF: " + retorno.getCpf());
      label3.setBounds(100, 180, 280, 30);
      label3.setFont(new Font("Verdana", Font.BOLD , 14));
      buscaFrame.add(label3);
      
      label2.setText("Aulas: " + retorno.getAulasSemanais() + " | Hora/Aula: R$" + retorno.getHoraAula());
      label2.setBounds(100, 210, 280, 30);
      label2.setFont(new Font("Verdana", Font.BOLD , 14));
      buscaFrame.add(label2);      

      label4.setText("Salario = " + retorno.getSalario());
      label4.setBounds(100, 240, 280, 30);
      label4.setFont(new Font("Verdana", Font.BOLD , 14));
      buscaFrame.add(label4);      

      option2_2();

    } else if(e.getActionCommand().equals("Retornar ao Menu")){
      if(registroFrame != null) registroFrame.setVisible(false);
      if(buscaFrame != null) buscaFrame.setVisible(false);
      if(removeFrame != null) removeFrame.setVisible(false);
      if(apresentaFrame != null) apresentaFrame.setVisible(false);

      optionsFrame.setVisible(true);
    } else if(e.getActionCommand() == "Remover"){
      String cpf = removeCpfTextField.getText();
      professores.remove(cpf);
      option3_2();
    }

  }

}
