package T1;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: T1.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2138b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicInteger f16796a;

    public C2138b(int i10) {
        this.f16796a = new AtomicInteger(i10);
    }

    public final int a() {
        return this.f16796a.decrementAndGet();
    }

    public final int b() {
        return this.f16796a.get();
    }

    public final int c() {
        return this.f16796a.getAndIncrement();
    }

    public final int d() {
        return this.f16796a.incrementAndGet();
    }
}
