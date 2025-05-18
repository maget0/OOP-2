package pkg_oop;

public class View implements DataSource {

    @Override
    public void execute() {
        System.out.println("Some data to be displayed.");
    }
}

