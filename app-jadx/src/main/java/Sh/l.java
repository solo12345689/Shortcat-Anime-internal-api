package sh;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class l implements w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f59871c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f59872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f59873b;

    static {
        HashMap map = new HashMap();
        map.put(b("SHA-256", 32, 16, 67), new l(16777217, "WOTSP_SHA2-256_W16"));
        map.put(b("SHA-512", 64, 16, 131), new l(33554434, "WOTSP_SHA2-512_W16"));
        map.put(b("SHAKE128", 32, 16, 67), new l(50331651, "WOTSP_SHAKE128_W16"));
        map.put(b("SHAKE256", 64, 16, 131), new l(67108868, "WOTSP_SHAKE256_W16"));
        f59871c = Collections.unmodifiableMap(map);
    }

    private l(int i10, String str) {
        this.f59872a = i10;
        this.f59873b = str;
    }

    private static String b(String str, int i10, int i11, int i12) {
        if (str == null) {
            throw new NullPointerException("algorithmName == null");
        }
        return str + "-" + i10 + "-" + i11 + "-" + i12;
    }

    protected static l c(String str, int i10, int i11, int i12) {
        if (str != null) {
            return (l) f59871c.get(b(str, i10, i11, i12));
        }
        throw new NullPointerException("algorithmName == null");
    }

    @Override // sh.w
    public int a() {
        return this.f59872a;
    }

    public String toString() {
        return this.f59873b;
    }
}
