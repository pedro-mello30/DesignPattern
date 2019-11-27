public class ArchiveSystem {
    ArchiveFile archiveFileList;

    public ArchiveSystem(ArchiveFile archiveFileList) {
        this.archiveFileList = archiveFileList;
    }

    public void getArchiveList(){
        archiveFileList.displayArchiveInfo();
    }
}
