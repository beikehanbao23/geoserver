/* Copyright (c) 2012 TOPP - www.openplans.org.  All rights reserved.
 * This code is licensed under the GPL 2.0 license, availible at the root
 * application directory.
 */
package org.geoserver.wcs2_0.util;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Emanuele Tajariol (etj at geo-solutions.it)
 */
public class StringUtils {

    public static String merge(List<String> list) {
        return merge(list, ",");
    }

    public static String merge(List<String> list, String separator) {
        StringBuilder sb = new StringBuilder();
        for (Iterator<String> it = list.iterator(); it.hasNext();) {
            String string = it.next();
            sb.append(string);
            if(it.hasNext()) {
                sb.append(separator);
            }
        }
        return sb.toString();
    }

}
