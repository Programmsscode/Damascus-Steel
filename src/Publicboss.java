

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;



import java.util.Random;
public class Publicboss {
static int suchet;

	public static void main(String[] args) throws IOException {
		JOptionPane.showMessageDialog(null, "░▐█▀█▄─░▄█▀▄─▒▐██▄▒▄██▌─░▄█▀▄─▒▄█▀▀█░▐█▀█▒█▒█▒▄█▀▀█     ▒▄█▀▀█▒█░░░▄░░▒█▒▐█▀▀█▌▒▐█▀▀▄░▐█▀█▄\n" + "░▐█▌▐█░▐█▄▄▐█░▒█░▒█░▒█░░▐█▄▄▐█▒▀▀█▄▄░▐█──▒█▒█▒▀▀█▄▄     ▒▀▀█▄▄▒█░░▒█░░▒█▒▐█▄▒█▌▒▐█▒▐█░▐█▌▐█\n" + "░▐█▄█▀░▐█─░▐█▒▐█░░░░▒█▌░▐█─░▐█▒█▄▄█▀░▐█▄█▒▀▄▀▒█▄▄█▀     ▒█▄▄█▀░▒▀▄▀▒▀▄▀░▒▐██▄█▌▒▐█▀▄▄░▐█▄█▀\n" + "\n", "", JOptionPane.PLAIN_MESSAGE);
		interfaseg chapter = new interfaseg();
		chapter.setVisible(true);


	}


