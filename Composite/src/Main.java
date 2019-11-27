public class Main {

    public static void main(String[] args) {

        ArchiveFile directoryD = new Directory("D:/", "20/06/2010");
        ArchiveFile directoryC = new Directory("C:/", "30/06/2012");
        ArchiveFile books = new Directory("Books/", "18/03/2016");
        ArchiveFile root = new Directory("/", "01/01/2001");



        directoryD.add(new File("Archive Zip", 77.3f, "tar", "01/06/2017"));
        root.add(directoryD);

        directoryC.add(new File("Movie", 120.3f, "mp4", "01/07/2017"));
        directoryC.add(new File("MovieB", 180.4f, "avi", "09/06/2018"));
        root.add(directoryC);


        books.add(new File("History Book", 12.3f, "pdf", "12/02/2013"));
        books.add(new File("Tech Book", 3.6f, "pdf", "13/04/2015"));
        books.add(new File("Design Pattern Book", 8.9f, "pdf", "14/01/2011"));
        books.add(new File("Comedy Book", 4.6f, "pdf", "01/01/2011"));

        directoryD.add(books);

        ArchiveSystem archiveSystem = new ArchiveSystem(root);
        archiveSystem.getArchiveList();

    }
}
