package chainofresponsibilities;

public class Level1SupportHandler implements SupportHandler{

    private SupportHandler nextHandler;

    @Override
    public void handleRequest(Request request) {
        if(request.getPriority()==Priority.BASIC){
            System.out.println("Request is handled on the level 1 SupportHandler");
        }else{
            if(nextHandler!=null){
                nextHandler.handleRequest(request);
            }
        }
    }

    @Override
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler=nextHandler;
    }
    
}
