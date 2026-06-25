package x2;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f63780c = new n(Collections.EMPTY_MAP);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f63781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f63782b;

    public n(Map map) {
        this.f63782b = Collections.unmodifiableMap(map);
    }

    private static void e(HashMap map, Map map2) {
        for (Map.Entry entry : map2.entrySet()) {
            map.put((String) entry.getKey(), i(entry.getValue()));
        }
    }

    private static Map f(Map map, m mVar) {
        HashMap map2 = new HashMap(map);
        k(map2, mVar.c());
        e(map2, mVar.b());
        return map2;
    }

    private static byte[] i(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(StandardCharsets.UTF_8);
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }

    private static boolean j(Map map, Map map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!Arrays.equals((byte[]) entry.getValue(), (byte[]) map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    private static void k(HashMap map, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            map.remove(list.get(i10));
        }
    }

    @Override // x2.l
    public final long b(String str, long j10) {
        byte[] bArr = (byte[]) this.f63782b.get(str);
        return bArr != null ? ByteBuffer.wrap(bArr).getLong() : j10;
    }

    @Override // x2.l
    public final String c(String str, String str2) {
        byte[] bArr = (byte[]) this.f63782b.get(str);
        return bArr != null ? new String(bArr, StandardCharsets.UTF_8) : str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        return j(this.f63782b, ((n) obj).f63782b);
    }

    public n g(m mVar) {
        Map mapF = f(this.f63782b, mVar);
        return j(this.f63782b, mapF) ? this : new n(mapF);
    }

    public Set h() {
        return this.f63782b.entrySet();
    }

    public int hashCode() {
        if (this.f63781a == 0) {
            int iHashCode = 0;
            for (Map.Entry entry : this.f63782b.entrySet()) {
                iHashCode += Arrays.hashCode((byte[]) entry.getValue()) ^ ((String) entry.getKey()).hashCode();
            }
            this.f63781a = iHashCode;
        }
        return this.f63781a;
    }
}
