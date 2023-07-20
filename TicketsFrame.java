/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.setDefaultLookAndFeelDecorated;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author user
 */
public class TicketsFrame  extends JFrame{
      private JPanel btnPnl;
    private JPanel headingPnl;
    private JPanel customerPnl;
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel nameAndSurnPml;
    private JPanel ticketDetailPnl;
    private JPanel mainPnl;
    private JPanel detailsPnl;
    private JPanel homeTeamPnl;
    private JPanel awayTeamPnl;
    private JPanel costPricePnl;
    private JPanel numberPnl;
    private JPanel totalPnl;
    
    //JLabels
    private JLabel headingLbl;
    private JLabel customerDetLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    private JLabel homeLbl;
    private JLabel awayLbl;
    private JLabel costPriceLbl;
    private JLabel numberLbl;
    private JLabel totalLbl;
    
    
    //textfiled
    private JTextField nameTxtFl;
    private JTextField surnameTxtFl;
    private JTextField homeTxtFl;
    private JTextField awayTxtFl;
    private JTextField costPriceTxtFl;
    private JTextField totalTxtFl;
    
    
    private JSlider numberSlid;
    //button
    private JButton buyBtn;
    private JButton clearBtn;
    private JButton exitBtn;
    
    
    
    public TicketsFrame(){
        setTitle("Ticket sales");
        setBackground(Color.yellow);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 700);
        
        
        //panels
        headingPnl = new JPanel(new FlowLayout());
        btnPnl = new JPanel(new FlowLayout());
        namePnl= new JPanel(new FlowLayout(FlowLayout.LEFT));
        surnamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        nameAndSurnPml = new JPanel(new GridLayout(2,1));
        mainPnl = new JPanel(new BorderLayout());
        detailsPnl = new JPanel(new BorderLayout());
        homeTeamPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        awayTeamPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        costPricePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        numberPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        totalPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        
        //customer
        customerPnl= new JPanel(new FlowLayout(FlowLayout.LEFT));
        customerPnl.setBorder(new TitledBorder(new LineBorder(Color.BLUE,2),"Customer detail"));
        nameLbl =  new JLabel("Name:");
        surnameLbl = new JLabel("Surname:");
        nameTxtFl = new JTextField(15);
        surnameTxtFl = new JTextField(15);
        
        //ticket details
        ticketDetailPnl = new JPanel(new GridLayout(5, 1, 1, 1));
        ticketDetailPnl.setBorder(new TitledBorder(new LineBorder(Color.BLUE,2),"Ticket details"));
        awayLbl = new JLabel("Home team:");
        homeLbl = new JLabel("Away team:");
        homeTxtFl = new JTextField(15);
        awayTxtFl = new JTextField(15);
        costPriceTxtFl = new JTextField(15);
        costPriceLbl = new JLabel("Cost price :R");
        numberLbl = new JLabel("Number of tickets required : ");
        numberSlid = new JSlider(1,20);
        totalLbl = new JLabel("Total amonut due :R");
        totalTxtFl = new JTextField(20);
        totalTxtFl.setText("To be calculated");
        totalTxtFl.setEditable(false);
        
        //heading
        headingLbl = new JLabel("Soccer Match Tickets");
        headingLbl.setFont(new Font(Font.SERIF,Font.BOLD+Font.ITALIC,50));
        
        
        //buttons.
        buyBtn = new JButton("Buy");
        clearBtn = new JButton("Clear");
        exitBtn = new JButton("Exit");
        
        
        //customer
        headingPnl.add(headingLbl);
        namePnl.add(nameLbl);
        namePnl.add(nameTxtFl);
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTxtFl);
        nameAndSurnPml.add(namePnl);
        nameAndSurnPml.add(surnamePnl);
        customerPnl.add(nameAndSurnPml);
        
        //tickets
        homeTeamPnl.add(homeLbl);
        homeTeamPnl.add(homeTxtFl);
        awayTeamPnl.add(awayLbl);
        awayTeamPnl.add(awayTxtFl);
        costPricePnl.add(costPriceLbl);
        costPricePnl.add(costPriceTxtFl);
        numberPnl.add(numberLbl);
        numberPnl.add(numberSlid);
        totalPnl.add(totalLbl);
        totalPnl.add(totalTxtFl);
        
        ticketDetailPnl.add(homeTeamPnl);
        ticketDetailPnl.add(awayTeamPnl);
        ticketDetailPnl.add(costPricePnl);
        ticketDetailPnl.add(numberPnl);
        ticketDetailPnl.add(totalPnl);
        //buttons
        
        btnPnl.add(buyBtn);
        btnPnl.add(clearBtn);
        btnPnl.add(exitBtn);
        detailsPnl.add(ticketDetailPnl,BorderLayout.CENTER);
        detailsPnl.add(btnPnl,BorderLayout.SOUTH);
        
        mainPnl.add(headingPnl,BorderLayout.NORTH);
        mainPnl.add(customerPnl,BorderLayout.CENTER);
        mainPnl.add(detailsPnl,BorderLayout.SOUTH);
        
        add(mainPnl);
        
        pack();
                
        setVisible(true);
    }
    
}
