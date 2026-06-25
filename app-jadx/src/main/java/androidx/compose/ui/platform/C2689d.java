package androidx.compose.ui.platform;

import g1.EnumC4829i;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: androidx.compose.ui.platform.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2689d extends AbstractC2683b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static C2689d f27437f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private U0.T0 f27440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f27435d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f27436e = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final EnumC4829i f27438g = EnumC4829i.f47275b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final EnumC4829i f27439h = EnumC4829i.f47274a;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2689d a() {
            if (C2689d.f27437f == null) {
                C2689d.f27437f = new C2689d(null);
            }
            C2689d c2689d = C2689d.f27437f;
            AbstractC5504s.f(c2689d, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
            return c2689d;
        }

        private a() {
        }
    }

    public /* synthetic */ C2689d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final int i(int i10, EnumC4829i enumC4829i) {
        U0.T0 t02 = this.f27440c;
        U0.T0 t03 = null;
        if (t02 == null) {
            AbstractC5504s.u("layoutResult");
            t02 = null;
        }
        int iU = t02.u(i10);
        U0.T0 t04 = this.f27440c;
        if (t04 == null) {
            AbstractC5504s.u("layoutResult");
            t04 = null;
        }
        if (enumC4829i != t04.y(iU)) {
            U0.T0 t05 = this.f27440c;
            if (t05 == null) {
                AbstractC5504s.u("layoutResult");
            } else {
                t03 = t05;
            }
            return t03.u(i10);
        }
        U0.T0 t06 = this.f27440c;
        if (t06 == null) {
            AbstractC5504s.u("layoutResult");
            t06 = null;
        }
        return U0.T0.p(t06, i10, false, 2, null) - 1;
    }

    @Override // androidx.compose.ui.platform.InterfaceC2698g
    public int[] a(int i10) {
        int iQ;
        if (d().length() <= 0 || i10 >= d().length()) {
            return null;
        }
        if (i10 < 0) {
            U0.T0 t02 = this.f27440c;
            if (t02 == null) {
                AbstractC5504s.u("layoutResult");
                t02 = null;
            }
            iQ = t02.q(0);
        } else {
            U0.T0 t03 = this.f27440c;
            if (t03 == null) {
                AbstractC5504s.u("layoutResult");
                t03 = null;
            }
            int iQ2 = t03.q(i10);
            iQ = i(iQ2, f27438g) == i10 ? iQ2 : iQ2 + 1;
        }
        U0.T0 t04 = this.f27440c;
        if (t04 == null) {
            AbstractC5504s.u("layoutResult");
            t04 = null;
        }
        if (iQ >= t04.n()) {
            return null;
        }
        return c(i(iQ, f27438g), i(iQ, f27439h) + 1);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2698g
    public int[] b(int i10) {
        int iQ;
        if (d().length() <= 0 || i10 <= 0) {
            return null;
        }
        if (i10 > d().length()) {
            U0.T0 t02 = this.f27440c;
            if (t02 == null) {
                AbstractC5504s.u("layoutResult");
                t02 = null;
            }
            iQ = t02.q(d().length());
        } else {
            U0.T0 t03 = this.f27440c;
            if (t03 == null) {
                AbstractC5504s.u("layoutResult");
                t03 = null;
            }
            int iQ2 = t03.q(i10);
            iQ = i(iQ2, f27439h) + 1 == i10 ? iQ2 : iQ2 - 1;
        }
        if (iQ < 0) {
            return null;
        }
        return c(i(iQ, f27438g), i(iQ, f27439h) + 1);
    }

    public final void j(String str, U0.T0 t02) {
        f(str);
        this.f27440c = t02;
    }

    private C2689d() {
    }
}
