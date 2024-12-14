import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        // Membuat frame
        JFrame frame = new JFrame("Pertemuan 8");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout()); // Menambahkan margin antar komponen

        // Membuat panel input nama
        JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel nameLabel = new JLabel("Masukkan Nama Anda:");
        JTextField nameField = new JTextField(15);
        inputPanel.add(nameLabel);
        inputPanel.add(nameField);

        // Membuat panel input lokasi
        JPanel locationPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel locationLabel = new JLabel("Masukkan Lokasi Anda:");
        JTextField locationField = new JTextField(15);
        JButton submitButton = new JButton("Kirim");
        locationPanel.add(locationLabel);
        locationPanel.add(locationField);
        locationPanel.add(submitButton);

        // Menambahkan komponen ke frame
        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(locationPanel, BorderLayout.CENTER);

        // Logika tombol submit
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText().trim();
                String location = locationField.getText().trim();

                // Validasi input
                if (!name.isEmpty() || !location.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Halo, " + name + "!\nKamu dari " + location + "!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frame, "Harap isi semua kolom input bro.", "Peringatan", JOptionPane.WARNING_MESSAGE);
                    // Menampilkan hasil input sebagai notifikasi

                    // Reset input
                    nameField.setText("");
                    locationField.setText("");
                }
            }
        });

        // Menampilkan frame
        frame.setVisible(true);
    }
}
