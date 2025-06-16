public class Controller {
    Model model;
    View view;

    Controller(Model m, View v) {
        this.model = m;
        this.view = v;
    }

    public void route(String path) {
        switch (path) {
            case "/":
                view.render();
                break;
            case "/all/":
                view.render();
                break;
            default:
                System.out.println("No such path: " + path);
        }
    }
}
