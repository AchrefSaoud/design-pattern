package facade;

public class Test {
    public static void main(String[] args) {
        /*instead of doing this*/
        ScheduleServer scheduleServer=new ScheduleServer();
        /*scheduleServer.startBooting();
        scheduleServer.readSystemConfigFile();
        scheduleServer.init();
        scheduleServer.initializeContext();
        scheduleServer.initializeListeners();
        scheduleServer.createSystemObjects();
        System.out.println("Start working......");
        System.out.println("After work done.........");

        scheduleServer.releaseProcesses();
        scheduleServer.destory();
        scheduleServer.createSystemObjects();
        scheduleServer.destoryListeners();
        scheduleServer.destory();
        scheduleServer.shutdown();

        /*we can user the facade which will wrap a server object. This class will provide simple interfaces (methods)
        for the client. These interfaces internally will call the methods on the server object */
        /*
         * The client is just needs to call these simple methods. Now, there is
            no need to call all the lifecycle and destroy methods, just the simple methods and the rest of the process will be performed by the
            facade class.
         */
        ScheduleServerFacade scheduleServerFacade=new ScheduleServerFacade(scheduleServer);

        scheduleServerFacade.startServer();
        System.out.println("Start working......");
        System.out.println("After work done.........");
        scheduleServerFacade.stopServer();
    }
}
