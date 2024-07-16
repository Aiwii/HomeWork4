public class Main {
    public static void main(String[] args) {
//Task-1
        System.out.println("Task-1");

        int age = 18;
        if (age >= 18) {
            System.out.println("Возраст человека равен " + age + ", он совершеннолетний.");
        } else {
            System.out.println("Возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подождать.");
        }

//Task-2
        System.out.println("Task-2");
        int temp = 5;
        if (temp >= 5) {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки.");
        } else {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку.");
        }
//Task-3
        System.out.println("Task-3");
        int speed = 60;
        if (speed <= 60) {
            System.out.println("Cкорость " + speed + "км/ч" + ", можно ездить спокойно.");
        } else {
            System.out.println("Скорость " + speed + "км/ч" + ", придется заплатить штраф.");
        }
//Task-4
        System.out.println("Task-4");
        int age1 = 27;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Возраст человека равен " + age1 + ", ему нужно ходить в детский сад.");
        } else if (age1 >= 7 && age1 <= 17) {
            System.out.println("Возраст человека равен " + age1 + ", ему нужно ходить в школу.");
        } else if (age1 >=  18 && age1 <= 24) {
            System.out.println("Возраст человека равен " + age1 +", его место в университете.");
        } else if (age1 > 24) {
            System.out.println("Человеку больше 24, ему пора ходить на работу.");
        }
//Task-5
System.out.println("Task-5");
        int age2 = 12;
        if (age2 < 5) {
            System.out.println("Возраст ребенка равен " + age2 + ", он не может кататься на аттракционе.");
        } else if (age2 >= 5 && age2 < 14) {
            System.out.println("Возраст ребенка равен " + age2 + ", он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else if (age2 >=  14) {
            System.out.println("Возраст ребенка равен " + age2 + ", он может кататься без сопровождения взрослого.");
        }
//Task-6
System.out.println("Task-6");

        int yourPlace = 103;
        int sittingPlace = 60;
        int сapacity = 102;
        //На всякий случай вычислил кол-во стоячих мест.
        int standingPlace = (сapacity - sittingPlace);
        if (yourPlace >= 1 && yourPlace <= 60) {
            System.out.println("Ваше место равно " +yourPlace +", оно сидячее приятной поездки.");
        } else if (yourPlace > 60 && yourPlace <= 102) {
            System.out.println("Ваше место равно " +yourPlace +", оно стоячее извините за неудобство.");
        } else if (yourPlace > 102) {
            System.out.println("Увы вагон уже полностью забит. Вы " +yourPlace +", а максимально кол-во мест " +сapacity +"." );
        }
//Task-7
System.out.println("Task-7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Самое большое число " +one);
        } else if (two > one && two > three) {
            System.out.println("Самое большое число " +two);
        } else if (three > one && three > two) {
            System.out.println("Самое большое число " +three);
        }
    }
}