package UniversityManagementSystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Project extends JFrame implements ActionListener {

    Project(){
        setSize(1540, 850);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550,750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        //New Information
        JMenuBar mb = new JMenuBar();
        JMenu newInforamtion = new JMenu("New Information");
        newInforamtion.setForeground(Color.BLUE);
        mb.add(newInforamtion);

        //Details
        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.WHITE);
        facultyInfo.addActionListener(this);
        newInforamtion.add(facultyInfo);
        //Details
        JMenuItem studentInfo = new JMenuItem("New Student Information");
        facultyInfo.setBackground(Color.WHITE);
        studentInfo.addActionListener(this);
        newInforamtion.add(studentInfo);

        //Details
        JMenu details = new JMenu(" View Details");
        details.setForeground(Color.RED);
        mb.add(details);


        JMenuItem facultyDetails = new JMenuItem("View Faculty Details");
        facultyDetails.setBackground(Color.WHITE);
        facultyDetails.addActionListener(this);
        details.add(facultyDetails);

        JMenuItem studentDetails = new JMenuItem("View Student Details");
        studentDetails.setBackground(Color.WHITE);
        studentDetails.addActionListener(this);
        details.add(studentDetails);

        //Leave

        JMenu leave = new JMenu(" Apply/Leave");
        leave.setForeground(Color.BLUE);
        mb.add(leave);


        JMenuItem facultyLeave = new JMenuItem("Faculty Leave");
        facultyLeave.setBackground(Color.WHITE);
        facultyLeave.addActionListener(this);
        leave.add(facultyLeave);

        JMenuItem studentLeave = new JMenuItem("Student Leave");
        studentLeave.setBackground(Color.WHITE);
        studentLeave.addActionListener(this);
        leave.add(studentLeave);

        //Leave Setails
        JMenu leaveDetails = new JMenu(" Leave Details");
        leaveDetails.setForeground(Color.RED);
        mb.add(leaveDetails);


        JMenuItem facultyLeaveDetails = new JMenuItem("Faculty Leave Details");
        facultyLeaveDetails.setBackground(Color.WHITE);
        facultyLeaveDetails.addActionListener(this);
        leaveDetails.add(facultyLeaveDetails);

        JMenuItem studentLeaveDetails = new JMenuItem("Student Leave Details");
        studentLeaveDetails.setBackground(Color.WHITE);
        studentLeaveDetails.addActionListener(this);
        leaveDetails.add(studentLeaveDetails);

        //Exams
        JMenu exam = new JMenu(" Examination");
        exam.setForeground(Color.BLUE);
        mb.add(exam);


        JMenuItem examinationDetails = new JMenuItem("Examination Result");
        examinationDetails.setBackground(Color.WHITE);
        examinationDetails.addActionListener(this);
        exam.add(examinationDetails);

        JMenuItem enterMarks = new JMenuItem("Enter Marks");
        enterMarks.setBackground(Color.WHITE);
        enterMarks.addActionListener(this);
        exam.add(enterMarks);

        //Update Information
        JMenu updateInfo = new JMenu(" Update Details");
        updateInfo.setForeground(Color.RED);
        mb.add(updateInfo);


        JMenuItem updateFacultyDetails = new JMenuItem("Update Faculty Details");
        updateFacultyDetails.setBackground(Color.WHITE);
        updateFacultyDetails.addActionListener(this);
        updateInfo.add(updateFacultyDetails);

        JMenuItem updateStudentDetails = new JMenuItem("Update Student Details");
        updateStudentDetails.setBackground(Color.WHITE);
        updateStudentDetails.addActionListener(this);
        updateInfo.add(updateStudentDetails);


        //Fees
        JMenu feeDetails = new JMenu("Fee Details");
        feeDetails.setForeground(Color.BLUE);
        mb.add(feeDetails);


        JMenuItem feeStructure = new JMenuItem("Fee Structure");
        feeStructure.setBackground(Color.WHITE);
        feeStructure.addActionListener(this);
        feeDetails.add(feeStructure);

        JMenuItem feeForm = new JMenuItem("Student Fee Form");
        feeForm.setBackground(Color.WHITE);
        feeStructure.addActionListener(this);
        feeDetails.add(feeForm);

        //Utility
        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.RED);
        mb.add(utility);


        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setBackground(Color.WHITE);
        notepad.addActionListener(this);
        utility.add(notepad);

        JMenuItem calc = new JMenuItem("Calculator");
        calc.setBackground(Color.WHITE);
        calc.addActionListener(this);
        utility.add(calc);

        //About
        JMenu about = new JMenu("About");
        about.setForeground(Color.BLUE);
        mb.add(about);

        JMenuItem ab = new JMenuItem("About");
        ab.setBackground(Color.WHITE);
        ab.addActionListener(this);
        about.add(ab);

        //Exit
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.RED);
        mb.add(exit);


        JMenuItem ex = new JMenuItem("Exit");
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        exit.add(ex);


        setJMenuBar(mb);


        setVisible(true);


    }
    public static void main(String[] args){
        new Project();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();

        if(msg.equals("Exit")){
            setVisible(false);
        } else if(msg.equals("Calculator")){
            try{
                Runtime.getRuntime().exec("calc.exe");
            } catch(Exception e){

            }
        } else if(msg.equals("Notepad")) {
            try {
                Runtime.getRuntime().exec("notepad.exe");
            } catch (Exception e) {

            }
        } else if(msg.equals("New Faculty Information")){
            new AddTeacher();
        } else if(msg.equals("New Student Information")){
            new AddStudent();
        }else if(msg.equals("View Faculty Details")) {
            new TeacherDetails();
        }else if(msg.equals("View Student Details")){
            new StudentDetails();
        }else if(msg.equals("Faculty Leave")){
            new TeacherLeave();
        }else if(msg.equals("Student Leave")){
            new StudentLeave();
        }else if(msg.equals("Faculty Leave Details")){
            new TeacherLeaveDetails();
        }else if(msg.equals("Student Leave Details")){
            new StudentLeaveDetails();
        }else if (msg.equals("Update Faculty Details")) {
            new UpdateTeacher();
        } else if (msg.equals("Update Student Details")) {
            new UpdateStudent();
        }else if (msg.equals("Enter Marks")) {
            new EnterMarks();
        }else if (msg.equals("Examination Result")) {
            new ExaminationDetails();
        }else if(msg.equals("Fee Structure")){
            new FeeStructure();
        }else if(msg.equals("About")){
            new About();
        }else if(msg.equals("Student Fee Form")){
            new StudentFeeForm();
        }
    }
}
