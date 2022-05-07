/*
 * Created by JFormDesigner on Wed Apr 06 18:22:34 TRT 2022
 */

package views;

import java.awt.event.*;
import javax.swing.border.*;

import models.CustomerServiceImpl;
import models.DasbordImpl;
import models.ServiceImpl;
import models.UserImpl;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author unknown
 */
public class Dashbord extends Base {
    CustomerServiceImpl customerServiceImplFirst=new CustomerServiceImpl(2);
    CustomerServiceImpl customerServiceImplReady=new CustomerServiceImpl(3);

    public Dashbord() {
        initComponents();
        lblName.setText("Sayın "+UserImpl.name);
        tblNotCompleted.setModel(customerServiceImplFirst.serviceCustomerTable(null));
        tblCompleted.setModel(customerServiceImplReady.serviceCustomerTable(null));
    }

    private void btnCustomerAddClicked(ActionEvent e) {
        CustomerAdd customerAdd=new CustomerAdd();
        customerAdd.setVisible(true);
        dispose();
    }

    private void btnAddServiceClicked(ActionEvent e) {
        ServicesAdd services=new ServicesAdd();
        services.setVisible(true);
        dispose();
    }

    private void btnArchiveClicked(ActionEvent e) {
        Archive archive=new Archive();
        archive.setVisible(true);
        dispose();

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        lblName = new JLabel();
        panel1 = new JPanel();
        btnCustomerAdd = new JButton();
        btnAddService = new JButton();
        btnArchive = new JButton();
        panel2 = new JPanel();
        scrollPane1 = new JScrollPane();
        tblNotCompleted = new JTable();
        panel3 = new JPanel();
        scrollPane2 = new JScrollPane();
        tblCompleted = new JTable();
        label3 = new JLabel();
        label4 = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/programIcon.png")).getImage());
        setResizable(false);
        Container contentPane = getContentPane();

        //---- lblName ----
        lblName.setText(" ");
        lblName.setFont(new Font("Segoe UI", Font.BOLD, 14));
        lblName.setHorizontalAlignment(SwingConstants.RIGHT);
        lblName.setForeground(SystemColor.windowText);

        //======== panel1 ========
        {
            panel1.setBackground(SystemColor.activeCaption);

            //---- btnCustomerAdd ----
            btnCustomerAdd.setIcon(new ImageIcon(getClass().getResource("/userAddIcon.png")));
            btnCustomerAdd.setBackground(SystemColor.activeCaption);
            btnCustomerAdd.setToolTipText("Add Customer");
            btnCustomerAdd.setFont(new Font("Segoe UI", Font.BOLD, 14));
            btnCustomerAdd.setFocusable(false);
            btnCustomerAdd.setBorder(null);
            btnCustomerAdd.addActionListener(e -> btnCustomerAddClicked(e));

            //---- btnAddService ----
            btnAddService.setIcon(new ImageIcon(getClass().getResource("/technicalServiceIcon.png")));
            btnAddService.setBackground(SystemColor.activeCaption);
            btnAddService.setToolTipText("Add Service");
            btnAddService.setFont(new Font("Segoe UI", Font.BOLD, 14));
            btnAddService.setFocusable(false);
            btnAddService.setBorder(null);
            btnAddService.addActionListener(e -> btnAddServiceClicked(e));

            //---- btnArchive ----
            btnArchive.setIcon(new ImageIcon(getClass().getResource("/archiveIcon.png")));
            btnArchive.setBackground(SystemColor.activeCaption);
            btnArchive.setToolTipText("Archive");
            btnArchive.setFont(new Font("Segoe UI", Font.BOLD, 14));
            btnArchive.setFocusable(false);
            btnArchive.setBorder(null);
            btnArchive.addActionListener(e -> btnArchiveClicked(e));

            //======== panel2 ========
            {
                panel2.setBorder(new TitledBorder(null, "Not Completed Services", TitledBorder.LEFT, TitledBorder.DEFAULT_POSITION));

                //======== scrollPane1 ========
                {
                    scrollPane1.setViewportView(tblNotCompleted);
                }

                GroupLayout panel2Layout = new GroupLayout(panel2);
                panel2.setLayout(panel2Layout);
                panel2Layout.setHorizontalGroup(
                    panel2Layout.createParallelGroup()
                        .addComponent(scrollPane1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
                );
                panel2Layout.setVerticalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))
                );
            }

            //======== panel3 ========
            {
                panel3.setBorder(new TitledBorder(null, "Completed Services", TitledBorder.LEFT, TitledBorder.DEFAULT_POSITION));

                //======== scrollPane2 ========
                {
                    scrollPane2.setViewportView(tblCompleted);
                }

                GroupLayout panel3Layout = new GroupLayout(panel3);
                panel3.setLayout(panel3Layout);
                panel3Layout.setHorizontalGroup(
                    panel3Layout.createParallelGroup()
                        .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
                );
                panel3Layout.setVerticalGroup(
                    panel3Layout.createParallelGroup()
                        .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
                );
            }

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(btnCustomerAdd, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAddService, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnArchive, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(291, Short.MAX_VALUE))
                    .addComponent(panel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(btnArchive, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddService, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCustomerAdd, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addComponent(panel2, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel3, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(23, Short.MAX_VALUE))
            );
        }

        //---- label3 ----
        label3.setText("KIRCALO");
        label3.setHorizontalAlignment(SwingConstants.LEFT);
        label3.setFont(new Font("Kristen ITC", Font.BOLD, 26));
        label3.setForeground(SystemColor.textHighlight);

        //---- label4 ----
        label4.setText("TECHNICAL SERVICE");
        label4.setHorizontalAlignment(SwingConstants.LEFT);
        label4.setFont(new Font("Segoe UI Black", Font.BOLD, 22));
        label4.setForeground(SystemColor.textHighlight);

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label3, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(label4, GroupLayout.PREFERRED_SIZE, 323, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                    .addComponent(lblName, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(lblName)
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel lblName;
    private JPanel panel1;
    private JButton btnCustomerAdd;
    private JButton btnAddService;
    private JButton btnArchive;
    private JPanel panel2;
    private JScrollPane scrollPane1;
    public JTable tblNotCompleted;
    private JPanel panel3;
    private JScrollPane scrollPane2;
    private JTable tblCompleted;
    private JLabel label3;
    private JLabel label4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
