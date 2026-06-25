package t;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import u.AbstractC6705d;
import u.C6703b;
import u.C6704c;

/* JADX INFO: renamed from: t.z */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C6575z {

    /* JADX INFO: renamed from: a */
    private int f60146a;

    /* JADX INFO: renamed from: b */
    private final C6704c f60147b;

    /* JADX INFO: renamed from: c */
    private final C6703b f60148c;

    /* JADX INFO: renamed from: d */
    private int f60149d;

    /* JADX INFO: renamed from: e */
    private int f60150e;

    /* JADX INFO: renamed from: f */
    private int f60151f;

    /* JADX INFO: renamed from: g */
    private int f60152g;

    /* JADX INFO: renamed from: h */
    private int f60153h;

    /* JADX INFO: renamed from: i */
    private int f60154i;

    public C6575z(int i10) {
        this.f60146a = i10;
        if (!(i10 > 0)) {
            AbstractC6705d.a("maxSize <= 0");
        }
        this.f60147b = new C6704c(0, 0.75f);
        this.f60148c = new C6703b();
    }

    private final int h(Object obj, Object obj2) {
        int iJ = j(obj, obj2);
        if (!(iJ >= 0)) {
            AbstractC6705d.b("Negative size: " + obj + '=' + obj2);
        }
        return iJ;
    }

    protected Object a(Object key) {
        AbstractC5504s.h(key, "key");
        return null;
    }

    protected void b(boolean z10, Object key, Object oldValue, Object obj) {
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(oldValue, "oldValue");
    }

    public final void c() {
        l(-1);
    }

    public final Object d(Object key) {
        Object objD;
        AbstractC5504s.h(key, "key");
        synchronized (this.f60148c) {
            Object objA = this.f60147b.a(key);
            if (objA != null) {
                this.f60153h++;
                return objA;
            }
            this.f60154i++;
            Object objA2 = a(key);
            if (objA2 == null) {
                return null;
            }
            synchronized (this.f60148c) {
                try {
                    this.f60151f++;
                    objD = this.f60147b.d(key, objA2);
                    if (objD != null) {
                        this.f60147b.d(key, objD);
                    } else {
                        this.f60149d += h(key, objA2);
                        Td.L l10 = Td.L.f17438a;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (objD != null) {
                b(false, key, objA2, objD);
                return objD;
            }
            l(this.f60146a);
            return objA2;
        }
    }

    public final int e() {
        int i10;
        synchronized (this.f60148c) {
            i10 = this.f60146a;
        }
        return i10;
    }

    public final Object f(Object key, Object value) {
        Object objD;
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(value, "value");
        synchronized (this.f60148c) {
            try {
                this.f60150e++;
                this.f60149d += h(key, value);
                objD = this.f60147b.d(key, value);
                if (objD != null) {
                    this.f60149d -= h(key, objD);
                }
                Td.L l10 = Td.L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (objD != null) {
            b(false, key, objD, value);
        }
        l(this.f60146a);
        return objD;
    }

    public final Object g(Object key) {
        Object objE;
        AbstractC5504s.h(key, "key");
        synchronized (this.f60148c) {
            try {
                objE = this.f60147b.e(key);
                if (objE != null) {
                    this.f60149d -= h(key, objE);
                }
                Td.L l10 = Td.L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (objE != null) {
            b(false, key, objE, null);
        }
        return objE;
    }

    public final int i() {
        int i10;
        synchronized (this.f60148c) {
            i10 = this.f60149d;
        }
        return i10;
    }

    protected int j(Object key, Object value) {
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(value, "value");
        return 1;
    }

    public final Map k() {
        LinkedHashMap linkedHashMap;
        synchronized (this.f60148c) {
            linkedHashMap = new LinkedHashMap(this.f60147b.b().size());
            for (Map.Entry entry : this.f60147b.b()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0062, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l(int r7) {
        /*
            r6 = this;
        L0:
            u.b r0 = r6.f60148c
            monitor-enter(r0)
            int r1 = r6.f60149d     // Catch: java.lang.Throwable -> L15
            r2 = 1
            if (r1 < 0) goto L19
            u.c r1 = r6.f60147b     // Catch: java.lang.Throwable -> L15
            boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L17
            int r1 = r6.f60149d     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L19
            goto L17
        L15:
            r7 = move-exception
            goto L63
        L17:
            r1 = r2
            goto L1a
        L19:
            r1 = 0
        L1a:
            if (r1 != 0) goto L21
            java.lang.String r1 = "LruCache.sizeOf() is reporting inconsistent results!"
            u.AbstractC6705d.b(r1)     // Catch: java.lang.Throwable -> L15
        L21:
            int r1 = r6.f60149d     // Catch: java.lang.Throwable -> L15
            if (r1 <= r7) goto L61
            u.c r1 = r6.f60147b     // Catch: java.lang.Throwable -> L15
            boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L2e
            goto L61
        L2e:
            u.c r1 = r6.f60147b     // Catch: java.lang.Throwable -> L15
            java.util.Set r1 = r1.b()     // Catch: java.lang.Throwable -> L15
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L15
            java.lang.Object r1 = Ud.AbstractC2279u.n0(r1)     // Catch: java.lang.Throwable -> L15
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L40
            monitor-exit(r0)
            return
        L40:
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> L15
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L15
            u.c r4 = r6.f60147b     // Catch: java.lang.Throwable -> L15
            r4.e(r3)     // Catch: java.lang.Throwable -> L15
            int r4 = r6.f60149d     // Catch: java.lang.Throwable -> L15
            int r5 = r6.h(r3, r1)     // Catch: java.lang.Throwable -> L15
            int r4 = r4 - r5
            r6.f60149d = r4     // Catch: java.lang.Throwable -> L15
            int r4 = r6.f60152g     // Catch: java.lang.Throwable -> L15
            int r4 = r4 + r2
            r6.f60152g = r4     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)
            r0 = 0
            r6.b(r2, r3, r1, r0)
            goto L0
        L61:
            monitor-exit(r0)
            return
        L63:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C6575z.l(int):void");
    }

    public String toString() {
        String str;
        synchronized (this.f60148c) {
            try {
                int i10 = this.f60153h;
                int i11 = this.f60154i + i10;
                str = "LruCache[maxSize=" + this.f60146a + ",hits=" + this.f60153h + ",misses=" + this.f60154i + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
