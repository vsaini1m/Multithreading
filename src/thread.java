 class thread1 implements Runnable{
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println(" this is thread 1");
            try{Thread.sleep(500);}catch (Exception e){}
        }
    }
}
