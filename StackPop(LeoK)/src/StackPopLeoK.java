import javax.swing.JOptionPane;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class StackPopLeoK {

	protected Shell shlStackPop;
	private Stack stackClass;
	private Text txt_num;
	
	//variables
	int num;
	String numString;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			StackPopLeoK window = new StackPopLeoK();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlStackPop.open();
		shlStackPop.layout();
		while (!shlStackPop.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	
	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlStackPop = new Shell();
		shlStackPop.setSize(244, 240);
		shlStackPop.setText("Stack - Pop by Leo Kay");
		
		Label lblPleaseEnterAn = new Label(shlStackPop, SWT.NONE);
		lblPleaseEnterAn.setBounds(10, 13, 129, 15);
		lblPleaseEnterAn.setText("Please enter an integer:");
		
		List lst_nums = new List(shlStackPop, SWT.BORDER);
		lst_nums.setBounds(31, 65, 167, 112);
		
		txt_num = new Text(shlStackPop, SWT.BORDER);
		txt_num.setBounds(145, 7, 76, 21);
		
		stackClass = new Stack();
		
		Button btnAdd = new Button(shlStackPop, SWT.NONE);
		btnAdd.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				
				//try to get the num
				try {
					//convert the text in the text box to an int
					num = Integer.parseInt(txt_num.getText());
					
					//Push the number to the stack
					stackClass.Push(num);
					
					//convert the num to a string
					numString = Integer.toString(num);
					
					//display the num
					lst_nums.add(numString);
				} catch (Exception e1) {
					//display a message box
					JOptionPane.showMessageDialog(null, "Please enter a correct value", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnAdd.setBounds(31, 34, 75, 25);
		btnAdd.setText("Add");
		
		Button btnNewButton = new Button(shlStackPop, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try {
					//call pop
					stackClass.Pop();
					
					//remove the number from the list
					lst_nums.remove(lst_nums.getItemCount() - 1);
				} catch (Exception e1) {
					//display a message box
					JOptionPane.showMessageDialog(null, "Please enter a correct value", "Error", JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		btnNewButton.setBounds(123, 34, 75, 25);
		btnNewButton.setText("Pop");
	}
}
