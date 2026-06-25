package M2;

import M2.C;
import M2.InterfaceC1929t;
import android.net.Uri;
import androidx.media3.exoplayer.C2905q0;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import q2.C6109x;

/* JADX INFO: renamed from: M2.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C1930u implements C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f12037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n0 f12038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f12039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f12040d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicReference f12041e = new AtomicReference();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayList f12042f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.google.common.util.concurrent.p f12043g;

    /* JADX INFO: renamed from: M2.u$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class a implements c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f12044a = 0;

        public a() {
        }

        public void a() {
            if (this.f12044a == 2) {
                this.f12044a = 1;
            }
        }

        @Override // M2.c0
        public void b() throws IOException {
            Throwable th2 = (Throwable) C1930u.this.f12041e.get();
            if (th2 != null) {
                throw new IOException(th2);
            }
        }

        @Override // M2.c0
        public int e(long j10) {
            return 0;
        }

        @Override // M2.c0
        public boolean isReady() {
            return C1930u.this.f12040d.get();
        }

        @Override // M2.c0
        public int p(A2.J j10, z2.f fVar, int i10) {
            int i11 = this.f12044a;
            if (i11 == 2) {
                fVar.k(4);
                return -4;
            }
            if ((i10 & 2) != 0 || i11 == 0) {
                j10.f142b = C1930u.this.f12038b.b(0).c(0);
                this.f12044a = 1;
                return -5;
            }
            if (!C1930u.this.f12040d.get()) {
                return -3;
            }
            int length = C1930u.this.f12039c.length;
            fVar.k(1);
            fVar.f65557f = 0L;
            if ((i10 & 4) == 0) {
                fVar.x(length);
                fVar.f65555d.put(C1930u.this.f12039c, 0, length);
            }
            if ((i10 & 1) == 0) {
                this.f12044a = 2;
            }
            return -4;
        }
    }

    public C1930u(Uri uri, String str, InterfaceC1929t interfaceC1929t) {
        this.f12037a = uri;
        this.f12038b = new n0(new q2.a0(new C6109x.b().y0(str).P()));
        this.f12039c = uri.toString().getBytes(StandardCharsets.UTF_8);
    }

    @Override // M2.C, M2.d0
    public boolean a(C2905q0 c2905q0) {
        return !this.f12040d.get();
    }

    @Override // M2.C, M2.d0
    public long c() {
        return this.f12040d.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // M2.C, M2.d0
    public long f() {
        return this.f12040d.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // M2.C
    public long i(long j10) {
        for (int i10 = 0; i10 < this.f12042f.size(); i10++) {
            ((a) this.f12042f.get(i10)).a();
        }
        return j10;
    }

    @Override // M2.C
    public long k() {
        return -9223372036854775807L;
    }

    @Override // M2.C
    public void l(C.a aVar, long j10) {
        aVar.b(this);
        new InterfaceC1929t.a(this.f12037a);
        throw null;
    }

    public void m() {
        com.google.common.util.concurrent.p pVar = this.f12043g;
        if (pVar != null) {
            pVar.cancel(false);
        }
    }

    @Override // M2.C, M2.d0
    public boolean q() {
        return !this.f12040d.get();
    }

    @Override // M2.C
    public long r(P2.A[] aArr, boolean[] zArr, c0[] c0VarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < aArr.length; i10++) {
            c0 c0Var = c0VarArr[i10];
            if (c0Var != null && (aArr[i10] == null || !zArr[i10])) {
                this.f12042f.remove(c0Var);
                c0VarArr[i10] = null;
            }
            if (c0VarArr[i10] == null && aArr[i10] != null) {
                a aVar = new a();
                this.f12042f.add(aVar);
                c0VarArr[i10] = aVar;
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    @Override // M2.C
    public n0 s() {
        return this.f12038b;
    }

    @Override // M2.C
    public void o() {
    }

    @Override // M2.C, M2.d0
    public void g(long j10) {
    }

    @Override // M2.C
    public long d(long j10, A2.Q q10) {
        return j10;
    }

    @Override // M2.C
    public void u(long j10, boolean z10) {
    }
}
