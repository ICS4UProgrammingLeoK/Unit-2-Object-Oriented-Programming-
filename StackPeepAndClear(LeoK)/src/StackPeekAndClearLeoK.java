/*
 * Created by Leo Kay
 * Created on: 4-03-2020
 * Created for: ICS4U
 * Day #19 (Stack - Peek and Clear)
 * This program creates a stack and pushes numbers on it, and also pops numbers from the stack
 * It can also peek and clear the stack
*/

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import javax.swing.JOptionPane;

public class StackPeekAndClearLeoK {

	protected Shell shlStackPeek;
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
			StackPeekAndClearLeoK window = new StackPeekAndClearLeoK();
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
		shlStackPeek.open();
		shlStackPeek.layout();
		while (!shlStackPeek.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlStackPeek = new Shell();
		shlStackPeek.setSize(267, 319);
		shlStackPeek.setText("Stack - Peek and Clear by Leo Kay");
		
		List lst_nums = new List(shlStackPeek, SWT.BORDER);
		lst_nums.setBounds(41, 72, 160, 146);
		
		Label lblPleaseEnterAn = new Label(shlStackPeek, SWT.NONE);
		lblPleaseEnterAn.setBounds(10, 10, 131, 15);
		lblPleaseEnterAn.setText("Please enter an integer:");
		
		txt_num = new Text(shlStackPeek, SWT.BORDER);
		txt_num.setBounds(168, 7, 76, 21);
		
		stackClass = new Stack();
		
		Label lbl_peek = new Label(shlStackPeek, SWT.NONE);
		
		Button btn_add = new Button(shlStackPeek, SWT.NONE);
		btn_add.addSelectionListener(new SelectionAdapter() {
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
		btn_add.setBounds(41, 41, 75, 25);
		btn_add.setText("Add");
		
		Button btn_pop = new Button(shlStackPeek, SWT.NONE);
		btn_pop.addSelectionListener(new SelectionAdapter() {
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
		btn_pop.setBounds(126, 41, 75, 25);
		btn_pop.setText("Pop");
		
		Button btn_peek = new Button(shlStackPeek, SWT.NONE);
		btn_peek.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//variable
				int peekValue;
				
				try {
					//peek the list
					peekValue = Integer.parseInt(lst_nums.getItem(lst_nums.getItemCount() - 1));
					lbl_peek.setText("The number at the top of the list is: " + peekValue);
				} catch (Exception e1) {
					//display a message box
					JOptionPane.showMessageDialog(null, "Please enter a correct value", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btn_peek.setBounds(41, 224, 75, 25);
		btn_peek.setText("Peek");
		
		Button btn_clear = new Button(shlStackPeek, SWT.NONE);
		btn_clear.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try {
					//call clear
					stackClass.Clear();
					
					//clear the list
					lst_nums.removeAll();
				} catch (Exception e1) {
					//display a message box
					JOptionPane.showMessageDialog(null, "Please enter a correct value", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btn_clear.setBounds(126, 224, 75, 25);
		btn_clear.setText("Clear");
		
		lbl_peek.setBounds(10, 255, 234, 15);

	}
}
