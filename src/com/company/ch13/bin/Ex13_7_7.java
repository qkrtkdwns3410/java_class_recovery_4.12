package com.company.ch13.bin;

class Ex13_7_7 implements Runnable{
    static boolean autoSave = false;
    
    public static void main(String[] args) {
        Thread t = new Thread(new Ex13_7_7());
        t.setDaemon(true);  //이 부분이 없으면 종료되지 않는다.
        t.start();
    
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
                
            }catch (InterruptedException e ){}
            System.out.println(i);
            
            if(i==5) autoSave = true;
        }
        System.out.println("프로그램을 종료합니다.");
    }
    
    public void run() {
        while (true) {
            try {
                Thread.sleep(3000);
        
            } catch (Exception e) {
            
            }
            if(autoSave) autoSave();
        }
    }
    
    public void autoSave() {
        System.out.println("작업파일이 자동저장되었습니다.");
    }
}
