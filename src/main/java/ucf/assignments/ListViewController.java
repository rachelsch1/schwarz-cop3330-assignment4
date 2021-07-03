package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class ListViewController {
    @FXML
    private TextField listTitle;

    @FXML
    private TableView<TodoList> list;

    @FXML
    private TableColumn<TodoList, String> colItem;

    @FXML
    private TableColumn<TodoList, String> colDate;

    @FXML
    private TableColumn<TodoList, Boolean> colStatus;

    //@Override
    public void initialize(URL location, ResourceBundle resources) {
        // call initTable
    }

    private void initTable() {
        // call initCols
    }

    private void initCols() {
        /*
        set description value as "description"
        set due date value as "dueDate"
        set status value as "status"

        call editTableCols
        */
    }

    private void editableCols() {
        /*
         description:
         set cell as text field
         set value as user input

         due date:
         set cell as text field
         set value as user input

         status:
         set cell as text field
         set value as user input

         set table info to editable
         */
    }

    private void loadData() {
        /*

         */
    }

    @FXML
    void backButtonClicked(MouseEvent event) {

    }

    @FXML
    void deleteItemButtonClicked(MouseEvent event) {

    }

    @FXML
    void deleteListButtonClicked(MouseEvent event) {

    }

    @FXML
    void itemAdded(ActionEvent event) {

    }

    @FXML
    void listTitleEdited(ActionEvent event) {

    }

    @FXML
    void markedComplete(MouseEvent event) {

    }

    @FXML
    void markedIncomplete(MouseEvent event) {

    }
}
