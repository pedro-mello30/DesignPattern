public class Main {

    public static void main(String[] args) {
	// write your code here
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/pathTo/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("pedro@icloud.com"));

        try {
            editor.openFile("/pathTo/log/file.txt");
            editor.saveFile();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
