package i0;

import b0.AbstractC2964a;
import b0.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: i0.F, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4962F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f48395a = new Object();

    public static final C4961E a(int i10, Function1 function1) {
        if (i10 == 0) {
            return new C4961E();
        }
        e.a aVarBuilder = AbstractC2964a.b().builder();
        for (int i11 = 0; i11 < i10; i11++) {
            aVarBuilder.add(function1.invoke(Integer.valueOf(i11)));
        }
        return new C4961E(aVarBuilder.build());
    }

    public static final boolean f(C4971O c4971o, int i10, b0.e eVar, boolean z10) {
        boolean z11;
        synchronized (f48395a) {
            try {
                if (c4971o.j() == i10) {
                    c4971o.l(eVar);
                    z11 = true;
                    if (z10) {
                        c4971o.n(c4971o.k() + 1);
                    }
                    c4971o.m(c4971o.j() + 1);
                } else {
                    z11 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    public static final C4971O g(C4961E c4961e) {
        AbstractC4978W abstractC4978WL = c4961e.l();
        AbstractC5504s.f(abstractC4978WL, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.<get-readable>>");
        return (C4971O) AbstractC5003v.e0((C4971O) abstractC4978WL, c4961e);
    }

    public static final int h(C4961E c4961e) {
        AbstractC4978W abstractC4978WL = c4961e.l();
        AbstractC5504s.f(abstractC4978WL, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
        return ((C4971O) AbstractC5003v.K((C4971O) abstractC4978WL)).k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void i() {
        throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void j() {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    public static final boolean k(C4961E c4961e, Function1 function1) {
        int iJ;
        b0.e eVarI;
        Object objInvoke;
        AbstractC4993l abstractC4993lC;
        boolean zF;
        do {
            synchronized (f48395a) {
                AbstractC4978W abstractC4978WL = c4961e.l();
                AbstractC5504s.f(abstractC4978WL, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C4971O c4971o = (C4971O) AbstractC5003v.K((C4971O) abstractC4978WL);
                iJ = c4971o.j();
                eVarI = c4971o.i();
                Td.L l10 = Td.L.f17438a;
            }
            AbstractC5504s.e(eVarI);
            e.a aVarBuilder = eVarI.builder();
            objInvoke = function1.invoke(aVarBuilder);
            b0.e eVarBuild = aVarBuilder.build();
            if (AbstractC5504s.c(eVarBuild, eVarI)) {
                break;
            }
            AbstractC4978W abstractC4978WL2 = c4961e.l();
            AbstractC5504s.f(abstractC4978WL2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            C4971O c4971o2 = (C4971O) abstractC4978WL2;
            synchronized (AbstractC5003v.O()) {
                abstractC4993lC = AbstractC4993l.f48495e.c();
                zF = f((C4971O) AbstractC5003v.p0(c4971o2, c4961e, abstractC4993lC), iJ, eVarBuild, true);
            }
            AbstractC5003v.X(abstractC4993lC, c4961e);
        } while (!zF);
        return ((Boolean) objInvoke).booleanValue();
    }

    public static final AbstractC4978W l(C4961E c4961e, b0.e eVar) {
        AbstractC4993l abstractC4993lM = AbstractC5003v.M();
        C4971O c4971o = new C4971O(abstractC4993lM.i(), eVar);
        if (!(abstractC4993lM instanceof C4983b)) {
            c4971o.g(new C4971O(AbstractC4998q.c(1), eVar));
        }
        return c4971o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException("index (" + i10 + ") is out of bound of [0, " + i11 + ')');
        }
    }
}
