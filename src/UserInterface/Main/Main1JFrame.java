package UserInterface.Main;

import database.DbUtils;
import java.util.List;
import javax.swing.JOptionPane;
import model.Booking;
import model.BusinessEvent;
import model.Customer;
import model.Services;
import model.HealthClub;
import model.Hotel;
import model.Manager;
import model.Franchise;
import model.Restaurant;
import model.SystemAdmin;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import UserInterface.Role.Customer.AddingServicesJPanel;
import UserInterface.Role.Customer.BookingEventJPanel;
import UserInterface.Role.Customer.BookRoomServicesJPanel;
import UserInterface.Role.Customer.CustomerStartJPanel;
import UserInterface.Role.Customer.HealthServiceClubJPanel;
import UserInterface.Role.Customer.HotelServicesPanel;
import UserInterface.Role.Customer.ManagingBookingJPanel;
import UserInterface.Role.Customer.RestuarantServicesJPanel;
import UserInterface.Role.Customer.ViewingServicesDetailJPanel;
import UserInterface.Role.EventManager.EventsManagerWorkJPanel;
import UserInterface.Role.EventManager.ManageOrgAdminWorkForEventJPanel;
import UserInterface.Role.EventManager.ManageOrgForEventJPanel;
import UserInterface.Role.EventManager.ViewTasksEventJPanel;
import UserInterface.Role.HealthClubManager.ViewTaskWorkJPanel;
import UserInterface.Role.HealthClubManager.HealthClubsManagerWorkJPanel;
import UserInterface.Role.RestaurantManager.ManageOrgRestaurantJPanel;
import UserInterface.Role.HealthClubManager.OrgAdminWorkJPanel;
import UserInterface.Role.HealthClubManager.ManageOrganisationWorkJPanel;
import UserInterface.Role.HotelManager.HotelManagerWorkJPanel;
import UserInterface.Role.HotelManager.ManageOrgAdminForHotelJPanel;
import UserInterface.Role.HotelManager.ManageOrgForHotelJPanel;
import UserInterface.Role.HotelManager.ManageRoomWorkJPanel;
import UserInterface.Role.HotelManager.ViewTaskHotelJPanel;
import UserInterface.Role.RestaurantManager.AddingOrderJPanel;
import UserInterface.Role.RestaurantManager.ManagingOrganisationAdminRestauarantJPanel;
import UserInterface.Role.RestaurantManager.RestaurantManagerWorkJPanel;
import UserInterface.Role.RestaurantManager.ViewTaskRestaurantWorkJPanel;
import UserInterface.SysAdmin.ManagingCustomerWorkJPanel;
import UserInterface.SysAdmin.ManagingServiceJPanel;
import UserInterface.SysAdmin.ManagingManagersJPanel;
import UserInterface.SysAdmin.ManagingFranchiseJPanel;
import UserInterface.SysAdmin.SysAdminJPanel;
import UserInterface.ConfirmWorkReq.ConfirmWorkRequestEventJPanel;


public class Main1JFrame extends javax.swing.JFrame {

    private SystemAdmin systemAdmin;
    private String userName;
    private String password;

