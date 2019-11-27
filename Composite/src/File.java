import java.text.SimpleDateFormat;
import java.util.Date;

public class File extends ArchiveFile {
    String fileName;
    float size;
    String type;
    String date;
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    public File(String fileName, float size, String type, String date) {
        this.fileName = fileName;
        this.size = size;
        this.type = type;
        this.date = date;
    }

    @Override
    public String getArchiveName() {
        return fileName;
    }

    @Override
    public float getSize() {
        return size;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getDate() {
        return date;
    }

    @Override
    public void displayArchiveInfo() {
        System.out.println("-"+this.getClass().getSimpleName()+" Name: " + getArchiveName());
        System.out.println("-Date: " + getDate());
        System.out.println("-Size: " + getSize());
        System.out.println("-Type: " + getType() + "\n");;
    }
}
