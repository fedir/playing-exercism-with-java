public class Greeter {
    private String name; 
    public Greeter() {
    }
    public Greeter(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Greeter name(String name) {
        setName(name);
        return this;
    }
    public  String getGreeting() {
        if (this.name == null  || this.name.length() == 0) {
            name = "World";
        }
        String output = "Hello, "+ this.name + "!";
        System.out.println(output);
        return output;
    }
}