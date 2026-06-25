package androidx.compose.ui.layout;

import I0.Q;
import I0.S;
import I0.T;
import Y.A0;
import Y.C0;
import Y.J1;
import Y.U1;
import Y.b2;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.layout.F;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.C2777p0;
import androidx.core.view.I;
import androidx.core.view.L0;
import i0.AbstractC4993l;
import i0.C4961E;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import t.AbstractC6565o;
import t.C6540F;
import t.C6546L;
import t.C6550P;
import t.c0;

/* JADX INFO: renamed from: androidx.compose.ui.layout.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2677f extends C2777p0.b implements Runnable, I, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AndroidComposeView f26929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f26930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f26931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private L0 f26932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c0 f26933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final A0 f26934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C6546L f26935g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C4961E f26936h;

    public RunnableC2677f(AndroidComposeView androidComposeView) {
        super(1);
        this.f26929a = androidComposeView;
        C6550P c6550p = new C6550P(9);
        F.a aVar = F.f26884a;
        c6550p.x(aVar.a(), new T("caption bar"));
        c6550p.x(aVar.b(), new T("display cutout"));
        c6550p.x(aVar.c(), new T("ime"));
        c6550p.x(aVar.d(), new T("mandatory system gestures"));
        c6550p.x(aVar.e(), new T("navigation bars"));
        c6550p.x(aVar.f(), new T("status bars"));
        c6550p.x(aVar.g(), new T("system gestures"));
        c6550p.x(aVar.h(), new T("tappable element"));
        c6550p.x(aVar.i(), new T("waterfall"));
        this.f26933e = c6550p;
        this.f26934f = J1.a(0);
        this.f26935g = new C6546L(4);
        this.f26936h = U1.e();
    }

    private final void g(T t10) {
        t10.i(false);
        t10.n(S.a());
        t10.o(S.a());
    }

    private final void h(T t10, C2777p0 c2777p0) {
        t10.l(c2777p0.c());
        t10.h(c2777p0.a());
        t10.k(c2777p0.b());
    }

    private final void i(L0 l02) {
        long j10;
        boolean z10;
        long j11;
        char c10;
        char c11;
        char c12;
        char c13;
        int i10;
        boolean z11;
        boolean z12;
        long jA;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        long[] jArr3;
        int[] iArr3;
        long[] jArr4;
        int[] iArr4;
        int i11;
        long j12;
        int i12;
        AbstractC6565o abstractC6565o = H.f26902a;
        int[] iArr5 = abstractC6565o.f60106b;
        Object[] objArr = abstractC6565o.f60107c;
        long[] jArr5 = abstractC6565o.f60105a;
        int i13 = 2;
        int length = jArr5.length - 2;
        long j13 = -9187201950435737472L;
        int i14 = 8;
        if (length >= 0) {
            int i15 = 0;
            z11 = false;
            z12 = false;
            z10 = true;
            j11 = 255;
            while (true) {
                long j14 = jArr5[i15];
                c10 = 7;
                c11 = 16;
                if ((((~j14) << 7) & j14 & j13) != j13) {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j14 & 255) < 128) {
                            int i18 = (i15 << 3) + i17;
                            int i19 = iArr5[i18];
                            F f10 = (F) objArr[i18];
                            A1.b bVarF = l02.f(i19);
                            j12 = j13;
                            i12 = i13;
                            i11 = i14;
                            jArr4 = jArr5;
                            iArr4 = iArr5;
                            long jA2 = Q.a((((long) bVarF.f105b) << 32) | (((long) bVarF.f104a) << 48) | (((long) bVarF.f106c) << 16) | ((long) bVarF.f107d));
                            Object objE = this.f26933e.e(f10);
                            AbstractC5504s.e(objE);
                            T t10 = (T) objE;
                            if (!Q.b(jA2, t10.a())) {
                                t10.j(jA2);
                                z11 = true;
                                if (!Q.b(jA2, S.b())) {
                                    z12 = true;
                                }
                            }
                        } else {
                            jArr4 = jArr5;
                            iArr4 = iArr5;
                            i11 = i14;
                            j12 = j13;
                            i12 = i13;
                        }
                        j14 >>= i11;
                        i17++;
                        i13 = i12;
                        i14 = i11;
                        j13 = j12;
                        iArr5 = iArr4;
                        jArr5 = jArr4;
                    }
                    jArr3 = jArr5;
                    iArr3 = iArr5;
                    j10 = j13;
                    c12 = ' ';
                    c13 = '0';
                    i10 = i13;
                    if (i16 != i14) {
                        break;
                    }
                } else {
                    jArr3 = jArr5;
                    iArr3 = iArr5;
                    j10 = j13;
                    c12 = ' ';
                    c13 = '0';
                    i10 = i13;
                }
                if (i15 == length) {
                    break;
                }
                i15++;
                i13 = i10;
                j13 = j10;
                iArr5 = iArr3;
                jArr5 = jArr3;
                i14 = 8;
            }
        } else {
            j10 = -9187201950435737472L;
            z10 = true;
            j11 = 255;
            c10 = 7;
            c11 = 16;
            c12 = ' ';
            c13 = '0';
            i10 = 2;
            z11 = false;
            z12 = false;
        }
        C6540F c6540f = H.f26904c;
        int[] iArr6 = c6540f.f60106b;
        Object[] objArr2 = c6540f.f60107c;
        long[] jArr6 = c6540f.f60105a;
        int length2 = jArr6.length - 2;
        if (length2 >= 0) {
            int i20 = 0;
            while (true) {
                long j15 = jArr6[i20];
                if ((((~j15) << c10) & j15 & j10) != j10) {
                    int i21 = 8 - ((~(i20 - length2)) >>> 31);
                    int i22 = 0;
                    while (i22 < i21) {
                        if ((j15 & j11) < 128) {
                            int i23 = (i20 << 3) + i22;
                            int i24 = iArr6[i23];
                            Object objE2 = this.f26933e.e((F) objArr2[i23]);
                            AbstractC5504s.e(objE2);
                            T t11 = (T) objE2;
                            if (i24 != L0.p.d()) {
                                A1.b bVarG = l02.g(i24);
                                jArr2 = jArr6;
                                iArr2 = iArr6;
                                long jA3 = Q.a((((long) bVarG.f105b) << c12) | (((long) bVarG.f104a) << c13) | (((long) bVarG.f106c) << c11) | ((long) bVarG.f107d));
                                if (!Q.b(t11.b(), jA3)) {
                                    t11.m(jA3);
                                    z11 = z10;
                                    if (!Q.b(jA3, S.b())) {
                                        z12 = z11;
                                    }
                                }
                            } else {
                                jArr2 = jArr6;
                                iArr2 = iArr6;
                            }
                            t11.p(l02.r(i24));
                        } else {
                            jArr2 = jArr6;
                            iArr2 = iArr6;
                        }
                        j15 >>= 8;
                        i22++;
                        jArr6 = jArr2;
                        iArr6 = iArr2;
                    }
                    jArr = jArr6;
                    iArr = iArr6;
                    if (i21 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr6;
                    iArr = iArr6;
                }
                if (i20 == length2) {
                    break;
                }
                i20++;
                jArr6 = jArr;
                iArr6 = iArr;
            }
        }
        androidx.core.view.r rVarE = l02.e();
        if (rVarE == null) {
            jA = S.b();
        } else {
            A1.b bVarF2 = rVarE.f();
            jA = Q.a((((long) bVarF2.f104a) << c13) | (((long) bVarF2.f105b) << c12) | (((long) bVarF2.f106c) << c11) | ((long) bVarF2.f107d));
        }
        c0 c0Var = this.f26933e;
        F.a aVar = F.f26884a;
        Object objE3 = c0Var.e(aVar.i());
        AbstractC5504s.e(objE3);
        T t12 = (T) objE3;
        if (!Q.b(t12.a(), jA)) {
            t12.j(jA);
            t12.m(jA);
            z11 = z10;
            if (!Q.b(jA, S.b())) {
                z12 = z11;
            }
        }
        long jB = rVarE == null ? S.b() : Q.a((((long) rVarE.e()) << c12) | (((long) rVarE.c()) << c13) | (((long) rVarE.d()) << c11) | ((long) rVarE.b()));
        Object objE4 = this.f26933e.e(aVar.b());
        AbstractC5504s.e(objE4);
        T t13 = (T) objE4;
        if (!Q.b(jB, t13.a())) {
            t13.j(jB);
            t13.m(jB);
            z11 = z10;
            if (!Q.b(jB, S.b())) {
                z12 = z11;
            }
        }
        if (rVarE != null) {
            List listA = rVarE.a();
            if (listA.size() < this.f26935g.d()) {
                this.f26935g.s(listA.size(), this.f26935g.d());
                this.f26936h.y(listA.size(), this.f26936h.size());
                z11 = z10;
            } else {
                int size = listA.size() - this.f26935g.d();
                int i25 = 0;
                while (i25 < size) {
                    C6546L c6546l = this.f26935g;
                    c6546l.k(b2.e(listA.get(c6546l.d()), null, i10, null));
                    this.f26936h.add(w.a("display cutout rect " + this.f26935g.d()));
                    i25++;
                    z11 = z10;
                }
            }
            int size2 = listA.size();
            for (int i26 = 0; i26 < size2; i26++) {
                Rect rect = (Rect) listA.get(i26);
                C0 c02 = (C0) this.f26935g.c(i26);
                if (!AbstractC5504s.c(c02.getValue(), rect)) {
                    c02.setValue(rect);
                    z11 = z10;
                }
            }
            if (!listA.isEmpty()) {
                z12 = z10;
            }
        } else if (this.f26935g.d() > 0) {
            this.f26935g.n();
            this.f26936h.clear();
            z11 = z10;
        }
        if ((z12 || this.f26934f.b() != 0) && z11) {
            A0 a02 = this.f26934f;
            a02.f(a02.b() + 1);
            AbstractC4993l.f48495e.m();
        }
    }

    public final C4961E b() {
        return this.f26936h;
    }

    public final C6546L c() {
        return this.f26935g;
    }

    @Override // androidx.core.view.I
    public L0 d(View view, L0 l02) {
        if (this.f26930b) {
            this.f26932d = l02;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return l02;
            }
        } else if (this.f26931c == 0) {
            i(l02);
        }
        return l02;
    }

    public final A0 e() {
        return this.f26934f;
    }

    public final c0 f() {
        return this.f26933e;
    }

    @Override // androidx.core.view.C2777p0.b
    public void onEnd(C2777p0 c2777p0) {
        this.f26930b = false;
        int iD = c2777p0.d();
        this.f26931c &= ~iD;
        this.f26932d = null;
        F f10 = (F) H.f26904c.c(iD);
        if (f10 != null) {
            Object objE = this.f26933e.e(f10);
            AbstractC5504s.e(objE);
            T t10 = (T) objE;
            t10.l(0.0f);
            t10.h(1.0f);
            t10.k(0L);
            t10.l(0.0f);
            g(t10);
            A0 a02 = this.f26934f;
            a02.f(a02.b() + 1);
            AbstractC4993l.f48495e.m();
        }
        super.onEnd(c2777p0);
    }

    @Override // androidx.core.view.C2777p0.b
    public void onPrepare(C2777p0 c2777p0) {
        this.f26930b = true;
        super.onPrepare(c2777p0);
    }

    @Override // androidx.core.view.C2777p0.b
    public L0 onProgress(L0 l02, List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            C2777p0 c2777p0 = (C2777p0) list.get(i10);
            F f10 = (F) H.f26904c.c(c2777p0.d());
            if (f10 != null) {
                Object objE = this.f26933e.e(f10);
                AbstractC5504s.e(objE);
                T t10 = (T) objE;
                if (t10.g()) {
                    h(t10, c2777p0);
                }
            }
        }
        i(l02);
        return l02;
    }

    @Override // androidx.core.view.C2777p0.b
    public C2777p0.a onStart(C2777p0 c2777p0, C2777p0.a aVar) {
        L0 l02 = this.f26932d;
        this.f26930b = false;
        this.f26932d = null;
        if (c2777p0.b() > 0 && l02 != null) {
            int iD = c2777p0.d();
            this.f26931c |= iD;
            F f10 = (F) H.f26904c.c(iD);
            if (f10 != null) {
                Object objE = this.f26933e.e(f10);
                AbstractC5504s.e(objE);
                T t10 = (T) objE;
                A1.b bVarF = l02.f(iD);
                long jA = Q.a(((long) bVarF.f107d) | (((long) bVarF.f104a) << 48) | (((long) bVarF.f105b) << 32) | (((long) bVarF.f106c) << 16));
                long jA2 = t10.a();
                if (!Q.b(jA, jA2)) {
                    t10.n(jA2);
                    t10.o(jA);
                    t10.i(true);
                    h(t10, c2777p0);
                    A0 a02 = this.f26934f;
                    a02.f(a02.b() + 1);
                    AbstractC4993l.f48495e.m();
                }
            }
        }
        return super.onStart(c2777p0, aVar);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        AbstractC2747a0.w0(view, this);
        AbstractC2747a0.C0(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        AbstractC2747a0.w0(view, null);
        AbstractC2747a0.C0(view, null);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f26930b) {
            this.f26931c = 0;
            this.f26930b = false;
            L0 l02 = this.f26932d;
            if (l02 != null) {
                i(l02);
                this.f26932d = null;
            }
        }
    }
}
