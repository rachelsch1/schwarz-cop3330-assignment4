/*
    setDirectory()
    createDirectory()
    addNewList()
    deleteList()
    editListTitle()
    saveAllExternally()
    loadList()
 */

import ucf.assignments.TodoList;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class TodoListTests {

    @Test
    private void testTodoListPass() {
         /*
        create two TodoLists: expected and actual
        populate expected with the values the method should populate with
        call actual.TodoList to populate
        call assert equals
        should return true
          */
    }

    @Test
    private void testTodoListFail() {
         /*
        create two TodoLists: expected and actual
        populate expected with random values
        call actual.TodoList to populate
        call assert equals
        should return false
          */
    }

    @Test
    private void testSetDirectoryPass() {
        /*
        create string: expected
        set expected to a string
        create todolist: actual
        call actual.setDirectory and pass same string
        call assert equals
        should return true
         */
    }

    @Test
    private void testSetDirectoryFail() {
        /*
        create string: expected
        set expected to a string
        create todolist: actual
        call actual.setDirectory and pass diff string
        call assert equals
        should return false
         */
    }

    @Test
    private void testCreateDirectoryPass() {
         /*
        create string str
        write directory to str
        create todolist
        set directory to str
        call todolist.createDirectory
        check if folder exists
          */
    }

    @Test
    private void testAddNewListPass() {
        /*
        create two todolists: actual and expected
        add two items to expected's todoLists
        add one item to actual's todoLists
        call actual.addNewList
        test if list lengths are the same
        call assert equals
        should return true
         */
    }

    @Test
    private void testAddNewListFail() {
        /*
        create two todolists: actual and expected
        add three items to expected's todoLists
        add one item to actual's todoLists
        call actual.addNewList
        test if list lengths are the same
        call assert equals
        should return true
         */
    }

    @Test
    private void testDeleteListPass() {
        /*
        create two todolists: actual and expected
        add one item to expected's todoLists
        add two items to actual's todoLists
        call actual.deleteList
        test if list lengths are the same
        call assert equals
        should return true
         */
    }

    @Test
    private void testDeleteListFail() {
        /*
        create two todolists: actual and expected
        add three item to expected's todoLists
        add two items to actual's todoLists
        call actual.deleteList
        test if list lengths are the same
        call assert equals
        should return false
         */
    }

    @Test
    private void testEditListTitlePass() {
        /*
        create a string: expected
        set expected to a string
        create a todolist: actual
        add two lists to actual.todoLists and assign random titles
        call actual.editTitle on one of the items and pass same string as expected
        call assert equals
        should return true
         */
    }

    @Test
    private void testEditListTitleFail() {
        /*
        create a string: expected
        set expected to a string
        create a todolist: actual
        add two lists to actual.todoLists and assign random titles
        call actual.editTitle on one of the items and pass diff string than expected
        call assert equals
        should return true
         */
    }

    @Test
    private void testSaveAllExternallyPass() {
        /*
        create todolist: todolL
        add one list to todoLists, set title, and populate with an item or two
        call todoL.saveAllExternally
        check if file exists
        use scanner to check if file contents are accurate
         */
    }

}
