package pg;

import Df.r;
import Ud.S;
import android.util.Log;
import dg.C4618A;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f56078a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final CopyOnWriteArraySet f56079b = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f56080c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = C4618A.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = C4618A.class.getName();
        AbstractC5504s.g(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = mg.e.class.getName();
        AbstractC5504s.g(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = ig.e.class.getName();
        AbstractC5504s.g(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f56080c = S.y(linkedHashMap);
    }

    private e() {
    }

    private final void c(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (f56079b.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(f.f56081a);
        }
    }

    private final String d(String str) {
        String str2 = (String) f56080c.get(str);
        return str2 == null ? r.s1(str, 23) : str2;
    }

    public final void a(String loggerName, int i10, String message, Throwable th2) {
        int iMin;
        AbstractC5504s.h(loggerName, "loggerName");
        AbstractC5504s.h(message, "message");
        String strD = d(loggerName);
        if (Log.isLoggable(strD, i10)) {
            if (th2 != null) {
                message = message + '\n' + Log.getStackTraceString(th2);
            }
            String str = message;
            int length = str.length();
            int i11 = 0;
            while (i11 < length) {
                int iI0 = r.i0(str, '\n', i11, false, 4, null);
                if (iI0 == -1) {
                    iI0 = length;
                }
                while (true) {
                    iMin = Math.min(iI0, i11 + 4000);
                    String strSubstring = str.substring(i11, iMin);
                    AbstractC5504s.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i10, strD, strSubstring);
                    if (iMin >= iI0) {
                        break;
                    } else {
                        i11 = iMin;
                    }
                }
                i11 = iMin + 1;
            }
        }
    }

    public final void b() {
        for (Map.Entry entry : f56080c.entrySet()) {
            c((String) entry.getKey(), (String) entry.getValue());
        }
    }
}
