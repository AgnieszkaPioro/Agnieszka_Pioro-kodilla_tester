import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.text.StyledEditorKit;
import java.awt.*;
import java.awt.event.*;
import java.awt.print.PrinterException;
import java.text.SimpleDateFormat;
import java.time.chrono.JapaneseDate;
import java.util.Calendar;
import java.util.Date;

public class JFrame extends javax.swing.JFrame {
    private javax.swing.JFrame exitframe;

    public static void main(String[] args) {

        double [] itemcost = new double[20];

        JFrame frame = new JFrame();

        JPanel background = new JPanel();
        Border border = BorderFactory.createLineBorder(Color.CYAN,14);
        background.setBorder(border);
        Color myBlue = new Color(176, 224, 230);
        background.setBackground(myBlue);
        background.setLayout(null);

        JPanel background1 = new JPanel();
        background1.setBorder(border);
        background1.setBackground(myBlue);
        background1.setBounds(30,40,370,680);
        background1.setLayout(null);

        int ref=2456+ (int) (Math.random()*32345);
        String cRef="";
        cRef +=ref + 1560;
        JLabel label1 = new JLabel("Customer Ref:"); JTextPane textPane1 = new JTextPane();
        textPane1.setText(cRef);
        textPane1.setEnabled(false);
        Font font = new Font("",Font.BOLD,18); label1.setFont(font);
        label1.setBounds(30,30,150,22); textPane1.setBounds(190,30,150,24);

        JLabel label2 = new JLabel("Firstname:"); JTextPane textPane2 = new JTextPane();
        label2.setBounds(30,65,150,22); textPane2.setBounds(190,65,150,24);
        label2.setFont(font);

        JLabel label3 = new JLabel("Surname:"); JTextPane textPane3 = new JTextPane();
        label3.setBounds(30,100,150,22); textPane3.setBounds(190,100,150,24);
        label3.setFont(font);

        JLabel label4 = new JLabel("Address:"); JTextPane textPane4 = new JTextPane();
        label4.setBounds(30,135,150,22); textPane4.setBounds(190,135,150,24);
        label4.setFont(font);

        JLabel label5 = new JLabel("Post Code:"); JTextPane textPane5 = new JTextPane();
        label5.setBounds(30,170,150,22); textPane5.setBounds(190,170,150,24);
        label5.setFont(font);

        JLabel label6 = new JLabel("Phone: "); JTextPane textPane6 = new JTextPane();
        label6.setBounds(30,205,150,22); textPane6.setBounds(190,205,150,24);
        label6.setFont(font);

        JLabel label7 = new JLabel("Email: "); JTextPane textPane7 = new JTextPane();
        label7.setBounds(30,240,150,22); textPane7.setBounds(190,240,150,24);
        label7.setFont(font);

        JLabel label8 = new JLabel("Nationality: ");
        label8.setBounds(30,275,150,22);
        label8.setFont(font);

        String countries[]={"Poland","Spain","France", "USA","Russia"};
        JComboBox <String> nationality = new JComboBox(countries);
        nationality.setBounds(190,275,150,24);


        JLabel label9 = new JLabel("Date of Birth: ");
        label9.setBounds(30,310,150,22);
        label9.setFont(font);

        Integer days[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
        Integer months[] = {1,2,3,4,5,6,7,8,9,10,11,12};
        Integer years [] = {2021,2020,2019,2018,2017,2016,2015,2014,2013,2012,2011};
        JComboBox <Integer> day = new JComboBox<>(days);
        day.setBounds(190,310,40,24);
        JComboBox <Integer> mont = new JComboBox<>(months);
        mont.setBounds(235,310,40,24);
        JComboBox <Integer> year = new JComboBox<>(years);
        year.setBounds(280,310,60,24);

        JLabel label10 = new JLabel("Gender: ");
        label10.setBounds(30,345,150,22);
        label10.setFont(font);

        String genders[] = {"Male","Female","Non-Binary"};
        JComboBox <String> gender = new JComboBox<>(genders);
        gender.setBounds(190,345,150,24);

        JLabel label11 = new JLabel("Check In Date: "); JTextPane checkIn = new JTextPane();
        label11.setFont(font);
        label11.setBounds(30,380,150,22); checkIn.setBounds(190,380,150,24);

        JLabel label12 = new JLabel("Check Out Date: "); JTextPane checkOut = new JTextPane();
        label12.setFont(font);
        label12.setBounds(30,415,150,22); checkOut.setBounds(190,415,150,24);

        JLabel label13 = new JLabel("Meal: ");
        label13.setFont(font);
        label13.setBounds(30,450,150,22);

        Integer meals[] = {1,2,3};
        JComboBox <Integer> meal = new JComboBox<>(meals);
        meal.setBounds(190,450,150,24);

        JLabel label14 = new JLabel("Room Type: ");
        label14.setFont(font);
        label14.setBounds(30,485,150,22);

        String rooms [] = {"Singe", "Double", "Family"};
        JComboBox room = new JComboBox(rooms);
        room.setBounds(190,485,150,24);


        background1.add(label1);
        background1.add(label2);
        background1.add(label3);
        background1.add(label4);
        background1.add(label5);
        background1.add(label6);
        background1.add(label7);
        background1.add(label8);
        background1.add(label9);
        background1.add(label10);
        background1.add(label11);
        background1.add(label12);
        background1.add(label13);
        background1.add(label14);
        background1.add(textPane1);
        background1.add(textPane2);
        background1.add(textPane3);
        background1.add(textPane4);
        background1.add(textPane5);
        background1.add(textPane6);
        background1.add(textPane7);
        background1.add(nationality);
        background1.add(day);
        background1.add(mont);
        background1.add(year);
        background1.add(gender);
        background1.add(checkIn);
        background1.add(checkOut);
        background1.add(meal);
        background1.add(room);

        JPanel background1_2 = new JPanel();
        background1_2.setBorder(border);
        background1_2.setBackground(myBlue);
        background1_2.setLayout(null);
        background1_2.setBounds(25,520,320,135);

        JButton total = new JButton("Total");
        total.setFont(new Font("Arial", Font.BOLD, 30));
        total.setBounds(25,35,130,60);
        JButton reset = new JButton("Reset");
        reset.setBounds(165,35,130,60);
        reset.setFont(new Font("Arial", Font.BOLD, 30));

        background1.add(background1_2);
        background1_2.add(total);
        background1_2.add(reset);

        JPanel background2 = new JPanel();
        background2.setBorder(border);
        background2.setBackground(myBlue);
        background2.setBounds(430,40,425,680);
        background2.setLayout(null);

        JPanel background2_2 = new JPanel();
        background2_2.setBorder(border);
        background2_2.setBackground(myBlue);
        background2_2.setLayout(null);
        background2_2.setBounds(25,25,375,630);
        background2.add(background2_2);

        String defaultNum = "  0";
        Border amountBorder = BorderFactory.createLineBorder(Color.black,1);


        JCheckBox kim = new JCheckBox();
        JLabel cake = new JLabel("Kim Cake"); JTextPane kimAmount = new JTextPane();
        kim.setBounds(20,27,20,18);
        cake.setBounds(45,20,230,30);
        kimAmount.setBounds(300,20,55,25);
        kimAmount.setBorder(amountBorder);
        kimAmount.setText(defaultNum);
        cake.setFont(font);
        background2_2.add(kim);
        background2_2.add(cake);
        background2_2.add(kimAmount);
        StyledDocument doc = kimAmount.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        doc.setParagraphAttributes(0, doc.getLength(), center, false);

        kimAmount.setEnabled(false);
        kim.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(kim.isSelected()) {
                    kimAmount.setEnabled(true);
                    kimAmount.setText("");
                } else {
                    kimAmount.setEnabled(false);
                    kimAmount.setText(defaultNum);
                }
            }
        });



        JCheckBox kerry = new JCheckBox(); JLabel cake2 = new JLabel("Kerry Cake"); JTextPane kerryAmount = new JTextPane();
        kerry.setBounds(20,64,20,18);
        cake2.setBounds(45,57,230,30);
        kerryAmount.setBorder(amountBorder);
        kerryAmount.setBounds(300,57,55,25);
        kerryAmount.setText(defaultNum);
        cake2.setFont(font);
        background2_2.add(kerry);
        background2_2.add(cake2);
        background2_2.add(kerryAmount);
        doc = kerryAmount.getStyledDocument();
        doc.setParagraphAttributes(0, doc.getLength(), center, false);

        kerryAmount.setEnabled(false);
        kerry.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(kerry.isSelected()) {
                    kerryAmount.setEnabled(true);
                    kerryAmount.setText("");
                } else {
                    kerryAmount.setEnabled(false);
                    kerryAmount.setText(defaultNum);
                }
            }
        });


        JCheckBox coffee = new JCheckBox(); JLabel cake3 = new JLabel("Coffee Cake"); JTextPane coffeeAmount = new JTextPane();
        coffee.setBounds(20,101,20,18);
        cake3.setBounds(45,94,230,30);
        coffeeAmount.setBorder(amountBorder);
        coffeeAmount.setBounds(300,94,55,25);
        coffeeAmount.setText(defaultNum);
        cake3.setFont(font);
        background2_2.add(coffee);
        background2_2.add(cake3);
        background2_2.add(coffeeAmount);
        doc = coffeeAmount.getStyledDocument();
        doc.setParagraphAttributes(0, doc.getLength(), center, false);

        coffeeAmount.setEnabled(false);
        coffee.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(coffee.isSelected()) {
                    coffeeAmount.setEnabled(true);
                    coffeeAmount.setText("");
                } else {
                    coffeeAmount.setEnabled(false);
                    coffeeAmount.setText(defaultNum);
                }
            }
        });

        JCheckBox swindon = new JCheckBox(); JLabel cake4 = new JLabel("Swindon Cake"); JTextPane swindonAmount = new JTextPane();
        swindon.setBounds(20,138,20,18);
        cake4.setBounds(45,131,230,30);
        swindonAmount.setBorder(amountBorder);
        swindonAmount.setBounds(300,131,55,25);
        swindonAmount.setText(defaultNum);
        cake4.setFont(font);
        background2_2.add(swindon);
        background2_2.add(cake4);
        background2_2.add(swindonAmount);
        doc = swindonAmount.getStyledDocument();
        doc.setParagraphAttributes(0, doc.getLength(), center, false);

        swindonAmount.setEnabled(false);
        swindon.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(swindon.isSelected()) {
                    swindonAmount.setEnabled(true);
                    swindonAmount.setText("");
                } else {
                    swindonAmount.setEnabled(false);
                    swindonAmount.setText(defaultNum);
                }
            }
        });

        JCheckBox york = new JCheckBox(); JLabel cake5 = new JLabel("York Cream Pie"); JTextPane yorkAmount = new JTextPane();
        york.setBounds(20,177,20,18);
        cake5.setBounds(45,170,230,30);
        yorkAmount.setBorder(amountBorder);
        yorkAmount.setBounds(300,170,55,25);
        yorkAmount.setText(defaultNum);
        cake5.setFont(font);
        background2_2.add(york);
        background2_2.add(cake5);
        background2_2.add(yorkAmount);
        doc = yorkAmount.getStyledDocument();
        doc.setParagraphAttributes(0, doc.getLength(), center, false);

        yorkAmount.setEnabled(false);
        york.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(york.isSelected()) {
                    yorkAmount.setEnabled(true);
                    yorkAmount.setText("");
                } else {
                    yorkAmount.setEnabled(false);
                    yorkAmount.setText(defaultNum);
                }
            }
        });

        JCheckBox black = new JCheckBox(); JLabel cake6 = new JLabel("Black Forest Cake"); JTextPane blackAmount = new JTextPane();
        black.setBounds(20,214,20,18);
        cake6.setBounds(45,207,230,30);
        blackAmount.setBorder(amountBorder);
        blackAmount.setBounds(300,207,55,25);
        blackAmount.setText(defaultNum);
        cake6.setFont(font);
        background2_2.add(black);
        background2_2.add(cake6);
        background2_2.add(blackAmount);
        doc = blackAmount.getStyledDocument();
        doc.setParagraphAttributes(0, doc.getLength(), center, false);

        blackAmount.setEnabled(false);
        black.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(black.isSelected()) {
                    blackAmount.setEnabled(true);
                    blackAmount.setText("");
                } else {
                    blackAmount.setEnabled(false);
                    blackAmount.setText(defaultNum);
                }
            }
        });

        JCheckBox lagos = new JCheckBox(); JLabel cake7 = new JLabel("Lagos Chocolate Cake"); JTextPane lagosAmount = new JTextPane();
        lagos.setBounds(20,249,20,18);
        cake7.setBounds(45,242,230,30);
        lagosAmount.setBorder(amountBorder);
        lagosAmount.setBounds(300,242,55,25);
        lagosAmount.setText(defaultNum);
        cake7.setFont(font);
        background2_2.add(lagos);
        background2_2.add(cake7);
        background2_2.add(lagosAmount);
        doc= lagosAmount.getStyledDocument();
        doc.setParagraphAttributes(0, doc.getLength(), center, false);

        lagosAmount.setEnabled(false);
        lagos.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(lagos.isSelected()) {
                    lagosAmount.setEnabled(true);
                    lagosAmount.setText("");
                } else {
                    lagosAmount.setEnabled(false);
                    lagosAmount.setText(defaultNum);
                }
            }
        });

        JCheckBox killburn = new JCheckBox(); JLabel cake8 = new JLabel("Killburn Chocolate Cake"); JTextPane killburnAmount = new JTextPane();
        killburn.setBounds(20,285,20,18);
        cake8.setBounds(45,278,230,30);
        killburnAmount.setBorder(amountBorder);
        killburnAmount.setBounds(300,278,55,25);
        killburnAmount.setText(defaultNum);
        cake8.setFont(font);
        background2_2.add(killburn);
        background2_2.add(cake8);
        background2_2.add(killburnAmount);
        doc= killburnAmount.getStyledDocument();
        doc.setParagraphAttributes(0, doc.getLength(), center, false);

        killburnAmount.setEnabled(false);
        killburn.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(killburn.isSelected()) {
                    killburnAmount.setEnabled(true);
                    killburnAmount.setText("");
                } else {
                    killburnAmount.setEnabled(false);
                    killburnAmount.setText(defaultNum);
                }
            }
        });

        JCheckBox carlton = new JCheckBox(); JLabel cake9 = new JLabel("Carlton Hill Chocolate Cake"); JTextPane carltonAmount = new JTextPane();
        carlton.setBounds(20,325,20,18);
        cake9.setBounds(45,318,270,30);
        carltonAmount.setBorder(amountBorder);
        carltonAmount.setBounds(300,318,55,25);
        carltonAmount.setText(defaultNum);
        cake9.setFont(font);
        background2_2.add(carlton);
        background2_2.add(cake9);
        background2_2.add(carltonAmount);
        doc= carltonAmount.getStyledDocument();
        doc.setParagraphAttributes(0, doc.getLength(), center, false);

        carltonAmount.setEnabled(false);
        carlton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(carlton.isSelected()) {
                    carltonAmount.setEnabled(true);
                    carltonAmount.setText("");
                } else {
                    carltonAmount.setEnabled(false);
                    carltonAmount.setText(defaultNum);
                }
            }
        });

        JPanel background2_3 = new JPanel();
        background2_3.setBackground(Color.CYAN);
        background2_3.setBounds(20,370,335,60);
        background2_3.setLayout(new FlowLayout());

        JLabel tax_and_total_sum = new JLabel("Tax and Total Sum");
        tax_and_total_sum.setFont(new Font("Arial", Font.BOLD, 35));
        background2_2.add(background2_3);
        background2_3.add(tax_and_total_sum);

        JLabel tax = new JLabel("Tax Paid");
        JLabel sub = new JLabel("Sub Total");
        JLabel totalC = new JLabel("Total Cost");
        tax.setFont(new Font("Arial", Font.BOLD, 22));
        sub.setFont(new Font("Arial", Font.BOLD, 22));
        totalC.setFont(new Font("Arial", Font.BOLD, 22));
        tax.setBounds(20,450,150,30);
        sub.setBounds(20,510,150,30);
        totalC.setBounds(20,570,150,30);

        JLabel taxResult = new JLabel("0",SwingConstants.CENTER);
        taxResult.setBorder(amountBorder);
        taxResult.setBounds(245,450,110,35);
        taxResult.setFont(font);
        background2_2.add(taxResult);

        JLabel subtotal = new JLabel("0", SwingConstants.CENTER);
        subtotal.setBorder(amountBorder);
        subtotal.setBounds(245,510,110,35);
        subtotal.setFont(font);
        background2_2.add(subtotal);

        JLabel totalResult = new JLabel("0",SwingConstants.CENTER);
        totalResult.setBorder(amountBorder);
        totalResult.setBounds(245,570,110,35);
        totalResult.setFont(font);
        background2_2.add(totalResult);

        background2_2.add(tax);
        background2_2.add(sub);
        background2_2.add(totalC);

        JPanel background3 = new JPanel();
        background3.setBorder(border);
        background3.setBackground(myBlue);
        background3.setLayout(null);
        background3.setBounds(885,40,370,680);

        JPanel background3_1 = new JPanel();
        background3_1.setBorder(border);
        background3_1.setBackground(myBlue);
        background3_1.setLayout(null);
        background3_1.setBounds(25,520,320,135);

        JButton print = new JButton("Print");
        print.setFont(new Font("Arial", Font.BOLD, 30));
        print.setBounds(25,35,130,60);
        JButton exit = new JButton("Exit");
        exit.setBounds(165,35,130,60);
        exit.setFont(new Font("Arial", Font.BOLD, 30));



        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                javax.swing.JFrame exitframe = new JFrame();
                exitframe.setTitle("Exit");
                if(JOptionPane.showConfirmDialog(exitframe,"Confirm if you want to exit",
                        "Customer Billing System"
                        ,JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION
                ) {
                    System.exit(0);
                }
            }
        });

        JTextPane bill = new JTextPane();
        bill.setBounds(20,20,330,485);
        bill.setEnabled(false);

        total.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                itemcost[0] = Double.parseDouble(kimAmount.getText()) *1.5;
                itemcost[1] = Double.parseDouble(kerryAmount.getText()) *1.87;
                itemcost[2] = Double.parseDouble(coffeeAmount.getText()) *1.95;
                itemcost[3] = Double.parseDouble(swindonAmount.getText()) *2.1;
                itemcost[4] = Double.parseDouble(yorkAmount.getText()) *1.2;
                itemcost[5] = Double.parseDouble(blackAmount.getText()) *1.6;
                itemcost[6] = Double.parseDouble(lagosAmount.getText()) *1.72;
                itemcost[7] = Double.parseDouble(killburnAmount.getText()) *3.5;
                itemcost[8] = Double.parseDouble(carltonAmount.getText()) *2.58;

                itemcost[9]=itemcost[0]+itemcost[1]+itemcost[2]+itemcost[3]+itemcost[4]+itemcost[5]+itemcost[6]+itemcost[7]+itemcost[8];
                String iTax = String.format("%.2f €", itemcost[9]/100);
                String iSubTotal = String.format("%.2f €", itemcost[9]);
                String iTotal = String.format("%.2f €", itemcost[9] + itemcost[9]/100);

                taxResult.setText(iTax);
                subtotal.setText(iSubTotal);
                totalResult.setText(iTotal);

                bill.setEnabled(true);

                int refs=2456+ (int) (Math.random()*32345);

                Calendar timer = Calendar.getInstance();
                timer.getTime();
                SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
                time.format(timer.getTime());
                SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
                date.format(timer.getTime());

                bill.setText(
                        "\tCustomer Billing System by k_try\n" +
                                "Reference:\t\t\t" + refs +
                                "\n===========================================\t" +
                                "\n===========================================\t" +
                                "\nCustomer Ref: \t\t" + textPane1.getText() +
                                "\nFirstname: \t\t\t" + textPane2.getText() +
                                "\nSurname: \t\t\t" + textPane3.getText() +
                                "\nKim's Cake: \t\t\t" + kimAmount.getText() +
                                "\nKerry's Cake: \t\t" + kerryAmount.getText() +
                                "\nCoffee's Cake: \t\t" + coffeeAmount.getText() +
                                "\nSwindow's Cake: \t\t" + swindonAmount.getText() +
                                "\nYork's Cake: \t\t\t" + yorkAmount.getText() +
                                "\nBlack's Cake: \t\t" + blackAmount.getText() +
                                "\nLagos's Cake: \t\t" + lagosAmount.getText() +
                                "\nKillburn's Cake: \t\t" + killburnAmount.getText() +
                                "\nCarlton's Cake: \t\t" + carltonAmount.getText() +
                                "\nTax: \t\t\t" + iTax +
                                "\nSub: \t\t\t" +iSubTotal +
                                "\nTotal: \t\t\t" + iTotal +
                                "\n===========================================\t" +
                                "\nDate: " + date.format(timer.getTime()) +
                                "\t\tTime: " + time.format(timer.getTime()) +
                                "\n\n\t Thank you for shopping at k_tryShop"
                );

            }
        });

        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int ref=2456+ (int) (Math.random()*32345);
                String cRef="";
                cRef +=ref + 1560;

                textPane1.setText(cRef);
                textPane2.setText(null);
                textPane3.setText(null);
                textPane4.setText(null);
                textPane5.setText(null);
                textPane6.setText(null);
                textPane7.setText(null);
                nationality.setSelectedIndex(0);
                day.setSelectedIndex(0);
                mont.setSelectedIndex(0);
                year.setSelectedIndex(0);
                gender.setSelectedIndex(0);
                checkIn.setText(null);
                checkOut.setText(null);
                meal.setSelectedIndex(0);
                room.setSelectedIndex(0);

                kimAmount.setText(defaultNum);
                kerryAmount.setText(defaultNum);
                coffeeAmount.setText(defaultNum);
                swindonAmount.setText(defaultNum);
                blackAmount.setText(defaultNum);
                killburnAmount.setText(defaultNum);
                carltonAmount.setText(defaultNum);
                lagosAmount.setText(defaultNum);
                yorkAmount.setText(defaultNum);
                taxResult.setText("0");
                subtotal.setText("0");
                totalResult.setText("0");

                kim.setSelected(false);
                kerry.setSelected(false);
                coffee.setSelected(false);
                swindon.setSelected(false);
                black.setSelected(false);
                killburn.setSelected(false);
                carlton.setSelected(false);
                lagos.setSelected(false);
                york.setSelected(false);

                bill.setText("");


            }
        });

        background3.add(background3_1);
        background3_1.add(print);
        background3_1.add(exit);
        background3.add(bill);

        print.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    bill.print();
                } catch (PrinterException eprint) {
                    System.err.format("No Printer found", eprint.getMessage());
                }
            }
        });


        frame.add(background);
        background.add(background1);
        background.add(background2);
        background.add(background3);




        frame.setTitle("k_try Customer Billing");
        frame.setSize(1300, 800);
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}