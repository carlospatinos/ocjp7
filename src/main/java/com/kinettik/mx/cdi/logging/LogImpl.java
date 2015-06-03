
package com.kinettik.mx.cdi.logging;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/**
 * @author Ramakrishnan
 */

@Interceptor
@Log
public class LogImpl {

    @AroundInvoke
    public Object logging(final InvocationContext context) throws Exception
    {
        System.out.println("Log before method call...");
        final Object returnObject = context.proceed();
        // to do some logging
        System.out.println("Log after method call...");
        return returnObject;
    }
}
