package UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import net.sf.memoranda.ui.TaskTable;

public class test {

	@Test
	public void test() {
		/*
		 * Test whether or not the string from getTask(String TaskID) works.
		 */
		TaskTable testTable = new TaskTable();
		testTable.setRowHeight(10);
		
		assertTrue(testTable.getRowHeight() == 10);
	}

}