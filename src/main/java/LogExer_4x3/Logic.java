package LogExer_4x3;

//import org.apache.log4j.Logger;

import org.apache.log4j.Logger;

public class Logic {
    // Инициализация логера
    private static final Logger log = Logger.getLogger(Logic.class);

    private void privatePrintInfo() {
        System.out.println("Приватный метод был вызван");
        log.info("privatePrintInfo was called");
    }

    public void publicPrintInfo() {
        System.out.println("Паблик метод был вызван");
        log.error("publicPrintInfo was called");
        privatePrintInfo();
    }
}
