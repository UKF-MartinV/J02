package AddressBook;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;

public class TableViewController {
    @FXML private TableView<Student> tableView;
    @FXML private TextField firstNameField;
    @FXML private TextField lastNameField;
    @FXML private TextField emailField;
    @FXML private AddressBook.Student student;
    @FXML
    protected void addStudent(ActionEvent event) {
        AddressBook.Student student1 = new AddressBook.Student(
                firstNameField.getText(),
                lastNameField.getText(),
                emailField.getText());
        ObservableList<Student> data = tableView.getItems();
        data.add(student1);
        firstNameField.setText("");
        lastNameField.setText("");
        emailField.setText("");
        student = student1;
    }


    @FXML
    protected void removeStudent(ActionEvent event) {
        ObservableList<Student> data = tableView.getItems();
        data.remove(student);
    };

    }

