class TextNode {
    String text;
    TextNode prev;
    TextNode next;
    TextNode(String text) {
        this.text= text;
        this.prev= null;
        this.next= null;
    }
}
class TextEditor{
    TextNode head;
    TextNode tail;
    TextNode current;
    int size= 0;
    int MAX= 10;
    void addState(String text) {
        TextNode newNode = new TextNode(text);
        if (head == null) {
            head = tail = current = newNode;
            size++;
            return;
        }
        current.next= null;
        tail= current;
        tail.next= newNode;
        newNode.prev= tail;
        tail= newNode;
        current= newNode;
        size++;
        if (size>MAX) {
            head= head.next;
            head.prev= null;
            size--;
        }
    }
    void undo() {
        if (current!= null && current.prev!= null) {
            current=current.prev;
        }
    }
    void redo() {
        if (current!=null && current.next!= null) {
            current=current.next;
        }
    }
    void showCurrentText() {
        if (current!=null)
            System.out.println("Current Text: "+current.text);
    }
}
public class UndoRedoFunctionality {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.addState("Hii");
        editor.addState("What is this");
        editor.addState("Wow!");
        editor.showCurrentText();
        editor.undo();
        editor.showCurrentText();
        editor.undo();
        editor.showCurrentText();
        editor.redo();
        editor.showCurrentText();
    }
}
