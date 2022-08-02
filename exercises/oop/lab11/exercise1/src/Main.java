import java.util.LinkedList;
import java.util.Queue;

public class Main
{
    public static void main(String[] args) {

        Queue<Process> tasks = new LinkedList<>();

        Service p1 = new Service("logger", "System logger", "automatic");
        p1.setServiceMode("manual");

        tasks.add(p1);

        ConsoleApplication p2 = new ConsoleApplication("cmd", "acer", "windows-1250");
        p2.setTextEncoding("UTF-8");
        tasks.add(p2);

        WindowApplication p3 = new WindowApplication("browser", "user2", 800, 600);
        p3.setWidth(768);
        p3.setLength(1366);

        tasks.add(p3);

        try {
            Process p = tasks.peek();
            p.run();
            System.out.println(p.getPIUD() + ":  " + p.getStatus());
            p.stop();
            System.out.println(p.getPIUD() + ":  " + p.getStatus());
            tasks.poll();

            p = tasks.peek();
            System.out.println(p.getPIUD() + ":  " + p.getStatus());
            p.stop();
            throw new StopError("hello!");


        }
        catch (RunError e) {
            System.out.println(e);
        }
        catch (StopError e) {
            System.out.println(e);
        }

    }
}
