/* 
    Project     : Field Gmae Store (Java swing using filedata)
    
    Author      : Nawin Khamchun ( CODING & UI DESIGN )
    Contact     : https://www.facebook.com/Pluto3399/
    
    Design      : Pannawat Imsin ( UI DESIGN ) 
    Contact     : https://www.facebook.com/Pannawat.kj

*/

import java.awt.Container;
import java.awt.FlowLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class pageManagerCustomer extends JPanel {

    private static Container Container;

    public pageManagerCustomer() {

        Container = Main.aContainer;
        this.setPreferredSize(new Dimension(1820, 980));
        this.add( panelHeader() );
        this.add( panelCenter() );

        Container.add(this);
        Container.validate();
        Container.repaint();

    }

    private JPanel panelHeader() {

        JPanel panelHeader = new JPanel(null);
        panelHeader.setPreferredSize(new Dimension(1820, 200));

        // region // ! [ EXIT & LOGOUT & TITLE ] ! \\
        JLabel labelTitle = new JLabel("Field Gaming Store", SwingConstants.CENTER);
        labelTitle.setFont(new Font("Tahoma", Font.BOLD, 40));
        labelTitle.setBounds(510, 10, 800, 120);
        labelTitle.setOpaque(true);
        labelTitle.setBackground(new Color(67, 56, 202));
        labelTitle.setBorder(BorderFactory.createLineBorder(Color.BLACK, 10));
        labelTitle.setForeground(Color.WHITE);

        ImageIcon imagesLogout = new ImageIcon("img/back.png");
        JButton btnLogout = new JButton(imagesLogout);
        btnLogout.setBounds(10, 8, 50, 50);
        btnLogout.setFocusPainted(false);
        btnLogout.setContentAreaFilled(false);
        btnLogout.setBorderPainted(false);
        btnLogout.setFocusable(true);
        btnLogout.setOpaque(true);
        btnLogout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Container.removeAll();
                new pageLogin();
            }
        });

        JLabel labelLogout = new JLabel("ออกจากระบบ");
        labelLogout.setFont(new Font("Tahoma", Font.BOLD, 25));
        labelLogout.setBounds(70, 5, 300, 60);

        ImageIcon ImageExit = new ImageIcon("img/exit.png");
        JButton btnExit = new JButton(ImageExit);
        btnExit.setBounds(1760, 8, 50, 50);
        btnExit.setFocusPainted(false);
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
        btnExit.setFocusable(true);
        btnExit.setOpaque(true);
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selection = JOptionPane.showConfirmDialog(
                        null,
                        "You sure to exit this program",
                        "Confirm",
                        JOptionPane.YES_NO_OPTION);

                if (selection == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
        // endregion // ! [ BUTTON : EXIT & LOGOUT - TITLE ] ! \\

        // region // ! [ MENU ] ! \\

        JPanel panelMenu = new JPanel(null);
        panelMenu.setBounds(500, 140, 820, 60);
        panelMenu.setBorder(BorderFactory.createLineBorder(Color.BLACK, 10));

        JButton[] buttonMainMenu = new JButton[4];
        for (int i = 0; i < 4; i++) {

            String nameMenu[] = { "หน้าแรก", "สั่งซื้อสินค้า", "เมนูหลังบ้าน", "สรุปยอดรายวัน" };
            buttonMainMenu[i] = new JButton(nameMenu[i]);
            buttonMainMenu[i].setBackground(new Color(67, 56, 202));
            buttonMainMenu[i].setFont(new Font("Tahoma", Font.BOLD, 20));
            buttonMainMenu[i].setBounds((200 * i) + 10, 10, 200, 40);
            buttonMainMenu[i].setForeground(Color.white);
            buttonMainMenu[i].setFocusPainted(false);
            buttonMainMenu[i].setContentAreaFilled(false);
            buttonMainMenu[i].setBorderPainted(false);
            buttonMainMenu[i].setFocusable(true);
            buttonMainMenu[i].setOpaque(true);
                
            panelMenu.add(buttonMainMenu[i]);

        }
        buttonMainMenu[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Container.removeAll();
                new pageMainMenu();

            }
        });
        buttonMainMenu[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Container.removeAll();
                new pageOrderProduct();
                Container.validate();
                Container.repaint();

            }
        });
        buttonMainMenu[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Container.removeAll();
                new pageManagerMenu();
                Container.validate();
                Container.repaint();
            }
        });
        buttonMainMenu[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Container.removeAll();
                new pageSummary();
                Container.validate();
                Container.repaint();
            }
        });

        buttonMainMenu[0].addMouseListener(new MouseListener() {

            @Override
            public void mouseEntered(MouseEvent e) {
                
                    buttonMainMenu[0].setForeground(Color.BLACK);
                // labelInfomation[0].setBackground(new Color(60, 205, 42));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
                    buttonMainMenu[0].setForeground(Color.WHITE);
                // labelInfomation[0].setBackground(new Color(71, 255, 42));
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                
                
            }

            @Override
            public void mousePressed(MouseEvent e) {

                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
                
            }

        });
        buttonMainMenu[1].addMouseListener(new MouseListener() {

            @Override
            public void mouseEntered(MouseEvent e) {
                
                    buttonMainMenu[1].setForeground(Color.BLACK);
                // labelInfomation[0].setBackground(new Color(60, 205, 42));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
                    buttonMainMenu[1].setForeground(Color.WHITE);
                // labelInfomation[0].setBackground(new Color(71, 255, 42));
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                
                
            }

            @Override
            public void mousePressed(MouseEvent e) {

                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
                
            }

        });
        buttonMainMenu[2].addMouseListener(new MouseListener() {

            @Override
            public void mouseEntered(MouseEvent e) {
                
                    buttonMainMenu[2].setForeground(Color.BLACK);
                // labelInfomation[0].setBackground(new Color(60, 205, 42));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
                    buttonMainMenu[2].setForeground(Color.WHITE);
                // labelInfomation[0].setBackground(new Color(71, 255, 42));
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                
                
            }

            @Override
            public void mousePressed(MouseEvent e) {

                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
                
            }

        });
        buttonMainMenu[3].addMouseListener(new MouseListener() {

            @Override
            public void mouseEntered(MouseEvent e) {
                
                    buttonMainMenu[3].setForeground(Color.BLACK);
                // labelInfomation[0].setBackground(new Color(60, 205, 42));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
                    buttonMainMenu[3].setForeground(Color.WHITE);
                // labelInfomation[0].setBackground(new Color(71, 255, 42));
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                
                
            }

            @Override
            public void mousePressed(MouseEvent e) {

                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
                
            }

        });
        // endregion // ! [ MENU ] ! \\

        panelHeader.add(btnExit);
        panelHeader.add(btnLogout);
        panelHeader.add(labelLogout);
        panelHeader.add(labelTitle);
        panelHeader.add(panelMenu);

        return panelHeader;
    }

    private JPanel panelCenter() {

        JPanel panelCenter = new JPanel(null);
        panelCenter.setPreferredSize(new Dimension(1600, 750));
        panelCenter.setBackground(Color.WHITE);
        panelCenter.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        
        // region // ! [ MENU ] ! \\

        JPanel panelMenu = new JPanel(null);
        panelMenu.setBounds(50, 15, 1500, 80);
        panelMenu.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        panelMenu.setBackground(Color.BLACK);

        JButton[] buttonMainMenu = new JButton[3];
        for (int i = 0; i < 3; i++) {

            String nameMenu[] = { "จัดสินค้า", "จัดการข้อมูลพนักงาน", "จัดการข้อมูลลูกค้า" };
            buttonMainMenu[i] = new JButton(nameMenu[i]);
            // buttonMainMenu[i].setBackground(new Color(67, 56, 202));
            buttonMainMenu[i].setBackground(new Color(234, 126, 56));
            buttonMainMenu[i].setFont(new Font("Tahoma", Font.BOLD, 20));
            buttonMainMenu[i].setForeground(Color.white);
            buttonMainMenu[i].setFocusPainted(false);
            buttonMainMenu[i].setBorderPainted(false);
            buttonMainMenu[i].setFocusable(true);
            buttonMainMenu[i].setContentAreaFilled(false);
            buttonMainMenu[i].setOpaque(true);

            panelMenu.add(buttonMainMenu[i]);

        }

        buttonMainMenu[0].setBounds(5,5,500,70);
        buttonMainMenu[1].setBounds(505,5,500,70);
        buttonMainMenu[2].setBounds(995,5,500,70);
        
        buttonMainMenu[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Container.removeAll();
                new pageManagerProduct();

            }
        });
        buttonMainMenu[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Container.removeAll();
                new pageManagerEmployee();

            }
        });
        buttonMainMenu[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Container.removeAll();
                // new pageManagerCustomer();
            }
        });

        buttonMainMenu[0].addMouseListener(new MouseListener() {

            @Override
            public void mouseEntered(MouseEvent e) {
                
                    buttonMainMenu[0].setForeground(Color.BLACK);
                // labelInfomation[0].setBackground(new Color(60, 205, 42));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
                    buttonMainMenu[0].setForeground(Color.WHITE);
                // labelInfomation[0].setBackground(new Color(71, 255, 42));
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                
                
            }

            @Override
            public void mousePressed(MouseEvent e) {

                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
                
            }

        });
        buttonMainMenu[1].addMouseListener(new MouseListener() {

            @Override
            public void mouseEntered(MouseEvent e) {
                
                    buttonMainMenu[1].setForeground(Color.BLACK);
                // labelInfomation[0].setBackground(new Color(60, 205, 42));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
                    buttonMainMenu[1].setForeground(Color.WHITE);
                // labelInfomation[0].setBackground(new Color(71, 255, 42));
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                
                
            }

            @Override
            public void mousePressed(MouseEvent e) {

                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
                
            }

        });
        buttonMainMenu[2].addMouseListener(new MouseListener() {

            @Override
            public void mouseEntered(MouseEvent e) {
                
                    buttonMainMenu[2].setForeground(Color.BLACK);
                // labelInfomation[0].setBackground(new Color(60, 205, 42));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
                    buttonMainMenu[2].setForeground(Color.WHITE);
                // labelInfomation[0].setBackground(new Color(71, 255, 42));
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                
                
            }

            @Override
            public void mousePressed(MouseEvent e) {

                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
                
            }

        });

        // endregion // ! [ MENU ] ! \\

        //region // ! [ panelTableCustomerList ] ! \\

        JPanel panelTableCustomerList = new JPanel(null);
        panelTableCustomerList.setLayout(new FlowLayout());
        panelTableCustomerList.setBackground(new Color(0, 0, 0, 0));
        panelTableCustomerList.setBounds(50, 100, 800, 440);
        // panelTableCustomerList.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        String[] columnNames = { "ชื่อ - นามสกุล", "ที่อยู่", "เบอร์โทรศัพท์", "E-mail" };
        new managerData();
        Object[][] data = managerData.getDataCustomer();
        DefaultTableModel model = new DefaultTableModel(data, columnNames) {
            
            @Override
            public boolean isCellEditable(int row, int column){  
                return true;  
            }
    
        };

        JTable tableCustomerList = new JTable(model);
        tableCustomerList.setFont(new Font("Tahoma", Font.PLAIN, 16));
        tableCustomerList.setPreferredScrollableViewportSize(new Dimension(775, 365));
        tableCustomerList.setBackground(Color.WHITE);
        tableCustomerList.setBounds(0, 0, 790, 2000);
        tableCustomerList.setFillsViewportHeight(true);
        tableCustomerList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tableCustomerList.setRowHeight(30);
        tableCustomerList.setFocusable(false);
        tableCustomerList.setShowHorizontalLines(false);
        tableCustomerList.setSelectionBackground(new Color(232, 57, 95));

        tableCustomerList.getTableHeader().setPreferredSize(new Dimension(50, 50));
        tableCustomerList.getTableHeader().setReorderingAllowed(false);
        tableCustomerList.getTableHeader().setForeground(Color.WHITE);
        tableCustomerList.getTableHeader().setForeground(Color.WHITE);
        tableCustomerList.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 18));
        tableCustomerList.getTableHeader().setBackground(new Color(234, 126, 56));
        tableCustomerList.getTableHeader().setReorderingAllowed(false);

        tableCustomerList.getColumnModel().getColumn(0).setPreferredWidth(200);
        tableCustomerList.getColumnModel().getColumn(1).setPreferredWidth(200);
        tableCustomerList.getColumnModel().getColumn(2).setPreferredWidth(200);
        tableCustomerList.getColumnModel().getColumn(3).setPreferredWidth(200);

        DefaultTableCellRenderer alignTextTable = new DefaultTableCellRenderer();
        alignTextTable.setHorizontalAlignment(JLabel.CENTER);
        tableCustomerList.getColumnModel().getColumn(0).setCellRenderer(alignTextTable);
        tableCustomerList.getColumnModel().getColumn(1).setCellRenderer(alignTextTable);
        tableCustomerList.getColumnModel().getColumn(2).setCellRenderer(alignTextTable);
        tableCustomerList.getColumnModel().getColumn(3).setCellRenderer(alignTextTable);

        JScrollPane scrollPane = new JScrollPane(tableCustomerList);
        scrollPane.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        panelTableCustomerList.add(scrollPane);

        //endregion // ! [ panelTableCustomerList ] ! \\

        //region // ! [ panelAddCustomer ] ! \\

        JPanel panelAddCustomer = new JPanel(null);
        panelAddCustomer.setBounds(900, 100, 650, 600);
        panelAddCustomer.setBackground(new Color(0,0,0,0));
        panelAddCustomer.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        JLabel labelTitle = new JLabel(" จัดการข้อมูลลูกค้า", SwingConstants.CENTER);
        labelTitle.setFont(new Font("Tahoma", Font.BOLD, 32));
        labelTitle.setBounds(0, 0, 650, 100);
        labelTitle.setOpaque(true);
        labelTitle.setBackground(new Color(234, 126, 56));
        labelTitle.setForeground(Color.WHITE);
        labelTitle.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        JLabel labelnamecustomer = new JLabel("ชื่อ - นามสกุล ( Name - Surename )", SwingConstants.LEFT);
        labelnamecustomer.setOpaque(false);
        labelnamecustomer.setBounds(100, 100, 550, 50);
        labelnamecustomer.setFont(new Font("Tahoma", Font.BOLD, 20));

        JTextField FieldCustomer = new JTextField(20);
        FieldCustomer.setBounds(100, 150, 450, 50);
        FieldCustomer.setFont(new Font("Tahoma", Font.BOLD, 20));


        JLabel labelAddress = new JLabel("ที่อยู่ ( Address )", SwingConstants.LEFT);
        labelAddress.setOpaque(false);
        labelAddress.setBounds(100, 200, 450, 50);
        labelAddress.setFont(new Font("Tahoma", Font.BOLD, 20));

        JTextField fieldAddress = new JTextField(20);
        fieldAddress.setBounds(100, 250, 450, 50);
        fieldAddress.setFont(new Font("Tahoma", Font.BOLD, 20));


        JLabel labelTelPhoneNumber = new JLabel("เบอร์โทรศัพท์ ( TelPhone Number )", SwingConstants.LEFT);
        labelTelPhoneNumber.setOpaque(false);
        labelTelPhoneNumber.setBounds(100, 300, 450, 50);
        labelTelPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 20));

        JTextField fieldTelPhoneNumber = new JTextField(20);
        fieldTelPhoneNumber.setBounds(100, 350, 450, 50);
        fieldTelPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 20));

        JLabel labelEmail = new JLabel("อีเมลม์ ( Email )", SwingConstants.LEFT);
        labelEmail.setOpaque(false);
        labelEmail.setBounds(100, 400, 450, 50);
        labelEmail.setFont(new Font("Tahoma", Font.BOLD, 20));

        JTextField fieldEmail = new JTextField(20);
        fieldEmail.setBounds(100, 450, 450, 50);
        fieldEmail.setFont(new Font("Tahoma", Font.BOLD, 20));

        ImageIcon imagesbtnAdd = new ImageIcon("img/add_button.png");
        JButton btnAdd = new JButton("ADD");
        btnAdd.setBackground(Color.BLACK);
        btnAdd.setForeground(Color.WHITE);
        btnAdd.setFocusPainted(false);
        btnAdd.setBorderPainted(false);
        btnAdd.setIcon(imagesbtnAdd);
        btnAdd.setFocusable(true);
        btnAdd.setBounds(250, 510, 150, 80);
        btnAdd.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnAdd.setContentAreaFilled(true);
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (FieldCustomer.getText().toString().isEmpty() 
                || fieldAddress.getText().toString().isEmpty()
                || fieldTelPhoneNumber.getText().toString().isEmpty()
                || fieldEmail.getText().toString().isEmpty()) {

                    JLabel labelMessage = new JLabel("โปรดกรอกข้อมูลไห้ครบ",SwingConstants.CENTER);
                    labelMessage.setFont(new Font("Tahoma", Font.BOLD, 20));

                    JOptionPane.showMessageDialog(
                        null, 
                        labelMessage, 
                        "Error",
                        JOptionPane.ERROR_MESSAGE);

                } else {

                    String customerName = FieldCustomer.getText().toString();
                    String customerAddress = fieldAddress.getText().toString();
                    String customerPhoneNumber = fieldTelPhoneNumber.getText().toString();
                    String customerEmail = fieldEmail.getText().toString();

                    Object[] newRow = { customerName, customerAddress, customerPhoneNumber, customerEmail };
                    model.addRow(newRow);

                    FieldCustomer.setText(null);
                    fieldAddress.setText(null);
                    fieldTelPhoneNumber.setText(null);
                    fieldEmail.setText(null);

                }
            }
        });


        panelAddCustomer.add(labelTitle);
        panelAddCustomer.add(labelnamecustomer);
        panelAddCustomer.add(FieldCustomer);

        panelAddCustomer.add(labelAddress);
        panelAddCustomer.add(fieldAddress);

        panelAddCustomer.add(labelTelPhoneNumber);
        panelAddCustomer.add(fieldTelPhoneNumber);

        panelAddCustomer.add(labelEmail);
        panelAddCustomer.add(fieldEmail);

        panelAddCustomer.add(btnAdd);

        //endregion // ! [ panelAddCustomer ] ! \\

        //region // ! [ panelControl ] ! \\

        JPanel panelControl = new JPanel(null);
        // panelControl.setPreferredSize(new Dimension(900, 100)); // set panel
        // panelControl.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); // จัดlayout ตรงกลาง
        panelControl.setBackground(Color.white);
        panelControl.setLayout(null);
        panelControl.setBorder(new LineBorder(Color.BLACK, 3)); // จัด border สีดำ
        panelControl.setBounds(50, 550, 800, 150);

        JLabel labelTitleControl = new JLabel("จัดการตาราง", SwingConstants.CENTER);
        labelTitleControl.setFont(new Font("Tahoma", Font.BOLD, 32));
        labelTitleControl.setBounds(0, 0, 800, 75);
        labelTitleControl.setOpaque(true);
        labelTitleControl.setBackground(new Color(234, 126, 56));
        labelTitleControl.setForeground(Color.WHITE);
        labelTitleControl.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        ImageIcon image1 = new ImageIcon("img/trash-bin.png");
        JButton btnremove = new JButton(image1);
        btnremove.setBackground(Color.white);
        btnremove.setBounds(100, 80, 60, 60);
        btnremove.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnremove.setFocusPainted(false);
        btnremove.setBorderPainted(false);
        btnremove.setContentAreaFilled(false);
        btnremove.setFocusable(true);
        btnremove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tableCustomerList.getSelectedRow() == -1) {

                    JLabel LabelMessage = new JLabel("โปรดเลือกบรรทัดที่จะลบ");
                    LabelMessage.setFont(new Font("Tahoma", Font.BOLD, 16));

                    JOptionPane.showMessageDialog(
                        null, 
                        LabelMessage, 
                        "DELETE",
                        JOptionPane.ERROR_MESSAGE);

                } else {
                    
                    JLabel LabelMessage = new JLabel("คุณต้องการเลือกบรรทัดนี้ใช้ไหม ?");
                    LabelMessage.setFont(new Font("Tahoma", Font.BOLD, 16));
    
                    int selection = JOptionPane.showConfirmDialog(
                        null, 
                        LabelMessage, 
                        "Confirm",
                        JOptionPane.YES_NO_OPTION);
                    if (selection == JOptionPane.YES_OPTION) {

                        int[] selectedRows = tableCustomerList.getSelectedRows();
                        for (int i = selectedRows.length - 1; i >= 0; i--) {
                            model.removeRow(selectedRows[i]);
                            ;
                        }
                    }
                }

            }

        });

        JLabel labelremove = new JLabel("ลบข้อมูล");
        labelremove.setFont(new Font("Tahoma", Font.BOLD, 20));
        labelremove.setBounds(170, 80, 300, 60);

        ImageIcon image2 = new ImageIcon("img/save-icon_2.png");
        JButton btnsave = new JButton(image2);
        btnsave.setBackground(Color.white);
        btnsave.setFocusPainted(false);
        btnsave.setBorderPainted(false);
        btnsave.setContentAreaFilled(false);
        btnsave.setFocusable(true);
        btnsave.setBounds(300, 80, 60, 60);
        btnsave.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnsave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JLabel saveMessage = new JLabel("ยืนยันการบันทึกข้อมูล");
                saveMessage.setFont(new Font("Tahoma", Font.BOLD, 16));
                int selection = JOptionPane.showConfirmDialog(
                        null,
                        saveMessage,
                        "Confirm",
                        JOptionPane.YES_NO_OPTION);

                if (selection == JOptionPane.YES_OPTION) {
                    
                    int rows = tableCustomerList.getRowCount();
                    int cols = tableCustomerList.getColumnCount();
    
                    String[][] newData = new String[rows][cols];
    
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            newData[i][j] = model.getValueAt(i, j).toString();
                        }
                    }
    
                    managerData.saveCustomertData(newData);
                
                }

            }
        });

        JLabel labelsave = new JLabel("บันทึกข้อมูล");
        labelsave.setFont(new Font("Tahoma", Font.BOLD, 20));
        labelsave.setBounds(370, 80, 300, 60);

        ImageIcon image3 = new ImageIcon("img/icons8-remove-96.png");
        JButton btnRemoveAll = new JButton(image3);
        btnRemoveAll.setBackground(Color.white);
        btnRemoveAll.setBounds(500, 80, 60, 60);
        btnRemoveAll.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnRemoveAll.setFocusPainted(false);
        btnRemoveAll.setBorderPainted(false);
        btnRemoveAll.setContentAreaFilled(false);
        btnRemoveAll.setFocusable(true);
        btnRemoveAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
 
                    JLabel LabelMessage = new JLabel("คุณต้องการเลือกบรรทัดนี้ใช้ไหม ?");
                    LabelMessage.setFont(new Font("Tahoma", Font.BOLD, 16));
    
                    int selection = JOptionPane.showConfirmDialog(
                        null, 
                        LabelMessage, 
                        "Confirm",
                        JOptionPane.YES_NO_OPTION);
                    if (selection == JOptionPane.YES_OPTION) {

                        int rows = tableCustomerList.getRowCount();

                        for (int i = rows-1; i >= 0; i--) {
                            model.removeRow(i);
                        }

                    }

            }

        });

        JLabel labelRemoveAll = new JLabel("ลบข้อมูลทั้งหมด");
        labelRemoveAll.setFont(new Font("Tahoma", Font.BOLD, 20));
        labelRemoveAll.setBounds(570, 80, 300, 60);

        panelControl.add(labelTitleControl);
        panelControl.add(btnremove);
        panelControl.add(labelremove);
        panelControl.add(btnsave);
        panelControl.add(labelsave);
        panelControl.add(btnRemoveAll);
        panelControl.add(labelRemoveAll);

        //endregion // ! [ panelControl ] ! \\

        panelCenter.add(panelMenu);
        panelCenter.add(panelAddCustomer);
        panelCenter.add(panelTableCustomerList);
        panelCenter.add(panelControl);

        return panelCenter;
    }

}
