import java.util.Scanner;
public class ZavadskayaElenaDmitrievnaGame extends Player {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Введите: вверх, вниз, влево, вправо или завершить игру.");
    String command = scanner.nextLine();

    while (command != "завершить игру") {
        if (true) {
            if (command == "вверх") {
                moveUp();
            } else {
                if (command == "вниз") {
                    moveDown();
                } else {
                    if (command == "влево") {
                        moveLeft();
                    } else {
                        if (command == "вправо") {
                            moveRight();
                        } else {
                            System.out.println("Вы ввели несуществующую команду.");
                            System.out.println("Введите: вверх, вниз, влево или вправо.");

                            }
                        }
                    }
                }
            }
        }


        Map map = new Map();
                                             // Должен содержаться объект Map.
                                             /* Реализация должна содержать цикл,
                                                обрабатывающий команды игрока и выводящий на экран текущее состояние игры. */
                                             // В качестве визуального представления объектов использовать их getSymbol.
                                             /* К числу команд относятся команды
                                                перемещения персонажа по карте в четырех направлениях
                                                и команда завершения игры. */
                                             /* Возможность переместиться в клетку должна проверяться с помощью
                                                проверки isWalkable соответствующей клетки карты. */


}
