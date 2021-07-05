package ucf.assignments;

public class TodoList {

    /*
    has list of Lists "todoLists"
    has string "directory"
     */

    // constructor
    public TodoList() {
        /*
        using "this":
        declare an empty list of Lists
        declare empty directory string
         */
    }

    // takes string directory
    public void setDirectory() {
        /*
        set directory as input
         */
    }

    public void createDirectory() {
        /*
        create new directory based on what is in the "directory" string
        if directory alr exists, this should do nothing
         */
    }

    public void addNewList() {
        /*
        create a new List object
        add new List to list of Lists
         */
    }

    // takes parameter title
    public void deleteList() {
        /*
        while loop- loop through todoLists until title parameter is equal to list.title
        remove list from todoList
         */
    }

    // takes parameters oldTitle and newTitle
    public void editListTitle() {
        /*
        while loop- loop through todoLists until oldTitle is equal to list.title
        call list.setTitle and pass newTitle
         */
    }

    public void saveAllExternally() {
        /*
        for loop
            iterate thru list of todo lists
            for each list, create new text file "[list title].txt" in the specified directory
            using file writer, write each list to a file
                first line is list title
                each subsequent line are items: description, due date, and status separated by commas
                i.e.: "todo list title,due date,status"
         */
    }

    // takes parameter title
  //  public List getList() {
        /*
        while loop- loop through todoLists until title parameter is equal to list.title
        return list
         */
  //  }

    public void loadList() {

    }

}
