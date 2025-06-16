public class View {

    private Model model;
    private Template template;

    public View(Model model, Template template) {
        this.model = model;
        this.template = template;
    }

    public void render() {
        for(var item : model.getData()){
            System.out.println(this.template.getText(item));
        }
    }
}
