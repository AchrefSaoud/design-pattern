package memento;

//the originator
public class Document {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void write(String text){
        this.content+=text;
    }
    public DocumentMemento createMemento(){
        return new DocumentMemento(this.content);
    }
    public void restoreFromMemento(DocumentMemento documentMemento){
        this.content=documentMemento.getSavedContent();
    }
}
