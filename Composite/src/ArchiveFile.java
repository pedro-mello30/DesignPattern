import java.util.Date;

public abstract class ArchiveFile {

    public void add(ArchiveFile newArchiveFile){
        throw new UnsupportedOperationException();
    }

    public void remove(ArchiveFile archiveFile){
        throw new UnsupportedOperationException();
    }

    public ArchiveFile getArchive(int i){
        throw new UnsupportedOperationException();
    }

    public String getArchiveName(){
        throw new UnsupportedOperationException();
    }

    public String getDate(){
        throw new UnsupportedOperationException();
    }


    public float getSize(){
        throw new UnsupportedOperationException();
    }

    public String getType(){
        throw new UnsupportedOperationException();
    }

    public void displayArchiveInfo(){
        throw new UnsupportedOperationException();
    }

}
