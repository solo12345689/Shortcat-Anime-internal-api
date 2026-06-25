package N7;

import Df.r;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import z1.k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f12693a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f12694b = new HashMap();

    private c() {
    }

    private final int a(Context context, String str) {
        int identifier = context.getResources().getIdentifier(str, "drawable", context.getPackageName());
        f12694b.put(str, Integer.valueOf(identifier));
        return identifier;
    }

    public static final synchronized void b() {
        f12694b.clear();
    }

    public static final c c() {
        return f12693a;
    }

    public static final Drawable d(Context context, String str) {
        AbstractC5504s.h(context, "context");
        int iE = e(context, str);
        if (iE > 0) {
            return k.f(context.getResources(), iE, null);
        }
        return null;
    }

    public static final int e(Context context, String str) {
        AbstractC5504s.h(context, "context");
        if (str == null || str.length() == 0) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        AbstractC5504s.g(lowerCase, "toLowerCase(...)");
        String strK = r.K(lowerCase, "-", "_", false, 4, null);
        try {
            return Integer.parseInt(strK);
        } catch (NumberFormatException unused) {
            synchronized (f12693a) {
                try {
                    Integer num = (Integer) f12694b.get(strK);
                    return num != null ? num.intValue() : f12693a.a(context, strK);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static final Uri f(Context context, String str) {
        AbstractC5504s.h(context, "context");
        int iE = e(context, str);
        if (iE > 0) {
            Uri uriBuild = new Uri.Builder().scheme("res").path(String.valueOf(iE)).build();
            AbstractC5504s.e(uriBuild);
            return uriBuild;
        }
        Uri uri = Uri.EMPTY;
        AbstractC5504s.e(uri);
        return uri;
    }
}
