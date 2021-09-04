package MyCopyPastePanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class MyCopyPastePanel extends JFrame {
	/**
	 * Make easy WEB form input operation by copy & paste
	 */
	private static final long serialVersionUID = 1L;
	// get USERNAME
	static String USER_ID = System.getenv("USERNAME");
	// get USERPROFILE
	static String USER_PROFILE = System.getenv("USERPROFILE");
	// ClipBoard standby
	private static Toolkit kit = Toolkit.getDefaultToolkit();
	private static Clipboard clipboard = kit.getSystemClipboard();
	// properties file location, properties file name
	// file location & file name is %USERPROFILE%\\%USERNAME%.properties
	protected final static String properties_file = USER_PROFILE + "\\" + USER_ID + ".properties";
	// create properties instance
	private static final Properties properties = new Properties();

	// create objects
	private JPanel contentPane;

	protected static JTextField C00;
	protected static JTextField C01;
	protected static JTextField C02;
	protected static JTextField C03;
	protected static JTextField C04;
	protected static JTextField C05;
	protected static JTextField C06;
	protected static JTextField C07;
	protected static JTextField C08;
	protected static JTextField C09;
	protected static JTextField C10;
	protected static JTextField C11;
	protected static JTextField C12;
	protected static JTextField C13;
	protected static JTextField C14;
	protected static JTextField C15;
	protected static JTextField C16;
	protected static JTextField C17;
	protected static JTextField C18;
	protected static JTextField C19;
	protected static JTextField C20;
	protected static JTextField C21;
	protected static JTextField C22;
	protected static JTextField C23;
	protected static JTextField C24;
	protected static JTextField C25;
	protected static JTextField C26;
	protected static JTextField C27;
	protected static JTextField C28;
	protected static JTextField C29;
	protected static JTextField C30;
	protected static JTextField C31;
	protected static JTextField C32;
	protected static JTextField C33;
	protected static JTextField C34;
	protected static JTextField C35;
	protected static JTextField C36;
	protected static JTextField C37;
	protected static JTextField C38;
	protected static JTextField C39;
	protected static JTextField C40;
	protected static JTextField C41;

	protected static String C00_str = null;
	protected static String C01_str = null;
	protected static String C02_str = null;
	protected static String C03_str = null;
	protected static String C04_str = null;
	protected static String C05_str = null;
	protected static String C06_str = null;
	protected static String C07_str = null;
	protected static String C08_str = null;
	protected static String C09_str = null;
	protected static String C10_str = null;
	protected static String C11_str = null;
	protected static String C12_str = null;
	protected static String C13_str = null;
	protected static String C14_str = null;
	protected static String C15_str = null;
	protected static String C16_str = null;
	protected static String C17_str = null;
	protected static String C18_str = null;
	protected static String C19_str = null;
	protected static String C20_str = null;
	protected static String C21_str = null;
	protected static String C22_str = null;
	protected static String C23_str = null;
	protected static String C24_str = null;
	protected static String C25_str = null;
	protected static String C26_str = null;
	protected static String C27_str = null;
	protected static String C28_str = null;
	protected static String C29_str = null;
	protected static String C30_str = null;
	protected static String C31_str = null;
	protected static String C32_str = null;
	protected static String C33_str = null;
	protected static String C34_str = null;
	protected static String C35_str = null;
	protected static String C36_str = null;
	protected static String C37_str = null;
	protected static String C38_str = null;
	protected static String C39_str = null;
	protected static String C40_str = null;
	protected static String C41_str = null;

	private static JButton B00 = new JButton(C00_str);
	private static JButton B01 = new JButton(C01_str);
	private static JButton B02 = new JButton(C02_str);
	private static JButton B03 = new JButton(C03_str);
	private static JButton B04 = new JButton(C04_str);
	private static JButton B05 = new JButton(C05_str);
	private static JButton B06 = new JButton(C06_str);
	private static JButton B07 = new JButton(C07_str);
	private static JButton B08 = new JButton(C08_str);
	private static JButton B09 = new JButton(C09_str);
	private static JButton B10 = new JButton(C10_str);
	private static JButton B11 = new JButton(C11_str);
	private static JButton B12 = new JButton(C12_str);
	private static JButton B13 = new JButton(C13_str);
	private static JButton B14 = new JButton(C14_str);
	private static JButton B15 = new JButton(C15_str);
	private static JButton B16 = new JButton(C16_str);
	private static JButton B17 = new JButton(C17_str);
	private static JButton B18 = new JButton(C18_str);
	private static JButton B19 = new JButton(C19_str);
	private static JButton B20 = new JButton(C20_str);
	private static JButton B21 = new JButton(C21_str);
	private static JButton B22 = new JButton(C22_str);
	private static JButton B23 = new JButton(C23_str);
	private static JButton B24 = new JButton(C24_str);
	private static JButton B25 = new JButton(C25_str);
	private static JButton B26 = new JButton(C26_str);
	private static JButton B27 = new JButton(C27_str);
	private static JButton B28 = new JButton(C28_str);
	private static JButton B29 = new JButton(C29_str);
	private static JButton B30 = new JButton(C30_str);
	private static JButton B31 = new JButton(C31_str);
	private static JButton B32 = new JButton(C32_str);
	private static JButton B33 = new JButton(C33_str);
	private static JButton B34 = new JButton(C34_str);
	private static JButton B35 = new JButton(C35_str);
	private static JButton B36 = new JButton(C36_str);
	private static JButton B37 = new JButton(C37_str);
	private static JButton B38 = new JButton(C38_str);
	private static JButton B39 = new JButton(C39_str);
	private static JButton B40 = new JButton(C40_str);
	private static JButton B41 = new JButton(C41_str);

	protected static JPanel ButtonTab = new JPanel();

	// setUpProperties function
	private static void setUpProperties() {
		// set Key & Value from read in properties file
		C00_str = PropOpr.getProperty("C00", properties);
		C01_str = PropOpr.getProperty("C01", properties);
		C02_str = PropOpr.getProperty("C02", properties);
		C03_str = PropOpr.getProperty("C03", properties);
		C04_str = PropOpr.getProperty("C04", properties);
		C05_str = PropOpr.getProperty("C05", properties);
		C06_str = PropOpr.getProperty("C06", properties);
		C07_str = PropOpr.getProperty("C07", properties);
		C08_str = PropOpr.getProperty("C08", properties);
		C09_str = PropOpr.getProperty("C09", properties);
		C10_str = PropOpr.getProperty("C10", properties);
		C11_str = PropOpr.getProperty("C11", properties);
		C12_str = PropOpr.getProperty("C12", properties);
		C13_str = PropOpr.getProperty("C13", properties);
		C14_str = PropOpr.getProperty("C14", properties);
		C15_str = PropOpr.getProperty("C15", properties);
		C16_str = PropOpr.getProperty("C16", properties);
		C17_str = PropOpr.getProperty("C17", properties);
		C18_str = PropOpr.getProperty("C18", properties);
		C19_str = PropOpr.getProperty("C19", properties);
		C20_str = PropOpr.getProperty("C20", properties);
		C21_str = PropOpr.getProperty("C21", properties);
		C22_str = PropOpr.getProperty("C22", properties);
		C23_str = PropOpr.getProperty("C23", properties);
		C24_str = PropOpr.getProperty("C24", properties);
		C25_str = PropOpr.getProperty("C25", properties);
		C26_str = PropOpr.getProperty("C26", properties);
		C27_str = PropOpr.getProperty("C27", properties);
		C28_str = PropOpr.getProperty("C28", properties);
		C29_str = PropOpr.getProperty("C29", properties);
		C30_str = PropOpr.getProperty("C30", properties);
		C31_str = PropOpr.getProperty("C31", properties);
		C32_str = PropOpr.getProperty("C32", properties);
		C33_str = PropOpr.getProperty("C33", properties);
		C34_str = PropOpr.getProperty("C34", properties);
		C35_str = PropOpr.getProperty("C35", properties);
		C36_str = PropOpr.getProperty("C36", properties);
		C37_str = PropOpr.getProperty("C37", properties);
		C38_str = PropOpr.getProperty("C38", properties);
		C39_str = PropOpr.getProperty("C39", properties);
		C40_str = PropOpr.getProperty("C40", properties);
		C41_str = PropOpr.getProperty("C41", properties);
	}

	// writeProperties function
	private static void updateProperties(Properties prop) {
		prop.setProperty("C00", B00.getText());
		prop.setProperty("C01", B01.getText());
		prop.setProperty("C02", B02.getText());
		prop.setProperty("C03", B03.getText());
		prop.setProperty("C04", B04.getText());
		prop.setProperty("C05", B05.getText());
		prop.setProperty("C06", B06.getText());
		prop.setProperty("C07", B07.getText());
		prop.setProperty("C08", B08.getText());
		prop.setProperty("C09", B09.getText());
		prop.setProperty("C10", B10.getText());
		prop.setProperty("C11", B11.getText());
		prop.setProperty("C12", B12.getText());
		prop.setProperty("C13", B13.getText());
		prop.setProperty("C14", B14.getText());
		prop.setProperty("C15", B15.getText());
		prop.setProperty("C16", B16.getText());
		prop.setProperty("C17", B17.getText());
		prop.setProperty("C18", B18.getText());
		prop.setProperty("C19", B19.getText());
		prop.setProperty("C20", B20.getText());
		prop.setProperty("C21", B21.getText());
		prop.setProperty("C22", B22.getText());
		prop.setProperty("C23", B23.getText());
		prop.setProperty("C24", B24.getText());
		prop.setProperty("C25", B25.getText());
		prop.setProperty("C26", B26.getText());
		prop.setProperty("C27", B27.getText());
		prop.setProperty("C28", B28.getText());
		prop.setProperty("C29", B29.getText());
		prop.setProperty("C30", B30.getText());
		prop.setProperty("C31", B31.getText());
		prop.setProperty("C32", B32.getText());
		prop.setProperty("C33", B33.getText());
		prop.setProperty("C34", B34.getText());
		prop.setProperty("C35", B35.getText());
		prop.setProperty("C36", B36.getText());
		prop.setProperty("C37", B37.getText());
		prop.setProperty("C38", B38.getText());
		prop.setProperty("C39", B39.getText());
		prop.setProperty("C40", B40.getText());
		prop.setProperty("C41", B41.getText());
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		// call setUpProperties function
		setUpProperties();

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					// set frame LAF to Windows
					for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
							.getInstalledLookAndFeels()) {
						if ("Windows".equals(info.getName())) {
							javax.swing.UIManager.setLookAndFeel(info.getClassName());
							break;
						}
					}
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| javax.swing.UnsupportedLookAndFeelException ex) {
					java.util.logging.Logger.getLogger(MyCopyPastePanel.class.getName())
							.log(java.util.logging.Level.SEVERE, null, ex);
				}
				// create app instance
				try {

					MyCopyPastePanel frame = new MyCopyPastePanel();
					frame.setIconImage(java.awt.Toolkit.getDefaultToolkit()
							.getImage(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// loading properties
	static {
		try {
			properties.load(Files.newBufferedReader(Paths.get(properties_file), StandardCharsets.UTF_8));
		} catch (IOException e) {
			// write out properties for create properties
			try (FileOutputStream f = new FileOutputStream(properties_file);
					BufferedOutputStream b = new BufferedOutputStream(f)) {
				Properties prop = new Properties();
				updateProperties(prop);
				prop.store(b, "");
				b.close();
				f.close();
			} catch (IOException e01) {
				e01.printStackTrace();
			}
			System.out.println(String.format("Property File created:%s", properties_file));
		}
	}

	/**
	 * Create app frame.
	 */
	public MyCopyPastePanel() {
		setMinimumSize(new Dimension(384, 590));
		setMaximumSize(new Dimension(384, 590));
		setResizable(false);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {

			}

			@Override
			public void windowClosed(WindowEvent e) {
				// write out properties on exit app
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					updateProperties(prop);
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e01) {
					e01.printStackTrace();
				}
			}
		});
		setName("CopyPasteUtil");
		setFont(new Font("メイリオ", Font.PLAIN, 11));
		setLocationByPlatform(true);
		setTitle("Copy & Paste Panel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 384, 584);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(SwingConstants.TOP);
		tabbedPane.setBackground(new Color(240, 248, 255));
		tabbedPane.setBounds(0, 0, 377, 550);
		tabbedPane.setFont(new Font("メイリオ", Font.PLAIN, 11));
		contentPane.add(tabbedPane);

		JPanel ButtonTab = new JPanel();
		ButtonTab.setFont(new Font("メイリオ", Font.PLAIN, 11));
		ImageIcon tabicon = new javax.swing.ImageIcon(
				MyCopyPastePanel.class.getResource("/MyCopyPastePanel/buttons.png"));
		tabbedPane.addTab("MyButtons", tabicon, ButtonTab, null);
		tabbedPane.setBackgroundAt(0, new Color(245, 255, 250));
		tabbedPane.setEnabledAt(0, true);
		ButtonTab.setLayout(null);
		B00.setHorizontalTextPosition(SwingConstants.LEFT);

		//
		//
		//
		//
		B00.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				B00.setIcon(
						new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				B00.setIcon(new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				B00.setIcon(new javax.swing.ImageIcon(
						MyCopyPastePanel.class.getResource("/MyCopyPastePanel/thumbsup.png")));
			}
		});

		B00.setBorder(new LineBorder(new Color(255, 215, 0), 1, true));
		B00.setText(C00_str);
		B00.setBounds(new Rectangle(4, 22, 170, 20));
		B00.setToolTipText(C00_str);
		B00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String obj_str = B00.getText();
				StringSelection selection = new StringSelection(obj_str);
				clipboard.setContents(selection, null);
			}
		});
		B00.setHorizontalAlignment(SwingConstants.LEFT);
		B00.setFont(new Font("メイリオ", Font.PLAIN, 11));
		B00.setAutoscrolls(true);
		B00.setBounds(3, 10, 158, 20);
		ButtonTab.add(B00);

		B01.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				B01.setIcon(
						new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				B01.setIcon(new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				B01.setIcon(new javax.swing.ImageIcon(
						MyCopyPastePanel.class.getResource("/MyCopyPastePanel/thumbsup.png")));
			}
		});

		B01.setBorder(new LineBorder(new Color(255, 215, 0), 1, true));
		B01.setText(C01_str);
		B01.setBounds(new Rectangle(4, 22, 170, 20));
		B01.setToolTipText(C01_str);
		B01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String obj_str = B01.getText();
				StringSelection selection = new StringSelection(obj_str);
				clipboard.setContents(selection, null);
			}
		});
		B01.setHorizontalAlignment(SwingConstants.LEFT);
		B01.setHorizontalTextPosition(SwingConstants.LEFT);
		B01.setFont(new Font("メイリオ", Font.PLAIN, 11));
		B01.setAutoscrolls(true);
		B01.setBounds(3, 34, 158, 20);
		ButtonTab.add(B01);

		B02.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				B02.setIcon(
						new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				B02.setIcon(new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				B02.setIcon(new javax.swing.ImageIcon(
						MyCopyPastePanel.class.getResource("/MyCopyPastePanel/thumbsup.png")));
			}
		});

		B02.setBorder(new LineBorder(new Color(255, 215, 0), 1, true));
		B02.setText(C02_str);
		B02.setBounds(new Rectangle(4, 22, 170, 20));
		B02.setToolTipText(C02_str);
		B02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String obj_str = B02.getText();
				StringSelection selection = new StringSelection(obj_str);
				clipboard.setContents(selection, null);
			}
		});
		B02.setHorizontalAlignment(SwingConstants.LEFT);
		B02.setHorizontalTextPosition(SwingConstants.LEFT);
		B02.setFont(new Font("メイリオ", Font.PLAIN, 11));
		B02.setAutoscrolls(true);
		B02.setBounds(3, 58, 158, 20);
		ButtonTab.add(B02);

		B03.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				B03.setIcon(
						new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				B03.setIcon(new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				B03.setIcon(new javax.swing.ImageIcon(
						MyCopyPastePanel.class.getResource("/MyCopyPastePanel/thumbsup.png")));
			}
		});

		B03.setBorder(new LineBorder(new Color(34, 139, 34), 1, true));
		B03.setText(C03_str);
		B03.setBounds(new Rectangle(4, 22, 170, 20));
		B03.setToolTipText(C03_str);
		B03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String obj_str = B03.getText();
				StringSelection selection = new StringSelection(obj_str);
				clipboard.setContents(selection, null);
			}
		});
		B03.setHorizontalAlignment(SwingConstants.LEFT);
		B03.setHorizontalTextPosition(SwingConstants.LEFT);
		B03.setFont(new Font("メイリオ", Font.PLAIN, 11));
		B03.setAutoscrolls(true);
		B03.setBounds(16, 82, 158, 20);
		ButtonTab.add(B03);

		B04.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				B04.setIcon(
						new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				B04.setIcon(new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				B04.setIcon(new javax.swing.ImageIcon(
						MyCopyPastePanel.class.getResource("/MyCopyPastePanel/thumbsup.png")));
			}
		});

		B04.setBorder(new LineBorder(new Color(34, 139, 34), 1, true));
		B04.setText(C04_str);
		B04.setBounds(new Rectangle(4, 22, 170, 20));
		B04.setToolTipText(C04_str);
		B04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String obj_str = B04.getText();
				StringSelection selection = new StringSelection(obj_str);
				clipboard.setContents(selection, null);
			}
		});
		B04.setHorizontalAlignment(SwingConstants.LEFT);
		B04.setHorizontalTextPosition(SwingConstants.LEFT);
		B04.setFont(new Font("メイリオ", Font.PLAIN, 11));
		B04.setAutoscrolls(true);
		B04.setBounds(16, 106, 158, 20);
		ButtonTab.add(B04);

		B05.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				B05.setIcon(
						new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				B05.setIcon(new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				B05.setIcon(new javax.swing.ImageIcon(
						MyCopyPastePanel.class.getResource("/MyCopyPastePanel/thumbsup.png")));
			}
		});

		B05.setBorder(new LineBorder(new Color(34, 139, 34), 1, true));
		B05.setText(C05_str);
		B05.setBounds(new Rectangle(4, 22, 170, 20));
		B05.setToolTipText(C05_str);
		B05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String obj_str = B05.getText();
				StringSelection selection = new StringSelection(obj_str);
				clipboard.setContents(selection, null);
			}
		});
		B05.setHorizontalAlignment(SwingConstants.LEFT);
		B05.setHorizontalTextPosition(SwingConstants.LEFT);
		B05.setFont(new Font("メイリオ", Font.PLAIN, 11));
		B05.setAutoscrolls(true);
		B05.setBounds(16, 130, 158, 20);
		ButtonTab.add(B05);

		B06.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				B06.setIcon(
						new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				B06.setIcon(new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				B06.setIcon(new javax.swing.ImageIcon(
						MyCopyPastePanel.class.getResource("/MyCopyPastePanel/thumbsup.png")));
			}
		});

		B06.setBorder(new LineBorder(new Color(128, 0, 0), 1, true));
		B06.setText(C06_str);
		B06.setBounds(new Rectangle(4, 22, 170, 20));
		B06.setToolTipText(C06_str);
		B06.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String obj_str = B06.getText();
				StringSelection selection = new StringSelection(obj_str);
				clipboard.setContents(selection, null);
			}
		});
		B06.setHorizontalAlignment(SwingConstants.LEFT);
		B06.setHorizontalTextPosition(SwingConstants.LEFT);
		B06.setFont(new Font("メイリオ", Font.PLAIN, 11));
		B06.setAutoscrolls(true);
		B06.setBounds(3, 154, 158, 20);
		ButtonTab.add(B06);

		B07.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				B07.setIcon(
						new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				B07.setIcon(new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				B07.setIcon(new javax.swing.ImageIcon(
						MyCopyPastePanel.class.getResource("/MyCopyPastePanel/thumbsup.png")));
			}
		});

		B07.setBorder(new LineBorder(new Color(128, 0, 0), 1, true));
		B07.setText(C07_str);
		B07.setBounds(new Rectangle(4, 22, 170, 20));
		B07.setToolTipText(C07_str);
		B07.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String obj_str = B07.getText();
				StringSelection selection = new StringSelection(obj_str);
				clipboard.setContents(selection, null);
			}
		});
		B07.setHorizontalAlignment(SwingConstants.LEFT);
		B07.setHorizontalTextPosition(SwingConstants.LEFT);
		B07.setFont(new Font("メイリオ", Font.PLAIN, 11));
		B07.setAutoscrolls(true);
		B07.setBounds(3, 178, 158, 20);
		ButtonTab.add(B07);

		B08.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				B08.setIcon(
						new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				B08.setIcon(new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				B08.setIcon(new javax.swing.ImageIcon(
						MyCopyPastePanel.class.getResource("/MyCopyPastePanel/thumbsup.png")));
			}
		});

		B08.setBorder(new LineBorder(new Color(128, 0, 0), 1, true));
		B08.setText(C08_str);
		B08.setBounds(new Rectangle(4, 22, 170, 20));
		B08.setToolTipText(C08_str);
		B08.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String obj_str = B08.getText();
				StringSelection selection = new StringSelection(obj_str);
				clipboard.setContents(selection, null);
			}
		});
		B08.setHorizontalAlignment(SwingConstants.LEFT);
		B08.setHorizontalTextPosition(SwingConstants.LEFT);
		B08.setFont(new Font("メイリオ", Font.PLAIN, 11));
		B08.setAutoscrolls(true);
		B08.setBounds(3, 202, 158, 21);
		ButtonTab.add(B08);

		B09.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				B09.setIcon(
						new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				B09.setIcon(new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				B09.setIcon(new javax.swing.ImageIcon(
						MyCopyPastePanel.class.getResource("/MyCopyPastePanel/thumbsup.png")));
			}
		});

		B09.setBorder(new LineBorder(new Color(144, 238, 144), 1, true));
		B09.setText(C09_str);
		B09.setBounds(new Rectangle(4, 22, 170, 20));
		B09.setToolTipText(C09_str);
		B09.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String obj_str = B09.getText();
				StringSelection selection = new StringSelection(obj_str);
				clipboard.setContents(selection, null);
			}
		});
		B09.setHorizontalAlignment(SwingConstants.LEFT);
		B09.setHorizontalTextPosition(SwingConstants.LEFT);
		B09.setFont(new Font("メイリオ", Font.PLAIN, 11));
		B09.setAutoscrolls(true);
		B09.setBounds(16, 226, 158, 21);
		ButtonTab.add(B09);

		B10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				B10.setIcon(
						new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				B10.setIcon(new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				B10.setIcon(new javax.swing.ImageIcon(
						MyCopyPastePanel.class.getResource("/MyCopyPastePanel/thumbsup.png")));
			}
		});

		B10.setBorder(new LineBorder(new Color(144, 238, 144), 1, true));
		B10.setText(C10_str);
		B10.setBounds(new Rectangle(4, 22, 170, 20));
		B10.setToolTipText(C10_str);
		B10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String obj_str = B10.getText();
				StringSelection selection = new StringSelection(obj_str);
				clipboard.setContents(selection, null);
			}
		});
		B10.setHorizontalAlignment(SwingConstants.LEFT);
		B10.setHorizontalTextPosition(SwingConstants.LEFT);
		B10.setFont(new Font("メイリオ", Font.PLAIN, 11));
		B10.setAutoscrolls(true);
		B10.setBounds(16, 250, 158, 21);
		ButtonTab.add(B10);

		B11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				B11.setIcon(
						new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				B11.setIcon(new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				B11.setIcon(new javax.swing.ImageIcon(
						MyCopyPastePanel.class.getResource("/MyCopyPastePanel/thumbsup.png")));
			}
		});

		B11.setBorder(new LineBorder(new Color(144, 238, 144), 1, true));
		B11.setText(C11_str);
		B11.setBounds(new Rectangle(4, 22, 170, 20));
		B11.setToolTipText(C11_str);
		B11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String obj_str = B11.getText();
				StringSelection selection = new StringSelection(obj_str);
				clipboard.setContents(selection, null);
			}
		});
		B11.setHorizontalAlignment(SwingConstants.LEFT);
		B11.setHorizontalTextPosition(SwingConstants.LEFT);
		B11.setFont(new Font("メイリオ", Font.PLAIN, 11));
		B11.setAutoscrolls(true);
		B11.setBounds(16, 274, 158, 21);
		ButtonTab.add(B11);

		B12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				B12.setIcon(
						new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				B12.setIcon(new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				B12.setIcon(new javax.swing.ImageIcon(
						MyCopyPastePanel.class.getResource("/MyCopyPastePanel/thumbsup.png")));
			}
		});

		B12.setBorder(new LineBorder(new Color(220, 20, 60), 1, true));
		B12.setText(C12_str);
		B12.setBounds(new Rectangle(4, 22, 170, 20));
		B12.setToolTipText(C12_str);
		B12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String obj_str = B12.getText();
				StringSelection selection = new StringSelection(obj_str);
				clipboard.setContents(selection, null);
			}
		});
		B12.setHorizontalAlignment(SwingConstants.LEFT);
		B12.setHorizontalTextPosition(SwingConstants.LEFT);
		B12.setFont(new Font("メイリオ", Font.PLAIN, 11));
		B12.setAutoscrolls(true);
		B12.setBounds(3, 298, 158, 21);
		ButtonTab.add(B12);

		B13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				B13.setIcon(
						new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				B13.setIcon(new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				B13.setIcon(new javax.swing.ImageIcon(
						MyCopyPastePanel.class.getResource("/MyCopyPastePanel/thumbsup.png")));
			}
		});

		B13.setBorder(new LineBorder(new Color(220, 20, 60), 1, true));
		B13.setText(C13_str);
		B13.setBounds(new Rectangle(4, 22, 170, 20));
		B13.setToolTipText(C13_str);
		B13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String obj_str = B13.getText();
				StringSelection selection = new StringSelection(obj_str);
				clipboard.setContents(selection, null);
			}
		});
		B13.setHorizontalAlignment(SwingConstants.LEFT);
		B13.setHorizontalTextPosition(SwingConstants.LEFT);
		B13.setFont(new Font("メイリオ", Font.PLAIN, 11));
		B13.setAutoscrolls(true);
		B13.setBounds(3, 322, 158, 21);
		ButtonTab.add(B13);

		B14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				B14.setIcon(
						new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				B14.setIcon(new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				B14.setIcon(new javax.swing.ImageIcon(
						MyCopyPastePanel.class.getResource("/MyCopyPastePanel/thumbsup.png")));
			}
		});

		B14.setBorder(new LineBorder(new Color(220, 20, 60), 1, true));
		B14.setText(C14_str);
		B14.setBounds(new Rectangle(4, 22, 170, 20));
		B14.setToolTipText(C14_str);
		B14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String obj_str = B14.getText();
				StringSelection selection = new StringSelection(obj_str);
				clipboard.setContents(selection, null);
			}
		});
		B14.setHorizontalAlignment(SwingConstants.LEFT);
		B14.setHorizontalTextPosition(SwingConstants.LEFT);
		B14.setFont(new Font("メイリオ", Font.PLAIN, 11));
		B14.setAutoscrolls(true);
		B14.setBounds(3, 346, 158, 21);
		ButtonTab.add(B14);

		B15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				B15.setIcon(
						new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				B15.setIcon(new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				B15.setIcon(new javax.swing.ImageIcon(
						MyCopyPastePanel.class.getResource("/MyCopyPastePanel/thumbsup.png")));
			}
		});

		B15.setBorder(new LineBorder(new Color(176, 224, 230), 1, true));
		B15.setText(C15_str);
		B15.setBounds(new Rectangle(4, 22, 170, 20));
		B15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String obj_str = B15.getText();
				StringSelection selection = new StringSelection(obj_str);
				clipboard.setContents(selection, null);
			}
		});
		B15.setToolTipText(C15_str);
		B15.setHorizontalTextPosition(SwingConstants.LEFT);
		B15.setHorizontalAlignment(SwingConstants.LEFT);
		B15.setFont(new Font("メイリオ", Font.PLAIN, 11));
		B15.setBounds(16, 370, 158, 21);
		ButtonTab.add(B15);

		B16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				B16.setIcon(
						new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				B16.setIcon(new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				B16.setIcon(new javax.swing.ImageIcon(
						MyCopyPastePanel.class.getResource("/MyCopyPastePanel/thumbsup.png")));
			}
		});

		B16.setBorder(new LineBorder(new Color(176, 224, 230), 1, true));
		B16.setText(C16_str);
		B16.setBounds(new Rectangle(4, 22, 170, 20));
		B16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String obj_str = B16.getText();
				StringSelection selection = new StringSelection(obj_str);
				clipboard.setContents(selection, null);
			}
		});
		B16.setToolTipText(C16_str);
		B16.setHorizontalTextPosition(SwingConstants.LEFT);
		B16.setHorizontalAlignment(SwingConstants.LEFT);
		B16.setFont(new Font("メイリオ", Font.PLAIN, 11));
		B16.setBounds(16, 394, 158, 21);
		ButtonTab.add(B16);

		B17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				B17.setIcon(
						new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				B17.setIcon(new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				B17.setIcon(new javax.swing.ImageIcon(
						MyCopyPastePanel.class.getResource("/MyCopyPastePanel/thumbsup.png")));
			}
		});

		B17.setBorder(new LineBorder(new Color(176, 224, 230), 1, true));
		B17.setText(C17_str);
		B17.setBounds(new Rectangle(4, 22, 170, 20));
		B17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String obj_str = B17.getText();
				StringSelection selection = new StringSelection(obj_str);
				clipboard.setContents(selection, null);
			}
		});
		B17.setToolTipText(C17_str);
		B17.setHorizontalTextPosition(SwingConstants.LEFT);
		B17.setHorizontalAlignment(SwingConstants.LEFT);
		B17.setFont(new Font("メイリオ", Font.PLAIN, 11));
		B17.setBounds(16, 418, 158, 21);
		ButtonTab.add(B17);

		B18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				B18.setIcon(
						new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				B18.setIcon(new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				B18.setIcon(new javax.swing.ImageIcon(
						MyCopyPastePanel.class.getResource("/MyCopyPastePanel/thumbsup.png")));
			}
		});

		B18.setBorder(new LineBorder(new Color(238, 130, 238), 1, true));
		B18.setText(C18_str);
		B18.setBounds(new Rectangle(4, 22, 170, 20));
		B18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String obj_str = B18.getText();
				StringSelection selection = new StringSelection(obj_str);
				clipboard.setContents(selection, null);
			}
		});
		B18.setToolTipText(C18_str);
		B18.setHorizontalTextPosition(SwingConstants.LEFT);
		B18.setHorizontalAlignment(SwingConstants.LEFT);
		B18.setFont(new Font("メイリオ", Font.PLAIN, 11));
		B18.setBounds(3, 442, 158, 21);
		ButtonTab.add(B18);

		B19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				B19.setIcon(
						new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				B19.setIcon(new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				B19.setIcon(new javax.swing.ImageIcon(
						MyCopyPastePanel.class.getResource("/MyCopyPastePanel/thumbsup.png")));
			}
		});

		B19.setBorder(new LineBorder(new Color(238, 130, 238), 1, true));
		B19.setText(C19_str);
		B19.setBounds(new Rectangle(4, 22, 170, 20));
		B19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String obj_str = B19.getText();
				StringSelection selection = new StringSelection(obj_str);
				clipboard.setContents(selection, null);
			}
		});
		B19.setToolTipText(C19_str);
		B19.setHorizontalTextPosition(SwingConstants.LEFT);
		B19.setHorizontalAlignment(SwingConstants.LEFT);
		B19.setFont(new Font("メイリオ", Font.PLAIN, 11));
		B19.setBounds(3, 466, 158, 21);
		ButtonTab.add(B19);

		B20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				B20.setIcon(
						new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				B20.setIcon(new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				B20.setIcon(new javax.swing.ImageIcon(
						MyCopyPastePanel.class.getResource("/MyCopyPastePanel/thumbsup.png")));
			}
		});

		B20.setBorder(new LineBorder(new Color(238, 130, 238), 1, true));
		B20.setText(C20_str);
		B20.setBounds(new Rectangle(4, 22, 170, 20));
		B20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String obj_str = B20.getText();
				StringSelection selection = new StringSelection(obj_str);
				clipboard.setContents(selection, null);
			}
		});
		B20.setToolTipText(C20_str);
		B20.setHorizontalTextPosition(SwingConstants.LEFT);
		B20.setHorizontalAlignment(SwingConstants.LEFT);
		B20.setFont(new Font("メイリオ", Font.PLAIN, 11));
		B20.setBounds(3, 490, 158, 21);
		ButtonTab.add(B20);

		B21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				B21.setIcon(
						new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				B21.setIcon(new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				B21.setIcon(new javax.swing.ImageIcon(
						MyCopyPastePanel.class.getResource("/MyCopyPastePanel/thumbsup.png")));
			}
		});

		B21.setBorder(new LineBorder(new Color(255, 215, 0), 1, true));
		B21.setText(C21_str);
		B21.setBounds(new Rectangle(4, 22, 170, 20));
		B21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String obj_str = B21.getText();
				StringSelection selection = new StringSelection(obj_str);
				clipboard.setContents(selection, null);
			}
		});
		B21.setToolTipText(C21_str);
		B21.setHorizontalTextPosition(SwingConstants.LEFT);
		B21.setHorizontalAlignment(SwingConstants.LEFT);
		B21.setFont(new Font("メイリオ", Font.PLAIN, 11));
		B21.setBounds(184, 10, 170, 20);
		ButtonTab.add(B21);

		B22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				B22.setIcon(
						new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				B22.setIcon(new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				B22.setIcon(new javax.swing.ImageIcon(
						MyCopyPastePanel.class.getResource("/MyCopyPastePanel/thumbsup.png")));
			}
		});

		B22.setBorder(new LineBorder(new Color(255, 215, 0), 1, true));
		B22.setText(C22_str);
		B22.setBounds(new Rectangle(4, 22, 170, 20));
		B22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String obj_str = B22.getText();
				StringSelection selection = new StringSelection(obj_str);
				clipboard.setContents(selection, null);
			}
		});
		B22.setToolTipText(C22_str);
		B22.setHorizontalTextPosition(SwingConstants.LEFT);
		B22.setHorizontalAlignment(SwingConstants.LEFT);
		B22.setFont(new Font("メイリオ", Font.PLAIN, 11));
		B22.setBounds(184, 34, 170, 20);
		ButtonTab.add(B22);

		B23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				B23.setIcon(
						new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				B23.setIcon(new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				B23.setIcon(new javax.swing.ImageIcon(
						MyCopyPastePanel.class.getResource("/MyCopyPastePanel/thumbsup.png")));
			}
		});

		B23.setBorder(new LineBorder(new Color(255, 215, 0), 1, true));
		B23.setText(C23_str);
		B23.setBounds(new Rectangle(4, 22, 170, 20));
		B23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String obj_str = B23.getText();
				StringSelection selection = new StringSelection(obj_str);
				clipboard.setContents(selection, null);
			}
		});
		B23.setToolTipText(C23_str);
		B23.setHorizontalTextPosition(SwingConstants.LEFT);
		B23.setHorizontalAlignment(SwingConstants.LEFT);
		B23.setFont(new Font("メイリオ", Font.PLAIN, 11));
		B23.setBounds(184, 58, 170, 20);
		ButtonTab.add(B23);

		B24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				B24.setIcon(
						new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				B24.setIcon(new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				B24.setIcon(new javax.swing.ImageIcon(
						MyCopyPastePanel.class.getResource("/MyCopyPastePanel/thumbsup.png")));
			}
		});

		B24.setBorder(new LineBorder(new Color(34, 139, 34), 1, true));
		B24.setText(C24_str);
		B24.setBounds(new Rectangle(4, 22, 170, 20));
		B24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String obj_str = B24.getText();
				StringSelection selection = new StringSelection(obj_str);
				clipboard.setContents(selection, null);
			}
		});
		B24.setToolTipText(C24_str);
		B24.setHorizontalTextPosition(SwingConstants.LEFT);
		B24.setHorizontalAlignment(SwingConstants.LEFT);
		B24.setFont(new Font("メイリオ", Font.PLAIN, 11));
		B24.setBounds(196, 82, 158, 20);
		ButtonTab.add(B24);

		B25.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				B25.setIcon(
						new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				B25.setIcon(new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				B25.setIcon(new javax.swing.ImageIcon(
						MyCopyPastePanel.class.getResource("/MyCopyPastePanel/thumbsup.png")));
			}
		});

		B25.setBorder(new LineBorder(new Color(34, 139, 34), 1, true));
		B25.setText(C25_str);
		B25.setBounds(new Rectangle(4, 22, 170, 20));
		B25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String obj_str = B25.getText();
				StringSelection selection = new StringSelection(obj_str);
				clipboard.setContents(selection, null);
			}
		});
		B25.setToolTipText(C25_str);
		B25.setHorizontalTextPosition(SwingConstants.LEFT);
		B25.setHorizontalAlignment(SwingConstants.LEFT);
		B25.setFont(new Font("メイリオ", Font.PLAIN, 11));
		B25.setBounds(196, 106, 158, 20);
		ButtonTab.add(B25);

		B26.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				B26.setIcon(
						new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				B26.setIcon(new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				B26.setIcon(new javax.swing.ImageIcon(
						MyCopyPastePanel.class.getResource("/MyCopyPastePanel/thumbsup.png")));
			}
		});

		B26.setBorder(new LineBorder(new Color(34, 139, 34), 1, true));
		B26.setText(C26_str);
		B26.setBounds(new Rectangle(4, 22, 170, 20));
		B26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String obj_str = B26.getText();
				StringSelection selection = new StringSelection(obj_str);
				clipboard.setContents(selection, null);
			}
		});
		B26.setToolTipText(C26_str);
		B26.setHorizontalTextPosition(SwingConstants.LEFT);
		B26.setHorizontalAlignment(SwingConstants.LEFT);
		B26.setFont(new Font("メイリオ", Font.PLAIN, 11));
		B26.setBounds(196, 130, 158, 20);
		ButtonTab.add(B26);

		B27.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				B27.setIcon(
						new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				B27.setIcon(new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				B27.setIcon(new javax.swing.ImageIcon(
						MyCopyPastePanel.class.getResource("/MyCopyPastePanel/thumbsup.png")));
			}
		});

		B27.setBorder(new LineBorder(new Color(128, 0, 0), 1, true));
		B27.setText(C27_str);
		B27.setBounds(new Rectangle(4, 22, 170, 20));
		B27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String obj_str = B27.getText();
				StringSelection selection = new StringSelection(obj_str);
				clipboard.setContents(selection, null);
			}
		});
		B27.setToolTipText(C27_str);
		B27.setHorizontalTextPosition(SwingConstants.LEFT);
		B27.setHorizontalAlignment(SwingConstants.LEFT);
		B27.setFont(new Font("メイリオ", Font.PLAIN, 11));
		B27.setBounds(184, 154, 170, 20);
		ButtonTab.add(B27);

		B28.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				B28.setIcon(
						new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				B28.setIcon(new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				B28.setIcon(new javax.swing.ImageIcon(
						MyCopyPastePanel.class.getResource("/MyCopyPastePanel/thumbsup.png")));
			}
		});

		B28.setBorder(new LineBorder(new Color(128, 0, 0), 1, true));
		B28.setText(C28_str);
		B28.setBounds(new Rectangle(4, 22, 170, 20));
		B28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String obj_str = B28.getText();
				StringSelection selection = new StringSelection(obj_str);
				clipboard.setContents(selection, null);
			}
		});
		B28.setToolTipText(C28_str);
		B28.setHorizontalTextPosition(SwingConstants.LEFT);
		B28.setHorizontalAlignment(SwingConstants.LEFT);
		B28.setFont(new Font("メイリオ", Font.PLAIN, 11));
		B28.setBounds(184, 178, 170, 20);
		ButtonTab.add(B28);

		B29.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				B29.setIcon(
						new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				B29.setIcon(new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				B29.setIcon(new javax.swing.ImageIcon(
						MyCopyPastePanel.class.getResource("/MyCopyPastePanel/thumbsup.png")));
			}
		});

		B29.setBorder(new LineBorder(new Color(128, 0, 0), 1, true));
		B29.setText(C29_str);
		B29.setBounds(new Rectangle(4, 22, 170, 20));
		B29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String obj_str = B29.getText();
				StringSelection selection = new StringSelection(obj_str);
				clipboard.setContents(selection, null);
			}
		});
		B29.setToolTipText(C29_str);
		B29.setHorizontalTextPosition(SwingConstants.LEFT);
		B29.setHorizontalAlignment(SwingConstants.LEFT);
		B29.setFont(new Font("メイリオ", Font.PLAIN, 11));
		B29.setBounds(184, 202, 170, 20);
		ButtonTab.add(B29);

		B30.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				B30.setIcon(
						new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				B30.setIcon(new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				B30.setIcon(new javax.swing.ImageIcon(
						MyCopyPastePanel.class.getResource("/MyCopyPastePanel/thumbsup.png")));
			}
		});

		B30.setBorder(new LineBorder(new Color(144, 238, 144), 1, true));
		B30.setText(C30_str);
		B30.setToolTipText(C30_str);
		B30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String obj_str = B30.getText();
				StringSelection selection = new StringSelection(obj_str);
				clipboard.setContents(selection, null);
			}
		});
		B30.setHorizontalTextPosition(SwingConstants.LEFT);
		B30.setHorizontalAlignment(SwingConstants.LEFT);
		B30.setFont(new Font("メイリオ", Font.PLAIN, 11));
		B30.setBounds(new Rectangle(4, 22, 170, 20));
		B30.setBounds(196, 226, 158, 20);
		ButtonTab.add(B30);

		B31.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				B31.setIcon(
						new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				B31.setIcon(new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				B31.setIcon(new javax.swing.ImageIcon(
						MyCopyPastePanel.class.getResource("/MyCopyPastePanel/thumbsup.png")));
			}
		});

		B31.setBorder(new LineBorder(new Color(144, 238, 144), 1, true));
		B31.setText(C31_str);
		B31.setToolTipText(C31_str);
		B31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String obj_str = B31.getText();
				StringSelection selection = new StringSelection(obj_str);
				clipboard.setContents(selection, null);
			}
		});
		B31.setHorizontalTextPosition(SwingConstants.LEFT);
		B31.setHorizontalAlignment(SwingConstants.LEFT);
		B31.setFont(new Font("メイリオ", Font.PLAIN, 11));
		B31.setBounds(new Rectangle(4, 22, 170, 20));
		B31.setBounds(196, 250, 158, 20);
		ButtonTab.add(B31);

		B32.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				B32.setIcon(
						new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				B32.setIcon(new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				B32.setIcon(new javax.swing.ImageIcon(
						MyCopyPastePanel.class.getResource("/MyCopyPastePanel/thumbsup.png")));
			}
		});

		B32.setBorder(new LineBorder(new Color(144, 238, 144), 1, true));
		B32.setText(C32_str);
		B32.setToolTipText(C32_str);
		B32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String obj_str = B32.getText();
				StringSelection selection = new StringSelection(obj_str);
				clipboard.setContents(selection, null);
			}
		});
		B32.setHorizontalTextPosition(SwingConstants.LEFT);
		B32.setHorizontalAlignment(SwingConstants.LEFT);
		B32.setFont(new Font("メイリオ", Font.PLAIN, 11));
		B32.setBounds(new Rectangle(4, 22, 170, 20));
		B32.setBounds(196, 274, 158, 20);
		ButtonTab.add(B32);

		B33.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				B33.setIcon(
						new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				B33.setIcon(new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				B33.setIcon(new javax.swing.ImageIcon(
						MyCopyPastePanel.class.getResource("/MyCopyPastePanel/thumbsup.png")));
			}
		});

		B33.setBorder(new LineBorder(new Color(220, 20, 60), 1, true));
		B33.setText(C33_str);
		B33.setToolTipText(C33_str);
		B33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String obj_str = B33.getText();
				StringSelection selection = new StringSelection(obj_str);
				clipboard.setContents(selection, null);
			}
		});
		B33.setHorizontalTextPosition(SwingConstants.LEFT);
		B33.setHorizontalAlignment(SwingConstants.LEFT);
		B33.setFont(new Font("メイリオ", Font.PLAIN, 11));
		B33.setBounds(new Rectangle(4, 22, 170, 20));
		B33.setBounds(184, 298, 170, 20);
		ButtonTab.add(B33);

		B34.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				B34.setIcon(
						new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				B34.setIcon(new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				B34.setIcon(new javax.swing.ImageIcon(
						MyCopyPastePanel.class.getResource("/MyCopyPastePanel/thumbsup.png")));
			}
		});

		B34.setBorder(new LineBorder(new Color(220, 20, 60), 1, true));
		B34.setText(C34_str);
		B34.setToolTipText(C34_str);
		B34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String obj_str = B34.getText();
				StringSelection selection = new StringSelection(obj_str);
				clipboard.setContents(selection, null);
			}
		});
		B34.setHorizontalTextPosition(SwingConstants.LEFT);
		B34.setHorizontalAlignment(SwingConstants.LEFT);
		B34.setFont(new Font("メイリオ", Font.PLAIN, 11));
		B34.setBounds(new Rectangle(4, 22, 170, 20));
		B34.setBounds(184, 322, 170, 20);
		ButtonTab.add(B34);

		B35.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				B35.setIcon(
						new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				B35.setIcon(new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				B35.setIcon(new javax.swing.ImageIcon(
						MyCopyPastePanel.class.getResource("/MyCopyPastePanel/thumbsup.png")));
			}
		});

		B35.setBorder(new LineBorder(new Color(220, 20, 60), 1, true));
		B35.setText(C35_str);
		B35.setToolTipText(C35_str);
		B35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String obj_str = B35.getText();
				StringSelection selection = new StringSelection(obj_str);
				clipboard.setContents(selection, null);
			}
		});
		B35.setHorizontalTextPosition(SwingConstants.LEFT);
		B35.setHorizontalAlignment(SwingConstants.LEFT);
		B35.setFont(new Font("メイリオ", Font.PLAIN, 11));
		B35.setBounds(new Rectangle(4, 22, 170, 20));
		B35.setBounds(184, 346, 170, 20);
		ButtonTab.add(B35);

		B36.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				B36.setIcon(
						new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				B36.setIcon(new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				B36.setIcon(new javax.swing.ImageIcon(
						MyCopyPastePanel.class.getResource("/MyCopyPastePanel/thumbsup.png")));
			}
		});

		B36.setBorder(new LineBorder(new Color(176, 224, 230), 1, true));
		B36.setText(C36_str);
		B36.setToolTipText(C36_str);
		B36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String obj_str = B36.getText();
				StringSelection selection = new StringSelection(obj_str);
				clipboard.setContents(selection, null);
			}
		});
		B36.setHorizontalTextPosition(SwingConstants.LEFT);
		B36.setHorizontalAlignment(SwingConstants.LEFT);
		B36.setFont(new Font("メイリオ", Font.PLAIN, 11));
		B36.setBounds(new Rectangle(4, 22, 170, 20));
		B36.setBounds(198, 370, 158, 20);
		ButtonTab.add(B36);

		B37.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				B37.setIcon(
						new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				B37.setIcon(new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				B37.setIcon(new javax.swing.ImageIcon(
						MyCopyPastePanel.class.getResource("/MyCopyPastePanel/thumbsup.png")));
			}
		});

		B37.setBorder(new LineBorder(new Color(176, 224, 230), 1, true));
		B37.setText(C37_str);
		B37.setToolTipText(C37_str);
		B37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String obj_str = B37.getText();
				StringSelection selection = new StringSelection(obj_str);
				clipboard.setContents(selection, null);
			}
		});
		B37.setHorizontalTextPosition(SwingConstants.LEFT);
		B37.setHorizontalAlignment(SwingConstants.LEFT);
		B37.setFont(new Font("メイリオ", Font.PLAIN, 11));
		B37.setBounds(new Rectangle(4, 22, 170, 20));
		B37.setBounds(198, 394, 158, 20);
		ButtonTab.add(B37);

		B38.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				B38.setIcon(
						new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				B38.setIcon(new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				B38.setIcon(new javax.swing.ImageIcon(
						MyCopyPastePanel.class.getResource("/MyCopyPastePanel/thumbsup.png")));
			}
		});

		B38.setBorder(new LineBorder(new Color(176, 224, 230), 1, true));
		B38.setText(C38_str);
		B38.setToolTipText(C38_str);
		B38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String obj_str = B38.getText();
				StringSelection selection = new StringSelection(obj_str);
				clipboard.setContents(selection, null);
			}
		});
		B38.setHorizontalTextPosition(SwingConstants.LEFT);
		B38.setHorizontalAlignment(SwingConstants.LEFT);
		B38.setFont(new Font("メイリオ", Font.PLAIN, 11));
		B38.setBounds(new Rectangle(4, 22, 170, 20));
		B38.setBounds(198, 418, 158, 20);
		ButtonTab.add(B38);

		B39.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				B39.setIcon(
						new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				B39.setIcon(new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				B39.setIcon(new javax.swing.ImageIcon(
						MyCopyPastePanel.class.getResource("/MyCopyPastePanel/thumbsup.png")));
			}
		});

		B39.setBorder(new LineBorder(new Color(238, 130, 238), 1, true));
		B39.setText(C39_str);
		B39.setToolTipText(C39_str);
		B39.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String obj_str = B39.getText();
				StringSelection selection = new StringSelection(obj_str);
				clipboard.setContents(selection, null);
			}
		});
		B39.setHorizontalTextPosition(SwingConstants.LEFT);
		B39.setHorizontalAlignment(SwingConstants.LEFT);
		B39.setFont(new Font("メイリオ", Font.PLAIN, 11));
		B39.setBounds(new Rectangle(4, 22, 170, 20));
		B39.setBounds(186, 442, 170, 20);
		ButtonTab.add(B39);
		B40.setBorder(new LineBorder(new Color(238, 130, 238), 1, true));

		B40.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				B40.setIcon(
						new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				B40.setIcon(new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				B40.setIcon(new javax.swing.ImageIcon(
						MyCopyPastePanel.class.getResource("/MyCopyPastePanel/thumbsup.png")));
			}
		});

		B40.setText(C40_str);
		B40.setToolTipText(C40_str);
		B40.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String obj_str = B40.getText();
				StringSelection selection = new StringSelection(obj_str);
				clipboard.setContents(selection, null);
			}
		});
		B40.setHorizontalTextPosition(SwingConstants.LEFT);
		B40.setHorizontalAlignment(SwingConstants.LEFT);
		B40.setFont(new Font("メイリオ", Font.PLAIN, 11));
		B40.setBounds(new Rectangle(4, 22, 170, 20));
		B40.setBounds(186, 466, 170, 20);
		ButtonTab.add(B40);

		B41.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				B41.setIcon(
						new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("/MyCopyPastePanel/finger.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				B41.setIcon(new javax.swing.ImageIcon(MyCopyPastePanel.class.getResource("")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				B41.setIcon(new javax.swing.ImageIcon(
						MyCopyPastePanel.class.getResource("/MyCopyPastePanel/thumbsup.png")));
			}
		});

		B41.setBorder(new LineBorder(new Color(238, 130, 238), 1, true));
		B41.setText(C41_str);
		B41.setToolTipText(C41_str);
		B41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String obj_str = B41.getText();
				StringSelection selection = new StringSelection(obj_str);
				clipboard.setContents(selection, null);
			}
		});
		B41.setHorizontalTextPosition(SwingConstants.LEFT);
		B41.setHorizontalAlignment(SwingConstants.LEFT);
		B41.setFont(new Font("メイリオ", Font.PLAIN, 11));
		B41.setBounds(new Rectangle(4, 22, 170, 20));
		B41.setBounds(186, 490, 170, 20);
		ButtonTab.add(B41);

		JPanel ConfigTab = new JPanel();
		ConfigTab.setFont(new Font("メイリオ", Font.PLAIN, 11));
		ImageIcon tabicon2 = new javax.swing.ImageIcon(
				MyCopyPastePanel.class.getResource("/MyCopyPastePanel/config.png"));
		tabbedPane.addTab("MySettings", tabicon2, ConfigTab, null);
		tabbedPane.setBackgroundAt(1, new Color(255, 245, 238));
		tabbedPane.setEnabledAt(1, true);
		ConfigTab.setLayout(null);

		C00 = new JTextField();
		C00.setHorizontalAlignment(SwingConstants.LEFT);
		C00.setBorder(new LineBorder(new Color(255, 215, 0), 1, true));
		C00.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					C00.setText(null);
				}
			}
		});
		C00.setToolTipText("double click to delete text");
		C00.setText(C00_str);
		C00.setFont(new Font("メイリオ", Font.PLAIN, 11));
		C00.setBounds(3, 10, 142, 20);
		ConfigTab.add(C00);
		C00.setColumns(10);

		C01 = new JTextField();
		C01.setHorizontalAlignment(SwingConstants.LEFT);
		C01.setBorder(new LineBorder(new Color(255, 215, 0), 1, true));
		C01.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					C01.setText(null);
				}
			}
		});
		C01.setToolTipText("double click to delete text");
		C01.setText(C01_str);
		C01.setFont(new Font("メイリオ", Font.PLAIN, 11));
		C01.setBounds(3, 34, 142, 20);
		ConfigTab.add(C01);
		C01.setColumns(10);

		C02 = new JTextField();
		C02.setHorizontalAlignment(SwingConstants.LEFT);
		C02.setBorder(new LineBorder(new Color(255, 215, 0), 1, true));
		C02.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					C02.setText(null);
				}
			}
		});
		C02.setToolTipText("double click to delete text");
		C02.setText(C02_str);
		C02.setFont(new Font("メイリオ", Font.PLAIN, 11));
		C02.setBounds(3, 58, 142, 20);
		ConfigTab.add(C02);
		C02.setColumns(10);

		C03 = new JTextField();
		C03.setHorizontalAlignment(SwingConstants.LEFT);
		C03.setBorder(new LineBorder(new Color(34, 139, 34), 1, true));
		C03.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					C03.setText(null);
				}
			}
		});
		C03.setToolTipText("double click to delete text");
		C03.setText(C03_str);
		C03.setFont(new Font("メイリオ", Font.PLAIN, 11));
		C03.setBounds(17, 82, 128, 20);
		ConfigTab.add(C03);
		C03.setColumns(10);

		C04 = new JTextField();
		C04.setHorizontalAlignment(SwingConstants.LEFT);
		C04.setBorder(new LineBorder(new Color(34, 139, 34), 1, true));
		C04.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					C04.setText(null);
				}
			}
		});
		C04.setToolTipText("double click to delete text");
		C04.setText(C04_str);
		C04.setFont(new Font("メイリオ", Font.PLAIN, 11));
		C04.setBounds(17, 106, 128, 20);
		ConfigTab.add(C04);
		C04.setColumns(10);

		C05 = new JTextField();
		C05.setHorizontalAlignment(SwingConstants.LEFT);
		C05.setBorder(new LineBorder(new Color(34, 139, 34), 1, true));
		C05.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					C05.setText(null);
				}
			}
		});
		C05.setToolTipText("double click to delete text");
		C05.setText(C05_str);
		C05.setFont(new Font("メイリオ", Font.PLAIN, 11));
		C05.setBounds(17, 130, 128, 20);
		ConfigTab.add(C05);
		C05.setColumns(10);

		C06 = new JTextField();
		C06.setHorizontalAlignment(SwingConstants.LEFT);
		C06.setBorder(new LineBorder(new Color(128, 0, 0), 1, true));
		C06.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					C06.setText(null);
				}
			}
		});
		C06.setToolTipText("double click to delete text");
		C06.setText(C06_str);
		C06.setFont(new Font("メイリオ", Font.PLAIN, 11));
		C06.setBounds(3, 154, 142, 20);
		ConfigTab.add(C06);
		C06.setColumns(10);

		C07 = new JTextField();
		C07.setHorizontalAlignment(SwingConstants.LEFT);
		C07.setBorder(new LineBorder(new Color(128, 0, 0), 1, true));
		C07.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					C07.setText(null);
				}
			}
		});
		C07.setToolTipText("double click to delete text");
		C07.setText(C07_str);
		C07.setFont(new Font("メイリオ", Font.PLAIN, 11));
		C07.setBounds(3, 178, 142, 20);
		ConfigTab.add(C07);
		C07.setColumns(10);

		C08 = new JTextField();
		C08.setHorizontalAlignment(SwingConstants.LEFT);
		C08.setBorder(new LineBorder(new Color(128, 0, 0), 1, true));
		C08.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					C08.setText(null);
				}
			}
		});
		C08.setToolTipText("double click to delete text");
		C08.setText(C08_str);
		C08.setFont(new Font("メイリオ", Font.PLAIN, 11));
		C08.setBounds(3, 202, 142, 20);
		ConfigTab.add(C08);
		C08.setColumns(10);

		C09 = new JTextField();
		C09.setHorizontalAlignment(SwingConstants.LEFT);
		C09.setBorder(new LineBorder(new Color(144, 238, 144), 1, true));
		C09.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					C09.setText(null);
				}
			}
		});
		C09.setToolTipText("double click to delete text");
		C09.setText(C09_str);
		C09.setFont(new Font("メイリオ", Font.PLAIN, 11));
		C09.setBounds(17, 226, 128, 20);
		ConfigTab.add(C09);
		C09.setColumns(10);

		C10 = new JTextField();
		C10.setHorizontalAlignment(SwingConstants.LEFT);
		C10.setBorder(new LineBorder(new Color(144, 238, 144), 1, true));
		C10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					C10.setText(null);
				}
			}
		});
		C10.setToolTipText("double click to delete text");
		C10.setText(C10_str);
		C10.setFont(new Font("メイリオ", Font.PLAIN, 11));
		C10.setBounds(17, 250, 128, 20);
		ConfigTab.add(C10);
		C10.setColumns(10);

		C11 = new JTextField();
		C11.setHorizontalAlignment(SwingConstants.LEFT);
		C11.setBorder(new LineBorder(new Color(144, 238, 144), 1, true));
		C11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					C11.setText(null);
				}
			}
		});
		C11.setToolTipText("double click to delete text");
		C11.setText(C11_str);
		C11.setFont(new Font("メイリオ", Font.PLAIN, 11));
		C11.setBounds(17, 274, 128, 20);
		ConfigTab.add(C11);
		C11.setColumns(10);

		C12 = new JTextField();
		C12.setHorizontalAlignment(SwingConstants.LEFT);
		C12.setBorder(new LineBorder(new Color(220, 20, 60)));
		C12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					C12.setText(null);
				}
			}
		});
		C12.setToolTipText("double click to delete text");
		C12.setText(C12_str);
		C12.setFont(new Font("メイリオ", Font.PLAIN, 11));
		C12.setBounds(3, 298, 142, 20);
		ConfigTab.add(C12);
		C12.setColumns(10);

		C13 = new JTextField();
		C13.setHorizontalAlignment(SwingConstants.LEFT);
		C13.setBorder(new LineBorder(new Color(220, 20, 60)));
		C13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					C13.setText(null);
				}
			}
		});
		C13.setToolTipText("double click to delete text");
		C13.setText(C13_str);
		C13.setFont(new Font("メイリオ", Font.PLAIN, 11));
		C13.setBounds(3, 322, 142, 20);
		ConfigTab.add(C13);
		C13.setColumns(10);

		C14 = new JTextField();
		C14.setHorizontalAlignment(SwingConstants.LEFT);
		C14.setBorder(new LineBorder(new Color(220, 20, 60)));
		C14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					C14.setText(null);
				}
			}
		});
		C14.setToolTipText("double click to delete text");
		C14.setText(C14_str);
		C14.setFont(new Font("メイリオ", Font.PLAIN, 11));
		C14.setBounds(3, 346, 142, 20);
		ConfigTab.add(C14);
		C14.setColumns(10);

		C15 = new JTextField();
		C15.setHorizontalAlignment(SwingConstants.LEFT);
		C15.setBorder(new LineBorder(new Color(135, 206, 250), 1, true));
		C15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					C15.setText(null);
				}
			}
		});
		C15.setToolTipText("double click to delete text");
		C15.setText(C15_str);
		C15.setFont(new Font("メイリオ", Font.PLAIN, 11));
		C15.setBounds(17, 370, 128, 20);
		ConfigTab.add(C15);
		C15.setColumns(10);

		C16 = new JTextField();
		C16.setHorizontalAlignment(SwingConstants.LEFT);
		C16.setBorder(new LineBorder(new Color(135, 206, 250), 1, true));
		C16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					C16.setText(null);
				}
			}
		});
		C16.setToolTipText("double click to delete text");
		C16.setText(C16_str);
		C16.setFont(new Font("メイリオ", Font.PLAIN, 11));
		C16.setBounds(17, 394, 128, 20);
		ConfigTab.add(C16);
		C16.setColumns(10);

		C17 = new JTextField();
		C17.setHorizontalAlignment(SwingConstants.LEFT);
		C17.setBorder(new LineBorder(new Color(135, 206, 250), 1, true));
		C17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					C17.setText(null);
				}
			}
		});
		C17.setToolTipText("double click to delete text");
		C17.setText(C17_str);
		C17.setFont(new Font("メイリオ", Font.PLAIN, 11));
		C17.setBounds(17, 418, 128, 20);
		ConfigTab.add(C17);
		C17.setColumns(10);

		C18 = new JTextField();
		C18.setHorizontalAlignment(SwingConstants.LEFT);
		C18.setBorder(new LineBorder(new Color(138, 43, 226)));
		C18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					C18.setText(null);
				}
			}
		});
		C18.setToolTipText("double click to delete text");
		C18.setText(C18_str);
		C18.setFont(new Font("メイリオ", Font.PLAIN, 11));
		C18.setBounds(3, 442, 142, 20);
		ConfigTab.add(C18);
		C18.setColumns(10);

		C19 = new JTextField();
		C19.setHorizontalAlignment(SwingConstants.LEFT);
		C19.setBorder(new LineBorder(new Color(138, 43, 226)));
		C19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					C19.setText(null);
				}
			}
		});
		C19.setToolTipText("double click to delete text");
		C19.setText(C19_str);
		C19.setFont(new Font("メイリオ", Font.PLAIN, 11));
		C19.setBounds(3, 466, 142, 20);
		ConfigTab.add(C19);
		C19.setColumns(10);

		C20 = new JTextField();
		C20.setHorizontalAlignment(SwingConstants.LEFT);
		C20.setBorder(new LineBorder(new Color(138, 43, 226)));
		C20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					C20.setText(null);
				}
			}
		});
		C20.setToolTipText("double click to delete text");
		C20.setText(C20_str);
		C20.setFont(new Font("メイリオ", Font.PLAIN, 11));
		C20.setBounds(3, 490, 142, 19);
		ConfigTab.add(C20);
		C20.setColumns(10);

		C21 = new JTextField();
		C21.setHorizontalAlignment(SwingConstants.LEFT);
		C21.setBorder(new LineBorder(new Color(255, 215, 0), 1, true));
		C21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					C21.setText(null);
				}
			}
		});
		C21.setToolTipText("double click to delete text");
		C21.setText(C21_str);
		C21.setFont(new Font("メイリオ", Font.PLAIN, 11));
		C21.setBounds(179, 10, 144, 20);
		ConfigTab.add(C21);
		C21.setColumns(10);

		C22 = new JTextField();
		C22.setHorizontalAlignment(SwingConstants.LEFT);
		C22.setBorder(new LineBorder(new Color(255, 215, 0), 1, true));
		C22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					C22.setText(null);
				}
			}
		});
		C22.setToolTipText("double click to delete text");
		C22.setText(C22_str);
		C22.setFont(new Font("メイリオ", Font.PLAIN, 11));
		C22.setBounds(179, 34, 144, 20);
		ConfigTab.add(C22);
		C22.setColumns(10);

		C23 = new JTextField();
		C23.setHorizontalAlignment(SwingConstants.LEFT);
		C23.setBorder(new LineBorder(new Color(255, 215, 0), 1, true));
		C23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					C23.setText(null);
				}
			}
		});
		C23.setToolTipText("double click to delete text");
		C23.setText(C23_str);
		C23.setFont(new Font("メイリオ", Font.PLAIN, 11));
		C23.setBounds(179, 58, 144, 20);
		ConfigTab.add(C23);
		C23.setColumns(10);

		C24 = new JTextField();
		C24.setHorizontalAlignment(SwingConstants.LEFT);
		C24.setBorder(new LineBorder(new Color(34, 139, 34), 1, true));
		C24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					C24.setText(null);
				}
			}
		});
		C24.setToolTipText("double click to delete text");
		C24.setText(C24_str);
		C24.setFont(new Font("メイリオ", Font.PLAIN, 11));
		C24.setBounds(195, 82, 128, 20);
		ConfigTab.add(C24);
		C24.setColumns(10);

		C25 = new JTextField();
		C25.setHorizontalAlignment(SwingConstants.LEFT);
		C25.setBorder(new LineBorder(new Color(34, 139, 34), 1, true));
		C25.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					C25.setText(null);
				}
			}
		});
		C25.setToolTipText("double click to delete text");
		C25.setText(C25_str);
		C25.setFont(new Font("メイリオ", Font.PLAIN, 11));
		C25.setBounds(195, 106, 128, 20);
		ConfigTab.add(C25);
		C25.setColumns(10);

		C26 = new JTextField();
		C26.setHorizontalAlignment(SwingConstants.LEFT);
		C26.setBorder(new LineBorder(new Color(128, 0, 0), 1, true));
		C26.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					C26.setText(null);
				}
			}
		});
		C26.setToolTipText("double click to delete text");
		C26.setText(C26_str);
		C26.setFont(new Font("メイリオ", Font.PLAIN, 11));
		C26.setBounds(195, 130, 128, 20);
		ConfigTab.add(C26);
		C26.setColumns(10);

		C27 = new JTextField();
		C27.setHorizontalAlignment(SwingConstants.LEFT);
		C27.setBorder(new LineBorder(new Color(128, 0, 0), 1, true));
		C27.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					C27.setText(null);
				}
			}
		});
		C27.setToolTipText("double click to delete text");
		C27.setText(C27_str);
		C27.setFont(new Font("メイリオ", Font.PLAIN, 11));
		C27.setBounds(179, 154, 144, 20);
		ConfigTab.add(C27);
		C27.setColumns(10);

		C28 = new JTextField();
		C28.setHorizontalAlignment(SwingConstants.LEFT);
		C28.setBorder(new LineBorder(new Color(128, 0, 0), 1, true));
		C28.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					C28.setText(null);
				}
			}
		});
		C28.setToolTipText("double click to delete text");
		C28.setText(C28_str);
		C28.setFont(new Font("メイリオ", Font.PLAIN, 11));
		C28.setBounds(179, 178, 144, 20);
		ConfigTab.add(C28);
		C28.setColumns(10);

		C29 = new JTextField();
		C29.setHorizontalAlignment(SwingConstants.LEFT);
		C29.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		C29.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					C29.setText(null);
				}
			}
		});
		C29.setToolTipText("double click to delete text");
		C29.setText(C29_str);
		C29.setFont(new Font("メイリオ", Font.PLAIN, 11));
		C29.setBounds(179, 202, 144, 20);
		ConfigTab.add(C29);
		C29.setColumns(10);

		C30 = new JTextField();
		C30.setHorizontalAlignment(SwingConstants.LEFT);
		C30.setBorder(new LineBorder(new Color(144, 238, 144), 1, true));
		C30.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					C30.setText(null);
				}
			}
		});
		C30.setToolTipText("double click to delete text");
		C30.setText(C30_str);
		C30.setFont(new Font("メイリオ", Font.PLAIN, 11));
		C30.setColumns(10);
		C30.setBounds(193, 226, 128, 20);
		ConfigTab.add(C30);

		C31 = new JTextField();
		C31.setHorizontalAlignment(SwingConstants.LEFT);
		C31.setBorder(new LineBorder(new Color(144, 238, 144), 1, true));
		C31.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					C31.setText(null);
				}
			}
		});
		C31.setToolTipText("double click to delete text");
		C31.setText(C31_str);
		C31.setFont(new Font("メイリオ", Font.PLAIN, 11));
		C31.setColumns(10);
		C31.setBounds(193, 250, 128, 20);
		ConfigTab.add(C31);

		C32 = new JTextField();
		C32.setHorizontalAlignment(SwingConstants.LEFT);
		C32.setBorder(new LineBorder(new Color(144, 238, 144), 1, true));
		C32.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					C32.setText(null);
				}
			}
		});
		C32.setToolTipText("double click to delete text");
		C32.setText(C32_str);
		C32.setFont(new Font("メイリオ", Font.PLAIN, 11));
		C32.setColumns(10);
		C32.setBounds(193, 274, 128, 20);
		ConfigTab.add(C32);

		C33 = new JTextField();
		C33.setHorizontalAlignment(SwingConstants.LEFT);
		C33.setBorder(new LineBorder(new Color(220, 20, 60)));
		C33.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					C33.setText(null);
				}
			}
		});
		C33.setToolTipText("double click to delete text");
		C33.setText(C33_str);
		C33.setFont(new Font("メイリオ", Font.PLAIN, 11));
		C33.setColumns(10);
		C33.setBounds(179, 298, 144, 20);
		ConfigTab.add(C33);

		C34 = new JTextField();
		C34.setHorizontalAlignment(SwingConstants.LEFT);
		C34.setBorder(new LineBorder(new Color(220, 20, 60)));
		C34.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					C34.setText(null);
				}
			}
		});
		C34.setToolTipText("double click to delete text");
		C34.setText(C34_str);
		C34.setFont(new Font("メイリオ", Font.PLAIN, 11));
		C34.setColumns(10);
		C34.setBounds(179, 322, 144, 20);
		ConfigTab.add(C34);

		C35 = new JTextField();
		C35.setHorizontalAlignment(SwingConstants.LEFT);
		C35.setBorder(new LineBorder(new Color(220, 20, 60)));
		C35.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					C35.setText(null);
				}
			}
		});
		C35.setToolTipText("double click to delete text");
		C35.setText(C35_str);
		C35.setFont(new Font("メイリオ", Font.PLAIN, 11));
		C35.setColumns(10);
		C35.setBounds(179, 346, 144, 20);
		ConfigTab.add(C35);

		C36 = new JTextField();
		C36.setHorizontalAlignment(SwingConstants.LEFT);
		C36.setBorder(new LineBorder(new Color(135, 206, 250), 1, true));
		C36.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					C36.setText(null);
				}
			}
		});
		C36.setToolTipText("double click to delete text");
		C36.setText((String) null);
		C36.setFont(new Font("メイリオ", Font.PLAIN, 11));
		C36.setColumns(10);
		C36.setBounds(193, 370, 128, 20);
		ConfigTab.add(C36);

		C37 = new JTextField();
		C37.setHorizontalAlignment(SwingConstants.LEFT);
		C37.setBorder(new LineBorder(new Color(135, 206, 250), 1, true));
		C37.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					C37.setText(null);
				}
			}
		});
		C37.setToolTipText("double click to delete text");
		C37.setText(C37_str);
		C37.setFont(new Font("メイリオ", Font.PLAIN, 11));
		C37.setColumns(10);
		C37.setBounds(193, 394, 128, 20);
		ConfigTab.add(C37);

		C38 = new JTextField();
		C38.setHorizontalAlignment(SwingConstants.LEFT);
		C38.setBorder(new LineBorder(new Color(135, 206, 250), 1, true));
		C38.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					C38.setText(null);
				}
			}
		});
		C38.setToolTipText("double click to delete text");
		C38.setText(C38_str);
		C38.setFont(new Font("メイリオ", Font.PLAIN, 11));
		C38.setColumns(10);
		C38.setBounds(193, 418, 128, 20);
		ConfigTab.add(C38);

		C39 = new JTextField();
		C39.setHorizontalAlignment(SwingConstants.LEFT);
		C39.setBorder(new LineBorder(new Color(138, 43, 226)));
		C39.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					C39.setText(null);
				}
			}
		});
		C39.setToolTipText("double click to delete text");
		C39.setText(C39_str);
		C39.setFont(new Font("メイリオ", Font.PLAIN, 11));
		C39.setColumns(10);
		C39.setBounds(179, 442, 144, 20);
		ConfigTab.add(C39);

		C40 = new JTextField();
		C40.setHorizontalAlignment(SwingConstants.LEFT);
		C40.setBorder(new LineBorder(new Color(138, 43, 226)));
		C40.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					C40.setText(null);
				}
			}
		});
		C40.setToolTipText("double click to delete text");
		C40.setText(C40_str);
		C40.setFont(new Font("メイリオ", Font.PLAIN, 11));
		C40.setColumns(10);
		C40.setBounds(179, 466, 144, 20);
		ConfigTab.add(C40);

		C41 = new JTextField();
		C41.setHorizontalAlignment(SwingConstants.LEFT);
		C41.setBorder(new LineBorder(new Color(138, 43, 226)));
		C41.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					C41.setText(null);
				}
			}
		});
		C41.setToolTipText("double click to delete text");
		C41.setText(C41_str);
		C41.setFont(new Font("メイリオ", Font.PLAIN, 11));
		C41.setColumns(10);
		C41.setBounds(179, 490, 144, 19);
		ConfigTab.add(C41);

		//
		// Change Button Text
		//
		JButton c00repaint = new JButton("update");
		c00repaint.setBorder(new LineBorder(null, 1, true));
		c00repaint.setToolTipText("click to update button text");
		c00repaint.setIconTextGap(1);
		c00repaint.setFont(new Font("メイリオ", Font.PLAIN, 6));
		c00repaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				B00.setText(C00.getText());
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					updateProperties(prop);
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		c00repaint.setBounds(146, 10, 30, 20);
		ConfigTab.add(c00repaint);

		JButton c01repaint = new JButton("update");
		c01repaint.setBorder(new LineBorder(null, 1, true));
		c01repaint.setToolTipText("click to update button text");
		c01repaint.setIconTextGap(1);
		c01repaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B01.setText(C01.getText());
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e01) {
					e01.printStackTrace();
				}
			}
		});
		c01repaint.setFont(new Font("メイリオ", Font.PLAIN, 6));
		c01repaint.setBounds(146, 34, 30, 20);
		ConfigTab.add(c01repaint);

		JButton c02repaint = new JButton("update");
		c02repaint.setBorder(new LineBorder(null, 1, true));
		c02repaint.setToolTipText("click to update button text");
		c02repaint.setIconTextGap(1);
		c02repaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B02.setText(C02.getText());
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					updateProperties(prop);
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e01) {
					e01.printStackTrace();
				}
			}
		});
		c02repaint.setFont(new Font("メイリオ", Font.PLAIN, 6));
		c02repaint.setBounds(146, 58, 30, 20);
		ConfigTab.add(c02repaint);

		JButton c03repaint = new JButton("update");
		c03repaint.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		c03repaint.setToolTipText("click to update button text");
		c03repaint.setIconTextGap(1);
		c03repaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B03.setText(C03.getText());
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					updateProperties(prop);
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e01) {
					e01.printStackTrace();
				}
			}
		});
		c03repaint.setFont(new Font("メイリオ", Font.PLAIN, 6));
		c03repaint.setBounds(146, 82, 30, 20);
		ConfigTab.add(c03repaint);

		JButton c04repaint = new JButton("update");
		c04repaint.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		c04repaint.setToolTipText("click to update button text");
		c04repaint.setIconTextGap(1);
		c04repaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B04.setText(C04.getText());
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					updateProperties(prop);
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e01) {
					e01.printStackTrace();
				}
			}
		});
		c04repaint.setFont(new Font("メイリオ", Font.PLAIN, 6));
		c04repaint.setBounds(146, 106, 30, 20);
		ConfigTab.add(c04repaint);

		JButton c05repaint = new JButton("update");
		c05repaint.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		c05repaint.setToolTipText("click to update button text");
		c05repaint.setIconTextGap(1);
		c05repaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B05.setText(C05.getText());
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					updateProperties(prop);
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e01) {
					e01.printStackTrace();
				}
			}
		});
		c05repaint.setFont(new Font("メイリオ", Font.PLAIN, 6));
		c05repaint.setBounds(146, 130, 30, 20);
		ConfigTab.add(c05repaint);

		JButton c06repaint = new JButton("update");
		c06repaint.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		c06repaint.setToolTipText("click to update button text");
		c06repaint.setIconTextGap(1);
		c06repaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B06.setText(C06.getText());
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					updateProperties(prop);
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e01) {
					e01.printStackTrace();
				}
			}
		});
		c06repaint.setFont(new Font("メイリオ", Font.PLAIN, 6));
		c06repaint.setBounds(146, 154, 30, 20);
		ConfigTab.add(c06repaint);

		JButton c07repaint = new JButton("update");
		c07repaint.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		c07repaint.setToolTipText("click to update button text");
		c07repaint.setIconTextGap(1);
		c07repaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B07.setText(C07.getText());
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					updateProperties(prop);
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e01) {
					e01.printStackTrace();
				}
			}
		});
		c07repaint.setFont(new Font("メイリオ", Font.PLAIN, 6));
		c07repaint.setBounds(146, 178, 30, 20);
		ConfigTab.add(c07repaint);

		JButton c08repaint = new JButton("update");
		c08repaint.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		c08repaint.setToolTipText("click to update button text");
		c08repaint.setIconTextGap(1);
		c08repaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B08.setText(C08.getText());
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					updateProperties(prop);
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e01) {
					e01.printStackTrace();
				}
			}
		});
		c08repaint.setFont(new Font("メイリオ", Font.PLAIN, 6));
		c08repaint.setBounds(146, 202, 30, 20);
		ConfigTab.add(c08repaint);

		JButton c09repaint = new JButton("update");
		c09repaint.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		c09repaint.setToolTipText("click to update button text");
		c09repaint.setIconTextGap(1);
		c09repaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B09.setText(C09.getText());
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					updateProperties(prop);
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e01) {
					e01.printStackTrace();
				}
			}
		});
		c09repaint.setFont(new Font("メイリオ", Font.PLAIN, 6));
		c09repaint.setBounds(146, 226, 30, 20);
		ConfigTab.add(c09repaint);

		JButton c10repaint = new JButton("update");
		c10repaint.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		c10repaint.setToolTipText("click to update button text");
		c10repaint.setIconTextGap(1);
		c10repaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B10.setText(C10.getText());
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					updateProperties(prop);
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e01) {
					e01.printStackTrace();
				}
			}
		});
		c10repaint.setFont(new Font("メイリオ", Font.PLAIN, 6));
		c10repaint.setBounds(146, 250, 30, 20);
		ConfigTab.add(c10repaint);

		JButton c11repaint = new JButton("update");
		c11repaint.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		c11repaint.setToolTipText("click to update button text");
		c11repaint.setIconTextGap(1);
		c11repaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B11.setText(C11.getText());
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					updateProperties(prop);
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e01) {
					e01.printStackTrace();
				}
			}
		});
		c11repaint.setFont(new Font("メイリオ", Font.PLAIN, 6));
		c11repaint.setBounds(146, 274, 30, 20);
		ConfigTab.add(c11repaint);

		JButton c12repaint = new JButton("update");
		c12repaint.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		c12repaint.setToolTipText("click to update button text");
		c12repaint.setIconTextGap(1);
		c12repaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B12.setText(C12.getText());
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					updateProperties(prop);
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e01) {
					e01.printStackTrace();
				}
			}
		});
		c12repaint.setFont(new Font("メイリオ", Font.PLAIN, 6));
		c12repaint.setBounds(146, 298, 30, 20);
		ConfigTab.add(c12repaint);

		JButton c13repaint = new JButton("update");
		c13repaint.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		c13repaint.setToolTipText("click to update button text");
		c13repaint.setIconTextGap(1);
		c13repaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B13.setText(C13.getText());
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					updateProperties(prop);
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e01) {
					e01.printStackTrace();
				}
			}
		});
		c13repaint.setFont(new Font("メイリオ", Font.PLAIN, 6));
		c13repaint.setBounds(146, 322, 30, 20);
		ConfigTab.add(c13repaint);

		JButton c14repaint = new JButton("update");
		c14repaint.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		c14repaint.setToolTipText("click to update button text");
		c14repaint.setIconTextGap(1);
		c14repaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B14.setText(C14.getText());
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					updateProperties(prop);
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e01) {
					e01.printStackTrace();
				}
			}
		});
		c14repaint.setFont(new Font("メイリオ", Font.PLAIN, 6));
		c14repaint.setBounds(146, 346, 30, 20);
		ConfigTab.add(c14repaint);

		JButton c15repaint = new JButton("update");
		c15repaint.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		c15repaint.setToolTipText("click to update button text");
		c15repaint.setIconTextGap(1);
		c15repaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B15.setText(C15.getText());
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					updateProperties(prop);
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e01) {
					e01.printStackTrace();
				}
			}
		});
		c15repaint.setFont(new Font("メイリオ", Font.PLAIN, 6));
		c15repaint.setBounds(146, 370, 30, 20);
		ConfigTab.add(c15repaint);

		JButton c16repaint = new JButton("update");
		c16repaint.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		c16repaint.setToolTipText("click to update button text");
		c16repaint.setIconTextGap(1);
		c16repaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B16.setText(C16.getText());
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					updateProperties(prop);
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e01) {
					e01.printStackTrace();
				}
			}
		});
		c16repaint.setFont(new Font("メイリオ", Font.PLAIN, 6));
		c16repaint.setBounds(146, 394, 30, 20);
		ConfigTab.add(c16repaint);

		JButton c17repaint = new JButton("update");
		c17repaint.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		c17repaint.setToolTipText("click to update button text");
		c17repaint.setIconTextGap(1);
		c17repaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B17.setText(C17.getText());
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					updateProperties(prop);
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e01) {
					e01.printStackTrace();
				}
			}
		});
		c17repaint.setFont(new Font("メイリオ", Font.PLAIN, 6));
		c17repaint.setBounds(146, 418, 30, 20);
		ConfigTab.add(c17repaint);

		JButton c18repaint = new JButton("update");
		c18repaint.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		c18repaint.setToolTipText("click to update button text");
		c18repaint.setIconTextGap(1);
		c18repaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B18.setText(C18.getText());
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					updateProperties(prop);
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e01) {
					e01.printStackTrace();
				}
			}
		});
		c18repaint.setFont(new Font("メイリオ", Font.PLAIN, 6));
		c18repaint.setBounds(146, 442, 30, 20);
		ConfigTab.add(c18repaint);

		JButton c19repaint = new JButton("update");
		c19repaint.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		c19repaint.setToolTipText("click to update button text");
		c19repaint.setIconTextGap(1);
		c19repaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B19.setText(C19.getText());
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					updateProperties(prop);
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e01) {
					e01.printStackTrace();
				}
			}
		});
		c19repaint.setFont(new Font("メイリオ", Font.PLAIN, 6));
		c19repaint.setBounds(146, 466, 30, 20);
		ConfigTab.add(c19repaint);

		JButton c20repaint = new JButton("update");
		c20repaint.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		c20repaint.setToolTipText("click to update button text");
		c20repaint.setIconTextGap(1);
		c20repaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B20.setText(C20.getText());
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					updateProperties(prop);
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e01) {
					e01.printStackTrace();
				}
			}
		});
		c20repaint.setFont(new Font("メイリオ", Font.PLAIN, 6));
		c20repaint.setBounds(146, 490, 30, 20);
		ConfigTab.add(c20repaint);

		JButton c21repaint = new JButton("update");
		c21repaint.setBorder(new LineBorder(null, 1, true));
		c21repaint.setToolTipText("click to update button text");
		c21repaint.setIconTextGap(1);
		c21repaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B21.setText(C21.getText());
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					updateProperties(prop);
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e01) {
					e01.printStackTrace();
				}
			}
		});
		c21repaint.setFont(new Font("メイリオ", Font.PLAIN, 6));
		c21repaint.setBounds(324, 10, 30, 20);
		ConfigTab.add(c21repaint);

		JButton c22repaint = new JButton("update");
		c22repaint.setBorder(new LineBorder(null, 1, true));
		c22repaint.setToolTipText("click to update button text");
		c22repaint.setIconTextGap(1);
		c22repaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B22.setText(C22.getText());
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					updateProperties(prop);
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e01) {
					e01.printStackTrace();
				}
			}
		});
		c22repaint.setFont(new Font("メイリオ", Font.PLAIN, 6));
		c22repaint.setBounds(324, 34, 30, 20);
		ConfigTab.add(c22repaint);

		JButton c23repaint = new JButton("update");
		c23repaint.setBorder(new LineBorder(null, 1, true));
		c23repaint.setToolTipText("click to update button text");
		c23repaint.setIconTextGap(1);
		c23repaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B23.setText(C23.getText());
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					updateProperties(prop);
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e01) {
					e01.printStackTrace();
				}
			}
		});
		c23repaint.setFont(new Font("メイリオ", Font.PLAIN, 6));
		c23repaint.setBounds(324, 58, 30, 20);
		ConfigTab.add(c23repaint);

		JButton c24repaint = new JButton("update");
		c24repaint.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		c24repaint.setToolTipText("click to update button text");
		c24repaint.setIconTextGap(1);
		c24repaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B24.setText(C24.getText());
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					updateProperties(prop);
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e01) {
					e01.printStackTrace();
				}
			}
		});
		c24repaint.setFont(new Font("メイリオ", Font.PLAIN, 6));
		c24repaint.setBounds(324, 82, 30, 20);
		ConfigTab.add(c24repaint);

		JButton c25repaint = new JButton("update");
		c25repaint.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		c25repaint.setToolTipText("click to update button text");
		c25repaint.setIconTextGap(1);
		c25repaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B25.setText(C25.getText());
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					updateProperties(prop);
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e01) {
					e01.printStackTrace();
				}
			}
		});
		c25repaint.setFont(new Font("メイリオ", Font.PLAIN, 6));
		c25repaint.setBounds(324, 106, 30, 20);
		ConfigTab.add(c25repaint);

		JButton c26repaint = new JButton("update");
		c26repaint.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		c26repaint.setToolTipText("click to update button text");
		c26repaint.setIconTextGap(1);
		c26repaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B26.setText(C26.getText());
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					updateProperties(prop);
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e01) {
					e01.printStackTrace();
				}
			}
		});
		c26repaint.setFont(new Font("メイリオ", Font.PLAIN, 6));
		c26repaint.setBounds(324, 130, 30, 20);
		ConfigTab.add(c26repaint);

		JButton c27repaint = new JButton("update");
		c27repaint.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		c27repaint.setToolTipText("click to update button text");
		c27repaint.setIconTextGap(1);
		c27repaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B27.setText(C27.getText());
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					updateProperties(prop);
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e01) {
					e01.printStackTrace();
				}
			}
		});
		c27repaint.setFont(new Font("メイリオ", Font.PLAIN, 6));
		c27repaint.setBounds(324, 154, 30, 20);
		ConfigTab.add(c27repaint);

		JButton c28repaint = new JButton("update");
		c28repaint.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		c28repaint.setToolTipText("click to update button text");
		c28repaint.setIconTextGap(1);
		c28repaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B28.setText(C28.getText());
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					updateProperties(prop);
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e01) {
					e01.printStackTrace();
				}
			}
		});
		c28repaint.setFont(new Font("メイリオ", Font.PLAIN, 6));
		c28repaint.setBounds(324, 178, 30, 20);
		ConfigTab.add(c28repaint);

		JButton c29repaint = new JButton("update");
		c29repaint.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		c29repaint.setToolTipText("click to update button text");
		c29repaint.setIconTextGap(1);
		c29repaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B29.setText(C29.getText());
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					updateProperties(prop);
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e01) {
					e01.printStackTrace();
				}
			}
		});
		c29repaint.setFont(new Font("メイリオ", Font.PLAIN, 6));
		c29repaint.setBounds(324, 202, 30, 20);
		ConfigTab.add(c29repaint);

		JButton c30repaint = new JButton("update");
		c30repaint.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		c30repaint.setToolTipText("click to update button text");
		c30repaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B30.setText(C30.getText());
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					updateProperties(prop);
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e01) {
					e01.printStackTrace();
				}
			}
		});
		c30repaint.setIconTextGap(1);
		c30repaint.setFont(new Font("メイリオ", Font.PLAIN, 6));
		c30repaint.setBounds(324, 226, 30, 20);
		ConfigTab.add(c30repaint);

		JButton c31repaint = new JButton("update");
		c31repaint.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		c31repaint.setToolTipText("click to update button text");
		c31repaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B31.setText(C31.getText());
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					updateProperties(prop);
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e01) {
					e01.printStackTrace();
				}
			}
		});
		c31repaint.setIconTextGap(1);
		c31repaint.setFont(new Font("メイリオ", Font.PLAIN, 6));
		c31repaint.setBounds(324, 250, 30, 20);
		ConfigTab.add(c31repaint);

		JButton c32repaint = new JButton("update");
		c32repaint.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		c32repaint.setToolTipText("click to update button text");
		c32repaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B32.setText(C32.getText());
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					updateProperties(prop);
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e01) {
					e01.printStackTrace();
				}
			}
		});
		c32repaint.setIconTextGap(1);
		c32repaint.setFont(new Font("メイリオ", Font.PLAIN, 6));
		c32repaint.setBounds(324, 274, 30, 20);
		ConfigTab.add(c32repaint);

		JButton c33repaint = new JButton("update");
		c33repaint.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		c33repaint.setToolTipText("click to update button text");
		c33repaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B33.setText(C33.getText());
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					updateProperties(prop);
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e01) {
					e01.printStackTrace();
				}
			}
		});
		c33repaint.setIconTextGap(1);
		c33repaint.setFont(new Font("メイリオ", Font.PLAIN, 6));
		c33repaint.setBounds(324, 298, 30, 20);
		ConfigTab.add(c33repaint);

		JButton c34repaint = new JButton("update");
		c34repaint.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		c34repaint.setToolTipText("click to update button text");
		c34repaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B34.setText(C34.getText());
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					updateProperties(prop);
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e01) {
					e01.printStackTrace();
				}
			}
		});
		c34repaint.setIconTextGap(1);
		c34repaint.setFont(new Font("メイリオ", Font.PLAIN, 6));
		c34repaint.setBounds(324, 322, 30, 20);
		ConfigTab.add(c34repaint);

		JButton c35repaint = new JButton("update");
		c35repaint.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		c35repaint.setToolTipText("click to update button text");
		c35repaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B35.setText(C35.getText());
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					updateProperties(prop);
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e01) {
					e01.printStackTrace();
				}
			}
		});
		c35repaint.setIconTextGap(1);
		c35repaint.setFont(new Font("メイリオ", Font.PLAIN, 6));
		c35repaint.setBounds(324, 346, 30, 20);
		ConfigTab.add(c35repaint);

		JButton c36repaint = new JButton("update");
		c36repaint.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		c36repaint.setToolTipText("click to update button text");
		c36repaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B36.setText(C36.getText());
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					updateProperties(prop);
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e01) {
					e01.printStackTrace();
				}
			}
		});
		c36repaint.setIconTextGap(1);
		c36repaint.setFont(new Font("メイリオ", Font.PLAIN, 6));
		c36repaint.setBounds(324, 370, 30, 20);
		ConfigTab.add(c36repaint);

		JButton c37repaint = new JButton("update");
		c37repaint.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		c37repaint.setToolTipText("click to update button text");
		c37repaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B37.setText(C37.getText());
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					updateProperties(prop);
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e01) {
					e01.printStackTrace();
				}
			}
		});
		c37repaint.setIconTextGap(1);
		c37repaint.setFont(new Font("メイリオ", Font.PLAIN, 6));
		c37repaint.setBounds(324, 394, 30, 20);
		ConfigTab.add(c37repaint);

		JButton c38repaint = new JButton("update");
		c38repaint.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		c38repaint.setToolTipText("click to update button text");
		c38repaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B38.setText(C38.getText());
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					updateProperties(prop);
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e01) {
					e01.printStackTrace();
				}
			}
		});
		c38repaint.setIconTextGap(1);
		c38repaint.setFont(new Font("メイリオ", Font.PLAIN, 6));
		c38repaint.setBounds(324, 418, 30, 20);
		ConfigTab.add(c38repaint);

		JButton c39repaint = new JButton("update");
		c39repaint.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		c39repaint.setToolTipText("click to update button text");
		c39repaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B39.setText(C39.getText());
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					updateProperties(prop);
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e01) {
					e01.printStackTrace();
				}
			}
		});
		c39repaint.setIconTextGap(1);
		c39repaint.setFont(new Font("メイリオ", Font.PLAIN, 6));
		c39repaint.setBounds(324, 442, 30, 20);
		ConfigTab.add(c39repaint);

		JButton c40repaint = new JButton("update");
		c40repaint.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		c40repaint.setToolTipText("click to update button text");
		c40repaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B40.setText(C40.getText());
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					updateProperties(prop);
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e01) {
					e01.printStackTrace();
				}
			}
		});
		c40repaint.setIconTextGap(1);
		c40repaint.setFont(new Font("メイリオ", Font.PLAIN, 6));
		c40repaint.setBounds(324, 466, 30, 20);
		ConfigTab.add(c40repaint);

		JButton c41repaint = new JButton("update");
		c41repaint.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		c41repaint.setToolTipText("click to update button text");
		c41repaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B41.setText(C41.getText());
				try (FileOutputStream f = new FileOutputStream(properties_file);
						BufferedOutputStream b = new BufferedOutputStream(f)) {
					Properties prop = new Properties();
					updateProperties(prop);
					prop.store(b, "");
					b.close();
					f.close();
				} catch (IOException e01) {
					e01.printStackTrace();
				}
			}
		});
		c41repaint.setIconTextGap(1);
		c41repaint.setFont(new Font("メイリオ", Font.PLAIN, 6));
		c41repaint.setBounds(324, 490, 30, 20);
		ConfigTab.add(c41repaint);
	}
}
