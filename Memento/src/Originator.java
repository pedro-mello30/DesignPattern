public class Originator {
    private String article = "";

    public void setArticle(String newArticle){
        article = newArticle;
    }

    public Memento storeInMemento(){
        System.out.println("Saving Article In History");
        return new Memento(article);
    }

    public String restoreFromHistory(Memento memento){
        System.out.println("Restore Article From History");
        article = memento.getArticle();
        return article;
    }
}
