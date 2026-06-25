package androidx.compose.ui.platform;

import android.graphics.Rect;
import g1.EnumC4829i;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;
import r0.C6226h;

/* JADX INFO: renamed from: androidx.compose.ui.platform.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2692e extends AbstractC2683b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static C2692e f27443h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private U0.T0 f27446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private R0.s f27447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Rect f27448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f27441f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f27442g = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final EnumC4829i f27444i = EnumC4829i.f47275b;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final EnumC4829i f27445j = EnumC4829i.f47274a;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.e$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2692e a() {
            if (C2692e.f27443h == null) {
                C2692e.f27443h = new C2692e(null);
            }
            C2692e c2692e = C2692e.f27443h;
            AbstractC5504s.f(c2692e, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
            return c2692e;
        }

        private a() {
        }
    }

    public /* synthetic */ C2692e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final int i(int i10, EnumC4829i enumC4829i) {
        U0.T0 t02 = this.f27446c;
        U0.T0 t03 = null;
        if (t02 == null) {
            AbstractC5504s.u("layoutResult");
            t02 = null;
        }
        int iU = t02.u(i10);
        U0.T0 t04 = this.f27446c;
        if (t04 == null) {
            AbstractC5504s.u("layoutResult");
            t04 = null;
        }
        if (enumC4829i != t04.y(iU)) {
            U0.T0 t05 = this.f27446c;
            if (t05 == null) {
                AbstractC5504s.u("layoutResult");
            } else {
                t03 = t05;
            }
            return t03.u(i10);
        }
        U0.T0 t06 = this.f27446c;
        if (t06 == null) {
            AbstractC5504s.u("layoutResult");
            t06 = null;
        }
        return U0.T0.p(t06, i10, false, 2, null) - 1;
    }

    @Override // androidx.compose.ui.platform.InterfaceC2698g
    public int[] a(int i10) {
        int iN;
        U0.T0 t02 = null;
        if (d().length() <= 0 || i10 >= d().length()) {
            return null;
        }
        try {
            R0.s sVar = this.f27447d;
            if (sVar == null) {
                AbstractC5504s.u("node");
                sVar = null;
            }
            C6226h c6226hK = sVar.k();
            int iRound = Math.round(c6226hK.e() - c6226hK.l());
            int iE = AbstractC5874j.e(0, i10);
            U0.T0 t03 = this.f27446c;
            if (t03 == null) {
                AbstractC5504s.u("layoutResult");
                t03 = null;
            }
            int iQ = t03.q(iE);
            U0.T0 t04 = this.f27446c;
            if (t04 == null) {
                AbstractC5504s.u("layoutResult");
                t04 = null;
            }
            float fV = t04.v(iQ) + iRound;
            U0.T0 t05 = this.f27446c;
            if (t05 == null) {
                AbstractC5504s.u("layoutResult");
                t05 = null;
            }
            U0.T0 t06 = this.f27446c;
            if (t06 == null) {
                AbstractC5504s.u("layoutResult");
                t06 = null;
            }
            if (fV < t05.v(t06.n() - 1)) {
                U0.T0 t07 = this.f27446c;
                if (t07 == null) {
                    AbstractC5504s.u("layoutResult");
                } else {
                    t02 = t07;
                }
                iN = t02.r(fV);
            } else {
                U0.T0 t08 = this.f27446c;
                if (t08 == null) {
                    AbstractC5504s.u("layoutResult");
                } else {
                    t02 = t08;
                }
                iN = t02.n();
            }
            return c(iE, i(iN - 1, f27445j) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // androidx.compose.ui.platform.InterfaceC2698g
    public int[] b(int i10) {
        int iR;
        U0.T0 t02 = null;
        if (d().length() <= 0 || i10 <= 0) {
            return null;
        }
        try {
            R0.s sVar = this.f27447d;
            if (sVar == null) {
                AbstractC5504s.u("node");
                sVar = null;
            }
            C6226h c6226hK = sVar.k();
            int iRound = Math.round(c6226hK.e() - c6226hK.l());
            int i11 = AbstractC5874j.i(d().length(), i10);
            U0.T0 t03 = this.f27446c;
            if (t03 == null) {
                AbstractC5504s.u("layoutResult");
                t03 = null;
            }
            int iQ = t03.q(i11);
            U0.T0 t04 = this.f27446c;
            if (t04 == null) {
                AbstractC5504s.u("layoutResult");
                t04 = null;
            }
            float fV = t04.v(iQ) - iRound;
            if (fV > 0.0f) {
                U0.T0 t05 = this.f27446c;
                if (t05 == null) {
                    AbstractC5504s.u("layoutResult");
                } else {
                    t02 = t05;
                }
                iR = t02.r(fV);
            } else {
                iR = 0;
            }
            if (i11 == d().length() && iR < iQ) {
                iR++;
            }
            return c(i(iR, f27444i), i11);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final void j(String str, U0.T0 t02, R0.s sVar) {
        f(str);
        this.f27446c = t02;
        this.f27447d = sVar;
    }

    private C2692e() {
        this.f27448e = new Rect();
    }
}
