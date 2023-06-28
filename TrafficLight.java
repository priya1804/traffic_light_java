import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class MainJFrame extends JFrame {
	JFrame actualWindow;
	JPanel messageContainer, lightsContainer;

	ButtonGroup btnGroup;
	JRadioButton rbRed, rbYellow, rbGreen;

	public MainJFrame() {

		actualWindow = new JFrame("Traffic Lights");
		messageContainer = new JPanel();
		lightsContainer = new JPanel();
		btnGroup = new ButtonGroup();
		rbRed = new JRadioButton("Red");
		rbYellow = new JRadioButton("Yellow");
		rbGreen = new JRadioButton("Green");

		actualWindow.setLayout(new GridLayout(2, 1));

		btnGroup.add(rbRed);
		btnGroup.add(rbYellow);
		btnGroup.add(rbGreen);

		lightsContainer.add(rbRed);
		lightsContainer.add(rbYellow);
		lightsContainer.add(rbGreen);

		rbRed.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			System.out.println("stop");

		}
		});

		rbYellow.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("ready");

			}
		});

		rbGreen.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("go");
		}
		});

		actualWindow.add(messageContainer);
		actualWindow.add(lightsContainer);

		actualWindow.setSize(300, 200);
		actualWindow.setVisible(true);
	}


}

public class TrafficLight {


	public static void main(String[] args) {
		new MainJFrame();
	}


}