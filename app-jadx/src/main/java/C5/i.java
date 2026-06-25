package C5;

import java.util.IdentityHashMap;
import java.util.Map;
import y5.k;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f2871d = new IdentityHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f2872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2873b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f2874c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a extends RuntimeException {
        public a() {
            super("Null shared reference");
        }
    }

    public i(Object obj, h hVar, boolean z10) {
        this.f2872a = k.g(obj);
        this.f2874c = hVar;
        if (z10) {
            a(obj);
        }
    }

    private static void a(Object obj) {
        Map map = f2871d;
        synchronized (map) {
            try {
                Integer num = (Integer) map.get(obj);
                if (num == null) {
                    map.put(obj, 1);
                } else {
                    map.put(obj, Integer.valueOf(num.intValue() + 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private synchronized int c() {
        int i10;
        e();
        k.b(Boolean.valueOf(this.f2873b > 0));
        i10 = this.f2873b - 1;
        this.f2873b = i10;
        return i10;
    }

    private void e() {
        if (!h(this)) {
            throw new a();
        }
    }

    public static boolean h(i iVar) {
        return iVar != null && iVar.g();
    }

    private static void i(Object obj) {
        Map map = f2871d;
        synchronized (map) {
            try {
                Integer num = (Integer) map.get(obj);
                if (num == null) {
                    AbstractC7283a.N("SharedReference", "No entry in sLiveObjects for value of type %s", obj.getClass());
                } else if (num.intValue() == 1) {
                    map.remove(obj);
                } else {
                    map.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void b() {
        e();
        this.f2873b++;
    }

    public void d() {
        Object obj;
        if (c() == 0) {
            synchronized (this) {
                obj = this.f2872a;
                this.f2872a = null;
            }
            if (obj != null) {
                h hVar = this.f2874c;
                if (hVar != null) {
                    hVar.a(obj);
                }
                i(obj);
            }
        }
    }

    public synchronized Object f() {
        return this.f2872a;
    }

    public synchronized boolean g() {
        return this.f2873b > 0;
    }
}
