package x2;

import android.net.Uri;
import java.io.File;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import q2.AbstractC6085Q;
import t2.AbstractC6614a;
import t2.a0;
import w2.C6928B;
import w2.C6931E;
import w2.InterfaceC6932F;
import w2.InterfaceC6939f;
import w2.InterfaceC6940g;
import w2.t;
import x2.InterfaceC7048a;
import x2.b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC6940g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC7048a f63713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC6940g f63714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC6940g f63715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC6940g f63716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h f63717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f63718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f63719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f63720h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Uri f63721i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private w2.o f63722j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private w2.o f63723k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private InterfaceC6940g f63724l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f63725m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f63726n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f63727o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private i f63728p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f63729q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f63730r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f63731s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f63732t;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
    }

    /* JADX INFO: renamed from: x2.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0961c implements InterfaceC6940g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private InterfaceC7048a f63733a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private InterfaceC6939f.a f63735c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f63737e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private InterfaceC6940g.a f63738f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f63739g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f63740h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private InterfaceC6940g.a f63734b = new t.a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private h f63736d = h.f63746a;

        private c c(InterfaceC6940g interfaceC6940g, int i10, int i11) {
            InterfaceC6939f interfaceC6939fA;
            InterfaceC7048a interfaceC7048a = (InterfaceC7048a) AbstractC6614a.e(this.f63733a);
            if (this.f63737e || interfaceC6940g == null) {
                interfaceC6939fA = null;
            } else {
                InterfaceC6939f.a aVar = this.f63735c;
                interfaceC6939fA = aVar != null ? aVar.a() : new b.C0960b().b(interfaceC7048a).a();
            }
            return new c(interfaceC7048a, interfaceC6940g, this.f63734b.a(), interfaceC6939fA, this.f63736d, i10, null, i11, null);
        }

        @Override // w2.InterfaceC6940g.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a() {
            InterfaceC6940g.a aVar = this.f63738f;
            return c(aVar != null ? aVar.a() : null, this.f63740h, this.f63739g);
        }

        public C0961c d(InterfaceC7048a interfaceC7048a) {
            this.f63733a = interfaceC7048a;
            return this;
        }

        public C0961c e(int i10) {
            this.f63740h = i10;
            return this;
        }

        public C0961c f(InterfaceC6940g.a aVar) {
            this.f63738f = aVar;
            return this;
        }
    }

    private int A(w2.o oVar) {
        if (this.f63719g && this.f63729q) {
            return 0;
        }
        return (this.f63720h && oVar.f62832h == -1) ? 1 : -1;
    }

    private void p() {
        InterfaceC6940g interfaceC6940g = this.f63724l;
        if (interfaceC6940g == null) {
            return;
        }
        try {
            interfaceC6940g.close();
        } finally {
            this.f63723k = null;
            this.f63724l = null;
            i iVar = this.f63728p;
            if (iVar != null) {
                this.f63713a.e(iVar);
                this.f63728p = null;
            }
        }
    }

    private static Uri q(InterfaceC7048a interfaceC7048a, String str, Uri uri) {
        Uri uriD = l.d(interfaceC7048a.b(str));
        return uriD != null ? uriD : uri;
    }

    private void r(Throwable th2) {
        if (t() || (th2 instanceof InterfaceC7048a.C0959a)) {
            this.f63729q = true;
        }
    }

    private boolean s() {
        return this.f63724l == this.f63716d;
    }

    private boolean t() {
        return this.f63724l == this.f63714b;
    }

    private boolean u() {
        return !t();
    }

    private boolean v() {
        return this.f63724l == this.f63715c;
    }

    private void y(w2.o oVar, boolean z10) throws InterruptedIOException {
        i iVarG;
        long jMin;
        w2.o oVarA;
        InterfaceC6940g interfaceC6940g;
        String str = (String) a0.l(oVar.f62833i);
        if (this.f63730r) {
            iVarG = null;
        } else if (this.f63718f) {
            try {
                iVarG = this.f63713a.g(str, this.f63726n, this.f63727o);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            iVarG = this.f63713a.d(str, this.f63726n, this.f63727o);
        }
        if (iVarG == null) {
            interfaceC6940g = this.f63716d;
            oVarA = oVar.a().h(this.f63726n).g(this.f63727o).a();
        } else if (iVarG.f63750d) {
            Uri uriFromFile = Uri.fromFile((File) a0.l(iVarG.f63751e));
            long j10 = iVarG.f63748b;
            long j11 = this.f63726n - j10;
            long jMin2 = iVarG.f63749c - j11;
            long j12 = this.f63727o;
            if (j12 != -1) {
                jMin2 = Math.min(jMin2, j12);
            }
            oVarA = oVar.a().i(uriFromFile).k(j10).h(j11).g(jMin2).a();
            interfaceC6940g = this.f63714b;
        } else {
            if (iVarG.c()) {
                jMin = this.f63727o;
            } else {
                jMin = iVarG.f63749c;
                long j13 = this.f63727o;
                if (j13 != -1) {
                    jMin = Math.min(jMin, j13);
                }
            }
            oVarA = oVar.a().h(this.f63726n).g(jMin).a();
            interfaceC6940g = this.f63715c;
            if (interfaceC6940g == null) {
                interfaceC6940g = this.f63716d;
                this.f63713a.e(iVarG);
                iVarG = null;
            }
        }
        this.f63732t = (this.f63730r || interfaceC6940g != this.f63716d) ? Long.MAX_VALUE : this.f63726n + 102400;
        if (z10) {
            AbstractC6614a.g(s());
            if (interfaceC6940g == this.f63716d) {
                return;
            }
            try {
                p();
            } catch (Throwable th2) {
                if (((i) a0.l(iVarG)).b()) {
                    this.f63713a.e(iVarG);
                }
                throw th2;
            }
        }
        if (iVarG != null && iVarG.b()) {
            this.f63728p = iVarG;
        }
        this.f63724l = interfaceC6940g;
        this.f63723k = oVarA;
        this.f63725m = 0L;
        long jA = interfaceC6940g.a(oVarA);
        m mVar = new m();
        if (oVarA.f62832h == -1 && jA != -1) {
            this.f63727o = jA;
            m.g(mVar, this.f63726n + jA);
        }
        if (u()) {
            Uri uriC = interfaceC6940g.c();
            this.f63721i = uriC;
            m.h(mVar, oVar.f62825a.equals(uriC) ? null : this.f63721i);
        }
        if (v()) {
            this.f63713a.c(str, mVar);
        }
    }

    private void z(String str) {
        this.f63727o = 0L;
        if (v()) {
            m mVar = new m();
            m.g(mVar, this.f63726n);
            this.f63713a.c(str, mVar);
        }
    }

    @Override // w2.InterfaceC6940g
    public long a(w2.o oVar) {
        try {
            String strA = this.f63717e.a(oVar);
            w2.o oVarA = oVar.a().f(strA).a();
            this.f63722j = oVarA;
            this.f63721i = q(this.f63713a, strA, oVarA.f62825a);
            this.f63726n = oVar.f62831g;
            int iA = A(oVar);
            boolean z10 = iA != -1;
            this.f63730r = z10;
            if (z10) {
                x(iA);
            }
            if (this.f63730r) {
                this.f63727o = -1L;
            } else {
                long jA = l.a(this.f63713a.b(strA));
                this.f63727o = jA;
                if (jA != -1) {
                    long j10 = jA - oVar.f62831g;
                    this.f63727o = j10;
                    if (j10 < 0) {
                        throw new w2.l(2008);
                    }
                }
            }
            long jMin = oVar.f62832h;
            if (jMin != -1) {
                long j11 = this.f63727o;
                if (j11 != -1) {
                    jMin = Math.min(j11, jMin);
                }
                this.f63727o = jMin;
            }
            long j12 = this.f63727o;
            if (j12 > 0 || j12 == -1) {
                y(oVarA, false);
            }
            long j13 = oVar.f62832h;
            return j13 != -1 ? j13 : this.f63727o;
        } catch (Throwable th2) {
            r(th2);
            throw th2;
        }
    }

    @Override // w2.InterfaceC6940g
    public Uri c() {
        return this.f63721i;
    }

    @Override // w2.InterfaceC6940g
    public void close() {
        this.f63722j = null;
        this.f63721i = null;
        this.f63726n = 0L;
        w();
        try {
            p();
        } catch (Throwable th2) {
            r(th2);
            throw th2;
        }
    }

    @Override // w2.InterfaceC6940g
    public Map f() {
        return u() ? this.f63716d.f() : Collections.EMPTY_MAP;
    }

    @Override // w2.InterfaceC6940g
    public void i(InterfaceC6932F interfaceC6932F) {
        AbstractC6614a.e(interfaceC6932F);
        this.f63714b.i(interfaceC6932F);
        this.f63716d.i(interfaceC6932F);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        if (r17.f63725m < r13) goto L29;
     */
    @Override // q2.InterfaceC6098m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int read(byte[] r18, int r19, int r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r20
            r2 = 0
            if (r0 != 0) goto L8
            return r2
        L8:
            long r3 = r1.f63727o
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r4 = -1
            if (r3 != 0) goto L12
            return r4
        L12:
            w2.o r3 = r1.f63722j
            java.lang.Object r3 = t2.AbstractC6614a.e(r3)
            w2.o r3 = (w2.o) r3
            w2.o r7 = r1.f63723k
            java.lang.Object r7 = t2.AbstractC6614a.e(r7)
            w2.o r7 = (w2.o) r7
            long r8 = r1.f63726n     // Catch: java.lang.Throwable -> L2f
            long r10 = r1.f63732t     // Catch: java.lang.Throwable -> L2f
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 < 0) goto L31
            r8 = 1
            r1.y(r3, r8)     // Catch: java.lang.Throwable -> L2f
            goto L31
        L2f:
            r0 = move-exception
            goto L9d
        L31:
            w2.g r8 = r1.f63724l     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r8 = t2.AbstractC6614a.e(r8)     // Catch: java.lang.Throwable -> L2f
            w2.g r8 = (w2.InterfaceC6940g) r8     // Catch: java.lang.Throwable -> L2f
            r9 = r18
            r10 = r19
            int r8 = r8.read(r9, r10, r0)     // Catch: java.lang.Throwable -> L2f
            r11 = -1
            if (r8 == r4) goto L66
            boolean r0 = r1.t()     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L51
            long r2 = r1.f63731s     // Catch: java.lang.Throwable -> L2f
            long r4 = (long) r8     // Catch: java.lang.Throwable -> L2f
            long r2 = r2 + r4
            r1.f63731s = r2     // Catch: java.lang.Throwable -> L2f
        L51:
            long r2 = r1.f63726n     // Catch: java.lang.Throwable -> L2f
            long r4 = (long) r8     // Catch: java.lang.Throwable -> L2f
            long r2 = r2 + r4
            r1.f63726n = r2     // Catch: java.lang.Throwable -> L2f
            long r2 = r1.f63725m     // Catch: java.lang.Throwable -> L2f
            long r2 = r2 + r4
            r1.f63725m = r2     // Catch: java.lang.Throwable -> L2f
            long r2 = r1.f63727o     // Catch: java.lang.Throwable -> L2f
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 == 0) goto L91
            long r2 = r2 - r4
            r1.f63727o = r2     // Catch: java.lang.Throwable -> L2f
            return r8
        L66:
            boolean r4 = r1.u()     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L85
            long r13 = r7.f62832h     // Catch: java.lang.Throwable -> L2f
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 == 0) goto L79
            r15 = r5
            long r5 = r1.f63725m     // Catch: java.lang.Throwable -> L2f
            int r4 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r4 >= 0) goto L86
        L79:
            java.lang.String r0 = r3.f62833i     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r0 = t2.a0.l(r0)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L2f
            r1.z(r0)     // Catch: java.lang.Throwable -> L2f
            return r8
        L85:
            r15 = r5
        L86:
            long r4 = r1.f63727o     // Catch: java.lang.Throwable -> L2f
            int r6 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r6 > 0) goto L92
            int r4 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r4 != 0) goto L91
            goto L92
        L91:
            return r8
        L92:
            r1.p()     // Catch: java.lang.Throwable -> L2f
            r1.y(r3, r2)     // Catch: java.lang.Throwable -> L2f
            int r0 = r17.read(r18, r19, r20)     // Catch: java.lang.Throwable -> L2f
            return r0
        L9d:
            r1.r(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.c.read(byte[], int, int):int");
    }

    private c(InterfaceC7048a interfaceC7048a, InterfaceC6940g interfaceC6940g, InterfaceC6940g interfaceC6940g2, InterfaceC6939f interfaceC6939f, h hVar, int i10, AbstractC6085Q abstractC6085Q, int i11, b bVar) {
        this.f63713a = interfaceC7048a;
        this.f63714b = interfaceC6940g2;
        this.f63717e = hVar == null ? h.f63746a : hVar;
        this.f63718f = (i10 & 1) != 0;
        this.f63719g = (i10 & 2) != 0;
        this.f63720h = (i10 & 4) != 0;
        if (interfaceC6940g != null) {
            this.f63716d = interfaceC6940g;
            this.f63715c = interfaceC6939f != null ? new C6931E(interfaceC6940g, interfaceC6939f) : null;
        } else {
            this.f63716d = C6928B.f62765a;
            this.f63715c = null;
        }
    }

    private void w() {
    }

    private void x(int i10) {
    }
}
