package test;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Hello world!
 *
 */
public class App 
{
	public static JFrame myWindow = new JFrame("Калькулятор");
	public static char operat='_';
	public static int result_calc;
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        run();
    }
    public static void run()
    {
    	
    	myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(7,1,20,10));
		final JTextField text = new JTextField();
		panel.add(text);
		
		JButton butPlus = new JButton("+");
		panel.add(butPlus);
		JButton butMinus = new JButton("-");
		panel.add(butMinus);
		JButton butYmnozhenie = new JButton("*");
		panel.add(butYmnozhenie);
		JButton butDelenie = new JButton("/");
		panel.add(butDelenie);
		JButton butEqual = new JButton("=");
		panel.add(butEqual);
		final JLabel result = new JLabel("Result");
		panel.add(result);
		
		class ActionListenerPlus implements ActionListener {
		    public void actionPerformed(ActionEvent e) {
		    	
		    	result_calc=new Integer(text.getText().toString());
		    	text.setText("");
		    	operat='+';
		    	result.setText(""+result_calc);
		    }
		}
		ActionListener actionListener1 = new ActionListenerPlus();
		butPlus.addActionListener(actionListener1);
		class ActionListenerMinus implements ActionListener {
		    public void actionPerformed(ActionEvent e) {
		    	result_calc=new Integer(text.getText().toString());
		    	text.setText("");
		    	operat='-';
		    	result.setText(""+result_calc);
		    }
		}
		ActionListener actionListener2 = new ActionListenerMinus();
		butMinus.addActionListener(actionListener2);
		
		class ActionListenerYmn implements ActionListener {
		    public void actionPerformed(ActionEvent e) {
		    	result_calc=new Integer(text.getText().toString());
		    	text.setText("");
		    	operat='*';
		    	result.setText(""+result_calc);
		    }
		}
		ActionListener actionListener3 = new ActionListenerYmn();
		butYmnozhenie.addActionListener(actionListener3);

		class ActionListenerDelenie implements ActionListener {
		    public void actionPerformed(ActionEvent e) {
		    	result_calc=new Integer(text.getText().toString());
		    	text.setText("");
		    	operat='/';
		    	result.setText(""+result_calc);
		    }
		}
		ActionListener actionListener4 = new ActionListenerDelenie();
		butDelenie.addActionListener(actionListener4);
		
		class ActionListenerEqual implements ActionListener {
		    public void actionPerformed(ActionEvent e) {
		    	//result_calc=new Integer(text.getText().toString());
		    	switch(operat)
		    	{
		    	case '+':
		    		result_calc+=new Integer(text.getText().toString());
		    		break;
		    	case '-':
		    		result_calc-=new Integer(text.getText().toString());
		    		break;
		    	case '*':
		    		result_calc*=new Integer(text.getText().toString());
		    		break;
		    	case '/':
		    		result_calc/=new Integer(text.getText().toString());
		    		break;
		    	}
		    	result.setText(""+result_calc);
		    	operat='_';
		    }
		}
		ActionListener actionListener5 = new ActionListenerEqual();
		butEqual.addActionListener(actionListener5);
		myWindow.setContentPane(panel);
		myWindow.setSize(400, 600);
	    myWindow.setVisible(true);
    }
}
