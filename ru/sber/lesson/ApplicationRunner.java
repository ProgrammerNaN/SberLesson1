package ru.sber.lesson;

public class ApplicationRunner {
	public static void main(String[] args) {
		Speaker speaker = new Speaker();
		for (int i = 0; i < args.length; i++) {
			speaker.speak(args[i]);
		}
	}
}