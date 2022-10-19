public class Cat
{
    private String name;
    private int age;

    public Cat(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String speak()
    {
        int number = (int) (Math.random() * 3 + 1);

        if (number == 1) {
            return "meow";
        } else if (number == 2) {
            return "purr";
        } else {
            return "ssss";
        }
    }

    public void introduce()
    {
        System.out.println("Hello. My name is " + name + " and I am " + age + " years old. Now, mind your own business.");
    }
}

