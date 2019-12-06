import java.util.Scanner;



public class Television {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		System.out.println("TV 리모컨");

		MyTv mt = new MyTv();



		mt.turnOnOff();



		System.out.println("1. Channel Up");

		System.out.println("2. Channel Down");

		System.out.println("3. Volume Up");

		System.out.println("4. Volume Down");



		while (true) {

			Scanner scan = new Scanner(System.in);



			int temp = scan.nextInt();



			switch (temp) {

			case 1:

				mt.channelUp();

				break;

			case 2:

				mt.channelDown();

				break;

			case 3:

				mt.volumeDown();

				break;

			case 4:

				mt.volumeUp();

				break;

			default:

				break;

			}

			printCurTvState(mt.channel, mt.volume);

		}

	}



	static void printCurTvState(int c, int v) {

		System.out.println("Ch : " + c + ", Vol : " + v);

	}

}



class MyTv {



	boolean isPowerOn;

	int channel;

	int volume;



	final int MAX_VOLUME = 100;

	final int MIN_VOLUME = 0;

	final int MAX_CHANNEL = 100;

	final int MIN_CHANNEL = 1;



	MyTv() {

		channel = 50;

		volume = 24;

	}



	void turnOnOff() {

		if (isPowerOn)

			isPowerOn = false;

		else

			isPowerOn = true;

	}



	void volumeUp() {

		if (volume < MAX_VOLUME)

			volume++;

	}



	void volumeDown() {

		if (volume > MIN_VOLUME)

			volume--;

	}



	void channelUp() {

		if (channel < MAX_CHANNEL)

			channel++;

	}



	void channelDown() {

		if (channel > MIN_CHANNEL)

			channel--;

	}

}



