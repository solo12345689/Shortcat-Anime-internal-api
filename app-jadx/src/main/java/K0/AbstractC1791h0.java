package K0;

import androidx.compose.ui.e;
import androidx.compose.ui.focus.FocusTargetNode;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import q0.AbstractC6059e;
import q0.AbstractC6066l;
import q0.InterfaceC6058d;
import q0.InterfaceC6065k;
import t.C6545K;

/* JADX INFO: renamed from: K0.h0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1791h0 {

    /* JADX INFO: renamed from: a */
    private static final C6545K f10764a = t.U.b();

    public static final void a(e.c cVar) {
        if (!cVar.isAttached()) {
            H0.a.b("autoInvalidateInsertedNode called on unattached node");
        }
        b(cVar, -1, 1);
    }

    public static final void b(e.c cVar, int i10, int i11) {
        if (!(cVar instanceof AbstractC1800m)) {
            c(cVar, i10 & cVar.getKindSet$ui_release(), i11);
            return;
        }
        AbstractC1800m abstractC1800m = (AbstractC1800m) cVar;
        c(cVar, abstractC1800m.G1() & i10, i11);
        int i12 = (~abstractC1800m.G1()) & i10;
        for (e.c cVarF1 = abstractC1800m.F1(); cVarF1 != null; cVarF1 = cVarF1.getChild$ui_release()) {
            b(cVarF1, i12, i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void c(e.c cVar, int i10, int i11) {
        if (i11 != 0 || cVar.getShouldAutoInvalidate()) {
            if ((AbstractC1789g0.a(2) & i10) != 0 && (cVar instanceof E)) {
                H.b((E) cVar);
                if (i11 == 2) {
                    AbstractC1796k.i(cVar, AbstractC1789g0.a(2)).j3();
                }
            }
            if ((AbstractC1789g0.a(128) & i10) != 0 && (cVar instanceof D) && i11 != 2) {
                AbstractC1796k.n(cVar).R0();
            }
            if ((AbstractC1789g0.a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) & i10) != 0 && (cVar instanceof InterfaceC1808v)) {
                if (i11 == 1) {
                    J jN = AbstractC1796k.n(cVar);
                    jN.O1(jN.U() + 1);
                } else if (i11 == 2) {
                    AbstractC1796k.n(cVar).O1(r1.U() - 1);
                }
                if (i11 != 2) {
                    AbstractC1796k.n(cVar).T0();
                }
            }
            if ((AbstractC1789g0.a(4) & i10) != 0 && (cVar instanceof InterfaceC1806t)) {
                AbstractC1807u.a((InterfaceC1806t) cVar);
            }
            if ((AbstractC1789g0.a(8) & i10) != 0 && (cVar instanceof A0)) {
                AbstractC1796k.n(cVar).b2(true);
            }
            if ((AbstractC1789g0.a(64) & i10) != 0 && (cVar instanceof s0)) {
                t0.a((s0) cVar);
            }
            if ((AbstractC1789g0.a(2048) & i10) != 0 && (cVar instanceof InterfaceC6065k)) {
                InterfaceC6065k interfaceC6065k = (InterfaceC6065k) cVar;
                if (j(interfaceC6065k)) {
                    AbstractC6066l.a(interfaceC6065k);
                }
            }
            if ((i10 & AbstractC1789g0.a(4096)) == 0 || !(cVar instanceof InterfaceC6058d)) {
                return;
            }
            AbstractC6059e.a((InterfaceC6058d) cVar);
        }
    }

    public static final void d(e.c cVar) {
        if (!cVar.isAttached()) {
            H0.a.b("autoInvalidateRemovedNode called on unattached node");
        }
        b(cVar, -1, 2);
    }

    public static final void e(e.c cVar) {
        if (!cVar.isAttached()) {
            H0.a.b("autoInvalidateUpdatedNode called on unattached node");
        }
        b(cVar, -1, 0);
    }

    public static final int f(e.b bVar) {
        int iA = AbstractC1789g0.a(1);
        if (bVar instanceof I0.v) {
            iA |= AbstractC1789g0.a(2);
        }
        if (bVar instanceof p0.i) {
            iA |= AbstractC1789g0.a(4);
        }
        if (bVar instanceof R0.q) {
            iA |= AbstractC1789g0.a(8);
        }
        if (bVar instanceof E0.J) {
            iA |= AbstractC1789g0.a(16);
        }
        if ((bVar instanceof J0.d) || (bVar instanceof J0.j)) {
            iA |= AbstractC1789g0.a(32);
        }
        if (bVar instanceof I0.G) {
            iA |= AbstractC1789g0.a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
        }
        if (bVar instanceof I0.H) {
            iA |= AbstractC1789g0.a(64);
        }
        return bVar instanceof O0.a ? AbstractC1789g0.a(524288) | iA : iA;
    }

    public static final int g(e.c cVar) {
        if (cVar.getKindSet$ui_release() != 0) {
            return cVar.getKindSet$ui_release();
        }
        C6545K c6545k = f10764a;
        Object objB = l0.d.b(cVar);
        int iB = c6545k.b(objB);
        if (iB >= 0) {
            return c6545k.f60002c[iB];
        }
        int iA = AbstractC1789g0.a(1);
        if (cVar instanceof E) {
            iA |= AbstractC1789g0.a(2);
        }
        if (cVar instanceof InterfaceC1806t) {
            iA |= AbstractC1789g0.a(4);
        }
        if (cVar instanceof A0) {
            iA |= AbstractC1789g0.a(8);
        }
        if (cVar instanceof v0) {
            iA |= AbstractC1789g0.a(16);
        }
        if (cVar instanceof J0.h) {
            iA |= AbstractC1789g0.a(32);
        }
        if (cVar instanceof s0) {
            iA |= AbstractC1789g0.a(64);
        }
        if (cVar instanceof D) {
            iA |= AbstractC1789g0.a(128);
        }
        if (cVar instanceof InterfaceC1808v) {
            iA |= AbstractC1789g0.a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
        }
        if (cVar instanceof FocusTargetNode) {
            iA |= AbstractC1789g0.a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        }
        if (cVar instanceof InterfaceC6065k) {
            iA |= AbstractC1789g0.a(2048);
        }
        if (cVar instanceof InterfaceC6058d) {
            iA |= AbstractC1789g0.a(4096);
        }
        if (cVar instanceof C0.e) {
            iA |= AbstractC1789g0.a(8192);
        }
        if (cVar instanceof G0.a) {
            iA |= AbstractC1789g0.a(16384);
        }
        if (cVar instanceof InterfaceC1790h) {
            iA |= AbstractC1789g0.a(32768);
        }
        if (cVar instanceof I0) {
            iA |= AbstractC1789g0.a(262144);
        }
        if (cVar instanceof O0.a) {
            iA |= AbstractC1789g0.a(524288);
        }
        c6545k.u(objB, iA);
        return iA;
    }

    public static final int h(e.c cVar) {
        if (!(cVar instanceof AbstractC1800m)) {
            return g(cVar);
        }
        AbstractC1800m abstractC1800m = (AbstractC1800m) cVar;
        int iG1 = abstractC1800m.G1();
        for (e.c cVarF1 = abstractC1800m.F1(); cVarF1 != null; cVarF1 = cVarF1.getChild$ui_release()) {
            iG1 |= h(cVarF1);
        }
        return iG1;
    }

    public static final boolean i(int i10) {
        return (i10 & AbstractC1789g0.a(128)) != 0;
    }

    private static final boolean j(InterfaceC6065k interfaceC6065k) {
        C1784e c1784e = C1784e.f10687a;
        c1784e.p();
        interfaceC6065k.P0(c1784e);
        return c1784e.o();
    }
}
