import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DigitalClock extends JFrame {
    // Label to display the time
    private JLabel clockLabel;

    // Constructor to set up the clock interface
    public DigitalClock() {
        // Set the title for the window
        setTitle("Digital Clock");

        // Set the size of the window
        setSize(400, 200);

        // Set the layout of the window
        setLayout(new BorderLayout());

        // Create a label to display the time
        clockLabel = new JLabel();
        clockLabel.setHorizontalAlignment(SwingConstants.CENTER);
        clockLabel.setFont(new Font("Verdana", Font.BOLD, 40));
        add(clockLabel, BorderLayout.CENTER);

        // Set the window to close when the user clicks the close button
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the window visible
        setVisible(true);

        // Start the clock
        updateTime();
    }

    // Method to update the time every second
    public void updateTime() {
        // Timer to update the clock every second (1000 milliseconds)
        Timer timer = new Timer(1000, e -> {
            // Get the current time
            String currentTime = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());

            // Update the label to show the current time
            clockLabel.setText(currentTime);
        });

        // Start the timer
        timer.start();
    }

    public static void main(String[] args) {
        // Create an instance of the digital clock
        new DigitalClock();
    }
}
