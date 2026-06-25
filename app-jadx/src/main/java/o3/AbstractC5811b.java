package o3;

import P9.AbstractC2011u;
import U2.AbstractC2257s;
import U2.B;
import U2.C;
import U2.C2243d;
import android.util.Pair;
import com.revenuecat.purchases.ui.revenuecatui.components.SensibleDefaults;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import q2.AbstractC6079K;
import q2.C6078J;
import q2.C6080L;
import q2.C6097l;
import q2.C6102q;
import q2.C6109x;
import t2.AbstractC6614a;
import t2.AbstractC6624k;
import t2.AbstractC6635w;
import t2.C6608H;
import t2.C6609I;
import t2.a0;
import u2.AbstractC6723e;
import u2.AbstractC6726h;
import u2.C6719a;
import u2.C6721c;
import u2.C6722d;
import u2.C6724f;
import u2.C6725g;

/* JADX INFO: renamed from: o3.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5811b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f54239a = a0.z0("OpusHead");

    /* JADX INFO: renamed from: o3.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f54240a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f54241b;

        public a(long j10, long j11) {
            this.f54240a = j10;
            this.f54241b = j11;
        }
    }

    /* JADX INFO: renamed from: o3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class C0845b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f54242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f54243b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f54244c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f54245d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f54246e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final C6609I f54247f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final C6609I f54248g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f54249h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f54250i;

        public C0845b(C6609I c6609i, C6609I c6609i2, boolean z10) throws C6080L {
            this.f54248g = c6609i;
            this.f54247f = c6609i2;
            this.f54246e = z10;
            c6609i2.b0(12);
            this.f54242a = c6609i2.Q();
            c6609i.b0(12);
            this.f54250i = c6609i.Q();
            AbstractC2257s.a(c6609i.v() == 1, "first_chunk must be 1");
            this.f54243b = -1;
        }

        public boolean a() {
            int i10 = this.f54243b + 1;
            this.f54243b = i10;
            if (i10 == this.f54242a) {
                return false;
            }
            this.f54245d = this.f54246e ? this.f54247f.T() : this.f54247f.O();
            if (this.f54243b == this.f54249h) {
                this.f54244c = this.f54248g.Q();
                this.f54248g.c0(4);
                int i11 = this.f54250i - 1;
                this.f54250i = i11;
                this.f54249h = i11 > 0 ? this.f54248g.Q() - 1 : -1;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: o3.b$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f54251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f54252b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f54253c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f54254d;

        public c(String str, byte[] bArr, long j10, long j11) {
            this.f54251a = str;
            this.f54252b = bArr;
            this.f54253c = j10;
            this.f54254d = j11;
        }
    }

    /* JADX INFO: renamed from: o3.b$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g f54255a;

        public d(g gVar) {
            this.f54255a = gVar;
        }
    }

    /* JADX INFO: renamed from: o3.b$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f54256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f54257b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f54258c;

        public e(long j10, long j11, String str) {
            this.f54256a = j10;
            this.f54257b = j11;
            this.f54258c = str;
        }
    }

    /* JADX INFO: renamed from: o3.b$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private interface f {
        int a();

        int b();

        int c();
    }

    /* JADX INFO: renamed from: o3.b$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f54259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f54260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f54261c;

        public g(boolean z10, boolean z11, boolean z12) {
            this.f54259a = z10;
            this.f54260b = z11;
            this.f54261c = z12;
        }
    }

    /* JADX INFO: renamed from: o3.b$h */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u[] f54262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public C6109x f54263b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f54264c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f54265d = 0;

        public h(int i10) {
            this.f54262a = new u[i10];
        }
    }

    /* JADX INFO: renamed from: o3.b$i */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class i implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f54266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f54267b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final C6609I f54268c;

        public i(AbstractC6723e.c cVar, C6109x c6109x) {
            C6609I c6609i = cVar.f61230b;
            this.f54268c = c6609i;
            c6609i.b0(12);
            int iQ = c6609i.Q();
            if ("audio/raw".equals(c6109x.f57022o)) {
                int iO0 = a0.o0(c6109x.f56999I, c6109x.f56997G);
                if (iQ == 0 || iQ % iO0 != 0) {
                    AbstractC6635w.i("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iO0 + ", stsz sample size: " + iQ);
                    iQ = iO0;
                }
            }
            this.f54266a = iQ == 0 ? -1 : iQ;
            this.f54267b = c6609i.Q();
        }

        @Override // o3.AbstractC5811b.f
        public int a() {
            int i10 = this.f54266a;
            return i10 == -1 ? this.f54268c.Q() : i10;
        }

        @Override // o3.AbstractC5811b.f
        public int b() {
            return this.f54266a;
        }

        @Override // o3.AbstractC5811b.f
        public int c() {
            return this.f54267b;
        }
    }

    /* JADX INFO: renamed from: o3.b$j */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class j implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C6609I f54269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f54270b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f54271c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f54272d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f54273e;

        public j(AbstractC6723e.c cVar) {
            C6609I c6609i = cVar.f61230b;
            this.f54269a = c6609i;
            c6609i.b0(12);
            this.f54271c = c6609i.Q() & 255;
            this.f54270b = c6609i.Q();
        }

        @Override // o3.AbstractC5811b.f
        public int a() {
            int i10 = this.f54271c;
            if (i10 == 8) {
                return this.f54269a.M();
            }
            if (i10 == 16) {
                return this.f54269a.U();
            }
            int i11 = this.f54272d;
            this.f54272d = i11 + 1;
            if (i11 % 2 != 0) {
                return this.f54273e & 15;
            }
            int iM = this.f54269a.M();
            this.f54273e = iM;
            return (iM & 240) >> 4;
        }

        @Override // o3.AbstractC5811b.f
        public int b() {
            return -1;
        }

        @Override // o3.AbstractC5811b.f
        public int c() {
            return this.f54270b;
        }
    }

    /* JADX INFO: renamed from: o3.b$k */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f54274a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f54275b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f54276c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f54277d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f54278e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f54279f;

        public k(int i10, long j10, int i11, int i12, int i13, int i14) {
            this.f54274a = i10;
            this.f54275b = j10;
            this.f54276c = i11;
            this.f54277d = i12;
            this.f54278e = i13;
            this.f54279f = i14;
        }
    }

    /* JADX INFO: renamed from: o3.b$l */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f54280a;

        public l(d dVar) {
            this.f54280a = dVar;
        }

        public boolean b() {
            d dVar = this.f54280a;
            return dVar != null && dVar.f54255a.f54259a && this.f54280a.f54255a.f54260b;
        }
    }

    private static u A(C6609I c6609i, int i10, int i11, String str) {
        int i12;
        int i13;
        int i14 = i10 + 8;
        while (true) {
            byte[] bArr = null;
            if (i14 - i10 >= i11) {
                return null;
            }
            c6609i.b0(i14);
            int iV = c6609i.v();
            if (c6609i.v() == 1952804451) {
                int iQ = q(c6609i.v());
                c6609i.c0(1);
                if (iQ == 0) {
                    c6609i.c0(1);
                    i13 = 0;
                    i12 = 0;
                } else {
                    int iM = c6609i.M();
                    i12 = iM & 15;
                    i13 = (iM & 240) >> 4;
                }
                boolean z10 = c6609i.M() == 1;
                int iM2 = c6609i.M();
                byte[] bArr2 = new byte[16];
                c6609i.q(bArr2, 0, 16);
                if (z10 && iM2 == 0) {
                    int iM3 = c6609i.M();
                    bArr = new byte[iM3];
                    c6609i.q(bArr, 0, iM3);
                }
                return new u(z10, str, iM2, bArr2, i13, i12, bArr);
            }
            i14 += iV;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b2  */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r22v10, types: [int[]] */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2, types: [int] */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r8v10, types: [int] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static o3.w B(o3.t r36, u2.AbstractC6723e.b r37, U2.B r38) throws q2.C6080L {
        /*
            Method dump skipped, instruction units count: 1398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.AbstractC5811b.B(o3.t, u2.e$b, U2.B):o3.w");
    }

    private static d C(C6609I c6609i, int i10, int i11) throws C6080L {
        c6609i.b0(i10 + 8);
        int iG = c6609i.g();
        while (iG - i10 < i11) {
            c6609i.b0(iG);
            int iV = c6609i.v();
            AbstractC2257s.a(iV > 0, "childAtomSize must be positive");
            if (c6609i.v() == 1937011305) {
                c6609i.c0(4);
                int iM = c6609i.M();
                return new d(new g((iM & 1) == 1, (iM & 2) == 2, (iM & 8) == 8));
            }
            iG += iV;
        }
        return null;
    }

    private static h D(C6609I c6609i, k kVar, String str, C6102q c6102q, boolean z10) throws C6080L {
        c6609i.b0(12);
        int iV = c6609i.v();
        h hVar = new h(iV);
        for (int i10 = 0; i10 < iV; i10++) {
            int iG = c6609i.g();
            int iV2 = c6609i.v();
            AbstractC2257s.a(iV2 > 0, "childAtomSize must be positive");
            int iV3 = c6609i.v();
            if (iV3 == 1635148593 || iV3 == 1635148595 || iV3 == 1701733238 || iV3 == 1831958048 || iV3 == 1836070006 || iV3 == 1752589105 || iV3 == 1751479857 || iV3 == 1932670515 || iV3 == 1211250227 || iV3 == 1748121139 || iV3 == 1987063864 || iV3 == 1987063865 || iV3 == 1635135537 || iV3 == 1685479798 || iV3 == 1685479729 || iV3 == 1685481573 || iV3 == 1685481521 || iV3 == 1634760241) {
                L(c6609i, iV3, iG, iV2, kVar.f54274a, str, kVar.f54277d, c6102q, hVar, i10);
            } else if (iV3 == 1836069985 || iV3 == 1701733217 || iV3 == 1633889587 || iV3 == 1700998451 || iV3 == 1633889588 || iV3 == 1835823201 || iV3 == 1685353315 || iV3 == 1685353317 || iV3 == 1685353320 || iV3 == 1685353324 || iV3 == 1685353336 || iV3 == 1935764850 || iV3 == 1935767394 || iV3 == 1819304813 || iV3 == 1936684916 || iV3 == 1953984371 || iV3 == 778924082 || iV3 == 778924083 || iV3 == 1835557169 || iV3 == 1835560241 || iV3 == 1634492771 || iV3 == 1634492791 || iV3 == 1970037111 || iV3 == 1332770163 || iV3 == 1716281667 || iV3 == 1767992678 || iV3 == 1768973165 || iV3 == 1718641517) {
                i(c6609i, iV3, iG, iV2, kVar.f54274a, str, z10, c6102q, hVar, i10);
            } else if (iV3 == 1414810956 || iV3 == 1954034535 || iV3 == 2004251764 || iV3 == 1937010800 || iV3 == 1664495672 || iV3 == 1836070003) {
                h hVar2 = hVar;
                E(c6609i, iV3, iG, iV2, kVar, str, hVar2);
                hVar = hVar2;
            } else if (iV3 == 1835365492) {
                v(c6609i, iV3, iG, kVar.f54274a, hVar);
            } else if (iV3 == 1667329389) {
                hVar.f54263b = new C6109x.b().i0(kVar.f54274a).y0("application/x-camera-motion").P();
            }
            c6609i.b0(iG + iV2);
        }
        return hVar;
    }

    private static void E(C6609I c6609i, int i10, int i11, int i12, k kVar, String str, h hVar) {
        c6609i.b0(i11 + 16);
        String str2 = "application/ttml+xml";
        AbstractC2011u abstractC2011uB = null;
        long j10 = Long.MAX_VALUE;
        if (i10 != 1414810956) {
            if (i10 == 1954034535) {
                int i13 = i12 - 16;
                byte[] bArr = new byte[i13];
                c6609i.q(bArr, 0, i13);
                abstractC2011uB = AbstractC2011u.B(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i10 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i10 == 1937010800) {
                j10 = 0;
            } else if (i10 == 1664495672) {
                hVar.f54265d = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                if (i10 != 1836070003) {
                    throw new IllegalStateException();
                }
                int iG = c6609i.g();
                c6609i.c0(4);
                if (c6609i.v() == 1702061171) {
                    c cVarN = n(c6609i, iG);
                    if (cVarN.f54252b == null || cVarN.f54252b.length != 64) {
                        return;
                    }
                    abstractC2011uB = AbstractC2011u.B(a0.z0(d(cVarN.f54252b, kVar.f54278e, kVar.f54279f)));
                    str2 = "application/vobsub";
                } else {
                    str2 = null;
                }
            }
        }
        if (str2 != null) {
            hVar.f54263b = new C6109x.b().i0(kVar.f54274a).y0(str2).n0(str).C0(j10).k0(abstractC2011uB).P();
        }
    }

    private static k F(C6609I c6609i) {
        long j10;
        c6609i.b0(8);
        int iQ = q(c6609i.v());
        c6609i.c0(iQ == 0 ? 8 : 16);
        int iV = c6609i.v();
        c6609i.c0(4);
        int iG = c6609i.g();
        int i10 = iQ == 0 ? 4 : 8;
        int i11 = 0;
        while (true) {
            j10 = -9223372036854775807L;
            if (i11 >= i10) {
                c6609i.c0(i10);
                break;
            }
            if (c6609i.f()[iG + i11] != -1) {
                long jO = iQ == 0 ? c6609i.O() : c6609i.T();
                if (jO != 0) {
                    j10 = jO;
                }
            } else {
                i11++;
            }
        }
        c6609i.c0(10);
        int i12 = 0;
        long j11 = j10;
        int iU = c6609i.U();
        c6609i.c0(4);
        int iV2 = c6609i.v();
        int iV3 = c6609i.v();
        c6609i.c0(4);
        int iV4 = c6609i.v();
        int iV5 = c6609i.v();
        if (iV2 == 0 && iV3 == 65536 && ((iV4 == -65536 || iV4 == 65536) && iV5 == 0)) {
            i12 = 90;
        } else if (iV2 == 0 && iV3 == -65536 && ((iV4 == 65536 || iV4 == -65536) && iV5 == 0)) {
            i12 = 270;
        } else if ((iV2 == -65536 || iV2 == 65536) && iV3 == 0 && iV4 == 0 && iV5 == -65536) {
            i12 = SensibleDefaults.X_OFFSET;
        }
        int i13 = i12;
        c6609i.c0(16);
        short sI = c6609i.I();
        c6609i.c0(2);
        return new k(iV, j11, iU, i13, sI, c6609i.I());
    }

    public static t G(AbstractC6723e.b bVar, AbstractC6723e.c cVar, long j10, C6102q c6102q, boolean z10, boolean z11) throws C6080L {
        long[] jArr;
        long[] jArr2;
        C6109x c6109xP;
        AbstractC6723e.b bVarD;
        Pair pairM;
        AbstractC6723e.b bVar2 = (AbstractC6723e.b) AbstractC6614a.e(bVar.d(1835297121));
        int iF = f(r(((AbstractC6723e.c) AbstractC6614a.e(bVar2.e(1751411826))).f61230b));
        if (iF == -1) {
            return null;
        }
        k kVarF = F(((AbstractC6723e.c) AbstractC6614a.e(bVar.e(1953196132))).f61230b);
        long j11 = j10 == -9223372036854775807L ? kVarF.f54275b : j10;
        long j12 = w(cVar.f61230b).f61235c;
        long jM1 = j11 != -9223372036854775807L ? a0.m1(j11, 1000000L, j12) : -9223372036854775807L;
        AbstractC6723e.b bVar3 = (AbstractC6723e.b) AbstractC6614a.e(((AbstractC6723e.b) AbstractC6614a.e(bVar2.d(1835626086))).d(1937007212));
        e eVarT = t(((AbstractC6723e.c) AbstractC6614a.e(bVar2.e(1835296868))).f61230b);
        AbstractC6723e.c cVarE = bVar3.e(1937011556);
        if (cVarE == null) {
            throw C6080L.a("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        h hVarD = D(cVarE.f61230b, kVarF, eVarT.f54258c, c6102q, z11);
        if (z10 || (bVarD = bVar.d(1701082227)) == null || (pairM = m(bVarD)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) pairM.first;
            jArr2 = (long[]) pairM.second;
            jArr = jArr3;
        }
        if (hVarD.f54263b == null) {
            return null;
        }
        if (kVarF.f54276c != 0) {
            C6722d c6722d = new C6722d(kVarF.f54276c);
            C6109x.b bVarB = hVarD.f54263b.b();
            C6078J c6078j = hVarD.f54263b.f57019l;
            c6109xP = bVarB.r0(c6078j != null ? c6078j.a(c6722d) : new C6078J(c6722d)).P();
        } else {
            c6109xP = hVarD.f54263b;
        }
        return new t(kVarF.f54274a, iF, eVarT.f54256a, j12, jM1, eVarT.f54257b, c6109xP, hVarD.f54265d, hVarD.f54262a, hVarD.f54264c, jArr, jArr2);
    }

    public static List H(AbstractC6723e.b bVar, B b10, long j10, C6102q c6102q, boolean z10, boolean z11, O9.f fVar) {
        t tVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < bVar.f61229d.size(); i10++) {
            AbstractC6723e.b bVar2 = (AbstractC6723e.b) bVar.f61229d.get(i10);
            if (bVar2.f61226a == 1953653099 && (tVar = (t) fVar.apply(G(bVar2, (AbstractC6723e.c) AbstractC6614a.e(bVar.e(1836476516)), j10, c6102q, z10, z11))) != null) {
                arrayList.add(B(tVar, (AbstractC6723e.b) AbstractC6614a.e(((AbstractC6723e.b) AbstractC6614a.e(((AbstractC6723e.b) AbstractC6614a.e(bVar2.d(1835297121))).d(1835626086))).d(1937007212)), b10));
            }
        }
        return arrayList;
    }

    public static C6078J I(AbstractC6723e.c cVar) {
        C6609I c6609i = cVar.f61230b;
        c6609i.b0(8);
        C6078J c6078j = new C6078J(new C6078J.a[0]);
        while (c6609i.a() >= 8) {
            int iG = c6609i.g();
            int iV = c6609i.v();
            int iV2 = c6609i.v();
            if (iV2 == 1835365473) {
                c6609i.b0(iG);
                c6078j = c6078j.b(J(c6609i, iG + iV));
            } else if (iV2 == 1936553057) {
                c6609i.b0(iG);
                c6078j = c6078j.b(r.b(c6609i, iG + iV));
            } else if (iV2 == -1451722374) {
                c6078j = c6078j.b(M(c6609i));
            }
            c6609i.b0(iG + iV);
        }
        return c6078j;
    }

    private static C6078J J(C6609I c6609i, int i10) {
        c6609i.c0(8);
        g(c6609i);
        while (c6609i.g() < i10) {
            int iG = c6609i.g();
            int iV = c6609i.v();
            if (c6609i.v() == 1768715124) {
                c6609i.b0(iG);
                return s(c6609i, iG + iV);
            }
            c6609i.b0(iG + iV);
        }
        return null;
    }

    static l K(C6609I c6609i, int i10, int i11) throws C6080L {
        c6609i.b0(i10 + 8);
        int iG = c6609i.g();
        d dVarC = null;
        while (iG - i10 < i11) {
            c6609i.b0(iG);
            int iV = c6609i.v();
            AbstractC2257s.a(iV > 0, "childAtomSize must be positive");
            if (c6609i.v() == 1702454643) {
                dVarC = C(c6609i, iG, iV);
            }
            iG += iV;
        }
        if (dVarC == null) {
            return null;
        }
        return new l(dVarC);
    }

    private static void L(C6609I c6609i, int i10, int i11, int i12, int i13, String str, int i14, C6102q c6102q, h hVar, int i15) throws C6080L {
        int i16;
        String str2;
        int iK;
        int i17;
        C6102q c6102q2;
        int i18;
        int i19;
        int i20;
        int i21;
        AbstractC6726h.k kVar;
        int i22;
        int i23;
        int i24;
        int i25 = i11;
        int i26 = i12;
        C6102q c6102qC = c6102q;
        h hVar2 = hVar;
        c6609i.b0(i25 + 16);
        c6609i.c0(16);
        int iU = c6609i.U();
        int iU2 = c6609i.U();
        c6609i.c0(50);
        int iG = c6609i.g();
        int iIntValue = i10;
        if (iIntValue == 1701733238) {
            Pair pairZ = z(c6609i, i25, i26);
            if (pairZ != null) {
                iIntValue = ((Integer) pairZ.first).intValue();
                c6102qC = c6102qC == null ? null : c6102qC.c(((u) pairZ.second).f54422b);
                hVar2.f54262a[i15] = (u) pairZ.second;
            }
            c6609i.b0(iG);
        }
        String str3 = "video/3gpp";
        String str4 = iIntValue == 1831958048 ? "video/mpeg" : iIntValue == 1211250227 ? "video/3gpp" : null;
        float fX = 1.0f;
        int i27 = 8;
        int i28 = 8;
        ByteBuffer byteBufferA = null;
        List listK = null;
        String str5 = null;
        byte[] bArrY = null;
        int i29 = -1;
        int i30 = -1;
        int i31 = -1;
        int i32 = -1;
        int i33 = -1;
        int i34 = -1;
        int i35 = -1;
        int iL = -1;
        a aVarK = null;
        c cVarN = null;
        AbstractC6726h.k kVar2 = null;
        boolean z10 = false;
        while (iG - i25 < i26) {
            c6609i.b0(iG);
            int iG2 = c6609i.g();
            int iV = c6609i.v();
            if (iV == 0 && c6609i.g() - i11 == i26) {
                break;
            }
            AbstractC2257s.a(iV > 0, "childAtomSize must be positive");
            int iV2 = c6609i.v();
            if (iV2 == 1635148611) {
                AbstractC2257s.a(str4 == null, null);
                c6609i.b0(iG2 + 8);
                C2243d c2243dB = C2243d.b(c6609i);
                List list = c2243dB.f18997a;
                hVar2.f54264c = c2243dB.f18998b;
                if (!z10) {
                    fX = c2243dB.f19007k;
                }
                String str6 = c2243dB.f19008l;
                int i36 = c2243dB.f19006j;
                int i37 = c2243dB.f19003g;
                int i38 = c2243dB.f19004h;
                listK = list;
                int i39 = c2243dB.f19005i;
                int i40 = c2243dB.f19001e;
                AbstractC6726h.k kVar3 = kVar2;
                c6102q2 = c6102qC;
                kVar = kVar3;
                i20 = c2243dB.f19002f;
                i16 = iG;
                i18 = iIntValue;
                str2 = str3;
                iK = i37;
                i17 = i38;
                iL = i39;
                i27 = i40;
                str5 = str6;
                str4 = "video/avc";
                i30 = i36;
            } else {
                i16 = iG;
                if (iV2 == 1752589123) {
                    AbstractC2257s.a(str4 == null, null);
                    c6609i.b0(iG2 + 8);
                    C cA = C.a(c6609i);
                    List list2 = cA.f18882a;
                    hVar2.f54264c = cA.f18883b;
                    if (!z10) {
                        fX = cA.f18895n;
                    }
                    int i41 = cA.f18896o;
                    int i42 = cA.f18884c;
                    String str7 = cA.f18897p;
                    int i43 = cA.f18894m;
                    listK = list2;
                    if (i43 != -1) {
                        i29 = i43;
                    }
                    int i44 = cA.f18887f;
                    int i45 = cA.f18888g;
                    int i46 = cA.f18891j;
                    int i47 = cA.f18892k;
                    int i48 = cA.f18893l;
                    i33 = i45;
                    i27 = cA.f18889h;
                    i20 = cA.f18890i;
                    c6102q2 = c6102qC;
                    i18 = iIntValue;
                    str2 = str3;
                    iK = i46;
                    i17 = i47;
                    iL = i48;
                    kVar = cA.f18898q;
                    i30 = i41;
                    i31 = i42;
                    i32 = i44;
                    str4 = "video/hevc";
                    str5 = str7;
                } else {
                    str2 = str3;
                    if (iV2 == 1818785347) {
                        AbstractC2257s.a("video/hevc".equals(str4), "lhvC must follow hvcC atom");
                        AbstractC6726h.k kVar4 = kVar2;
                        AbstractC2257s.a(kVar4 != null && kVar4.f61291b.size() >= 2, "must have at least two layers");
                        c6609i.b0(iG2 + 8);
                        C c10 = C.c(c6609i, (AbstractC6726h.k) AbstractC6614a.e(kVar4));
                        AbstractC2257s.a(hVar2.f54264c == c10.f18883b, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                        int i49 = c10.f18891j;
                        int i50 = i34;
                        if (i49 != -1) {
                            AbstractC2257s.a(i50 == i49, "colorSpace must be the same for both views");
                        }
                        int i51 = c10.f18892k;
                        int i52 = i35;
                        if (i51 != -1) {
                            AbstractC2257s.a(i52 == i51, "colorRange must be the same for both views");
                        }
                        int i53 = c10.f18893l;
                        if (i53 != -1) {
                            int i54 = iL;
                            i23 = i54;
                            AbstractC2257s.a(i54 == i53, "colorTransfer must be the same for both views");
                        } else {
                            i23 = iL;
                        }
                        AbstractC2257s.a(i27 == c10.f18889h, "bitdepthLuma must be the same for both views");
                        AbstractC2257s.a(i28 == c10.f18890i, "bitdepthChroma must be the same for both views");
                        List listK2 = listK;
                        if (listK2 != null) {
                            listK2 = AbstractC2011u.t().j(listK2).j(c10.f18882a).k();
                            i24 = i50;
                        } else {
                            i24 = i50;
                            AbstractC2257s.a(false, "initializationData must be already set from hvcC atom");
                        }
                        str4 = "video/mv-hevc";
                        c6102q2 = c6102qC;
                        i18 = iIntValue;
                        i17 = i52;
                        i20 = i28;
                        iK = i24;
                        iL = i23;
                        str5 = c10.f18897p;
                        kVar = kVar4;
                        listK = listK2;
                    } else {
                        List listK3 = listK;
                        iK = i34;
                        i17 = i35;
                        int i55 = iL;
                        AbstractC6726h.k kVar5 = kVar2;
                        if (iV2 == 1986361461) {
                            l lVarK = K(c6609i, iG2, iV);
                            if (lVarK == null || lVarK.f54280a == null) {
                                i22 = i29;
                                i29 = i22;
                                c6102q2 = c6102qC;
                                listK = listK3;
                                i18 = iIntValue;
                                i20 = i28;
                                iL = i55;
                                kVar = kVar5;
                            } else if (kVar5 == null || kVar5.f61291b.size() < 2) {
                                i22 = i29;
                                if (i22 == -1) {
                                    i29 = lVarK.f54280a.f54255a.f54261c ? 5 : 4;
                                } else {
                                    i29 = i22;
                                }
                                c6102q2 = c6102qC;
                                listK = listK3;
                                i18 = iIntValue;
                                i20 = i28;
                                iL = i55;
                                kVar = kVar5;
                            } else {
                                AbstractC2257s.a(lVarK.b(), "both eye views must be marked as available");
                                AbstractC2257s.a(!lVarK.f54280a.f54255a.f54261c, "for MV-HEVC, eye_views_reversed must be set to false");
                                i22 = i29;
                                i29 = i22;
                                c6102q2 = c6102qC;
                                listK = listK3;
                                i18 = iIntValue;
                                i20 = i28;
                                iL = i55;
                                kVar = kVar5;
                            }
                        } else {
                            int i56 = i29;
                            if (iV2 == 1685480259 || iV2 == 1685485123 || iV2 == 1685485379) {
                                c6102q2 = c6102qC;
                                i18 = iIntValue;
                                i19 = i56;
                                i20 = i28;
                                float f10 = fX;
                                int i57 = i27;
                                i21 = i55;
                                int i58 = iV - 8;
                                byte[] bArr = new byte[i58];
                                c6609i.q(bArr, 0, i58);
                                if (listK3 != null) {
                                    listK = AbstractC2011u.t().j(listK3).a(bArr).k();
                                } else {
                                    AbstractC2257s.a(false, "initializationData must already be set from hvcC or avcC atom");
                                    listK = listK3;
                                }
                                c6609i.b0(iG2 + 8);
                                C6719a c6719aA = C6719a.a(c6609i);
                                if (c6719aA != null) {
                                    str4 = "video/dolby-vision";
                                    str5 = c6719aA.f61220c;
                                }
                                iK = iK;
                                i27 = i57;
                                fX = f10;
                            } else if (iV2 == 1987076931) {
                                AbstractC2257s.a(str4 == null, null);
                                String str8 = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                c6609i.b0(iG2 + 12);
                                byte bM = (byte) c6609i.M();
                                byte bM2 = (byte) c6609i.M();
                                int iM = c6609i.M();
                                i27 = iM >> 4;
                                i18 = iIntValue;
                                byte b10 = (byte) ((iM >> 1) & 7);
                                if (str8.equals("video/x-vnd.on2.vp9")) {
                                    listK3 = AbstractC6624k.k(bM, bM2, (byte) i27, b10);
                                }
                                boolean z11 = (iM & 1) != 0;
                                int iM2 = c6609i.M();
                                int iM3 = c6609i.M();
                                int iK2 = C6097l.k(iM2);
                                int i59 = z11 ? 1 : 2;
                                iL = C6097l.l(iM3);
                                str4 = str8;
                                c6102q2 = c6102qC;
                                i17 = i59;
                                kVar = kVar5;
                                iK = iK2;
                                listK = listK3;
                                i29 = i56;
                                i20 = i27;
                            } else {
                                i18 = iIntValue;
                                if (iV2 == 1635135811) {
                                    int i60 = iV - 8;
                                    byte[] bArr2 = new byte[i60];
                                    c6609i.q(bArr2, 0, i60);
                                    listK = AbstractC2011u.B(bArr2);
                                    c6609i.b0(iG2 + 8);
                                    C6097l c6097lJ = j(c6609i);
                                    int i61 = c6097lJ.f56910e;
                                    int i62 = c6097lJ.f56911f;
                                    int i63 = c6097lJ.f56906a;
                                    int i64 = c6097lJ.f56907b;
                                    iL = c6097lJ.f56908c;
                                    i27 = i61;
                                    c6102q2 = c6102qC;
                                    i20 = i62;
                                    iK = i63;
                                    i17 = i64;
                                    str4 = "video/av01";
                                    kVar = kVar5;
                                } else if (iV2 == 1668050025) {
                                    if (byteBufferA == null) {
                                        byteBufferA = a();
                                    }
                                    ByteBuffer byteBuffer = byteBufferA;
                                    byteBuffer.position(21);
                                    byteBuffer.putShort(c6609i.I());
                                    byteBuffer.putShort(c6609i.I());
                                    byteBufferA = byteBuffer;
                                    c6102q2 = c6102qC;
                                    listK = listK3;
                                    i20 = i28;
                                    kVar = kVar5;
                                    iL = i55;
                                } else if (iV2 == 1835295606) {
                                    if (byteBufferA == null) {
                                        byteBufferA = a();
                                    }
                                    ByteBuffer byteBuffer2 = byteBufferA;
                                    short sI = c6609i.I();
                                    short sI2 = c6609i.I();
                                    short sI3 = c6609i.I();
                                    short sI4 = c6609i.I();
                                    i20 = i28;
                                    short sI5 = c6609i.I();
                                    int i65 = i27;
                                    short sI6 = c6609i.I();
                                    c6102q2 = c6102qC;
                                    short sI7 = c6609i.I();
                                    short sI8 = c6609i.I();
                                    long jO = c6609i.O();
                                    long jO2 = c6609i.O();
                                    byteBuffer2.position(1);
                                    byteBuffer2.putShort(sI5);
                                    byteBuffer2.putShort(sI6);
                                    byteBuffer2.putShort(sI);
                                    byteBuffer2.putShort(sI2);
                                    byteBuffer2.putShort(sI3);
                                    byteBuffer2.putShort(sI4);
                                    byteBuffer2.putShort(sI7);
                                    byteBuffer2.putShort(sI8);
                                    byteBuffer2.putShort((short) (jO / 10000));
                                    byteBuffer2.putShort((short) (jO2 / 10000));
                                    byteBufferA = byteBuffer2;
                                    listK = listK3;
                                    kVar = kVar5;
                                    i27 = i65;
                                    iL = i55;
                                    i29 = i56;
                                    fX = fX;
                                } else {
                                    c6102q2 = c6102qC;
                                    i19 = i56;
                                    i20 = i28;
                                    float f11 = fX;
                                    int i66 = i27;
                                    if (iV2 == 1681012275) {
                                        AbstractC2257s.a(str4 == null, null);
                                        listK = listK3;
                                        kVar = kVar5;
                                        i27 = i66;
                                        str4 = str2;
                                    } else {
                                        if (iV2 == 1702061171) {
                                            AbstractC2257s.a(str4 == null, null);
                                            cVarN = n(c6609i, iG2);
                                            String str9 = cVarN.f54251a;
                                            byte[] bArr3 = cVarN.f54252b;
                                            listK = bArr3 != null ? AbstractC2011u.B(bArr3) : listK3;
                                            str4 = str9;
                                        } else {
                                            if (iV2 == 1651798644) {
                                                aVarK = k(c6609i, iG2);
                                            } else if (iV2 == 1885434736) {
                                                fX = x(c6609i, iG2);
                                                listK = listK3;
                                                kVar = kVar5;
                                                i27 = i66;
                                                iL = i55;
                                                i29 = i19;
                                                z10 = true;
                                            } else if (iV2 == 1937126244) {
                                                bArrY = y(c6609i, iG2, iV);
                                            } else if (iV2 == 1936995172) {
                                                int iM4 = c6609i.M();
                                                c6609i.c0(3);
                                                if (iM4 == 0) {
                                                    int iM5 = c6609i.M();
                                                    if (iM5 == 0) {
                                                        i19 = 0;
                                                    } else if (iM5 == 1) {
                                                        i19 = 1;
                                                    } else if (iM5 == 2) {
                                                        i19 = 2;
                                                    } else if (iM5 == 3) {
                                                        i19 = 3;
                                                    }
                                                }
                                            } else if (iV2 == 1634760259) {
                                                int i67 = iV - 12;
                                                byte[] bArr4 = new byte[i67];
                                                c6609i.b0(iG2 + 12);
                                                c6609i.q(bArr4, 0, i67);
                                                listK = AbstractC2011u.B(bArr4);
                                                C6097l c6097lH = h(new C6609I(bArr4));
                                                int i68 = c6097lH.f56910e;
                                                int i69 = c6097lH.f56911f;
                                                int i70 = c6097lH.f56906a;
                                                int i71 = c6097lH.f56907b;
                                                iL = c6097lH.f56908c;
                                                i27 = i68;
                                                i20 = i69;
                                                iK = i70;
                                                i17 = i71;
                                                str4 = "video/apv";
                                                kVar = kVar5;
                                                i29 = i19;
                                                fX = f11;
                                            } else {
                                                if (iV2 == 1668246642) {
                                                    i21 = i55;
                                                    if (iK == -1 && i21 == -1) {
                                                        int iV3 = c6609i.v();
                                                        if (iV3 == 1852009592 || iV3 == 1852009571) {
                                                            int iU3 = c6609i.U();
                                                            int iU4 = c6609i.U();
                                                            c6609i.c0(2);
                                                            boolean z12 = iV == 19 && (c6609i.M() & 128) != 0;
                                                            iK = C6097l.k(iU3);
                                                            listK = listK3;
                                                            i17 = z12 ? 1 : 2;
                                                            kVar = kVar5;
                                                            i27 = i66;
                                                            i29 = i19;
                                                            fX = f11;
                                                            iL = C6097l.l(iU4);
                                                        } else {
                                                            AbstractC6635w.i("BoxParsers", "Unsupported color type: " + AbstractC6723e.a(iV3));
                                                        }
                                                    }
                                                } else {
                                                    i21 = i55;
                                                }
                                                listK = listK3;
                                                iK = iK;
                                                i27 = i66;
                                                fX = f11;
                                            }
                                            listK = listK3;
                                        }
                                        kVar = kVar5;
                                        i27 = i66;
                                    }
                                    iL = i55;
                                    i29 = i19;
                                    fX = f11;
                                }
                                i29 = i56;
                            }
                            iL = i21;
                            kVar = kVar5;
                            i29 = i19;
                        }
                    }
                }
            }
            iG = i16 + iV;
            C6102q c6102q3 = c6102q2;
            kVar2 = kVar;
            c6102qC = c6102q3;
            i25 = i11;
            i26 = i12;
            hVar2 = hVar;
            i28 = i20;
            iIntValue = i18;
            str3 = str2;
            i34 = iK;
            i35 = i17;
        }
        C6102q c6102q4 = c6102qC;
        float f12 = fX;
        List list3 = listK;
        int i72 = i29;
        int i73 = i34;
        int i74 = i35;
        int i75 = iL;
        int i76 = i28;
        int i77 = i27;
        if (str4 == null) {
            return;
        }
        C6109x.b bVarV = new C6109x.b().i0(i13).y0(str4).U(str5).F0(iU).h0(iU2).b0(i32).a0(i33).u0(f12).x0(i14).v0(bArrY).B0(i72).k0(list3).p0(i30).q0(i31).c0(c6102q4).n0(str).V(new C6097l.b().d(i73).c(i74).e(i75).f(byteBufferA != null ? byteBufferA.array() : null).g(i77).b(i76).a());
        if (aVarK != null) {
            bVarV.S(S9.f.n(aVarK.f54240a)).t0(S9.f.n(aVarK.f54241b));
        } else if (cVarN != null) {
            bVarV.S(S9.f.n(cVarN.f54253c)).t0(S9.f.n(cVarN.f54254d));
        }
        hVar.f54263b = bVarV.P();
    }

    private static C6078J M(C6609I c6609i) {
        short sI = c6609i.I();
        c6609i.c0(2);
        String strJ = c6609i.J(sI);
        int iMax = Math.max(strJ.lastIndexOf(43), strJ.lastIndexOf(45));
        try {
            return new C6078J(new C6724f(Float.parseFloat(strJ.substring(0, iMax)), Float.parseFloat(strJ.substring(iMax, strJ.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static int N(int i10) {
        int i11 = (i10 >> 16) & 255;
        int i12 = ((i10 >> 8) & 255) - 128;
        int i13 = ((i12 * 14075) / ColorExtractionConstants.MAX_PIXEL_SAMPLES) + i11;
        int i14 = (i10 & 255) - 128;
        int i15 = (i11 - ((i14 * 3455) / ColorExtractionConstants.MAX_PIXEL_SAMPLES)) - ((i12 * 7169) / ColorExtractionConstants.MAX_PIXEL_SAMPLES);
        return a0.r(i11 + ((i14 * 17790) / ColorExtractionConstants.MAX_PIXEL_SAMPLES), 0, 255) | (a0.r(i13, 0, 255) << 16) | (a0.r(i15, 0, 255) << 8);
    }

    private static ByteBuffer a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static boolean b(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length - 1;
        return jArr[0] <= j11 && j11 < jArr[a0.r(4, 0, length)] && jArr[a0.r(jArr.length - 4, 0, length)] < j12 && j12 <= j10;
    }

    private static int c(C6609I c6609i, int i10, int i11, int i12) throws C6080L {
        int iG = c6609i.g();
        AbstractC2257s.a(iG >= i11, null);
        while (iG - i11 < i12) {
            c6609i.b0(iG);
            int iV = c6609i.v();
            AbstractC2257s.a(iV > 0, "childAtomSize must be positive");
            if (c6609i.v() == i10) {
                return iG;
            }
            iG += iV;
        }
        return -1;
    }

    private static String d(byte[] bArr, int i10, int i11) {
        AbstractC6614a.g(bArr.length == 64);
        ArrayList arrayList = new ArrayList(16);
        for (int i12 = 0; i12 < bArr.length - 3; i12 += 4) {
            arrayList.add(String.format("%06x", Integer.valueOf(N(S9.f.i(bArr[i12], bArr[i12 + 1], bArr[i12 + 2], bArr[i12 + 3])))));
        }
        return "size: " + i10 + "x" + i11 + "\npalette: " + O9.g.g(", ").d(arrayList) + "\n";
    }

    private static String e(int i10) {
        char[] cArr = {(char) (((i10 >> 10) & 31) + 96), (char) (((i10 >> 5) & 31) + 96), (char) ((i10 & 31) + 96)};
        for (int i11 = 0; i11 < 3; i11++) {
            char c10 = cArr[i11];
            if (c10 < 'a' || c10 > 'z') {
                return null;
            }
        }
        return new String(cArr);
    }

    private static int f(int i10) {
        if (i10 == 1936684398) {
            return 1;
        }
        if (i10 == 1986618469) {
            return 2;
        }
        if (i10 == 1952807028 || i10 == 1935832172 || i10 == 1937072756 || i10 == 1668047728 || i10 == 1937072752) {
            return 3;
        }
        return i10 == 1835365473 ? 5 : -1;
    }

    public static void g(C6609I c6609i) {
        int iG = c6609i.g();
        c6609i.c0(4);
        if (c6609i.v() != 1751411826) {
            iG += 4;
        }
        c6609i.b0(iG);
    }

    private static C6097l h(C6609I c6609i) {
        C6097l.b bVar = new C6097l.b();
        C6608H c6608h = new C6608H(c6609i.f());
        c6608h.p(c6609i.g() * 8);
        c6608h.s(1);
        int iH = c6608h.h(8);
        for (int i10 = 0; i10 < iH; i10++) {
            c6608h.s(1);
            int iH2 = c6608h.h(8);
            for (int i11 = 0; i11 < iH2; i11++) {
                c6608h.r(6);
                boolean zG = c6608h.g();
                c6608h.q();
                c6608h.s(11);
                c6608h.r(4);
                int iH3 = c6608h.h(4) + 8;
                bVar.g(iH3);
                bVar.b(iH3);
                c6608h.s(1);
                if (zG) {
                    int iH4 = c6608h.h(8);
                    int iH5 = c6608h.h(8);
                    c6608h.s(1);
                    bVar.d(C6097l.k(iH4)).c(c6608h.g() ? 1 : 2).e(C6097l.l(iH5));
                }
            }
        }
        return bVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03ab A[PHI: r2 r8 r9 r11 r16 r23
  0x03ab: PHI (r2v17 java.util.List) = (r2v2 java.util.List), (r2v2 java.util.List), (r2v16 java.util.List), (r2v2 java.util.List), (r2v27 java.util.List) binds: [B:240:0x045d, B:242:0x046b, B:245:0x0475, B:233:0x0421, B:206:0x037b] A[DONT_GENERATE, DONT_INLINE]
  0x03ab: PHI (r8v11 int) = (r8v8 int), (r8v8 int), (r8v8 int), (r8v8 int), (r8v16 int) binds: [B:240:0x045d, B:242:0x046b, B:245:0x0475, B:233:0x0421, B:206:0x037b] A[DONT_GENERATE, DONT_INLINE]
  0x03ab: PHI (r9v8 int) = (r9v5 int), (r9v5 int), (r9v5 int), (r9v5 int), (r9v9 int) binds: [B:240:0x045d, B:242:0x046b, B:245:0x0475, B:233:0x0421, B:206:0x037b] A[DONT_GENERATE, DONT_INLINE]
  0x03ab: PHI (r11v11 java.lang.String) = 
  (r11v9 java.lang.String)
  (r11v10 java.lang.String)
  (r11v10 java.lang.String)
  (r11v12 java.lang.String)
  (r11v9 java.lang.String)
 binds: [B:240:0x045d, B:242:0x046b, B:245:0x0475, B:233:0x0421, B:206:0x037b] A[DONT_GENERATE, DONT_INLINE]
  0x03ab: PHI (r16v3 o3.b$c) = (r16v1 o3.b$c), (r16v2 o3.b$c), (r16v2 o3.b$c), (r16v1 o3.b$c), (r16v1 o3.b$c) binds: [B:240:0x045d, B:242:0x046b, B:245:0x0475, B:233:0x0421, B:206:0x037b] A[DONT_GENERATE, DONT_INLINE]
  0x03ab: PHI (r23v2 int) = (r23v1 int), (r23v1 int), (r23v1 int), (r23v3 int), (r23v1 int) binds: [B:240:0x045d, B:242:0x046b, B:245:0x0475, B:233:0x0421, B:206:0x037b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void i(t2.C6609I r26, int r27, int r28, int r29, int r30, java.lang.String r31, boolean r32, q2.C6102q r33, o3.AbstractC5811b.h r34, int r35) throws q2.C6080L {
        /*
            Method dump skipped, instruction units count: 1296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.AbstractC5811b.i(t2.I, int, int, int, int, java.lang.String, boolean, q2.q, o3.b$h, int):void");
    }

    private static C6097l j(C6609I c6609i) {
        C6097l.b bVar = new C6097l.b();
        C6608H c6608h = new C6608H(c6609i.f());
        c6608h.p(c6609i.g() * 8);
        c6608h.s(1);
        int iH = c6608h.h(3);
        c6608h.r(6);
        boolean zG = c6608h.g();
        boolean zG2 = c6608h.g();
        if (iH == 2 && zG) {
            bVar.g(zG2 ? 12 : 10);
            bVar.b(zG2 ? 12 : 10);
        } else if (iH <= 2) {
            bVar.g(zG ? 10 : 8);
            bVar.b(zG ? 10 : 8);
        }
        c6608h.r(13);
        c6608h.q();
        int iH2 = c6608h.h(4);
        if (iH2 != 1) {
            AbstractC6635w.g("BoxParsers", "Unsupported obu_type: " + iH2);
            return bVar.a();
        }
        if (c6608h.g()) {
            AbstractC6635w.g("BoxParsers", "Unsupported obu_extension_flag");
            return bVar.a();
        }
        boolean zG3 = c6608h.g();
        c6608h.q();
        if (zG3 && c6608h.h(8) > 127) {
            AbstractC6635w.g("BoxParsers", "Excessive obu_size");
            return bVar.a();
        }
        int iH3 = c6608h.h(3);
        c6608h.q();
        if (c6608h.g()) {
            AbstractC6635w.g("BoxParsers", "Unsupported reduced_still_picture_header");
            return bVar.a();
        }
        if (c6608h.g()) {
            AbstractC6635w.g("BoxParsers", "Unsupported timing_info_present_flag");
            return bVar.a();
        }
        if (c6608h.g()) {
            AbstractC6635w.g("BoxParsers", "Unsupported initial_display_delay_present_flag");
            return bVar.a();
        }
        int iH4 = c6608h.h(5);
        boolean z10 = false;
        for (int i10 = 0; i10 <= iH4; i10++) {
            c6608h.r(12);
            if (c6608h.h(5) > 7) {
                c6608h.q();
            }
        }
        int iH5 = c6608h.h(4);
        int iH6 = c6608h.h(4);
        c6608h.r(iH5 + 1);
        c6608h.r(iH6 + 1);
        if (c6608h.g()) {
            c6608h.r(7);
        }
        c6608h.r(7);
        boolean zG4 = c6608h.g();
        if (zG4) {
            c6608h.r(2);
        }
        if ((c6608h.g() ? 2 : c6608h.h(1)) > 0 && !c6608h.g()) {
            c6608h.r(1);
        }
        if (zG4) {
            c6608h.r(3);
        }
        c6608h.r(3);
        boolean zG5 = c6608h.g();
        if (iH3 == 2 && zG5) {
            c6608h.q();
        }
        if (iH3 != 1 && c6608h.g()) {
            z10 = true;
        }
        if (c6608h.g()) {
            int iH7 = c6608h.h(8);
            int iH8 = c6608h.h(8);
            bVar.d(C6097l.k(iH7)).c(((z10 || iH7 != 1 || iH8 != 13 || c6608h.h(8) != 0) ? c6608h.h(1) : 1) != 1 ? 2 : 1).e(C6097l.l(iH8));
        }
        return bVar.a();
    }

    private static a k(C6609I c6609i, int i10) {
        c6609i.b0(i10 + 8);
        c6609i.c0(4);
        return new a(c6609i.O(), c6609i.O());
    }

    static Pair l(C6609I c6609i, int i10, int i11) throws C6080L {
        int i12 = i10 + 8;
        int i13 = -1;
        int i14 = 0;
        String strJ = null;
        Integer numValueOf = null;
        while (i12 - i10 < i11) {
            c6609i.b0(i12);
            int iV = c6609i.v();
            int iV2 = c6609i.v();
            if (iV2 == 1718775137) {
                numValueOf = Integer.valueOf(c6609i.v());
            } else if (iV2 == 1935894637) {
                c6609i.c0(4);
                strJ = c6609i.J(4);
            } else if (iV2 == 1935894633) {
                i13 = i12;
                i14 = iV;
            }
            i12 += iV;
        }
        if (!"cenc".equals(strJ) && !"cbc1".equals(strJ) && !"cens".equals(strJ) && !"cbcs".equals(strJ)) {
            return null;
        }
        AbstractC2257s.a(numValueOf != null, "frma atom is mandatory");
        AbstractC2257s.a(i13 != -1, "schi atom is mandatory");
        u uVarA = A(c6609i, i13, i14, strJ);
        AbstractC2257s.a(uVarA != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (u) a0.l(uVarA));
    }

    private static Pair m(AbstractC6723e.b bVar) {
        AbstractC6723e.c cVarE = bVar.e(1701606260);
        if (cVarE == null) {
            return null;
        }
        C6609I c6609i = cVarE.f61230b;
        c6609i.b0(8);
        int iQ = q(c6609i.v());
        int iQ2 = c6609i.Q();
        long[] jArr = new long[iQ2];
        long[] jArr2 = new long[iQ2];
        for (int i10 = 0; i10 < iQ2; i10++) {
            jArr[i10] = iQ == 1 ? c6609i.T() : c6609i.O();
            jArr2[i10] = iQ == 1 ? c6609i.F() : c6609i.v();
            if (c6609i.I() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            c6609i.c0(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static c n(C6609I c6609i, int i10) {
        c6609i.b0(i10 + 12);
        c6609i.c0(1);
        o(c6609i);
        c6609i.c0(2);
        int iM = c6609i.M();
        if ((iM & 128) != 0) {
            c6609i.c0(2);
        }
        if ((iM & 64) != 0) {
            c6609i.c0(c6609i.M());
        }
        if ((iM & 32) != 0) {
            c6609i.c0(2);
        }
        c6609i.c0(1);
        o(c6609i);
        String strH = AbstractC6079K.h(c6609i.M());
        if ("audio/mpeg".equals(strH) || "audio/vnd.dts".equals(strH) || "audio/vnd.dts.hd".equals(strH)) {
            return new c(strH, null, -1L, -1L);
        }
        c6609i.c0(4);
        long jO = c6609i.O();
        long jO2 = c6609i.O();
        c6609i.c0(1);
        int iO = o(c6609i);
        long j10 = jO2;
        byte[] bArr = new byte[iO];
        c6609i.q(bArr, 0, iO);
        if (j10 <= 0) {
            j10 = -1;
        }
        return new c(strH, bArr, j10, jO > 0 ? jO : -1L);
    }

    private static int o(C6609I c6609i) {
        int iM = c6609i.M();
        int i10 = iM & 127;
        while ((iM & 128) == 128) {
            iM = c6609i.M();
            i10 = (i10 << 7) | (iM & 127);
        }
        return i10;
    }

    public static int p(int i10) {
        return i10 & 16777215;
    }

    public static int q(int i10) {
        return (i10 >> 24) & 255;
    }

    private static int r(C6609I c6609i) {
        c6609i.b0(16);
        return c6609i.v();
    }

    private static C6078J s(C6609I c6609i, int i10) {
        c6609i.c0(8);
        ArrayList arrayList = new ArrayList();
        while (c6609i.g() < i10) {
            C6078J.a aVarD = o3.j.d(c6609i);
            if (aVarD != null) {
                arrayList.add(aVarD);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C6078J(arrayList);
    }

    private static e t(C6609I c6609i) {
        long j10;
        c6609i.b0(8);
        int iQ = q(c6609i.v());
        c6609i.c0(iQ == 0 ? 8 : 16);
        long jO = c6609i.O();
        int iG = c6609i.g();
        int i10 = iQ == 0 ? 4 : 8;
        int i11 = 0;
        while (true) {
            j10 = -9223372036854775807L;
            if (i11 >= i10) {
                c6609i.c0(i10);
                break;
            }
            if (c6609i.f()[iG + i11] != -1) {
                long jO2 = iQ == 0 ? c6609i.O() : c6609i.T();
                if (jO2 != 0) {
                    long jM1 = a0.m1(jO2, 1000000L, jO);
                    jO = jO;
                    j10 = jM1;
                }
            } else {
                i11++;
            }
        }
        return new e(jO, j10, e(c6609i.U()));
    }

    public static C6078J u(AbstractC6723e.b bVar) {
        AbstractC6723e.c cVarE = bVar.e(1751411826);
        AbstractC6723e.c cVarE2 = bVar.e(1801812339);
        AbstractC6723e.c cVarE3 = bVar.e(1768715124);
        if (cVarE == null || cVarE2 == null || cVarE3 == null || r(cVarE.f61230b) != 1835299937) {
            return null;
        }
        C6609I c6609i = cVarE2.f61230b;
        c6609i.b0(12);
        int iV = c6609i.v();
        String[] strArr = new String[iV];
        for (int i10 = 0; i10 < iV; i10++) {
            int iV2 = c6609i.v();
            c6609i.c0(4);
            strArr[i10] = c6609i.J(iV2 - 8);
        }
        C6609I c6609i2 = cVarE3.f61230b;
        c6609i2.b0(8);
        ArrayList arrayList = new ArrayList();
        while (c6609i2.a() > 8) {
            int iG = c6609i2.g();
            int iV3 = c6609i2.v();
            int iV4 = c6609i2.v() - 1;
            if (iV4 < 0 || iV4 >= iV) {
                AbstractC6635w.i("BoxParsers", "Skipped metadata with unknown key index: " + iV4);
            } else {
                C6721c c6721cI = o3.j.i(c6609i2, iG + iV3, strArr[iV4]);
                if (c6721cI != null) {
                    arrayList.add(c6721cI);
                }
            }
            c6609i2.b0(iG + iV3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C6078J(arrayList);
    }

    private static void v(C6609I c6609i, int i10, int i11, int i12, h hVar) {
        c6609i.b0(i11 + 16);
        if (i10 == 1835365492) {
            c6609i.G();
            String strG = c6609i.G();
            if (strG != null) {
                hVar.f54263b = new C6109x.b().i0(i12).y0(strG).P();
            }
        }
    }

    public static C6725g w(C6609I c6609i) {
        long jF;
        long jF2;
        c6609i.b0(8);
        if (q(c6609i.v()) == 0) {
            jF = c6609i.O();
            jF2 = c6609i.O();
        } else {
            jF = c6609i.F();
            jF2 = c6609i.F();
        }
        return new C6725g(jF, jF2, c6609i.O());
    }

    private static float x(C6609I c6609i, int i10) {
        c6609i.b0(i10 + 8);
        return c6609i.Q() / c6609i.Q();
    }

    private static byte[] y(C6609I c6609i, int i10, int i11) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            c6609i.b0(i12);
            int iV = c6609i.v();
            if (c6609i.v() == 1886547818) {
                return Arrays.copyOfRange(c6609i.f(), i12, iV + i12);
            }
            i12 += iV;
        }
        return null;
    }

    private static Pair z(C6609I c6609i, int i10, int i11) throws C6080L {
        Pair pairL;
        int iG = c6609i.g();
        while (iG - i10 < i11) {
            c6609i.b0(iG);
            int iV = c6609i.v();
            AbstractC2257s.a(iV > 0, "childAtomSize must be positive");
            if (c6609i.v() == 1936289382 && (pairL = l(c6609i, iG, iV)) != null) {
                return pairL;
            }
            iG += iV;
        }
        return null;
    }
}
