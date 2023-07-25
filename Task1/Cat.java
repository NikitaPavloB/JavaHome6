package Task1;

// Реализуйте класс Cat, включающий в себя от трех полей и от двух методов, определяющих базовый функционал класса(за основу можно взять наработки с семинара). 

// Создать два экземпляра класса Cat и вывести информацию о них на экран.

public class Cat {
  private String name;
  private int age;
  private String breed;
  private boolean isVaccinated;

  // Конструктор класса
  public Cat(String name, int age, String breed) {
    this.name = name;
    this.age = age;
    this.breed = breed;
    this.isVaccinated = false; // Изначально кот не привит
  }

  // Метод для вывода информации о коте
  public void printInfo() {
    System.out.println("Имя: " + name);
    System.out.println("Возраст: " + age + " год(а)");
    System.out.println("Порода: " + breed);
    System.out.println("Привит: " + (isVaccinated ? "Да" : "Нет"));
    System.out.println();
  }

  // Метод для проверки здоровья кота
  public void checkHealth() {
    if (age > 10) {
      System.out.println(name + " уже " + age + " лет. Необходимо обратиться к ветеринару.");
    } else {
      System.out.println(name + " в хорошем здоровье.");
    }
  }

  // Метод для добавления информации о вакцинации кота
  public void vaccinate() {
    if (!isVaccinated) {
      System.out.println(name + " был успешно привит!");
      isVaccinated = true;
    } else {
      System.out.println(name + " уже привит ранее.");
    }
  }

  // Метод для переименования кота
  public void rename(String newName) {
    System.out.println(name + " был переименован в " + newName);
    name = newName;
  }

  // Переопределение метода toString() для удобного вывода информации о коте
  @Override
  public String toString() {
    return "Имя: " + name + ", Возраст: " + age + " год(а), Порода: " + breed + ", Привит: "
        + (isVaccinated ? "Да" : "Нет");
  }

  public static void main(String[] args) {
    // Создаем два экземпляра класса Cat
    Cat cat1 = new Cat("Барсик", 2, "Британская короткошерстная");
    Cat cat2 = new Cat("Мурзик", 4, "Персидская");

    // Выводим информацию о котах на экран
    System.out.println("Информация о коте 1:");
    cat1.printInfo();

    System.out.println("Информация о коте 2:");
    cat2.printInfo();

    // Прививаем котов
    cat1.vaccinate();
    cat2.vaccinate();

    // Переименовываем кота
    cat1.rename("Том");

    // Проверяем здоровье кота
    cat2.checkHealth();
  }
}
