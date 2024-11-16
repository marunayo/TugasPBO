import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainApp extends JFrame {
    private JPanel panel1;
    private JTextField nama;
    private JTextField alamat;
    private JTextField notelp;
    private JCheckBox steakCheckBox;
    private JCheckBox spaghettiCheckBox;
    private JCheckBox pizzaCheckBox;
    private JTextField totalHarga;
    private JButton tambahButton;
    private JTextArea dataPenjualan;

    // HARGA MAKANAN
    private final int hargaSteak = 50000;
    private final int hargaSpaghetti = 45000;
    private final int hargaPizza = 40000;

    public MainApp() {
        setContentPane(panel1);
        setTitle("Aplikasi Pemesanan Makanan");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        // Make the totalHarga field non-editable
        totalHarga.setEditable(false);

        // Add ActionListeners to checkboxes for automatic total updating
        steakCheckBox.addActionListener(new CheckboxListener());
        spaghettiCheckBox.addActionListener(new CheckboxListener());
        pizzaCheckBox.addActionListener(new CheckboxListener());

        // Event listener for the "Tambah" button
        tambahButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addOrderRecord();
            }
        });
    }

    private class CheckboxListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Update total when any checkbox is selected or deselected
            updateTotal();
        }
    }

    private void updateTotal() {
        int total = 0;

        if (steakCheckBox.isSelected()) {
            total += hargaSteak;
        }
        if (spaghettiCheckBox.isSelected()) {
            total += hargaSpaghetti;
        }
        if (pizzaCheckBox.isSelected()) {
            total += hargaPizza;
        }

        // Display total in the totalHarga text field
        totalHarga.setText(String.valueOf(total));
    }

    private void addOrderRecord() {
        String name = nama.getText();
        String address = alamat.getText();
        String phone = notelp.getText();

        int total = 0;
        StringBuilder orders = new StringBuilder();

        // Building the order details based on selected items
        orders.append("Pesanan:\n");
        if (steakCheckBox.isSelected()) {
            total += hargaSteak;
            orders.append("- Steak: Rp. ").append(hargaSteak).append("\n");
        }
        if (spaghettiCheckBox.isSelected()) {
            total += hargaSpaghetti;
            orders.append("- Spaghetti: Rp. ").append(hargaSpaghetti).append("\n");
        }
        if (pizzaCheckBox.isSelected()) {
            total += hargaPizza;
            orders.append("- Pizza: Rp. ").append(hargaPizza).append("\n");
        }

        // Set totalHarga text
        totalHarga.setText(String.valueOf(total));

        // Append order details to dataPenjualan JTextArea
        String orderRecord = "=============================\n"
                + "Nama: "  + name + "\n" +
                "Alamat: " + address + "\n" +
                "No Telp: " + phone + "\n" +
                "----------------\n" +
                orders.toString() +
                "----------------\n" +
                "Total Bayar:\nRp. " + total + "\n" +
                "=============================\n\n";

        dataPenjualan.append(orderRecord); // Append new order record to dataPenjualan
    }

    public static void main(String[] args) {
        MainApp myFrame = new MainApp();
    }
}