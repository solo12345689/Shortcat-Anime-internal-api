package io.sentry.clientreport;

import io.sentry.EnumC5221k;
import io.sentry.util.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f50611a = new p(new p.a() { // from class: io.sentry.clientreport.a
        @Override // io.sentry.util.p.a
        public final Object a() {
            return b.c();
        }
    });

    public static /* synthetic */ Map c() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (f fVar : f.values()) {
            for (EnumC5221k enumC5221k : EnumC5221k.values()) {
                concurrentHashMap.put(new d(fVar.getReason(), enumC5221k.getCategory()), new AtomicLong(0L));
            }
        }
        return Collections.unmodifiableMap(concurrentHashMap);
    }

    @Override // io.sentry.clientreport.i
    public void a(d dVar, Long l10) {
        AtomicLong atomicLong = (AtomicLong) ((Map) this.f50611a.a()).get(dVar);
        if (atomicLong != null) {
            atomicLong.addAndGet(l10.longValue());
        }
    }

    @Override // io.sentry.clientreport.i
    public List b() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((Map) this.f50611a.a()).entrySet()) {
            long andSet = ((AtomicLong) entry.getValue()).getAndSet(0L);
            Long lValueOf = Long.valueOf(andSet);
            if (andSet > 0) {
                arrayList.add(new g(((d) entry.getKey()).b(), ((d) entry.getKey()).a(), lValueOf));
            }
        }
        return arrayList;
    }
}
