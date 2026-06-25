package androidx.compose.ui.focus;

import C0.c;
import K0.AbstractC1789g0;
import K0.AbstractC1796k;
import K0.AbstractC1800m;
import K0.C1781c0;
import K0.InterfaceC1794j;
import K0.J;
import K0.Y;
import K0.p0;
import a0.C2507c;
import android.view.KeyEvent;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.k;
import androidx.compose.ui.platform.V0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.N;
import q0.C6060f;
import q0.EnumC6056b;
import q0.InterfaceC6058d;
import q0.InterfaceC6061g;
import q0.InterfaceC6064j;
import r0.C6226h;
import t.C6544J;
import t.C6546L;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class FocusOwnerImpl implements InterfaceC6064j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q0.q f26619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p0 f26620b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C6060f f26622d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C6544J f26624f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private FocusTargetNode f26626h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f26627i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FocusTargetNode f26621c = new FocusTargetNode(s.f26690a.b(), null, null, 6, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.compose.ui.e f26623e = new Y() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        @Override // K0.Y
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public FocusTargetNode create() {
            return this.f26635b.y();
        }

        public boolean equals(Object other) {
            return other == this;
        }

        public int hashCode() {
            return this.f26635b.y().hashCode();
        }

        @Override // K0.Y
        public void inspectableProperties(V0 v02) {
            v02.d("RootFocusTarget");
        }

        @Override // K0.Y
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void update(FocusTargetNode node) {
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C6546L f26625g = new C6546L(1);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26628a;

        static {
            int[] iArr = new int[EnumC6056b.values().length];
            try {
                iArr[EnumC6056b.f56110c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6056b.f56109b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6056b.f56111d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC6056b.f56108a.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f26628a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f26629a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FocusOwnerImpl f26630b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f26631c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(FocusTargetNode focusTargetNode, FocusOwnerImpl focusOwnerImpl, Function1 function1) {
            super(1);
            this.f26629a = focusTargetNode;
            this.f26630b = focusOwnerImpl;
            this.f26631c = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            boolean zBooleanValue;
            if (AbstractC5504s.c(focusTargetNode, this.f26629a)) {
                zBooleanValue = false;
            } else {
                if (AbstractC5504s.c(focusTargetNode, this.f26630b.y())) {
                    throw new IllegalStateException("Focus search landed at the root.");
                }
                zBooleanValue = ((Boolean) this.f26631c.invoke(focusTargetNode)).booleanValue();
            }
            return Boolean.valueOf(zBooleanValue);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f26632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f26633b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(N n10, int i10) {
            super(1);
            this.f26632a = n10;
            this.f26633b = i10;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            this.f26632a.f52259a = Boolean.valueOf(focusTargetNode.q(this.f26633b));
            return (Boolean) this.f26632a.f52259a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f26634a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i10) {
            super(1);
            this.f26634a = i10;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.valueOf(focusTargetNode.q(this.f26634a));
        }
    }

    public FocusOwnerImpl(q0.q qVar, p0 p0Var) {
        this.f26619a = qVar;
        this.f26620b = p0Var;
        this.f26622d = new C6060f(this, p0Var);
    }

    private final boolean C(KeyEvent keyEvent) {
        long jA = C0.d.a(keyEvent);
        int iB = C0.d.b(keyEvent);
        c.a aVar = C0.c.f2484a;
        if (C0.c.e(iB, aVar.a())) {
            C6544J c6544j = this.f26624f;
            if (c6544j == null) {
                c6544j = new C6544J(3);
                this.f26624f = c6544j;
            }
            c6544j.l(jA);
        } else if (C0.c.e(iB, aVar.b())) {
            C6544J c6544j2 = this.f26624f;
            if (c6544j2 == null || !c6544j2.a(jA)) {
                return false;
            }
            C6544J c6544j3 = this.f26624f;
            if (c6544j3 != null) {
                c6544j3.m(jA);
            }
        }
        return true;
    }

    private final boolean w(boolean z10, boolean z11) {
        C1781c0 c1781c0T0;
        if (j() == null) {
            return true;
        }
        if (o() && !z10) {
            return false;
        }
        FocusTargetNode focusTargetNodeJ = j();
        s(null);
        if (z11 && focusTargetNodeJ != null) {
            focusTargetNodeJ.I1(o() ? q0.o.f56123c : q0.o.f56121a, q0.o.f56124d);
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
                            C2507c c2507c = null;
                            e.c cVarH = parent$ui_release;
                            while (cVarH != null) {
                                if (cVarH instanceof FocusTargetNode) {
                                    ((FocusTargetNode) cVarH).I1(q0.o.f56122b, q0.o.f56124d);
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
        return true;
    }

    private final FocusTargetNode x() {
        return r.b(this.f26621c);
    }

    private final e.c z(InterfaceC1794j interfaceC1794j) {
        int iA = AbstractC1789g0.a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | AbstractC1789g0.a(8192);
        if (!interfaceC1794j.getNode().isAttached()) {
            H0.a.b("visitLocalDescendants called on an unattached node");
        }
        e.c node = interfaceC1794j.getNode();
        e.c cVar = null;
        if ((node.getAggregateChildKindSet$ui_release() & iA) != 0) {
            for (e.c child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                if ((child$ui_release.getKindSet$ui_release() & iA) != 0) {
                    if ((AbstractC1789g0.a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) & child$ui_release.getKindSet$ui_release()) != 0) {
                        return cVar;
                    }
                    cVar = child$ui_release;
                }
            }
        }
        return cVar;
    }

    public void A(boolean z10) {
        if (!((z10 && j() == null) ? false : true)) {
            H0.a.a("Cannot capture focus when the active focus target node is unset");
        }
        this.f26627i = z10;
    }

    public boolean B(int i10, C6226h c6226h) {
        Boolean boolE = e(i10, c6226h, new d(i10));
        if (boolE != null) {
            return boolE.booleanValue();
        }
        return false;
    }

    @Override // q0.InterfaceC6064j
    public void a() {
        this.f26619a.a();
    }

    @Override // q0.InterfaceC6064j
    public boolean b(androidx.compose.ui.focus.d dVar, C6226h c6226h) {
        return this.f26619a.b(dVar, c6226h);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00e3 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:3:0x0009, B:5:0x0012, B:10:0x0020, B:14:0x002a, B:17:0x0038, B:114:0x018e, B:116:0x019c, B:117:0x019f, B:119:0x01ae, B:122:0x01bf, B:126:0x01ca, B:129:0x01d0, B:130:0x01d5, B:150:0x0217, B:131:0x01d9, B:133:0x01e0, B:135:0x01e4, B:137:0x01ee, B:139:0x01f5, B:141:0x01f9, B:143:0x01ff, B:145:0x0208, B:146:0x020c, B:147:0x020f, B:151:0x021c, B:152:0x0221, B:154:0x0227, B:156:0x022d, B:159:0x0238, B:161:0x0240, B:168:0x0257, B:169:0x0259, B:170:0x0269, B:172:0x026d, B:174:0x0271, B:201:0x02d0, B:178:0x027d, B:180:0x0286, B:182:0x028c, B:184:0x0295, B:186:0x029c, B:188:0x02a0, B:189:0x02a5, B:191:0x02ab, B:192:0x02b2, B:194:0x02ba, B:195:0x02bf, B:197:0x02c5, B:198:0x02c8, B:202:0x02db, B:206:0x02eb, B:207:0x02fb, B:209:0x02ff, B:211:0x0303, B:238:0x0362, B:215:0x030f, B:217:0x0318, B:219:0x031e, B:221:0x0327, B:223:0x032e, B:225:0x0332, B:226:0x0337, B:228:0x033d, B:229:0x0344, B:231:0x034c, B:232:0x0351, B:234:0x0357, B:235:0x035a, B:240:0x036f, B:242:0x0376, B:247:0x0389, B:248:0x038b, B:20:0x0040, B:22:0x004e, B:23:0x0051, B:25:0x005b, B:28:0x006c, B:32:0x0077, B:63:0x00d9, B:65:0x00dd, B:35:0x007d, B:37:0x0084, B:39:0x0088, B:41:0x0092, B:43:0x0099, B:45:0x009d, B:47:0x00a3, B:49:0x00ac, B:50:0x00b0, B:51:0x00b3, B:54:0x00bb, B:55:0x00c0, B:56:0x00c5, B:58:0x00cb, B:60:0x00d1, B:66:0x00e3, B:68:0x00f3, B:69:0x00f6, B:71:0x0104, B:74:0x0115, B:78:0x0120, B:109:0x0182, B:111:0x0186, B:81:0x0126, B:83:0x012d, B:85:0x0131, B:87:0x013b, B:89:0x0142, B:91:0x0146, B:93:0x014c, B:95:0x0155, B:96:0x0159, B:97:0x015c, B:100:0x0164, B:101:0x0169, B:102:0x016e, B:104:0x0174, B:106:0x017a), top: B:253:0x0009 }] */
    @Override // q0.InterfaceC6064j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d(android.view.KeyEvent r17, ie.InterfaceC5082a r18) {
        /*
            Method dump skipped, instruction units count: 917
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.d(android.view.KeyEvent, ie.a):boolean");
    }

    @Override // q0.InterfaceC6064j
    public Boolean e(int i10, C6226h c6226h, Function1 function1) {
        FocusTargetNode focusTargetNodeX = x();
        if (focusTargetNodeX != null) {
            k kVarA = r.a(focusTargetNodeX, i10, this.f26620b.getLayoutDirection());
            k.a aVar = k.f26678b;
            if (AbstractC5504s.c(kVarA, aVar.a())) {
                return null;
            }
            if (AbstractC5504s.c(kVarA, aVar.c())) {
                FocusTargetNode focusTargetNodeX2 = x();
                if (focusTargetNodeX2 != null) {
                    return (Boolean) function1.invoke(focusTargetNodeX2);
                }
                return null;
            }
            if (!AbstractC5504s.c(kVarA, aVar.b())) {
                return Boolean.valueOf(kVarA.d(function1));
            }
        } else {
            focusTargetNodeX = null;
        }
        return r.e(this.f26621c, i10, this.f26620b.getLayoutDirection(), c6226h, new b(focusTargetNodeX, this, function1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // q0.InterfaceC6064j
    public boolean f(G0.b bVar, InterfaceC5082a interfaceC5082a) {
        G0.a aVar;
        int size;
        C1781c0 c1781c0T0;
        ?? H10;
        C1781c0 c1781c0T02;
        if (this.f26622d.b()) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode focusTargetNodeX = x();
        if (focusTargetNodeX != null) {
            int iA = AbstractC1789g0.a(16384);
            if (!focusTargetNodeX.getNode().isAttached()) {
                H0.a.b("visitAncestors called on an unattached node");
            }
            e.c node = focusTargetNodeX.getNode();
            J jN = AbstractC1796k.n(focusTargetNodeX);
            loop0: while (true) {
                if (jN == null) {
                    H10 = 0;
                    break;
                }
                if ((jN.t0().k().getAggregateChildKindSet$ui_release() & iA) != 0) {
                    while (node != null) {
                        if ((node.getKindSet$ui_release() & iA) != 0) {
                            ?? c2507c = 0;
                            H10 = node;
                            while (H10 != 0) {
                                if (H10 instanceof G0.a) {
                                    break loop0;
                                }
                                if ((H10.getKindSet$ui_release() & iA) != 0 && (H10 instanceof AbstractC1800m)) {
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
                        node = node.getParent$ui_release();
                    }
                }
                jN = jN.A0();
                node = (jN == null || (c1781c0T02 = jN.t0()) == null) ? null : c1781c0T02.p();
            }
            aVar = (G0.a) H10;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            int iA2 = AbstractC1789g0.a(16384);
            if (!aVar.getNode().isAttached()) {
                H0.a.b("visitAncestors called on an unattached node");
            }
            e.c parent$ui_release = aVar.getNode().getParent$ui_release();
            J jN2 = AbstractC1796k.n(aVar);
            ArrayList arrayList = null;
            while (jN2 != null) {
                if ((jN2.t0().k().getAggregateChildKindSet$ui_release() & iA2) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & iA2) != 0) {
                            e.c cVarH = parent$ui_release;
                            C2507c c2507c2 = null;
                            while (cVarH != null) {
                                if (cVarH instanceof G0.a) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(cVarH);
                                } else if ((cVarH.getKindSet$ui_release() & iA2) != 0 && (cVarH instanceof AbstractC1800m)) {
                                    int i11 = 0;
                                    for (e.c cVarF12 = ((AbstractC1800m) cVarH).F1(); cVarF12 != null; cVarF12 = cVarF12.getChild$ui_release()) {
                                        if ((cVarF12.getKindSet$ui_release() & iA2) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                cVarH = cVarF12;
                                            } else {
                                                if (c2507c2 == null) {
                                                    c2507c2 = new C2507c(new e.c[16], 0);
                                                }
                                                if (cVarH != null) {
                                                    c2507c2.c(cVarH);
                                                    cVarH = null;
                                                }
                                                c2507c2.c(cVarF12);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                cVarH = AbstractC1796k.h(c2507c2);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                jN2 = jN2.A0();
                parent$ui_release = (jN2 == null || (c1781c0T0 = jN2.t0()) == null) ? null : c1781c0T0.p();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i12 = size - 1;
                    if (((G0.a) arrayList.get(size)).V(bVar)) {
                        return true;
                    }
                    if (i12 < 0) {
                        break;
                    }
                    size = i12;
                }
            }
            ?? node2 = aVar.getNode();
            ?? c2507c3 = 0;
            while (node2 != 0) {
                if (node2 instanceof G0.a) {
                    if (((G0.a) node2).V(bVar)) {
                        return true;
                    }
                } else if ((node2.getKindSet$ui_release() & iA2) != 0 && (node2 instanceof AbstractC1800m)) {
                    e.c cVarF13 = ((AbstractC1800m) node2).F1();
                    int i13 = 0;
                    node2 = node2;
                    c2507c3 = c2507c3;
                    while (cVarF13 != null) {
                        if ((cVarF13.getKindSet$ui_release() & iA2) != 0) {
                            i13++;
                            c2507c3 = c2507c3;
                            if (i13 == 1) {
                                node2 = cVarF13;
                            } else {
                                if (c2507c3 == 0) {
                                    c2507c3 = new C2507c(new e.c[16], 0);
                                }
                                if (node2 != 0) {
                                    c2507c3.c(node2);
                                    node2 = 0;
                                }
                                c2507c3.c(cVarF13);
                            }
                        }
                        cVarF13 = cVarF13.getChild$ui_release();
                        node2 = node2;
                        c2507c3 = c2507c3;
                    }
                    if (i13 == 1) {
                    }
                }
                node2 = AbstractC1796k.h(c2507c3);
            }
            if (((Boolean) interfaceC5082a.invoke()).booleanValue()) {
                return true;
            }
            ?? node3 = aVar.getNode();
            ?? c2507c4 = 0;
            while (node3 != 0) {
                if (node3 instanceof G0.a) {
                    if (((G0.a) node3).x0(bVar)) {
                        return true;
                    }
                } else if ((node3.getKindSet$ui_release() & iA2) != 0 && (node3 instanceof AbstractC1800m)) {
                    e.c cVarF14 = ((AbstractC1800m) node3).F1();
                    int i14 = 0;
                    node3 = node3;
                    c2507c4 = c2507c4;
                    while (cVarF14 != null) {
                        if ((cVarF14.getKindSet$ui_release() & iA2) != 0) {
                            i14++;
                            c2507c4 = c2507c4;
                            if (i14 == 1) {
                                node3 = cVarF14;
                            } else {
                                if (c2507c4 == 0) {
                                    c2507c4 = new C2507c(new e.c[16], 0);
                                }
                                if (node3 != 0) {
                                    c2507c4.c(node3);
                                    node3 = 0;
                                }
                                c2507c4.c(cVarF14);
                            }
                        }
                        cVarF14 = cVarF14.getChild$ui_release();
                        node3 = node3;
                        c2507c4 = c2507c4;
                    }
                    if (i14 == 1) {
                    }
                }
                node3 = AbstractC1796k.h(c2507c4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    if (((G0.a) arrayList.get(i15)).x0(bVar)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // q0.InterfaceC6064j
    public boolean g(B0.c cVar, InterfaceC5082a interfaceC5082a) {
        C1781c0 c1781c0T0;
        if (this.f26622d.b()) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching indirect touch event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode focusTargetNodeX = x();
        if (focusTargetNodeX != null) {
            int iA = AbstractC1789g0.a(2097152);
            if (!focusTargetNodeX.getNode().isAttached()) {
                H0.a.b("visitAncestors called on an unattached node");
            }
            e.c node = focusTargetNodeX.getNode();
            J jN = AbstractC1796k.n(focusTargetNodeX);
            while (jN != null) {
                if ((jN.t0().k().getAggregateChildKindSet$ui_release() & iA) != 0) {
                    while (node != null) {
                        if ((node.getKindSet$ui_release() & iA) != 0) {
                            e.c cVarH = node;
                            C2507c c2507c = null;
                            while (cVarH != null) {
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
                        node = node.getParent$ui_release();
                    }
                }
                jN = jN.A0();
                node = (jN == null || (c1781c0T0 = jN.t0()) == null) ? null : c1781c0T0.p();
            }
            android.support.v4.media.session.b.a(null);
        }
        return false;
    }

    @Override // q0.InterfaceC6062h
    public boolean h(int i10) {
        if (l0.h.f52331d && this.f26619a.d(i10)) {
            return true;
        }
        N n10 = new N();
        n10.f52259a = Boolean.FALSE;
        FocusTargetNode focusTargetNodeJ = j();
        Boolean boolE = e(i10, this.f26619a.getEmbeddedViewFocusRect(), new c(n10, i10));
        if (AbstractC5504s.c(boolE, Boolean.TRUE) && focusTargetNodeJ != j()) {
            return true;
        }
        if (boolE != null && n10.f52259a != null) {
            if (boolE.booleanValue() && ((Boolean) n10.f52259a).booleanValue()) {
                return true;
            }
            if (h.a(i10)) {
                return p(false, true, false, i10) && B(i10, null);
            }
            if (!l0.h.f52331d && this.f26619a.d(i10)) {
                return true;
            }
        }
        return false;
    }

    @Override // q0.InterfaceC6064j
    public boolean i(KeyEvent keyEvent) {
        C1781c0 c1781c0T0;
        if (this.f26622d.b()) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode focusTargetNodeB = r.b(this.f26621c);
        if (focusTargetNodeB != null) {
            int iA = AbstractC1789g0.a(131072);
            if (!focusTargetNodeB.getNode().isAttached()) {
                H0.a.b("visitAncestors called on an unattached node");
            }
            e.c node = focusTargetNodeB.getNode();
            J jN = AbstractC1796k.n(focusTargetNodeB);
            while (jN != null) {
                if ((jN.t0().k().getAggregateChildKindSet$ui_release() & iA) != 0) {
                    while (node != null) {
                        if ((node.getKindSet$ui_release() & iA) != 0) {
                            e.c cVarH = node;
                            C2507c c2507c = null;
                            while (cVarH != null) {
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
                        node = node.getParent$ui_release();
                    }
                }
                jN = jN.A0();
                node = (jN == null || (c1781c0T0 = jN.t0()) == null) ? null : c1781c0T0.p();
            }
            android.support.v4.media.session.b.a(null);
        }
        return false;
    }

    @Override // q0.InterfaceC6064j
    public FocusTargetNode j() {
        return this.f26626h;
    }

    @Override // q0.InterfaceC6064j
    public void k(FocusTargetNode focusTargetNode) {
        this.f26622d.f(focusTargetNode);
    }

    @Override // q0.InterfaceC6064j
    public void l() {
        this.f26622d.e();
    }

    @Override // q0.InterfaceC6064j
    public androidx.compose.ui.e m() {
        return this.f26623e;
    }

    @Override // q0.InterfaceC6064j
    public void n(InterfaceC6058d interfaceC6058d) {
        this.f26622d.g(interfaceC6058d);
    }

    @Override // q0.InterfaceC6064j
    public boolean o() {
        return this.f26627i;
    }

    @Override // q0.InterfaceC6064j
    public boolean p(boolean z10, boolean z11, boolean z12, int i10) {
        boolean zW;
        if (z10) {
            zW = w(z10, z11);
        } else {
            int i11 = a.f26628a[q.e(this.f26621c, i10).ordinal()];
            if (i11 == 1 || i11 == 2 || i11 == 3) {
                zW = false;
            } else {
                if (i11 != 4) {
                    throw new Td.r();
                }
                zW = w(z10, z11);
            }
        }
        if (zW && z12) {
            a();
        }
        return zW;
    }

    @Override // q0.InterfaceC6064j
    public q0.n q() {
        return this.f26621c.L1();
    }

    @Override // q0.InterfaceC6064j
    public C6226h r() {
        FocusTargetNode focusTargetNodeX = x();
        if (focusTargetNodeX != null) {
            return r.d(focusTargetNodeX);
        }
        return null;
    }

    @Override // q0.InterfaceC6064j
    public void s(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNode2 = this.f26626h;
        this.f26626h = focusTargetNode;
        if (focusTargetNode == null || focusTargetNode2 != focusTargetNode) {
            A(false);
        }
        if (l0.h.f52330c) {
            C6546L c6546lU = u();
            Object[] objArr = c6546lU.f60006a;
            int i10 = c6546lU.f60007b;
            for (int i11 = 0; i11 < i10; i11++) {
                ((InterfaceC6061g) objArr[i11]).b(focusTargetNode2, focusTargetNode);
            }
        }
    }

    @Override // q0.InterfaceC6064j
    public void t() {
        q.b(this.f26621c, true, true);
    }

    @Override // q0.InterfaceC6064j
    public C6546L u() {
        return this.f26625g;
    }

    @Override // q0.InterfaceC6062h
    public void v(boolean z10) {
        p(z10, true, true, androidx.compose.ui.focus.d.f26651b.c());
    }

    public final FocusTargetNode y() {
        return this.f26621c;
    }
}
