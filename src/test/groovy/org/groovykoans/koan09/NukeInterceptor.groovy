/*
 * Copyright (c) 2012-2014 nadavc <https://twitter.com/nadavc>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the WTFPL, Version 2, as published by Sam Hocevar.
 * See the COPYING file for more details.
 */

package org.groovykoans.koan09

import groovy.util.logging.Slf4j

@Slf4j("LOG")
class NukeInterceptor implements Interceptor {

    boolean isAuthorized = true

    @Override
    Object beforeInvoke(Object obj, String methodName, Object[] args) {
        // ------------ START EDITING HERE ----------------------
        //  def userName = args[0];
        //  LOG.debug("${obj} ${methodName} ${args}")
        if (methodName.equals("nukeCity"))
        {
            def userName = args[0];
            if (userName.equals("admin"))
            {
                isAuthorized = true
             
            }
            else
            {
                isAuthorized = false
            }
            
        }
        
        
        //        

        // ------------ STOP EDITING HERE  ----------------------
    }

    @Override
    Object afterInvoke(Object obj, String methodName, Object[] args, Object result) {
        // ------------ START EDITING HERE ----------------------

        result
        // ------------ STOP EDITING HERE  ----------------------
    }

    @Override
    boolean doInvoke() {
        // ------------ START EDITING HERE ----------------------
        isAuthorized

        // ------------ STOP EDITING HERE  ----------------------
    }
}

