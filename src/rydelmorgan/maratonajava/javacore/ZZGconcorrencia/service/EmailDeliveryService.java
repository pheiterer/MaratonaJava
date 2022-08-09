package rydelmorgan.maratonajava.javacore.ZZGconcorrencia.service;

import rydelmorgan.maratonajava.javacore.ZZGconcorrencia.domain.Members;

public class EmailDeliveryService implements Runnable{
    private final Members members;

    public EmailDeliveryService(Members members) {
        this.members = members;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " starting to deliver emails...");
        while(members.isOpen() || members.pendingEmaisl() > 0){
            try {
                String email = members.retrieveEmail();
                if(email == null) continue;
                System.out.println(threadName + "sending email for " +email);
                Thread.sleep(2000);
                System.out.println(threadName + " email sent" + email);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("All emails was sent with success");
    }
}
