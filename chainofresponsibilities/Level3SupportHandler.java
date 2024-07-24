package chainofresponsibilities;

public class Level3SupportHandler implements SupportHandler{

    @Override
    public void handleRequest(Request request) {
        if(request.getPriority()==Priority.CRITICAL){
            System.out.println("Request is handled on the level 3 SupportHandler");
        }else{
            System.out.println("Request cannot be handled");  
        }
    }

    @Override
    public void setNextHandler(SupportHandler nextHandler) {
        System.out.println("this is the last support handler there is no next handler on level 3");
    }
    
}
