package UnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import net.sf.memoranda.CurrentProject;
import net.sf.memoranda.Task;
import net.sf.memoranda.date.CalendarDate;
import net.sf.memoranda.ui.TaskPanel;
import net.sf.memoranda.ui.TaskTable;

public class TestCase {

	@Test
	public void test() {
		
		TaskTable taskTable = new TaskTable();
		
		int rc = taskTable.getRowCount();
		taskTable.selectAll();
		int[] list = taskTable.getSelectedRows();
		for(int i = 0; i < rc; i++){
			Task t =
					CurrentProject.getTaskList().getTask(
			                taskTable.getModel().getValueAt(list[i], TaskTable.TASK_ID).toString());
			assertFalse(t.getID() == "100");
		}
		
	}

}
