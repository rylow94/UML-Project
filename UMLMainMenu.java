import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;


@SuppressWarnings("serial")
public class UMLMainMenu extends JMenuBar {

	UMLMainMenu()
	{
		// TODO Streamline this so it's not hard coded - read an XML file?
		JMenu menuFile = new JMenu("File");
		menuFile.setMnemonic(KeyEvent.VK_F);
		menuFile.getAccessibleContext().setAccessibleDescription("File Management");
		this.add(menuFile);
		
		
		JMenu menuEdit = new JMenu("Edit");
		menuEdit.setMnemonic(KeyEvent.VK_D);
		menuEdit.getAccessibleContext().setAccessibleDescription("Edit Management");
		this.add(menuEdit);
		
		
		JMenu menuView = new JMenu("View");
		menuView.setMnemonic(KeyEvent.VK_V);
		menuView.getAccessibleContext().setAccessibleDescription("View");
		this.add(menuView);
		
		
		JMenu menuHelp = new JMenu("Help");
		menuHelp.setMnemonic(KeyEvent.VK_H);
		menuHelp.getAccessibleContext().setAccessibleDescription("Help");
		this.add(menuHelp);
		
		
		
		
		JMenuItem fileMenu_New = new JMenuItem("New UML Diagram");
		fileMenu_New.setMnemonic(KeyEvent.VK_U);
		fileMenu_New.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
		fileMenu_New.getAccessibleContext().setAccessibleDescription("New UML Diagram");
		menuFile.add(fileMenu_New);
		
		JMenuItem fileMenu_OpenProject = new JMenuItem("Open UML Diagram");
		fileMenu_OpenProject.setMnemonic(KeyEvent.VK_O);
		fileMenu_OpenProject.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
		fileMenu_OpenProject.getAccessibleContext().setAccessibleDescription("Open UML Diagram");
		menuFile.add(fileMenu_OpenProject);
		
		menuFile.addSeparator();
		
		JMenuItem fileMenu_Save = new JMenuItem("Save");
		fileMenu_Save.setMnemonic(KeyEvent.VK_S);
		fileMenu_Save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3, ActionEvent.ALT_MASK));
		fileMenu_Save.getAccessibleContext().setAccessibleDescription("Save UML Diagram");
		menuFile.add(fileMenu_Save);
		
		JMenuItem fileMenu_SaveAs = new JMenuItem("Save UML Diagram As...");
		fileMenu_SaveAs.setMnemonic(KeyEvent.VK_A);
		fileMenu_SaveAs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_4, ActionEvent.ALT_MASK));
		fileMenu_SaveAs.getAccessibleContext().setAccessibleDescription("Save UML Diagram As...");
		menuFile.add(fileMenu_SaveAs);
		
		menuFile.addSeparator();
		
		JMenuItem fileMenu_Exit = new JMenuItem("Exit");
		fileMenu_Exit.setMnemonic(KeyEvent.VK_X);
		fileMenu_Exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_5, ActionEvent.ALT_MASK));
		fileMenu_Exit.getAccessibleContext().setAccessibleDescription("Exit");
		menuFile.add(fileMenu_Exit);
		
		// TODO Example of how to add functionality to individual menu items ... is there a better way?
		fileMenu_Exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });
		
		
		// TODO Code for edit/view/help (if we want a help menu?)
		
		
		
				
	}
}
