public class Worker {
    private OneTaskDoneListener callBack;
    private OneTaskErrorListener errorCallBack;


    public Worker(OneTaskDoneListener callBack, OneTaskErrorListener errorCallBack) {
        this.callBack = callBack;
        this.errorCallBack = errorCallBack;
    }

    @FunctionalInterface
    public interface OneTaskDoneListener{
        void onDone(String result);
    }

    @FunctionalInterface
    public interface OneTaskErrorListener{
        void onError(String result);
    }

    public void start(){
        for(int i =0; i<50;i++){
            if(i== 33 || i== 45){
                errorCallBack.onError("Task " + i + " is error");
            } else {
                callBack.onDone("Task " + i + " is done");
            }
        }
    }
}