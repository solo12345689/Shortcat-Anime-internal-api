package androidx.compose.ui.focus;

import I0.AbstractC1678d;
import I0.InterfaceC1677c;
import K0.AbstractC1789g0;
import K0.AbstractC1796k;
import K0.AbstractC1797k0;
import K0.AbstractC1800m;
import K0.C1781c0;
import K0.InterfaceC1790h;
import K0.InterfaceC1795j0;
import K0.J;
import K0.Y;
import Td.L;
import a0.C2507c;
import android.os.Trace;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.V0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import q0.EnumC6056b;
import q0.InterfaceC6058d;
import q0.InterfaceC6064j;
import q0.InterfaceC6065k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class FocusTargetNode extends e.c implements InterfaceC1790h, o, InterfaceC1795j0, J0.h {

    /* JADX INFO: renamed from: a */
    private final Function2 f26637a;

    /* JADX INFO: renamed from: b */
    private final Function1 f26638b;

    /* JADX INFO: renamed from: c */
    private boolean f26639c;

    /* JADX INFO: renamed from: d */
    private boolean f26640d;

    /* JADX INFO: renamed from: e */
    private q0.o f26641e;

    /* JADX INFO: renamed from: f */
    private final boolean f26642f;

    /* JADX INFO: renamed from: g */
    private int f26643g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f26645a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f26646b;

        static {
            int[] iArr = new int[EnumC6056b.values().length];
            try {
                iArr[EnumC6056b.f56108a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6056b.f56110c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6056b.f56109b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC6056b.f56111d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f26645a = iArr;
            int[] iArr2 = new int[q0.o.values().length];
            try {
                iArr2[q0.o.f56121a.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[q0.o.f56123c.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[q0.o.f56122b.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[q0.o.f56124d.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f26646b = iArr2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ N f26647a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ FocusTargetNode f26648b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(N n10, FocusTargetNode focusTargetNode) {
            super(0);
            this.f26647a = n10;
            this.f26648b = focusTargetNode;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m74invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m74invoke() {
            this.f26647a.f52259a = this.f26648b.J1();
        }
    }

    public /* synthetic */ FocusTargetNode(int i10, Function2 function2, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, function2, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v5 */
    public final void I1(q0.n nVar, q0.n nVar2) {
        C1781c0 c1781c0T0;
        Function2 function2;
        InterfaceC6064j focusOwner = AbstractC1796k.o(this).getFocusOwner();
        FocusTargetNode focusTargetNodeJ = focusOwner.j();
        if (!AbstractC5504s.c(nVar, nVar2) && (function2 = this.f26637a) != null) {
            function2.invoke(nVar, nVar2);
        }
        int iA = AbstractC1789g0.a(4096);
        int iA2 = AbstractC1789g0.a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        e.c node = getNode();
        int i10 = iA | iA2;
        if (!getNode().isAttached()) {
            H0.a.b("visitAncestors called on an unattached node");
        }
        e.c node2 = getNode();
        J jN = AbstractC1796k.n(this);
        loop0: while (jN != null) {
            if ((jN.t0().k().getAggregateChildKindSet$ui_release() & i10) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet$ui_release() & i10) != 0) {
                        if (node2 != node && (node2.getKindSet$ui_release() & iA2) != 0) {
                            break loop0;
                        }
                        if ((node2.getKindSet$ui_release() & iA) != 0) {
                            ?? H10 = node2;
                            ?? c2507c = 0;
                            while (H10 != 0) {
                                if (H10 instanceof InterfaceC6058d) {
                                    InterfaceC6058d interfaceC6058d = (InterfaceC6058d) H10;
                                    if (focusTargetNodeJ == focusOwner.j()) {
                                        interfaceC6058d.W0(nVar2);
                                    }
                                } else if ((H10.getKindSet$ui_release() & iA) != 0 && (H10 instanceof AbstractC1800m)) {
                                    e.c cVarF1 = ((AbstractC1800m) H10).F1();
                                    int i11 = 0;
                                    H10 = H10;
                                    c2507c = c2507c;
                                    while (cVarF1 != null) {
                                        if ((cVarF1.getKindSet$ui_release() & iA) != 0) {
                                            i11++;
                                            c2507c = c2507c;
                                            if (i11 == 1) {
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
                                    if (i11 == 1) {
                                    }
                                }
                                H10 = AbstractC1796k.h(c2507c);
                            }
                        }
                    }
                    node2 = node2.getParent$ui_release();
                }
            }
            jN = jN.A0();
            node2 = (jN == null || (c1781c0T0 = jN.t0()) == null) ? null : c1781c0T0.p();
        }
        Function1 function1 = this.f26638b;
        if (function1 != null) {
            function1.invoke(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [androidx.compose.ui.e$c] */
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
    public final i J1() {
        C1781c0 c1781c0T0;
        j jVar = new j();
        jVar.g(s.c(M1(), this));
        int iA = AbstractC1789g0.a(2048);
        int iA2 = AbstractC1789g0.a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        e.c node = getNode();
        int i10 = iA | iA2;
        if (!getNode().isAttached()) {
            H0.a.b("visitAncestors called on an unattached node");
        }
        e.c node2 = getNode();
        J jN = AbstractC1796k.n(this);
        while (jN != null) {
            if ((jN.t0().k().getAggregateChildKindSet$ui_release() & i10) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet$ui_release() & i10) != 0) {
                        if (node2 != node && (node2.getKindSet$ui_release() & iA2) != 0) {
                            return jVar;
                        }
                        if ((node2.getKindSet$ui_release() & iA) != 0) {
                            ?? H10 = node2;
                            ?? c2507c = 0;
                            while (H10 != 0) {
                                if (H10 instanceof InterfaceC6065k) {
                                    ((InterfaceC6065k) H10).P0(jVar);
                                } else if ((H10.getKindSet$ui_release() & iA) != 0 && (H10 instanceof AbstractC1800m)) {
                                    e.c cVarF1 = ((AbstractC1800m) H10).F1();
                                    int i11 = 0;
                                    H10 = H10;
                                    c2507c = c2507c;
                                    while (cVarF1 != null) {
                                        if ((cVarF1.getKindSet$ui_release() & iA) != 0) {
                                            i11++;
                                            c2507c = c2507c;
                                            if (i11 == 1) {
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
                                    if (i11 == 1) {
                                    }
                                }
                                H10 = AbstractC1796k.h(c2507c);
                            }
                        }
                    }
                    node2 = node2.getParent$ui_release();
                }
            }
            jN = jN.A0();
            node2 = (jN == null || (c1781c0T0 = jN.t0()) == null) ? null : c1781c0T0.p();
        }
        return jVar;
    }

    public final InterfaceC1677c K1() {
        return (InterfaceC1677c) j(AbstractC1678d.a());
    }

    public q0.o L1() {
        C1781c0 c1781c0T0;
        if (!isAttached()) {
            return q0.o.f56124d;
        }
        InterfaceC6064j focusOwner = AbstractC1796k.o(this).getFocusOwner();
        FocusTargetNode focusTargetNodeJ = focusOwner.j();
        if (focusTargetNodeJ == null) {
            return q0.o.f56124d;
        }
        if (this == focusTargetNodeJ) {
            return focusOwner.o() ? q0.o.f56123c : q0.o.f56121a;
        }
        if (focusTargetNodeJ.isAttached()) {
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
                            e.c cVarH = parent$ui_release;
                            C2507c c2507c = null;
                            while (cVarH != null) {
                                if (cVarH instanceof FocusTargetNode) {
                                    if (this == ((FocusTargetNode) cVarH)) {
                                        return q0.o.f56122b;
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
        }
        return q0.o.f56124d;
    }

    public int M1() {
        return this.f26643g;
    }

    public final void N1() {
        i iVar;
        int i10 = a.f26646b[L1().ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3 && i10 != 4) {
                throw new Td.r();
            }
            return;
        }
        N n10 = new N();
        AbstractC1797k0.a(this, new b(n10, this));
        Object obj = n10.f52259a;
        if (obj == null) {
            AbstractC5504s.u("focusProperties");
            iVar = null;
        } else {
            iVar = (i) obj;
        }
        if (iVar.i()) {
            return;
        }
        AbstractC1796k.o(this).getFocusOwner().v(true);
    }

    @Override // androidx.compose.ui.e.c
    public boolean getShouldAutoInvalidate() {
        return this.f26642f;
    }

    @Override // androidx.compose.ui.e.c
    public void onDetach() {
        int i10 = a.f26646b[L1().ordinal()];
        if (i10 == 1 || i10 == 2) {
            InterfaceC6064j focusOwner = AbstractC1796k.o(this).getFocusOwner();
            focusOwner.p(true, true, false, d.f26651b.c());
            focusOwner.l();
        } else if (i10 != 3 && i10 != 4) {
            throw new Td.r();
        }
        this.f26641e = null;
    }

    @Override // androidx.compose.ui.e.c
    public void onReset() {
        if (l0.h.f52336i && L1().a()) {
            AbstractC1796k.o(this).getFocusOwner().p(true, true, true, d.f26651b.c());
        }
    }

    @Override // androidx.compose.ui.focus.o
    public boolean q(int i10) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean zI = false;
            if (!J1().i()) {
                Trace.endSection();
                return false;
            }
            int i11 = a.f26645a[q.h(this, i10).ordinal()];
            if (i11 == 1) {
                zI = q.i(this);
            } else if (i11 == 2) {
                zI = true;
            } else if (i11 != 3 && i11 != 4) {
                throw new Td.r();
            }
            return zI;
        } finally {
            Trace.endSection();
        }
    }

    @Override // K0.InterfaceC1795j0
    public void q0() {
        N1();
    }

    public /* synthetic */ FocusTargetNode(int i10, Function2 function2, Function1 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? s.f26690a.a() : i10, (i11 & 2) != 0 ? null : function2, (i11 & 4) != 0 ? null : function1, null);
    }

    private FocusTargetNode(int i10, Function2 function2, Function1 function1) {
        this.f26637a = function2;
        this.f26638b = function1;
        this.f26643g = i10;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\b*\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode$FocusTargetElement;", "LK0/Y;", "Landroidx/compose/ui/focus/FocusTargetNode;", "<init>", "()V", "c", "()Landroidx/compose/ui/focus/FocusTargetNode;", "node", "LTd/L;", "h", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "Landroidx/compose/ui/platform/V0;", "inspectableProperties", "(Landroidx/compose/ui/platform/V0;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FocusTargetElement extends Y {

        /* JADX INFO: renamed from: b */
        public static final FocusTargetElement f26644b = new FocusTargetElement();

        private FocusTargetElement() {
        }

        @Override // K0.Y
        /* JADX INFO: renamed from: c */
        public FocusTargetNode create() {
            return new FocusTargetNode(0, null, null, 7, null);
        }

        public boolean equals(Object other) {
            return other == this;
        }

        public int hashCode() {
            return 1739042953;
        }

        @Override // K0.Y
        public void inspectableProperties(V0 v02) {
            v02.d("focusTarget");
        }

        @Override // K0.Y
        /* JADX INFO: renamed from: h */
        public void update(FocusTargetNode node) {
        }
    }
}
