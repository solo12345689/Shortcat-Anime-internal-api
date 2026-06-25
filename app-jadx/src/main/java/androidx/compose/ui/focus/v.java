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
import kotlin.jvm.internal.AbstractC5506u;
import oe.AbstractC5874j;
import oe.C5870f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26696a;

        static {
            int[] iArr = new int[q0.o.values().length];
            try {
                iArr[q0.o.f56122b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q0.o.f56121a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q0.o.f56123c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[q0.o.f56124d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f26696a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f26697a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f26698b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f26699c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f26700d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1 f26701e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, FocusTargetNode focusTargetNode3, int i10, Function1 function1) {
            super(1);
            this.f26697a = focusTargetNode;
            this.f26698b = focusTargetNode2;
            this.f26699c = focusTargetNode3;
            this.f26700d = i10;
            this.f26701e = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC1677c.a aVar) {
            if (this.f26697a != AbstractC1796k.o(this.f26698b).getFocusOwner().j()) {
                return Boolean.TRUE;
            }
            boolean zI = v.i(this.f26698b, this.f26699c, this.f26700d, this.f26701e);
            Boolean boolValueOf = Boolean.valueOf(zI);
            if (zI || !aVar.a()) {
                return boolValueOf;
            }
            return null;
        }
    }

    private static final boolean b(FocusTargetNode focusTargetNode, Function1 function1) {
        q0.o oVarL1 = focusTargetNode.L1();
        int[] iArr = a.f26696a;
        int i10 = iArr[oVarL1.ordinal()];
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3) {
                return g(focusTargetNode, function1);
            }
            if (i10 != 4) {
                throw new Td.r();
            }
            if (!g(focusTargetNode, function1)) {
                if (!(focusTargetNode.J1().i() ? ((Boolean) function1.invoke(focusTargetNode)).booleanValue() : false)) {
                    return false;
                }
            }
            return true;
        }
        FocusTargetNode focusTargetNodeF = r.f(focusTargetNode);
        if (focusTargetNodeF == null) {
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        int i11 = iArr[focusTargetNodeF.L1().ordinal()];
        if (i11 == 1) {
            return b(focusTargetNodeF, function1) || d(focusTargetNode, focusTargetNodeF, d.f26651b.f(), function1) || (focusTargetNodeF.J1().i() && ((Boolean) function1.invoke(focusTargetNodeF)).booleanValue());
        }
        if (i11 == 2 || i11 == 3) {
            return d(focusTargetNode, focusTargetNodeF, d.f26651b.f(), function1);
        }
        if (i11 != 4) {
            throw new Td.r();
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }

    private static final boolean c(FocusTargetNode focusTargetNode, Function1 function1) {
        int i10 = a.f26696a[focusTargetNode.L1().ordinal()];
        if (i10 == 1) {
            FocusTargetNode focusTargetNodeF = r.f(focusTargetNode);
            if (focusTargetNodeF != null) {
                return c(focusTargetNodeF, function1) || d(focusTargetNode, focusTargetNodeF, d.f26651b.e(), function1);
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        if (i10 == 2 || i10 == 3) {
            return h(focusTargetNode, function1);
        }
        if (i10 == 4) {
            return focusTargetNode.J1().i() ? ((Boolean) function1.invoke(focusTargetNode)).booleanValue() : h(focusTargetNode, function1);
        }
        throw new Td.r();
    }

    private static final boolean d(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i10, Function1 function1) {
        if (i(focusTargetNode, focusTargetNode2, i10, function1)) {
            return true;
        }
        Boolean bool = (Boolean) androidx.compose.ui.focus.a.a(focusTargetNode, i10, new b(AbstractC1796k.o(focusTargetNode).getFocusOwner().j(), focusTargetNode, focusTargetNode2, i10, function1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean e(FocusTargetNode focusTargetNode) {
        e.c cVar;
        C1781c0 c1781c0T0;
        int iA = AbstractC1789g0.a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (!focusTargetNode.getNode().isAttached()) {
            H0.a.b("visitAncestors called on an unattached node");
        }
        e.c parent$ui_release = focusTargetNode.getNode().getParent$ui_release();
        J jN = AbstractC1796k.n(focusTargetNode);
        loop0: while (true) {
            cVar = null;
            if (jN == null) {
                break;
            }
            if ((jN.t0().k().getAggregateChildKindSet$ui_release() & iA) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & iA) != 0) {
                        e.c cVarH = parent$ui_release;
                        C2507c c2507c = null;
                        while (cVarH != null) {
                            if (cVarH instanceof FocusTargetNode) {
                                cVar = cVarH;
                                break loop0;
                            }
                            if ((cVarH.getKindSet$ui_release() & iA) != 0 && (cVarH instanceof AbstractC1800m)) {
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
        return cVar == null;
    }

    public static final boolean f(FocusTargetNode focusTargetNode, int i10, Function1 function1) {
        d.a aVar = d.f26651b;
        if (d.l(i10, aVar.e())) {
            return c(focusTargetNode, function1);
        }
        if (d.l(i10, aVar.f())) {
            return b(focusTargetNode, function1);
        }
        throw new IllegalStateException("This function should only be used for 1-D focus search");
    }

    private static final boolean g(FocusTargetNode focusTargetNode, Function1 function1) {
        C2507c c2507c = new C2507c(new FocusTargetNode[16], 0);
        int iA = AbstractC1789g0.a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (!focusTargetNode.getNode().isAttached()) {
            H0.a.b("visitChildren called on an unattached node");
        }
        C2507c c2507c2 = new C2507c(new e.c[16], 0);
        e.c child$ui_release = focusTargetNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            AbstractC1796k.c(c2507c2, focusTargetNode.getNode(), false);
        } else {
            c2507c2.c(child$ui_release);
        }
        while (c2507c2.p() != 0) {
            e.c cVarH = (e.c) c2507c2.y(c2507c2.p() - 1);
            if ((cVarH.getAggregateChildKindSet$ui_release() & iA) == 0) {
                AbstractC1796k.c(c2507c2, cVarH, false);
            } else {
                while (true) {
                    if (cVarH == null) {
                        break;
                    }
                    if ((cVarH.getKindSet$ui_release() & iA) != 0) {
                        C2507c c2507c3 = null;
                        while (cVarH != null) {
                            if (cVarH instanceof FocusTargetNode) {
                                c2507c.c((FocusTargetNode) cVarH);
                            } else if ((cVarH.getKindSet$ui_release() & iA) != 0 && (cVarH instanceof AbstractC1800m)) {
                                int i10 = 0;
                                for (e.c cVarF1 = ((AbstractC1800m) cVarH).F1(); cVarF1 != null; cVarF1 = cVarF1.getChild$ui_release()) {
                                    if ((cVarF1.getKindSet$ui_release() & iA) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            cVarH = cVarF1;
                                        } else {
                                            if (c2507c3 == null) {
                                                c2507c3 = new C2507c(new e.c[16], 0);
                                            }
                                            if (cVarH != null) {
                                                c2507c3.c(cVarH);
                                                cVarH = null;
                                            }
                                            c2507c3.c(cVarF1);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            cVarH = AbstractC1796k.h(c2507c3);
                        }
                    } else {
                        cVarH = cVarH.getChild$ui_release();
                    }
                }
            }
        }
        c2507c.G(t.f26694a);
        int iP = c2507c.p() - 1;
        Object[] objArr = c2507c.f23496a;
        if (iP < objArr.length) {
            while (iP >= 0) {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[iP];
                if (r.g(focusTargetNode2) && b(focusTargetNode2, function1)) {
                    return true;
                }
                iP--;
            }
        }
        return false;
    }

    private static final boolean h(FocusTargetNode focusTargetNode, Function1 function1) {
        C2507c c2507c = new C2507c(new FocusTargetNode[16], 0);
        int iA = AbstractC1789g0.a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (!focusTargetNode.getNode().isAttached()) {
            H0.a.b("visitChildren called on an unattached node");
        }
        C2507c c2507c2 = new C2507c(new e.c[16], 0);
        e.c child$ui_release = focusTargetNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            AbstractC1796k.c(c2507c2, focusTargetNode.getNode(), false);
        } else {
            c2507c2.c(child$ui_release);
        }
        while (c2507c2.p() != 0) {
            e.c cVarH = (e.c) c2507c2.y(c2507c2.p() - 1);
            if ((cVarH.getAggregateChildKindSet$ui_release() & iA) == 0) {
                AbstractC1796k.c(c2507c2, cVarH, false);
            } else {
                while (true) {
                    if (cVarH == null) {
                        break;
                    }
                    if ((cVarH.getKindSet$ui_release() & iA) != 0) {
                        C2507c c2507c3 = null;
                        while (cVarH != null) {
                            if (cVarH instanceof FocusTargetNode) {
                                c2507c.c((FocusTargetNode) cVarH);
                            } else if ((cVarH.getKindSet$ui_release() & iA) != 0 && (cVarH instanceof AbstractC1800m)) {
                                int i10 = 0;
                                for (e.c cVarF1 = ((AbstractC1800m) cVarH).F1(); cVarF1 != null; cVarF1 = cVarF1.getChild$ui_release()) {
                                    if ((cVarF1.getKindSet$ui_release() & iA) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            cVarH = cVarF1;
                                        } else {
                                            if (c2507c3 == null) {
                                                c2507c3 = new C2507c(new e.c[16], 0);
                                            }
                                            if (cVarH != null) {
                                                c2507c3.c(cVarH);
                                                cVarH = null;
                                            }
                                            c2507c3.c(cVarF1);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            cVarH = AbstractC1796k.h(c2507c3);
                        }
                    } else {
                        cVarH = cVarH.getChild$ui_release();
                    }
                }
            }
        }
        c2507c.G(t.f26694a);
        Object[] objArr = c2507c.f23496a;
        int iP = c2507c.p();
        for (int i11 = 0; i11 < iP; i11++) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[i11];
            if (r.g(focusTargetNode2) && c(focusTargetNode2, function1)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i10, Function1 function1) {
        if (focusTargetNode.L1() != q0.o.f56122b) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        C2507c c2507c = new C2507c(new FocusTargetNode[16], 0);
        int iA = AbstractC1789g0.a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (!focusTargetNode.getNode().isAttached()) {
            H0.a.b("visitChildren called on an unattached node");
        }
        C2507c c2507c2 = new C2507c(new e.c[16], 0);
        e.c child$ui_release = focusTargetNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            AbstractC1796k.c(c2507c2, focusTargetNode.getNode(), false);
        } else {
            c2507c2.c(child$ui_release);
        }
        while (c2507c2.p() != 0) {
            e.c cVarH = (e.c) c2507c2.y(c2507c2.p() - 1);
            if ((cVarH.getAggregateChildKindSet$ui_release() & iA) == 0) {
                AbstractC1796k.c(c2507c2, cVarH, false);
            } else {
                while (true) {
                    if (cVarH == null) {
                        break;
                    }
                    if ((cVarH.getKindSet$ui_release() & iA) != 0) {
                        C2507c c2507c3 = null;
                        while (cVarH != null) {
                            if (cVarH instanceof FocusTargetNode) {
                                c2507c.c((FocusTargetNode) cVarH);
                            } else if ((cVarH.getKindSet$ui_release() & iA) != 0 && (cVarH instanceof AbstractC1800m)) {
                                int i11 = 0;
                                for (e.c cVarF1 = ((AbstractC1800m) cVarH).F1(); cVarF1 != null; cVarF1 = cVarF1.getChild$ui_release()) {
                                    if ((cVarF1.getKindSet$ui_release() & iA) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            cVarH = cVarF1;
                                        } else {
                                            if (c2507c3 == null) {
                                                c2507c3 = new C2507c(new e.c[16], 0);
                                            }
                                            if (cVarH != null) {
                                                c2507c3.c(cVarH);
                                                cVarH = null;
                                            }
                                            c2507c3.c(cVarF1);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            cVarH = AbstractC1796k.h(c2507c3);
                        }
                    } else {
                        cVarH = cVarH.getChild$ui_release();
                    }
                }
            }
        }
        c2507c.G(t.f26694a);
        d.a aVar = d.f26651b;
        if (d.l(i10, aVar.e())) {
            C5870f c5870fX = AbstractC5874j.x(0, c2507c.p());
            int iF = c5870fX.f();
            int i12 = c5870fX.i();
            if (iF <= i12) {
                boolean z10 = false;
                while (true) {
                    if (z10) {
                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) c2507c.f23496a[iF];
                        if (r.g(focusTargetNode3) && c(focusTargetNode3, function1)) {
                            return true;
                        }
                    }
                    if (AbstractC5504s.c(c2507c.f23496a[iF], focusTargetNode2)) {
                        z10 = true;
                    }
                    if (iF == i12) {
                        break;
                    }
                    iF++;
                }
            }
        } else {
            if (!d.l(i10, aVar.f())) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            C5870f c5870fX2 = AbstractC5874j.x(0, c2507c.p());
            int iF2 = c5870fX2.f();
            int i13 = c5870fX2.i();
            if (iF2 <= i13) {
                boolean z11 = false;
                while (true) {
                    if (z11) {
                        FocusTargetNode focusTargetNode4 = (FocusTargetNode) c2507c.f23496a[i13];
                        if (r.g(focusTargetNode4) && b(focusTargetNode4, function1)) {
                            return true;
                        }
                    }
                    if (AbstractC5504s.c(c2507c.f23496a[i13], focusTargetNode2)) {
                        z11 = true;
                    }
                    if (i13 == iF2) {
                        break;
                    }
                    i13--;
                }
            }
        }
        if (d.l(i10, d.f26651b.e()) || !focusTargetNode.J1().i() || e(focusTargetNode)) {
            return false;
        }
        return ((Boolean) function1.invoke(focusTargetNode)).booleanValue();
    }
}
