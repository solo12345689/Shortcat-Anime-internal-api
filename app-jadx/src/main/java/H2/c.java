package H2;

import H2.c;
import H2.f;
import H2.i;
import H2.k;
import H2.m;
import M2.B;
import M2.C1934y;
import M2.L;
import P9.AbstractC2014x;
import Q2.k;
import Q2.m;
import Q2.o;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import q2.C6080L;
import t2.AbstractC6614a;
import t2.a0;
import w2.InterfaceC6940g;
import w2.o;
import w2.x;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements m, m.b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final m.a f7688p = new m.a() { // from class: H2.b
        @Override // H2.m.a
        public final m a(G2.d dVar, Q2.k kVar, l lVar, Q2.e eVar) {
            return new c(dVar, kVar, lVar, eVar);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final G2.d f7689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f7690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Q2.k f7691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap f7692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CopyOnWriteArrayList f7693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final double f7694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private L.a f7695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Q2.m f7696h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f7697i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private m.e f7698j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private i f7699k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Uri f7700l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private f f7701m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f7702n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f7703o;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class b implements m.b {
        private b() {
        }

        @Override // H2.m.b
        public boolean b(Uri uri, k.c cVar, boolean z10) {
            C0099c c0099c;
            if (c.this.f7701m == null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                List list = ((i) a0.l(c.this.f7699k)).f7804e;
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    C0099c c0099c2 = (C0099c) c.this.f7692d.get(((i.b) list.get(i11)).f7817a);
                    if (c0099c2 != null && jElapsedRealtime < c0099c2.f7712h) {
                        i10++;
                    }
                }
                k.b bVarB = c.this.f7691c.b(new k.a(1, 0, c.this.f7699k.f7804e.size(), i10), cVar);
                if (bVarB != null && bVarB.f14319a == 2 && (c0099c = (C0099c) c.this.f7692d.get(uri)) != null) {
                    c0099c.i(bVarB.f14320b);
                }
            }
            return false;
        }

        @Override // H2.m.b
        public void e() {
            c.this.f7693e.remove(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H2.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class C0099c implements m.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f7705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Q2.m f7706b = new Q2.m("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final InterfaceC6940g f7707c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private f f7708d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f7709e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f7710f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f7711g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f7712h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f7713i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private IOException f7714j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f7715k;

        public C0099c(Uri uri) {
            this.f7705a = uri;
            this.f7707c = c.this.f7689a.a(4);
        }

        public static /* synthetic */ void a(C0099c c0099c, Uri uri) {
            c0099c.f7713i = false;
            c0099c.q(uri);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean i(long j10) {
            this.f7712h = SystemClock.elapsedRealtime() + j10;
            return this.f7705a.equals(c.this.f7700l) && !c.this.P();
        }

        private Uri k() {
            f fVar = this.f7708d;
            if (fVar != null) {
                f.h hVar = fVar.f7739v;
                if (hVar.f7797a != -9223372036854775807L || hVar.f7801e) {
                    Uri.Builder builderBuildUpon = this.f7705a.buildUpon();
                    f fVar2 = this.f7708d;
                    if (fVar2.f7739v.f7801e) {
                        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(fVar2.f7728k + ((long) fVar2.f7735r.size())));
                        f fVar3 = this.f7708d;
                        if (fVar3.f7731n != -9223372036854775807L) {
                            List list = fVar3.f7736s;
                            int size = list.size();
                            if (!list.isEmpty() && ((f.d) AbstractC2014x.d(list)).f7780m) {
                                size--;
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    f.h hVar2 = this.f7708d.f7739v;
                    if (hVar2.f7797a != -9223372036854775807L) {
                        builderBuildUpon.appendQueryParameter("_HLS_skip", hVar2.f7798b ? "v2" : "YES");
                    }
                    return builderBuildUpon.build();
                }
            }
            return this.f7705a;
        }

        private void q(Uri uri) {
            o.a aVarA = c.this.f7690b.a(c.this.f7699k, this.f7708d);
            w2.o oVarA = new o.b().i(uri).b(1).a();
            c.u(c.this);
            Q2.o oVar = new Q2.o(this.f7707c, oVarA, 4, aVarA);
            this.f7706b.n(oVar, this, c.this.f7691c.a(oVar.f14347c));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void r(final Uri uri) {
            this.f7712h = 0L;
            if (this.f7713i || this.f7706b.j() || this.f7706b.i()) {
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime >= this.f7711g) {
                q(uri);
            } else {
                this.f7713i = true;
                c.this.f7697i.postDelayed(new Runnable() { // from class: H2.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.C0099c.a(this.f7717a, uri);
                    }
                }, this.f7711g - jElapsedRealtime);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void y(f fVar, C1934y c1934y) {
            boolean z10;
            long j10;
            f fVar2 = this.f7708d;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f7709e = jElapsedRealtime;
            f fVarJ = c.this.J(fVar2, fVar);
            this.f7708d = fVarJ;
            IOException dVar = null;
            if (fVarJ != fVar2) {
                this.f7714j = null;
                this.f7710f = jElapsedRealtime;
                c.this.W(this.f7705a, fVarJ);
            } else if (!fVarJ.f7732o) {
                if (fVar.f7728k + ((long) fVar.f7735r.size()) < this.f7708d.f7728k) {
                    dVar = new m.c(this.f7705a);
                    z10 = true;
                } else {
                    z10 = false;
                    if (jElapsedRealtime - this.f7710f > a0.F1(r13.f7730m) * c.this.f7694f) {
                        dVar = new m.d(this.f7705a);
                    }
                }
                if (dVar != null) {
                    this.f7714j = dVar;
                    c.this.R(this.f7705a, new k.c(c1934y, new B(4), dVar, 1), z10);
                }
            }
            f fVar3 = this.f7708d;
            if (!fVar3.f7739v.f7801e) {
                j10 = fVar3 != fVar2 ? fVar3.f7730m : fVar3.f7730m / 2;
            } else if (fVar3 == fVar2) {
                long j11 = fVar3.f7731n;
                j10 = j11 != -9223372036854775807L ? j11 / 2 : fVar3.f7730m / 2;
            } else {
                j10 = 0;
            }
            this.f7711g = (jElapsedRealtime + a0.F1(j10)) - c1934y.f12061f;
            if (this.f7708d.f7732o) {
                return;
            }
            if (this.f7705a.equals(c.this.f7700l) || this.f7715k) {
                r(k());
            }
        }

        public void A(boolean z10) {
            this.f7715k = z10;
        }

        public f l() {
            return this.f7708d;
        }

        public boolean m() {
            return this.f7715k;
        }

        public boolean o() {
            int i10;
            if (this.f7708d == null) {
                return false;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jMax = Math.max(HTTPTimeoutManager.DEFAULT_TIMEOUT_MS, a0.F1(this.f7708d.f7738u));
            f fVar = this.f7708d;
            return fVar.f7732o || (i10 = fVar.f7721d) == 2 || i10 == 1 || this.f7709e + jMax > jElapsedRealtime;
        }

        public void p(boolean z10) {
            r(z10 ? k() : this.f7705a);
        }

        public void s() throws IOException {
            this.f7706b.b();
            IOException iOException = this.f7714j;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // Q2.m.b
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void h(Q2.o oVar, long j10, long j11, boolean z10) {
            C1934y c1934y = new C1934y(oVar.f14345a, oVar.f14346b, oVar.f(), oVar.d(), j10, j11, oVar.b());
            c.this.f7691c.d(oVar.f14345a);
            c.this.f7695g.l(c1934y, 4);
        }

        @Override // Q2.m.b
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public void j(Q2.o oVar, long j10, long j11) {
            j jVar = (j) oVar.e();
            C1934y c1934y = new C1934y(oVar.f14345a, oVar.f14346b, oVar.f(), oVar.d(), j10, j11, oVar.b());
            if (jVar instanceof f) {
                y((f) jVar, c1934y);
                c.this.f7695g.o(c1934y, 4);
            } else {
                this.f7714j = C6080L.c("Loaded playlist has unexpected type.", null);
                c.this.f7695g.s(c1934y, 4, this.f7714j, true);
            }
            c.this.f7691c.d(oVar.f14345a);
        }

        @Override // Q2.m.b
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public m.c n(Q2.o oVar, long j10, long j11, IOException iOException, int i10) {
            m.c cVarH;
            C1934y c1934y = new C1934y(oVar.f14345a, oVar.f14346b, oVar.f(), oVar.d(), j10, j11, oVar.b());
            boolean z10 = iOException instanceof k.a;
            if ((oVar.f().getQueryParameter("_HLS_msn") != null) || z10) {
                int i11 = iOException instanceof x ? ((x) iOException).f62894d : Integer.MAX_VALUE;
                if (z10 || i11 == 400 || i11 == 503) {
                    this.f7711g = SystemClock.elapsedRealtime();
                    p(false);
                    ((L.a) a0.l(c.this.f7695g)).s(c1934y, oVar.f14347c, iOException, true);
                    return Q2.m.f14327f;
                }
            }
            k.c cVar = new k.c(c1934y, new B(oVar.f14347c), iOException, i10);
            if (c.this.R(this.f7705a, cVar, false)) {
                long jC = c.this.f7691c.c(cVar);
                cVarH = jC != -9223372036854775807L ? Q2.m.h(false, jC) : Q2.m.f14328g;
            } else {
                cVarH = Q2.m.f14327f;
            }
            boolean zC = cVarH.c();
            c.this.f7695g.s(c1934y, oVar.f14347c, iOException, !zC);
            if (!zC) {
                c.this.f7691c.d(oVar.f14345a);
            }
            return cVarH;
        }

        @Override // Q2.m.b
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public void v(Q2.o oVar, long j10, long j11, int i10) {
            c.this.f7695g.u(i10 == 0 ? new C1934y(oVar.f14345a, oVar.f14346b, j10) : new C1934y(oVar.f14345a, oVar.f14346b, oVar.f(), oVar.d(), j10, j11, oVar.b()), oVar.f14347c, i10);
        }

        public void z() {
            this.f7706b.l();
        }
    }

    public c(G2.d dVar, Q2.k kVar, l lVar, Q2.e eVar) {
        this(dVar, kVar, lVar, eVar, 3.5d);
    }

    private void H(List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = (Uri) list.get(i10);
            this.f7692d.put(uri, new C0099c(uri));
        }
    }

    private static f.C0100f I(f fVar, f fVar2) {
        int i10 = (int) (fVar2.f7728k - fVar.f7728k);
        List list = fVar.f7735r;
        if (i10 < list.size()) {
            return (f.C0100f) list.get(i10);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public f J(f fVar, f fVar2) {
        return !fVar2.f(fVar) ? fVar2.f7732o ? fVar.d() : fVar : fVar2.c(L(fVar, fVar2), K(fVar, fVar2));
    }

    private int K(f fVar, f fVar2) {
        f.C0100f c0100fI;
        if (fVar2.f7726i) {
            return fVar2.f7727j;
        }
        f fVar3 = this.f7701m;
        return (fVar == null || (c0100fI = I(fVar, fVar2)) == null) ? fVar3 != null ? fVar3.f7727j : 0 : (fVar.f7727j + c0100fI.f7789d) - ((f.C0100f) fVar2.f7735r.get(0)).f7789d;
    }

    private long L(f fVar, f fVar2) {
        if (fVar2.f7733p) {
            return fVar2.f7725h;
        }
        f fVar3 = this.f7701m;
        long j10 = fVar3 != null ? fVar3.f7725h : 0L;
        if (fVar != null) {
            int size = fVar.f7735r.size();
            f.C0100f c0100fI = I(fVar, fVar2);
            if (c0100fI != null) {
                return fVar.f7725h + c0100fI.f7790e;
            }
            if (size == fVar2.f7728k - fVar.f7728k) {
                return fVar.e();
            }
        }
        return j10;
    }

    private Uri M(Uri uri) {
        f.e eVar;
        f fVar = this.f7701m;
        if (fVar == null || !fVar.f7739v.f7801e || (eVar = (f.e) fVar.f7737t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(eVar.f7782b));
        int i10 = eVar.f7783c;
        if (i10 != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i10));
        }
        return builderBuildUpon.build();
    }

    private boolean N(Uri uri) {
        List list = this.f7699k.f7804e;
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (uri.equals(((i.b) list.get(i10)).f7817a)) {
                return true;
            }
        }
        return false;
    }

    private void O(Uri uri) {
        C0099c c0099c = (C0099c) this.f7692d.get(uri);
        f fVarL = c0099c.l();
        if (c0099c.m()) {
            return;
        }
        c0099c.A(true);
        if (fVarL == null || fVarL.f7732o) {
            return;
        }
        c0099c.p(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean P() {
        List list = this.f7699k.f7804e;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            C0099c c0099c = (C0099c) AbstractC6614a.e((C0099c) this.f7692d.get(((i.b) list.get(i10)).f7817a));
            if (jElapsedRealtime > c0099c.f7712h) {
                Uri uri = c0099c.f7705a;
                this.f7700l = uri;
                c0099c.r(M(uri));
                return true;
            }
        }
        return false;
    }

    private void Q(Uri uri) {
        if (uri.equals(this.f7700l) || !N(uri)) {
            return;
        }
        f fVar = this.f7701m;
        if (fVar == null || !fVar.f7732o) {
            this.f7700l = uri;
            C0099c c0099c = (C0099c) this.f7692d.get(uri);
            f fVar2 = c0099c.f7708d;
            if (fVar2 == null || !fVar2.f7732o) {
                c0099c.r(M(uri));
            } else {
                this.f7701m = fVar2;
                this.f7698j.i(fVar2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean R(Uri uri, k.c cVar, boolean z10) {
        Iterator it = this.f7693e.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= !((m.b) it.next()).b(uri, cVar, z10);
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(Uri uri, f fVar) {
        if (uri.equals(this.f7700l)) {
            if (this.f7701m == null) {
                this.f7702n = !fVar.f7732o;
                this.f7703o = fVar.f7725h;
            }
            this.f7701m = fVar;
            this.f7698j.i(fVar);
        }
        Iterator it = this.f7693e.iterator();
        while (it.hasNext()) {
            ((m.b) it.next()).e();
        }
    }

    static /* synthetic */ Q2.e u(c cVar) {
        cVar.getClass();
        return null;
    }

    @Override // Q2.m.b
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void h(Q2.o oVar, long j10, long j11, boolean z10) {
        C1934y c1934y = new C1934y(oVar.f14345a, oVar.f14346b, oVar.f(), oVar.d(), j10, j11, oVar.b());
        this.f7691c.d(oVar.f14345a);
        this.f7695g.l(c1934y, 4);
    }

    @Override // Q2.m.b
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public void j(Q2.o oVar, long j10, long j11) {
        j jVar = (j) oVar.e();
        boolean z10 = jVar instanceof f;
        i iVarE = z10 ? i.e(jVar.f7823a) : (i) jVar;
        this.f7699k = iVarE;
        this.f7700l = ((i.b) iVarE.f7804e.get(0)).f7817a;
        this.f7693e.add(new b());
        H(iVarE.f7803d);
        C1934y c1934y = new C1934y(oVar.f14345a, oVar.f14346b, oVar.f(), oVar.d(), j10, j11, oVar.b());
        C0099c c0099c = (C0099c) this.f7692d.get(this.f7700l);
        if (z10) {
            c0099c.y((f) jVar, c1934y);
        } else {
            c0099c.p(false);
        }
        this.f7691c.d(oVar.f14345a);
        this.f7695g.o(c1934y, 4);
    }

    @Override // Q2.m.b
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public m.c n(Q2.o oVar, long j10, long j11, IOException iOException, int i10) {
        C1934y c1934y = new C1934y(oVar.f14345a, oVar.f14346b, oVar.f(), oVar.d(), j10, j11, oVar.b());
        long jC = this.f7691c.c(new k.c(c1934y, new B(oVar.f14347c), iOException, i10));
        boolean z10 = jC == -9223372036854775807L;
        this.f7695g.s(c1934y, oVar.f14347c, iOException, z10);
        if (z10) {
            this.f7691c.d(oVar.f14345a);
        }
        return z10 ? Q2.m.f14328g : Q2.m.h(false, jC);
    }

    @Override // Q2.m.b
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public void v(Q2.o oVar, long j10, long j11, int i10) {
        this.f7695g.u(i10 == 0 ? new C1934y(oVar.f14345a, oVar.f14346b, j10) : new C1934y(oVar.f14345a, oVar.f14346b, oVar.f(), oVar.d(), j10, j11, oVar.b()), oVar.f14347c, i10);
    }

    @Override // H2.m
    public void a(Uri uri, L.a aVar, m.e eVar) {
        this.f7697i = a0.C();
        this.f7695g = aVar;
        this.f7698j = eVar;
        Q2.o oVar = new Q2.o(this.f7689a.a(4), new o.b().i(uri).b(1).a(), 4, this.f7690b.b());
        AbstractC6614a.g(this.f7696h == null);
        Q2.m mVar = new Q2.m("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.f7696h = mVar;
        mVar.n(oVar, this, this.f7691c.a(oVar.f14347c));
    }

    @Override // H2.m
    public void b(Uri uri) {
        C0099c c0099c = (C0099c) this.f7692d.get(uri);
        if (c0099c != null) {
            c0099c.A(false);
        }
    }

    @Override // H2.m
    public void c(Uri uri) throws IOException {
        ((C0099c) this.f7692d.get(uri)).s();
    }

    @Override // H2.m
    public long d() {
        return this.f7703o;
    }

    @Override // H2.m
    public i e() {
        return this.f7699k;
    }

    @Override // H2.m
    public void f(Uri uri) {
        ((C0099c) this.f7692d.get(uri)).p(true);
    }

    @Override // H2.m
    public boolean g(Uri uri) {
        return ((C0099c) this.f7692d.get(uri)).o();
    }

    @Override // H2.m
    public boolean i() {
        return this.f7702n;
    }

    @Override // H2.m
    public boolean k(Uri uri, long j10) {
        if (((C0099c) this.f7692d.get(uri)) != null) {
            return !r2.i(j10);
        }
        return false;
    }

    @Override // H2.m
    public void l() throws IOException {
        Q2.m mVar = this.f7696h;
        if (mVar != null) {
            mVar.b();
        }
        Uri uri = this.f7700l;
        if (uri != null) {
            c(uri);
        }
    }

    @Override // H2.m
    public f m(Uri uri, boolean z10) {
        f fVarL = ((C0099c) this.f7692d.get(uri)).l();
        if (fVarL != null && z10) {
            Q(uri);
            O(uri);
        }
        return fVarL;
    }

    @Override // H2.m
    public void o(m.b bVar) {
        AbstractC6614a.e(bVar);
        this.f7693e.add(bVar);
    }

    @Override // H2.m
    public void p(m.b bVar) {
        this.f7693e.remove(bVar);
    }

    @Override // H2.m
    public void stop() {
        this.f7700l = null;
        this.f7701m = null;
        this.f7699k = null;
        this.f7703o = -9223372036854775807L;
        this.f7696h.l();
        this.f7696h = null;
        Iterator it = this.f7692d.values().iterator();
        while (it.hasNext()) {
            ((C0099c) it.next()).z();
        }
        this.f7697i.removeCallbacksAndMessages(null);
        this.f7697i = null;
        this.f7692d.clear();
    }

    public c(G2.d dVar, Q2.k kVar, l lVar, Q2.e eVar, double d10) {
        this.f7689a = dVar;
        this.f7690b = lVar;
        this.f7691c = kVar;
        this.f7694f = d10;
        this.f7693e = new CopyOnWriteArrayList();
        this.f7692d = new HashMap();
        this.f7703o = -9223372036854775807L;
    }
}
