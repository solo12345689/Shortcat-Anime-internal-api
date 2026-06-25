package k5;

import U4.j;
import U4.k;
import U4.q;
import U4.v;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.c;
import d5.i;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import o5.AbstractC5830g;
import o5.l;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements InterfaceC5451c, l5.c, g {

    /* JADX INFO: renamed from: E */
    private static final boolean f52095E = Log.isLoggable("GlideRequest", 2);

    /* JADX INFO: renamed from: A */
    private int f52096A;

    /* JADX INFO: renamed from: B */
    private int f52097B;

    /* JADX INFO: renamed from: C */
    private boolean f52098C;

    /* JADX INFO: renamed from: D */
    private RuntimeException f52099D;

    /* JADX INFO: renamed from: a */
    private int f52100a;

    /* JADX INFO: renamed from: b */
    private final String f52101b;

    /* JADX INFO: renamed from: c */
    private final p5.c f52102c;

    /* JADX INFO: renamed from: d */
    private final Object f52103d;

    /* JADX INFO: renamed from: e */
    private final e f52104e;

    /* JADX INFO: renamed from: f */
    private final com.bumptech.glide.request.b f52105f;

    /* JADX INFO: renamed from: g */
    private final Context f52106g;

    /* JADX INFO: renamed from: h */
    private final com.bumptech.glide.d f52107h;

    /* JADX INFO: renamed from: i */
    private final Object f52108i;

    /* JADX INFO: renamed from: j */
    private final Class f52109j;

    /* JADX INFO: renamed from: k */
    private final AbstractC5449a f52110k;

    /* JADX INFO: renamed from: l */
    private final int f52111l;

    /* JADX INFO: renamed from: m */
    private final int f52112m;

    /* JADX INFO: renamed from: n */
    private final com.bumptech.glide.g f52113n;

    /* JADX INFO: renamed from: o */
    private final l5.d f52114o;

    /* JADX INFO: renamed from: p */
    private final List f52115p;

    /* JADX INFO: renamed from: q */
    private final m5.c f52116q;

    /* JADX INFO: renamed from: r */
    private final Executor f52117r;

    /* JADX INFO: renamed from: s */
    private v f52118s;

    /* JADX INFO: renamed from: t */
    private k.d f52119t;

    /* JADX INFO: renamed from: u */
    private long f52120u;

    /* JADX INFO: renamed from: v */
    private volatile k f52121v;

    /* JADX INFO: renamed from: w */
    private a f52122w;

    /* JADX INFO: renamed from: x */
    private Drawable f52123x;

    /* JADX INFO: renamed from: y */
    private Drawable f52124y;

    /* JADX INFO: renamed from: z */
    private Drawable f52125z;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private h(Context context, com.bumptech.glide.d dVar, Object obj, Object obj2, Class cls, AbstractC5449a abstractC5449a, int i10, int i11, com.bumptech.glide.g gVar, l5.d dVar2, e eVar, List list, com.bumptech.glide.request.b bVar, k kVar, m5.c cVar, Executor executor) {
        this.f52101b = f52095E ? String.valueOf(super.hashCode()) : null;
        this.f52102c = p5.c.a();
        this.f52103d = obj;
        this.f52106g = context;
        this.f52107h = dVar;
        this.f52108i = obj2;
        this.f52109j = cls;
        this.f52110k = abstractC5449a;
        this.f52111l = i10;
        this.f52112m = i11;
        this.f52113n = gVar;
        this.f52114o = dVar2;
        this.f52104e = eVar;
        this.f52115p = list;
        this.f52105f = bVar;
        this.f52121v = kVar;
        this.f52116q = cVar;
        this.f52117r = executor;
        this.f52122w = a.PENDING;
        if (this.f52099D == null && dVar.f().a(c.C0597c.class)) {
            this.f52099D = new RuntimeException("Glide request origin trace");
        }
    }

    private void e() {
        if (this.f52098C) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private boolean f() {
        com.bumptech.glide.request.b bVar = this.f52105f;
        return bVar == null || bVar.canNotifyCleared(this);
    }

    private boolean g() {
        com.bumptech.glide.request.b bVar = this.f52105f;
        return bVar == null || bVar.canNotifyStatusChanged(this);
    }

    private boolean h() {
        com.bumptech.glide.request.b bVar = this.f52105f;
        return bVar == null || bVar.canSetImage(this);
    }

    private void i() {
        e();
        this.f52102c.c();
        this.f52114o.f(this);
        k.d dVar = this.f52119t;
        if (dVar != null) {
            dVar.a();
            this.f52119t = null;
        }
    }

    private void j(Object obj) {
        List<e> list = this.f52115p;
        if (list == null) {
            return;
        }
        for (e eVar : list) {
        }
    }

    private Drawable k() {
        if (this.f52123x == null) {
            Drawable drawableN = this.f52110k.n();
            this.f52123x = drawableN;
            if (drawableN == null && this.f52110k.m() > 0) {
                this.f52123x = o(this.f52110k.m());
            }
        }
        return this.f52123x;
    }

    private Drawable l() {
        if (this.f52125z == null) {
            Drawable drawableP = this.f52110k.p();
            this.f52125z = drawableP;
            if (drawableP == null && this.f52110k.q() > 0) {
                this.f52125z = o(this.f52110k.q());
            }
        }
        return this.f52125z;
    }

    private Drawable m() {
        if (this.f52124y == null) {
            Drawable drawableV = this.f52110k.v();
            this.f52124y = drawableV;
            if (drawableV == null && this.f52110k.x() > 0) {
                this.f52124y = o(this.f52110k.x());
            }
        }
        return this.f52124y;
    }

    private boolean n() {
        com.bumptech.glide.request.b bVar = this.f52105f;
        return bVar == null || !bVar.getRoot().isAnyResourceSet();
    }

    private Drawable o(int i10) {
        return i.a(this.f52106g, i10, this.f52110k.D() != null ? this.f52110k.D() : this.f52106g.getTheme());
    }

    private void p(String str) {
        Log.v("GlideRequest", str + " this: " + this.f52101b);
    }

    private static int q(int i10, float f10) {
        return i10 == Integer.MIN_VALUE ? i10 : Math.round(f10 * i10);
    }

    private void r() {
        com.bumptech.glide.request.b bVar = this.f52105f;
        if (bVar != null) {
            bVar.onRequestFailed(this);
        }
    }

    private void s() {
        com.bumptech.glide.request.b bVar = this.f52105f;
        if (bVar != null) {
            bVar.onRequestSuccess(this);
        }
    }

    public static h t(Context context, com.bumptech.glide.d dVar, Object obj, Object obj2, Class cls, AbstractC5449a abstractC5449a, int i10, int i11, com.bumptech.glide.g gVar, l5.d dVar2, e eVar, List list, com.bumptech.glide.request.b bVar, k kVar, m5.c cVar, Executor executor) {
        return new h(context, dVar, obj, obj2, cls, abstractC5449a, i10, i11, gVar, dVar2, eVar, list, bVar, kVar, cVar, executor);
    }

    private void u(q qVar, int i10) {
        boolean zG;
        this.f52102c.c();
        synchronized (this.f52103d) {
            try {
                qVar.k(this.f52099D);
                int iG = this.f52107h.g();
                if (iG <= i10) {
                    Log.w("Glide", "Load failed for [" + this.f52108i + "] with dimensions [" + this.f52096A + "x" + this.f52097B + "]", qVar);
                    if (iG <= 4) {
                        qVar.g("Glide");
                    }
                }
                this.f52119t = null;
                this.f52122w = a.FAILED;
                r();
                boolean z10 = true;
                this.f52098C = true;
                try {
                    List list = this.f52115p;
                    if (list != null) {
                        Iterator it = list.iterator();
                        zG = false;
                        while (it.hasNext()) {
                            zG |= ((e) it.next()).g(qVar, this.f52108i, this.f52114o, n());
                        }
                    } else {
                        zG = false;
                    }
                    e eVar = this.f52104e;
                    if (eVar == null || !eVar.g(qVar, this.f52108i, this.f52114o, n())) {
                        z10 = false;
                    }
                    if (!(zG | z10)) {
                        w();
                    }
                    this.f52098C = false;
                    p5.b.f("GlideRequest", this.f52100a);
                } catch (Throwable th2) {
                    this.f52098C = false;
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private void v(v vVar, Object obj, S4.a aVar, boolean z10) {
        boolean zE;
        boolean zN = n();
        this.f52122w = a.COMPLETE;
        this.f52118s = vVar;
        if (this.f52107h.g() <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + aVar + " for " + this.f52108i + " with size [" + this.f52096A + "x" + this.f52097B + "] in " + AbstractC5830g.a(this.f52120u) + " ms");
        }
        s();
        boolean z11 = true;
        this.f52098C = true;
        try {
            List list = this.f52115p;
            if (list != null) {
                Iterator it = list.iterator();
                zE = false;
                while (it.hasNext()) {
                    Object obj2 = obj;
                    S4.a aVar2 = aVar;
                    zE |= ((e) it.next()).e(obj2, this.f52108i, this.f52114o, aVar2, zN);
                    obj = obj2;
                    aVar = aVar2;
                }
            } else {
                zE = false;
            }
            Object obj3 = obj;
            S4.a aVar3 = aVar;
            e eVar = this.f52104e;
            if (eVar == null || !eVar.e(obj3, this.f52108i, this.f52114o, aVar3, zN)) {
                z11 = false;
            }
            if (!(z11 | zE)) {
                this.f52114o.m(obj3, this.f52116q.a(aVar3, zN));
            }
            this.f52098C = false;
            p5.b.f("GlideRequest", this.f52100a);
        } catch (Throwable th2) {
            this.f52098C = false;
            throw th2;
        }
    }

    private void w() {
        if (g()) {
            Drawable drawableL = this.f52108i == null ? l() : null;
            if (drawableL == null) {
                drawableL = k();
            }
            if (drawableL == null) {
                drawableL = m();
            }
            this.f52114o.l(drawableL);
        }
    }

    @Override // k5.g
    public void a(q qVar) {
        u(qVar, 5);
    }

    @Override // k5.g
    public void b(v vVar, S4.a aVar, boolean z10) {
        this.f52102c.c();
        v vVar2 = null;
        try {
            synchronized (this.f52103d) {
                try {
                    this.f52119t = null;
                    if (vVar == null) {
                        a(new q("Expected to receive a Resource<R> with an object of " + this.f52109j + " inside, but instead got null."));
                        return;
                    }
                    Object obj = vVar.get();
                    try {
                        if (obj == null || !this.f52109j.isAssignableFrom(obj.getClass())) {
                            this.f52118s = null;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Expected to receive an object of ");
                            sb2.append(this.f52109j);
                            sb2.append(" but instead got ");
                            sb2.append(obj != null ? obj.getClass() : "");
                            sb2.append("{");
                            sb2.append(obj);
                            sb2.append("} inside Resource{");
                            sb2.append(vVar);
                            sb2.append("}.");
                            sb2.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            a(new q(sb2.toString()));
                        } else if (h()) {
                            v(vVar, obj, aVar, z10);
                            return;
                        } else {
                            this.f52118s = null;
                            this.f52122w = a.COMPLETE;
                            p5.b.f("GlideRequest", this.f52100a);
                        }
                        this.f52121v.l(vVar);
                    } catch (Throwable th2) {
                        vVar2 = vVar;
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            if (vVar2 != null) {
                this.f52121v.l(vVar2);
            }
            throw th4;
        }
    }

    @Override // k5.InterfaceC5451c
    public void begin() {
        synchronized (this.f52103d) {
            try {
                e();
                this.f52102c.c();
                this.f52120u = AbstractC5830g.b();
                Object obj = this.f52108i;
                if (obj == null) {
                    if (l.u(this.f52111l, this.f52112m)) {
                        this.f52096A = this.f52111l;
                        this.f52097B = this.f52112m;
                    }
                    u(new q("Received null model"), l() == null ? 5 : 3);
                    return;
                }
                a aVar = this.f52122w;
                a aVar2 = a.RUNNING;
                if (aVar == aVar2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (aVar == a.COMPLETE) {
                    b(this.f52118s, S4.a.MEMORY_CACHE, false);
                    return;
                }
                j(obj);
                this.f52100a = p5.b.b("GlideRequest");
                a aVar3 = a.WAITING_FOR_SIZE;
                this.f52122w = aVar3;
                if (l.u(this.f52111l, this.f52112m)) {
                    c(this.f52111l, this.f52112m);
                } else {
                    this.f52114o.n(this);
                }
                a aVar4 = this.f52122w;
                if ((aVar4 == aVar2 || aVar4 == aVar3) && g()) {
                    this.f52114o.h(m());
                }
                if (f52095E) {
                    p("finished run method in " + AbstractC5830g.a(this.f52120u));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // l5.c
    public void c(int i10, int i11) throws Throwable {
        Object obj;
        com.bumptech.glide.g gVar;
        j jVarK;
        Map mapE;
        boolean zO;
        boolean zL;
        S4.h hVarS;
        boolean zJ;
        boolean zG;
        boolean zF;
        boolean zR;
        Executor executor;
        Object obj2;
        h hVar = this;
        hVar.f52102c.c();
        Object obj3 = hVar.f52103d;
        synchronized (obj3) {
            try {
                try {
                    boolean z10 = f52095E;
                    if (z10) {
                        hVar.p("Got onSizeReady in " + AbstractC5830g.a(hVar.f52120u));
                    }
                    if (hVar.f52122w == a.WAITING_FOR_SIZE) {
                        a aVar = a.RUNNING;
                        hVar.f52122w = aVar;
                        float fC = hVar.f52110k.C();
                        hVar.f52096A = q(i10, fC);
                        hVar.f52097B = q(i11, fC);
                        if (z10) {
                            hVar.p("finished setup for calling load in " + AbstractC5830g.a(hVar.f52120u));
                        }
                        try {
                            k kVar = hVar.f52121v;
                            com.bumptech.glide.d dVar = hVar.f52107h;
                            try {
                                Object obj4 = hVar.f52108i;
                                S4.f fVarB = hVar.f52110k.B();
                                try {
                                    int i12 = hVar.f52096A;
                                    int i13 = hVar.f52097B;
                                    Class clsA = hVar.f52110k.A();
                                    Class cls = hVar.f52109j;
                                    try {
                                        gVar = hVar.f52113n;
                                        jVarK = hVar.f52110k.k();
                                        mapE = hVar.f52110k.E();
                                        zO = hVar.f52110k.O();
                                        zL = hVar.f52110k.L();
                                        hVarS = hVar.f52110k.s();
                                        zJ = hVar.f52110k.J();
                                        zG = hVar.f52110k.G();
                                        zF = hVar.f52110k.F();
                                        zR = hVar.f52110k.r();
                                        executor = hVar.f52117r;
                                        obj2 = obj3;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        obj = obj3;
                                    }
                                    try {
                                        hVar.f52119t = kVar.g(dVar, obj4, fVarB, i12, i13, clsA, cls, gVar, jVarK, mapE, zO, zL, hVarS, zJ, zG, zF, zR, hVar, executor);
                                        if (hVar.f52122w != aVar) {
                                            hVar.f52119t = null;
                                        }
                                        if (z10) {
                                            hVar.p("finished onSizeReady in " + AbstractC5830g.a(hVar.f52120u));
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        obj = obj2;
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    obj = obj3;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                obj = obj3;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            obj = obj3;
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                    obj = obj3;
                }
            } catch (Throwable th8) {
                th = th8;
                obj = hVar;
            }
        }
    }

    @Override // k5.InterfaceC5451c
    public void clear() {
        synchronized (this.f52103d) {
            try {
                e();
                this.f52102c.c();
                a aVar = this.f52122w;
                a aVar2 = a.CLEARED;
                if (aVar == aVar2) {
                    return;
                }
                i();
                v vVar = this.f52118s;
                if (vVar != null) {
                    this.f52118s = null;
                } else {
                    vVar = null;
                }
                if (f()) {
                    this.f52114o.i(m());
                }
                p5.b.f("GlideRequest", this.f52100a);
                this.f52122w = aVar2;
                if (vVar != null) {
                    this.f52121v.l(vVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // k5.g
    public Object d() {
        this.f52102c.c();
        return this.f52103d;
    }

    @Override // k5.InterfaceC5451c
    public boolean isAnyResourceSet() {
        boolean z10;
        synchronized (this.f52103d) {
            z10 = this.f52122w == a.COMPLETE;
        }
        return z10;
    }

    @Override // k5.InterfaceC5451c
    public boolean isCleared() {
        boolean z10;
        synchronized (this.f52103d) {
            z10 = this.f52122w == a.CLEARED;
        }
        return z10;
    }

    @Override // k5.InterfaceC5451c
    public boolean isComplete() {
        boolean z10;
        synchronized (this.f52103d) {
            z10 = this.f52122w == a.COMPLETE;
        }
        return z10;
    }

    @Override // k5.InterfaceC5451c
    public boolean isEquivalentTo(InterfaceC5451c interfaceC5451c) {
        int i10;
        int i11;
        Object obj;
        Class cls;
        AbstractC5449a abstractC5449a;
        com.bumptech.glide.g gVar;
        int size;
        int i12;
        int i13;
        Object obj2;
        Class cls2;
        AbstractC5449a abstractC5449a2;
        com.bumptech.glide.g gVar2;
        int size2;
        if (!(interfaceC5451c instanceof h)) {
            return false;
        }
        synchronized (this.f52103d) {
            try {
                i10 = this.f52111l;
                i11 = this.f52112m;
                obj = this.f52108i;
                cls = this.f52109j;
                abstractC5449a = this.f52110k;
                gVar = this.f52113n;
                List list = this.f52115p;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        h hVar = (h) interfaceC5451c;
        synchronized (hVar.f52103d) {
            try {
                i12 = hVar.f52111l;
                i13 = hVar.f52112m;
                obj2 = hVar.f52108i;
                cls2 = hVar.f52109j;
                abstractC5449a2 = hVar.f52110k;
                gVar2 = hVar.f52113n;
                List list2 = hVar.f52115p;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        return i10 == i12 && i11 == i13 && l.d(obj, obj2) && cls.equals(cls2) && l.c(abstractC5449a, abstractC5449a2) && gVar == gVar2 && size == size2;
    }

    @Override // k5.InterfaceC5451c
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f52103d) {
            try {
                a aVar = this.f52122w;
                z10 = aVar == a.RUNNING || aVar == a.WAITING_FOR_SIZE;
            } finally {
            }
        }
        return z10;
    }

    @Override // k5.InterfaceC5451c
    public void pause() {
        synchronized (this.f52103d) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        Object obj;
        Class cls;
        synchronized (this.f52103d) {
            obj = this.f52108i;
            cls = this.f52109j;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
