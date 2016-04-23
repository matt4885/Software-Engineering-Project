/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockbroker9;

import java.awt.*;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author Gary
 */
public class Driver{

    static JPanel homeContainer; //container for the other cards
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
    static Client client;//declare client


    public void execute(String[] args) {
        initComponents();
        initObservables();

    }
    
    private void initObservables(){
        client.addObserver(customerPortfolioPanel);
    }

    private void initComponents() {
        client = new Client();//contructor for client object
        
        //set up the main frame
        JFrame mFrame = new JFrame("Stock Broker");
        
       
        //set up the main container that has a CardLayout
        cl = new CardLayout(5, 5);
        homeContainer = new JPanel(cl);
        homeContainer.setBackground(Color.black);

        //set up the currentSummaryPanel and place it in the container
        currentSummaryPanel = new CurrentSummary1();
        currentSummaryPanel.setBackground(Color.LIGHT_GRAY);
        
        homeContainer.add(currentSummaryPanel, "Current Summary");

        //set up the loginPanel and place it in the container
        loginPanel = new Login();

        homeContainer.add(loginPanel, "Login");
        
        //set up the monthlyReportPanel and place it in the container
        monthlyReportPanel = new MonthlyReport();

        homeContainer.add(monthlyReportPanel, "Monthly Reports");
        

        //set up the customerPortfolioPanel and place it in the container
        customerPortfolioPanel = new CustomerPortfolio();

        homeContainer.add(customerPortfolioPanel, "Customer Portfolio");
        customerPortfolioPanel.setConfirmEnabled(true);

        //set up the mainMenuPanel and place it in the container
        mainMenuPanel = new MainMenu();

        homeContainer.add(mainMenuPanel, "Main Menu");
        
        //set up the administratorPanel and place it in the container
        administratorPanel = new Administrator();

        homeContainer.add(administratorPanel, "Administrator");
        
        //set up the setCommissionRatePanel and place it in the container
        setCommissionRatePanel = new SetCommissionRate();

        homeContainer.add(setCommissionRatePanel, "Set Commission Rate");
        
        //set up the salesActivityPanel and place it in the container
        salesActivityPanel = new SalesActivity();

        homeContainer.add(salesActivityPanel, "Sales Activity");
        
        //set up the importCustomerDataPanel and place it in the container
        importCustomerDataPanel = new ImportCustomerData();

        homeContainer.add(importCustomerDataPanel, "Import Customer Data");
        
      
        
        mFrame.add(homeContainer);
        cl.show(homeContainer, "Login");
        mFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mFrame.setLocationRelativeTo(null);
        mFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mFrame.pack();
        mFrame.setVisible(true);

    }
    

}
