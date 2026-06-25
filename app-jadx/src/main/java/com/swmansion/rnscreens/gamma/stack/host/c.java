package com.swmansion.rnscreens.gamma.stack.host;

import androidx.fragment.app.K;
import androidx.fragment.app.U;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {
    private final void a(U u10, boolean z10) {
        if (z10) {
            u10.i();
        } else {
            u10.h();
        }
    }

    private final void b(U u10, boolean z10) {
        if (z10) {
            u10.k();
        } else {
            u10.j();
        }
    }

    private final void c(U u10, boolean z10, boolean z11) {
        if (z11) {
            b(u10, z10);
        } else {
            a(u10, z10);
        }
    }

    static /* synthetic */ void d(c cVar, U u10, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        cVar.c(u10, z10, z11);
    }

    public static /* synthetic */ void g(c cVar, K k10, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        cVar.f(k10, list, z10);
    }

    public final void e(K fragmentManager, a op) {
        AbstractC5504s.h(fragmentManager, "fragmentManager");
        AbstractC5504s.h(op, "op");
        U uA = Xa.c.a(fragmentManager);
        uA.b(op.d(), op.e());
        if (op.b()) {
            uA.g(op.e().w().getScreenKey());
        }
        d(this, uA, op.c(), false, 4, null);
    }

    public final void f(K fragmentManager, List ops, boolean z10) {
        AbstractC5504s.h(fragmentManager, "fragmentManager");
        AbstractC5504s.h(ops, "ops");
        Iterator it = ops.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(fragmentManager, this);
        }
        if (z10) {
            fragmentManager.l0();
        }
    }

    public final void h(K fragmentManager, d op) {
        AbstractC5504s.h(fragmentManager, "fragmentManager");
        AbstractC5504s.h(op, "op");
        fragmentManager.g1(op.b().w().getScreenKey(), 1);
    }

    public final void i(K fragmentManager, g op) {
        AbstractC5504s.h(fragmentManager, "fragmentManager");
        AbstractC5504s.h(op, "op");
        U uA = Xa.c.a(fragmentManager);
        uA.u(op.b());
        c(uA, true, false);
    }
}
