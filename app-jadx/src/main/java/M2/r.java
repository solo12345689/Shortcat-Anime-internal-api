package M2;

import M2.C1916f;
import M2.C1931v;
import M2.D;
import M2.X;
import M2.h0;
import M2.r;
import P9.AbstractC2011u;
import U2.C2252m;
import U2.InterfaceC2255p;
import U2.InterfaceC2256q;
import U2.J;
import android.content.Context;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import q2.C6071C;
import q2.C6109x;
import r3.r;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import w2.InterfaceC6940g;
import w2.p;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements M {

    /* JADX INFO: renamed from: c */
    private final a f12015c;

    /* JADX INFO: renamed from: d */
    private InterfaceC6940g.a f12016d;

    /* JADX INFO: renamed from: e */
    private r.a f12017e;

    /* JADX INFO: renamed from: f */
    private D.a f12018f;

    /* JADX INFO: renamed from: g */
    private Q2.k f12019g;

    /* JADX INFO: renamed from: h */
    private long f12020h;

    /* JADX INFO: renamed from: i */
    private long f12021i;

    /* JADX INFO: renamed from: j */
    private long f12022j;

    /* JADX INFO: renamed from: k */
    private float f12023k;

    /* JADX INFO: renamed from: l */
    private float f12024l;

    /* JADX INFO: renamed from: m */
    private boolean f12025m;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a {

        /* JADX INFO: renamed from: a */
        private final U2.u f12026a;

        /* JADX INFO: renamed from: d */
        private InterfaceC6940g.a f12029d;

        /* JADX INFO: renamed from: f */
        private r.a f12031f;

        /* JADX INFO: renamed from: g */
        private int f12032g;

        /* JADX INFO: renamed from: h */
        private F2.w f12033h;

        /* JADX INFO: renamed from: i */
        private Q2.k f12034i;

        /* JADX INFO: renamed from: b */
        private final Map f12027b = new HashMap();

        /* JADX INFO: renamed from: c */
        private final Map f12028c = new HashMap();

        /* JADX INFO: renamed from: e */
        private boolean f12030e = true;

        public a(U2.u uVar, r.a aVar) {
            this.f12026a = uVar;
            this.f12031f = aVar;
        }

        public static /* synthetic */ D.a c(a aVar, InterfaceC6940g.a aVar2) {
            aVar.getClass();
            return new X.b(aVar2, aVar.f12026a);
        }

        private O9.t g(int i10) {
            O9.t tVar;
            O9.t tVar2;
            O9.t tVar3 = (O9.t) this.f12027b.get(Integer.valueOf(i10));
            if (tVar3 != null) {
                return tVar3;
            }
            final InterfaceC6940g.a aVar = (InterfaceC6940g.a) AbstractC6614a.e(this.f12029d);
            if (i10 == 0) {
                int i11 = DashMediaSource.Factory.f30635k;
                final Class clsAsSubclass = DashMediaSource.Factory.class.asSubclass(D.a.class);
                tVar = new O9.t() { // from class: M2.m
                    @Override // O9.t
                    public final Object get() {
                        return r.o(clsAsSubclass, aVar);
                    }
                };
            } else if (i10 == 1) {
                final Class<? extends U> clsAsSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(D.a.class);
                tVar = new O9.t() { // from class: M2.n
                    @Override // O9.t
                    public final Object get() {
                        return r.o(clsAsSubclass2, aVar);
                    }
                };
            } else {
                if (i10 != 2) {
                    if (i10 == 3) {
                        final Class<? extends U> clsAsSubclass3 = Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(D.a.class);
                        tVar2 = new O9.t() { // from class: M2.p
                            @Override // O9.t
                            public final Object get() {
                                return r.n(clsAsSubclass3);
                            }
                        };
                    } else {
                        if (i10 != 4) {
                            throw new IllegalArgumentException("Unrecognized contentType: " + i10);
                        }
                        tVar2 = new O9.t() { // from class: M2.q
                            @Override // O9.t
                            public final Object get() {
                                return r.a.c(this.f12013a, aVar);
                            }
                        };
                    }
                    this.f12027b.put(Integer.valueOf(i10), tVar2);
                    return tVar2;
                }
                int i12 = HlsMediaSource.Factory.f30810r;
                final Class clsAsSubclass4 = HlsMediaSource.Factory.class.asSubclass(D.a.class);
                tVar = new O9.t() { // from class: M2.o
                    @Override // O9.t
                    public final Object get() {
                        return r.o(clsAsSubclass4, aVar);
                    }
                };
            }
            tVar2 = tVar;
            this.f12027b.put(Integer.valueOf(i10), tVar2);
            return tVar2;
        }

        public D.a f(int i10) {
            D.a aVar = (D.a) this.f12028c.get(Integer.valueOf(i10));
            if (aVar != null) {
                return aVar;
            }
            D.a aVar2 = (D.a) g(i10).get();
            F2.w wVar = this.f12033h;
            if (wVar != null) {
                aVar2.f(wVar);
            }
            Q2.k kVar = this.f12034i;
            if (kVar != null) {
                aVar2.d(kVar);
            }
            aVar2.a(this.f12031f);
            aVar2.c(this.f12030e);
            aVar2.b(this.f12032g);
            this.f12028c.put(Integer.valueOf(i10), aVar2);
            return aVar2;
        }

        public void h(int i10) {
            this.f12032g = i10;
            this.f12026a.b(i10);
        }

        public void i(InterfaceC6940g.a aVar) {
            if (aVar != this.f12029d) {
                this.f12029d = aVar;
                this.f12027b.clear();
                this.f12028c.clear();
            }
        }

        public void j(F2.w wVar) {
            this.f12033h = wVar;
            Iterator it = this.f12028c.values().iterator();
            while (it.hasNext()) {
                ((D.a) it.next()).f(wVar);
            }
        }

        public void k(int i10) {
            U2.u uVar = this.f12026a;
            if (uVar instanceof C2252m) {
                ((C2252m) uVar).n(i10);
            }
        }

        public void l(Q2.k kVar) {
            this.f12034i = kVar;
            Iterator it = this.f12028c.values().iterator();
            while (it.hasNext()) {
                ((D.a) it.next()).d(kVar);
            }
        }

        public void m(boolean z10) {
            this.f12030e = z10;
            this.f12026a.c(z10);
            Iterator it = this.f12028c.values().iterator();
            while (it.hasNext()) {
                ((D.a) it.next()).c(z10);
            }
        }

        public void n(r.a aVar) {
            this.f12031f = aVar;
            this.f12026a.a(aVar);
            Iterator it = this.f12028c.values().iterator();
            while (it.hasNext()) {
                ((D.a) it.next()).a(aVar);
            }
        }
    }

    public r(Context context) {
        this(new p.a(context));
    }

    public static /* synthetic */ InterfaceC2255p[] g(r rVar, C6109x c6109x) {
        return new InterfaceC2255p[]{rVar.f12017e.b(c6109x) ? new r3.n(rVar.f12017e.a(c6109x), null) : new b(c6109x)};
    }

    private static D l(C6071C c6071c, D d10) {
        C6071C.d dVar = c6071c.f56332f;
        return (dVar.f56364b == 0 && dVar.f56366d == Long.MIN_VALUE && !dVar.f56368f) ? d10 : new C1916f.b(d10).n(c6071c.f56332f.f56364b).l(c6071c.f56332f.f56366d).k(!c6071c.f56332f.f56369g).i(c6071c.f56332f.f56367e).m(c6071c.f56332f.f56368f).j(c6071c.f56332f.f56370h).h();
    }

    private D m(C6071C c6071c, D d10) {
        AbstractC6614a.e(c6071c.f56328b);
        if (c6071c.f56328b.f56432d == null) {
            return d10;
        }
        AbstractC6635w.i("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
        return d10;
    }

    public static D.a n(Class cls) {
        try {
            return (D.a) cls.getConstructor(null).newInstance(null);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static D.a o(Class cls, InterfaceC6940g.a aVar) {
        try {
            return (D.a) cls.getConstructor(InterfaceC6940g.a.class).newInstance(aVar);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // M2.D.a
    public D e(C6071C c6071c) {
        AbstractC6614a.e(c6071c.f56328b);
        String scheme = c6071c.f56328b.f56429a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            return ((D.a) AbstractC6614a.e(this.f12018f)).e(c6071c);
        }
        if (Objects.equals(c6071c.f56328b.f56430b, "application/x-image-uri")) {
            long jV0 = t2.a0.V0(c6071c.f56328b.f56438j);
            android.support.v4.media.session.b.a(AbstractC6614a.e(null));
            return new C1931v.b(jV0, null).e(c6071c);
        }
        C6071C.h hVar = c6071c.f56328b;
        int iF0 = t2.a0.F0(hVar.f56429a, hVar.f56430b);
        if (c6071c.f56328b.f56438j != -9223372036854775807L) {
            this.f12015c.k(1);
        }
        try {
            D.a aVarF = this.f12015c.f(iF0);
            C6071C.g.a aVarA = c6071c.f56330d.a();
            if (c6071c.f56330d.f56411a == -9223372036854775807L) {
                aVarA.k(this.f12020h);
            }
            if (c6071c.f56330d.f56414d == -3.4028235E38f) {
                aVarA.j(this.f12023k);
            }
            if (c6071c.f56330d.f56415e == -3.4028235E38f) {
                aVarA.h(this.f12024l);
            }
            if (c6071c.f56330d.f56412b == -9223372036854775807L) {
                aVarA.i(this.f12021i);
            }
            if (c6071c.f56330d.f56413c == -9223372036854775807L) {
                aVarA.g(this.f12022j);
            }
            C6071C.g gVarF = aVarA.f();
            if (!gVarF.equals(c6071c.f56330d)) {
                c6071c = c6071c.a().c(gVarF).a();
            }
            D dE = aVarF.e(c6071c);
            AbstractC2011u abstractC2011u = ((C6071C.h) t2.a0.l(c6071c.f56328b)).f56435g;
            if (!abstractC2011u.isEmpty()) {
                D[] dArr = new D[abstractC2011u.size() + 1];
                dArr[0] = dE;
                for (int i10 = 0; i10 < abstractC2011u.size(); i10++) {
                    if (this.f12025m) {
                        final C6109x c6109xP = new C6109x.b().y0(((C6071C.k) abstractC2011u.get(i10)).f56457b).n0(((C6071C.k) abstractC2011u.get(i10)).f56458c).A0(((C6071C.k) abstractC2011u.get(i10)).f56459d).w0(((C6071C.k) abstractC2011u.get(i10)).f56460e).l0(((C6071C.k) abstractC2011u.get(i10)).f56461f).j0(((C6071C.k) abstractC2011u.get(i10)).f56462g).P();
                        X.b bVar = new X.b(this.f12016d, new U2.u() { // from class: M2.l
                            @Override // U2.u
                            public final InterfaceC2255p[] f() {
                                return r.g(this.f11995b, c6109xP);
                            }
                        });
                        if (this.f12017e.b(c6109xP)) {
                            c6109xP = c6109xP.b().y0("application/x-media3-cues").U(c6109xP.f57022o).Y(this.f12017e.c(c6109xP)).P();
                        }
                        X.b bVarI = bVar.i(0, c6109xP);
                        Q2.k kVar = this.f12019g;
                        if (kVar != null) {
                            bVarI.d(kVar);
                        }
                        dArr[i10 + 1] = bVarI.e(C6071C.d(((C6071C.k) abstractC2011u.get(i10)).f56456a.toString()));
                    } else {
                        h0.b bVar2 = new h0.b(this.f12016d);
                        Q2.k kVar2 = this.f12019g;
                        if (kVar2 != null) {
                            bVar2.b(kVar2);
                        }
                        dArr[i10 + 1] = bVar2.a((C6071C.k) abstractC2011u.get(i10), -9223372036854775807L);
                    }
                }
                dE = new P(dArr);
            }
            return m(c6071c, l(c6071c, dE));
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // M2.D.a
    /* JADX INFO: renamed from: j */
    public r c(boolean z10) {
        this.f12025m = z10;
        this.f12015c.m(z10);
        return this;
    }

    @Override // M2.D.a
    /* JADX INFO: renamed from: k */
    public r b(int i10) {
        this.f12015c.h(i10);
        return this;
    }

    public r p(InterfaceC6940g.a aVar) {
        this.f12016d = aVar;
        this.f12015c.i(aVar);
        return this;
    }

    @Override // M2.D.a
    /* JADX INFO: renamed from: q */
    public r f(F2.w wVar) {
        this.f12015c.j((F2.w) AbstractC6614a.f(wVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    @Override // M2.D.a
    /* JADX INFO: renamed from: r */
    public r d(Q2.k kVar) {
        this.f12019g = (Q2.k) AbstractC6614a.f(kVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f12015c.l(kVar);
        return this;
    }

    @Override // M2.D.a
    /* JADX INFO: renamed from: s */
    public r a(r.a aVar) {
        this.f12017e = (r.a) AbstractC6614a.e(aVar);
        this.f12015c.n(aVar);
        return this;
    }

    public r(Context context, U2.u uVar) {
        this(new p.a(context), uVar);
    }

    public r(InterfaceC6940g.a aVar) {
        this(aVar, new C2252m());
    }

    public r(InterfaceC6940g.a aVar, U2.u uVar) {
        this.f12016d = aVar;
        r3.g gVar = new r3.g();
        this.f12017e = gVar;
        a aVar2 = new a(uVar, gVar);
        this.f12015c = aVar2;
        aVar2.i(aVar);
        this.f12020h = -9223372036854775807L;
        this.f12021i = -9223372036854775807L;
        this.f12022j = -9223372036854775807L;
        this.f12023k = -3.4028235E38f;
        this.f12024l = -3.4028235E38f;
        this.f12025m = true;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b implements InterfaceC2255p {

        /* JADX INFO: renamed from: a */
        private final C6109x f12035a;

        public b(C6109x c6109x) {
            this.f12035a = c6109x;
        }

        @Override // U2.InterfaceC2255p
        public void c(U2.r rVar) {
            U2.O oE = rVar.e(0, 3);
            rVar.t(new J.b(-9223372036854775807L));
            rVar.p();
            oE.c(this.f12035a.b().y0("text/x-unknown").U(this.f12035a.f57022o).P());
        }

        @Override // U2.InterfaceC2255p
        public boolean f(InterfaceC2256q interfaceC2256q) {
            return true;
        }

        @Override // U2.InterfaceC2255p
        public int h(InterfaceC2256q interfaceC2256q, U2.I i10) {
            return interfaceC2256q.b(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }

        @Override // U2.InterfaceC2255p
        public void a() {
        }

        @Override // U2.InterfaceC2255p
        public void b(long j10, long j11) {
        }
    }
}
