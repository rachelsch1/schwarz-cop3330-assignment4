package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class TodoListController {

    @FXML
    public void loadListButtonClicked(ActionEvent actionEvent) {
        /*
        prompt user for directory:
            create new text input dialog
            set title of text input dialog
            set content of input dialog to "please input directory"
            set field as string and show and wait

            create new text field and make editable
            collect user input

        call TodoList.loadList

        (change to list view)
        create new parent and open ListView.fxml
        create new scene
        create new stage and get stage info
        set scene
        show window
         */
    }

    @FXML
    public void newListButtonClicked(ActionEvent actionEvent) {
        /*
        add list to TodoList.todoLists
        go to list view window:
            declare new parent and open ListView.fxml
            declare new scene
            declare  new stage and get stage info
            set scene
            show window
         */
    }

    @FXML
    public void saveListsButtonClicked(ActionEvent actionEvent) {
        /*
        (save all lists in app)
        prompt user for directory:
            create new text input dialog
            set title of text input dialog
            set content of input dialog to "please input directory"
            set field as string and show and wait

            create new text field and make editable
            collect user input
            call TodoList.setDirectory
            call TodoList.createDirectory
            call TodoList.saveAllExternally
         */
    }
}
