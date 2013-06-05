package com.turn.ttorrent.util;

/**
 * Created by alexey on 6/4/13.
 */
public class LoggerFactory {

    public static Logger getLogger(Class tag) {
        Logger l = new Logger();
        l.tag = "TAG_" + tag;
        return l;
    }

    public static Logger getLogger(String tag) {
        Logger l = new Logger();
        l.tag = "TAG_" + tag;
        return l;
    }
}
