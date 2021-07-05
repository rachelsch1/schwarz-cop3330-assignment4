package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class TodoListController {

    @FXML
    public void loadListButtonClicked(ActionEvent event) {
        /*
        prompt user for directory & list name:
            create new text input dialog
            set title of text input dialog
            set content of input dialog to "please input directory and list title"
            set field as string and show and wait
            create new text field for directory and make editable
            collect user input
            create new text field for title and make editable
            collect user input

        call TodoList.setDirectory
        call TodoList.createDirectory
        call TodoList.loadList, pass title

        create new menu item under the open list menu button
        set button text to the list's title
        set action event to openListButtonClicked

        (change to list view open)
        create new loader and open ListViewOpen.fxml
        load file
        create new parent
        create new scene
        create new ListViewOpenController and use loader to get controller
        call the controller.initialize and pass the list the user selected
        create new stage and get stage info
        set scene
        show window
         */
    }

    @FXML
    public void newListButtonClicked(ActionEvent event) {
        /*
        add list to TodoList.todoLists

        create new menu item under the open list menu button
        set button text to the list's title
        set action event to openListButtonClicked

        go to list view window:
            declare new parent and open ListView.fxml
            declare new scene
            declare  new stage and get stage info
            set scene
            show window
         */
    }

    @FXML
    public void saveListsButtonClicked(ActionEvent event) {
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

    @FXML
    public void openListButtonClicked(ActionEvent event) {
        /*
        create new loader and open ListViewOpen.fxml
        load file
        create new parent
        create new scene
        create new ListViewOpenController and use loader to get controller
        call the controller.initialize and pass the list the user selected
        create new stage and get stage info
        set scene
        show window
         */
    }
}
