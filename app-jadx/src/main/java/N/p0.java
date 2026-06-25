package N;

import U0.T0;
import a1.C2527U;
import a1.InterfaceC2517J;
import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import r0.C6226h;
import s0.C6356g1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f12518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l0 f12519b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f12521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f12522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f12523f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f12524g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f12525h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f12526i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private C2527U f12527j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private T0 f12528k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private InterfaceC2517J f12529l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private C6226h f12530m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C6226h f12531n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f12520c = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final CursorAnchorInfo.Builder f12532o = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final float[] f12533p = C6356g1.c(null, 1, null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Matrix f12534q = new Matrix();

    public p0(Function1 function1, l0 l0Var) {
        this.f12518a = function1;
        this.f12519b = l0Var;
    }

    private final void c() {
        if (this.f12519b.b()) {
            C6356g1.h(this.f12533p);
            this.f12518a.invoke(C6356g1.a(this.f12533p));
            float[] fArr = this.f12533p;
            C6226h c6226h = this.f12531n;
            AbstractC5504s.e(c6226h);
            float f10 = -c6226h.i();
            C6226h c6226h2 = this.f12531n;
            AbstractC5504s.e(c6226h2);
            C6356g1.n(fArr, f10, -c6226h2.l(), 0.0f);
            s0.P.a(this.f12534q, this.f12533p);
            l0 l0Var = this.f12519b;
            CursorAnchorInfo.Builder builder = this.f12532o;
            C2527U c2527u = this.f12527j;
            AbstractC5504s.e(c2527u);
            InterfaceC2517J interfaceC2517J = this.f12529l;
            AbstractC5504s.e(interfaceC2517J);
            T0 t02 = this.f12528k;
            AbstractC5504s.e(t02);
            Matrix matrix = this.f12534q;
            C6226h c6226h3 = this.f12530m;
            AbstractC5504s.e(c6226h3);
            C6226h c6226h4 = this.f12531n;
            AbstractC5504s.e(c6226h4);
            l0Var.updateCursorAnchorInfo(o0.b(builder, c2527u, interfaceC2517J, t02, matrix, c6226h3, c6226h4, this.f12523f, this.f12524g, this.f12525h, this.f12526i));
            this.f12522e = false;
        }
    }

    public final void a() {
        synchronized (this.f12520c) {
            this.f12527j = null;
            this.f12529l = null;
            this.f12528k = null;
            this.f12530m = null;
            this.f12531n = null;
            Td.L l10 = Td.L.f17438a;
        }
    }

    public final void b(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        synchronized (this.f12520c) {
            try {
                this.f12523f = z12;
                this.f12524g = z13;
                this.f12525h = z14;
                this.f12526i = z15;
                if (z10) {
                    this.f12522e = true;
                    if (this.f12527j != null) {
                        c();
                    }
                }
                this.f12521d = z11;
                Td.L l10 = Td.L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(C2527U c2527u, InterfaceC2517J interfaceC2517J, T0 t02, C6226h c6226h, C6226h c6226h2) {
        synchronized (this.f12520c) {
            try {
                this.f12527j = c2527u;
                this.f12529l = interfaceC2517J;
                this.f12528k = t02;
                this.f12530m = c6226h;
                this.f12531n = c6226h2;
                if (this.f12522e || this.f12521d) {
                    c();
                }
                Td.L l10 = Td.L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
