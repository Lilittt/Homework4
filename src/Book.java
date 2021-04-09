public class Book {
    private String authorName;
    private String bookName;
    private String genre;
    private int numberOfPages;
    private int releaseYear;
    private boolean isTranslatedToArmenian;

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        if(numberOfPages > 0) {
            this.numberOfPages = numberOfPages;
        }
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isTranslatedToArmenian() {
        return isTranslatedToArmenian;
    }

    public void setTranslatedToArmenian(boolean translatedToArmenian) {
        isTranslatedToArmenian = translatedToArmenian;
    }
}
