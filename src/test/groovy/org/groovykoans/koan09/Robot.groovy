/*
 * Copyright (c) 2012-2014 nadavc <https://twitter.com/nadavc>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the WTFPL, Version 2, as published by Sam Hocevar.
 * See the COPYING file for more details.
 */

package org.groovykoans.koan09

import groovy.util.logging.Slf4j
import org.codehaus.groovy.runtime.InvokerHelper



@Slf4j()
class Robot {
    // ------------ START EDITING HERE ----------------------
    
    int x = 0;
    int y = 0;
    
    
    def invokeMethod(String name, Object args) {
        return "called invokeMethod $name $args"
    }

    // ------------ STOP EDITING HERE  ----------------------
}
