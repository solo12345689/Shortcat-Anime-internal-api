package Nf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.N;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f12877b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f12878c = AtomicIntegerFieldUpdater.newUpdater(l.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f12879d = AtomicIntegerFieldUpdater.newUpdater(l.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f12880e = AtomicIntegerFieldUpdater.newUpdater(l.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReferenceArray f12881a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    private final h b(h hVar) {
        if (e() == 127) {
            return hVar;
        }
        if (hVar.f12868b) {
            f12880e.incrementAndGet(this);
        }
        int i10 = f12878c.get(this) & 127;
        while (this.f12881a.get(i10) != null) {
            Thread.yield();
        }
        this.f12881a.lazySet(i10, hVar);
        f12878c.incrementAndGet(this);
        return null;
    }

    private final void c(h hVar) {
        if (hVar == null || !hVar.f12868b) {
            return;
        }
        f12880e.decrementAndGet(this);
    }

    private final int e() {
        return f12878c.get(this) - f12879d.get(this);
    }

    private final h m() {
        h hVar;
        while (true) {
            int i10 = f12879d.get(this);
            if (i10 - f12878c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (f12879d.compareAndSet(this, i10, i10 + 1) && (hVar = (h) this.f12881a.getAndSet(i11, null)) != null) {
                c(hVar);
                return hVar;
            }
        }
    }

    private final boolean n(d dVar) {
        h hVarM = m();
        if (hVarM == null) {
            return false;
        }
        dVar.a(hVarM);
        return true;
    }

    private final h o(boolean z10) {
        h hVar;
        do {
            hVar = (h) f12877b.get(this);
            if (hVar == null || hVar.f12868b != z10) {
                int i10 = f12879d.get(this);
                int i11 = f12878c.get(this);
                while (i10 != i11) {
                    if (z10 && f12880e.get(this) == 0) {
                        return null;
                    }
                    i11--;
                    h hVarQ = q(i11, z10);
                    if (hVarQ != null) {
                        return hVarQ;
                    }
                }
                return null;
            }
        } while (!androidx.concurrent.futures.b.a(f12877b, this, hVar, null));
        return hVar;
    }

    private final h p(int i10) {
        int i11 = f12879d.get(this);
        int i12 = f12878c.get(this);
        boolean z10 = i10 == 1;
        while (i11 != i12) {
            if (z10 && f12880e.get(this) == 0) {
                return null;
            }
            int i13 = i11 + 1;
            h hVarQ = q(i11, z10);
            if (hVarQ != null) {
                return hVarQ;
            }
            i11 = i13;
        }
        return null;
    }

    private final h q(int i10, boolean z10) {
        int i11 = i10 & 127;
        h hVar = (h) this.f12881a.get(i11);
        if (hVar == null || hVar.f12868b != z10 || !If.l.a(this.f12881a, i11, hVar, null)) {
            return null;
        }
        if (z10) {
            f12880e.decrementAndGet(this);
        }
        return hVar;
    }

    private final long s(int i10, N n10) {
        h hVar;
        do {
            hVar = (h) f12877b.get(this);
            if (hVar == null) {
                return -2L;
            }
            if (((hVar.f12868b ? 1 : 2) & i10) == 0) {
                return -2L;
            }
            long jA = j.f12875f.a() - hVar.f12867a;
            long j10 = j.f12871b;
            if (jA < j10) {
                return j10 - jA;
            }
        } while (!androidx.concurrent.futures.b.a(f12877b, this, hVar, null));
        n10.f52259a = hVar;
        return -1L;
    }

    public final h a(h hVar, boolean z10) {
        if (z10) {
            return b(hVar);
        }
        h hVar2 = (h) f12877b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return b(hVar2);
    }

    public final int i() {
        return f12877b.get(this) != null ? e() + 1 : e();
    }

    public final void j(d dVar) {
        h hVar = (h) f12877b.getAndSet(this, null);
        if (hVar != null) {
            dVar.a(hVar);
        }
        while (n(dVar)) {
        }
    }

    public final h k() {
        h hVar = (h) f12877b.getAndSet(this, null);
        return hVar == null ? m() : hVar;
    }

    public final h l() {
        return o(true);
    }

    public final long r(int i10, N n10) {
        h hVarM = i10 == 3 ? m() : p(i10);
        if (hVarM == null) {
            return s(i10, n10);
        }
        n10.f52259a = hVarM;
        return -1L;
    }
}
