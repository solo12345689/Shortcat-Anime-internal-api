package Lf;

import Gf.AbstractC1602c0;
import Gf.AbstractC1620l0;
import Gf.C1627p;
import Gf.InterfaceC1623n;
import Gf.T;
import Gf.Z0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Lf.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1902i extends AbstractC1602c0 implements kotlin.coroutines.jvm.internal.e, Zd.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f11570h = AtomicReferenceFieldUpdater.newUpdater(C1902i.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Gf.K f11571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Zd.e f11572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f11573f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f11574g;

    public C1902i(Gf.K k10, Zd.e eVar) {
        super(-1);
        this.f11571d = k10;
        this.f11572e = eVar;
        this.f11573f = AbstractC1903j.f11575a;
        this.f11574g = L.g(getContext());
    }

    private final C1627p m() {
        Object obj = f11570h.get(this);
        if (obj instanceof C1627p) {
            return (C1627p) obj;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        Zd.e eVar = this.f11572e;
        if (eVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) eVar;
        }
        return null;
    }

    @Override // Zd.e
    public Zd.i getContext() {
        return this.f11572e.getContext();
    }

    @Override // Gf.AbstractC1602c0
    public Object h() {
        Object obj = this.f11573f;
        this.f11573f = AbstractC1903j.f11575a;
        return obj;
    }

    public final void i() {
        while (f11570h.get(this) == AbstractC1903j.f11576b) {
        }
    }

    public final C1627p k() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11570h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f11570h.set(this, AbstractC1903j.f11576b);
                return null;
            }
            if (obj instanceof C1627p) {
                if (androidx.concurrent.futures.b.a(f11570h, this, obj, AbstractC1903j.f11576b)) {
                    return (C1627p) obj;
                }
            } else if (obj != AbstractC1903j.f11576b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void l(Zd.i iVar, Object obj) {
        this.f11573f = obj;
        this.f7553c = 1;
        this.f11571d.O1(iVar, this);
    }

    public final boolean o() {
        return f11570h.get(this) != null;
    }

    public final boolean q(Throwable th2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11570h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            E e10 = AbstractC1903j.f11576b;
            if (AbstractC5504s.c(obj, e10)) {
                if (androidx.concurrent.futures.b.a(f11570h, this, e10, th2)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (androidx.concurrent.futures.b.a(f11570h, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void r() {
        i();
        C1627p c1627pM = m();
        if (c1627pM != null) {
            c1627pM.q();
        }
    }

    @Override // Zd.e
    public void resumeWith(Object obj) {
        Object objB = Gf.E.b(obj);
        if (AbstractC1903j.d(this.f11571d, getContext())) {
            this.f11573f = objB;
            this.f7553c = 0;
            AbstractC1903j.c(this.f11571d, getContext(), this);
            return;
        }
        AbstractC1620l0 abstractC1620l0B = Z0.f7544a.b();
        if (abstractC1620l0B.i2()) {
            this.f11573f = objB;
            this.f7553c = 0;
            abstractC1620l0B.e2(this);
            return;
        }
        abstractC1620l0B.g2(true);
        try {
            Zd.i context = getContext();
            Object objI = L.i(context, this.f11574g);
            try {
                this.f11572e.resumeWith(obj);
                Td.L l10 = Td.L.f17438a;
                while (abstractC1620l0B.l2()) {
                }
            } finally {
                L.f(context, objI);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final Throwable s(InterfaceC1623n interfaceC1623n) {
        E e10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11570h;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            e10 = AbstractC1903j.f11576b;
            if (obj != e10) {
                if (obj instanceof Throwable) {
                    if (androidx.concurrent.futures.b.a(f11570h, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.b.a(f11570h, this, e10, interfaceC1623n));
        return null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f11571d + ", " + T.c(this.f11572e) + ']';
    }

    @Override // Gf.AbstractC1602c0
    public Zd.e d() {
        return this;
    }
}
