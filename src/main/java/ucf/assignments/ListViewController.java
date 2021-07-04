package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class ListViewController  implements Initializable {
    @FXML
    private TextField listTitle;

    @FXML
    private TableView<List> list;

    @FXML
    private TableColumn<Item, String> colItem;

    @FXML
    private TableColumn<Item, String> colDate;

    @FXML
    private TableColumn<Item, String> colStatus;

    // start of methods that set up editable table

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
        add new item to itemList with default info
        set table items as itemList
         */
    }

    // end of methods that set up editable table

    @FXML
    private void itemAdded(ActionEvent e) {
        /*
        call load data which adds a new row to the table
         */
    }

    @FXML
    void backButtonClicked(MouseEvent event) {
        /*
        go back to start window:
            create new parent and open TodoList.fxml
            create new scene
            create new stage and get stage info
            set scene
            show window
         */
    }

    @FXML
    void deleteItemButtonClicked(MouseEvent event) {

    }

    @FXML
    void deleteListButtonClicked(MouseEvent event) {

    }

    @FXML
    void listTitleEdited(ActionEvent event) {
        /*
        change the list object's title field to the user's input
         */
    }

    @FXML
    void markedComplete(MouseEvent event) {
        /*
        change value of item.status to C
         */
    }

    @FXML
    void markedIncomplete(MouseEvent event) {
        /*
        change value of item.status to I
         */
    }
}
