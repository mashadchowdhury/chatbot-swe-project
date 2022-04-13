package ChatBot;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatBot extends JFrame implements ActionListener {
	static JTextArea area = new JTextArea();
	JTextField field = new JTextField();
	JScrollPane sp;
	JButton send;
	LocalTime time = LocalTime.now();
	LocalDate date = LocalDate.now();
	Random random = new Random();

	public ChatBot(String title) {
		super(title);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setResizable(false);
		getContentPane().setBackground(Color.cyan);
		field = new JTextField();
		send = new JButton(">");
		send.setFont(new Font("Serif", Font.BOLD, 25));
		send.setBackground(Color.white);
		send.setBounds(735, 520, 50, 35);
		add(send);
		// For Text area
		area.setEditable(false);
		area.setBackground(Color.white);
		add(area);
		area.setFont(new Font("Serif", Font.PLAIN, 20));
		// scrollbar
		sp = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		sp.setBounds(10, 20, 775, 470);
		add(sp);

		// For TextField
		field.setSize(725, 35);
		field.setLocation(10, 520);
		field.setForeground(Color.black);
		field.setFont(new Font("Serif", Font.BOLD, 25));
		add(field);

		send.addActionListener(this);
		getRootPane().setDefaultButton(send);

	}

	public void actionPerformed(ActionEvent e) {
		String message = field.getText().toLowerCase();

		area.append("You : " + field.getText() + "\n");
		field.setText("");
		Socket sock = new Socket();

		if (message.contains("how are you")) {
			int num = random.nextInt(3);
			if (num == 0) {
				bot("I'm fine !,What about you ? ");
			} else if (num == 1) {
				bot("I am good , thanks for asking !");
			} else {
				bot("I am great ,thanks for asking !");
			}

		} else if (message.contains("you") && (message.contains("smart") || message.contains("good"))) {
			bot("Thank you !");
		} else if (message.contains("welcome")) {
			bot("You are so polite.How can i help you ?");
		}

		else if (message.contains("good morning")) {

			bot("Good morning youuu, How can I help you !");

		} else if (message.contains("good night")) {

			bot("Good night,Have a nice dreams !");

		} else if (message.contains("good evening")) {

			bot("Good Evening,How can I help you ...!");

		} else if (message.contains("good") && message.contains("noon")) {

			bot("Good Afternoon,How can I help you ...!");

		}

		else if (message.contains("free this week") || message.contains("free this weekend")) {
			bot("Yes do you wanna go out for dinner");
		} else if (message.contains("Yes, we can go for dinner") || message.contains("dinner is good option")) {
			bot("What kind of food do you like?");
		} else if (message.contains("Indian") || message.contains("Chinese food")) {
			bot("Do you have a favourite restaurant?");
		} else if (message.contains("Indian palace") || message.contains("wok box") || message.contains("veerji")) {
			bot("Sure i can make a reservation,When do you wanna go Saturday or Sunday ?");
		} else if (message.contains("tomorrow") || message.contains("Sunday")) {
			bot("Sounds good, Do you wanna watch a movie too ?");
		} else if (message.contains("Not free") || message.contains("No dinner")) {
			bot("Do you wanna go for a movie?");
		} else if (message.contains("Yes") && message.contains("movie")
				|| message.contains("yeah") && message.contains("movie")) {
			bot("What Kind of Movie do you like?");
		} else if (message.contains("any") || message.contains("no preferance")) {
			int num = random.nextInt(3);
			if (num == 0) {
				bot("Do you wanna watch action movie ? ");
			} else if (num == 1) {
				bot("Do you wanna watch romantic Movie ?");
			} else if (num == 2) {
				bot("Do you wanna watch adventure movie");
			}
		} else if (message.contains("Yes Action") || message.contains("Adventure")) {
			bot("we can o for either xyz or abc on sunday?");
		} else if (message.contains("Yes Romantic")) {
			bot("We can watch jkl on sunday");
		} else if (message.contains("xyz") || message.contains("abc") || message.contains("jkl")) {
			bot("what time do you prefer for movie");
		} else if (message.contains("movie in the morning") || message.contains("movie in the evening")
				|| message.contains("movie in the night")) {
			bot("Perfect , Do you want to book the tickets?");
		} else if (message.contains("Can you book?") || message.contains("you book")
				|| message.contains("I cant book")) {
			bot("Sure I can Book the ticket for you");
		} else if (message.contains("Can you send the tickets") || message.contains("message details")
				|| message.contains("booking details")) {
			bot("Sure I can send you the ticket details, Where should i Send");
		} else if (message.contains("email") || message.contains("Phone")) {
			bot("Can you share your number or email");
		} else if (message.contains("this is my number") || message.contains(" here you go")
				|| message.contains("My email")) {
			bot("I have sent you the details, Please confirm if recieved");
		} else if (message.contains("yes , Recieved") || message.contains("I have recieved")) {
			bot("I am glad , Hope to see you there");
		} else if (message.contains("not recieved") || message.contains("did not get it")) {
			bot("I will try to send it again , Please check now and reply got it when you recieve it ");
		} else if (message.contains("Got it")) {
			bot("Thats good, Hope to see you there");
		}

		else if (message.contains("on time") || message.contains("see you")) {
			bot("I will be there on time , See you then");
		}

		else if (message.contains("hi") && message.charAt(0) == 'h' || message.contains("hello")
				|| message.contains("hey")) {

			int num = random.nextInt(3);
			if (num == 0) {
				bot("Hii");
			} else if (num == 1) {
				bot("Hello");
			} else if (num == 2) {
				bot("Heyy");
			} else if (num == 3) {
				bot("hello buddy");
			}
		} else if (message.contains("by")) {
			bot("Byy,See you soon ..!");
		} else if (message.contains("i am good") || message.contains("i am great")
				|| message.contains("i am ") && message.contains("fine")) {

			bot("Good to hear.I am doing great too. How Can I help you?");
		} else if (message.contains("thank")) {
			int num = random.nextInt(3);
			if (num == 0) {
				bot("Welcome..");
			} else if (num == 1) {
				bot("My plesure");
			} else if (num == 2) {
				bot("Happy to help");
			} else if (num == 3) {
				bot("That's why i'm here for..");
			}
		} else if (message.contains("what") || message.contains(" your name")) {
			if (message.contains("your")) {
				bot("I'm Bot...");
			}
			if (message.contains("my name")) {
				bot("Your name is unkown yet");
			}
		} else if (message.contains("change")) {
			bot("Sorry,I can't change anything...");
		} else if (message.contains("time")) {

			String ctime = new String();
			if (time.getHour() > 12) {
				int hour = time.getHour() - 12;
				ctime = ctime + hour + ":" + time.getMinute() + ":" + time.getSecond() + " PM";
			}

			else {

				ctime = ctime + time.getHour() + ":" + time.getMinute() + ":" + time.getSecond() + " AM";
			}
			bot(ctime);

		}

		else if (message.contains("clear") && (message.contains("screen") || message.contains("chat"))) {
			bot("wait a few second...");
			area.setText("");
		} else {
			try {
				int num = random.nextInt(5);
				if (num == 0) {
					bot("Sorry ,I can't understand you !");
				} else if (num == 1) {
					bot("That is off topic ");
				} else if (num == 2) {
					bot("My apologies...I don't know what you are saying ");
				} else if (num == 3) {
					bot("My apologies...I don't understand ");
				} else if (num == 4) {
					bot("Come again please ");
				}

			} catch (Exception eee) {

				try {
					URL url = new URL("https://google.co.in");
					URLConnection connection = url.openConnection();
					connection.connect();
					bot("Here some results for you ...");
					java.awt.Desktop.getDesktop().browse(java.net.URI.create("http://www.google.com/search?hl=en&q="
							+ message.replace(" ", "+") + "&btnG=Google+Search"));

				} catch (Exception ee) {
					bot("Connect with internet connection for get better results...");
				}
			}
		}

	}

	public static void bot(String message) {
		area.append("Bot : " + message + "\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChatBot cb = new ChatBot("Chat Bot");
		cb.setSize(800, 605);
		cb.setLocation(50, 50);

	}

}