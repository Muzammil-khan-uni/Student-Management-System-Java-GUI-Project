# Student-Management-System-Java-GUI-Project

![image alt](https://github.com/Muzammil-khan-uni/Student-Management-System-Java-GUI-Project/blob/main/Output%20Application.png?raw=true)


Student Management System with Fee Receipt Generator (Java AWT/Swing)

The purpose of this application is to provide a simple and user-friendly graphical interface for managing student information and automatically generating fee receipts. It simulates a real-world data entry form used in universities or colleges.

💡 Key Features:
1. Student Information Entry
The interface collects detailed student data including:

Name

Father’s Name

Roll Number

Email ID

Contact Number

Address

Gender (using radio buttons)

Nationality

10th & 12th Year of Passing (via combo box)

Percentage Marks in 10th and 12th

University/College Name

2. Course and Transport Options

Lists predefined course options (BSSE, BSCS, etc.) and allows selection from a JComboBox and a JList.

Offers optional transport service with listed fees (e.g., Bus - 40,000).

3. Receipt Generation

The app generates a fee receipt displaying all entered information.

The receipt includes course and transport fee details.

It is printed in a formatted, readable layout inside a JTextArea.

4. Receipt Printing and Reset

Print Button: Sends the receipt to the printer.

Reset Button: Clears all entered data and resets combo box selections, radio button selections, and text areas.

5. Visual Elements

Professional font styling using Font.

Custom window icon using Toolkit.

Scrollable area for displaying the generated receipt using JScrollPane.

🛠️ Technologies Used:

Java AWT – For basic UI elements and window controls.

Java Swing – For advanced components like JButton, JTextArea, JScrollPane, JList, and JComboBox.

Event Handling – Implemented via ActionListener and WindowAdapter.

🧠 Learning Objectives / What You Learn:

How to build GUI applications in Java using AWT and Swing.

Effective use of layout management via setBounds() and null layout.

Handling user input through text fields, radio buttons, combo boxes, and lists.

Event-driven programming with ActionListener.

Displaying data dynamically on GUI and using scrollable views.

Printing functionality using print() method of JTextArea.

Managing and formatting text using fonts and manual layout design.
