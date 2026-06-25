package io.sentry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: io.sentry.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5303w implements C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f51529a = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5322z3 f51530b;

    public C5303w(C5322z3 c5322z3) {
        this.f51530b = (C5322z3) io.sentry.util.w.c(c5322z3, "options are required");
    }

    private static List c(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        while (th2.getCause() != null) {
            arrayList.add(th2.getCause());
            th2 = th2.getCause();
        }
        return arrayList;
    }

    private static boolean d(Map map, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (map.containsKey(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.sentry.C
    public V2 b(V2 v22, H h10) {
        if (!this.f51530b.isEnableDeduplication()) {
            this.f51530b.getLogger().c(EnumC5215i3.DEBUG, "Event deduplication is disabled.", new Object[0]);
            return v22;
        }
        Throwable thO = v22.O();
        if (thO == null) {
            return v22;
        }
        if (this.f51529a.containsKey(thO) || d(this.f51529a, c(thO))) {
            this.f51530b.getLogger().c(EnumC5215i3.DEBUG, "Duplicate Exception detected. Event %s will be discarded.", v22.G());
            return null;
        }
        this.f51529a.put(thO, null);
        return v22;
    }
}
