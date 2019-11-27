import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directory extends ArchiveFile {
    ArrayList<ArchiveFile> files = new ArrayList<ArchiveFile>();

    String directoryName;
    String date;
    float size;

    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    public Directory(String directoryName, String date) {
        this.directoryName = directoryName;
        this.date = date;
    }

    @Override
    public void add(ArchiveFile newArchiveFile) {
        files.add(newArchiveFile);
    }

    @Override
    public void remove(ArchiveFile archiveFile) {
        files.remove(archiveFile);
    }

    @Override
    public ArchiveFile getArchive(int i) {
        return (ArchiveFile)files.get(i);
    }

    @Override
    public String getArchiveName() {
        return directoryName;
    }

    @Override
    public String getDate() {
        return date;
    }

    @Override
    public float getSize() {
        size = 0;
        for (ArchiveFile a : files){
            size += a.getSize();
        }
        return size;
    }

    @Override
    public void displayArchiveInfo() {
        System.out.println("----------------------------------------------");
        System.out.println("Directory Name: " + directoryName);
        System.out.println("Date: " + getDate());
        System.out.println("Size: " + getSize());
        for (ArchiveFile a : files){
            System.out.println("---");
            a.displayArchiveInfo();
        }
        System.out.println("----------------------------------------------");
    }
}
