package com.turn.ttorrent.util;

import android.util.Log;

/**
 * Created by alexey on 6/4/13.
 */
public class Logger {
    public String tag = "TAG";

    public void warn(String str, Exception e) {
        Log.w(tag, str, e);
    }

    public void warn(String str, Object... obj) {
        String msg = str;
        for(Object o: obj) {
            msg += "\n " + obj.toString();
        }
        Log.w(tag, msg);
    }

    public void info(String str, Object... obj) {
        String msg = str;
        for(Object o: obj) {
            msg += "\n " + obj.toString();
        }
        Log.i(tag, msg);
    }

    public void debug(String str, Object... obj) {
        String msg = str;
        for(Object o: obj) {
            msg += "\n " + obj.toString();
        }
        Log.d(tag, msg);
    }

    public void error(String str, Object... obj) {
        String msg = str;
        for(Object o: obj) {
            msg += "\n " + obj.toString();
        }
        Log.e(tag, msg);
    }

    public void trace(String str, Object... obj) {
        String msg = str;
        for(Object o: obj) {
            msg += "\n " + obj.toString();
        }
        Log.i(tag, msg);
    }
}
