package Lf;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Lf.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1896c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f11565a = AtomicReferenceFieldUpdater.newUpdater(AbstractC1896c.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f11566b = AtomicReferenceFieldUpdater.newUpdater(AbstractC1896c.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public AbstractC1896c(AbstractC1896c abstractC1896c) {
        this._prev$volatile = abstractC1896c;
    }

    private final AbstractC1896c d() {
        AbstractC1896c abstractC1896cH = h();
        while (abstractC1896cH != null && abstractC1896cH.k()) {
            abstractC1896cH = (AbstractC1896c) f11566b.get(abstractC1896cH);
        }
        return abstractC1896cH;
    }

    private final AbstractC1896c e() {
        AbstractC1896c abstractC1896cF;
        AbstractC1896c abstractC1896cF2 = f();
        AbstractC5504s.e(abstractC1896cF2);
        while (abstractC1896cF2.k() && (abstractC1896cF = abstractC1896cF2.f()) != null) {
            abstractC1896cF2 = abstractC1896cF;
        }
        return abstractC1896cF2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g() {
        return f11565a.get(this);
    }

    public final void c() {
        f11566b.set(this, null);
    }

    public final AbstractC1896c f() {
        Object objG = g();
        if (objG == AbstractC1895b.f11564a) {
            return null;
        }
        return (AbstractC1896c) objG;
    }

    public final AbstractC1896c h() {
        return (AbstractC1896c) f11566b.get(this);
    }

    public abstract boolean k();

    public final boolean l() {
        return f() == null;
    }

    public final boolean m() {
        return androidx.concurrent.futures.b.a(f11565a, this, null, AbstractC1895b.f11564a);
    }

    public final void n() {
        Object obj;
        if (l()) {
            return;
        }
        while (true) {
            AbstractC1896c abstractC1896cD = d();
            AbstractC1896c abstractC1896cE = e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11566b;
            do {
                obj = atomicReferenceFieldUpdater.get(abstractC1896cE);
            } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, abstractC1896cE, obj, ((AbstractC1896c) obj) == null ? null : abstractC1896cD));
            if (abstractC1896cD != null) {
                f11565a.set(abstractC1896cD, abstractC1896cE);
            }
            if (!abstractC1896cE.k() || abstractC1896cE.l()) {
                if (abstractC1896cD == null || !abstractC1896cD.k()) {
                    return;
                }
            }
        }
    }

    public final boolean o(AbstractC1896c abstractC1896c) {
        return androidx.concurrent.futures.b.a(f11565a, this, null, abstractC1896c);
    }
}
