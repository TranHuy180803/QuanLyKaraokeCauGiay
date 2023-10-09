package application;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class DialogGioiThieu extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Create the dialog.
	 */
	public DialogGioiThieu() {

		/** set color and font **/
		Font tahoma20 = new Font("Tahoma", Font.PLAIN, 20);
		Font tahoma16 = new Font("Tahoma", Font.PLAIN, 16);
		Font tahoma18 = new Font("Tahoma", Font.PLAIN, 18);
		Font tahoma12 = new Font("Tahoma", Font.PLAIN, 12);

		Color mainColor = new Color(88, 177, 159);
		Color whiteColor = new Color(255, 255, 255);

		setBounds(100, 100, 699, 554);
		setLocationRelativeTo(null);
		setTitle("Thông tin ứng dụng");
		ImageIcon img = new ImageIcon(getClass().getResource("/images/info.png"));
		setIconImage(img.getImage());
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(whiteColor);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		JLabel lblNewLabel = new JLabel("Phần mềm do nhóm 13 thực hiện ");
		lblNewLabel.setFont(tahoma20);
		JLabel lblThnhVin = new JLabel("Thành viên:");
		lblThnhVin.setFont(tahoma18);
		JLabel lbllaVMinh = new JLabel("-Nguyen Dinh Nam");
		lbllaVMinh.setFont(tahoma16);
		JLabel lblnguynHngQunnotetaker = new JLabel("-Truong Anh Thi");
		lblnguynHngQunnotetaker.setFont(tahoma16);
		JLabel lbltngGiaBotimekeeper = new JLabel("-Tran Dinh Huy");
		lbltngGiaBotimekeeper.setFont(tahoma16);
		JLabel lblonThM = new JLabel("");
		lblonThM.setFont(tahoma16);
		JLabel lblGioVinHng = new JLabel("Giao vien huong dan: Tran Xuan Thanh");
		lblGioVinHng.setFont(tahoma16);
		JLabel lblnuXyRa = new JLabel(
				"Phần mềm quản lý quán karaoke Cầu Giấy có các chức năng giúp người quản lý và nhân viên \r\n"
				+ "dễ dàng sử dụng cho công việc quản lý quán karaoke.");
		lblnuXyRa.setFont(tahoma16);
		lblnuXyRa.setForeground(new Color(255, 0, 51));

		JLabel lblNewLabel_1 = new JLabel("T\u1ED5ng quan v\u1EC1 \u1EE9ng d\u1EE5ng:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));

		JPanel panel = new JPanel();

		JTextArea txtArea = new JTextArea();
		txtArea.setEditable(false);
		txtArea.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtArea.setText(
				"Phần mềm quản lý quán karaoke Cầu Giấy có các chức năng giúp người quản lý và nhân viên \ndễ dàng sử dụng cho công việc quản lý quán karaoke."
				+ "\n\nPhần mềm được viết cho nhân viên lễ tân và người quản lý của quán karaoke Cầu Giấy,\nkhông dùng cho khách hàng."
				+ "\n\nPhần mềm sử dụng ngôn ngữ Java, jdk11, dùng hệ cơ sở dữ liệu MSSQL Server\n(bản 2014 trở lên) để lưu trữ dữ liệu");
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup().addContainerGap().addGroup(gl_contentPanel
						.createParallelGroup(Alignment.LEADING)
						.addComponent(txtArea, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
						.addComponent(lblNewLabel_1)
						.addGroup(gl_contentPanel.createSequentialGroup().addGroup(gl_contentPanel
								.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblThnhVin, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
								.addComponent(lbllaVMinh, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(lblonThM, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(lbltngGiaBotimekeeper, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(lblnguynHngQunnotetaker, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblGioVinHng, GroupLayout.PREFERRED_SIZE, 319,
										GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblnuXyRa, GroupLayout.PREFERRED_SIZE, 653, Short.MAX_VALUE)).addContainerGap()));
		gl_contentPanel.setVerticalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPanel
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup().addComponent(lblNewLabel).addGap(18)
								.addComponent(lblThnhVin).addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(lbllaVMinh).addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(lblnguynHngQunnotetaker).addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(lbltngGiaBotimekeeper).addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(lblonThM).addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(lblGioVinHng).addGap(18).addComponent(lblNewLabel_1))
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 241, GroupLayout.PREFERRED_SIZE))
				.addGap(7).addComponent(txtArea, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(lblnuXyRa, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
				.addContainerGap()));
		panel.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(getClass().getResource("/images/kara.png")));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 11, 205, 197);
		panel.add(lblNewLabel_2);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnClose = new JButton("\u0110\u00F3ng");
				btnClose.setForeground(whiteColor);
				btnClose.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				btnClose.setBackground(mainColor);
				btnClose.setFocusable(false);
				btnClose.setFont(tahoma12);
				btnClose.setActionCommand("Cancel");
				buttonPane.add(btnClose);
			}
		}
	}
}
