class main {
    public static void main(String[] args) {

                Thread t1 = new Thread(()-> {
                    for (int i = 0; i < 10; i++) {
                        System.out.println(" this is thread 1");
                        try {
                            Thread.sleep(500);
                        } catch (Exception e) {
                        }
                    }


                }
                        );
                Thread t2 = new Thread(()-> {
                    for (int i = 0; i < 10; i++) {
                        System.out.println(" this is thread 2");
                        try {
                            Thread.sleep(500);
                        } catch (Exception e) {
                        }


                    }});
        t1.start();
        try{Thread.sleep(10);}catch(Exception e){}
        t2.start();
            }

        }

