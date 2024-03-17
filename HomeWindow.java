import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class HomeWindow extends JFrame implements ActionListener
{
	JButton enter;
	JLabel l;
	public HomeWindow(String title)
	{
		super(title);
		setLayout(null);
		l=new JLabel("<html><body>The knapsack problem is a problem in combinatorial optimization: <br>Given a set of items, each with a weight and a value, \ndetermine the number of each item to include in a collection so that the total weight is less than \nor equal to a given limit and the total value is as large as possible. It derives its name from the problem faced by \nsomeone who is constrained by a fixed-size knapsack and must fill it with the most valuable items. \nThe problem often arises in resource allocation where the decision makers have to choose from a set \nof non-divisible projects or tasks under a fixed budget or time constraint, respectively. </body></html>");
		l.setFont(new Font("Arial",Font.BOLD,15));
		l.setForeground(Color.blue);
		l.setBounds(100,30,800,200);
		add(l);
		enter=new JButton("ENTER");
		enter.setBounds(150,300,90,30);
		add(enter);
		
		enter.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		MainWindow w=new MainWindow("MainWindow-Knapsack Algorithm");
		w.setSize(800,800);
		w.setVisible(true);
		
	}
	

}
