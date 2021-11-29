import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Library implements ActionListener {
    JFrame LoginFrame = new JFrame();
    JFrame RegisterFrame = new JFrame();
    JFrame DashFrame = new JFrame();
    JFrame adBFrame = new JFrame();
    JFrame viewBFrame = new JFrame();
    JFrame StudentFrame = new JFrame();
    JFrame BorrowFrame = new JFrame();
    JFrame ReturnFrame = new JFrame();

    JPanel RegisterPanel = new JPanel();
    JPanel LoginPanel = new JPanel();
    JPanel DashPanel = new JPanel();
    JPanel adBPanel = new JPanel();
    JPanel viewBPanel = new JPanel();
    JPanel StudentPanel = new JPanel();
    JPanel BorrowPanel = new JPanel();
    JPanel ReturnPanel = new JPanel();

    JButton functionalButton[] = new JButton[3];
    JButton RegisterButton[] = new JButton[2];
    JButton DashButton[] = new JButton[6];
    JButton adBButton = new JButton();
    JButton viewButton = new JButton();
    JButton StudentButton[] = new JButton[2];
    JButton BorrowButton = new JButton();
    JButton ReturnButton = new JButton();

    JLabel LoginLabel[] = new JLabel[2];
    JLabel RegisterLabel[] = new JLabel[5];
    JLabel DashLabel[] = new JLabel[2];
    JLabel adBLabel[] = new JLabel[3];
    JLabel viewBLabel[] = new JLabel[12];
    JLabel StudentLabel[] = new JLabel[3];
    JLabel BorrowLabel[] = new JLabel[2];
    JLabel ReturnLabel[] = new JLabel[2];

    JTextField RegisterField[] = new JTextField[5];
    JPasswordField RegisterPass[] = new JPasswordField[2];
    JTextField Username = new JTextField();
    JPasswordField Password = new JPasswordField();
    JTextField adBField[] = new JTextField[3];
    JTextField StudentField[] = new JTextField[3];
    JTextField BorrowField[] = new JTextField[2];
    JTextField ReturnField[] = new JTextField[2];

    Font MainFont = new Font("Ink Free", Font.PLAIN, 16);
    Font DashFont = new Font("Ink Free", Font.PLAIN, 17);

    String username, displayname, password;
    String adminUser[] = new String[10];
    String adminPass[] = new String[10];
    String adminDisplay[] = new String[10];
    String studentID[] = new String[3];
    String studentName[] = new String[3];
    String BookCode[] = new String[3];
    String BookTitle[] = new String[3];
    String BookQuantity[] = new String[3];

    int studentcount = 0;
    int bookcount = 0;
    int adminID = 1;
    int BookLimit[] = new int[3];

    ImageIcon icon = new ImageIcon("book.png");
    Library() {
        Login();
        Register();
        dashboard();
        addBook();
        addStudent();
        viewBook();
        borrow();
        returnBook();
        LoginFrame.setVisible(true);
    }

    private void Login() {
        LoginFrame.setTitle("Login Account");
        LoginFrame.setResizable(false);
        LoginFrame.setIconImage(icon.getImage());
        LoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LoginFrame.setLocationRelativeTo(null);
        LoginFrame.setSize(400, 230);

        LoginPanel.setLayout(null);
        LoginPanel.add(Username);
        LoginPanel.add(Password);

        for (int i = 0; i < LoginLabel.length; i++) {
            LoginLabel[i] = new JLabel();
            LoginLabel[i].setFont(MainFont);
            LoginPanel.add(LoginLabel[i]);

        }

        for (int i = 0; i < functionalButton.length; i++) {
            functionalButton[i] = new JButton();
            functionalButton[i].setFocusable(false);
            functionalButton[i].setFont(MainFont);
            functionalButton[i].setBorder(null);
            functionalButton[i].setBackground(new Color(102, 178, 230));
            functionalButton[i].addActionListener(this);
            LoginPanel.add(functionalButton[i]);
        }

        functionalButton[0].setText("Login");
        functionalButton[1].setText("Register");
        functionalButton[2].setText("Cancel");
        LoginLabel[0].setText("<html><b>Username</b></html>");
        LoginLabel[1].setText("<html><b>Password</b></html>");
        LoginLabel[0].setBounds(15, 20, 150, 50);
        LoginLabel[1].setBounds(15, 70, 150, 50);
        Username.setBounds(125, 33, 250, 25);
        Password.setBounds(125, 80, 250, 25);
        functionalButton[0].setBounds(15, 150, 115, 30);
        functionalButton[1].setBounds(138, 150, 115, 30);
        functionalButton[2].setBounds(260, 150, 115, 30);
        LoginFrame.add(LoginPanel);
    }

    private void Register() {
        RegisterFrame = new JFrame();
        RegisterFrame.setTitle("Register Account");
        RegisterFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        RegisterFrame.setResizable(false);
        RegisterFrame.setSize(450, 550);
        RegisterFrame.setIconImage(icon.getImage());

        RegisterPanel.setLayout(null);

        for (int i = 0; i < RegisterButton.length; i++) {
            RegisterButton[i] = new JButton();
            RegisterButton[i].setFocusable(false);
            RegisterButton[i].setBorder(null);
            RegisterButton[i].setBackground(new Color(102, 178, 230));
            RegisterButton[i].setFont(MainFont);
            RegisterButton[i].addActionListener(this);
            RegisterPanel.add(RegisterButton[i]);
        }
        RegisterButton[0].setText("Submit");
        RegisterButton[1].setText("Cancel");

        for (int i = 0; i < RegisterPass.length; i++) {
            RegisterPass[i] = new JPasswordField();
            RegisterPass[i].setHorizontalAlignment(JPasswordField.CENTER);
            RegisterPanel.add(RegisterPass[i]);
        }

        for (int i = 0; i < 5; i++) {
            RegisterLabel[i] = new JLabel();
            RegisterField[i] = new JTextField();
            RegisterField[i].setFont(MainFont);
            RegisterField[i].setHorizontalAlignment(JTextField.CENTER);
            RegisterLabel[i].setFont(MainFont);

            RegisterPanel.add(RegisterLabel[i]);
            RegisterPanel.add(RegisterField[i]);
        }

        RegisterLabel[0].setText("<html><b>Registration of Account</b></html>");
        RegisterLabel[0].setBounds(120, 20, 300, 20);

        RegisterLabel[1].setText("Username");
        RegisterLabel[1].setBounds(180, 80, 300, 20);
        RegisterField[0].setBounds(20, 115, 400, 25);

        RegisterLabel[2].setText("Password");
        RegisterLabel[2].setBounds(180, 150, 300, 50);
        RegisterPass[0].setBounds(20, 195, 400, 25);

        RegisterLabel[3].setText("Retype Password");
        RegisterLabel[3].setBounds(150, 230, 300, 50);
        RegisterPass[1].setBounds(20, 275, 400, 25);

        RegisterLabel[4].setText("Display Name");
        RegisterLabel[4].setBounds(160, 310, 300, 50);
        RegisterField[1].setBounds(20, 355, 400, 25);

        RegisterButton[0].setBounds(20, 430, 195, 40);
        RegisterButton[1].setBounds(225, 430, 195, 40);
        RegisterFrame.add(RegisterPanel);

    }

    private void dashboard() {
        DashFrame.setTitle("Dashboard - Library System");
        DashFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DashFrame.setLocationRelativeTo(null);
        DashFrame.setResizable(false);
        DashFrame.setSize(570, 400);
        DashFrame.add(DashPanel);
        DashFrame.setIconImage(icon.getImage());

        DashPanel.setLayout(null);

        for (int i = 0; i < DashLabel.length; i++) {
            DashLabel[i] = new JLabel();
            DashLabel[i].setFont(DashFont);
            DashPanel.add(DashLabel[i]);
        }

        for (int i = 0; i < DashButton.length; i++) {
            DashButton[i] = new JButton();
            DashButton[i].setFocusable(false);
            DashButton[i].setFont(DashFont);
            DashButton[i].setBorder(null);
            DashButton[i].addActionListener(this);
            DashButton[i].setBackground(new Color(102, 178, 230));
            DashPanel.add(DashButton[i]);
        }

        // DashLabel[0].setText("<html>Welcome <b>" + displayname + "!<b><html>");
        DashLabel[1].setText("<html>You're logged-in as <b>Admin</b></html>");
        DashLabel[0].setBounds(20, 20, 400, 20);
        DashLabel[1].setBounds(20, 40, 400, 20);

        DashButton[0].setText("Add Book");
        DashButton[0].setBounds(20, 120, 250, 45);
        DashButton[1].setText("Add Student");
        DashButton[1].setBounds(20, 200, 250, 45);
        DashButton[2].setText("Borrow Book");
        DashButton[2].setBounds(20, 280, 250, 45);
        DashButton[3].setText("Return Book");
        DashButton[3].setBounds(300, 120, 250, 45);
        DashButton[4].setText("View Book");
        DashButton[4].setBounds(300, 200, 250, 45);
        DashButton[5].setText("Logout");
        DashButton[5].setBounds(300, 280, 250, 45);
    }

    private void addBook() {
        adBFrame.setTitle("Add Book");
        adBFrame.setSize(400, 200);
        adBFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        adBFrame.setResizable(false);
        adBFrame.setLocationRelativeTo(null);
        adBFrame.setIconImage(icon.getImage());
        adBPanel.setLayout(null);
        adBFrame.add(adBPanel);

        for (int i = 0; i < 3; i++) {
            adBLabel[i] = new JLabel();
            adBField[i] = new JTextField();
            adBLabel[i].setFont(MainFont);
            adBField[i].setFont(MainFont);
            adBPanel.add(adBLabel[i]);
            adBPanel.add(adBField[i]);
        }
        adBButton.setText("Submit");
        adBButton.setFont(DashFont);
        adBButton.setBackground((new Color(102, 178, 230)));
        adBButton.setFocusable(false);
        adBButton.setBorder(null);
        adBButton.addActionListener(this);
        adBPanel.add(adBButton);

        adBLabel[0].setText("<html><b>Book ID</b></html>");
        adBLabel[0].setBounds(10, 10, 200, 20);
        adBField[0].setBounds(150, 10, 245, 20);
        adBLabel[1].setText("<html><b>Book Title</b></html>");
        adBLabel[1].setBounds(10, 50, 200, 20);
        adBField[1].setBounds(150, 50, 245, 20);
        adBLabel[2].setText("<html><b>Book Quantity</b></html>");
        adBLabel[2].setBounds(10, 90, 200, 20);
        adBField[2].setBounds(150, 90, 245, 20);

        adBButton.setBounds(50, 130, 300, 30);
    }

    private void addStudent() {
        StudentFrame.setTitle("Add Student");
        StudentFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        StudentFrame.setSize(300, 380);
        StudentFrame.setResizable(false);
        StudentFrame.setLocationRelativeTo(null);
        StudentFrame.add(StudentPanel);
        StudentFrame.setIconImage(icon.getImage());
        StudentPanel.setLayout(null);

        for (int i = 0; i < 2; i++) {
            StudentButton[i] = new JButton();
            StudentButton[i].setFocusable(false);
            StudentButton[i].setBorder(null);
            StudentButton[i].setFont(MainFont);
            StudentButton[i].setBackground(new Color(102, 178, 230));
            StudentButton[i].addActionListener(this);
            StudentPanel.add(StudentButton[i]);
        }

        for (int i = 0; i < 3; i++) {
            StudentField[i] = new JTextField();
            StudentField[i].setFont(MainFont);
            StudentField[i].setHorizontalAlignment(JTextField.CENTER);
            StudentLabel[i] = new JLabel();
            StudentLabel[i].setFont(MainFont);
            StudentPanel.add(StudentField[i]);
            StudentPanel.add(StudentLabel[i]);
        }
        StudentLabel[0].setText("<html><b>Student ID</b></html>");
        StudentLabel[0].setBounds(100, 20, 200, 20);
        StudentField[0].setBounds(50, 50, 200, 20);
        StudentLabel[1].setText("<html><b>Student Name</b></html>");
        StudentLabel[1].setBounds(90, 100, 200, 20);
        StudentField[1].setBounds(50, 130, 200, 20);
        StudentLabel[2].setText("<html><b>Student Designation</b></html>");
        StudentLabel[2].setBounds(60, 180, 200, 20);
        StudentField[2].setBounds(50, 210, 200, 20);
        StudentField[2].setText("Guess");
        StudentField[2].setEditable(false);

        StudentButton[0].setText("Submit");
        StudentButton[0].setBounds(20, 280, 120, 30);
        StudentButton[1].setText("Cancel");
        StudentButton[1].setBounds(150, 280, 120, 30);
    }

    private void borrow() {
        BorrowFrame.setTitle("Borrow Book");
        BorrowFrame.setLocationRelativeTo(null);
        BorrowFrame.setResizable(false);
        BorrowFrame.setSize(300, 200);
        BorrowFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        BorrowFrame.add(BorrowPanel);
        BorrowFrame.setIconImage(icon.getImage());
        BorrowPanel.setLayout(null);

        for (int i = 0; i < 2; i++) {
            BorrowLabel[i] = new JLabel();
            BorrowField[i] = new JTextField();
            BorrowLabel[i].setFont(MainFont);
            BorrowField[i].setFont(MainFont);
            BorrowPanel.add(BorrowLabel[i]);
            BorrowPanel.add(BorrowField[i]);
        }

        BorrowLabel[0].setText("<html><b>Student ID</b></html>");
        BorrowLabel[0].setBounds(10, 20, 200, 20);
        BorrowField[0].setBounds(120, 20, 160, 20);
        BorrowLabel[1].setText("<html><b>Book ID</b></html>");
        BorrowLabel[1].setBounds(10, 60, 200, 20);
        BorrowField[1].setBounds(120, 60, 160, 20);

        BorrowPanel.add(BorrowButton);
        BorrowButton.setText("Submit");
        BorrowButton.setBorder(null);
        BorrowButton.setFocusable(false);
        BorrowButton.setFont(MainFont);
        BorrowButton.addActionListener(this);
        BorrowButton.setBackground(new Color(102, 178, 230));
        BorrowButton.setBounds(75, 110, 150, 30);
    }

    private void returnBook() {
        ReturnFrame.setTitle("Return Book");
        ReturnFrame.setLocationRelativeTo(null);
        ReturnFrame.setResizable(false);
        ReturnFrame.setSize(300, 200);
        ReturnFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ReturnFrame.add(ReturnPanel);
        ReturnFrame.setIconImage(icon.getImage());
        ReturnPanel.setLayout(null);

        for (int i = 0; i < 2; i++) {
            ReturnLabel[i] = new JLabel();
            ReturnField[i] = new JTextField();
            ReturnLabel[i].setFont(MainFont);
            ReturnField[i].setFont(MainFont);
            ReturnPanel.add(ReturnLabel[i]);
            ReturnPanel.add(ReturnField[i]);
        }

        ReturnLabel[0].setText("<html><b>Student ID</b></html>");
        ReturnLabel[0].setBounds(10, 20, 200, 20);
        ReturnField[0].setBounds(120, 20, 160, 20);
        ReturnLabel[1].setText("<html><b>Book ID</b></html>");
        ReturnLabel[1].setBounds(10, 60, 200, 20);
        ReturnField[1].setBounds(120, 60, 160, 20);

        ReturnPanel.add(ReturnButton);
        ReturnButton.setText("Submit");
        ReturnButton.setBorder(null);
        ReturnButton.setFocusable(false);
        ReturnButton.setFont(MainFont);
        ReturnButton.addActionListener(this);
        ReturnButton.setBackground(new Color(102, 178, 230));
        ReturnButton.setBounds(75, 110, 150, 30);
    }

    private void viewBook() {
        viewBFrame.setTitle("View Book");
        viewBFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        viewBFrame.setSize(600, 400);
        viewBFrame.setResizable(false);
        viewBFrame.setLocationRelativeTo(null);
        viewBFrame.setIconImage(icon.getImage());
        viewBFrame.add(viewBPanel);
        viewBPanel.setLayout(null);

        for (int i = 0; i < viewBLabel.length; i++) {
            viewBLabel[i] = new JLabel();
            viewBLabel[i].setFont(MainFont);
            viewBPanel.add(viewBLabel[i]);
        }

        viewBLabel[0].setText("<html><b><u>Book ID</u></b></html>");
        viewBLabel[0].setBounds(30, 10, 200, 25);
        viewBLabel[1].setText("<html><b><u>Book Title</u></b></html>");
        viewBLabel[1].setBounds(230, 10, 200, 25);
        viewBLabel[2].setText("<html><b><u>Book Quantity</u></b></html>");
        viewBLabel[2].setBounds(430, 10, 200, 25);

        viewBLabel[3].setBounds(30, 70, 200, 25);
        viewBLabel[4].setBounds(230, 70, 200, 25);
        viewBLabel[5].setBounds(430, 70, 200, 25);

        viewBLabel[6].setBounds(30, 120, 200, 25);
        viewBLabel[7].setBounds(230, 120, 200, 25);
        viewBLabel[8].setBounds(430, 120, 200, 25);

        viewBLabel[9].setBounds(30, 170, 200, 25);
        viewBLabel[10].setBounds(230, 170, 200, 25);
        viewBLabel[11].setBounds(430, 170, 200, 25);

        viewBPanel.add(viewButton);
        viewButton.addActionListener(this);
        viewButton.setText("Cancel");
        viewButton.setBounds(170, 300, 250, 35);
        viewButton.setBackground(new Color(102, 178, 230));
        viewButton.setFocusable(false);
        viewButton.setFont(MainFont);
        viewButton.setBorder(null);
    }

    public static void main(String[] args) {
        new Library();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /// Tester Account
        adminUser[0] = "admin";
        adminPass[0] = "123";
        adminDisplay[0] = "Test Account";
        String usr = Username.getText();
        String pw = String.valueOf(Password.getPassword());
        boolean failed = true;
        if (e.getSource() == functionalButton[0]) {
            if (usr.isEmpty() && pw.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Enter Username and Password");
            }

            for (int i = 0; i < adminID; i++) {
                if (usr.matches(adminUser[i]) && pw.matches(adminPass[i])) {
                    username = adminUser[i];
                    password = adminPass[i];
                    displayname = adminDisplay[i];
                    Username.setText("");
                    Password.setText("");
                    DashLabel[0].setText("<html>Welcome <b>" + displayname + "!<b><html>");
                    LoginFrame.dispose();
                    DashFrame.setVisible(true);
                    failed = false;
                }
            }
            if (failed) {
                JOptionPane.showMessageDialog(null, "Invalid Username or Password");
            }
        }

        if (e.getSource() == functionalButton[1]) {
            RegisterFrame.setVisible(true);
        }

        if (e.getSource() == functionalButton[2]) {
            System.exit(0);
        }

        if (e.getSource() == RegisterButton[0]) {
            String regusr = RegisterField[0].getText();
            String regpw = String.valueOf(RegisterPass[0].getPassword());
            String regrpw = String.valueOf(RegisterPass[1].getPassword());
            String regname = RegisterField[1].getText();
            boolean UserFirstChar = (regusr.charAt(0) >= '0' && regusr.charAt(0) <= '9');
            String errortitle = "Registration Error";

            if (regusr.isEmpty() || regpw.isEmpty() || regrpw.isEmpty() || regname.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill up all form", errortitle, 0);
            } else if (UserFirstChar) {
                JOptionPane.showMessageDialog(null, "Username first character is a number", errortitle, 0);
            } else if (!regpw.equals(regrpw)) {
                JOptionPane.showMessageDialog(null, "Password and Retype Password does not match", errortitle, 0);
            } else if (regusr.length() < 6) {
                JOptionPane.showMessageDialog(null, "Username should be 6 characters long", errortitle, 0);
            } else if (regpw.length() < 8) {
                JOptionPane.showMessageDialog(null, "Password should be 8 characters long", errortitle, 0);
            } else if (regname.length() < 6) {
                JOptionPane.showMessageDialog(null, "Display name should be 6 characters long", errortitle, 0);
            } else {
                JOptionPane.showMessageDialog(null, "Registration Success", "Success", 1);
                RegisterPass[0].setText("");
                RegisterPass[1].setText("");
                RegisterField[0].setText("");
                RegisterField[1].setText("");
                adminUser[adminID] = regusr;
                adminPass[adminID] = regpw;
                adminDisplay[adminID] = regname;
                adminID++;
                RegisterFrame.dispose();
            }
        }

        if (e.getSource() == RegisterButton[1]) {
            RegisterFrame.dispose();
        }

        if (e.getSource() == DashButton[0]) {
            adBFrame.setVisible(true);
        }

        if (e.getSource() == DashButton[1]) {
            StudentFrame.setVisible(true);
        }

        if (e.getSource() == StudentButton[0]) {
            String studentid = StudentField[0].getText();
            String studentname = StudentField[1].getText();

            if (studentid.isEmpty() || studentname.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill up form", "Error", 0);
            }

            else if (studentname.length() < 8) {
                JOptionPane.showMessageDialog(null, "Enter fullname of student", "Error", 0);
            }

            else {
                JOptionPane.showMessageDialog(null, "Registration Success", "Success", 1);
                StudentField[0].setText("");
                StudentField[1].setText("");
                studentID[studentcount] = studentid;
                studentName[studentcount] = studentname;
                studentcount++;
                StudentFrame.dispose();
            }
        }

        if (e.getSource() == StudentButton[1]) {
            StudentFrame.dispose();
        }

        if (e.getSource() == DashButton[2]) {
            BorrowFrame.setVisible(true);
        }

        if (e.getSource() == BorrowButton) {
            String borrowStudent = BorrowField[0].getText();
            String borrowBook = BorrowField[1].getText();

            if (borrowStudent.isEmpty() || borrowBook.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill up form", "Error", 0);
            }

            for (int i = 0; i < studentID.length; i++) {
                if(borrowStudent.matches(studentID[i])) {
                    for(int j = 0; j <= BookCode.length; j++){
                        int x = Integer.parseInt(BookQuantity[j]);
                        if (x <= 0) {
                            JOptionPane.showMessageDialog(null, "The book is not available", "Error", 1);
                            return;
                        }
                        if(borrowBook.matches(BookCode[j])){
                            JOptionPane.showMessageDialog(null, "Borrow Success", "Success", 0);
                            x--;
                            BookQuantity[j] = String.valueOf(x);
                            BorrowField[0].setText("");
                            BorrowField[1].setText("");
                            BorrowFrame.dispose();
                        }
                    }
                }
                else if(i >= studentID.length){
                    break;
                }
            }
            JOptionPane.showMessageDialog(null, "Invalid Student ID", "Error", 0);

           
        }

        if(e.getSource() == DashButton[3]){
            ReturnFrame.setVisible(true);
        }

        if (e.getSource() == ReturnButton) {
            String returnStudent = ReturnField[0].getText();
            String returnBook = ReturnField[1].getText();

            if (returnStudent.isEmpty() || returnBook.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill up form", "Error", 0);
            }

            for (int i = 0; i < studentID.length; i++) {
                if(returnStudent.matches(studentID[i])) {
                    for(int j = 0; j < BookCode.length; j++){
                        int x = Integer.parseInt(BookQuantity[j]);
                        if(returnBook.matches(BookCode[j])){
                            if(x >= BookLimit[j]){
                                JOptionPane.showMessageDialog(null, BookTitle[j] + " has " + BookQuantity[j] + " maximum quantity", "Error", 0);
                                return;
                            }
                            else {
                                JOptionPane.showMessageDialog(null, studentName[i] + " returned the book", "Success", 0);
                                x++;
                                BookQuantity[j] = String.valueOf(x);
                                ReturnField[0].setText("");
                                ReturnField[1].setText("");
                                ReturnFrame.dispose();
                            }
                        }
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Invalid Student ID", "Error", 0);
            
        }

        if (e.getSource() == DashButton[4]) {
            viewBFrame.setVisible(true);
            if (bookcount == 1) {
                viewBLabel[3].setText(BookCode[0]);
                viewBLabel[4].setText(BookTitle[0]);
                viewBLabel[5].setText(BookQuantity[0]);
            } else if (bookcount == 2) {
                viewBLabel[3].setText(BookCode[0]);
                viewBLabel[4].setText(BookTitle[0]);
                viewBLabel[5].setText(BookQuantity[0]);
                viewBLabel[6].setText(BookCode[1]);
                viewBLabel[7].setText(BookTitle[1]);
                viewBLabel[8].setText(BookQuantity[1]);
            } else {
                viewBLabel[3].setText(BookCode[0]);
                viewBLabel[4].setText(BookTitle[0]);
                viewBLabel[5].setText(BookQuantity[0]);
                viewBLabel[6].setText(BookCode[1]);
                viewBLabel[7].setText(BookTitle[1]);
                viewBLabel[8].setText(BookQuantity[1]);
                viewBLabel[9].setText(BookCode[2]);
                viewBLabel[10].setText(BookTitle[2]);
                viewBLabel[11].setText(BookQuantity[2]);
            }
        }

        if (e.getSource() == viewButton) {
            viewBFrame.dispose();
        }

        if (e.getSource() == DashButton[5]) {
            DashFrame.dispose();
            LoginFrame.setVisible(true);
        }

        if (e.getSource() == adBButton) {
            String bookid = adBField[0].getText();
            String booktitle = adBField[1].getText();
            String bookpcs = adBField[2].getText();
            boolean notDigit = (bookpcs.charAt(0) >= '1' && bookpcs.charAt(0) <= '9');

            if(bookcount == 3) {
                JOptionPane.showMessageDialog(null, "Can't add anymore, Maximum has been reached", "Error", 0);
                return;
            }

            for(int i = 0; i < bookpcs.length(); i++){
                if(bookpcs.toUpperCase().charAt(i) >= 'A' && bookpcs.toUpperCase().charAt(i) <= 'Z'){
                    JOptionPane.showMessageDialog(null, "Number Only", "Book Quantity", 0);
                    return;
                }
            }

            if(bookid.isEmpty() || booktitle.isEmpty() || bookpcs.isEmpty()){
                JOptionPane.showMessageDialog(null, "Please fill up form", "Error", 0);
            }

            else if(notDigit == false) {
                JOptionPane.showMessageDialog(null, "Please enter correct book Quantity", "Error", 0);
            }

            else {
                JOptionPane.showMessageDialog(null, "Book Added", "Success", 1);
                String bookID = bookid;
                String bookTitle = booktitle;
                String bookQuantity = bookpcs;
                adBField[0].setText("");
                adBField[1].setText("");
                adBField[2].setText("");
                BookCode[bookcount] = bookID;
                BookTitle[bookcount] = bookTitle;
                BookQuantity[bookcount] = bookQuantity;
                int x = Integer.parseInt(bookQuantity);
                BookLimit[bookcount] = x;
                bookcount++;
                adBFrame.dispose();
            }
        }

    }
}
