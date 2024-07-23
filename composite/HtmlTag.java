package composite;

import java.util.List;

public abstract class HtmlTag {
    public abstract String getTagName();
    public abstract void setStartTag(String tag);
    public abstract void setEndTag(String tag);

    public void setTagBody(String tagBody){
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }
    //the add method
    public void addChildTag(HtmlTag htmlTag){
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }
    //the remove method 
    public void removeChildTag(HtmlTag htmlTag){
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }
    public List<HtmlTag>getChildren(){
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }
    //the operation
    public abstract void generateHtml();
}
