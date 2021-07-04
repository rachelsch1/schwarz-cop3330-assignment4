package ucf.assignments;

public class Item {
    /*
    has string "description"
    has string "dueDate"
    has string "status"
     */


    // constructor for Item object: takes description and dueDate parameters
    public Item() {
        /*
        use "this":
        create description
        create due date
        set default status to I
         */
    }

    // getters and setters for item object

  //  public String getDescription() {
        // returns description
  //  }

    // takes description parameter
    public void setDescription() {
        // set description
    }

  //  public String getDueDate() {
        // returns dueDate
  //  }

    // takes dueDate parameter
    public void setDueDate() {
        // set due date
    }

  //  public String getStatus() {
        // return status
  //  }

    public void markComplete() {
        // set status to C
    }

    public void markIncomplete() {
        // set status to I
    }
}
