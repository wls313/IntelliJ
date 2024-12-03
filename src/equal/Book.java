package equal;

public class Book {
    //속성
    private String title;
    private String author;

    //생성자
    public Book(String title , String author){
        this.title = title;
        this.author = author;
    }

    //기능


    /**
     *getter
     * 책 재목을 반환 합니다
     * @return 책 제목
     */
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public boolean equals(Object obj){
        Book book = (Book) obj; //형변환 캐스팅
        if(this.title == book.getTitle() && this.author == book.getAuthor()){
            return true;
        } else {
            return false;
        }
    }
}
