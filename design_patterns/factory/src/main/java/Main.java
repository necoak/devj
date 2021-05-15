import reqproc.RequestProcessor;
import reqproc.RequestProcessorFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        RequestProcessor processor1 = RequestProcessorFactory.create(0);
        String processResult1 = processor1.process();
        System.out.println(processResult1);

        RequestProcessor processor2 = RequestProcessorFactory.create(1);
        String processResult2 = processor2.process();
        System.out.println(processResult2);


    }
}
