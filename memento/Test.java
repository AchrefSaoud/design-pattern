package memento;

public class Test {
    public static void main(String[] args) {
        Document document = new Document("Initial content\n");
        History history = new History();
        document.write("Additional content\n");
        history.addMemento(document.createMemento());

        document.write("More content\n");
        history.addMemento(document.createMemento());

        document.restoreFromMemento(history.getMemento(0));

        System.out.println(document.getContent());
    }
}
