package composite;

import java.util.ArrayList;
import java.util.List;

public class HtmlParentElement  extends HtmlTag{

    private String tagName;
    private String startTag;
    private String endTag;
    private List<HtmlTag>childrenTag;

    public HtmlParentElement(String tagName){
        this.tagName = tagName;
        this.startTag = "";
        this.endTag = "";
        this.childrenTag = new ArrayList<>();
    }

    @Override
    public String getTagName() {
       return this.tagName;
    }

    @Override
    public void setStartTag(String tag) {
        this.startTag=tag;
    }

    @Override
    public void setEndTag(String tag) {
        this.endTag=tag;
    }

    @Override
    public void addChildTag(HtmlTag htmlTag){ //the add method
        childrenTag.add(htmlTag);
    }

    @Override
    public void removeChildTag(HtmlTag htmlTag){ //the remove method
        childrenTag.remove(htmlTag);
    }

    @Override
    public List<HtmlTag>getChildren(){
        return childrenTag;
    }

    @Override
    public void generateHtml() {
        System.out.println(startTag);
        for(HtmlTag tag : childrenTag){
            tag.generateHtml();
        }
        System.out.println(endTag);
    }
    
}
