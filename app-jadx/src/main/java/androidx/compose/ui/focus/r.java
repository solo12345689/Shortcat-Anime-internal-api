package androidx.compose.ui.focus;

import I0.AbstractC1691q;
import K0.AbstractC1785e0;
import K0.AbstractC1789g0;
import K0.AbstractC1796k;
import K0.AbstractC1800m;
import K0.C1781c0;
import K0.J;
import a0.C2507c;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.d;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import i1.EnumC5027t;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import q0.C6055a;
import q0.InterfaceC6064j;
import r0.C6226h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f26688a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f26689b;

        static {
            int[] iArr = new int[EnumC5027t.values().length];
            try {
                iArr[EnumC5027t.f48573a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5027t.f48574b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f26688a = iArr;
            int[] iArr2 = new int[q0.o.values().length];
            try {
                iArr2[q0.o.f56121a.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[q0.o.f56122b.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[q0.o.f56123c.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[q0.o.f56124d.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f26689b = iArr2;
        }
    }

    public static final k a(FocusTargetNode focusTargetNode, int i10, EnumC5027t enumC5027t) {
        k kVarE;
        k kVar;
        k kVarB;
        i iVarJ1 = focusTargetNode.J1();
        d.a aVar = d.f26651b;
        if (d.l(i10, aVar.e())) {
            return iVarJ1.l();
        }
        if (d.l(i10, aVar.f())) {
            return iVarJ1.j();
        }
        if (d.l(i10, aVar.h())) {
            return iVarJ1.d();
        }
        if (d.l(i10, aVar.a())) {
            return iVarJ1.f();
        }
        if (d.l(i10, aVar.d())) {
            int i11 = a.f26688a[enumC5027t.ordinal()];
            if (i11 == 1) {
                kVarB = iVarJ1.b();
            } else {
                if (i11 != 2) {
                    throw new Td.r();
                }
                kVarB = iVarJ1.e();
            }
            kVar = kVarB != k.f26678b.b() ? kVarB : null;
            return kVar == null ? iVarJ1.a() : kVar;
        }
        if (d.l(i10, aVar.g())) {
            int i12 = a.f26688a[enumC5027t.ordinal()];
            if (i12 == 1) {
                kVarE = iVarJ1.e();
            } else {
                if (i12 != 2) {
                    throw new Td.r();
                }
                kVarE = iVarJ1.b();
            }
            kVar = kVarE != k.f26678b.b() ? kVarE : null;
            return kVar == null ? iVarJ1.c() : kVar;
        }
        if (!d.l(i10, aVar.b()) && !d.l(i10, aVar.c())) {
            throw new IllegalStateException("invalid FocusDirection");
        }
        C6055a c6055a = new C6055a(i10, null);
        InterfaceC6064j focusOwner = AbstractC1796k.o(focusTargetNode).getFocusOwner();
        FocusTargetNode focusTargetNodeJ = focusOwner.j();
        if (d.l(i10, aVar.b())) {
            iVarJ1.k().invoke(c6055a);
        } else {
            iVarJ1.m().invoke(c6055a);
        }
        return c6055a.c() ? k.f26678b.a() : focusTargetNodeJ != focusOwner.j() ? k.f26678b.c() : k.f26678b.b();
    }

    public static final FocusTargetNode b(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNodeJ = AbstractC1796k.o(focusTargetNode).getFocusOwner().j();
        if (focusTargetNodeJ == null || !focusTargetNodeJ.isAttached()) {
            return null;
        }
        return focusTargetNodeJ;
    }

    private static final FocusTargetNode c(FocusTargetNode focusTargetNode) {
        C1781c0 c1781c0T0;
        int iA = AbstractC1789g0.a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (!focusTargetNode.getNode().isAttached()) {
            H0.a.b("visitAncestors called on an unattached node");
        }
        e.c parent$ui_release = focusTargetNode.getNode().getParent$ui_release();
        J jN = AbstractC1796k.n(focusTargetNode);
        while (jN != null) {
            if ((jN.t0().k().getAggregateChildKindSet$ui_release() & iA) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & iA) != 0) {
                        e.c cVarH = parent$ui_release;
                        C2507c c2507c = null;
                        while (cVarH != null) {
                            if (cVarH instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarH;
                                if (focusTargetNode2.J1().i()) {
                                    return focusTargetNode2;
                                }
                            } else if ((cVarH.getKindSet$ui_release() & iA) != 0 && (cVarH instanceof AbstractC1800m)) {
                                int i10 = 0;
                                for (e.c cVarF1 = ((AbstractC1800m) cVarH).F1(); cVarF1 != null; cVarF1 = cVarF1.getChild$ui_release()) {
                                    if ((cVarF1.getKindSet$ui_release() & iA) != 0) {
                                        i10++;
                                        if (i10 == 1) {
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
                                if (i10 == 1) {
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
        return null;
    }

    public static final C6226h d(FocusTargetNode focusTargetNode) {
        C6226h c6226hW0;
        AbstractC1785e0 coordinator$ui_release = focusTargetNode.getCoordinator$ui_release();
        return (coordinator$ui_release == null || (c6226hW0 = AbstractC1691q.d(coordinator$ui_release).w0(coordinator$ui_release, false)) == null) ? C6226h.f58334e.a() : c6226hW0;
    }

    public static final Boolean e(FocusTargetNode focusTargetNode, int i10, EnumC5027t enumC5027t, C6226h c6226h, Function1 function1) {
        int iG;
        d.a aVar = d.f26651b;
        if (d.l(i10, aVar.e()) || d.l(i10, aVar.f())) {
            return Boolean.valueOf(v.f(focusTargetNode, i10, function1));
        }
        if (d.l(i10, aVar.d()) || d.l(i10, aVar.g()) || d.l(i10, aVar.h()) || d.l(i10, aVar.a())) {
            return w.t(focusTargetNode, i10, c6226h, function1);
        }
        if (!d.l(i10, aVar.b())) {
            if (d.l(i10, aVar.c())) {
                FocusTargetNode focusTargetNodeB = b(focusTargetNode);
                FocusTargetNode focusTargetNodeC = focusTargetNodeB != null ? c(focusTargetNodeB) : null;
                return Boolean.valueOf((focusTargetNodeC == null || AbstractC5504s.c(focusTargetNodeC, focusTargetNode)) ? false : ((Boolean) function1.invoke(focusTargetNodeC)).booleanValue());
            }
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) d.n(i10))).toString());
        }
        int i11 = a.f26688a[enumC5027t.ordinal()];
        if (i11 == 1) {
            iG = aVar.g();
        } else {
            if (i11 != 2) {
                throw new Td.r();
            }
            iG = aVar.d();
        }
        FocusTargetNode focusTargetNodeB2 = b(focusTargetNode);
        if (focusTargetNodeB2 != null) {
            return w.t(focusTargetNodeB2, iG, c6226h, function1);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x0040, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.focus.FocusTargetNode f(androidx.compose.ui.focus.FocusTargetNode r10) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.r.f(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    public static final boolean g(FocusTargetNode focusTargetNode) {
        J jL1;
        AbstractC1785e0 coordinator$ui_release;
        J jL12;
        AbstractC1785e0 coordinator$ui_release2 = focusTargetNode.getCoordinator$ui_release();
        return (coordinator$ui_release2 == null || (jL1 = coordinator$ui_release2.L1()) == null || !jL1.p() || (coordinator$ui_release = focusTargetNode.getCoordinator$ui_release()) == null || (jL12 = coordinator$ui_release.L1()) == null || !jL12.b()) ? false : true;
    }
}
