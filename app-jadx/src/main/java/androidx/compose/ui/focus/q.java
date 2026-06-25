package androidx.compose.ui.focus;

import K0.AbstractC1789g0;
import K0.AbstractC1796k;
import K0.AbstractC1797k0;
import K0.AbstractC1800m;
import K0.C1781c0;
import K0.J;
import Td.L;
import a0.C2507c;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.k;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import ie.InterfaceC5082a;
import kotlin.jvm.internal.AbstractC5506u;
import q0.C6055a;
import q0.EnumC6056b;
import q0.InterfaceC6064j;
import r0.C6226h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f26686a;

        static {
            int[] iArr = new int[q0.o.values().length];
            try {
                iArr[q0.o.f56121a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q0.o.f56123c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q0.o.f56122b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[q0.o.f56124d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f26686a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ FocusTargetNode f26687a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(FocusTargetNode focusTargetNode) {
            super(0);
            this.f26687a = focusTargetNode;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m75invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m75invoke() {
            this.f26687a.J1();
        }
    }

    private static final boolean a(FocusTargetNode focusTargetNode, boolean z10, boolean z11) {
        FocusTargetNode focusTargetNodeF = r.f(focusTargetNode);
        if (focusTargetNodeF != null) {
            return b(focusTargetNodeF, z10, z11);
        }
        return true;
    }

    public static final boolean b(FocusTargetNode focusTargetNode, boolean z10, boolean z11) {
        int i10 = a.f26686a[focusTargetNode.L1().ordinal()];
        if (i10 == 1) {
            AbstractC1796k.o(focusTargetNode).getFocusOwner().s(null);
            if (z11) {
                focusTargetNode.I1(q0.o.f56121a, q0.o.f56124d);
            }
            return true;
        }
        if (i10 == 2) {
            if (z10) {
                AbstractC1796k.o(focusTargetNode).getFocusOwner().s(null);
                if (z11) {
                    focusTargetNode.I1(q0.o.f56123c, q0.o.f56124d);
                }
            }
            return z10;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return true;
            }
            throw new Td.r();
        }
        if (!a(focusTargetNode, z10, z11)) {
            return false;
        }
        if (z11) {
            focusTargetNode.I1(q0.o.f56122b, q0.o.f56124d);
        }
        return true;
    }

    public static /* synthetic */ boolean c(FocusTargetNode focusTargetNode, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return b(focusTargetNode, z10, z11);
    }

    private static final boolean d(FocusTargetNode focusTargetNode) {
        AbstractC1797k0.a(focusTargetNode, new b(focusTargetNode));
        int i10 = a.f26686a[focusTargetNode.L1().ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3 && i10 != 4) {
                throw new Td.r();
            }
            AbstractC1796k.o(focusTargetNode).getFocusOwner().s(focusTargetNode);
        }
        return true;
    }

    public static final EnumC6056b e(FocusTargetNode focusTargetNode, int i10) {
        int i11 = a.f26686a[focusTargetNode.L1().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return EnumC6056b.f56109b;
            }
            if (i11 == 3) {
                EnumC6056b enumC6056bE = e(l(focusTargetNode), i10);
                if (enumC6056bE == EnumC6056b.f56108a) {
                    enumC6056bE = null;
                }
                return enumC6056bE == null ? g(focusTargetNode, i10) : enumC6056bE;
            }
            if (i11 != 4) {
                throw new Td.r();
            }
        }
        return EnumC6056b.f56108a;
    }

    private static final EnumC6056b f(FocusTargetNode focusTargetNode, int i10) {
        if (!focusTargetNode.f26640d) {
            focusTargetNode.f26640d = true;
            try {
                i iVarJ1 = focusTargetNode.J1();
                C6055a c6055a = new C6055a(i10, null);
                InterfaceC6064j focusOwner = AbstractC1796k.o(focusTargetNode).getFocusOwner();
                FocusTargetNode focusTargetNodeJ = focusOwner.j();
                iVarJ1.k().invoke(c6055a);
                FocusTargetNode focusTargetNodeJ2 = focusOwner.j();
                if (c6055a.c()) {
                    k.a aVar = k.f26678b;
                    k kVarA = aVar.a();
                    if (kVarA == aVar.a()) {
                        return EnumC6056b.f56109b;
                    }
                    if (kVarA == aVar.c()) {
                        return EnumC6056b.f56110c;
                    }
                    return k.h(kVarA, 0, 1, null) ? EnumC6056b.f56110c : EnumC6056b.f56111d;
                }
                if (focusTargetNodeJ != focusTargetNodeJ2 && focusTargetNodeJ2 != null) {
                    k.a aVar2 = k.f26678b;
                    k kVarC = aVar2.c();
                    if (kVarC == aVar2.a()) {
                        return EnumC6056b.f56109b;
                    }
                    if (kVarC == aVar2.c()) {
                        return EnumC6056b.f56110c;
                    }
                    return k.h(kVarC, 0, 1, null) ? EnumC6056b.f56110c : EnumC6056b.f56111d;
                }
            } finally {
                focusTargetNode.f26640d = false;
            }
        }
        return EnumC6056b.f56108a;
    }

    private static final EnumC6056b g(FocusTargetNode focusTargetNode, int i10) {
        if (!focusTargetNode.f26639c) {
            focusTargetNode.f26639c = true;
            try {
                i iVarJ1 = focusTargetNode.J1();
                C6055a c6055a = new C6055a(i10, null);
                InterfaceC6064j focusOwner = AbstractC1796k.o(focusTargetNode).getFocusOwner();
                FocusTargetNode focusTargetNodeJ = focusOwner.j();
                iVarJ1.m().invoke(c6055a);
                FocusTargetNode focusTargetNodeJ2 = focusOwner.j();
                if (c6055a.c()) {
                    k.a aVar = k.f26678b;
                    k kVarA = aVar.a();
                    if (kVarA == aVar.a()) {
                        return EnumC6056b.f56109b;
                    }
                    if (kVarA == aVar.c()) {
                        return EnumC6056b.f56110c;
                    }
                    return k.h(kVarA, 0, 1, null) ? EnumC6056b.f56110c : EnumC6056b.f56111d;
                }
                if (focusTargetNodeJ != focusTargetNodeJ2 && focusTargetNodeJ2 != null) {
                    k.a aVar2 = k.f26678b;
                    k kVarC = aVar2.c();
                    if (kVarC == aVar2.a()) {
                        return EnumC6056b.f56109b;
                    }
                    if (kVarC == aVar2.c()) {
                        return EnumC6056b.f56110c;
                    }
                    return k.h(kVarC, 0, 1, null) ? EnumC6056b.f56110c : EnumC6056b.f56111d;
                }
            } finally {
                focusTargetNode.f26639c = false;
            }
        }
        return EnumC6056b.f56108a;
    }

    public static final EnumC6056b h(FocusTargetNode focusTargetNode, int i10) {
        e.c cVarH;
        C1781c0 c1781c0T0;
        int i11 = a.f26686a[focusTargetNode.L1().ordinal()];
        if (i11 == 1 || i11 == 2) {
            return EnumC6056b.f56108a;
        }
        if (i11 == 3) {
            return e(l(focusTargetNode), i10);
        }
        if (i11 != 4) {
            throw new Td.r();
        }
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
                                int i12 = 0;
                                for (e.c cVarF1 = ((AbstractC1800m) cVarH).F1(); cVarF1 != null; cVarF1 = cVarF1.getChild$ui_release()) {
                                    if ((cVarF1.getKindSet$ui_release() & iA) != 0) {
                                        i12++;
                                        if (i12 == 1) {
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
                                if (i12 == 1) {
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
        if (focusTargetNode2 == null) {
            return EnumC6056b.f56108a;
        }
        int i13 = a.f26686a[focusTargetNode2.L1().ordinal()];
        if (i13 == 1) {
            return f(focusTargetNode2, i10);
        }
        if (i13 == 2) {
            return EnumC6056b.f56109b;
        }
        if (i13 == 3) {
            return h(focusTargetNode2, i10);
        }
        if (i13 != 4) {
            throw new Td.r();
        }
        EnumC6056b enumC6056bH = h(focusTargetNode2, i10);
        EnumC6056b enumC6056b = enumC6056bH != EnumC6056b.f56108a ? enumC6056bH : null;
        return enumC6056b == null ? f(focusTargetNode2, i10) : enumC6056b;
    }

    public static final boolean i(FocusTargetNode focusTargetNode) {
        C2507c c2507c;
        int i10;
        C1781c0 c1781c0T0;
        C1781c0 c1781c0T02;
        InterfaceC6064j focusOwner = AbstractC1796k.o(focusTargetNode).getFocusOwner();
        FocusTargetNode focusTargetNodeJ = focusOwner.j();
        q0.o oVarL1 = focusTargetNode.L1();
        int i11 = 1;
        if (focusTargetNodeJ == focusTargetNode) {
            focusTargetNode.I1(oVarL1, oVarL1);
            return true;
        }
        C2507c c2507c2 = null;
        int i12 = 0;
        if (focusTargetNodeJ == null && !k(focusTargetNode, null, null, 3, null)) {
            return false;
        }
        int i13 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        int i14 = 16;
        if (focusTargetNodeJ != null) {
            c2507c = new C2507c(new FocusTargetNode[16], 0);
            int iA = AbstractC1789g0.a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
            if (!focusTargetNodeJ.getNode().isAttached()) {
                H0.a.b("visitAncestors called on an unattached node");
            }
            e.c parent$ui_release = focusTargetNodeJ.getNode().getParent$ui_release();
            J jN = AbstractC1796k.n(focusTargetNodeJ);
            while (jN != null) {
                if ((jN.t0().k().getAggregateChildKindSet$ui_release() & iA) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & iA) != 0) {
                            C2507c c2507c3 = c2507c2;
                            e.c cVarH = parent$ui_release;
                            while (cVarH != null) {
                                int i15 = i13;
                                if (cVarH instanceof FocusTargetNode) {
                                    c2507c.c((FocusTargetNode) cVarH);
                                } else if ((cVarH.getKindSet$ui_release() & iA) != 0 && (cVarH instanceof AbstractC1800m)) {
                                    e.c cVarF1 = ((AbstractC1800m) cVarH).F1();
                                    int i16 = 0;
                                    while (cVarF1 != null) {
                                        if ((cVarF1.getKindSet$ui_release() & iA) != 0) {
                                            i16++;
                                            if (i16 == i11) {
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
                                        cVarF1 = cVarF1.getChild$ui_release();
                                        i11 = 1;
                                    }
                                    if (i16 == i11) {
                                        i13 = i15;
                                    }
                                }
                                cVarH = AbstractC1796k.h(c2507c3);
                                i13 = i15;
                                i11 = 1;
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                        i13 = i13;
                        i11 = 1;
                        c2507c2 = null;
                    }
                }
                int i17 = i13;
                jN = jN.A0();
                parent$ui_release = (jN == null || (c1781c0T02 = jN.t0()) == null) ? null : c1781c0T02.p();
                i13 = i17;
                i11 = 1;
                c2507c2 = null;
            }
        } else {
            c2507c = null;
        }
        int i18 = i13;
        C2507c c2507c4 = new C2507c(new FocusTargetNode[16], 0);
        int iA2 = AbstractC1789g0.a(i18);
        if (!focusTargetNode.getNode().isAttached()) {
            H0.a.b("visitAncestors called on an unattached node");
        }
        e.c parent$ui_release2 = focusTargetNode.getNode().getParent$ui_release();
        J jN2 = AbstractC1796k.n(focusTargetNode);
        int i19 = 1;
        while (jN2 != null) {
            if ((jN2.t0().k().getAggregateChildKindSet$ui_release() & iA2) != 0) {
                while (parent$ui_release2 != null) {
                    if ((parent$ui_release2.getKindSet$ui_release() & iA2) != 0) {
                        e.c cVarH2 = parent$ui_release2;
                        C2507c c2507c5 = null;
                        while (cVarH2 != null) {
                            if (cVarH2 instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarH2;
                                Boolean boolValueOf = c2507c != null ? Boolean.valueOf(c2507c.w(focusTargetNode2)) : null;
                                if (boolValueOf == null || !boolValueOf.booleanValue()) {
                                    c2507c4.c(focusTargetNode2);
                                }
                                if (focusTargetNode2 == focusTargetNodeJ) {
                                    i19 = i12;
                                }
                            } else {
                                if ((cVarH2.getKindSet$ui_release() & iA2) != 0 && (cVarH2 instanceof AbstractC1800m)) {
                                    e.c cVarF12 = ((AbstractC1800m) cVarH2).F1();
                                    int i20 = i12;
                                    while (cVarF12 != null) {
                                        if ((cVarF12.getKindSet$ui_release() & iA2) != 0) {
                                            i20++;
                                            if (i20 == 1) {
                                                cVarH2 = cVarF12;
                                            } else {
                                                if (c2507c5 == null) {
                                                    c2507c5 = new C2507c(new e.c[i14], 0);
                                                }
                                                if (cVarH2 != null) {
                                                    c2507c5.c(cVarH2);
                                                    cVarH2 = null;
                                                }
                                                c2507c5.c(cVarF12);
                                            }
                                        }
                                        cVarF12 = cVarF12.getChild$ui_release();
                                        i14 = 16;
                                    }
                                    if (i20 == 1) {
                                    }
                                }
                                i12 = 0;
                                i14 = 16;
                            }
                            cVarH2 = AbstractC1796k.h(c2507c5);
                            i12 = 0;
                            i14 = 16;
                        }
                    }
                    parent$ui_release2 = parent$ui_release2.getParent$ui_release();
                    i12 = 0;
                    i14 = 16;
                }
            }
            jN2 = jN2.A0();
            parent$ui_release2 = (jN2 == null || (c1781c0T0 = jN2.t0()) == null) ? null : c1781c0T0.p();
            i12 = 0;
            i14 = 16;
        }
        if (i19 == 0 || focusTargetNodeJ == null) {
            i10 = 1;
        } else {
            i10 = 1;
            if (!c(focusTargetNodeJ, false, true, 1, null)) {
                return false;
            }
        }
        d(focusTargetNode);
        if (c2507c != null) {
            int iP = c2507c.p() - i10;
            Object[] objArr = c2507c.f23496a;
            if (iP < objArr.length) {
                while (iP >= 0) {
                    FocusTargetNode focusTargetNode3 = (FocusTargetNode) objArr[iP];
                    if (focusOwner.j() != focusTargetNode) {
                        return false;
                    }
                    focusTargetNode3.I1(q0.o.f56122b, q0.o.f56124d);
                    iP--;
                }
            }
        }
        int iP2 = c2507c4.p() - 1;
        Object[] objArr2 = c2507c4.f23496a;
        if (iP2 < objArr2.length) {
            while (iP2 >= 0) {
                FocusTargetNode focusTargetNode4 = (FocusTargetNode) objArr2[iP2];
                if (focusOwner.j() != focusTargetNode) {
                    return false;
                }
                focusTargetNode4.I1(focusTargetNode4 == focusTargetNodeJ ? q0.o.f56121a : q0.o.f56124d, q0.o.f56122b);
                iP2--;
            }
        }
        if (focusOwner.j() != focusTargetNode) {
            return false;
        }
        focusTargetNode.I1(oVarL1, q0.o.f56121a);
        if (focusOwner.j() != focusTargetNode) {
            return false;
        }
        if (!l0.h.f52331d || AbstractC1796k.n(focusTargetNode).Z() != null) {
            return true;
        }
        j(focusTargetNode, d.i(d.f26651b.e()), null);
        return true;
    }

    private static final boolean j(FocusTargetNode focusTargetNode, d dVar, C6226h c6226h) {
        return AbstractC1796k.o(focusTargetNode).getFocusOwner().b(dVar, c6226h);
    }

    static /* synthetic */ boolean k(FocusTargetNode focusTargetNode, d dVar, C6226h c6226h, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dVar = null;
        }
        if ((i10 & 2) != 0) {
            c6226h = null;
        }
        return j(focusTargetNode, dVar, c6226h);
    }

    private static final FocusTargetNode l(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNodeF = r.f(focusTargetNode);
        if (focusTargetNodeF != null) {
            return focusTargetNodeF;
        }
        throw new IllegalArgumentException("ActiveParent with no focused child");
    }
}
