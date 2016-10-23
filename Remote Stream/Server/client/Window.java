

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import javax.swing.Box;
import javax.swing.JSeparator;
import javax.swing.border.BevelBorder;

public class Window {

	private JFrame frmClubH;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frmClubH.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window() {
		initialize();
	}

	/**s
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmClubH = new JFrame();
		frmClubH.setTitle("Club H");
		frmClubH.setIconImage(Toolkit.getDefaultToolkit().getImage(Window.class.getResource("/com/sun/javafx/webkit/prism/resources/mediaTimeThumb.png")));
		frmClubH.setBounds(100, 100, 717, 569);
		frmClubH.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmClubH.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel status = new JPanel();
		status.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frmClubH.getContentPane().add(status, BorderLayout.NORTH);
		GridBagLayout gbl_status = new GridBagLayout();
		gbl_status.columnWidths = new int[]{163, 35, 232, 73, 20, 0};
		gbl_status.rowHeights = new int[]{23, 0, 0};
		gbl_status.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_status.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		status.setLayout(gbl_status);
		
		JLabel lblStatus = new JLabel("Status:");
		GridBagConstraints gbc_lblStatus = new GridBagConstraints();
		gbc_lblStatus.anchor = GridBagConstraints.WEST;
		gbc_lblStatus.insets = new Insets(0, 0, 5, 5);
		gbc_lblStatus.gridx = 1;
		gbc_lblStatus.gridy = 0;
		status.add(lblStatus, gbc_lblStatus);
		
		JLabel lblNotConnectedYet = new JLabel("Not Connected yet, press the button to connect");
		GridBagConstraints gbc_lblNotConnectedYet = new GridBagConstraints();
		gbc_lblNotConnectedYet.anchor = GridBagConstraints.WEST;
		gbc_lblNotConnectedYet.insets = new Insets(0, 0, 5, 5);
		gbc_lblNotConnectedYet.gridx = 2;
		gbc_lblNotConnectedYet.gridy = 0;
		status.add(lblNotConnectedYet, gbc_lblNotConnectedYet);
		
		JButton btnConnect = new JButton("Connect");
		GridBagConstraints gbc_btnConnect = new GridBagConstraints();
		gbc_btnConnect.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnConnect.insets = new Insets(0, 0, 5, 5);
		gbc_btnConnect.gridx = 3;
		gbc_btnConnect.gridy = 0;
		status.add(btnConnect, gbc_btnConnect);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setPreferredSize(new Dimension(20, 20));
		horizontalStrut.setMinimumSize(new Dimension(20, 20));
		GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
		gbc_horizontalStrut.insets = new Insets(0, 0, 0, 5);
		gbc_horizontalStrut.gridx = 2;
		gbc_horizontalStrut.gridy = 1;
		status.add(horizontalStrut, gbc_horizontalStrut);
		
		JPanel video = new JPanel();
		video.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		video.setPreferredSize(new Dimension(300, 300));
		frmClubH.getContentPane().add(video, BorderLayout.CENTER);
		
		JLabel lblCurrentlyPlaying = new JLabel("Currently Playing:");
		video.add(lblCurrentlyPlaying);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frmClubH.getContentPane().add(panel, BorderLayout.EAST);
		
		JLabel lblMenu = new JLabel("Menu");
		panel.add(lblMenu);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setPreferredSize(new Dimension(400, 0));
		panel.add(horizontalStrut_1);
		
		JPanel Control = new JPanel();
		Control.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frmClubH.getContentPane().add(Control, BorderLayout.SOUTH);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setPreferredSize(new Dimension(0, 100));
		Control.add(verticalStrut);
		
	}

}
