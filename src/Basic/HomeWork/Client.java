package Basic.HomeWork;

public class Client {
    private final String name;
    private final int age;

    public Client(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Client client = (Client) obj;
        return age == client.age && name.equals(client.name);
    }

    @Override
    public int hashCode() {
        return 31 * name.hashCode() + age;
    }
}
