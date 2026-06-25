package S5;

import I5.h;
import android.content.Context;
import android.graphics.drawable.Animatable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import l6.InterfaceC5557b;
import y5.i;
import y5.k;
import y5.n;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final d f15980q = new a();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final NullPointerException f15981r = new NullPointerException("No image request was specified!");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final AtomicLong f15982s = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f15983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f15984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f15985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f15986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f15987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Object f15988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Object[] f15989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f15990h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private n f15991i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private d f15992j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f15993k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f15994l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f15995m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f15996n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f15997o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Y5.a f15998p;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends S5.c {
        a() {
        }

        @Override // S5.c, S5.d
        public void n(String str, Object obj, Animatable animatable) {
            if (animatable != null) {
                animatable.start();
            }
        }
    }

    /* JADX INFO: renamed from: S5.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class C0275b implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y5.a f15999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f16000b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f16001c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f16002d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ c f16003e;

        C0275b(Y5.a aVar, String str, Object obj, Object obj2, c cVar) {
            this.f15999a = aVar;
            this.f16000b = str;
            this.f16001c = obj;
            this.f16002d = obj2;
            this.f16003e = cVar;
        }

        @Override // y5.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public I5.c get() {
            return b.this.g(this.f15999a, this.f16000b, this.f16001c, this.f16002d, this.f16003e);
        }

        public String toString() {
            return i.b(this).b("request", this.f16001c.toString()).toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum c {
        FULL_FETCH,
        DISK_CACHE,
        BITMAP_MEMORY_CACHE
    }

    protected b(Context context, Set set, Set set2) {
        this.f15983a = context;
        this.f15984b = set;
        this.f15985c = set2;
        q();
    }

    protected static String c() {
        return String.valueOf(f15982s.getAndIncrement());
    }

    private void q() {
        this.f15986d = null;
        this.f15987e = null;
        this.f15988f = null;
        this.f15989g = null;
        this.f15990h = true;
        this.f15992j = null;
        this.f15993k = false;
        this.f15994l = false;
        this.f15996n = false;
        this.f15998p = null;
        this.f15997o = null;
    }

    public b A(d dVar) {
        this.f15992j = dVar;
        return p();
    }

    public b B(Object obj) {
        this.f15987e = obj;
        return p();
    }

    public b C(Object obj) {
        this.f15988f = obj;
        return p();
    }

    public b D(Y5.a aVar) {
        this.f15998p = aVar;
        return p();
    }

    protected void E() {
        boolean z10 = true;
        k.j(this.f15989g == null || this.f15987e == null, "Cannot specify both ImageRequest and FirstAvailableImageRequests!");
        if (this.f15991i != null && (this.f15989g != null || this.f15987e != null || this.f15988f != null)) {
            z10 = false;
        }
        k.j(z10, "Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
    }

    public S5.a a() {
        Object obj;
        E();
        if (this.f15987e == null && this.f15989g == null && (obj = this.f15988f) != null) {
            this.f15987e = obj;
            this.f15988f = null;
        }
        return b();
    }

    protected S5.a b() {
        if (L6.b.d()) {
            L6.b.a("AbstractDraweeControllerBuilder#buildController");
        }
        S5.a aVarV = v();
        aVarV.e0(r());
        aVarV.f0(o());
        aVarV.a0(e());
        f();
        aVarV.c0(null);
        u(aVarV);
        s(aVarV);
        if (L6.b.d()) {
            L6.b.b();
        }
        return aVarV;
    }

    public Object d() {
        return this.f15986d;
    }

    public String e() {
        return this.f15997o;
    }

    public e f() {
        return null;
    }

    protected abstract I5.c g(Y5.a aVar, String str, Object obj, Object obj2, c cVar);

    protected n h(Y5.a aVar, String str, Object obj) {
        return i(aVar, str, obj, c.FULL_FETCH);
    }

    protected n i(Y5.a aVar, String str, Object obj, c cVar) {
        return new C0275b(aVar, str, obj, d(), cVar);
    }

    protected n j(Y5.a aVar, String str, Object[] objArr, boolean z10) {
        ArrayList arrayList = new ArrayList(objArr.length * 2);
        if (z10) {
            for (Object obj : objArr) {
                arrayList.add(i(aVar, str, obj, c.BITMAP_MEMORY_CACHE));
            }
        }
        for (Object obj2 : objArr) {
            arrayList.add(h(aVar, str, obj2));
        }
        return I5.f.b(arrayList);
    }

    public Object[] k() {
        return this.f15989g;
    }

    public Object l() {
        return this.f15987e;
    }

    public Object m() {
        return this.f15988f;
    }

    public Y5.a n() {
        return this.f15998p;
    }

    public boolean o() {
        return this.f15995m;
    }

    public boolean r() {
        return this.f15996n;
    }

    protected void s(S5.a aVar) {
        Set set = this.f15984b;
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                aVar.k((d) it.next());
            }
        }
        Set set2 = this.f15985c;
        if (set2 != null) {
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                aVar.l((InterfaceC5557b) it2.next());
            }
        }
        d dVar = this.f15992j;
        if (dVar != null) {
            aVar.k(dVar);
        }
        if (this.f15994l) {
            aVar.k(f15980q);
        }
    }

    protected void t(S5.a aVar) {
        if (aVar.v() == null) {
            aVar.d0(X5.a.c(this.f15983a));
        }
    }

    protected void u(S5.a aVar) {
        if (this.f15993k) {
            aVar.B().d(this.f15993k);
            t(aVar);
        }
    }

    protected abstract S5.a v();

    protected n w(Y5.a aVar, String str) {
        n nVarJ;
        n nVar = this.f15991i;
        if (nVar != null) {
            return nVar;
        }
        Object obj = this.f15987e;
        if (obj != null) {
            nVarJ = h(aVar, str, obj);
        } else {
            Object[] objArr = this.f15989g;
            nVarJ = objArr != null ? j(aVar, str, objArr, this.f15990h) : null;
        }
        if (nVarJ != null && this.f15988f != null) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(nVarJ);
            arrayList.add(h(aVar, str, this.f15988f));
            nVarJ = h.c(arrayList, false);
        }
        return nVarJ == null ? I5.d.a(f15981r) : nVarJ;
    }

    public b x() {
        q();
        return p();
    }

    public b y(boolean z10) {
        this.f15994l = z10;
        return p();
    }

    public b z(Object obj) {
        this.f15986d = obj;
        return p();
    }

    protected final b p() {
        return this;
    }
}
