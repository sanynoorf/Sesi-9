import java.util.Queue;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        Queue<String> todolist = new LinkedList<>();

        todolist.add("Bangun tidur");
        todolist.add("Sarapan");
        todolist.add("Mandi");
        todolist.add("Kuliah");
        todolist.add("Makan");
        todolist.add("Istirahat");
        todolist.add("Olahraga");
        todolist.add("Main");
        todolist.add("Tidur");

        System.out.println("To do list kegiatan seahari-hari:");
        while (!todolist.isEmpty()) {
            String kegiatan = todolist.remove();
            System.out.println("- " + kegiatan);
        }

    }
}