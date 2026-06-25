package r;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.A;
import androidx.lifecycle.AbstractC2870y;
import androidx.lifecycle.U;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import r.C6218a;
import r.f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class g extends U {

    /* JADX INFO: renamed from: a */
    private Executor f58254a;

    /* JADX INFO: renamed from: b */
    private f.a f58255b;

    /* JADX INFO: renamed from: c */
    private f.d f58256c;

    /* JADX INFO: renamed from: d */
    private f.c f58257d;

    /* JADX INFO: renamed from: e */
    private C6218a f58258e;

    /* JADX INFO: renamed from: f */
    private h f58259f;

    /* JADX INFO: renamed from: g */
    private DialogInterface.OnClickListener f58260g;

    /* JADX INFO: renamed from: h */
    private CharSequence f58261h;

    /* JADX INFO: renamed from: j */
    private boolean f58263j;

    /* JADX INFO: renamed from: k */
    private boolean f58264k;

    /* JADX INFO: renamed from: l */
    private boolean f58265l;

    /* JADX INFO: renamed from: m */
    private boolean f58266m;

    /* JADX INFO: renamed from: n */
    private boolean f58267n;

    /* JADX INFO: renamed from: o */
    private A f58268o;

    /* JADX INFO: renamed from: p */
    private A f58269p;

    /* JADX INFO: renamed from: q */
    private A f58270q;

    /* JADX INFO: renamed from: r */
    private A f58271r;

    /* JADX INFO: renamed from: s */
    private A f58272s;

    /* JADX INFO: renamed from: u */
    private A f58274u;

    /* JADX INFO: renamed from: w */
    private A f58276w;

    /* JADX INFO: renamed from: x */
    private A f58277x;

    /* JADX INFO: renamed from: i */
    private int f58262i = 0;

    /* JADX INFO: renamed from: t */
    private boolean f58273t = true;

    /* JADX INFO: renamed from: v */
    private int f58275v = 0;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends f.a {
        a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b extends C6218a.d {

        /* JADX INFO: renamed from: a */
        private final WeakReference f58279a;

        b(g gVar) {
            this.f58279a = new WeakReference(gVar);
        }

        @Override // r.C6218a.d
        void a(int i10, CharSequence charSequence) {
            if (this.f58279a.get() == null || ((g) this.f58279a.get()).w() || !((g) this.f58279a.get()).u()) {
                return;
            }
            ((g) this.f58279a.get()).D(new r.c(i10, charSequence));
        }

        @Override // r.C6218a.d
        void b() {
            if (this.f58279a.get() == null || !((g) this.f58279a.get()).u()) {
                return;
            }
            ((g) this.f58279a.get()).E(true);
        }

        @Override // r.C6218a.d
        void c(CharSequence charSequence) {
            if (this.f58279a.get() != null) {
                ((g) this.f58279a.get()).F(charSequence);
            }
        }

        @Override // r.C6218a.d
        void d(f.b bVar) {
            if (this.f58279a.get() == null || !((g) this.f58279a.get()).u()) {
                return;
            }
            if (bVar.a() == -1) {
                bVar = new f.b(bVar.b(), ((g) this.f58279a.get()).o());
            }
            ((g) this.f58279a.get()).G(bVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c implements Executor {

        /* JADX INFO: renamed from: a */
        private final Handler f58280a = new Handler(Looper.getMainLooper());

        c() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f58280a.post(runnable);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class d implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a */
        private final WeakReference f58281a;

        d(g gVar) {
            this.f58281a = new WeakReference(gVar);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (this.f58281a.get() != null) {
                ((g) this.f58281a.get()).U(true);
            }
        }
    }

    private static void Y(A a10, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            a10.n(obj);
        } else {
            a10.l(obj);
        }
    }

    boolean A() {
        return this.f58267n;
    }

    AbstractC2870y B() {
        if (this.f58272s == null) {
            this.f58272s = new A();
        }
        return this.f58272s;
    }

    boolean C() {
        return this.f58263j;
    }

    void D(r.c cVar) {
        if (this.f58269p == null) {
            this.f58269p = new A();
        }
        Y(this.f58269p, cVar);
    }

    void E(boolean z10) {
        if (this.f58271r == null) {
            this.f58271r = new A();
        }
        Y(this.f58271r, Boolean.valueOf(z10));
    }

    void F(CharSequence charSequence) {
        if (this.f58270q == null) {
            this.f58270q = new A();
        }
        Y(this.f58270q, charSequence);
    }

    void G(f.b bVar) {
        if (this.f58268o == null) {
            this.f58268o = new A();
        }
        Y(this.f58268o, bVar);
    }

    void H(boolean z10) {
        this.f58264k = z10;
    }

    void I(int i10) {
        this.f58262i = i10;
    }

    void J(f.a aVar) {
        this.f58255b = aVar;
    }

    void K(Executor executor) {
        this.f58254a = executor;
    }

    void L(boolean z10) {
        this.f58265l = z10;
    }

    void M(f.c cVar) {
        this.f58257d = cVar;
    }

    void N(boolean z10) {
        this.f58266m = z10;
    }

    void O(boolean z10) {
        if (this.f58274u == null) {
            this.f58274u = new A();
        }
        Y(this.f58274u, Boolean.valueOf(z10));
    }

    void P(boolean z10) {
        this.f58273t = z10;
    }

    void Q(CharSequence charSequence) {
        if (this.f58277x == null) {
            this.f58277x = new A();
        }
        Y(this.f58277x, charSequence);
    }

    void R(int i10) {
        this.f58275v = i10;
    }

    void S(int i10) {
        if (this.f58276w == null) {
            this.f58276w = new A();
        }
        Y(this.f58276w, Integer.valueOf(i10));
    }

    void T(boolean z10) {
        this.f58267n = z10;
    }

    void U(boolean z10) {
        if (this.f58272s == null) {
            this.f58272s = new A();
        }
        Y(this.f58272s, Boolean.valueOf(z10));
    }

    void V(CharSequence charSequence) {
        this.f58261h = charSequence;
    }

    void W(f.d dVar) {
        this.f58256c = dVar;
    }

    void X(boolean z10) {
        this.f58263j = z10;
    }

    int a() {
        f.d dVar = this.f58256c;
        if (dVar != null) {
            return r.b.b(dVar, this.f58257d);
        }
        return 0;
    }

    C6218a b() {
        if (this.f58258e == null) {
            this.f58258e = new C6218a(new b(this));
        }
        return this.f58258e;
    }

    A c() {
        if (this.f58269p == null) {
            this.f58269p = new A();
        }
        return this.f58269p;
    }

    AbstractC2870y d() {
        if (this.f58270q == null) {
            this.f58270q = new A();
        }
        return this.f58270q;
    }

    AbstractC2870y e() {
        if (this.f58268o == null) {
            this.f58268o = new A();
        }
        return this.f58268o;
    }

    int f() {
        return this.f58262i;
    }

    h g() {
        if (this.f58259f == null) {
            this.f58259f = new h();
        }
        return this.f58259f;
    }

    f.a h() {
        if (this.f58255b == null) {
            this.f58255b = new a();
        }
        return this.f58255b;
    }

    Executor i() {
        Executor executor = this.f58254a;
        return executor != null ? executor : new c();
    }

    f.c j() {
        return this.f58257d;
    }

    CharSequence k() {
        f.d dVar = this.f58256c;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    AbstractC2870y l() {
        if (this.f58277x == null) {
            this.f58277x = new A();
        }
        return this.f58277x;
    }

    int m() {
        return this.f58275v;
    }

    AbstractC2870y n() {
        if (this.f58276w == null) {
            this.f58276w = new A();
        }
        return this.f58276w;
    }

    int o() {
        int iA = a();
        return (!r.b.d(iA) || r.b.c(iA)) ? -1 : 2;
    }

    DialogInterface.OnClickListener p() {
        if (this.f58260g == null) {
            this.f58260g = new d(this);
        }
        return this.f58260g;
    }

    CharSequence q() {
        CharSequence charSequence = this.f58261h;
        if (charSequence != null) {
            return charSequence;
        }
        f.d dVar = this.f58256c;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    CharSequence r() {
        f.d dVar = this.f58256c;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    CharSequence s() {
        f.d dVar = this.f58256c;
        if (dVar != null) {
            return dVar.e();
        }
        return null;
    }

    AbstractC2870y t() {
        if (this.f58271r == null) {
            this.f58271r = new A();
        }
        return this.f58271r;
    }

    boolean u() {
        return this.f58264k;
    }

    boolean v() {
        f.d dVar = this.f58256c;
        return dVar == null || dVar.f();
    }

    boolean w() {
        return this.f58265l;
    }

    boolean x() {
        return this.f58266m;
    }

    AbstractC2870y y() {
        if (this.f58274u == null) {
            this.f58274u = new A();
        }
        return this.f58274u;
    }

    boolean z() {
        return this.f58273t;
    }
}
