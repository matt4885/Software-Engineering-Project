/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockbroker9;

import static java.awt.PageAttributes.MediaType.C;
import java.util.Observable;
import javax.swing.ImageIcon;

/**
 *
 * @author Gary
 */
public class Client extends Observable {

    private String[][] login = {{"Matt", "Leonard", "Justy", "Gary", "Kevin", "Andy"},
    {"p1", "p2", "p3", "p4", "p5", "p6"},
    {"yes", "no", "yes", "yes", "yes", "no"}};

    private double commissionRate = .04;

    public boolean getLoginStatus(String username, String password) {
        boolean isGood = false;
        String s1 = username;
        String s2 = password;
        int x = 0;
        System.out.println("test point 5");
        while (x != login[0].length) {
            if (login[1][x].equals(s2) && login[0][x].equals(s1)) {
                System.out.println("Password Login success");
                isGood = true;
            }
            x++;
        }
        return isGood;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commRate) {
        commissionRate = commRate;
        System.out.println("Test point 8 commission rate is: " + commissionRate);
        setChanged();
        System.out.println("Test point 11 before notifyObservers");
        notifyObservers();
        System.out.println("Test point 12 after notifyObservers");
    }

    @Override
    public void notifyObservers() {
        super.notifyObservers();
        System.out.println(" Look boss, I'm doing some work!");
    }

    public ImageIcon getImage(int imageNumber) {
        ImageIcon images[] = new ImageIcon[3];

        ImageIcon daily = new ImageIcon("graphpsd29.jpg");
        ImageIcon weekly = new ImageIcon("graphpsd30.jpg");
        ImageIcon monthly = new ImageIcon("graphpsd31.jpg");

        images[0] = daily;
        images[1] = weekly;
        images[2] = monthly;

        return images[imageNumber];

    }
}
