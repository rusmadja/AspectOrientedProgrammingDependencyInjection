package Targuil8.Aspect.SortingClean;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect

public class Logging {
    long starterTime;

    @Pointcut("execution( * *.sort(*))")
    private void SelectSort() {
    }

    @Before("SelectSort()")
    public void beforeSort(JoinPoint jp) {
        starterTime = System.currentTimeMillis();
        System.out.println("Running sort in " + jp.getThis().getClass().getName() + " with array size 100000");
    }

    @After("SelectSort()")
    public void AfterSort(JoinPoint jp) {
        System.out.println("Function sort in " + jp.getSignature().getName() + " took " + (System.currentTimeMillis() - starterTime)  + " ms");
    }
}
