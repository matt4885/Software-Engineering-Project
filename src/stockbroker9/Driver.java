/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockbroker9;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Gary
 */
public class Driver{

    static JPanel homeContainer; //container for the other cards
    static JPanel homePanel;
    static JPanel otherPanel;
    static JPanel customerPanel;
    static ImportCustomerData importCustomerDataPanel;
    static SalesActivity salesActivityPanel;
    static SetCommissionRate setCommissionRatePanel;
    static CurrentSummary1 currentSummaryPanel;
    static MonthlyReport monthlyReportPanel;
    static MainMenu mainMenuPanel;
    static Login loginPanel;
    static Administrator administratorPanel;
    static CustomerPortfolio customerPortfolioPanel;
    static CardLayout cl;  //layout for the other cards

    public void execute(String[] args) {
        initComponents();

    }

    private void initComponents() {
        //set up the main frame
        JFrame mFrame = new JFrame("Stock Broker");
        JButton showOtherPanelBtn = new JButton("Show Other Panel");
        JButton backToHomeBtn = new JButton("Show Home Panel");
        
       
        //set up the main container that has a CardLayout
        cl = new CardLayout(5, 5);
        homeContainer = new JPanel(cl);
        homeContainer.setBackground(Color.black);
        

        //set up the homePanel and place it in the container
        homePanel = new JPanel();
        homePanel.setBackground(Color.blue);
        homePanel.add(showOtherPanelBtn);

        homeContainer.add(homePanel, "Home");

        //set up the otherPanel and place it in the container
        otherPanel = new JPanel();
        otherPanel.setBackground(Color.green);
        otherPanel.add(backToHomeBtn);

        homeContainer.add(otherPanel, "Other Panel");
        
        

        //set up the customerPanel and place it in the container
        currentSummaryPanel = new CurrentSummary1();
        currentSummaryPanel.setBackground(Color.LIGHT_GRAY);
        
        homeContainer.add(currentSummaryPanel, "Current Summary");

        //set up the loginPanel and place it in the container
        loginPanel = new Login();
        loginPanel.setBackground(Color.ORANGE);

        homeContainer.add(loginPanel, "Login");
        
        //set up the monthlyReportPanel and place it in the container
        monthlyReportPanel = new MonthlyReport();
        monthlyReportPanel.setBackground(Color.ORANGE);

        homeContainer.add(monthlyReportPanel, "Monthly Reports");
        

        //set up the customerPortfolioPanel and place it in the container
        customerPortfolioPanel = new CustomerPortfolio();
        customerPortfolioPanel.setBackground(Color.ORANGE);

        homeContainer.add(customerPortfolioPanel, "Customer Portfolio");

        //set up the mainMenuPanel and place it in the container
        mainMenuPanel = new MainMenu();
        mainMenuPanel.setBackground(Color.CYAN);

        homeContainer.add(mainMenuPanel, "Main Menu");
        
        //set up the administratorPanel and place it in the container
        administratorPanel = new Administrator();
        administratorPanel.setBackground(Color.BLUE);

        homeContainer.add(administratorPanel, "Administrator");
        
                //set up the setCommissionRatePanel and place it in the container
        setCommissionRatePanel = new SetCommissionRate();
        setCommissionRatePanel.setBackground(Color.PINK);

        homeContainer.add(setCommissionRatePanel, "Set Commission Rate");
        
        //set up the salesActivityPanel and place it in the container
        salesActivityPanel = new SalesActivity();
        salesActivityPanel.setBackground(Color.magenta);

        homeContainer.add(salesActivityPanel, "Sales Activity");
        
        //set up the importCustomerDataPanel and place it in the container
        importCustomerDataPanel = new ImportCustomerData();
        importCustomerDataPanel.setBackground(Color.GREEN);

        homeContainer.add(importCustomerDataPanel, "Import Customer Data");
        
        showOtherPanelBtn.addActionListener(e -> cl.show(homeContainer, "Other Panel"));
        backToHomeBtn.addActionListener(e -> cl.show(homeContainer, "Home"));
      
        
        mFrame.add(homeContainer);
        cl.show(homeContainer, "Login");
        mFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mFrame.setLocationRelativeTo(null);
        mFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mFrame.pack();
        mFrame.setVisible(true);

        //System.out.println("hello");
    }

}
