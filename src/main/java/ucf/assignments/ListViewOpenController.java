package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ListViewOpenController implements Initializable {

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

    private List selectedList;

    // start of methods that set up editable table

    public void initialize(URL location, ResourceBundle resources) {
        /*
        call initTable
        call loadData
        call setTitle
         */
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
        set table items as selectedList.itemList
         */
    }

    private void loadNewData() {
    /*
    add new item to itemList with default info
    set table items as itemList
     */
    }

    // end of methods that set up editable table

    private void setTitle() {
        /*
        set list title as selectedList.title
         */
    }

    @FXML
    private void itemAdded(ActionEvent event) {
    /*
    call loadNewData which adds a new row to the table
     */
    }

    @FXML
    void backButtonClicked(ActionEvent event) {
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
    void deleteItemButtonClicked(ActionEvent event) {
    /*
    remove row from tableview
    call List.deleteItem, pass description
     */
    }

    @FXML
    void deleteListButtonClicked(ActionEvent event) {
    /*
    call TodoList.deleteList and pass list title
    go back to start window:
        create new parent and open TodoList.fxml
        create new scene
        create new stage and get stage info
        set scene
        show window
     */
    }

    @FXML
    void listTitleEdited(ActionEvent event) {
    /*
    change the list object's title field to the user's input
     */
    }

    @FXML
    void markedComplete(ActionEvent event) {
    /*
    change value of item.status to C
     */
    }

    @FXML
    void markedIncomplete(ActionEvent event) {
    /*
    change value of item.status to I
     */
    }
    private void loadComplete() {
        /*
        loop through selectedList's items
        if status = I, skip
        if status = C, load into table
         */
    }

    private void loadIncomplete() {
        /*
        loop through selectedList's items
        if status = I, load into table
        if status = C, skip
         */
    }

    @FXML
    void showCompleteSelected(ActionEvent event) {
        /*
        call loadComplete
         */
    }

    @FXML
    void showIncompleteSelected(ActionEvent event) {
        /*
        call loadIncomplete
         */
    }

    @FXML
    void showAllSelected(ActionEvent event) {
        /*
        call loadData
         */
    }

    @FXML
    void saveListButtonClicked(ActionEvent event) {
    /*
    (save current list)
    prompt user for directory:
        create new text input dialog
        set title of text input dialog
        set content of input dialog to "please input directory"
        set field as string and show and wait

        create new text field and make editable
        collect user input
        call List.setDirectory
        call List.createDirectory
        call List.saveListExternally
     */
    }

}
