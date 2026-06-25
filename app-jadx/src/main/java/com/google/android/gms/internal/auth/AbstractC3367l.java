package com.google.android.gms.internal.auth;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3367l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static HashMap f39262f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Object f39267k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static boolean f39268l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Uri f39257a = Uri.parse("content://com.google.android.gsf.gservices");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Uri f39258b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f39259c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f39260d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicBoolean f39261e = new AtomicBoolean();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final HashMap f39263g = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final HashMap f39264h = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final HashMap f39265i = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final HashMap f39266j = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final String[] f39269m = new String[0];

    public static String a(ContentResolver contentResolver, String str, String str2) {
        synchronized (AbstractC3367l.class) {
            try {
                String str3 = null;
                if (f39262f == null) {
                    f39261e.set(false);
                    f39262f = new HashMap(16, 1.0f);
                    f39267k = new Object();
                    f39268l = false;
                    contentResolver.registerContentObserver(f39257a, true, new C3364k(null));
                } else if (f39261e.getAndSet(false)) {
                    f39262f.clear();
                    f39263g.clear();
                    f39264h.clear();
                    f39265i.clear();
                    f39266j.clear();
                    f39267k = new Object();
                    f39268l = false;
                }
                Object obj = f39267k;
                if (f39262f.containsKey(str)) {
                    String str4 = (String) f39262f.get(str);
                    if (str4 != null) {
                        str3 = str4;
                    }
                    return str3;
                }
                int length = f39269m.length;
                Cursor cursorQuery = contentResolver.query(f39257a, null, null, new String[]{str}, null);
                if (cursorQuery == null) {
                    return null;
                }
                try {
                    if (!cursorQuery.moveToFirst()) {
                        c(obj, str, null);
                        cursorQuery.close();
                        return null;
                    }
                    String string = cursorQuery.getString(1);
                    cursorQuery.close();
                    if (string != null && string.equals(null)) {
                        string = null;
                    }
                    c(obj, str, string);
                    if (string != null) {
                        return string;
                    }
                    return null;
                } catch (Throwable th2) {
                    cursorQuery.close();
                    throw th2;
                }
            } finally {
            }
        }
    }

    private static void c(Object obj, String str, String str2) {
        synchronized (AbstractC3367l.class) {
            try {
                if (obj == f39267k) {
                    f39262f.put(str, str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
