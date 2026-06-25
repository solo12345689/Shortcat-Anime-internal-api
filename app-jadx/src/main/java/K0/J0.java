package K0;

import a0.C2507c;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class J0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    public static final I0 a(InterfaceC1794j interfaceC1794j, Object obj) {
        C1781c0 c1781c0T0;
        int iA = AbstractC1789g0.a(262144);
        if (!interfaceC1794j.getNode().isAttached()) {
            H0.a.b("visitAncestors called on an unattached node");
        }
        e.c parent$ui_release = interfaceC1794j.getNode().getParent$ui_release();
        J jN = AbstractC1796k.n(interfaceC1794j);
        while (jN != null) {
            if ((jN.t0().k().getAggregateChildKindSet$ui_release() & iA) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & iA) != 0) {
                        ?? H10 = parent$ui_release;
                        ?? c2507c = 0;
                        while (H10 != 0) {
                            if (H10 instanceof I0) {
                                I0 i02 = (I0) H10;
                                if (AbstractC5504s.c(obj, i02.B())) {
                                    return i02;
                                }
                            } else if ((H10.getKindSet$ui_release() & iA) != 0 && (H10 instanceof AbstractC1800m)) {
                                e.c cVarF1 = ((AbstractC1800m) H10).F1();
                                int i10 = 0;
                                H10 = H10;
                                c2507c = c2507c;
                                while (cVarF1 != null) {
                                    if ((cVarF1.getKindSet$ui_release() & iA) != 0) {
                                        i10++;
                                        c2507c = c2507c;
                                        if (i10 == 1) {
                                            H10 = cVarF1;
                                        } else {
                                            if (c2507c == 0) {
                                                c2507c = new C2507c(new e.c[16], 0);
                                            }
                                            if (H10 != 0) {
                                                c2507c.c(H10);
                                                H10 = 0;
                                            }
                                            c2507c.c(cVarF1);
                                        }
                                    }
                                    cVarF1 = cVarF1.getChild$ui_release();
                                    H10 = H10;
                                    c2507c = c2507c;
                                }
                                if (i10 == 1) {
                                }
                            }
                            H10 = AbstractC1796k.h(c2507c);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public static final I0 b(I0 i02) {
        C1781c0 c1781c0T0;
        int iA = AbstractC1789g0.a(262144);
        if (!i02.getNode().isAttached()) {
            H0.a.b("visitAncestors called on an unattached node");
        }
        e.c parent$ui_release = i02.getNode().getParent$ui_release();
        J jN = AbstractC1796k.n(i02);
        while (jN != null) {
            if ((jN.t0().k().getAggregateChildKindSet$ui_release() & iA) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & iA) != 0) {
                        ?? H10 = parent$ui_release;
                        ?? c2507c = 0;
                        while (H10 != 0) {
                            if (H10 instanceof I0) {
                                I0 i03 = (I0) H10;
                                if (AbstractC5504s.c(i02.B(), i03.B()) && l0.d.a(i02, i03)) {
                                    return i03;
                                }
                            } else if ((H10.getKindSet$ui_release() & iA) != 0 && (H10 instanceof AbstractC1800m)) {
                                e.c cVarF1 = ((AbstractC1800m) H10).F1();
                                int i10 = 0;
                                H10 = H10;
                                c2507c = c2507c;
                                while (cVarF1 != null) {
                                    if ((cVarF1.getKindSet$ui_release() & iA) != 0) {
                                        i10++;
                                        c2507c = c2507c;
                                        if (i10 == 1) {
                                            H10 = cVarF1;
                                        } else {
                                            if (c2507c == 0) {
                                                c2507c = new C2507c(new e.c[16], 0);
                                            }
                                            if (H10 != 0) {
                                                c2507c.c(H10);
                                                H10 = 0;
                                            }
                                            c2507c.c(cVarF1);
                                        }
                                    }
                                    cVarF1 = cVarF1.getChild$ui_release();
                                    H10 = H10;
                                    c2507c = c2507c;
                                }
                                if (i10 == 1) {
                                }
                            }
                            H10 = AbstractC1796k.h(c2507c);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public static final void c(InterfaceC1794j interfaceC1794j, Object obj, Function1 function1) {
        C1781c0 c1781c0T0;
        int iA = AbstractC1789g0.a(262144);
        if (!interfaceC1794j.getNode().isAttached()) {
            H0.a.b("visitAncestors called on an unattached node");
        }
        e.c parent$ui_release = interfaceC1794j.getNode().getParent$ui_release();
        J jN = AbstractC1796k.n(interfaceC1794j);
        while (jN != null) {
            if ((jN.t0().k().getAggregateChildKindSet$ui_release() & iA) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & iA) != 0) {
                        ?? H10 = parent$ui_release;
                        ?? c2507c = 0;
                        while (H10 != 0) {
                            if (H10 instanceof I0) {
                                I0 i02 = (I0) H10;
                                if (!(AbstractC5504s.c(obj, i02.B()) ? ((Boolean) function1.invoke(i02)).booleanValue() : true)) {
                                    return;
                                }
                            } else {
                                if (((H10.getKindSet$ui_release() & iA) != 0) && (H10 instanceof AbstractC1800m)) {
                                    e.c cVarF1 = ((AbstractC1800m) H10).F1();
                                    int i10 = 0;
                                    H10 = H10;
                                    c2507c = c2507c;
                                    while (cVarF1 != null) {
                                        if ((cVarF1.getKindSet$ui_release() & iA) != 0) {
                                            i10++;
                                            c2507c = c2507c;
                                            if (i10 == 1) {
                                                H10 = cVarF1;
                                            } else {
                                                if (c2507c == 0) {
                                                    c2507c = new C2507c(new e.c[16], 0);
                                                }
                                                if (H10 != 0) {
                                                    c2507c.c(H10);
                                                    H10 = 0;
                                                }
                                                c2507c.c(cVarF1);
                                            }
                                        }
                                        cVarF1 = cVarF1.getChild$ui_release();
                                        H10 = H10;
                                        c2507c = c2507c;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                            }
                            H10 = AbstractC1796k.h(c2507c);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            jN = jN.A0();
            parent$ui_release = (jN == null || (c1781c0T0 = jN.t0()) == null) ? null : c1781c0T0.p();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final void d(I0 i02, Function1 function1) {
        C1781c0 c1781c0T0;
        int iA = AbstractC1789g0.a(262144);
        if (!i02.getNode().isAttached()) {
            H0.a.b("visitAncestors called on an unattached node");
        }
        e.c parent$ui_release = i02.getNode().getParent$ui_release();
        J jN = AbstractC1796k.n(i02);
        while (jN != null) {
            if ((jN.t0().k().getAggregateChildKindSet$ui_release() & iA) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & iA) != 0) {
                        ?? H10 = parent$ui_release;
                        ?? c2507c = 0;
                        while (H10 != 0) {
                            boolean zBooleanValue = true;
                            if (H10 instanceof I0) {
                                I0 i03 = (I0) H10;
                                if (AbstractC5504s.c(i02.B(), i03.B()) && l0.d.a(i02, i03)) {
                                    zBooleanValue = ((Boolean) function1.invoke(i03)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else {
                                if (((H10.getKindSet$ui_release() & iA) != 0) && (H10 instanceof AbstractC1800m)) {
                                    e.c cVarF1 = ((AbstractC1800m) H10).F1();
                                    int i10 = 0;
                                    H10 = H10;
                                    c2507c = c2507c;
                                    while (cVarF1 != null) {
                                        if ((cVarF1.getKindSet$ui_release() & iA) != 0) {
                                            i10++;
                                            c2507c = c2507c;
                                            if (i10 == 1) {
                                                H10 = cVarF1;
                                            } else {
                                                if (c2507c == 0) {
                                                    c2507c = new C2507c(new e.c[16], 0);
                                                }
                                                if (H10 != 0) {
                                                    c2507c.c(H10);
                                                    H10 = 0;
                                                }
                                                c2507c.c(cVarF1);
                                            }
                                        }
                                        cVarF1 = cVarF1.getChild$ui_release();
                                        H10 = H10;
                                        c2507c = c2507c;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                            }
                            H10 = AbstractC1796k.h(c2507c);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            jN = jN.A0();
            parent$ui_release = (jN == null || (c1781c0T0 = jN.t0()) == null) ? null : c1781c0T0.p();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v8 */
    public static final void e(InterfaceC1794j interfaceC1794j, Object obj, Function1 function1) {
        int iA = AbstractC1789g0.a(262144);
        if (!interfaceC1794j.getNode().isAttached()) {
            H0.a.b("visitSubtreeIf called on an unattached node");
        }
        C2507c c2507c = new C2507c(new e.c[16], 0);
        e.c child$ui_release = interfaceC1794j.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            AbstractC1796k.c(c2507c, interfaceC1794j.getNode(), false);
        } else {
            c2507c.c(child$ui_release);
        }
        while (c2507c.p() != 0) {
            e.c cVar = (e.c) c2507c.y(c2507c.p() - 1);
            if ((cVar.getAggregateChildKindSet$ui_release() & iA) != 0) {
                for (e.c child$ui_release2 = cVar; child$ui_release2 != null; child$ui_release2 = child$ui_release2.getChild$ui_release()) {
                    if ((child$ui_release2.getKindSet$ui_release() & iA) != 0) {
                        ?? H10 = child$ui_release2;
                        ?? c2507c2 = 0;
                        while (H10 != 0) {
                            if (H10 instanceof I0) {
                                I0 i02 = (I0) H10;
                                H0 h02 = AbstractC5504s.c(obj, i02.B()) ? (H0) function1.invoke(i02) : H0.f10420a;
                                if (h02 == H0.f10422c) {
                                    return;
                                }
                                if (h02 == H0.f10421b) {
                                    break;
                                }
                            } else if ((H10.getKindSet$ui_release() & iA) != 0 && (H10 instanceof AbstractC1800m)) {
                                e.c cVarF1 = ((AbstractC1800m) H10).F1();
                                int i10 = 0;
                                H10 = H10;
                                c2507c2 = c2507c2;
                                while (cVarF1 != null) {
                                    if ((cVarF1.getKindSet$ui_release() & iA) != 0) {
                                        i10++;
                                        c2507c2 = c2507c2;
                                        if (i10 == 1) {
                                            H10 = cVarF1;
                                        } else {
                                            if (c2507c2 == 0) {
                                                c2507c2 = new C2507c(new e.c[16], 0);
                                            }
                                            if (H10 != 0) {
                                                c2507c2.c(H10);
                                                H10 = 0;
                                            }
                                            c2507c2.c(cVarF1);
                                        }
                                    }
                                    cVarF1 = cVarF1.getChild$ui_release();
                                    H10 = H10;
                                    c2507c2 = c2507c2;
                                }
                                if (i10 == 1) {
                                }
                            }
                            H10 = AbstractC1796k.h(c2507c2);
                        }
                    }
                }
            }
            AbstractC1796k.c(c2507c, cVar, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static final void f(I0 i02, Function1 function1) {
        int iA = AbstractC1789g0.a(262144);
        if (!i02.getNode().isAttached()) {
            H0.a.b("visitSubtreeIf called on an unattached node");
        }
        C2507c c2507c = new C2507c(new e.c[16], 0);
        e.c child$ui_release = i02.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            AbstractC1796k.c(c2507c, i02.getNode(), false);
        } else {
            c2507c.c(child$ui_release);
        }
        while (c2507c.p() != 0) {
            e.c cVar = (e.c) c2507c.y(c2507c.p() - 1);
            if ((cVar.getAggregateChildKindSet$ui_release() & iA) != 0) {
                for (e.c child$ui_release2 = cVar; child$ui_release2 != null; child$ui_release2 = child$ui_release2.getChild$ui_release()) {
                    if ((child$ui_release2.getKindSet$ui_release() & iA) != 0) {
                        ?? H10 = child$ui_release2;
                        ?? c2507c2 = 0;
                        while (H10 != 0) {
                            if (H10 instanceof I0) {
                                I0 i03 = (I0) H10;
                                H0 h02 = (AbstractC5504s.c(i02.B(), i03.B()) && l0.d.a(i02, i03)) ? (H0) function1.invoke(i03) : H0.f10420a;
                                if (h02 == H0.f10422c) {
                                    return;
                                }
                                if (h02 == H0.f10421b) {
                                    break;
                                }
                            } else if ((H10.getKindSet$ui_release() & iA) != 0 && (H10 instanceof AbstractC1800m)) {
                                e.c cVarF1 = ((AbstractC1800m) H10).F1();
                                int i10 = 0;
                                H10 = H10;
                                c2507c2 = c2507c2;
                                while (cVarF1 != null) {
                                    if ((cVarF1.getKindSet$ui_release() & iA) != 0) {
                                        i10++;
                                        c2507c2 = c2507c2;
                                        if (i10 == 1) {
                                            H10 = cVarF1;
                                        } else {
                                            if (c2507c2 == 0) {
                                                c2507c2 = new C2507c(new e.c[16], 0);
                                            }
                                            if (H10 != 0) {
                                                c2507c2.c(H10);
                                                H10 = 0;
                                            }
                                            c2507c2.c(cVarF1);
                                        }
                                    }
                                    cVarF1 = cVarF1.getChild$ui_release();
                                    H10 = H10;
                                    c2507c2 = c2507c2;
                                }
                                if (i10 == 1) {
                                }
                            }
                            H10 = AbstractC1796k.h(c2507c2);
                        }
                    }
                }
            }
            AbstractC1796k.c(c2507c, cVar, false);
        }
    }
}
