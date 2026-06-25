package io.sentry;

import io.sentry.C5322z3;
import io.sentry.protocol.C5251a;
import io.sentry.protocol.C5253c;
import io.sentry.protocol.C5257g;
import io.sentry.util.AbstractC5290c;
import io.sentry.util.AbstractC5293f;
import io.sentry.util.AbstractC5295h;
import io.sentry.util.C5288a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class E1 implements Y {

    /* JADX INFO: renamed from: a */
    private volatile io.sentry.protocol.x f49142a;

    /* JADX INFO: renamed from: b */
    private EnumC5215i3 f49143b;

    /* JADX INFO: renamed from: c */
    private InterfaceC5217j0 f49144c;

    /* JADX INFO: renamed from: d */
    private WeakReference f49145d;

    /* JADX INFO: renamed from: e */
    private String f49146e;

    /* JADX INFO: renamed from: f */
    private io.sentry.protocol.I f49147f;

    /* JADX INFO: renamed from: g */
    private String f49148g;

    /* JADX INFO: renamed from: h */
    private io.sentry.protocol.o f49149h;

    /* JADX INFO: renamed from: i */
    private List f49150i;

    /* JADX INFO: renamed from: j */
    private volatile Queue f49151j;

    /* JADX INFO: renamed from: k */
    private Map f49152k;

    /* JADX INFO: renamed from: l */
    private Map f49153l;

    /* JADX INFO: renamed from: m */
    private List f49154m;

    /* JADX INFO: renamed from: n */
    private volatile C5322z3 f49155n;

    /* JADX INFO: renamed from: o */
    private volatile O3 f49156o;

    /* JADX INFO: renamed from: p */
    private final C5288a f49157p;

    /* JADX INFO: renamed from: q */
    private final C5288a f49158q;

    /* JADX INFO: renamed from: r */
    private final C5288a f49159r;

    /* JADX INFO: renamed from: s */
    private C5253c f49160s;

    /* JADX INFO: renamed from: t */
    private List f49161t;

    /* JADX INFO: renamed from: u */
    private C5310x1 f49162u;

    /* JADX INFO: renamed from: v */
    private io.sentry.protocol.x f49163v;

    /* JADX INFO: renamed from: w */
    private InterfaceC5182c0 f49164w;

    /* JADX INFO: renamed from: x */
    private final Map f49165x;

    /* JADX INFO: renamed from: y */
    private final io.sentry.featureflags.b f49166y;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void a(C5310x1 c5310x1);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface b {
        void a(O3 o32);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface c {
        void a(InterfaceC5217j0 interfaceC5217j0);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d {

        /* JADX INFO: renamed from: a */
        private final O3 f49167a;

        /* JADX INFO: renamed from: b */
        private final O3 f49168b;

        public d(O3 o32, O3 o33) {
            this.f49168b = o32;
            this.f49167a = o33;
        }

        public O3 a() {
            return this.f49168b;
        }

        public O3 b() {
            return this.f49167a;
        }
    }

    public E1(C5322z3 c5322z3) {
        this.f49145d = new WeakReference(null);
        this.f49150i = new ArrayList();
        this.f49152k = new ConcurrentHashMap();
        this.f49153l = new ConcurrentHashMap();
        this.f49154m = new CopyOnWriteArrayList();
        this.f49157p = new C5288a();
        this.f49158q = new C5288a();
        this.f49159r = new C5288a();
        this.f49160s = new C5253c();
        this.f49161t = new CopyOnWriteArrayList();
        io.sentry.protocol.x xVar = io.sentry.protocol.x.f51153b;
        this.f49163v = xVar;
        this.f49164w = X0.k();
        this.f49165x = Collections.synchronizedMap(new WeakHashMap());
        this.f49155n = (C5322z3) io.sentry.util.w.c(c5322z3, "SentryOptions is required.");
        this.f49151j = T(this.f49155n.getMaxBreadcrumbs());
        this.f49166y = io.sentry.featureflags.a.a(c5322z3);
        this.f49162u = new C5310x1();
        this.f49142a = xVar;
    }

    static Queue T(int i10) {
        return i10 > 0 ? d4.d(new C5196f(i10)) : new C5283u();
    }

    private C5191e U(C5322z3.a aVar, C5191e c5191e, H h10) {
        try {
            return aVar.a(c5191e, h10);
        } catch (Throwable th2) {
            this.f49155n.getLogger().b(EnumC5215i3.ERROR, "The BeforeBreadcrumbCallback callback threw an exception. Exception details will be added to the breadcrumb.", th2);
            if (th2.getMessage() != null) {
                c5191e.D("sentry:message", th2.getMessage());
            }
            return c5191e;
        }
    }

    @Override // io.sentry.Y
    public String A() {
        InterfaceC5217j0 interfaceC5217j0 = this.f49144c;
        return interfaceC5217j0 != null ? interfaceC5217j0.getName() : this.f49146e;
    }

    @Override // io.sentry.Y
    public void B() {
        InterfaceC5192e0 interfaceC5192e0A = this.f49158q.a();
        try {
            this.f49144c = null;
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            this.f49146e = null;
            for (Z z10 : this.f49155n.getScopeObservers()) {
                z10.l(null);
                z10.h(null, this);
            }
        } catch (Throwable th2) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.Y
    public io.sentry.featureflags.b C() {
        return this.f49166y;
    }

    @Override // io.sentry.Y
    public void D(InterfaceC5182c0 interfaceC5182c0) {
        this.f49164w = interfaceC5182c0;
    }

    @Override // io.sentry.Y
    public void E(String str) {
        if (str == null) {
            return;
        }
        this.f49160s.n(str);
    }

    @Override // io.sentry.Y
    public O3 F() {
        return this.f49156o;
    }

    @Override // io.sentry.Y
    public io.sentry.protocol.x G() {
        return this.f49163v;
    }

    @Override // io.sentry.Y
    public C5310x1 H() {
        return this.f49162u;
    }

    @Override // io.sentry.Y
    public void I(String str) {
        this.f49148g = str;
        C5253c c5253cV = v();
        C5251a c5251aD = c5253cV.d();
        if (c5251aD == null) {
            c5251aD = new C5251a();
            c5253cV.o(c5251aD);
        }
        if (str == null) {
            c5251aD.x(null);
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            c5251aD.x(arrayList);
        }
        Iterator<Z> it = this.f49155n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().j(c5253cV);
        }
    }

    @Override // io.sentry.Y
    public InterfaceC5182c0 J() {
        return this.f49164w;
    }

    @Override // io.sentry.Y
    public List K() {
        return new CopyOnWriteArrayList(this.f49161t);
    }

    @Override // io.sentry.Y
    public void L(V2 v22) {
        io.sentry.util.x xVar;
        InterfaceC5207h0 interfaceC5207h0;
        if (!this.f49155n.isTracingEnabled() || v22.O() == null || (xVar = (io.sentry.util.x) this.f49165x.get(AbstractC5295h.a(v22.O()))) == null) {
            return;
        }
        WeakReference weakReference = (WeakReference) xVar.a();
        if (v22.C().j() == null && weakReference != null && (interfaceC5207h0 = (InterfaceC5207h0) weakReference.get()) != null) {
            v22.C().z(interfaceC5207h0.q());
        }
        String str = (String) xVar.b();
        if (v22.w0() != null || str == null) {
            return;
        }
        v22.H0(str);
    }

    @Override // io.sentry.Y
    public void M() {
        this.f49156o = null;
    }

    @Override // io.sentry.Y
    public C5310x1 N(a aVar) {
        InterfaceC5192e0 interfaceC5192e0A = this.f49159r.a();
        try {
            aVar.a(this.f49162u);
            C5310x1 c5310x1 = new C5310x1(this.f49162u);
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            return c5310x1;
        } catch (Throwable th2) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.Y
    public void O(c cVar) {
        InterfaceC5192e0 interfaceC5192e0A = this.f49158q.a();
        try {
            cVar.a(this.f49144c);
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
        } catch (Throwable th2) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.Y
    public void P(io.sentry.protocol.x xVar) {
        this.f49142a = xVar;
    }

    @Override // io.sentry.Y
    public List Q() {
        return AbstractC5293f.a(this.f49154m);
    }

    @Override // io.sentry.Y
    public void R(C5310x1 c5310x1) {
        this.f49162u = c5310x1;
        T3 t3G = c5310x1.g();
        Iterator<Z> it = this.f49155n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().h(t3G, this);
        }
    }

    public void S() {
        this.f49161t.clear();
    }

    public io.sentry.protocol.x V() {
        return this.f49142a;
    }

    public void W(String str) {
        if (str == null) {
            return;
        }
        this.f49153l.remove(str);
        for (Z z10 : this.f49155n.getScopeObservers()) {
            z10.c(str);
            z10.k(this.f49153l);
        }
    }

    public void X(String str) {
        if (str == null) {
            return;
        }
        this.f49152k.remove(str);
        for (Z z10 : this.f49155n.getScopeObservers()) {
            z10.f(str);
            z10.e(this.f49152k);
        }
    }

    @Override // io.sentry.Y
    public void a(C5191e c5191e) {
        e(c5191e, null);
    }

    @Override // io.sentry.Y
    public void b(String str, String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            X(str);
            return;
        }
        this.f49152k.put(str, str2);
        for (Z z10 : this.f49155n.getScopeObservers()) {
            z10.b(str, str2);
            z10.e(this.f49152k);
        }
    }

    @Override // io.sentry.Y
    public io.sentry.protocol.o c() {
        return this.f49149h;
    }

    @Override // io.sentry.Y
    public void clear() {
        this.f49143b = null;
        this.f49147f = null;
        this.f49149h = null;
        this.f49148g = null;
        this.f49150i.clear();
        t();
        this.f49152k.clear();
        this.f49153l.clear();
        this.f49154m.clear();
        B();
        S();
    }

    @Override // io.sentry.Y
    public void d(String str, String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            W(str);
            return;
        }
        this.f49153l.put(str, str2);
        for (Z z10 : this.f49155n.getScopeObservers()) {
            z10.d(str, str2);
            z10.k(this.f49153l);
        }
    }

    @Override // io.sentry.Y
    public void e(C5191e c5191e, H h10) {
        if (c5191e == null || (this.f49151j instanceof C5283u)) {
            return;
        }
        if (h10 == null) {
            h10 = new H();
        }
        C5322z3.a beforeBreadcrumb = this.f49155n.getBeforeBreadcrumb();
        if (beforeBreadcrumb != null) {
            c5191e = U(beforeBreadcrumb, c5191e, h10);
        }
        if (c5191e == null) {
            this.f49155n.getLogger().c(EnumC5215i3.INFO, "Breadcrumb was dropped by beforeBreadcrumb", new Object[0]);
            return;
        }
        this.f49151j.add(c5191e);
        for (Z z10 : this.f49155n.getScopeObservers()) {
            z10.a(c5191e);
            z10.g(this.f49151j);
        }
    }

    @Override // io.sentry.Y
    public InterfaceC5207h0 f() {
        InterfaceC5207h0 interfaceC5207h0N;
        InterfaceC5207h0 interfaceC5207h0 = (InterfaceC5207h0) this.f49145d.get();
        if (interfaceC5207h0 != null) {
            return interfaceC5207h0;
        }
        InterfaceC5217j0 interfaceC5217j0 = this.f49144c;
        return (interfaceC5217j0 == null || (interfaceC5207h0N = interfaceC5217j0.n()) == null) ? interfaceC5217j0 : interfaceC5207h0N;
    }

    @Override // io.sentry.Y
    public void g(Throwable th2, InterfaceC5207h0 interfaceC5207h0, String str) {
        io.sentry.util.w.c(th2, "throwable is required");
        io.sentry.util.w.c(interfaceC5207h0, "span is required");
        io.sentry.util.w.c(str, "transactionName is required");
        Throwable thA = AbstractC5295h.a(th2);
        if (this.f49165x.containsKey(thA)) {
            return;
        }
        this.f49165x.put(thA, new io.sentry.util.x(new WeakReference(interfaceC5207h0), str));
    }

    @Override // io.sentry.Y
    public Map getExtras() {
        return this.f49153l;
    }

    @Override // io.sentry.Y
    public Map getTags() {
        return AbstractC5290c.b(this.f49152k);
    }

    @Override // io.sentry.Y
    public C5322z3 h() {
        return this.f49155n;
    }

    @Override // io.sentry.Y
    public void i(io.sentry.protocol.I i10) {
        this.f49147f = i10;
        Iterator<Z> it = this.f49155n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().i(i10);
        }
    }

    @Override // io.sentry.Y
    public InterfaceC5217j0 j() {
        return this.f49144c;
    }

    @Override // io.sentry.Y
    public String k() {
        return this.f49148g;
    }

    @Override // io.sentry.Y
    public O3 l() {
        InterfaceC5192e0 interfaceC5192e0A = this.f49157p.a();
        try {
            O3 o32 = null;
            if (this.f49156o != null) {
                this.f49156o.c();
                this.f49155n.getContinuousProfiler().e();
                O3 o3Clone = this.f49156o.clone();
                this.f49156o = null;
                o32 = o3Clone;
            }
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            return o32;
        } catch (Throwable th2) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.Y
    public EnumC5215i3 m() {
        return this.f49143b;
    }

    @Override // io.sentry.Y
    public C5257g n() {
        return this.f49166y.n();
    }

    @Override // io.sentry.Y
    public void o(io.sentry.protocol.x xVar) {
        this.f49163v = xVar;
        Iterator<Z> it = this.f49155n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().o(xVar);
        }
    }

    @Override // io.sentry.Y
    public d p() {
        InterfaceC5192e0 interfaceC5192e0A = this.f49157p.a();
        try {
            if (this.f49156o != null) {
                this.f49156o.c();
                this.f49155n.getContinuousProfiler().e();
            }
            O3 o32 = this.f49156o;
            d dVar = null;
            if (this.f49155n.getRelease() != null) {
                this.f49156o = new O3(this.f49155n.getDistinctId(), this.f49147f, this.f49155n.getEnvironment(), this.f49155n.getRelease());
                dVar = new d(this.f49156o.clone(), o32 != null ? o32.clone() : null);
            } else {
                this.f49155n.getLogger().c(EnumC5215i3.WARNING, "Release is not set on SentryOptions. Session could not be started", new Object[0]);
            }
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            return dVar;
        } catch (Throwable th2) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.Y
    public void q(C5322z3 c5322z3) {
        this.f49155n = c5322z3;
        Queue queue = this.f49151j;
        this.f49151j = T(c5322z3.getMaxBreadcrumbs());
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            a((C5191e) it.next());
        }
    }

    @Override // io.sentry.Y
    public Queue r() {
        return this.f49151j;
    }

    @Override // io.sentry.Y
    public O3 s(b bVar) {
        InterfaceC5192e0 interfaceC5192e0A = this.f49157p.a();
        try {
            bVar.a(this.f49156o);
            O3 o3Clone = this.f49156o != null ? this.f49156o.clone() : null;
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            return o3Clone;
        } catch (Throwable th2) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.Y
    public void t() {
        this.f49151j.clear();
        Iterator<Z> it = this.f49155n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().g(this.f49151j);
        }
    }

    @Override // io.sentry.Y
    public List u() {
        return this.f49154m;
    }

    @Override // io.sentry.Y
    public C5253c v() {
        return this.f49160s;
    }

    @Override // io.sentry.Y
    public void w(String str, Object obj) {
        if (str == null) {
            return;
        }
        this.f49160s.l(str, obj);
        Iterator<Z> it = this.f49155n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().j(this.f49160s);
        }
    }

    @Override // io.sentry.Y
    public void x(InterfaceC5217j0 interfaceC5217j0) {
        InterfaceC5192e0 interfaceC5192e0A = this.f49158q.a();
        try {
            this.f49144c = interfaceC5217j0;
            for (Z z10 : this.f49155n.getScopeObservers()) {
                if (interfaceC5217j0 != null) {
                    z10.l(interfaceC5217j0.getName());
                    z10.h(interfaceC5217j0.q(), this);
                } else {
                    z10.l(null);
                    z10.h(null, this);
                }
            }
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
        } catch (Throwable th2) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.Y
    public List y() {
        return this.f49150i;
    }

    @Override // io.sentry.Y
    public io.sentry.protocol.I z() {
        return this.f49147f;
    }

    @Override // io.sentry.Y
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Y m946clone() {
        return new E1(this);
    }

    private E1(E1 e12) {
        this.f49145d = new WeakReference(null);
        this.f49150i = new ArrayList();
        this.f49152k = new ConcurrentHashMap();
        this.f49153l = new ConcurrentHashMap();
        this.f49154m = new CopyOnWriteArrayList();
        this.f49157p = new C5288a();
        this.f49158q = new C5288a();
        this.f49159r = new C5288a();
        this.f49160s = new C5253c();
        this.f49161t = new CopyOnWriteArrayList();
        this.f49163v = io.sentry.protocol.x.f51153b;
        this.f49164w = X0.k();
        this.f49165x = Collections.synchronizedMap(new WeakHashMap());
        this.f49144c = e12.f49144c;
        this.f49146e = e12.f49146e;
        this.f49145d = e12.f49145d;
        this.f49156o = e12.f49156o;
        this.f49155n = e12.f49155n;
        this.f49143b = e12.f49143b;
        this.f49164w = e12.f49164w;
        this.f49142a = e12.V();
        io.sentry.protocol.I i10 = e12.f49147f;
        this.f49147f = i10 != null ? new io.sentry.protocol.I(i10) : null;
        this.f49148g = e12.f49148g;
        this.f49163v = e12.f49163v;
        io.sentry.protocol.o oVar = e12.f49149h;
        this.f49149h = oVar != null ? new io.sentry.protocol.o(oVar) : null;
        this.f49150i = new ArrayList(e12.f49150i);
        this.f49154m = new CopyOnWriteArrayList(e12.f49154m);
        C5191e[] c5191eArr = (C5191e[]) e12.f49151j.toArray(new C5191e[0]);
        Queue queueT = T(e12.f49155n.getMaxBreadcrumbs());
        for (C5191e c5191e : c5191eArr) {
            queueT.add(new C5191e(c5191e));
        }
        this.f49151j = queueT;
        Map map = e12.f49152k;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry != null) {
                concurrentHashMap.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        this.f49152k = concurrentHashMap;
        Map map2 = e12.f49153l;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        for (Map.Entry entry2 : map2.entrySet()) {
            if (entry2 != null) {
                concurrentHashMap2.put((String) entry2.getKey(), entry2.getValue());
            }
        }
        this.f49153l = concurrentHashMap2;
        this.f49160s = new C5253c(e12.f49160s);
        this.f49161t = new CopyOnWriteArrayList(e12.f49161t);
        this.f49166y = e12.f49166y.m959clone();
        this.f49162u = new C5310x1(e12.f49162u);
    }
}
