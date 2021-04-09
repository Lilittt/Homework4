public class Test {
    public static void main(String[] args) {
        System.out.println("Bubble sort");
        int[] arr = {7, 3, 8, 50, 4, 0, 1, 1};
        int max = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i -1; j++) {
                if (arr[j] > arr[j + 1]) {
                    max = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = max;
                }
            }
        }

        Book b1 = new Book();
        b1.setAuthorName("J. K. Rowling");
        b1.setBookName("Harry Potter and the Prisoner of Azkaban");
        b1.setGenre("Fiction");
        b1.setReleaseYear(1999);
        b1.setNumberOfPages(500);
        b1.setTranslatedToArmenian(true);

        Book b2 = new Book();
        b2.setAuthorName("Jane Austen");
        b2.setBookName("Pride and prejudice");
        b2.setGenre("Romance");
        b2.setReleaseYear(1813);
        b2.setNumberOfPages(350);
        b2.setTranslatedToArmenian(true);

        System.out.printf("I love reading %s and %s genres.", b1.getGenre(), b2.getGenre());
        System.out.println(b1.getBookName() + " was released in " + b2.getReleaseYear());

        if(b2.getNumberOfPages() > 400) {
            System.out.println("It will take too long to finish the book.");
        }
        else {
            System.out.println("It will be finished sooner.");
        }

    }
}
