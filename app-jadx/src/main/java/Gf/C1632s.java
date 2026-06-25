package Gf;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: Gf.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1632s extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f7608c = AtomicIntegerFieldUpdater.newUpdater(C1632s.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public C1632s(Zd.e eVar, Throwable th2, boolean z10) {
        if (th2 == null) {
            th2 = new CancellationException("Continuation " + eVar + " was cancelled normally");
        }
        super(th2, z10);
    }

    public final boolean e() {
        return f7608c.compareAndSet(this, 0, 1);
    }
}
