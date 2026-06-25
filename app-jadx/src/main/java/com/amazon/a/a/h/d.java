package com.amazon.a.a.h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f34352a = new com.amazon.a.a.o.c("MetricsManagerImpl");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f34353b = new b();

    @Override // com.amazon.a.a.h.c
    public synchronized void a(a aVar) {
        try {
            if (com.amazon.a.a.o.c.f34699a) {
                f34352a.a("Recording Metric: " + aVar);
            }
            this.f34353b.a(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.amazon.a.a.h.c
    public synchronized b a() {
        if (this.f34353b.a()) {
            return this.f34353b;
        }
        b bVar = this.f34353b;
        this.f34353b = new b();
        return bVar;
    }
}
