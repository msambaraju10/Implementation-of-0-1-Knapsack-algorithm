import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
public class MainWindow extends JFrame  implements ActionListener
{
	JTextField Wtxt,Vtxt,Wweight,Items,Value;
	JLabel l1,l2,l3,l4,l5,title,note;
	JButton submit;
	public MainWindow(String title1)
	{
		super(title1);
		setLayout(null);
		title=new JLabel("Knapsack Algorithm Implementation");
		title.setFont(new Font("Arial", Font.BOLD,15));
		title.setForeground(Color.CYAN);
		title.setBounds(100,50,800,30);
		add(title);
		
		note=new JLabel("NOTE: Give weights and values separated with cammas");
		note.setBounds(100,80,800,30);
		note.setForeground(Color.RED);
		note.setBackground(Color.CYAN);
		add(note);
		
		l1=new JLabel("Weights:");
		l1.setBounds(100,120,100,30);
		add(l1);
		
		Wtxt=new JTextField();
		Wtxt.setBounds(210,120,250,30);
		add(Wtxt);
		
		l2=new JLabel("Values:");
		l2.setBounds(100,180,100,30);
		add(l2);
		
		Vtxt=new JTextField();
		Vtxt.setBounds(210,180,250,30);
		add(Vtxt);
		
		
		
		l5=new JLabel("Weight:");
		l5.setBounds(100,220,100,30);
		add(l5);
		
		Wweight=new JTextField();
		Wweight.setBounds(210,220,250,30);
		add(Wweight);
		
		
		
		submit=new JButton("SOLVE");
		submit.setBounds(210,300,80,40);
		add(submit);
		submit.addActionListener(this);
		
		l3=new JLabel("Items Selected:");
		l3.setBounds(100,360,100,30);
		add(l3);
		
		Items=new JTextField();
		Items.setBounds(210,360,250,30);
		Items.setEditable(false);
		add(Items);
		
		l4=new JLabel("Value:");
		l4.setBounds(100,430,100,30);
		add(l4);
		
		Value=new JTextField();
		Value.setBounds(210,430,250,30);
		Value.setEditable(false);
		add(Value);
		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String sw[]=Wtxt.getText().toString().split(",");
		String sv[]=Vtxt.getText().toString().split(",");
		if(sw.length!=sv.length)
		{
			JOptionPane.showMessageDialog(null, "Please provide same number of inputs for weight and values");
			return;
		}
		if(Wtxt.getText().length()==0)
		{
			JOptionPane.showMessageDialog(null, "Please give Weights");
			return;
		}
		if(Vtxt.getText().length()==0)
		{
			JOptionPane.showMessageDialog(null, "Please give Values");
			return;
		}
		if(Wweight.getText().length()==0)
		{
			JOptionPane.showMessageDialog(null, "Please give Weight");
			return;
		}
		
		
		try
		{
			int w[]=new int[sw.length+1];
			int v[]=new int[sv.length+1];
			
			int i;
			for(i=1;i<sw.length;i++)
			{
				w[i]=Integer.parseInt(sw[i]);
				v[i]=Integer.parseInt(sv[i]);
			}
			int n=sw.length;
			int wt=Integer.parseInt(Wweight.getText().toString());
			Knapsack ks = new Knapsack();
			ArrayList<Integer> al= ks.solve(w, v, wt, n);
			String s="";
			int outputvalue=0;
			for(Integer index:al)
			{
				s+=(index+1)+", ";
				outputvalue+=v[index];
			}
			Items.setText(s);
			Value.setText(""+outputvalue);
			
			
			
		}
		catch(Exception ee)
		{
			JOptionPane.showMessageDialog(null, "Error:"+ee);
			return;
			
		}
		
		
		
		
	}
	
	

}
