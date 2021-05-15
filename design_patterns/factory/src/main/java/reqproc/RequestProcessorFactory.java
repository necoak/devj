package reqproc;

public class RequestProcessorFactory {

    public static RequestProcessor create(int page){
        RequestProcessor ret = null;
        if (page == 0){
            ret = new AllRequestProcessor();
        } else if (page==1) {
            ret = new UpdateRequestProcessor();
        }
        return ret;
    }

}
