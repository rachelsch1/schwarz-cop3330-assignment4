package ucf.assignments;

public class Item {
    /*
    has string "description"
    has string "dueDate"
    has boolean "status"
     */


    // constructor for Item object: takes description and dueDate parameters
    public Item() {
        /*
        use "this":
        create description
        create due date
        set default status to false
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

  //  public boolean getStatus() {
        // return status
  //  }

    public void markComplete() {
        // set status to true
    }

    public void markIncomplete() {
        // set status to false
    }
}
