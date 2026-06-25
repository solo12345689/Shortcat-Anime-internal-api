package androidx.compose.ui.focus;

import I0.InterfaceC1677c;
import K0.AbstractC1789g0;
import K0.AbstractC1796k;
import K0.AbstractC1800m;
import K0.InterfaceC1794j;
import a0.C2507c;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.d;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import r0.C6226h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26702a;

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
            f26702a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f26703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f26704b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C6226h f26705c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f26706d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1 f26707e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, C6226h c6226h, int i10, Function1 function1) {
            super(1);
            this.f26703a = focusTargetNode;
            this.f26704b = focusTargetNode2;
            this.f26705c = c6226h;
            this.f26706d = i10;
            this.f26707e = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC1677c.a aVar) {
            if (this.f26703a != AbstractC1796k.o(this.f26704b).getFocusOwner().j()) {
                return Boolean.TRUE;
            }
            boolean zR = w.r(this.f26704b, this.f26705c, this.f26706d, this.f26707e);
            Boolean boolValueOf = Boolean.valueOf(zR);
            if (zR || !aVar.a()) {
                return boolValueOf;
            }
            return null;
        }
    }

    private static final FocusTargetNode b(FocusTargetNode focusTargetNode) {
        if (focusTargetNode.L1() != q0.o.f56122b) {
            throw new IllegalStateException("Searching for active node in inactive hierarchy");
        }
        FocusTargetNode focusTargetNodeB = r.b(focusTargetNode);
        if (focusTargetNodeB != null) {
            return focusTargetNodeB;
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }

    private static final boolean c(C6226h c6226h, C6226h c6226h2, C6226h c6226h3, int i10) {
        if (d(c6226h3, i10, c6226h) || !d(c6226h2, i10, c6226h)) {
            return false;
        }
        if (!e(c6226h3, i10, c6226h)) {
            return true;
        }
        d.a aVar = d.f26651b;
        return d.l(i10, aVar.d()) || d.l(i10, aVar.g()) || f(c6226h2, i10, c6226h) < g(c6226h3, i10, c6226h);
    }

    private static final boolean d(C6226h c6226h, int i10, C6226h c6226h2) {
        d.a aVar = d.f26651b;
        if (d.l(i10, aVar.d()) || d.l(i10, aVar.g())) {
            return c6226h.e() > c6226h2.l() && c6226h.l() < c6226h2.e();
        }
        if (d.l(i10, aVar.h()) || d.l(i10, aVar.a())) {
            return c6226h.j() > c6226h2.i() && c6226h.i() < c6226h2.j();
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    private static final boolean e(C6226h c6226h, int i10, C6226h c6226h2) {
        d.a aVar = d.f26651b;
        if (d.l(i10, aVar.d())) {
            return c6226h2.i() >= c6226h.j();
        }
        if (d.l(i10, aVar.g())) {
            return c6226h2.j() <= c6226h.i();
        }
        if (d.l(i10, aVar.h())) {
            return c6226h2.l() >= c6226h.e();
        }
        if (d.l(i10, aVar.a())) {
            return c6226h2.e() <= c6226h.l();
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final float f(r0.C6226h r2, int r3, r0.C6226h r4) {
        /*
            androidx.compose.ui.focus.d$a r0 = androidx.compose.ui.focus.d.f26651b
            int r1 = r0.d()
            boolean r1 = androidx.compose.ui.focus.d.l(r3, r1)
            if (r1 == 0) goto L16
            float r3 = r4.i()
            float r2 = r2.j()
        L14:
            float r3 = r3 - r2
            goto L51
        L16:
            int r1 = r0.g()
            boolean r1 = androidx.compose.ui.focus.d.l(r3, r1)
            if (r1 == 0) goto L2b
            float r2 = r2.i()
            float r3 = r4.j()
        L28:
            float r3 = r2 - r3
            goto L51
        L2b:
            int r1 = r0.h()
            boolean r1 = androidx.compose.ui.focus.d.l(r3, r1)
            if (r1 == 0) goto L3e
            float r3 = r4.l()
            float r2 = r2.e()
            goto L14
        L3e:
            int r0 = r0.a()
            boolean r3 = androidx.compose.ui.focus.d.l(r3, r0)
            if (r3 == 0) goto L58
            float r2 = r2.l()
            float r3 = r4.e()
            goto L28
        L51:
            r2 = 0
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 >= 0) goto L57
            return r2
        L57:
            return r3
        L58:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "This function should only be used for 2-D focus search"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.w.f(r0.h, int, r0.h):float");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final float g(r0.C6226h r2, int r3, r0.C6226h r4) {
        /*
            androidx.compose.ui.focus.d$a r0 = androidx.compose.ui.focus.d.f26651b
            int r1 = r0.d()
            boolean r1 = androidx.compose.ui.focus.d.l(r3, r1)
            if (r1 == 0) goto L16
            float r3 = r4.i()
            float r2 = r2.i()
        L14:
            float r3 = r3 - r2
            goto L51
        L16:
            int r1 = r0.g()
            boolean r1 = androidx.compose.ui.focus.d.l(r3, r1)
            if (r1 == 0) goto L2b
            float r2 = r2.j()
            float r3 = r4.j()
        L28:
            float r3 = r2 - r3
            goto L51
        L2b:
            int r1 = r0.h()
            boolean r1 = androidx.compose.ui.focus.d.l(r3, r1)
            if (r1 == 0) goto L3e
            float r3 = r4.l()
            float r2 = r2.l()
            goto L14
        L3e:
            int r0 = r0.a()
            boolean r3 = androidx.compose.ui.focus.d.l(r3, r0)
            if (r3 == 0) goto L59
            float r2 = r2.e()
            float r3 = r4.e()
            goto L28
        L51:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 >= 0) goto L58
            return r2
        L58:
            return r3
        L59:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "This function should only be used for 2-D focus search"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.w.g(r0.h, int, r0.h):float");
    }

    private static final C6226h h(C6226h c6226h) {
        return new C6226h(c6226h.j(), c6226h.e(), c6226h.j(), c6226h.e());
    }

    private static final void i(InterfaceC1794j interfaceC1794j, C2507c c2507c) {
        int iA = AbstractC1789g0.a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (!interfaceC1794j.getNode().isAttached()) {
            H0.a.b("visitChildren called on an unattached node");
        }
        C2507c c2507c2 = new C2507c(new e.c[16], 0);
        e.c child$ui_release = interfaceC1794j.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            AbstractC1796k.c(c2507c2, interfaceC1794j.getNode(), false);
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
                                FocusTargetNode focusTargetNode = (FocusTargetNode) cVarH;
                                if (focusTargetNode.isAttached() && !AbstractC1796k.n(focusTargetNode).z()) {
                                    if (focusTargetNode.J1().i()) {
                                        c2507c.c(focusTargetNode);
                                    } else {
                                        i(focusTargetNode, c2507c);
                                    }
                                }
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
    }

    private static final FocusTargetNode j(C2507c c2507c, C6226h c6226h, int i10) {
        C6226h c6226hS;
        d.a aVar = d.f26651b;
        if (d.l(i10, aVar.d())) {
            c6226hS = c6226h.s((c6226h.j() - c6226h.i()) + 1, 0.0f);
        } else if (d.l(i10, aVar.g())) {
            c6226hS = c6226h.s(-((c6226h.j() - c6226h.i()) + 1), 0.0f);
        } else if (d.l(i10, aVar.h())) {
            c6226hS = c6226h.s(0.0f, (c6226h.e() - c6226h.l()) + 1);
        } else {
            if (!d.l(i10, aVar.a())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            c6226hS = c6226h.s(0.0f, -((c6226h.e() - c6226h.l()) + 1));
        }
        Object[] objArr = c2507c.f23496a;
        int iP = c2507c.p();
        FocusTargetNode focusTargetNode = null;
        for (int i11 = 0; i11 < iP; i11++) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[i11];
            if (r.g(focusTargetNode2)) {
                C6226h c6226hD = r.d(focusTargetNode2);
                if (m(c6226hD, c6226hS, c6226h, i10)) {
                    focusTargetNode = focusTargetNode2;
                    c6226hS = c6226hD;
                }
            }
        }
        return focusTargetNode;
    }

    public static final boolean k(FocusTargetNode focusTargetNode, int i10, Function1 function1) {
        C6226h c6226hS;
        C2507c c2507c = new C2507c(new FocusTargetNode[16], 0);
        i(focusTargetNode, c2507c);
        if (c2507c.p() <= 1) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) (c2507c.p() == 0 ? null : c2507c.f23496a[0]);
            if (focusTargetNode2 != null) {
                return ((Boolean) function1.invoke(focusTargetNode2)).booleanValue();
            }
            return false;
        }
        d.a aVar = d.f26651b;
        if (d.l(i10, aVar.b())) {
            i10 = aVar.g();
        }
        if (d.l(i10, aVar.g()) || d.l(i10, aVar.a())) {
            c6226hS = s(r.d(focusTargetNode));
        } else {
            if (!d.l(i10, aVar.d()) && !d.l(i10, aVar.h())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            c6226hS = h(r.d(focusTargetNode));
        }
        FocusTargetNode focusTargetNodeJ = j(c2507c, c6226hS, i10);
        if (focusTargetNodeJ != null) {
            return ((Boolean) function1.invoke(focusTargetNodeJ)).booleanValue();
        }
        return false;
    }

    private static final boolean l(FocusTargetNode focusTargetNode, C6226h c6226h, int i10, Function1 function1) {
        if (r(focusTargetNode, c6226h, i10, function1)) {
            return true;
        }
        Boolean bool = (Boolean) androidx.compose.ui.focus.a.a(focusTargetNode, i10, new b(AbstractC1796k.o(focusTargetNode).getFocusOwner().j(), focusTargetNode, c6226h, i10, function1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean m(C6226h c6226h, C6226h c6226h2, C6226h c6226h3, int i10) {
        if (!n(c6226h, i10, c6226h3)) {
            return false;
        }
        if (n(c6226h2, i10, c6226h3) && !c(c6226h3, c6226h, c6226h2, i10)) {
            return !c(c6226h3, c6226h2, c6226h, i10) && q(i10, c6226h3, c6226h) < q(i10, c6226h3, c6226h2);
        }
        return true;
    }

    private static final boolean n(C6226h c6226h, int i10, C6226h c6226h2) {
        d.a aVar = d.f26651b;
        if (d.l(i10, aVar.d())) {
            return (c6226h2.j() > c6226h.j() || c6226h2.i() >= c6226h.j()) && c6226h2.i() > c6226h.i();
        }
        if (d.l(i10, aVar.g())) {
            return (c6226h2.i() < c6226h.i() || c6226h2.j() <= c6226h.i()) && c6226h2.j() < c6226h.j();
        }
        if (d.l(i10, aVar.h())) {
            return (c6226h2.e() > c6226h.e() || c6226h2.l() >= c6226h.e()) && c6226h2.l() > c6226h.l();
        }
        if (d.l(i10, aVar.a())) {
            return (c6226h2.l() < c6226h.l() || c6226h2.e() <= c6226h.l()) && c6226h2.e() < c6226h.e();
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final float o(r0.C6226h r2, int r3, r0.C6226h r4) {
        /*
            androidx.compose.ui.focus.d$a r0 = androidx.compose.ui.focus.d.f26651b
            int r1 = r0.d()
            boolean r1 = androidx.compose.ui.focus.d.l(r3, r1)
            if (r1 == 0) goto L16
            float r3 = r4.i()
            float r2 = r2.j()
        L14:
            float r3 = r3 - r2
            goto L51
        L16:
            int r1 = r0.g()
            boolean r1 = androidx.compose.ui.focus.d.l(r3, r1)
            if (r1 == 0) goto L2b
            float r2 = r2.i()
            float r3 = r4.j()
        L28:
            float r3 = r2 - r3
            goto L51
        L2b:
            int r1 = r0.h()
            boolean r1 = androidx.compose.ui.focus.d.l(r3, r1)
            if (r1 == 0) goto L3e
            float r3 = r4.l()
            float r2 = r2.e()
            goto L14
        L3e:
            int r0 = r0.a()
            boolean r3 = androidx.compose.ui.focus.d.l(r3, r0)
            if (r3 == 0) goto L58
            float r2 = r2.l()
            float r3 = r4.e()
            goto L28
        L51:
            r2 = 0
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 >= 0) goto L57
            return r2
        L57:
            return r3
        L58:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "This function should only be used for 2-D focus search"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.w.o(r0.h, int, r0.h):float");
    }

    private static final float p(C6226h c6226h, int i10, C6226h c6226h2) {
        float f10;
        float f11;
        float fL;
        float fE;
        float fL2;
        d.a aVar = d.f26651b;
        if (d.l(i10, aVar.d()) || d.l(i10, aVar.g())) {
            float fL3 = c6226h2.l();
            float fE2 = c6226h2.e() - c6226h2.l();
            f10 = 2;
            f11 = fL3 + (fE2 / f10);
            fL = c6226h.l();
            fE = c6226h.e();
            fL2 = c6226h.l();
        } else {
            if (!d.l(i10, aVar.h()) && !d.l(i10, aVar.a())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float fI = c6226h2.i();
            float fJ = c6226h2.j() - c6226h2.i();
            f10 = 2;
            f11 = fI + (fJ / f10);
            fL = c6226h.i();
            fE = c6226h.j();
            fL2 = c6226h.i();
        }
        return f11 - (fL + ((fE - fL2) / f10));
    }

    private static final long q(int i10, C6226h c6226h, C6226h c6226h2) {
        long jO = (long) o(c6226h2, i10, c6226h);
        long jP = (long) p(c6226h2, i10, c6226h);
        return (((long) 13) * jO * jO) + (jP * jP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(FocusTargetNode focusTargetNode, C6226h c6226h, int i10, Function1 function1) {
        FocusTargetNode focusTargetNodeJ;
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
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarH;
                                if (focusTargetNode2.isAttached()) {
                                    c2507c.c(focusTargetNode2);
                                }
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
        while (c2507c.p() != 0 && (focusTargetNodeJ = j(c2507c, c6226h, i10)) != null) {
            if (focusTargetNodeJ.J1().i()) {
                return ((Boolean) function1.invoke(focusTargetNodeJ)).booleanValue();
            }
            if (l(focusTargetNodeJ, c6226h, i10, function1)) {
                return true;
            }
            c2507c.w(focusTargetNodeJ);
        }
        return false;
    }

    private static final C6226h s(C6226h c6226h) {
        return new C6226h(c6226h.i(), c6226h.l(), c6226h.i(), c6226h.l());
    }

    public static final Boolean t(FocusTargetNode focusTargetNode, int i10, C6226h c6226h, Function1 function1) {
        q0.o oVarL1 = focusTargetNode.L1();
        int[] iArr = a.f26702a;
        int i11 = iArr[oVarL1.ordinal()];
        if (i11 != 1) {
            if (i11 == 2 || i11 == 3) {
                return Boolean.valueOf(k(focusTargetNode, i10, function1));
            }
            if (i11 == 4) {
                return focusTargetNode.J1().i() ? (Boolean) function1.invoke(focusTargetNode) : c6226h == null ? Boolean.valueOf(k(focusTargetNode, i10, function1)) : Boolean.valueOf(r(focusTargetNode, c6226h, i10, function1));
            }
            throw new Td.r();
        }
        FocusTargetNode focusTargetNodeF = r.f(focusTargetNode);
        if (focusTargetNodeF == null) {
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        int i12 = iArr[focusTargetNodeF.L1().ordinal()];
        if (i12 == 1) {
            Boolean boolT = t(focusTargetNodeF, i10, c6226h, function1);
            if (!AbstractC5504s.c(boolT, Boolean.FALSE)) {
                return boolT;
            }
            if (c6226h == null) {
                c6226h = r.d(b(focusTargetNodeF));
            }
            return Boolean.valueOf(l(focusTargetNode, c6226h, i10, function1));
        }
        if (i12 == 2 || i12 == 3) {
            if (c6226h == null) {
                c6226h = r.d(focusTargetNodeF);
            }
            return Boolean.valueOf(l(focusTargetNode, c6226h, i10, function1));
        }
        if (i12 != 4) {
            throw new Td.r();
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }
}
