package ucf.assignments;

import ucf.assignments.Item;
import java.util.*;

public class List {
    /*
    has a string "title"
    has a list of items "itemList"
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

    public void saveItemsExternally() {

    }
}
