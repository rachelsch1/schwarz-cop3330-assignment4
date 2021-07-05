package ucf.assignments;

import ucf.assignments.Item;
import java.util.*;

public class List {
    /*
    has a string "title"
    has a list of items "itemList"
    has a string "directory"
     */

    // constructor
    public List() {
        /*
        using "this":
        set title to "New List"
        create empty item list
         */
    }

  //  public String getTitle() {
        // returns title
  //  }

    // takes parameter title
    public void setTitle() {
        // set title
    }

    public void setDirectory() {
        /*
        set directory as input
         */
    }

    // takes parameter description and due date
    public void addNewItem() {
        /*
         create new item object
         call item constructor
         once item is created and initialized, add to itemList
         */
    }

    // takes parameter oldDesc and newDesc
    public void editDescription() {
        /*
        while loop- loop through itemList until oldDesc parameter is equal to item.description
        call item.setDescription and pass newDesc
         */
    }

    // takes parameter description and newDate
    public void editDueDate() {
        /*
        while loop- loop through itemList until description parameter is equal to item.description
        call item.setDueDate and pass new due date
         */
    }

    // takes parameter description and newStatus
    public void editStatus() {
        /*
        while loop- loop through itemList until description parameter is equal to item.description
        if new status is true, call item.markComplete
        if new status is false, call item.markIncomplete
         */
    }

    // takes parameter description
    public void deleteItem() {
        /*
        while loop- loop through itemList until description parameter is equal to item.description
        remove item from list
         */
    }

    public void createDirectory() {
        /*
        create new directory based on what is in the "directory" string
        if directory already exists, this should do nothing
         */
    }

    public void saveListExternally() {
        /*
        create new text file "[list title].txt" in the specified directory
            using file writer, write list to a file
                first line is list title
                each subsequent line are items: description, due date, and status separated by commas
                i.e.: "todo list title,due date,status"
         */
    }
}
