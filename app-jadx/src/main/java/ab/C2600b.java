package ab;

import Df.r;
import android.content.Context;
import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: ab.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class C2600b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2600b f23910a = new C2600b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f23911b = new LinkedHashMap();

    private C2600b() {
    }

    private final int a(Context context, String str, String str2) {
        if (str.length() == 0) {
            return -1;
        }
        Locale ROOT = Locale.ROOT;
        AbstractC5504s.g(ROOT, "ROOT");
        String lowerCase = str.toLowerCase(ROOT);
        AbstractC5504s.g(lowerCase, "toLowerCase(...)");
        String strK = r.K(lowerCase, "-", "_", false, 4, null);
        String str3 = str2 + "/" + strK;
        synchronized (this) {
            Map map = f23911b;
            Integer num = (Integer) map.get(str3);
            if (num != null) {
                return num.intValue();
            }
            int identifier = context.getResources().getIdentifier(strK, str2, context.getPackageName());
            map.put(str3, Integer.valueOf(identifier));
            return identifier;
        }
    }

    public final Uri b(Context context, String name) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(name, "name");
        Locale ROOT = Locale.ROOT;
        AbstractC5504s.g(ROOT, "ROOT");
        String lowerCase = name.toLowerCase(ROOT);
        AbstractC5504s.g(lowerCase, "toLowerCase(...)");
        r.K(lowerCase, "-", "_", false, 4, null);
        int iA = a(context, name, "drawable");
        if (iA != 0) {
            return Uri.parse("res:/" + iA);
        }
        int iA2 = a(context, name, "raw");
        if (iA2 != 0) {
            return Uri.parse("res:/" + iA2);
        }
        if (!r.Q(name, "asset:/", false, 2, null)) {
            return Uri.parse("file:///android_asset/" + name);
        }
        return Uri.parse("file:///android_asset/" + r.C0(name, "asset:/"));
    }
}
