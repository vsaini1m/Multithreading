class main {
    public static void main(String[] args) {
        Runnable obj1 = new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(" this is thread 1");
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                    }
                }

            }
        }
            ;
            final Runnable obj2 = new Runnable() {
                public void run() {
                    for (int i = 0; i < 10; i++) {
                        System.out.println(" this is thread 2");
                        try {
                            Thread.sleep(500);
                        } catch (Exception e) {
                        }
                    }

                }};
                Thread t1 = new Thread(obj1);
                Thread t2 = new Thread(obj2);
        t1.start();
        try{Thread.sleep(10);}catch(Exception e){}
        t2.start();
            }

        }

