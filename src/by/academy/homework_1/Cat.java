package by.academy.homework_1;

public class Cat {
        int age;
        String nickname;
        double money;
        char initials;
        boolean isHomeAnimal;

        public Cat() {
        }

        public Cat(String nickname) {
            this.nickname = nickname;
        }

        public Cat(String nickname, int age) {
            this.nickname = nickname;
            this.age = age;
        }

        public void grow(int addAge) {
            System.out.println("Кот растет " + addAge + " год(а)");
            age = age + addAge;
        }

        public void sleep() {
            System.out.println("Кот спит");
        }

        public int getAge() {
            return age;
        }

        public void eat() {
            System.out.println("Кот ест");
        }

        public void walk() {
            System.out.println("Кот гуляет");
        }

        public void printAge() {
            System.out.println("Кот " + nickname + " age " + age);
        }

        public void getMoney() {
            money = 10.2;

        }

        public double setMoney() {
            System.out.println("Кот проел " + money + " рубля(ей)");
            return money;
        }

        public void getInitials() {
            initials = 'B';
        }

        public char setInitials() {
            System.out.println("Первая буква 1-го кота:" + initials);
            return initials;
        }

        public void isHomeAnimal() {
            if (isHomeAnimal)
                System.out.println("Это домашнее животное");
            else
                System.out.println("Это не домашнее животное");
        }

    }

