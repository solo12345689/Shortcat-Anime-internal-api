package S5;

import R5.a;
import R5.c;
import X5.a;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import java.util.Map;
import java.util.concurrent.Executor;
import k6.C5453b;
import l6.InterfaceC5557b;
import y5.g;
import y5.i;
import y5.k;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements Y5.a, a.InterfaceC0262a, a.InterfaceC0372a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Map f15952w = g.of("component_tag", "drawee");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Map f15953x = g.of("origin", "memory_bitmap", "origin_sub", "shortcut");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final Class f15954y = a.class;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final R5.a f15956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f15957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private R5.d f15958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private X5.a f15959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected d f15960f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Y5.c f15962h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Drawable f15963i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f15964j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Object f15965k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f15966l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f15967m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f15968n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f15969o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f15970p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f15971q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private I5.c f15972r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Object f15973s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected Drawable f15976v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final R5.c f15955a = R5.c.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected l6.d f15961g = new l6.d();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f15974t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f15975u = false;

    /* JADX INFO: renamed from: S5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class C0274a extends I5.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f15977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f15978b;

        C0274a(String str, boolean z10) {
            this.f15977a = str;
            this.f15978b = z10;
        }

        @Override // I5.b, I5.e
        public void b(I5.c cVar) {
            boolean zIsFinished = cVar.isFinished();
            a.this.P(this.f15977a, cVar, cVar.d(), zIsFinished);
        }

        @Override // I5.b
        public void e(I5.c cVar) {
            a.this.M(this.f15977a, cVar, cVar.c(), true);
        }

        @Override // I5.b
        public void f(I5.c cVar) {
            boolean zIsFinished = cVar.isFinished();
            boolean zE = cVar.e();
            float fD = cVar.d();
            Object objA = cVar.a();
            if (objA != null) {
                a.this.O(this.f15977a, cVar, objA, fD, zIsFinished, this.f15978b, zE);
            } else if (zIsFinished) {
                a.this.M(this.f15977a, cVar, new NullPointerException(), true);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b extends f {
        private b() {
        }

        public static b e(d dVar, d dVar2) {
            if (L6.b.d()) {
                L6.b.a("AbstractDraweeController#createInternal");
            }
            b bVar = new b();
            bVar.b(dVar);
            bVar.b(dVar2);
            if (L6.b.d()) {
                L6.b.b();
            }
            return bVar;
        }
    }

    public a(R5.a aVar, Executor executor, String str, Object obj) {
        this.f15956b = aVar;
        this.f15957c = executor;
        D(str, obj);
    }

    private Y5.c C() {
        Y5.c cVar = this.f15962h;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException("mSettableDraweeHierarchy is null; Caller context: " + this.f15965k);
    }

    private synchronized void D(String str, Object obj) {
        R5.a aVar;
        try {
            if (L6.b.d()) {
                L6.b.a("AbstractDraweeController#init");
            }
            this.f15955a.b(c.a.ON_INIT_CONTROLLER);
            if (!this.f15974t && (aVar = this.f15956b) != null) {
                aVar.a(this);
            }
            this.f15966l = false;
            this.f15968n = false;
            R();
            this.f15970p = false;
            R5.d dVar = this.f15958d;
            if (dVar != null) {
                dVar.a();
            }
            X5.a aVar2 = this.f15959e;
            if (aVar2 != null) {
                aVar2.a();
                this.f15959e.f(this);
            }
            d dVar2 = this.f15960f;
            if (dVar2 instanceof b) {
                ((b) dVar2).c();
            } else {
                this.f15960f = null;
            }
            Y5.c cVar = this.f15962h;
            if (cVar != null) {
                cVar.reset();
                this.f15962h.f(null);
                this.f15962h = null;
            }
            this.f15963i = null;
            if (AbstractC7283a.w(2)) {
                AbstractC7283a.A(f15954y, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.f15964j, str);
            }
            this.f15964j = str;
            this.f15965k = obj;
            if (L6.b.d()) {
                L6.b.b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private boolean F(String str, I5.c cVar) {
        if (cVar == null && this.f15972r == null) {
            return true;
        }
        return str.equals(this.f15964j) && cVar == this.f15972r && this.f15967m;
    }

    private void H(String str, Throwable th2) {
        if (AbstractC7283a.w(2)) {
            AbstractC7283a.B(f15954y, "controller %x %s: %s: failure: %s", Integer.valueOf(System.identityHashCode(this)), this.f15964j, str, th2);
        }
    }

    private void I(String str, Object obj) {
        if (AbstractC7283a.w(2)) {
            AbstractC7283a.C(f15954y, "controller %x %s: %s: image: %s %x", Integer.valueOf(System.identityHashCode(this)), this.f15964j, str, x(obj), Integer.valueOf(y(obj)));
        }
    }

    private InterfaceC5557b.a J(I5.c cVar, Object obj, Uri uri) {
        return K(cVar == null ? null : cVar.getExtras(), L(obj), uri);
    }

    private InterfaceC5557b.a K(Map map, Map map2, Uri uri) {
        String str;
        PointF pointFL;
        Y5.c cVar = this.f15962h;
        if (cVar instanceof W5.a) {
            W5.a aVar = (W5.a) cVar;
            String strValueOf = String.valueOf(aVar.m());
            pointFL = aVar.l();
            str = strValueOf;
        } else {
            str = null;
            pointFL = null;
        }
        return C5453b.a(f15952w, f15953x, map, null, u(), str, pointFL, map2, p(), G(), uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(String str, I5.c cVar, Throwable th2, boolean z10) {
        Drawable drawable;
        if (L6.b.d()) {
            L6.b.a("AbstractDraweeController#onFailureInternal");
        }
        if (!F(str, cVar)) {
            H("ignore_old_datasource @ onFailure", th2);
            cVar.close();
            if (L6.b.d()) {
                L6.b.b();
                return;
            }
            return;
        }
        this.f15955a.b(z10 ? c.a.ON_DATASOURCE_FAILURE : c.a.ON_DATASOURCE_FAILURE_INT);
        if (z10) {
            H("final_failed @ onFailure", th2);
            this.f15972r = null;
            this.f15969o = true;
            Y5.c cVar2 = this.f15962h;
            if (cVar2 != null) {
                if (this.f15970p && (drawable = this.f15976v) != null) {
                    cVar2.e(drawable, 1.0f, true);
                } else if (h0()) {
                    cVar2.a(th2);
                } else {
                    cVar2.b(th2);
                }
            }
            U(th2, cVar);
        } else {
            H("intermediate_failed @ onFailure", th2);
            V(th2);
        }
        if (L6.b.d()) {
            L6.b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O(String str, I5.c cVar, Object obj, float f10, boolean z10, boolean z11, boolean z12) {
        try {
            if (L6.b.d()) {
                L6.b.a("AbstractDraweeController#onNewResultInternal");
            }
            if (!F(str, cVar)) {
                I("ignore_old_datasource @ onNewResult", obj);
                S(obj);
                cVar.close();
                if (L6.b.d()) {
                    L6.b.b();
                    return;
                }
                return;
            }
            this.f15955a.b(z10 ? c.a.ON_DATASOURCE_RESULT : c.a.ON_DATASOURCE_RESULT_INT);
            try {
                Drawable drawableM = m(obj);
                Object obj2 = this.f15973s;
                Drawable drawable = this.f15976v;
                this.f15973s = obj;
                this.f15976v = drawableM;
                try {
                    if (z10) {
                        I("set_final_result @ onNewResult", obj);
                        this.f15972r = null;
                        C().e(drawableM, 1.0f, z11);
                        Z(str, obj, cVar);
                    } else if (z12) {
                        I("set_temporary_result @ onNewResult", obj);
                        C().e(drawableM, 1.0f, z11);
                        Z(str, obj, cVar);
                    } else {
                        I("set_intermediate_result @ onNewResult", obj);
                        C().e(drawableM, f10, z11);
                        W(str, obj);
                    }
                    if (drawable != null && drawable != drawableM) {
                        Q(drawable);
                    }
                    if (obj2 != null && obj2 != obj) {
                        I("release_previous_result @ onNewResult", obj2);
                        S(obj2);
                    }
                    if (L6.b.d()) {
                        L6.b.b();
                    }
                } catch (Throwable th2) {
                    if (drawable != null && drawable != drawableM) {
                        Q(drawable);
                    }
                    if (obj2 != null && obj2 != obj) {
                        I("release_previous_result @ onNewResult", obj2);
                        S(obj2);
                    }
                    throw th2;
                }
            } catch (Exception e10) {
                I("drawable_failed @ onNewResult", obj);
                S(obj);
                M(str, cVar, e10, z10);
                if (L6.b.d()) {
                    L6.b.b();
                }
            }
        } catch (Throwable th3) {
            if (L6.b.d()) {
                L6.b.b();
            }
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P(String str, I5.c cVar, float f10, boolean z10) {
        if (!F(str, cVar)) {
            H("ignore_old_datasource @ onProgress", null);
            cVar.close();
        } else {
            if (z10) {
                return;
            }
            this.f15962h.c(f10, false);
        }
    }

    private void R() {
        Map extras;
        boolean z10 = this.f15967m;
        this.f15967m = false;
        this.f15969o = false;
        I5.c cVar = this.f15972r;
        Map map = null;
        if (cVar != null) {
            extras = cVar.getExtras();
            this.f15972r.close();
            this.f15972r = null;
        } else {
            extras = null;
        }
        Drawable drawable = this.f15976v;
        if (drawable != null) {
            Q(drawable);
        }
        if (this.f15971q != null) {
            this.f15971q = null;
        }
        this.f15976v = null;
        Object obj = this.f15973s;
        if (obj != null) {
            Map mapL = L(z(obj));
            I("release", this.f15973s);
            S(this.f15973s);
            this.f15973s = null;
            map = mapL;
        }
        if (z10) {
            X(extras, map);
        }
    }

    private void U(Throwable th2, I5.c cVar) {
        InterfaceC5557b.a aVarJ = J(cVar, null, null);
        q().g(this.f15964j, th2);
        r().h(this.f15964j, th2, aVarJ);
    }

    private void V(Throwable th2) {
        q().s(this.f15964j, th2);
        r().k(this.f15964j);
    }

    private void W(String str, Object obj) {
        Object objZ = z(obj);
        q().a(str, objZ);
        r().a(str, objZ);
    }

    private void X(Map map, Map map2) {
        q().h(this.f15964j);
        r().b(this.f15964j, K(map, map2, null));
    }

    private void Z(String str, Object obj, I5.c cVar) {
        Object objZ = z(obj);
        q().n(str, objZ, n());
        r().j(str, objZ, J(cVar, objZ, null));
    }

    private boolean h0() {
        R5.d dVar;
        return this.f15969o && (dVar = this.f15958d) != null && dVar.e();
    }

    private Rect u() {
        Y5.c cVar = this.f15962h;
        if (cVar == null) {
            return null;
        }
        return cVar.getBounds();
    }

    protected abstract Uri A();

    protected R5.d B() {
        if (this.f15958d == null) {
            this.f15958d = new R5.d();
        }
        return this.f15958d;
    }

    protected void E(String str, Object obj) {
        D(str, obj);
        this.f15974t = false;
        this.f15975u = false;
    }

    protected boolean G() {
        return this.f15975u;
    }

    public abstract Map L(Object obj);

    protected abstract void Q(Drawable drawable);

    protected abstract void S(Object obj);

    public void T(InterfaceC5557b interfaceC5557b) {
        this.f15961g.o(interfaceC5557b);
    }

    protected void Y(I5.c cVar, Object obj) {
        q().r(this.f15964j, this.f15965k);
        r().g(this.f15964j, this.f15965k, J(cVar, obj, A()));
    }

    @Override // R5.a.InterfaceC0262a
    public void a() {
        this.f15955a.b(c.a.ON_RELEASE_CONTROLLER);
        R5.d dVar = this.f15958d;
        if (dVar != null) {
            dVar.c();
        }
        X5.a aVar = this.f15959e;
        if (aVar != null) {
            aVar.e();
        }
        Y5.c cVar = this.f15962h;
        if (cVar != null) {
            cVar.reset();
        }
        R();
    }

    public void a0(String str) {
        this.f15971q = str;
    }

    @Override // Y5.a
    public boolean b(MotionEvent motionEvent) {
        if (AbstractC7283a.w(2)) {
            AbstractC7283a.A(f15954y, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.f15964j, motionEvent);
        }
        X5.a aVar = this.f15959e;
        if (aVar == null) {
            return false;
        }
        if (!aVar.b() && !g0()) {
            return false;
        }
        this.f15959e.d(motionEvent);
        return true;
    }

    protected void b0(Drawable drawable) {
        this.f15963i = drawable;
        Y5.c cVar = this.f15962h;
        if (cVar != null) {
            cVar.f(drawable);
        }
    }

    @Override // X5.a.InterfaceC0372a
    public boolean c() {
        if (AbstractC7283a.w(2)) {
            AbstractC7283a.z(f15954y, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(this)), this.f15964j);
        }
        if (!h0()) {
            return false;
        }
        this.f15958d.b();
        this.f15962h.reset();
        i0();
        return true;
    }

    @Override // Y5.a
    public void d() {
        if (L6.b.d()) {
            L6.b.a("AbstractDraweeController#onAttach");
        }
        if (AbstractC7283a.w(2)) {
            AbstractC7283a.A(f15954y, "controller %x %s: onAttach: %s", Integer.valueOf(System.identityHashCode(this)), this.f15964j, this.f15967m ? "request already submitted" : "request needs submit");
        }
        this.f15955a.b(c.a.ON_ATTACH_CONTROLLER);
        k.g(this.f15962h);
        this.f15956b.a(this);
        this.f15966l = true;
        if (!this.f15967m) {
            i0();
        }
        if (L6.b.d()) {
            L6.b.b();
        }
    }

    protected void d0(X5.a aVar) {
        this.f15959e = aVar;
        if (aVar != null) {
            aVar.f(this);
        }
    }

    @Override // Y5.a
    public void e() {
        if (L6.b.d()) {
            L6.b.a("AbstractDraweeController#onDetach");
        }
        if (AbstractC7283a.w(2)) {
            AbstractC7283a.z(f15954y, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(this)), this.f15964j);
        }
        this.f15955a.b(c.a.ON_DETACH_CONTROLLER);
        this.f15966l = false;
        this.f15956b.d(this);
        if (L6.b.d()) {
            L6.b.b();
        }
    }

    protected void e0(boolean z10) {
        this.f15975u = z10;
    }

    @Override // Y5.a
    public Y5.b f() {
        return this.f15962h;
    }

    protected void f0(boolean z10) {
        this.f15970p = z10;
    }

    @Override // Y5.a
    public void g(Y5.b bVar) {
        if (AbstractC7283a.w(2)) {
            AbstractC7283a.A(f15954y, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.f15964j, bVar);
        }
        this.f15955a.b(bVar != null ? c.a.ON_SET_HIERARCHY : c.a.ON_CLEAR_HIERARCHY);
        if (this.f15967m) {
            this.f15956b.a(this);
            a();
        }
        Y5.c cVar = this.f15962h;
        if (cVar != null) {
            cVar.f(null);
            this.f15962h = null;
        }
        if (bVar != null) {
            k.b(Boolean.valueOf(bVar instanceof Y5.c));
            Y5.c cVar2 = (Y5.c) bVar;
            this.f15962h = cVar2;
            cVar2.f(this.f15963i);
        }
    }

    protected boolean g0() {
        return h0();
    }

    protected void i0() {
        if (L6.b.d()) {
            L6.b.a("AbstractDraweeController#submitRequest");
        }
        Object objO = o();
        if (objO != null) {
            if (L6.b.d()) {
                L6.b.a("AbstractDraweeController#submitRequest->cache");
            }
            this.f15972r = null;
            this.f15967m = true;
            this.f15969o = false;
            this.f15955a.b(c.a.ON_SUBMIT_CACHE_HIT);
            Y(this.f15972r, z(objO));
            N(this.f15964j, objO);
            O(this.f15964j, this.f15972r, objO, 1.0f, true, true, true);
            if (L6.b.d()) {
                L6.b.b();
            }
            if (L6.b.d()) {
                L6.b.b();
                return;
            }
            return;
        }
        this.f15955a.b(c.a.ON_DATASOURCE_SUBMIT);
        this.f15962h.c(0.0f, true);
        this.f15967m = true;
        this.f15969o = false;
        I5.c cVarT = t();
        this.f15972r = cVarT;
        Y(cVarT, null);
        if (AbstractC7283a.w(2)) {
            AbstractC7283a.A(f15954y, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.f15964j, Integer.valueOf(System.identityHashCode(this.f15972r)));
        }
        this.f15972r.f(new C0274a(this.f15964j, this.f15972r.b()), this.f15957c);
        if (L6.b.d()) {
            L6.b.b();
        }
    }

    public void k(d dVar) {
        k.g(dVar);
        d dVar2 = this.f15960f;
        if (dVar2 instanceof b) {
            ((b) dVar2).b(dVar);
        } else if (dVar2 != null) {
            this.f15960f = b.e(dVar2, dVar);
        } else {
            this.f15960f = dVar;
        }
    }

    public void l(InterfaceC5557b interfaceC5557b) {
        this.f15961g.m(interfaceC5557b);
    }

    protected abstract Drawable m(Object obj);

    public Animatable n() {
        Object obj = this.f15976v;
        if (obj instanceof Animatable) {
            return (Animatable) obj;
        }
        return null;
    }

    protected abstract Object o();

    public Object p() {
        return this.f15965k;
    }

    protected d q() {
        d dVar = this.f15960f;
        return dVar == null ? c.b() : dVar;
    }

    protected InterfaceC5557b r() {
        return this.f15961g;
    }

    protected Drawable s() {
        return this.f15963i;
    }

    protected abstract I5.c t();

    public String toString() {
        return i.b(this).c("isAttached", this.f15966l).c("isRequestSubmitted", this.f15967m).c("hasFetchFailed", this.f15969o).a("fetchedImage", y(this.f15973s)).b("events", this.f15955a.toString()).toString();
    }

    protected X5.a v() {
        return this.f15959e;
    }

    public String w() {
        return this.f15964j;
    }

    protected String x(Object obj) {
        return obj != null ? obj.getClass().getSimpleName() : "<null>";
    }

    protected abstract int y(Object obj);

    protected abstract Object z(Object obj);

    public void c0(e eVar) {
    }

    protected void N(String str, Object obj) {
    }
}
