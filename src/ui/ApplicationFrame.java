package ui;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ApplicationFrame extends JFrame {
  private static final long serialVersionUID = 1L;

  public static void main(String[] args) {
    EventQueue.invokeLater(() -> new ApplicationFrame().setVisible(true));
  }

  public ApplicationFrame() throws HeadlessException {
    super("Contact Editor");
    setLayout(new GridBagLayout());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    add(createNamePanel(),   new GridBagConstraints(0, 0, 1, 1, 1, 0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));
    add(createEmailPanel(),  new GridBagConstraints(0, 1, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.BOTH,       new Insets(5, 5, 5, 5), 0, 0));
    add(createOkCancel(),    new GridBagConstraints(0, 2, 1, 1, 1, 0, GridBagConstraints.EAST, GridBagConstraints.NONE,       new Insets(5, 5, 5, 5), 0, 0));

    pack();
  }


  protected JPanel createNamePanel() {
    JPanel panel = new JPanel(new GridBagLayout());
    panel.setBorder(BorderFactory.createTitledBorder("Name"));

    panel.add(new JLabel("First Name:"),     new GridBagConstraints(0, 0, 1, 1, 0, 0, GridBagConstraints.EAST, GridBagConstraints.NONE,       new Insets(5, 5, 5, 5), 0, 0));
    panel.add(new JTextField(20),            new GridBagConstraints(1, 0, 1, 1, 1, 0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));
    panel.add(new JLabel("Last Name:"),      new GridBagConstraints(2, 0, 1, 1, 0, 0, GridBagConstraints.EAST, GridBagConstraints.NONE,       new Insets(5, 5, 5, 5), 0, 0));
    panel.add(new JTextField(20),            new GridBagConstraints(3, 0, 1, 1, 1, 0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));

    panel.add(new JLabel("Title:"),          new GridBagConstraints(0, 1, 1, 1, 0, 0, GridBagConstraints.EAST, GridBagConstraints.NONE,       new Insets(5, 5, 5, 5), 0, 0));
    panel.add(new JTextField(20),            new GridBagConstraints(1, 1, 1, 1, 1, 0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));
    panel.add(new JLabel("Nickname:"),       new GridBagConstraints(2, 1, 1, 1, 0, 0, GridBagConstraints.EAST, GridBagConstraints.NONE,       new Insets(5, 5, 5, 5), 0, 0));
    panel.add(new JTextField(20),            new GridBagConstraints(3, 1, 1, 1, 1, 0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));

    panel.add(new JLabel("Company Profile"), new GridBagConstraints(0, 2, 1, 1, 0, 0, GridBagConstraints.EAST, GridBagConstraints.NONE,       new Insets(5, 5, 5, 5), 0, 0));
    panel.add(new JComboBox<>(new String[] {"industrial technical stuff"}),
                                             new GridBagConstraints(1, 2, 3, 1, 1, 0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));

    return panel;
  }

  protected JPanel createEmailPanel() {
    JPanel panel = new JPanel(new GridBagLayout());
    panel.setBorder(BorderFactory.createTitledBorder("Email"));


    panel.add(new JLabel("Email Address:"), new GridBagConstraints(0, 0, 1, 1, 0, 0, GridBagConstraints.EAST,      GridBagConstraints.NONE,       new Insets(5, 5, 5, 5), 0, 0));
    panel.add(new JTextField(20),           new GridBagConstraints(1, 0, 1, 1, 1, 0, GridBagConstraints.WEST,      GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));
    panel.add(new JButton("Add"),           new GridBagConstraints(2, 0, 1, 1, 0, 0, GridBagConstraints.WEST,      GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));

    panel.add(new JTextArea(),              new GridBagConstraints(0, 1, 2, 3, 1, 1, GridBagConstraints.WEST,      GridBagConstraints.BOTH,       new Insets(5, 5, 5, 5), 0, 0));
    panel.add(new JButton("Edit"),          new GridBagConstraints(2, 1, 1, 1, 0, 0, GridBagConstraints.WEST,      GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));
    panel.add(new JButton("Remove"),        new GridBagConstraints(2, 2, 1, 1, 0, 0, GridBagConstraints.WEST,      GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));
    panel.add(new JButton("As Default"),    new GridBagConstraints(2, 3, 1, 1, 0, 0, GridBagConstraints.NORTHWEST, GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));

    panel.add(new JLabel("Mail Format:"),   new GridBagConstraints(0, 4, 3, 1, 1, 0, GridBagConstraints.WEST,      GridBagConstraints.NONE,       new Insets(5, 5, 5, 5), 0, 0));
    panel.add(createMailFormat(),           new GridBagConstraints(0, 5, 3, 1, 1, 0, GridBagConstraints.WEST,      GridBagConstraints.NONE,       new Insets(5, 5, 5, 5), 0, 0));

	return panel;
  }

  protected JPanel createMailFormat() {
    JPanel panel = new JPanel(new GridBagLayout());

    ButtonGroup bg = new ButtonGroup();

    JRadioButton html   = new JRadioButton("HTML"      ); bg.add(html  );
    JRadioButton plain  = new JRadioButton("Plain Text"); bg.add(plain );
    JRadioButton custom = new JRadioButton("Custom"    ); bg.add(custom);

    panel.add(html,   new GridBagConstraints(0, 1, 1, 1, 0, 0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
    panel.add(plain,  new GridBagConstraints(1, 1, 1, 1, 0, 0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
    panel.add(custom, new GridBagConstraints(2, 1, 1, 1, 0, 0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));

    return panel;
  }

  protected JPanel createOkCancel() {
    JPanel panel = new JPanel(new GridBagLayout());

    panel.add(new JButton("Ok"),     new GridBagConstraints(0, 0, 1, 1, 0, 0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(10, 10, 0, 10), 0, 0));
    panel.add(new JButton("Cancel"), new GridBagConstraints(1, 0, 1, 1, 0, 0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(10, 10, 0, 10), 0, 0));

    return panel;
  }

}
