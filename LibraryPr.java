package com.company;
class Library1{
    String[] books;
    int number_of_books;
    Library1(){
        this.books = new String[100];
        this.number_of_books = 0;
    }
    void add_books(String books){
        this.books[number_of_books] = books;
        number_of_books++;
        System.out.println(books+" Has Been added");
    }
    void Show() {
        System.out.println("Available books are :");
        for (String b : this.books) {
            if (b == null) {
                continue;
            }
            System.out.println("---> " + b);
        }
    }
    void IssueBook(){
            for(int i = 0;i<=this.books.length;i++){
                if(this.books[i].equals("Java")){
                    System.out.println("This Book Has Been Issued !");
                    this.books[i] = null;
                    return;
                }
            }
        System.out.println("This Book does not exists");
    }
    void returned_Book(){
        add_books("Java");
        Show();
    }
}
public class LibraryPr {
    public static void main(String[] args) {
        Library1 l = new Library1();
        l.add_books("Who Will Cry When u Die");
        l.add_books("Think and Grow Rich");
        l.add_books("Mindset");
        l.add_books("Java");
        l.add_books("Algorithms");
        l.Show();
        l.IssueBook();
        l.Show();
        l.returned_Book();
    }
}