package Tuan02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

public class ex4 extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private JButton copyButton;
    private JProgressBar progressBar;
    private JTextField sourceField;
    private JTextField destField;

    public ex4() {
        copyButton = new JButton("Copy...");
        progressBar = new JProgressBar();
        progressBar.setStringPainted(true);
        sourceField = new JTextField();
        destField = new JTextField();
        setTitle("Copying File_Trần Trọng Tín");
        setSize(360, 250);
        setResizable(false);
        setLocationRelativeTo(null);

//        copyButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//            	 progressBar.setValue(100);
//                String sourcePath = sourceField.getText();
//                String destPath = destField.getText();
//                try {
//                    copyAndCompressFile(sourcePath, destPath);
//                } catch (IOException ex) {
//                    ex.printStackTrace();
//                }
//            }
//        });
//
//        setLayout(null);
//
//        sourceField.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black, 2),
//            "From", TitledBorder.LEFT, TitledBorder.CENTER, new Font("Arial", Font.BOLD, 12), Color.black));
//        sourceField.setBounds(20, 10, 300, 40);
//
//        destField.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black, 2),
//            "To", TitledBorder.LEFT, TitledBorder.CENTER, new Font("Arial", Font.BOLD, 12), Color.black));
//        destField.setBounds(20, 60, 300, 40);
//
//        copyButton.setBounds(110, 110, 120, 25);
//        progressBar.setBounds(0, 150, 350, 20);
//
//        add(sourceField);
//        add(destField);
//        add(copyButton);
//        add(progressBar);
//
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setVisible(true);
//    }
//    private void copyAndCompressFile(String sourcePath, String destPath) throws IOException {
//        File sourceFile = new File(sourcePath);
//        File destFile = new File(destPath);
//
//        // Kiểm tra thư mục đích
//        if (!destFile.getParentFile().exists()) {
//            JOptionPane.showMessageDialog(this, "Thư mục file đích không tồn tại !");
//            throw new FileNotFoundException("Thư mục file đích không tồn tại !");
//        }
//
//        // Kiểm tra thư mục nguồn
//        if (!sourceFile.getParentFile().exists()) {
//            JOptionPane.showMessageDialog(this, "Thư mục file nguồn không tồn tại !");
//            throw new FileNotFoundException("Thư mục file nguồn không tồn tại !");
//        }
//
//        // Đọc tệp nguồn
//        FileInputStream fis = new FileInputStream(sourceFile);
//        byte[] buffer = new byte[1024];
//        int length;
//
//        // Nén tệp
//        FileOutputStream fos = new FileOutputStream(destFile);
//        GZIPOutputStream gzos = new GZIPOutputStream(fos);
//        while ((length = fis.read(buffer)) > 0) {
//            gzos.write(buffer, 0, length);
//        }
//
//        // Đóng luồng
//        fis.close();
//        gzos.finish();
//        gzos.close();
//        JOptionPane.showMessageDialog(this, "Sao chép thành công !");
//    }
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                new Exercise4();
//            }
//        });
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
