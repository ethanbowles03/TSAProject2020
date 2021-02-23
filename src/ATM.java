import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ATM implements ActionListener{
  private JFrame frame = new JFrame("ATM MAchine");
  private JButton button1 = new JButton("1");
  private JButton button2 = new JButton("2");
  private JButton button3 = new JButton("3");
  private JButton button4 = new JButton("4");
  private JButton button5 = new JButton("5");
  private JButton button6 = new JButton("6");
  private JButton button7 = new JButton("7");
  private JButton button8 = new JButton("8");
  private JButton button9 = new JButton("9");
  private JButton button0 = new JButton("0");
  private JButton buttonE = new JButton("O");
  private JButton buttonC = new JButton("X");
  private JTextField text = new JTextField();
  private String answer = "";
  private String pin = "1234";
  private int count = 0;
  private boolean correctPin = false;
  private boolean incorrectPin = false;
  //hello
  ATM(){
    frame.setSize(380,640);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(null);
    buttons();
    textBox();

    frame.setVisible(true);
  }

  public static void main(String[] args){
    new ATM();
  }

  public void buttons(){
    button1.setBounds(20,380,100,100);
    button2.setBounds(140,380,100,100);
    button3.setBounds(260,380,100,100);
    button4.setBounds(20,260,100,100);
    button5.setBounds(140,260,100,100);
    button6.setBounds(260,260,100,100);
    button7.setBounds(20,140,100,100);
    button8.setBounds(140,140,100,100);
    button9.setBounds(260,140,100,100);
    button0.setBounds(140,500,100,100);
    buttonE.setBounds(260,500,100,100);
    buttonC.setBounds(20,500,100,100);

    frame.add(button1);
    frame.add(button2);
    frame.add(button3);
    frame.add(button4);
    frame.add(button5);
    frame.add(button6);
    frame.add(button7);
    frame.add(button8);
    frame.add(button9);
    frame.add(button0);
    frame.add(buttonE);
    frame.add(buttonC);

    button0.addActionListener(this);
    button1.addActionListener(this);
    button2.addActionListener(this);
    button3.addActionListener(this);
    button4.addActionListener(this);
    button5.addActionListener(this);
    button6.addActionListener(this);
    button7.addActionListener(this);
    button8.addActionListener(this);
    button9.addActionListener(this);
    buttonE.addActionListener(this);
    buttonC.addActionListener(this);
  }

  public void textBox(){
    text.setBounds(20,20,340,100);
    text.setEditable(false);

    Font font = new Font("Ariel", Font.BOLD, 30);
    text.setFont(font);

    frame.add(text);
  }

  public void checkPin(String ans){
    if(ans.equals(pin)){
      text.setText("Correct Pin");
      correctPin = true;
    }else{
      count++;
      if(count < 3){
        text.setText("Incorrect Pin");
        incorrectPin = false;
      }else{
        text.setText("Bank Account Locked");
      }
    }
  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource()==button1){
      if(text.getText().equals("Incorrect Pin")){
        text.setText("Incorrect Pin");
      }
      if(count > 2){
        text.setText("Bank Account Locked");
      } else{
        if(correctPin == true){
          text.setText("Correct Pin");
        }
        else if(incorrectPin == true){
          text.setText("Incorrect Pin");
        }
        else{
          text.setText(text.getText().concat("1"));
        }
      }
    }
    if(e.getSource()==button2){
      if(text.getText().equals("Incorrect Pin")){
        text.setText("Incorrect Pin");
      }
      if(count > 2){
        text.setText("Bank Account Locked");
      } else{
        if(correctPin == true){
          text.setText("Correct Pin");
        }
        else if(incorrectPin == true){
          text.setText("Incorrect Pin");
        }
        else{
          text.setText(text.getText().concat("2"));
        }
      }
    }
    if(e.getSource()==button3){
      if(text.getText().equals("Incorrect Pin")){
        text.setText("Incorrect Pin");
      }
      if(count > 2){
        text.setText("Bank Account Locked");
      } else{
        if(correctPin == true){
          text.setText("Correct Pin");
        }
        else if(incorrectPin == true){
          text.setText("Incorrect Pin");
        }
        else{
          text.setText(text.getText().concat("3"));
        }
      }
    }
    if(e.getSource()==button4){
      if(text.getText().equals("Incorrect Pin")){
        text.setText("Incorrect Pin");
      }
      if(count > 2){
        text.setText("Bank Account Locked");
      } else{
        if(correctPin == true){
          text.setText("Correct Pin");
        }
        else if(incorrectPin == true){
          text.setText("Incorrect Pin");
        }
        else{
          text.setText(text.getText().concat("4"));
        }
      }
    }
    if(e.getSource()==button5){
      if(text.getText().equals("Incorrect Pin")){
        text.setText("Incorrect Pin");
      }
      if(count > 2){
        text.setText("Bank Account Locked");
      } else{
        if(correctPin == true){
          text.setText("Correct Pin");
        }
        else if(incorrectPin == true){
          text.setText("Incorrect Pin");
        }
        else{
          text.setText(text.getText().concat("5"));
        }
      }
    }
    if(e.getSource()==button6){
      if(text.getText().equals("Incorrect Pin")){
        text.setText("Incorrect Pin");
      }
      if(count > 2){
        text.setText("Bank Account Locked");
      } else{
        if(correctPin == true){
          text.setText("Correct Pin");
        }
        else if(incorrectPin == true){
          text.setText("Incorrect Pin");
        }
        else{
          text.setText(text.getText().concat("6"));
        }
      }
    }
    if(e.getSource()==button7){
      if(text.getText().equals("Incorrect Pin")){
        text.setText("Incorrect Pin");
      }
      if(count > 2){
        text.setText("Bank Account Locked");
      } else{
        if(correctPin == true){
          text.setText("Correct Pin");
        }
        else if(incorrectPin == true){
          text.setText("Incorrect Pin");
        }
        else{
          text.setText(text.getText().concat("7"));
        }
      }
    }
    if(e.getSource()==button8){
      if(text.getText().equals("Incorrect Pin")){
        text.setText("Incorrect Pin");
      }
      if(count > 2){
        text.setText("Bank Account Locked");
      } else{
        if(correctPin == true){
          text.setText("Correct Pin");
        }
        else if(incorrectPin == true){
          text.setText("Incorrect Pin");
        }
        else{
          text.setText(text.getText().concat("8"));
        }
      }
    }
    if(e.getSource()==button9){
      if(text.getText().equals("Incorrect Pin")){
        text.setText("Incorrect Pin");
      }
      if(count > 2){
        text.setText("Bank Account Locked");
      } else{
        if(correctPin == true){
          text.setText("Correct Pin");
        }
        else if(incorrectPin == true){
          text.setText("Incorrect Pin");
        }
        else{
          text.setText(text.getText().concat("9"));
        }
      }
    }
    if(e.getSource()==button0){
      if(text.getText().equals("Incorrect Pin")){
        text.setText("Incorrect Pin");
      }
      if(count > 2){
        text.setText("Bank Account Locked");
      } else{
        if(correctPin == true || incorrectPin == true){
          text.setText("Correct Pin");
        }else{
          text.setText(text.getText().concat("0"));
        }
      }
    }
    if(e.getSource()==buttonE){
      if(count < 3){
        if(correctPin == true){
          text.setText("Correct Pin");
        }
        else if(incorrectPin == true){
          text.setText("Incorrect Pin");
        }
        else{
          answer = text.getText();
          checkPin(answer);
        }
      } else{
        text.setText("");
      }
      //text.setText("");
    }
    if(e.getSource()==buttonC){
      text.setText("");
    }
  }
}
