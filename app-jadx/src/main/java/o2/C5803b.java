package o2;

import Gf.G0;
import Gf.O;
import Zd.i;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: o2.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5803b implements AutoCloseable, O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f54228a;

    public C5803b(i coroutineContext) {
        AbstractC5504s.h(coroutineContext, "coroutineContext");
        this.f54228a = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        G0.f(getCoroutineContext(), null, 1, null);
    }

    @Override // Gf.O
    public i getCoroutineContext() {
        return this.f54228a;
    }
}
