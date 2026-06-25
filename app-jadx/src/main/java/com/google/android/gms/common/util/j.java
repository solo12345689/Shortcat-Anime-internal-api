package com.google.android.gms.common.util;

import f9.E;
import f9.x;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f38995a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f38996b = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f38997c = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    public static Map a(URI uri, String str) {
        Map map = Collections.EMPTY_MAP;
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            map = new HashMap();
            E eA = E.a(x.b('='));
            Iterator it = E.a(x.b('&')).b().c(rawQuery).iterator();
            while (it.hasNext()) {
                List listD = eA.d((String) it.next());
                if (listD.isEmpty() || listD.size() > 2) {
                    throw new IllegalArgumentException("bad parameter");
                }
                map.put(b((String) listD.get(0), str), listD.size() == 2 ? b((String) listD.get(1), str) : null);
            }
        }
        return map;
    }

    private static String b(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLDecoder.decode(str, str2);
        } catch (UnsupportedEncodingException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
