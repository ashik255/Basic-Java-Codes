package OOP.Interface;

interface Printable {
    void print();
}

class Document implements Printable {
    public void print() {
        System.out.println("Printing a document");
    }
}

class Photo implements Printable {
    public void print() {
        System.out.println("Printing a photo");
    }
}

public class Main {
    public static void main(String[] args) {
        Document myDoc = new Document();
        myDoc.print();
        Photo myPhoto = new Photo();
        myPhoto.print();

    }
}
