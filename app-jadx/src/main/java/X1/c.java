package X1;

import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import Ud.S;
import X1.f;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends f {

    /* JADX INFO: renamed from: a */
    private final Map f21609a;

    /* JADX INFO: renamed from: b */
    private final b f21610b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final a f21611a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public final CharSequence invoke(Map.Entry entry) {
            AbstractC5504s.h(entry, "entry");
            Object value = entry.getValue();
            return "  " + ((f.a) entry.getKey()).a() + " = " + (value instanceof byte[] ? AbstractC2273n.w0((byte[]) value, ", ", "[", "]", 0, null, null, 56, null) : String.valueOf(entry.getValue()));
        }
    }

    public /* synthetic */ c(Map map, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map, (i10 & 2) != 0 ? true : z10);
    }

    @Override // X1.f
    public Map a() {
        Pair pair;
        Set<Map.Entry> setEntrySet = this.f21609a.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5874j.e(S.e(AbstractC2279u.x(setEntrySet, 10)), 16));
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                AbstractC5504s.g(bArrCopyOf, "copyOf(this, size)");
                pair = new Pair(key, bArrCopyOf);
            } else {
                pair = new Pair(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(pair.c(), pair.d());
        }
        return X1.a.b(linkedHashMap);
    }

    @Override // X1.f
    public Object b(f.a key) {
        AbstractC5504s.h(key, "key");
        Object obj = this.f21609a.get(key);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        AbstractC5504s.g(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    public final void e() {
        if (this.f21610b.a()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X1.c
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            X1.c r6 = (X1.c) r6
            java.util.Map r0 = r6.f21609a
            java.util.Map r2 = r5.f21609a
            r3 = 1
            if (r0 != r2) goto L10
            return r3
        L10:
            int r0 = r0.size()
            java.util.Map r2 = r5.f21609a
            int r2 = r2.size()
            if (r0 == r2) goto L1d
            return r1
        L1d:
            java.util.Map r6 = r6.f21609a
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L26
            return r3
        L26:
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L2e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.util.Map r2 = r5.f21609a
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r2 = r2.get(r4)
            if (r2 == 0) goto L63
            java.lang.Object r0 = r0.getValue()
            boolean r4 = r0 instanceof byte[]
            if (r4 == 0) goto L5e
            boolean r4 = r2 instanceof byte[]
            if (r4 == 0) goto L63
            byte[] r0 = (byte[]) r0
            byte[] r2 = (byte[]) r2
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 == 0) goto L63
            r0 = r3
            goto L64
        L5e:
            boolean r0 = kotlin.jvm.internal.AbstractC5504s.c(r0, r2)
            goto L64
        L63:
            r0 = r1
        L64:
            if (r0 != 0) goto L2e
            return r1
        L67:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X1.c.equals(java.lang.Object):boolean");
    }

    public final void f() {
        this.f21610b.b(true);
    }

    public final void g(f.b... pairs) {
        AbstractC5504s.h(pairs, "pairs");
        e();
        if (pairs.length <= 0) {
            return;
        }
        f.b bVar = pairs[0];
        throw null;
    }

    public final Object h(f.a key) {
        AbstractC5504s.h(key, "key");
        e();
        return this.f21609a.remove(key);
    }

    public int hashCode() {
        Iterator it = this.f21609a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final void i(f.a key, Object obj) {
        AbstractC5504s.h(key, "key");
        j(key, obj);
    }

    public final void j(f.a key, Object obj) {
        AbstractC5504s.h(key, "key");
        e();
        if (obj == null) {
            h(key);
            return;
        }
        if (obj instanceof Set) {
            this.f21609a.put(key, X1.a.a((Set) obj));
            return;
        }
        if (!(obj instanceof byte[])) {
            this.f21609a.put(key, obj);
            return;
        }
        Map map = this.f21609a;
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        AbstractC5504s.g(bArrCopyOf, "copyOf(this, size)");
        map.put(key, bArrCopyOf);
    }

    public String toString() {
        return AbstractC2279u.w0(this.f21609a.entrySet(), ",\n", "{\n", "\n}", 0, null, a.f21611a, 24, null);
    }

    public c(Map preferencesMap, boolean z10) {
        AbstractC5504s.h(preferencesMap, "preferencesMap");
        this.f21609a = preferencesMap;
        this.f21610b = new b(z10);
    }
}