    public Main1JFrame() {
        
        setBounds ( 0, 0 , 1500, 1000);
        setLayout(null);
        
        initComponents();
        this.systemAdmin = DbUtils.getInstance().retrieveSystem();
        logoutBtn.setEnabled(false);
        
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("/ui/main/bg.jpeg"));
//        Image i2 = i1.getImage().getScaledInstance(1500, 1000, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon (i2);
//        JLabel Image = new JLabel (i3);
//        Image.setBounds(0, 0, 1950, 1000); 
//        add(Image);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        ControlPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        loginBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        WorkArea = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ControlPanel.setBackground(new java.awt.Color(102, 204, 255));
        ControlPanel.setPreferredSize(new java.awt.Dimension(138, 813));
        ControlPanel.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USERNAME");
        ControlPanel.add(jLabel1);
        jLabel1.setBounds(6, 165, 101, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PASSWORD");
        ControlPanel.add(jLabel2);
        jLabel2.setBounds(6, 273, 106, 22);

        usernameField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ControlPanel.add(usernameField);
        usernameField.setBounds(0, 205, 233, 38);

        loginBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loginBtn.setText("LOGIN");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        ControlPanel.add(loginBtn);
        loginBtn.setBounds(6, 379, 77, 43);

        logoutBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logoutBtn.setText("LOGOUT");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        ControlPanel.add(logoutBtn);
        logoutBtn.setBounds(6, 462, 89, 43);

        passwordField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ControlPanel.add(passwordField);
        passwordField.setBounds(0, 313, 233, 35);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Main/1.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        ControlPanel.add(jLabel3);
        jLabel3.setBounds(0, -140, 790, 1358);

        jSplitPane.setLeftComponent(ControlPanel);

        WorkArea.setBackground(new java.awt.Color(0, 0, 0));
        WorkArea.setLayout(null);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Main/gif_1.gif"))); // NOI18N
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        WorkArea.add(jLabel5);
        jLabel5.setBounds(550, -30, 1210, 780);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jLabel6.setText("HOTEL MANAGEMENT SYSTEM!");
        WorkArea.add(jLabel6);
        jLabel6.setBounds(420, 90, 730, 70);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Main/392561-blurred-gradient-748x421.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        WorkArea.add(jLabel4);
        jLabel4.setBounds(0, -170, 1560, 1290);

        jSplitPane.setRightComponent(WorkArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed

        System.out.println("Logout called.");
        DbUtils.getInstance().storeSystem(systemAdmin);
        jSplitPane.setRightComponent(WorkArea);
        loginBtn.setEnabled(true);
        logoutBtn.setEnabled(false);
        usernameField.setText("");
        passwordField.setText("");
        System.out.println("Logout success.");
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        this.userName = usernameField.getText();
        this.password = passwordField.getText();

        if (systemAdmin.validateUserNamePassword(userName, password)) {
            String type = systemAdmin.findUserType(userName);

            switch (type) {
                case "admin":
                SysAdminJPanel systemAdministration = new SysAdminJPanel(systemAdmin, this::renderNetworkPanel, this::renderEnterprisePanel, this::renderManagerPanel, this::renderCustomerPanel);
                jSplitPane.setRightComponent(systemAdministration);
                break;

                case "Customer":
                renderCustomer(userName);
                break;

                case "Health Club":
                renderHealthClubManager(userName);
                break;

                case "Restaurant":
                renderRestaurantManager(userName);
                break;

                case "Hotel":
                hotelManagerPanel();
                break;

                case "Business Event":
                eventManagerPanel();
                break;
                case "Catering":
                confirmWorkRequestForEvent();
                break;
                case "Decor":
                confirmWorkRequestForEvent();
                break;
                case "Photography":
                confirmWorkRequestForEvent();
                break;
                case "Deliveryman":
                confirmWorkRequestForEvent();
                break;
                case "Laundary":
                confirmWorkRequestForEvent();
                break;
                case "Transportation":
                confirmWorkRequestForEvent();
                break;
                case "Physician":
                confirmWorkRequestForEvent();
                break;
                case "Therapist":
                confirmWorkRequestForEvent();
                break;
                case "Trainer":
                confirmWorkRequestForEvent();
                break;
                default:
                JOptionPane.showMessageDialog(this, "Type not supported.");
                return;
            }
            usernameField.setText("");
            passwordField.setText("");
            loginBtn.setEnabled(false);
            logoutBtn.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password");
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void renderNetworkPanel() {
        ManagingFranchiseJPanel network1 = new ManagingFranchiseJPanel(systemAdmin, this::renderSystemAdminPanel);
        jSplitPane.setRightComponent(network1);
    }

    private void renderEnterprisePanel() {
        ManagingServiceJPanel enterprise = new ManagingServiceJPanel(systemAdmin, this::renderSystemAdminPanel);
        jSplitPane.setRightComponent(enterprise);
    }

    private void renderCustomerPanel() {
        ManagingCustomerWorkJPanel customer = new ManagingCustomerWorkJPanel(systemAdmin, this::renderSystemAdminPanel);
        jSplitPane.setRightComponent(customer);
    }

    private void renderManagerPanel() {
        ManagingManagersJPanel manager = new ManagingManagersJPanel(systemAdmin, this::renderSystemAdminPanel);
        jSplitPane.setRightComponent(manager);
    }

    private void renderSystemAdminPanel() {
        jSplitPane.setRightComponent(new SysAdminJPanel(systemAdmin, this::renderNetworkPanel, this::renderEnterprisePanel, this::renderManagerPanel, this::renderCustomerPanel));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main1JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ControlPanel;
    private javax.swing.JPanel WorkArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JButton loginBtn;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables

    private void renderCustomer(String username) {
        Customer customer = systemAdmin.getCustomerDirec().findCustomerUsername(username);
        CustomerStartJPanel customerPanel = new CustomerStartJPanel(systemAdmin, this::renderBookRoomPanel, this::manageBooking);
        jSplitPane.setRightComponent(customerPanel);
    }

    private void renderBookRoomPanel() {
        BookRoomServicesJPanel bookroomPanel = new BookRoomServicesJPanel(systemAdmin, this::manageCustomerPanel, userName);
        jSplitPane.setRightComponent(bookroomPanel);
    }

    private void manageBooking() {
        ManagingBookingJPanel manageBookingPanel = new ManagingBookingJPanel(systemAdmin, this::manageCustomerPanel, this::addServices, this::viewService, userName);
        jSplitPane.setRightComponent(manageBookingPanel);
    }

    private void manageCustomerPanel() {
        jSplitPane.setRightComponent(new CustomerStartJPanel(systemAdmin, this::renderBookRoomPanel, this::manageBooking));
    }

    private void addServices(Booking booking) {
        AddingServicesJPanel service = new AddingServicesJPanel(systemAdmin, this::bookEvent, this::placeOrder, this::healthPanel,
                this::hotelService, this::manageBooking, userName, booking);
        jSplitPane.setRightComponent(service);
    }

    private void bookEvent(Booking booking) {
        BookingEventJPanel event = new BookingEventJPanel(systemAdmin, this::addServices, userName, booking);
        jSplitPane.setRightComponent(event);
    }

    private void placeOrder(Booking booking) {           //customer order from restaurant
        RestuarantServicesJPanel order = new RestuarantServicesJPanel(systemAdmin, this::addServices, userName, booking);
        jSplitPane.setRightComponent(order);
    }

    private void healthPanel(Booking booking) {             // healthclub panel for customer
        HealthServiceClubJPanel healthClub = new HealthServiceClubJPanel(systemAdmin, this::addServices, userName, booking);
        jSplitPane.setRightComponent(healthClub);
    }

    private void hotelService(Booking booking) {    //laundary and transport service panel fpr customer
        HotelServicesPanel hotelPanel = new HotelServicesPanel(systemAdmin, this::addServices, userName, booking);
        jSplitPane.setRightComponent(hotelPanel);
    }

    private void viewService(Booking booking) {
        ViewingServicesDetailJPanel viewService = new ViewingServicesDetailJPanel(systemAdmin, this::manageBooking, userName, booking);
        jSplitPane.setRightComponent(viewService);
    }

    private void renderHealthClubManager(String username) {
        List<Franchise> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<HealthClub> healthClubs = network.get(i).getEnterpriseDirectory().getListOfHealthClub();
            for (int j = 0; j < healthClubs.size(); j++) {
                List<Manager> manager = healthClubs.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(username)) {
                        HealthClubsManagerWorkJPanel healthManagerPanel = new HealthClubsManagerWorkJPanel(systemAdmin, this::viewTaskPanel, this::createOrganization,
                                this::organizationAdminPanel);
                        jSplitPane.setRightComponent(healthManagerPanel);

                    }
                }
            }
        }
    }

    private Franchise findUserNetworkForHealthClub() {
        List<Franchise> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<HealthClub> healthClubs = network.get(i).getEnterpriseDirectory().getListOfHealthClub();
            for (int j = 0; j < healthClubs.size(); j++) {
                List<Manager> manager = healthClubs.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(userName)) {
                        return network.get(i);

                    }
                }
            }
        }
        return null;
    }

    private Services findUserHealthClub() {
        List<Franchise> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<HealthClub> health = network.get(i).getEnterpriseDirectory().getListOfHealthClub();
            for (int j = 0; j < health.size(); j++) {
                List<Manager> manager = health.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(userName)) {
                        return health.get(j);
                    }
                }
            }
        }
        return null;
    }

    private void viewTaskPanel() {   //view task for health club
        String type = systemAdmin.findUserType(userName);
        HealthClub healthClub = (HealthClub) findUserHealthClub();
        ViewTaskWorkJPanel viewTask = new ViewTaskWorkJPanel(systemAdmin, this::healthClubManagerPanel, userName, type, healthClub
        );
        jSplitPane.setRightComponent(viewTask);
    }

    private void createOrganization() {
        Franchise network = findUserNetworkForHealthClub();
        ManageOrganisationWorkJPanel org = new ManageOrganisationWorkJPanel(systemAdmin, this::healthClubManagerPanel, userName, network);
        jSplitPane.setRightComponent(org);
    }

    private void organizationAdminPanel() {   //create org admin for health club
        String type = systemAdmin.findUserType(userName);
        Franchise network = findUserNetworkForHealthClub();
        OrgAdminWorkJPanel orgAdmin = new OrgAdminWorkJPanel(systemAdmin, this::healthClubManagerPanel, userName, type, network);
        jSplitPane.setRightComponent(orgAdmin);
    }

    private void healthClubManagerPanel() {   //go back to healthclub
        jSplitPane.setRightComponent(new HealthClubsManagerWorkJPanel(systemAdmin, this::viewTaskPanel, this::createOrganization, this::organizationAdminPanel));
    }

    private void renderRestaurantManager(String username) {
        List<Franchise> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<Restaurant> restaurants = network.get(i).getEnterpriseDirectory().getListOfRestaurants();
            for (int j = 0; j < restaurants.size(); j++) {
                List<Manager> manager = restaurants.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(username)) {
                        RestaurantManagerWorkJPanel restaurantAssign = new RestaurantManagerWorkJPanel(systemAdmin, this::renderViewTask1, this::renderRestaurantOrg, this::renderRestaurantAdmin, this::addOrderPanel);
                        jSplitPane.setRightComponent(restaurantAssign);
                    }
                }
            }
        }
    }

    private Franchise findUserNetworkForRestaurant() {
        List<Franchise> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<Restaurant> restaurant = network.get(i).getEnterpriseDirectory().getListOfRestaurants();
            for (int j = 0; j < restaurant.size(); j++) {
                List<Manager> manager = restaurant.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(userName)) {
                        return network.get(i);

                    }
                }
            }
        }
        return null;
    }

    private Services findUserRestaurant() {
        List<Franchise> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<Restaurant> restaurant = network.get(i).getEnterpriseDirectory().getListOfRestaurants();
            for (int j = 0; j < restaurant.size(); j++) {
                List<Manager> manager = restaurant.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(userName)) {
                        return restaurant.get(j);
                    }
                }
            }
        }
        return null;
    }

    private void renderViewTask1() {
        String type = systemAdmin.findUserType(userName);
        Restaurant restaurant = (Restaurant) findUserRestaurant();
        ViewTaskRestaurantWorkJPanel resMan = new ViewTaskRestaurantWorkJPanel(systemAdmin, this::restaurantManagerPanel, userName, type, restaurant);
        jSplitPane.setRightComponent(resMan);
    }

    private void renderRestaurantOrg() {
        String type = systemAdmin.findUserType(userName);
        Franchise network = findUserNetworkForRestaurant();
        ManageOrgRestaurantJPanel org = new ManageOrgRestaurantJPanel(systemAdmin, this::restaurantManagerPanel, userName, type, network
        );
        jSplitPane.setRightComponent(org);
    }

    private void renderRestaurantAdmin() { //create organisation admin under restauarant
        String type = systemAdmin.findUserType(userName);
        Franchise network = findUserNetworkForRestaurant();
        ManagingOrganisationAdminRestauarantJPanel orgAdmin = new ManagingOrganisationAdminRestauarantJPanel(systemAdmin, this::restaurantManagerPanel, userName, type, network);
        jSplitPane.setRightComponent(orgAdmin);
    }

    private void addOrderPanel() {
        String type = systemAdmin.findUserType(userName);
        Franchise network = findUserNetworkForRestaurant();
        AddingOrderJPanel order = new AddingOrderJPanel(systemAdmin, this::restaurantManagerPanel, userName, type, network);
        jSplitPane.setRightComponent(order);
    }

    private void restaurantManagerPanel() {
        jSplitPane.setRightComponent(new RestaurantManagerWorkJPanel(systemAdmin, this::renderViewTask1, this::renderRestaurantOrg,
                this::renderRestaurantAdmin, this::addOrderPanel));
    }

    private void renderHotelManager(String username) {   //hotel panel
        List<Franchise> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<Hotel> hotel = network.get(i).getEnterpriseDirectory().getListOfHotel();
            for (int j = 0; j < hotel.size(); j++) {
                List<Manager> manager = hotel.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(username)) {
                        HotelManagerWorkJPanel hotelPanel = new HotelManagerWorkJPanel(systemAdmin, this::renderViewTask2, this::renderHotelOrg,
                                this::renderHotelAdmin, this::renderRoomPanel);
                        jSplitPane.setRightComponent(hotelPanel);

                    }
                }
            }
        }
    }

    private Franchise findUserNetworkForHotel() {
        List<Franchise> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<Hotel> hotel = network.get(i).getEnterpriseDirectory().getListOfHotel();
            for (int j = 0; j < hotel.size(); j++) {
                List<Manager> manager = hotel.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(userName)) {
                        System.out.println("manager found is " + manager.get(k).getUsername() + " and city is " + network.get(i));
                        return network.get(i);
                    }
                }
            }
        }
        return null;
    }

    private Services findManagerHotel() {
        List<Franchise> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<Hotel> hotel = network.get(i).getEnterpriseDirectory().getListOfHotel();
            for (int j = 0; j < hotel.size(); j++) {
                List<Manager> manager = hotel.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(userName)) {
                        return hotel.get(j);
                    }
                }
            }
        }
        return null;
    }

    private void renderViewTask2() {
        String type = systemAdmin.findUserType(userName);
        Hotel hotel = (Hotel) findManagerHotel();
        ViewTaskHotelJPanel hotelPanel = new ViewTaskHotelJPanel(systemAdmin, this::hotelManagerPanel, userName, type, hotel);
        jSplitPane.setRightComponent(hotelPanel);
    }

    private void renderHotelOrg() {
        String type = systemAdmin.findUserType(userName);
        Franchise network1 = findUserNetworkForHotel();
        ManageOrgForHotelJPanel org = new ManageOrgForHotelJPanel(systemAdmin, this::hotelManagerPanel, userName, type, network1);
        jSplitPane.setRightComponent(org);
    }

    private void renderHotelAdmin() {
        String type = systemAdmin.findUserType(userName);
        Franchise network1 = findUserNetworkForHotel();

        ManageOrgAdminForHotelJPanel orgAdmin = new ManageOrgAdminForHotelJPanel(systemAdmin, this::hotelManagerPanel, userName, type, network1);
        jSplitPane.setRightComponent(orgAdmin);
    }

    private void renderRoomPanel() {
        Franchise network = findUserNetworkForHotel();
        ManageRoomWorkJPanel room = new ManageRoomWorkJPanel(systemAdmin, this::hotelManagerPanel, network, userName);
        jSplitPane.setRightComponent(room);
    }

    private void hotelManagerPanel() {
        jSplitPane.setRightComponent(new HotelManagerWorkJPanel(systemAdmin, this::renderViewTask2, this::renderHotelOrg, this::renderHotelAdmin, this::renderRoomPanel));
    }

    private void renderEventManager(String username) {
        List<Franchise> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<BusinessEvent> event = network.get(i).getEnterpriseDirectory().getListOfEvents();
            for (int j = 0; j < event.size(); j++) {
                List<Manager> manager = event.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(username)) {
                        EventsManagerWorkJPanel eventPanel = new EventsManagerWorkJPanel(systemAdmin, this::renderViewTask3, this::renderEventOrg,
                                this::renderEventAdmin);
                        jSplitPane.setRightComponent(eventPanel);

                    }
                }
            }
        }
    }

    private Franchise findUserNetworkForEvents() {
        List<Franchise> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<BusinessEvent> event = network.get(i).getEnterpriseDirectory().getListOfEvents();
            for (int j = 0; j < event.size(); j++) {
                List<Manager> manager = event.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(userName)) {
                        return network.get(i);

                    }
                }
            }
        }
        return null;
    }

    private Services findUserEnterprise() {
        List<Franchise> network = systemAdmin.getListOfNetwork();
        for (int i = 0; i < network.size(); i++) {
            List<BusinessEvent> event = network.get(i).getEnterpriseDirectory().getListOfEvents();
            for (int j = 0; j < event.size(); j++) {
                List<Manager> manager = event.get(j).getListOfManager();
                for (int k = 0; k < manager.size(); k++) {
                    if (manager.get(k).getUsername().equals(userName)) {
                        return event.get(j);
                    }
                }
            }
        }
        return null;
    }

    private void confirmWorkRequestForEvent() {
        List<Franchise> network = systemAdmin.getListOfNetwork();
        String type = systemAdmin.findUserType(userName);
        for (int i = 0; i < network.size(); i++) {
            ConfirmWorkRequestEventJPanel workRequest = new ConfirmWorkRequestEventJPanel(systemAdmin, userName, type);
            jSplitPane.setRightComponent(workRequest);
        }
    }

    private void renderViewTask3() {     // view Business Event manager panel
        String type = systemAdmin.findUserType(userName);
        BusinessEvent event = (BusinessEvent) findUserEnterprise();
        ViewTasksEventJPanel eventPanel = new ViewTasksEventJPanel(systemAdmin, this::eventManagerPanel, userName, type, event);
        jSplitPane.setRightComponent(eventPanel);
    }

    private void renderEventOrg() {     // add an organisation for event
        String type = systemAdmin.findUserType(userName);
        Franchise network = findUserNetworkForEvents();
        ManageOrgForEventJPanel org = new ManageOrgForEventJPanel(systemAdmin, this::eventManagerPanel, userName, type, network);
        jSplitPane.setRightComponent(org);
    }

    private void renderEventAdmin() { //create organisation admin under event
        String type = systemAdmin.findUserType(userName);
        Franchise network = findUserNetworkForEvents();
        ManageOrgAdminWorkForEventJPanel orgAdmin = new ManageOrgAdminWorkForEventJPanel(systemAdmin, this::eventManagerPanel, userName, type, network);
        jSplitPane.setRightComponent(orgAdmin);
    }

    private void eventManagerPanel() {    //go back to event manager panel
        jSplitPane.setRightComponent(new EventsManagerWorkJPanel(systemAdmin, this::renderViewTask3, this::renderEventOrg, this::renderEventAdmin));
    }
}
