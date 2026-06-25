package androidx.media3.exoplayer.hls;

import B2.K1;
import H2.f;
import H2.m;
import M2.C1912b;
import N2.n;
import P2.A;
import P2.AbstractC1986c;
import P9.AbstractC2011u;
import P9.AbstractC2014x;
import Q2.f;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.C2905q0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import q2.C6109x;
import q2.a0;
import t2.AbstractC6614a;
import t2.Q;
import w2.InterfaceC6932F;
import w2.InterfaceC6940g;
import w2.o;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class c {

    /* JADX INFO: renamed from: a */
    private final G2.e f30833a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC6940g f30834b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC6940g f30835c;

    /* JADX INFO: renamed from: d */
    private final G2.j f30836d;

    /* JADX INFO: renamed from: e */
    private final Uri[] f30837e;

    /* JADX INFO: renamed from: f */
    private final C6109x[] f30838f;

    /* JADX INFO: renamed from: g */
    private final m f30839g;

    /* JADX INFO: renamed from: h */
    private final a0 f30840h;

    /* JADX INFO: renamed from: i */
    private final List f30841i;

    /* JADX INFO: renamed from: k */
    private final K1 f30843k;

    /* JADX INFO: renamed from: l */
    private final long f30844l;

    /* JADX INFO: renamed from: m */
    private boolean f30845m;

    /* JADX INFO: renamed from: o */
    private IOException f30847o;

    /* JADX INFO: renamed from: p */
    private Uri f30848p;

    /* JADX INFO: renamed from: q */
    private Uri f30849q;

    /* JADX INFO: renamed from: r */
    private boolean f30850r;

    /* JADX INFO: renamed from: s */
    private A f30851s;

    /* JADX INFO: renamed from: u */
    private long f30853u = -9223372036854775807L;

    /* JADX INFO: renamed from: j */
    private final androidx.media3.exoplayer.hls.b f30842j = new androidx.media3.exoplayer.hls.b(4);

    /* JADX INFO: renamed from: n */
    private byte[] f30846n = t2.a0.f60567f;

    /* JADX INFO: renamed from: t */
    private long f30852t = -9223372036854775807L;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a extends N2.k {

        /* JADX INFO: renamed from: l */
        private byte[] f30854l;

        public a(InterfaceC6940g interfaceC6940g, o oVar, C6109x c6109x, int i10, Object obj, byte[] bArr) {
            super(interfaceC6940g, oVar, 3, c6109x, i10, obj, bArr);
        }

        @Override // N2.k
        protected void g(byte[] bArr, int i10) {
            this.f30854l = Arrays.copyOf(bArr, i10);
        }

        public byte[] j() {
            return this.f30854l;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public N2.e f30855a;

        /* JADX INFO: renamed from: b */
        public boolean f30856b;

        /* JADX INFO: renamed from: c */
        public Uri f30857c;

        public b() {
            a();
        }

        public void a() {
            this.f30855a = null;
            this.f30856b = false;
            this.f30857c = null;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.hls.c$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0522c extends N2.b {

        /* JADX INFO: renamed from: e */
        private final List f30858e;

        /* JADX INFO: renamed from: f */
        private final long f30859f;

        /* JADX INFO: renamed from: g */
        private final String f30860g;

        public C0522c(String str, long j10, List list) {
            super(0L, list.size() - 1);
            this.f30860g = str;
            this.f30859f = j10;
            this.f30858e = list;
        }

        @Override // N2.n
        public long a() {
            c();
            return this.f30859f + ((f.g) this.f30858e.get((int) d())).f7790e;
        }

        @Override // N2.n
        public long b() {
            c();
            f.g gVar = (f.g) this.f30858e.get((int) d());
            return this.f30859f + gVar.f7790e + gVar.f7788c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class d extends AbstractC1986c {

        /* JADX INFO: renamed from: i */
        private int f30861i;

        public d(a0 a0Var, int[] iArr) {
            super(a0Var, iArr);
            this.f30861i = e(a0Var.c(iArr[0]));
        }

        @Override // P2.A
        public int b() {
            return this.f30861i;
        }

        @Override // P2.A
        public Object i() {
            return null;
        }

        @Override // P2.A
        public void k(long j10, long j11, long j12, List list, n[] nVarArr) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (a(this.f30861i, jElapsedRealtime)) {
                for (int i10 = this.f13308b - 1; i10 >= 0; i10--) {
                    if (!a(i10, jElapsedRealtime)) {
                        this.f30861i = i10;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        @Override // P2.A
        public int r() {
            return 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e {

        /* JADX INFO: renamed from: a */
        public final f.g f30862a;

        /* JADX INFO: renamed from: b */
        public final long f30863b;

        /* JADX INFO: renamed from: c */
        public final int f30864c;

        /* JADX INFO: renamed from: d */
        public final boolean f30865d;

        public e(f.g gVar, long j10, int i10) {
            this.f30862a = gVar;
            this.f30863b = j10;
            this.f30864c = i10;
            this.f30865d = (gVar instanceof f.d) && ((f.d) gVar).f7780m;
        }
    }

    public c(G2.e eVar, m mVar, Uri[] uriArr, C6109x[] c6109xArr, G2.d dVar, InterfaceC6932F interfaceC6932F, G2.j jVar, long j10, List list, K1 k12, Q2.e eVar2) {
        this.f30833a = eVar;
        this.f30839g = mVar;
        this.f30837e = uriArr;
        this.f30838f = c6109xArr;
        this.f30836d = jVar;
        this.f30844l = j10;
        this.f30841i = list;
        this.f30843k = k12;
        InterfaceC6940g interfaceC6940gA = dVar.a(1);
        this.f30834b = interfaceC6940gA;
        if (interfaceC6932F != null) {
            interfaceC6940gA.i(interfaceC6932F);
        }
        this.f30835c = dVar.a(3);
        this.f30840h = new a0(c6109xArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((c6109xArr[i10].f57013f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        this.f30851s = new d(this.f30840h, S9.f.o(arrayList));
    }

    private static boolean A(boolean z10, H2.f fVar, long j10, int i10, androidx.media3.exoplayer.hls.e eVar, long j11, long j12) {
        if (!z10 || eVar == null) {
            return false;
        }
        if (j10 < fVar.f7728k) {
            return true;
        }
        e eVarH = h(fVar, j10, i10);
        return eVarH != null && j11 + eVarH.f30862a.f7790e < j12;
    }

    private void B(H2.f fVar) {
        this.f30852t = fVar.f7732o ? -9223372036854775807L : fVar.e() - this.f30839g.d();
    }

    private void b() {
        this.f30839g.b(this.f30837e[this.f30851s.p()]);
    }

    private static Uri e(H2.f fVar, f.g gVar) {
        String str;
        if (gVar == null || (str = gVar.f7792g) == null) {
            return null;
        }
        return Q.g(fVar.f7823a, str);
    }

    private Pair g(androidx.media3.exoplayer.hls.e eVar, boolean z10, H2.f fVar, long j10, long j11) {
        if (eVar != null && !z10) {
            if (!eVar.h()) {
                return new Pair(Long.valueOf(eVar.f12659j), Integer.valueOf(eVar.f30887o));
            }
            Long lValueOf = Long.valueOf(eVar.f30887o == -1 ? eVar.g() : eVar.f12659j);
            int i10 = eVar.f30887o;
            return new Pair(lValueOf, Integer.valueOf(i10 != -1 ? i10 + 1 : -1));
        }
        long j12 = fVar.f7738u + j10;
        if (eVar != null && !this.f30850r) {
            j11 = eVar.f12611g;
        }
        if (!fVar.f7732o && j11 >= j12) {
            return new Pair(Long.valueOf(fVar.f7728k + ((long) fVar.f7735r.size())), -1);
        }
        long j13 = j11 - j10;
        int i11 = 0;
        int iH = t2.a0.h(fVar.f7735r, Long.valueOf(j13), true, !this.f30839g.i() || eVar == null);
        long j14 = ((long) iH) + fVar.f7728k;
        if (iH >= 0) {
            f.C0100f c0100f = (f.C0100f) fVar.f7735r.get(iH);
            List list = j13 < c0100f.f7790e + c0100f.f7788c ? c0100f.f7785m : fVar.f7736s;
            while (true) {
                if (i11 >= list.size()) {
                    break;
                }
                f.d dVar = (f.d) list.get(i11);
                if (j13 >= dVar.f7790e + dVar.f7788c) {
                    i11++;
                } else if (dVar.f7779l) {
                    j14 += list == fVar.f7736s ? 1L : 0L;
                    i = i11;
                }
            }
        }
        return new Pair(Long.valueOf(j14), Integer.valueOf(i));
    }

    private static e h(H2.f fVar, long j10, int i10) {
        int i11 = (int) (j10 - fVar.f7728k);
        if (i11 == fVar.f7735r.size()) {
            if (i10 == -1) {
                i10 = 0;
            }
            if (i10 < fVar.f7736s.size()) {
                return new e((f.g) fVar.f7736s.get(i10), j10, i10);
            }
            return null;
        }
        f.C0100f c0100f = (f.C0100f) fVar.f7735r.get(i11);
        if (i10 == -1) {
            return new e(c0100f, j10, -1);
        }
        if (i10 < c0100f.f7785m.size()) {
            return new e((f.g) c0100f.f7785m.get(i10), j10, i10);
        }
        int i12 = i11 + 1;
        if (i12 < fVar.f7735r.size()) {
            return new e((f.g) fVar.f7735r.get(i12), j10 + 1, -1);
        }
        if (fVar.f7736s.isEmpty()) {
            return null;
        }
        return new e((f.g) fVar.f7736s.get(0), j10 + 1, 0);
    }

    static List k(H2.f fVar, long j10, int i10) {
        int i11 = (int) (j10 - fVar.f7728k);
        if (i11 < 0 || fVar.f7735r.size() < i11) {
            return AbstractC2011u.A();
        }
        ArrayList arrayList = new ArrayList();
        if (i11 < fVar.f7735r.size()) {
            if (i10 != -1) {
                f.C0100f c0100f = (f.C0100f) fVar.f7735r.get(i11);
                if (i10 == 0) {
                    arrayList.add(c0100f);
                } else if (i10 < c0100f.f7785m.size()) {
                    List list = c0100f.f7785m;
                    arrayList.addAll(list.subList(i10, list.size()));
                }
                i11++;
            }
            List list2 = fVar.f7735r;
            arrayList.addAll(list2.subList(i11, list2.size()));
            i10 = 0;
        }
        if (fVar.f7731n != -9223372036854775807L) {
            int i12 = i10 != -1 ? i10 : 0;
            if (i12 < fVar.f7736s.size()) {
                List list3 = fVar.f7736s;
                arrayList.addAll(list3.subList(i12, list3.size()));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static boolean o(e eVar, H2.f fVar) {
        f.g gVar = eVar.f30862a;
        if (!(gVar instanceof f.d)) {
            return fVar.f7825c;
        }
        if (((f.d) gVar).f7779l) {
            return true;
        }
        return eVar.f30864c == 0 && fVar.f7825c;
    }

    private N2.e p(Uri uri, int i10, boolean z10, f.a aVar) {
        if (uri == null) {
            return null;
        }
        byte[] bArrC = this.f30842j.c(uri);
        if (bArrC != null) {
            this.f30842j.b(uri, bArrC);
            return null;
        }
        return new a(this.f30835c, new o.b().i(uri).b(1).a(), this.f30838f[i10], this.f30851s.r(), this.f30851s.i(), this.f30846n);
    }

    private long w(long j10) {
        long j11 = this.f30852t;
        if (j11 != -9223372036854775807L) {
            return j11 - j10;
        }
        return -9223372036854775807L;
    }

    public n[] a(androidx.media3.exoplayer.hls.e eVar, long j10) {
        int iD = eVar == null ? -1 : this.f30840h.d(eVar.f12608d);
        int length = this.f30851s.length();
        n[] nVarArr = new n[length];
        for (int i10 = 0; i10 < length; i10++) {
            int iF = this.f30851s.f(i10);
            Uri uri = this.f30837e[iF];
            if (this.f30839g.g(uri)) {
                H2.f fVarM = this.f30839g.m(uri, false);
                AbstractC6614a.e(fVarM);
                long jD = fVarM.f7725h - this.f30839g.d();
                Pair pairG = g(eVar, iF != iD, fVarM, jD, j10);
                nVarArr[i10] = new C0522c(fVarM.f7823a, jD, k(fVarM, ((Long) pairG.first).longValue(), ((Integer) pairG.second).intValue()));
            } else {
                nVarArr[i10] = n.f12660a;
            }
        }
        return nVarArr;
    }

    public long c(long j10, A2.Q q10) {
        int iB = this.f30851s.b();
        Uri[] uriArr = this.f30837e;
        H2.f fVarM = (iB >= uriArr.length || iB == -1) ? null : this.f30839g.m(uriArr[this.f30851s.p()], true);
        if (fVarM == null || fVarM.f7735r.isEmpty()) {
            return j10;
        }
        long jD = fVarM.f7725h - this.f30839g.d();
        long j11 = j10 - jD;
        int iH = t2.a0.h(fVarM.f7735r, Long.valueOf(j11), true, true);
        long j12 = ((f.C0100f) fVarM.f7735r.get(iH)).f7790e;
        return q10.a(j11, j12, (!fVarM.f7825c || iH == fVarM.f7735r.size() - 1) ? j12 : ((f.C0100f) fVarM.f7735r.get(iH + 1)).f7790e) + jD;
    }

    public int d(androidx.media3.exoplayer.hls.e eVar) {
        if (eVar.f30887o == -1) {
            return 1;
        }
        H2.f fVar = (H2.f) AbstractC6614a.e(this.f30839g.m(this.f30837e[this.f30840h.d(eVar.f12608d)], false));
        int i10 = (int) (eVar.f12659j - fVar.f7728k);
        if (i10 < 0) {
            return 1;
        }
        List list = i10 < fVar.f7735r.size() ? ((f.C0100f) fVar.f7735r.get(i10)).f7785m : fVar.f7736s;
        if (eVar.f30887o >= list.size()) {
            return 2;
        }
        f.d dVar = (f.d) list.get(eVar.f30887o);
        if (dVar.f7780m) {
            return 0;
        }
        return Objects.equals(Uri.parse(Q.f(fVar.f7823a, dVar.f7786a)), eVar.f12606b.f62825a) ? 1 : 2;
    }

    public void f(C2905q0 c2905q0, long j10, long j11, List list, boolean z10, b bVar) {
        int i10;
        boolean z11;
        Uri uri;
        long j12;
        boolean z12;
        e eVar;
        androidx.media3.exoplayer.hls.e eVar2 = list.isEmpty() ? null : (androidx.media3.exoplayer.hls.e) AbstractC2014x.d(list);
        int iD = eVar2 == null ? -1 : this.f30840h.d(eVar2.f12608d);
        long j13 = c2905q0.f31187a;
        long jMax = j10 - j13;
        long jW = w(j13);
        if (eVar2 != null && !this.f30850r) {
            long jD = eVar2.d();
            jMax = Math.max(0L, jMax - jD);
            if (jW != -9223372036854775807L) {
                jW = Math.max(0L, jW - jD);
            }
        }
        this.f30851s.k(j13, jMax, jW, list, a(eVar2, j10));
        int iP = this.f30851s.p();
        boolean z13 = iD != iP;
        Uri uri2 = this.f30837e[iP];
        if (!this.f30839g.g(uri2)) {
            bVar.f30857c = uri2;
            this.f30849q = uri2;
            return;
        }
        H2.f fVarM = this.f30839g.m(uri2, true);
        AbstractC6614a.e(fVarM);
        this.f30850r = fVarM.f7825c;
        B(fVarM);
        long jD2 = fVarM.f7725h - this.f30839g.d();
        Pair pairG = g(eVar2, z13, fVarM, jD2, j10);
        long jLongValue = ((Long) pairG.first).longValue();
        int iIntValue = ((Integer) pairG.second).intValue();
        boolean z14 = z13;
        int i11 = iD;
        H2.f fVar = fVarM;
        androidx.media3.exoplayer.hls.e eVar3 = eVar2;
        long j14 = jLongValue;
        if (A(z14, fVar, j14, iIntValue, eVar3, jD2, j11)) {
            Uri uri3 = this.f30837e[i11];
            H2.f fVarM2 = this.f30839g.m(uri3, true);
            AbstractC6614a.e(fVarM2);
            long jD3 = fVarM2.f7725h - this.f30839g.d();
            i10 = i11;
            z11 = false;
            Pair pairG2 = g(eVar3, false, fVarM2, jD3, j10);
            long jLongValue2 = ((Long) pairG2.first).longValue();
            iIntValue = ((Integer) pairG2.second).intValue();
            fVar = fVarM2;
            uri = uri3;
            j14 = jLongValue2;
            j12 = jD3;
            iP = i10;
        } else {
            i10 = i11;
            z11 = false;
            uri = uri2;
            j12 = jD2;
        }
        if (iP != i10 && i10 != -1) {
            this.f30839g.b(this.f30837e[i10]);
        }
        if (j14 < fVar.f7728k) {
            this.f30847o = new C1912b();
            return;
        }
        e eVarH = h(fVar, j14, iIntValue);
        if (eVarH != null) {
            z12 = true;
            eVar = eVarH;
        } else if (!fVar.f7732o) {
            bVar.f30857c = uri;
            this.f30849q = uri;
            return;
        } else if (z10 || fVar.f7735r.isEmpty()) {
            bVar.f30856b = true;
            return;
        } else {
            eVar = new e((f.g) AbstractC2014x.d(fVar.f7735r), (fVar.f7728k + ((long) fVar.f7735r.size())) - 1, -1);
            z12 = true;
        }
        this.f30849q = null;
        this.f30853u = SystemClock.elapsedRealtime();
        Uri uriE = e(fVar, eVar.f30862a.f7787b);
        N2.e eVarP = p(uriE, iP, z12, null);
        bVar.f30855a = eVarP;
        if (eVarP == null) {
            Uri uriE2 = e(fVar, eVar.f30862a);
            N2.e eVarP2 = p(uriE2, iP, z11, null);
            bVar.f30855a = eVarP2;
            if (eVarP2 == null) {
                boolean zO = o(eVar, fVar);
                boolean zY = androidx.media3.exoplayer.hls.e.y(eVar3, j10, uri, zO, eVar, j12);
                Uri uri4 = uri;
                if (zY && eVar.f30865d) {
                    return;
                }
                bVar.f30855a = androidx.media3.exoplayer.hls.e.k(this.f30833a, this.f30834b, this.f30838f[iP], j12, fVar, eVar, uri4, this.f30841i, this.f30851s.r(), this.f30851s.i(), this.f30845m, this.f30836d, this.f30844l, eVar3, this.f30842j.a(uriE2), this.f30842j.a(uriE), zY, zO, this.f30843k, null);
            }
        }
    }

    public int i(long j10, List list) {
        return (this.f30847o != null || this.f30851s.length() < 2) ? list.size() : this.f30851s.o(j10, list);
    }

    public long j(androidx.media3.exoplayer.hls.e eVar) {
        AbstractC6614a.g(eVar.f30887o != -1);
        H2.f fVar = (H2.f) AbstractC6614a.e(this.f30839g.m(this.f30837e[this.f30840h.d(eVar.f12608d)], false));
        int i10 = (int) (eVar.f12659j - fVar.f7728k);
        if (i10 < 0) {
            return 0L;
        }
        return ((f.d) (i10 < fVar.f7735r.size() ? ((f.C0100f) fVar.f7735r.get(i10)).f7785m : fVar.f7736s).get(eVar.f30887o)).f7788c;
    }

    public a0 l() {
        return this.f30840h;
    }

    public A m() {
        return this.f30851s;
    }

    public boolean n() {
        return this.f30850r;
    }

    public boolean q(N2.e eVar, long j10) {
        A a10 = this.f30851s;
        return a10.g(a10.l(this.f30840h.d(eVar.f12608d)), j10);
    }

    public void r() throws IOException {
        IOException iOException = this.f30847o;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = this.f30848p;
        if (uri == null || !uri.equals(this.f30849q)) {
            return;
        }
        this.f30839g.c(this.f30848p);
    }

    public boolean s(Uri uri) {
        return t2.a0.u(this.f30837e, uri);
    }

    public void t(N2.e eVar) {
        if (eVar instanceof a) {
            a aVar = (a) eVar;
            this.f30846n = aVar.h();
            this.f30842j.b(aVar.f12606b.f62825a, (byte[]) AbstractC6614a.e(aVar.j()));
        }
    }

    public boolean u(Uri uri, long j10) {
        int iL;
        int i10 = 0;
        while (true) {
            Uri[] uriArr = this.f30837e;
            if (i10 >= uriArr.length) {
                i10 = -1;
                break;
            }
            if (uriArr[i10].equals(uri)) {
                break;
            }
            i10++;
        }
        if (i10 == -1 || (iL = this.f30851s.l(i10)) == -1) {
            return true;
        }
        this.f30848p = uri;
        return j10 != -9223372036854775807L && this.f30851s.g(iL, j10) && this.f30839g.k(uri, j10);
    }

    public void v() {
        b();
        this.f30847o = null;
    }

    public void x(boolean z10) {
        this.f30845m = z10;
    }

    public void y(A a10) {
        b();
        this.f30851s = a10;
    }

    public boolean z(long j10, N2.e eVar, List list) {
        if (this.f30847o != null) {
            return false;
        }
        return this.f30851s.c(j10, eVar, list);
    }
}
