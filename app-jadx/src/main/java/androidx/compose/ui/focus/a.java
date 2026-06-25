package androidx.compose.ui.focus;

import I0.InterfaceC1677c;
import K0.AbstractC1789g0;
import K0.AbstractC1796k;
import K0.AbstractC1800m;
import K0.C1781c0;
import K0.J;
import a0.C2507c;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.d;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final Object a(FocusTargetNode focusTargetNode, int i10, Function1 function1) {
        e.c cVarH;
        InterfaceC1677c interfaceC1677cK1;
        int iC;
        C1781c0 c1781c0T0;
        int iA = AbstractC1789g0.a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (!focusTargetNode.getNode().isAttached()) {
            H0.a.b("visitAncestors called on an unattached node");
        }
        e.c parent$ui_release = focusTargetNode.getNode().getParent$ui_release();
        J jN = AbstractC1796k.n(focusTargetNode);
        loop0: while (true) {
            if (jN == null) {
                cVarH = null;
                break;
            }
            if ((jN.t0().k().getAggregateChildKindSet$ui_release() & iA) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & iA) != 0) {
                        cVarH = parent$ui_release;
                        C2507c c2507c = null;
                        while (cVarH != null) {
                            if (cVarH instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((cVarH.getKindSet$ui_release() & iA) != 0 && (cVarH instanceof AbstractC1800m)) {
                                int i11 = 0;
                                for (e.c cVarF1 = ((AbstractC1800m) cVarH).F1(); cVarF1 != null; cVarF1 = cVarF1.getChild$ui_release()) {
                                    if ((cVarF1.getKindSet$ui_release() & iA) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            cVarH = cVarF1;
                                        } else {
                                            if (c2507c == null) {
                                                c2507c = new C2507c(new e.c[16], 0);
                                            }
                                            if (cVarH != null) {
                                                c2507c.c(cVarH);
                                                cVarH = null;
                                            }
                                            c2507c.c(cVarF1);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            cVarH = AbstractC1796k.h(c2507c);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            jN = jN.A0();
            parent$ui_release = (jN == null || (c1781c0T0 = jN.t0()) == null) ? null : c1781c0T0.p();
        }
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarH;
        if ((focusTargetNode2 != null && AbstractC5504s.c(focusTargetNode2.K1(), focusTargetNode.K1())) || (interfaceC1677cK1 = focusTargetNode.K1()) == null) {
            return null;
        }
        d.a aVar = d.f26651b;
        if (d.l(i10, aVar.h())) {
            iC = InterfaceC1677c.b.f8691a.a();
        } else if (d.l(i10, aVar.a())) {
            iC = InterfaceC1677c.b.f8691a.d();
        } else if (d.l(i10, aVar.d())) {
            iC = InterfaceC1677c.b.f8691a.e();
        } else if (d.l(i10, aVar.g())) {
            iC = InterfaceC1677c.b.f8691a.f();
        } else if (d.l(i10, aVar.e())) {
            iC = InterfaceC1677c.b.f8691a.b();
        } else {
            if (!d.l(i10, aVar.f())) {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout");
            }
            iC = InterfaceC1677c.b.f8691a.c();
        }
        return interfaceC1677cK1.a(iC, function1);
    }
}
