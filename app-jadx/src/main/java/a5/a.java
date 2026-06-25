package A5;

import Df.r;
import Td.z;
import Ud.S;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f309a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f310b = S.l(z.a("mkv", "video/x-matroska"), z.a("glb", "model/gltf-binary"));

    private a() {
    }

    private final String a(String str) {
        int iO0 = r.o0(str, com.amazon.a.a.o.c.a.b.f34706a, 0, false, 6, null);
        if (iO0 < 0 || iO0 == str.length() - 1) {
            return null;
        }
        String strSubstring = str.substring(iO0 + 1);
        AbstractC5504s.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String b(String path) {
        AbstractC5504s.h(path, "path");
        String strA = f309a.a(path);
        if (strA == null) {
            return null;
        }
        Locale US = Locale.US;
        AbstractC5504s.g(US, "US");
        String lowerCase = strA.toLowerCase(US);
        AbstractC5504s.g(lowerCase, "toLowerCase(...)");
        if (lowerCase == null) {
            return null;
        }
        String strA2 = b.a(lowerCase);
        return strA2 == null ? (String) f310b.get(lowerCase) : strA2;
    }

    public static final boolean c(String str) {
        if (str != null) {
            return r.Q(str, "video/", false, 2, null);
        }
        return false;
    }
}
