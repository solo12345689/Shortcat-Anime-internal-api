package o5;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: o5.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C5831h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f54540a = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f54541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f54542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f54543d;

    /* JADX INFO: renamed from: o5.h$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f54544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f54545b;

        a(Object obj, int i10) {
            this.f54544a = obj;
            this.f54545b = i10;
        }
    }

    public C5831h(long j10) {
        this.f54541b = j10;
        this.f54542c = j10;
    }

    private void f() {
        m(this.f54542c);
    }

    public void b() {
        m(0L);
    }

    public synchronized Object g(Object obj) {
        a aVar;
        aVar = (a) this.f54540a.get(obj);
        return aVar != null ? aVar.f54544a : null;
    }

    public synchronized long h() {
        return this.f54542c;
    }

    protected int i(Object obj) {
        return 1;
    }

    public synchronized Object k(Object obj, Object obj2) {
        int i10 = i(obj2);
        long j10 = i10;
        if (j10 >= this.f54542c) {
            j(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f54543d += j10;
        }
        a aVar = (a) this.f54540a.put(obj, obj2 == null ? null : new a(obj2, i10));
        if (aVar != null) {
            this.f54543d -= (long) aVar.f54545b;
            if (!aVar.f54544a.equals(obj2)) {
                j(obj, aVar.f54544a);
            }
        }
        f();
        return aVar != null ? aVar.f54544a : null;
    }

    public synchronized Object l(Object obj) {
        a aVar = (a) this.f54540a.remove(obj);
        if (aVar == null) {
            return null;
        }
        this.f54543d -= (long) aVar.f54545b;
        return aVar.f54544a;
    }

    protected synchronized void m(long j10) {
        while (this.f54543d > j10) {
            Iterator it = this.f54540a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            a aVar = (a) entry.getValue();
            this.f54543d -= (long) aVar.f54545b;
            Object key = entry.getKey();
            it.remove();
            j(key, aVar.f54544a);
        }
    }

    protected void j(Object obj, Object obj2) {
    }
}
