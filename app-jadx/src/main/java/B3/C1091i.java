package B3;

import B3.L;
import U2.AbstractC2240a;
import U2.C2253n;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.Arrays;
import java.util.Collections;
import q2.C6109x;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.C6608H;
import t2.C6609I;
import t2.a0;

/* JADX INFO: renamed from: B3.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1091i implements InterfaceC1095m {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final byte[] f1204x = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f1205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6608H f1206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C6609I f1207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f1208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f1209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f1210f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f1211g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private U2.O f1212h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private U2.O f1213i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f1214j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f1215k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f1216l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f1217m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f1218n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f1219o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f1220p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f1221q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f1222r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f1223s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f1224t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f1225u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private U2.O f1226v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f1227w;

    public C1091i(boolean z10, String str) {
        this(z10, null, 0, str);
    }

    private void a() {
        AbstractC6614a.e(this.f1212h);
        a0.l(this.f1226v);
        a0.l(this.f1213i);
    }

    private void g(C6609I c6609i) {
        if (c6609i.a() == 0) {
            return;
        }
        this.f1206b.f60526a[0] = c6609i.f()[c6609i.g()];
        this.f1206b.p(2);
        int iH = this.f1206b.h(4);
        int i10 = this.f1220p;
        if (i10 != -1 && iH != i10) {
            q();
            return;
        }
        if (!this.f1218n) {
            this.f1218n = true;
            this.f1219o = this.f1221q;
            this.f1220p = iH;
        }
        t();
    }

    private boolean h(C6609I c6609i, int i10) {
        c6609i.b0(i10 + 1);
        if (!w(c6609i, this.f1206b.f60526a, 1)) {
            return false;
        }
        this.f1206b.p(4);
        int iH = this.f1206b.h(1);
        int i11 = this.f1219o;
        if (i11 != -1 && iH != i11) {
            return false;
        }
        if (this.f1220p != -1) {
            if (!w(c6609i, this.f1206b.f60526a, 1)) {
                return true;
            }
            this.f1206b.p(2);
            if (this.f1206b.h(4) != this.f1220p) {
                return false;
            }
            c6609i.b0(i10 + 2);
        }
        if (!w(c6609i, this.f1206b.f60526a, 4)) {
            return true;
        }
        this.f1206b.p(14);
        int iH2 = this.f1206b.h(13);
        if (iH2 < 7) {
            return false;
        }
        byte[] bArrF = c6609i.f();
        int iJ = c6609i.j();
        int i12 = i10 + iH2;
        if (i12 >= iJ) {
            return true;
        }
        byte b10 = bArrF[i12];
        if (b10 == -1) {
            int i13 = i12 + 1;
            if (i13 == iJ) {
                return true;
            }
            return l((byte) -1, bArrF[i13]) && ((bArrF[i13] & 8) >> 3) == iH;
        }
        if (b10 != 73) {
            return false;
        }
        int i14 = i12 + 1;
        if (i14 == iJ) {
            return true;
        }
        if (bArrF[i14] != 68) {
            return false;
        }
        int i15 = i12 + 2;
        return i15 == iJ || bArrF[i15] == 51;
    }

    private boolean i(C6609I c6609i, byte[] bArr, int i10) {
        int iMin = Math.min(c6609i.a(), i10 - this.f1215k);
        c6609i.q(bArr, this.f1215k, iMin);
        int i11 = this.f1215k + iMin;
        this.f1215k = i11;
        return i11 == i10;
    }

    private void j(C6609I c6609i) {
        byte[] bArrF = c6609i.f();
        int iG = c6609i.g();
        int iJ = c6609i.j();
        while (iG < iJ) {
            int i10 = iG + 1;
            byte b10 = bArrF[iG];
            int i11 = b10 & 255;
            if (this.f1216l == 512 && l((byte) -1, (byte) i11) && (this.f1218n || h(c6609i, iG - 1))) {
                this.f1221q = (b10 & 8) >> 3;
                this.f1217m = (b10 & 1) == 0;
                if (this.f1218n) {
                    t();
                } else {
                    r();
                }
                c6609i.b0(i10);
                return;
            }
            int i12 = this.f1216l;
            int i13 = i11 | i12;
            if (i13 == 329) {
                this.f1216l = 768;
            } else if (i13 == 511) {
                this.f1216l = IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
            } else if (i13 == 836) {
                this.f1216l = IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
            } else if (i13 == 1075) {
                u();
                c6609i.b0(i10);
                return;
            } else if (i12 != 256) {
                this.f1216l = IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
            }
            iG = i10;
        }
        c6609i.b0(iG);
    }

    private boolean l(byte b10, byte b11) {
        return m(((b10 & 255) << 8) | (b11 & 255));
    }

    public static boolean m(int i10) {
        return (i10 & 65526) == 65520;
    }

    private void n() {
        this.f1206b.p(0);
        if (this.f1222r) {
            this.f1206b.r(10);
        } else {
            int i10 = 2;
            int iH = this.f1206b.h(2) + 1;
            if (iH != 2) {
                AbstractC6635w.i("AdtsReader", "Detected audio object type: " + iH + ", but assuming AAC LC.");
            } else {
                i10 = iH;
            }
            this.f1206b.r(5);
            byte[] bArrA = AbstractC2240a.a(i10, this.f1220p, this.f1206b.h(3));
            AbstractC2240a.b bVarE = AbstractC2240a.e(bArrA);
            C6109x c6109xP = new C6109x.b().j0(this.f1211g).W(this.f1210f).y0("audio/mp4a-latm").U(bVarE.f18970c).T(bVarE.f18969b).z0(bVarE.f18968a).k0(Collections.singletonList(bArrA)).n0(this.f1208d).w0(this.f1209e).P();
            this.f1223s = 1024000000 / ((long) c6109xP.f56998H);
            this.f1212h.c(c6109xP);
            this.f1222r = true;
        }
        this.f1206b.r(4);
        int iH2 = this.f1206b.h(13);
        int i11 = iH2 - 7;
        if (this.f1217m) {
            i11 = iH2 - 9;
        }
        v(this.f1212h, this.f1223s, 0, i11);
    }

    private void o() {
        this.f1213i.f(this.f1207c, 10);
        this.f1207c.b0(6);
        v(this.f1213i, 0L, 10, this.f1207c.L() + 10);
    }

    private void p(C6609I c6609i) {
        int iMin = Math.min(c6609i.a(), this.f1224t - this.f1215k);
        this.f1226v.f(c6609i, iMin);
        int i10 = this.f1215k + iMin;
        this.f1215k = i10;
        if (i10 == this.f1224t) {
            AbstractC6614a.g(this.f1225u != -9223372036854775807L);
            this.f1226v.a(this.f1225u, 1, this.f1224t, 0, null);
            this.f1225u += this.f1227w;
            s();
        }
    }

    private void q() {
        this.f1218n = false;
        s();
    }

    private void r() {
        this.f1214j = 1;
        this.f1215k = 0;
    }

    private void s() {
        this.f1214j = 0;
        this.f1215k = 0;
        this.f1216l = IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
    }

    private void t() {
        this.f1214j = 3;
        this.f1215k = 0;
    }

    private void u() {
        this.f1214j = 2;
        this.f1215k = f1204x.length;
        this.f1224t = 0;
        this.f1207c.b0(0);
    }

    private void v(U2.O o10, long j10, int i10, int i11) {
        this.f1214j = 4;
        this.f1215k = i10;
        this.f1226v = o10;
        this.f1227w = j10;
        this.f1224t = i11;
    }

    private boolean w(C6609I c6609i, byte[] bArr, int i10) {
        if (c6609i.a() < i10) {
            return false;
        }
        c6609i.q(bArr, 0, i10);
        return true;
    }

    @Override // B3.InterfaceC1095m
    public void b(C6609I c6609i) {
        a();
        while (c6609i.a() > 0) {
            int i10 = this.f1214j;
            if (i10 == 0) {
                j(c6609i);
            } else if (i10 == 1) {
                g(c6609i);
            } else if (i10 != 2) {
                if (i10 == 3) {
                    if (i(c6609i, this.f1206b.f60526a, this.f1217m ? 7 : 5)) {
                        n();
                    }
                } else {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    p(c6609i);
                }
            } else if (i(c6609i, this.f1207c.f(), 10)) {
                o();
            }
        }
    }

    @Override // B3.InterfaceC1095m
    public void c() {
        this.f1225u = -9223372036854775807L;
        q();
    }

    @Override // B3.InterfaceC1095m
    public void e(U2.r rVar, L.d dVar) {
        dVar.a();
        this.f1211g = dVar.b();
        U2.O oE = rVar.e(dVar.c(), 1);
        this.f1212h = oE;
        this.f1226v = oE;
        if (!this.f1205a) {
            this.f1213i = new C2253n();
            return;
        }
        dVar.a();
        U2.O oE2 = rVar.e(dVar.c(), 5);
        this.f1213i = oE2;
        oE2.c(new C6109x.b().j0(dVar.b()).W(this.f1210f).y0("application/id3").P());
    }

    @Override // B3.InterfaceC1095m
    public void f(long j10, int i10) {
        this.f1225u = j10;
    }

    public long k() {
        return this.f1223s;
    }

    public C1091i(boolean z10, String str, int i10, String str2) {
        this.f1206b = new C6608H(new byte[7]);
        this.f1207c = new C6609I(Arrays.copyOf(f1204x, 10));
        this.f1219o = -1;
        this.f1220p = -1;
        this.f1223s = -9223372036854775807L;
        this.f1225u = -9223372036854775807L;
        this.f1205a = z10;
        this.f1208d = str;
        this.f1209e = i10;
        this.f1210f = str2;
        s();
    }

    @Override // B3.InterfaceC1095m
    public void d(boolean z10) {
    }
}
