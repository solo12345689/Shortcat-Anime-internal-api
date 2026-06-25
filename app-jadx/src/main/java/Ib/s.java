package Ib;

import android.content.Context;
import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f9006a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f9007b = new LinkedHashMap();

    private s() {
    }

    private final int a(Context context, String str) {
        if (str.length() == 0) {
            return -1;
        }
        Locale ROOT = Locale.ROOT;
        AbstractC5504s.g(ROOT, "ROOT");
        String lowerCase = str.toLowerCase(ROOT);
        AbstractC5504s.g(lowerCase, "toLowerCase(...)");
        String strK = Df.r.K(lowerCase, "-", "_", false, 4, null);
        synchronized (this) {
            Map map = f9007b;
            Integer num = (Integer) map.get(strK);
            if (num != null) {
                return num.intValue();
            }
            int identifier = context.getResources().getIdentifier(strK, "raw", context.getPackageName());
            map.put(strK, Integer.valueOf(identifier));
            return identifier;
        }
    }

    public final Uri b(Context context, String name) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(name, "name");
        Uri uriF = N7.c.f(context, name);
        if (!AbstractC5504s.c(uriF, Uri.EMPTY)) {
            return uriF;
        }
        int iA = a(context, name);
        if (iA > 0) {
            return new Uri.Builder().scheme("res").path(String.valueOf(iA)).build();
        }
        return null;
    }
}