	public static void cat(){

		Gladiator player = new Gladiator() ;

		Gladiator enemy = new Gladiator() ;


		// список гладиаторов - врагов
		ArrayList<Gladiator> enemies = new ArrayList<>();
		//вам нужно три врага, поэтому делаем три раза
		for (int i = 0; i < 3; i++) {
			switch ((int) (Math.random() * 3)) {
				case 0:
					enemies.add(new Retiariuse("Lazy"));
					break;
				case 1:
					enemies.add(new Secutore("Pupil"));
					break;
				//в случае 2 и 3 не Ретиарий и Секутор, а два Ваших класса
				case 2:
					enemies.add(new Spearman("Solve"));
					break;
				case 3:
					enemies.add(new Secutore("Yourself"));
					break;
			}
		}
		// Ну дальше можете аналогично случайно выбрать по сетке с каким гладиатором биться
		// а можно не запариваться и просто сражаться со вторым.
		// Далее по тексту обращаетесь не к переменной enemy, а к элементу списка
		// enemies.get(i), где i - номер врага


		//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String input1 = "";
		String input2 = "";
		Boolean flag = true; // защита от неправильного ввода


		JOptionPane.showMessageDialog(null, "Бой!", "", JOptionPane.PLAIN_MESSAGE);
		while (flag) {
			input1 =
					JOptionPane.showInputDialog("░░░░░░░░░░░░░░░░░░\n" + "░░░░▓▓▀▀██████▓▄▒▒░░░\n" + "░░░▀░░░░░░▀▀▀████▄▒░░░\n" + "░░▌░░░░░░░░░░░▀███▓▒░░\n" + "░▌░░░░░▄▄▄░░░░░░▐█▓▒░░░\n" + "░▄▓▀█▌░▀██▀▒▄░░░▐▓▓▓▒░\n" + "░█▌░░░░░▀▒░░░▀░░░▐▓▒▒░░\n" + "░▌▀▒▄▄░░░░░░░░░░░░░▄▒░░\n" + "░▒▄█████▌▒▒░░░░░░░▒▌▒░\n" + "░░▓█████▄▒░▒▒▒░░░░░▐░\n" + "░░▒▀▓▒░░░░░░░▒▒░▒▒▒▄░\n" + "░░▓▒▒▒░░░░░░▒▒▒▒▒░▓░░\n" + "░░████▄▄▄▄▓▓▓▒▒░░▐░░\n" + "░░░▀██████▓▒▒▒▒▒░▐░\n" + "\n" + "Выберите экиперовку : Мечника - 1,Лучника - 2,Копейщика - 3");
			switch (input1) {
				case "2":
					player = new Retiariuse("Игрок Лучник");
					int randomNumber3 = new Random().nextInt(3)+1;
					if(randomNumber3 == 2){
						enemy = new Spearman("Враг Копейщик");}else {
						enemy = new Secutore("Враг Мечник");


					}
					flag = false;
					break;
				case "1":
					player = new Secutore("Игрок Мечник");

					int randomNumber = new Random().nextInt(3)+1;
					if(randomNumber == 2){
						enemy = new Retiariuse("Враг Лучник");}else {
						enemy = new Spearman("Враг Копейщик");


					}
					flag = false;
					break;
				case "3":

					player = new Spearman("Игрок Копейщик");
					int randomNumber2 = new Random().nextInt(3)+1;
					if(randomNumber2 == 2){
					enemy = new Retiariuse("Враг Лучник");}else {
						enemy = new Secutore("Враг Мечник");


					}
					flag = false;
					break;

				default:
					JOptionPane.showMessageDialog(null, "░▐█▀▀▒▐█▀▀▄▒▐█▀▀▄▒▐█▀▀█▌▒▐█▀▀▄\n" + "   ░▐█▀▀▒▐█▒▐█▒▐█▒▐█▒▐█▄▒█▌▒▐█▒▐█\n" + "░▐█▄▄▒▐█▀▄▄▒▐█▀▄▄▒▐██▄█▌▒▐█▀▄▄\n" + "\n" + "Ошибка ввода", "", JOptionPane.PLAIN_MESSAGE);


					flag = true;
					JOptionPane.showMessageDialog(null, "░░░░░░░░░░░░░░░░░░\n" + "░░░░▓▓▀▀██████▓▄▒▒░░░\n" + "░░░▀░░░░░░▀▀▀████▄▒░░░\n" + "░░▌░░░░░░░░░░░▀███▓▒░░\n" + "░▌░░░░░▄▄▄░░░░░░▐█▓▒░░░\n" + "░▄▓▀█▌░▀██▀▒▄░░░▐▓▓▓▒░\n" + "░█▌░░░░░▀▒░░░▀░░░▐▓▒▒░░\n" + "░▌▀▒▄▄░░░░░░░░░░░░░▄▒░░\n" + "░▒▄█████▌▒▒░░░░░░░▒▌▒░\n" + "░░▓█████▄▒░▒▒▒░░░░░▐░\n" + "░░▒▀▓▒░░░░░░░▒▒░▒▒▒▄░\n" + "░░▓▒▒▒░░░░░░▒▒▒▒▒░▓░░\n" + "░░████▄▄▄▄▓▓▓▒▒░░▐░░\n" + "░░░▀██████▓▒▒▒▒▒░▐░\n" + "\n" + "Выберите экиперовку : Мечника - 1,Лучника - 2,Копейщика - 3", "", JOptionPane.PLAIN_MESSAGE);
			}
		}

		// выбрали гладиатора, начали бой!
		int round = 1;
		while (true) {
			// атакуем
			// если остались усуперудары
			if (player.getUltimates() > 0) {

				flag = true;
				while (flag) {

					input1 =
							JOptionPane.showInputDialog("░░░░░░░░░░░░░░░░░░\n" + "░░░░▓▓▀▀██████▓▄▒▒░░░\n" + "░░░▀░░░░░░▀▀▀████▄▒░░░\n" + "░░▌░░░░░░░░░░░▀███▓▒░░\n" + "░▌░░░░░▄▄▄░░░░░░▐█▓▒░░░\n" + "░▄▓▀█▌░▀██▀▒▄░░░▐▓▓▓▒░\n" + "░█▌░░░░░▀▒░░░▀░░░▐▓▒▒░░\n" + "░▌▀▒▄▄░░░░░░░░░░░░░▄▒░░\n" + "░▒▄█████▌▒▒░░░░░░░▒▌▒░\n" + "░░▓█████▄▒░▒▒▒░░░░░▐░\n" + "░░▒▀▓▒░░░░░░░▒▒░▒▒▒▄░\n" + "░░▓▒▒▒░░░░░░▒▒▒▒▒░▓░░\n" + "░░████▄▄▄▄▓▓▓▒▒░░▐░░\n" + "░░░▀██████▓▒▒▒▒▒░▐░\n" + "\n" + "Выберите куда бить: 1 - голова, 2 - туловище, 3 - пах, 4 - ноги, 5 - суперудар:");
					switch (input1) {
						case "1":
						case "2":
						case "3":
						case "4":
							flag = false;
							break;
						case "5":
							flag = false;
							player.ultimatesLeft--;
							break;
						default:
							JOptionPane.showMessageDialog(null, "Ошибка ввода", "", JOptionPane.PLAIN_MESSAGE);
							JOptionPane.showMessageDialog(null, "░░░░░░░░░░░░░░░░░░\n" + "░░░░▓▓▀▀██████▓▄▒▒░░░\n" + "░░░▀░░░░░░▀▀▀████▄▒░░░\n" + "░░▌░░░░░░░░░░░▀███▓▒░░\n" + "░▌░░░░░▄▄▄░░░░░░▐█▓▒░░░\n" + "░▄▓▀█▌░▀██▀▒▄░░░▐▓▓▓▒░\n" + "░█▌░░░░░▀▒░░░▀░░░▐▓▒▒░░\n" + "░▌▀▒▄▄░░░░░░░░░░░░░▄▒░░\n" + "░▒▄█████▌▒▒░░░░░░░▒▌▒░\n" + "░░▓█████▄▒░▒▒▒░░░░░▐░\n" + "░░▒▀▓▒░░░░░░░▒▒░▒▒▒▄░\n" + "░░▓▒▒▒░░░░░░▒▒▒▒▒░▓░░\n" + "░░████▄▄▄▄▓▓▓▒▒░░▐░░\n" + "░░░▀██████▓▒▒▒▒▒░▐░\n" + "\n" + "Выберите куда бить: 1 - голова, 2 - туловище, 3 - пах, 4 - ноги, 5 - суперудар", "", JOptionPane.PLAIN_MESSAGE);
							flag = true;
					}
				}
			}
			// если суперударов не осталось
			else {

				flag = true;
				while (flag) {
					input1 =
							JOptionPane.showInputDialog("░░░░░░░░░░░░░░░░░░\n" + "░░░░▓▓▀▀██████▓▄▒▒░░░\n" + "░░░▀░░░░░░▀▀▀████▄▒░░░\n" + "░░▌░░░░░░░░░░░▀███▓▒░░\n" + "░▌░░░░░▄▄▄░░░░░░▐█▓▒░░░\n" + "░▄▓▀█▌░▀██▀▒▄░░░▐▓▓▓▒░\n" + "░█▌░░░░░▀▒░░░▀░░░▐▓▒▒░░\n" + "░▌▀▒▄▄░░░░░░░░░░░░░▄▒░░\n" + "░▒▄█████▌▒▒░░░░░░░▒▌▒░\n" + "░░▓█████▄▒░▒▒▒░░░░░▐░\n" + "░░▒▀▓▒░░░░░░░▒▒░▒▒▒▄░\n" + "░░▓▒▒▒░░░░░░▒▒▒▒▒░▓░░\n" + "░░████▄▄▄▄▓▓▓▒▒░░▐░░\n" + "░░░▀██████▓▒▒▒▒▒░▐░\n" + "\n" + "Выберите куда бить: 1 - голова, 2 - туловище, 3 - пах, 4 - ноги,5 - суперудар :");
					switch (input1) {
						case "1":
						case "2":
						case "3":
						case "4":
						case "5":
							flag = false;
							break;
						default:
							JOptionPane.showMessageDialog(null, "░▐█▀▀▒▐█▀▀▄▒▐█▀▀▄▒▐█▀▀█▌▒▐█▀▀▄\n" + "░▐█▀▀▒▐█▒▐█▒▐█▒▐█▒▐█▄▒█▌▒▐█▒▐█\n" + "░▐█▄▄▒▐█▀▄▄▒▐█▀▄▄▒▐██▄█▌▒▐█▀▄▄\n" + "\n" + "Ошибка ввода", "", JOptionPane.PLAIN_MESSAGE);
							JOptionPane.showMessageDialog(null, "░░░░░░░░░░░░░░░░░░\n" + "░░░░▓▓▀▀██████▓▄▒▒░░░\n" + "░░░▀░░░░░░▀▀▀████▄▒░░░\n" + "░░▌░░░░░░░░░░░▀███▓▒░░\n" + "░▌░░░░░▄▄▄░░░░░░▐█▓▒░░░\n" + "░▄▓▀█▌░▀██▀▒▄░░░▐▓▓▓▒░\n" + "░█▌░░░░░▀▒░░░▀░░░▐▓▒▒░░\n" + "░▌▀▒▄▄░░░░░░░░░░░░░▄▒░░\n" + "░▒▄█████▌▒▒░░░░░░░▒▌▒░\n" + "░░▓█████▄▒░▒▒▒░░░░░▐░\n" + "░░▒▀▓▒░░░░░░░▒▒░▒▒▒▄░\n" + "░░▓▒▒▒░░░░░░▒▒▒▒▒░▓░░\n" + "░░████▄▄▄▄▓▓▓▒▒░░▐░░\n" + "░░░▀██████▓▒▒▒▒▒░▐░\n" + "\n" + "Выберите куда бить: 1 - голова, 2 - туловище, 3 - пах, 4 - ноги, 5 - суперудар", "", JOptionPane.PLAIN_MESSAGE);
							flag = true;
					}
				}
			}
			// защищаемся

			flag = true;
			while (flag) {
				input2 =
						JOptionPane.showInputDialog("████████████████████████████████████████\n" + "██████████████████▀▀▀▀██████████████████\n" + "███████████████▀▀░░░░░░▀▀███████████████\n" + "██████████████░░░░░░░░░░░░██████████████\n" + "████████████▀░░░░░░░░░░░░░░▀████████████\n" + "███████████░░█▄░░░░░░░░░░▄█░░███████████\n" + "██▄░░▀█████▄░░▀▀█▄▄░░▄▄█▀▀░░▄█████▀░░▄██\n" + "████▄░░░██░██▄▄▄░░░░░░░░▄▄▄██░██░░░▄████\n" + "█████▄░░▀█░██░██▀██░░██▀██░██░█▀░░▄█████\n" + "███████░▄█▀██▀▀▀██▀░░▀██▀▀▀██▀█▄░███████\n" + "████████▀░░░░░░░░▀█░░█▀░░░░░░░░▀████████\n" + "██████████▄▄▄░░▄█░████░█▄░░▄▄▄██████████\n" + "█████████▄▀█▀▀███▄░██░▄███▀▀█▀▄█████████\n" + "██████████▄▀███░█▀▀██▀▀█░███▀▄██████████\n" + "███████████▄░▀▀███░██░███▀▀░▄███████████\n" + "████████████▄░░░▀█▄██▄█▀░░░▄████████████\n" + "██████████████▄░░░▀██▀░░░▄██████████████\n" + "████████████████▄░░░░░░▄████████████████\n" + "██████████████████▄▄▄▄██████████████████\n" + "████████████████████████████████████████\n" + "\n" + "Выберите что защищать: 1 - голова, 2 - туловище, 3 - пах, 4 - ноги:");
				switch (input2) {
					case "1":
					case "2":
					case "3":
					case "4":
						flag = false;
						break;
					default:
						JOptionPane.showMessageDialog(null, "░▐█▀▀▒▐█▀▀▄▒▐█▀▀▄▒▐█▀▀█▌▒▐█▀▀▄\n" + "░▐█▀▀▒▐█▒▐█▒▐█▒▐█▒▐█▄▒█▌▒▐█▒▐█\n" + "░▐█▄▄▒▐█▀▄▄▒▐█▀▄▄▒▐██▄█▌▒▐█▀▄▄\n" + "Ошибка ввода", "", JOptionPane.PLAIN_MESSAGE);
						JOptionPane.showMessageDialog(null, "░▐█▀▀▒▐█▀▀▄▒▐█▀▀▄▒▐█▀▀█▌▒▐█▀▀▄\n" + "░▐█▀▀▒▐█▒▐█▒▐█▒▐█▒▐█▄▒█▌▒▐█▒▐█\n" + "░▐█▄▄▒▐█▀▄▄▒▐█▀▄▄▒▐██▄█▌▒▐█▀▄▄\n" + "\n" + "Выберите куда бить: 1 - голова, 2 - туловище, 3 - пах, 4 - ноги, 5 - суперудар", "", JOptionPane.PLAIN_MESSAGE);
						flag = true;
				}
			}

			player.setTactics(Integer.parseInt(input1), Integer.parseInt(input2));

			//суперудар у противника
			if (enemy.ultimatesLeft > 0) {
				enemy.setTactics((int) (Math.random() * 5 + 1), (int) (Math.random() * 4 + 1));
			} else enemy.setTactics((int) (Math.random() * 4 + 1), (int) (Math.random() * 4 + 1));
			if (player.attacks == 5) {
				if (!player.special(enemy)) {
					JOptionPane.showMessageDialog(null, "████████████████████████████████████████\n" + "███████████▀███▀▀▀▀▀▀▀▀▀▀███▀███████████\n" + "██████████░▄█▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▄░██████████\n" + "██████████▄░▀░░░░░░░░░░░░░░▀░▄██████████\n" + "████████████▄▄▄░░░░░░░░░░▄▄▄████████████\n" + "███████████████▄░░░░░░░░▄███████████████\n" + "█████████████████▄░░░░▄█████████████████\n" + "██████████████████░░░░██████████████████\n" + "█████████████████▀░░░░▀█████████████████\n" + "████████████████▀░░░░░░▀████████████████\n" + "███████████████▄▄▄▄▄▄▄▄▄▄███████████████\n" + "████▀░░░░▀█████▀▀▀████▀▀▀█████▀░░░░▀████\n" + "████░░░░░░▀███▀░░▄████▄░░▀███▀░░░░░░████\n" + "████░░░░░░░██▀░░▄██████▄░░▀██░░░░░░░████\n" + "████▄░░░░░▄█░░░▄████████▄░░░█▄░░░░░▄████\n" + "██████▄▄▄███▄░▄██████████▄░▄███▄▄▄██████\n" + "██▀░░░▀▀▀░░░████████████████░░░▀▀▀░░░▀██\n" + "██░░░░░░░░░░░██████████████░░░░░░░░░░░██\n" + "██░░░░░░░░░░░░████████████░░░░░░░░░░░░██\n" + "████████████████████████████████████████\n" + "█░███░█░░░██░░░░█░░░░█░░░██░░░█░██░█░░░█\n" + "█░███░█░████░██░█░██░█░█████░██░██░█░███\n" + "█░█░█░█░░░██░░░░█░░░░█░░░███░██░░░░█░░░█\n" + "█░░░░░█░████░██░█░█░██░█████░██░██░█░███\n" + "██░█░██░░░██░██░█░█░██░░░███░██░██░█░░░█\n" + "████████████████████████████████████████\n" + "█░░░█░█░█░░░█░███░█░░░█░░░█░░░█░██░█░░░█\n" + "█░█░█░█░█░█░█░░█░░█░█░██░██░█░█░░█░█░███\n" + "█░███░░░█░░░█░█░█░█░░░██░██░█░█░█░░█░░░█\n" + "█░█░█░█░█░█░█░███░█░████░██░█░█░██░███░█\n" + "█░░░█░█░█░█░█░███░█░███░░░█░░░█░██░█░░░█\n" + "████████████████████████████████████████\n" + "\n" + "Вы победили", "", JOptionPane.PLAIN_MESSAGE);
suchet = 1;
					break;
				}
			} else if (!player.attack(enemy)) {
				JOptionPane.showMessageDialog(null, "████████████████████████████████████████\n" + "███████████▀███▀▀▀▀▀▀▀▀▀▀███▀███████████\n" + "██████████░▄█▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▄░██████████\n" + "██████████▄░▀░░░░░░░░░░░░░░▀░▄██████████\n" + "████████████▄▄▄░░░░░░░░░░▄▄▄████████████\n" + "███████████████▄░░░░░░░░▄███████████████\n" + "█████████████████▄░░░░▄█████████████████\n" + "██████████████████░░░░██████████████████\n" + "█████████████████▀░░░░▀█████████████████\n" + "████████████████▀░░░░░░▀████████████████\n" + "███████████████▄▄▄▄▄▄▄▄▄▄███████████████\n" + "████▀░░░░▀█████▀▀▀████▀▀▀█████▀░░░░▀████\n" + "████░░░░░░▀███▀░░▄████▄░░▀███▀░░░░░░████\n" + "████░░░░░░░██▀░░▄██████▄░░▀██░░░░░░░████\n" + "████▄░░░░░▄█░░░▄████████▄░░░█▄░░░░░▄████\n" + "██████▄▄▄███▄░▄██████████▄░▄███▄▄▄██████\n" + "██▀░░░▀▀▀░░░████████████████░░░▀▀▀░░░▀██\n" + "██░░░░░░░░░░░██████████████░░░░░░░░░░░██\n" + "██░░░░░░░░░░░░████████████░░░░░░░░░░░░██\n" + "████████████████████████████████████████\n" + "█░███░█░░░██░░░░█░░░░█░░░██░░░█░██░█░░░█\n" + "█░███░█░████░██░█░██░█░█████░██░██░█░███\n" + "█░█░█░█░░░██░░░░█░░░░█░░░███░██░░░░█░░░█\n" + "█░░░░░█░████░██░█░█░██░█████░██░██░█░███\n" + "██░█░██░░░██░██░█░█░██░░░███░██░██░█░░░█\n" + "████████████████████████████████████████\n" + "█░░░█░█░█░░░█░███░█░░░█░░░█░░░█░██░█░░░█\n" + "█░█░█░█░█░█░█░░█░░█░█░██░██░█░█░░█░█░███\n" + "█░███░░░█░░░█░█░█░█░░░██░██░█░█░█░░█░░░█\n" + "█░█░█░█░█░█░█░███░█░████░██░█░█░██░███░█\n" + "█░░░█░█░█░█░█░███░█░███░░░█░░░█░██░█░░░█\n" + "████████████████████████████████████████\n" + "\n" + "Вы победили", "", JOptionPane.PLAIN_MESSAGE);
				suchet = 1;
				break;

			}
			if (enemy.attacks == 5) {
				enemy.ultimatesLeft--;
				if (!enemy.special(player)) {
					JOptionPane.showMessageDialog(null, "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\n" + "██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼█┼┼┼██┼██┼┼┼\n" + "██┼┼┼▄▄▄┼██▄▄▄▄▄██┼██┼┼┼▀┼┼┼██┼██▀▀▀\n" + "██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██┼┼┼\n" + "███▄▄▄██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██▄▄▄\n" + "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\n" + "███▀▀▀███┼▀███┼┼██▀┼██▀▀▀┼██▀▀▀▀██▄┼\n" + "██┼┼┼┼┼██┼┼┼██┼┼██┼┼██┼┼┼┼██┼┼┼┼┼██┼\n" + "██┼┼┼┼┼██┼┼┼██┼┼██┼┼██▀▀▀┼██▄▄▄▄▄▀▀┼\n" + "██┼┼┼┼┼██┼┼┼██┼┼█▀┼┼██┼┼┼┼██┼┼┼┼┼██┼\n" + "███▄▄▄███┼┼┼─▀█▀┼┼─┼██▄▄▄┼██┼┼┼┼┼██▄\n" + "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\n" + "┼┼┼┼┼┼┼┼██┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼██┼┼┼┼┼┼┼┼┼\n" + "┼┼┼┼┼┼████▄┼┼┼▄▄▄▄▄▄▄┼┼┼▄████┼┼┼┼┼┼┼\n" + "┼┼┼┼┼┼┼┼┼▀▀█▄█████████▄█▀▀┼┼┼┼┼┼┼┼┼┼\n" + "┼┼┼┼┼┼┼┼┼┼┼█████████████┼┼┼┼┼┼┼┼┼┼┼┼\n" + "┼┼┼┼┼┼┼┼┼┼┼██▀▀▀███▀▀▀██┼┼┼┼┼┼┼┼┼┼┼┼\n" + "┼┼┼┼┼┼┼┼┼┼┼██┼┼┼███┼┼┼██┼┼┼┼┼┼┼┼┼┼┼┼\n" + "┼┼┼┼┼┼┼┼┼┼┼█████▀▄▀█████┼┼┼┼┼┼┼┼┼┼┼┼\n" + "┼┼┼┼┼┼┼┼┼┼┼┼███████████┼┼┼┼┼┼┼┼┼┼┼┼┼\n" + "┼┼┼┼┼┼┼┼▄▄▄██┼┼█▀█▀█┼┼██▄▄▄┼┼┼┼┼┼┼┼┼\n" + "┼┼┼┼┼┼┼┼▀▀██┼┼┼┼┼┼┼┼┼┼┼██▀▀┼┼┼┼┼┼┼┼┼\n" + "┼┼┼┼┼┼┼┼┼┼▀▀┼┼┼┼┼┼┼┼┼┼┼▀▀┼┼┼┼┼┼┼┼┼┼┼\n" + "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\n" + "\n" + "Вы проиграли, начните главу сначала", "", JOptionPane.PLAIN_MESSAGE);
				suchet = 2;
					break;

				}
			} else if (!enemy.attack(player)) {
				JOptionPane.showMessageDialog(null, "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\n" + "██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼█┼┼┼██┼██┼┼┼\n" + "██┼┼┼▄▄▄┼██▄▄▄▄▄██┼██┼┼┼▀┼┼┼██┼██▀▀▀\n" + "██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██┼┼┼\n" + "███▄▄▄██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██▄▄▄\n" + "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\n" + "███▀▀▀███┼▀███┼┼██▀┼██▀▀▀┼██▀▀▀▀██▄┼\n" + "██┼┼┼┼┼██┼┼┼██┼┼██┼┼██┼┼┼┼██┼┼┼┼┼██┼\n" + "██┼┼┼┼┼██┼┼┼██┼┼██┼┼██▀▀▀┼██▄▄▄▄▄▀▀┼\n" + "██┼┼┼┼┼██┼┼┼██┼┼█▀┼┼██┼┼┼┼██┼┼┼┼┼██┼\n" + "███▄▄▄███┼┼┼─▀█▀┼┼─┼██▄▄▄┼██┼┼┼┼┼██▄\n" + "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\n" + "┼┼┼┼┼┼┼┼██┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼██┼┼┼┼┼┼┼┼┼\n" + "┼┼┼┼┼┼████▄┼┼┼▄▄▄▄▄▄▄┼┼┼▄████┼┼┼┼┼┼┼\n" + "┼┼┼┼┼┼┼┼┼▀▀█▄█████████▄█▀▀┼┼┼┼┼┼┼┼┼┼\n" + "┼┼┼┼┼┼┼┼┼┼┼█████████████┼┼┼┼┼┼┼┼┼┼┼┼\n" + "┼┼┼┼┼┼┼┼┼┼┼██▀▀▀███▀▀▀██┼┼┼┼┼┼┼┼┼┼┼┼\n" + "┼┼┼┼┼┼┼┼┼┼┼██┼┼┼███┼┼┼██┼┼┼┼┼┼┼┼┼┼┼┼\n" + "┼┼┼┼┼┼┼┼┼┼┼█████▀▄▀█████┼┼┼┼┼┼┼┼┼┼┼┼\n" + "┼┼┼┼┼┼┼┼┼┼┼┼███████████┼┼┼┼┼┼┼┼┼┼┼┼┼\n" + "┼┼┼┼┼┼┼┼▄▄▄██┼┼█▀█▀█┼┼██▄▄▄┼┼┼┼┼┼┼┼┼\n" + "┼┼┼┼┼┼┼┼▀▀██┼┼┼┼┼┼┼┼┼┼┼██▀▀┼┼┼┼┼┼┼┼┼\n" + "┼┼┼┼┼┼┼┼┼┼▀▀┼┼┼┼┼┼┼┼┼┼┼▀▀┼┼┼┼┼┼┼┼┼┼┼\n" + "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\n" + "\n" + "Вы проиграли,начните главу сначала ","",JOptionPane.PLAIN_MESSAGE);
suchet = 2;
				break;


				//Боевка


			}

		}
	}

}



//Ezhel Andrey
