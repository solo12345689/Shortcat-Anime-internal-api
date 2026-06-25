package u2;

import P9.AbstractC2011u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import q2.AbstractC6079K;
import q2.C6097l;
import q2.C6109x;
import t2.AbstractC6614a;
import t2.AbstractC6624k;

/* JADX INFO: renamed from: u2.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6726h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f61236a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f61237b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f61238c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int[] f61239d = new int[10];

    /* JADX INFO: renamed from: u2.h$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f61240a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f61241b;

        public a(int i10, int i11) {
            this.f61240a = i10;
            this.f61241b = i11;
        }
    }

    /* JADX INFO: renamed from: u2.h$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f61242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f61243b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f61244c;

        public b(int i10, int i11, int i12) {
            this.f61242a = i10;
            this.f61243b = i11;
            this.f61244c = i12;
        }
    }

    /* JADX INFO: renamed from: u2.h$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f61245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f61246b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f61247c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f61248d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f61249e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f61250f;

        public c(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
            this.f61245a = i10;
            this.f61246b = z10;
            this.f61247c = i11;
            this.f61248d = i12;
            this.f61249e = iArr;
            this.f61250f = i13;
        }
    }

    /* JADX INFO: renamed from: u2.h$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractC2011u f61251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f61252b;

        public d(List list, int[] iArr) {
            this.f61251a = AbstractC2011u.w(list);
            this.f61252b = iArr;
        }
    }

    /* JADX INFO: renamed from: u2.h$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f61253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f61254b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f61255c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f61256d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f61257e;

        public e(int i10, int i11, int i12, int i13, int i14) {
            this.f61253a = i10;
            this.f61254b = i11;
            this.f61255c = i12;
            this.f61256d = i13;
            this.f61257e = i14;
        }
    }

    /* JADX INFO: renamed from: u2.h$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractC2011u f61258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f61259b;

        public f(List list, int[] iArr) {
            this.f61258a = AbstractC2011u.w(list);
            this.f61259b = iArr;
        }
    }

    /* JADX INFO: renamed from: u2.h$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f61260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f61261b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f61262c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f61263d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f61264e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f61265f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f61266g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f61267h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f61268i;

        public g(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            this.f61260a = i10;
            this.f61261b = i11;
            this.f61262c = i12;
            this.f61263d = i13;
            this.f61264e = i14;
            this.f61265f = i15;
            this.f61266g = i16;
            this.f61267h = i17;
            this.f61268i = i18;
        }
    }

    /* JADX INFO: renamed from: u2.h$h, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0914h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f61269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f61270b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f61271c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f61272d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f61273e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f61274f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f61275g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f61276h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f61277i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f61278j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f61279k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final float f61280l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f61281m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f61282n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f61283o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f61284p;

        public C0914h(b bVar, int i10, c cVar, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f10, int i19, int i20, int i21, int i22) {
            this.f61269a = bVar;
            this.f61270b = i10;
            this.f61271c = cVar;
            this.f61272d = i11;
            this.f61273e = i12;
            this.f61274f = i13;
            this.f61275g = i14;
            this.f61276h = i15;
            this.f61277i = i16;
            this.f61280l = f10;
            this.f61281m = i19;
            this.f61282n = i20;
            this.f61283o = i21;
            this.f61284p = i22;
            this.f61278j = i17;
            this.f61279k = i18;
        }
    }

    /* JADX INFO: renamed from: u2.h$i */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f61285a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f61286b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f61287c;

        public i(int i10, int i11, int i12) {
            this.f61285a = i10;
            this.f61286b = i11;
            this.f61287c = i12;
        }
    }

    /* JADX INFO: renamed from: u2.h$j */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractC2011u f61288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f61289b;

        public j(List list, int[] iArr) {
            this.f61288a = AbstractC2011u.w(list);
            this.f61289b = iArr;
        }
    }

    /* JADX INFO: renamed from: u2.h$k */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f61290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AbstractC2011u f61291b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f61292c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final f f61293d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final j f61294e;

        public k(b bVar, List list, d dVar, f fVar, j jVar) {
            this.f61290a = bVar;
            this.f61291b = list != null ? AbstractC2011u.w(list) : AbstractC2011u.A();
            this.f61292c = dVar;
            this.f61293d = fVar;
            this.f61294e = jVar;
        }
    }

    /* JADX INFO: renamed from: u2.h$l */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f61295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f61296b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f61297c;

        public l(int i10, int i11, boolean z10) {
            this.f61295a = i10;
            this.f61296b = i11;
            this.f61297c = z10;
        }
    }

    /* JADX INFO: renamed from: u2.h$m */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f61298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f61299b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f61300c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f61301d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f61302e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f61303f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f61304g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f61305h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f61306i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f61307j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f61308k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f61309l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f61310m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f61311n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f61312o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final boolean f61313p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f61314q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f61315r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f61316s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f61317t;

        public m(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10, int i17, int i18, boolean z10, boolean z11, int i19, int i20, int i21, boolean z12, int i22, int i23, int i24, int i25) {
            this.f61298a = i10;
            this.f61299b = i11;
            this.f61300c = i12;
            this.f61301d = i13;
            this.f61302e = i14;
            this.f61303f = i15;
            this.f61304g = i16;
            this.f61305h = f10;
            this.f61306i = i17;
            this.f61307j = i18;
            this.f61308k = z10;
            this.f61309l = z11;
            this.f61310m = i19;
            this.f61311n = i20;
            this.f61312o = i21;
            this.f61313p = z12;
            this.f61314q = i22;
            this.f61315r = i23;
            this.f61316s = i24;
            this.f61317t = i25;
        }
    }

    public static l A(byte[] bArr, int i10, int i11) {
        return B(bArr, i10 + 1, i11);
    }

    public static l B(byte[] bArr, int i10, int i11) {
        C6728j c6728j = new C6728j(bArr, i10, i11);
        int i12 = c6728j.i();
        int i13 = c6728j.i();
        c6728j.l();
        return new l(i12, i13, c6728j.e());
    }

    public static m C(byte[] bArr, int i10, int i11) {
        return D(bArr, i10 + 1, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x021f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static u2.AbstractC6726h.m D(byte[] r32, int r33, int r34) {
        /*
            Method dump skipped, instruction units count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.AbstractC6726h.D(byte[], int, int):u2.h$m");
    }

    private static void E(C6728j c6728j, int i10, int[] iArr, int[] iArr2, boolean[][] zArr) {
        for (int i11 = 1; i11 < i10; i11++) {
            boolean zE = c6728j.e();
            int i12 = 0;
            while (i12 < iArr[i11]) {
                if ((i12 <= 0 || !zE) ? i12 == 0 : c6728j.e()) {
                    for (int i13 = 0; i13 < iArr2[i11]; i13++) {
                        if (zArr[i11][i13]) {
                            c6728j.i();
                        }
                    }
                    c6728j.i();
                    c6728j.i();
                }
                i12++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    private static void F(C6728j c6728j, boolean z10, int i10) {
        ?? r92;
        ?? r12;
        boolean zE;
        boolean zE2;
        if (z10) {
            boolean zE3 = c6728j.e();
            boolean zE4 = c6728j.e();
            if (zE3 || zE4) {
                zE = c6728j.e();
                if (zE) {
                    c6728j.m(19);
                }
                c6728j.m(8);
                if (zE) {
                    c6728j.m(4);
                }
                c6728j.m(15);
                r12 = zE4;
                r92 = zE3;
            } else {
                zE = false;
                r12 = zE4;
                r92 = zE3;
            }
        } else {
            r92 = 0;
            r12 = 0;
            zE = false;
        }
        for (int i11 = 0; i11 <= i10; i11++) {
            boolean zE5 = c6728j.e();
            if (!zE5) {
                zE5 = c6728j.e();
            }
            if (zE5) {
                c6728j.i();
                zE2 = false;
            } else {
                zE2 = c6728j.e();
            }
            int i12 = !zE2 ? c6728j.i() : 0;
            int i13 = r92 + r12;
            for (int i14 = 0; i14 < i13; i14++) {
                for (int i15 = 0; i15 <= i12; i15++) {
                    c6728j.i();
                    c6728j.i();
                    if (zE) {
                        c6728j.i();
                        c6728j.i();
                    }
                    c6728j.l();
                }
            }
        }
    }

    private static void G(C6728j c6728j) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (c6728j.e()) {
                    int iMin = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        c6728j.h();
                    }
                    for (int i13 = 0; i13 < iMin; i13++) {
                        c6728j.h();
                    }
                } else {
                    c6728j.i();
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }

    private static void H(C6728j c6728j) {
        int i10 = c6728j.i();
        int[] iArr = new int[0];
        int[] iArrCopyOf = new int[0];
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < i10; i13++) {
            if (i13 == 0 || !c6728j.e()) {
                int i14 = c6728j.i();
                int i15 = c6728j.i();
                int[] iArr2 = new int[i14];
                int i16 = 0;
                while (i16 < i14) {
                    iArr2[i16] = (i16 > 0 ? iArr2[i16 - 1] : 0) - (c6728j.i() + 1);
                    c6728j.l();
                    i16++;
                }
                int[] iArr3 = new int[i15];
                int i17 = 0;
                while (i17 < i15) {
                    iArr3[i17] = (i17 > 0 ? iArr3[i17 - 1] : 0) + c6728j.i() + 1;
                    c6728j.l();
                    i17++;
                }
                i11 = i14;
                iArr = iArr2;
                i12 = i15;
                iArrCopyOf = iArr3;
            } else {
                int i18 = i11 + i12;
                int i19 = (1 - ((c6728j.e() ? 1 : 0) * 2)) * (c6728j.i() + 1);
                int i20 = i18 + 1;
                boolean[] zArr = new boolean[i20];
                for (int i21 = 0; i21 <= i18; i21++) {
                    if (c6728j.e()) {
                        zArr[i21] = true;
                    } else {
                        zArr[i21] = c6728j.e();
                    }
                }
                int[] iArr4 = new int[i20];
                int[] iArr5 = new int[i20];
                int i22 = 0;
                for (int i23 = i12 - 1; i23 >= 0; i23--) {
                    int i24 = iArrCopyOf[i23] + i19;
                    if (i24 < 0 && zArr[i11 + i23]) {
                        iArr4[i22] = i24;
                        i22++;
                    }
                }
                if (i19 < 0 && zArr[i18]) {
                    iArr4[i22] = i19;
                    i22++;
                }
                for (int i25 = 0; i25 < i11; i25++) {
                    int i26 = iArr[i25] + i19;
                    if (i26 < 0 && zArr[i25]) {
                        iArr4[i22] = i26;
                        i22++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr4, i22);
                int i27 = 0;
                for (int i28 = i11 - 1; i28 >= 0; i28--) {
                    int i29 = iArr[i28] + i19;
                    if (i29 > 0 && zArr[i28]) {
                        iArr5[i27] = i29;
                        i27++;
                    }
                }
                if (i19 > 0 && zArr[i18]) {
                    iArr5[i27] = i19;
                    i27++;
                }
                for (int i30 = 0; i30 < i12; i30++) {
                    int i31 = iArrCopyOf[i30] + i19;
                    if (i31 > 0 && zArr[i11 + i30]) {
                        iArr5[i27] = i31;
                        i27++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr5, i27);
                iArr = iArrCopyOf2;
                i11 = i22;
                i12 = i27;
            }
        }
    }

    private static void I(C6728j c6728j) {
        int i10 = c6728j.i() + 1;
        c6728j.m(8);
        for (int i11 = 0; i11 < i10; i11++) {
            c6728j.i();
            c6728j.i();
            c6728j.l();
        }
        c6728j.m(20);
    }

    private static void J(C6728j c6728j, int i10) {
        int iH = 8;
        int i11 = 8;
        for (int i12 = 0; i12 < i10; i12++) {
            if (iH != 0) {
                iH = ((c6728j.h() + i11) + IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
            }
            if (iH != 0) {
                i11 = iH;
            }
        }
    }

    private static void K(C6728j c6728j, int i10, boolean[][] zArr) {
        int i11 = c6728j.i() + 2;
        if (c6728j.e()) {
            c6728j.m(i11);
        } else {
            for (int i12 = 1; i12 < i10; i12++) {
                for (int i13 = 0; i13 < i12; i13++) {
                    if (zArr[i12][i13]) {
                        c6728j.m(i11);
                    }
                }
            }
        }
        int i14 = c6728j.i();
        for (int i15 = 1; i15 <= i14; i15++) {
            c6728j.m(8);
        }
    }

    public static int L(byte[] bArr, int i10) {
        int i11;
        synchronized (f61238c) {
            int iG = 0;
            int i12 = 0;
            while (iG < i10) {
                try {
                    iG = g(bArr, iG, i10);
                    if (iG < i10) {
                        int[] iArr = f61239d;
                        if (iArr.length <= i12) {
                            f61239d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f61239d[i12] = iG;
                        iG += 3;
                        i12++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            i11 = i10 - i12;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = f61239d[i15] - i14;
                System.arraycopy(bArr, i14, bArr, i13, i16);
                int i17 = i13 + i16;
                int i18 = i17 + 1;
                bArr[i17] = 0;
                i13 = i17 + 2;
                bArr[i18] = 0;
                i14 += i16 + 3;
            }
            System.arraycopy(bArr, i14, bArr, i13, i11 - i13);
        }
        return i11;
    }

    private static int a(int i10, int i11, int i12, int i13) {
        return i10 - ((i11 == 1 ? 2 : 1) * (i12 + i13));
    }

    private static int b(int i10, int i11, int i12, int i13) {
        int i14 = 2;
        if (i11 != 1 && i11 != 2) {
            i14 = 1;
        }
        return i10 - (i14 * (i12 + i13));
    }

    public static void c(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    private static String d(C6728j c6728j) {
        c6728j.m(4);
        int iF = c6728j.f(3);
        c6728j.l();
        c cVarQ = q(c6728j, true, iF, null);
        return AbstractC6624k.h(cVarQ.f61245a, cVarQ.f61246b, cVarQ.f61247c, cVarQ.f61248d, cVarQ.f61249e, cVarQ.f61250f);
    }

    public static int e(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        AbstractC6614a.g(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            c(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            c(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            c(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    c(zArr);
                    return i15;
                }
                i14 -= 2;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    private static AbstractC2011u f(byte[] bArr) {
        boolean[] zArr = new boolean[3];
        AbstractC2011u.a aVarT = AbstractC2011u.t();
        int i10 = 0;
        while (i10 < bArr.length) {
            int iE = e(bArr, i10, bArr.length, zArr);
            if (iE != bArr.length) {
                aVarT.a(Integer.valueOf(iE));
            }
            i10 = iE + 3;
        }
        return aVarT.k();
    }

    private static int g(byte[] bArr, int i10, int i11) {
        while (i10 < i11 - 2) {
            if (bArr[i10] == 0 && bArr[i10 + 1] == 0 && bArr[i10 + 2] == 3) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static String h(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            byte[] bArr = (byte[]) list.get(i10);
            int length = bArr.length;
            if (length > 3) {
                AbstractC2011u abstractC2011uF = f(bArr);
                for (int i11 = 0; i11 < abstractC2011uF.size(); i11++) {
                    if (((Integer) abstractC2011uF.get(i11)).intValue() + 3 < length) {
                        C6728j c6728j = new C6728j(bArr, ((Integer) abstractC2011uF.get(i11)).intValue() + 3, length);
                        b bVarP = p(c6728j);
                        if (bVarP.f61242a == 33 && bVarP.f61243b == 0) {
                            return d(c6728j);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static int i(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 126) >> 1;
    }

    public static int j(byte[] bArr, int i10) {
        return bArr[i10 + 3] & 31;
    }

    public static boolean k(byte[] bArr, int i10, int i11, C6109x c6109x) {
        if (Objects.equals(c6109x.f57022o, "video/avc")) {
            return l(bArr[i10]);
        }
        if (Objects.equals(c6109x.f57022o, "video/hevc")) {
            return m(bArr, i10, i11, c6109x);
        }
        return true;
    }

    public static boolean l(byte b10) {
        if (((b10 & 96) >> 5) != 0) {
            return true;
        }
        int i10 = b10 & 31;
        return (i10 == 1 || i10 == 9 || i10 == 14) ? false : true;
    }

    private static boolean m(byte[] bArr, int i10, int i11, C6109x c6109x) {
        b bVarP = p(new C6728j(bArr, i10, i11 + i10));
        int i12 = bVarP.f61242a;
        if (i12 == 35) {
            return false;
        }
        return (i12 <= 14 && i12 % 2 == 0 && bVarP.f61244c == c6109x.f56996F - 1) ? false : true;
    }

    public static boolean n(C6109x c6109x, byte b10) {
        return ((Objects.equals(c6109x.f57022o, "video/avc") || AbstractC6079K.b(c6109x.f57018k, "video/avc")) && (b10 & 31) == 6) || ((Objects.equals(c6109x.f57022o, "video/hevc") || AbstractC6079K.b(c6109x.f57018k, "video/hevc")) && ((b10 & 126) >> 1) == 39);
    }

    public static int o(C6109x c6109x) {
        if (Objects.equals(c6109x.f57022o, "video/avc")) {
            return 1;
        }
        return (Objects.equals(c6109x.f57022o, "video/hevc") || AbstractC6079K.b(c6109x.f57018k, "video/hevc")) ? 2 : 0;
    }

    private static b p(C6728j c6728j) {
        c6728j.l();
        return new b(c6728j.f(6), c6728j.f(6), c6728j.f(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static u2.AbstractC6726h.c q(u2.C6728j r19, boolean r20, int r21, u2.AbstractC6726h.c r22) {
        /*
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 2
            r6 = 8
            r7 = 0
            if (r20 == 0) goto L42
            int r2 = r0.f(r5)
            boolean r8 = r0.e()
            r9 = 5
            int r9 = r0.f(r9)
            r10 = r7
            r11 = r10
        L1e:
            r12 = 32
            if (r10 >= r12) goto L2e
            boolean r12 = r0.e()
            if (r12 == 0) goto L2b
            r12 = 1
            int r12 = r12 << r10
            r11 = r11 | r12
        L2b:
            int r10 = r10 + 1
            goto L1e
        L2e:
            r10 = r7
        L2f:
            if (r10 >= r3) goto L3a
            int r12 = r0.f(r6)
            r4[r10] = r12
            int r10 = r10 + 1
            goto L2f
        L3a:
            r13 = r2
        L3b:
            r17 = r4
            r14 = r8
            r15 = r9
            r16 = r11
            goto L57
        L42:
            if (r2 == 0) goto L50
            int r3 = r2.f61245a
            boolean r8 = r2.f61246b
            int r9 = r2.f61247c
            int r11 = r2.f61248d
            int[] r4 = r2.f61249e
            r13 = r3
            goto L3b
        L50:
            r17 = r4
            r13 = r7
            r14 = r13
            r15 = r14
            r16 = r15
        L57:
            int r18 = r0.f(r6)
            r2 = r7
        L5c:
            if (r7 >= r1) goto L71
            boolean r3 = r0.e()
            if (r3 == 0) goto L66
            int r2 = r2 + 88
        L66:
            boolean r3 = r0.e()
            if (r3 == 0) goto L6e
            int r2 = r2 + 8
        L6e:
            int r7 = r7 + 1
            goto L5c
        L71:
            r0.m(r2)
            if (r1 <= 0) goto L7b
            int r6 = r6 - r1
            int r6 = r6 * r5
            r0.m(r6)
        L7b:
            u2.h$c r12 = new u2.h$c
            r12.<init>(r13, r14, r15, r16, r17, r18)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.AbstractC6726h.q(u2.j, boolean, int, u2.h$c):u2.h$c");
    }

    private static e r(C6728j c6728j) {
        int i10;
        int i11;
        int iF;
        int iF2 = c6728j.f(16);
        int iF3 = c6728j.f(16);
        if (c6728j.e()) {
            int iF4 = c6728j.f(2);
            if (iF4 == 3) {
                c6728j.l();
            }
            int iF5 = c6728j.f(4);
            iF = c6728j.f(4);
            i11 = iF5;
            i10 = iF4;
        } else {
            i10 = 0;
            i11 = 0;
            iF = 0;
        }
        if (c6728j.e()) {
            int i12 = c6728j.i();
            int i13 = c6728j.i();
            int i14 = c6728j.i();
            int i15 = c6728j.i();
            iF2 = b(iF2, i10, i12, i13);
            iF3 = a(iF3, i10, i14, i15);
        }
        return new e(i10, i11, iF, iF2, iF3);
    }

    private static f s(C6728j c6728j, int i10) {
        int i11 = c6728j.i();
        int i12 = i11 + 1;
        AbstractC2011u.a aVarU = AbstractC2011u.u(i12);
        int[] iArr = new int[i10];
        for (int i13 = 0; i13 < i12; i13++) {
            aVarU.a(r(c6728j));
        }
        int i14 = 1;
        if (i12 <= 1 || !c6728j.e()) {
            while (i14 < i10) {
                iArr[i14] = Math.min(i14, i11);
                i14++;
            }
        } else {
            int iD = R9.b.d(i12, RoundingMode.CEILING);
            while (i14 < i10) {
                iArr[i14] = c6728j.f(iD);
                i14++;
            }
        }
        return new f(aVarU.k(), iArr);
    }

    public static g t(byte[] bArr, int i10, int i11) {
        byte b10;
        int i12 = i10 + 2;
        int i13 = i11 - 1;
        while (true) {
            b10 = bArr[i13];
            if (b10 != 0 || i13 <= i12) {
                break;
            }
            i13--;
        }
        if (b10 != 0 && i13 > i12) {
            C6728j c6728j = new C6728j(bArr, i12, i13 + 1);
            while (c6728j.c(16)) {
                int iF = c6728j.f(8);
                int i14 = 0;
                while (iF == 255) {
                    i14 += 255;
                    iF = c6728j.f(8);
                }
                int i15 = i14 + iF;
                int iF2 = c6728j.f(8);
                int i16 = 0;
                while (iF2 == 255) {
                    i16 += 255;
                    iF2 = c6728j.f(8);
                }
                int i17 = i16 + iF2;
                if (i17 == 0 || !c6728j.c(i17)) {
                    break;
                }
                if (i15 == 176) {
                    int i18 = c6728j.i();
                    boolean zE = c6728j.e();
                    int i19 = zE ? c6728j.i() : 0;
                    int i20 = c6728j.i();
                    int i21 = -1;
                    int i22 = -1;
                    int iF3 = -1;
                    int iF4 = -1;
                    int i23 = -1;
                    int iF5 = -1;
                    for (int i24 = 0; i24 <= i20; i24++) {
                        i21 = c6728j.i();
                        i22 = c6728j.i();
                        iF3 = c6728j.f(6);
                        if (iF3 == 63) {
                            return null;
                        }
                        iF4 = c6728j.f(iF3 == 0 ? Math.max(0, i18 - 30) : Math.max(0, (iF3 + i18) - 31));
                        if (zE) {
                            int iF6 = c6728j.f(6);
                            if (iF6 == 63) {
                                return null;
                            }
                            i23 = iF6;
                            iF5 = c6728j.f(iF6 == 0 ? Math.max(0, i19 - 30) : Math.max(0, (iF6 + i19) - 31));
                        }
                        if (c6728j.e()) {
                            c6728j.m(10);
                        }
                    }
                    return new g(i18, i19, i20 + 1, i21, i22, iF3, iF4, i23, iF5);
                }
                c6728j.m(i17 * 8);
            }
        }
        return null;
    }

    public static C0914h u(byte[] bArr, int i10, int i11, k kVar) {
        return v(bArr, i10 + 2, i11, p(new C6728j(bArr, i10, i11)), kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static u2.AbstractC6726h.C0914h v(byte[] r20, int r21, int r22, u2.AbstractC6726h.b r23, u2.AbstractC6726h.k r24) {
        /*
            Method dump skipped, instruction units count: 632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.AbstractC6726h.v(byte[], int, int, u2.h$b, u2.h$k):u2.h$h");
    }

    private static i w(C6728j c6728j) {
        c6728j.m(3);
        int i10 = c6728j.e() ? 1 : 2;
        int iK = C6097l.k(c6728j.f(8));
        int iL = C6097l.l(c6728j.f(8));
        c6728j.m(8);
        return new i(iK, i10, iL);
    }

    private static j x(C6728j c6728j, int i10, int i11, int[] iArr) {
        if (!c6728j.e() ? c6728j.e() : true) {
            c6728j.l();
        }
        boolean zE = c6728j.e();
        boolean zE2 = c6728j.e();
        if (zE || zE2) {
            for (int i12 = 0; i12 < i11; i12++) {
                for (int i13 = 0; i13 < iArr[i12]; i13++) {
                    boolean zE3 = zE ? c6728j.e() : false;
                    boolean zE4 = zE2 ? c6728j.e() : false;
                    if (zE3) {
                        c6728j.m(32);
                    }
                    if (zE4) {
                        c6728j.m(18);
                    }
                }
            }
        }
        boolean zE5 = c6728j.e();
        int iF = zE5 ? c6728j.f(4) + 1 : i10;
        AbstractC2011u.a aVarU = AbstractC2011u.u(iF);
        int[] iArr2 = new int[i10];
        for (int i14 = 0; i14 < iF; i14++) {
            aVarU.a(w(c6728j));
        }
        if (zE5 && iF > 1) {
            for (int i15 = 0; i15 < i10; i15++) {
                iArr2[i15] = c6728j.f(4);
            }
        }
        return new j(aVarU.k(), iArr2);
    }

    public static k y(byte[] bArr, int i10, int i11) {
        C6728j c6728j = new C6728j(bArr, i10, i11);
        return z(c6728j, p(c6728j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static k z(C6728j c6728j, b bVar) {
        int[] iArr;
        int i10;
        int i11;
        int[] iArr2;
        j jVarX;
        int i12;
        int i13;
        int i14;
        int[] iArr3;
        AbstractC2011u abstractC2011u;
        int i15;
        boolean[][] zArr;
        int[] iArr4;
        int i16;
        int i17;
        c6728j.m(4);
        boolean zE = c6728j.e();
        boolean zE2 = c6728j.e();
        int iF = c6728j.f(6);
        int i18 = iF + 1;
        int iF2 = c6728j.f(3);
        c6728j.m(17);
        c cVarQ = q(c6728j, true, iF2, null);
        boolean z10 = false;
        for (int i19 = c6728j.e() ? 0 : iF2; i19 <= iF2; i19++) {
            c6728j.i();
            c6728j.i();
            c6728j.i();
        }
        int iF3 = c6728j.f(6);
        int i20 = c6728j.i() + 1;
        d dVar = new d(AbstractC2011u.B(cVarQ), new int[1]);
        byte b10 = i18 >= 2 && i20 >= 2;
        byte b11 = zE && zE2;
        int i21 = iF3 + 1;
        byte b12 = i21 >= i18;
        if (b10 != true || b11 != true || b12 != true) {
            return new k(bVar, null, dVar, null, null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, i20, i21);
        int i22 = 1;
        int[] iArr6 = new int[i20];
        int[] iArr7 = new int[i20];
        iArr5[0][0] = 0;
        iArr6[0] = 1;
        iArr7[0] = 0;
        for (int i23 = 1; i23 < i20; i23++) {
            int i24 = 0;
            for (int i25 = 0; i25 <= iF3; i25++) {
                if (c6728j.e()) {
                    iArr5[i23][i24] = i25;
                    iArr7[i23] = i25;
                    i24++;
                }
                iArr6[i23] = i24;
            }
        }
        if (c6728j.e()) {
            c6728j.m(64);
            if (c6728j.e()) {
                c6728j.i();
            }
            int i26 = c6728j.i();
            int i27 = 0;
            while (i27 < i26) {
                c6728j.i();
                if (i27 == 0 || c6728j.e()) {
                    z10 = true;
                }
                F(c6728j, z10, iF2);
                i27++;
                z10 = false;
            }
        }
        if (!c6728j.e()) {
            return new k(bVar, null, dVar, null, null);
        }
        c6728j.b();
        c cVarQ2 = q(c6728j, false, iF2, cVarQ);
        boolean zE3 = c6728j.e();
        int i28 = 6;
        boolean[] zArr2 = new boolean[16];
        int i29 = 0;
        for (int i30 = 0; i30 < 16; i30++) {
            boolean zE4 = c6728j.e();
            zArr2[i30] = zE4;
            if (zE4) {
                i29++;
            }
        }
        if (i29 == 0 || !zArr2[1]) {
            return new k(bVar, null, dVar, null, null);
        }
        int[] iArr8 = new int[i29];
        for (int i31 = 0; i31 < i29 - (zE3 ? 1 : 0); i31++) {
            iArr8[i31] = c6728j.f(3);
        }
        int[] iArr9 = new int[i29 + 1];
        if (zE3) {
            int i32 = 1;
            while (i32 < i29) {
                int[] iArr10 = iArr9;
                for (int i33 = 0; i33 < i32; i33++) {
                    iArr10[i32] = iArr10[i32] + iArr8[i33] + 1;
                }
                i32++;
                iArr9 = iArr10;
            }
            iArr = iArr9;
            iArr[i29] = 6;
        } else {
            iArr = iArr9;
        }
        int[][] iArr11 = (int[][]) Array.newInstance((Class<?>) cls, i18, i29);
        int[] iArr12 = new int[i18];
        iArr12[0] = 0;
        boolean zE5 = c6728j.e();
        int i34 = 1;
        while (i34 < i18) {
            if (zE5) {
                i17 = i34;
                iArr12[i17] = c6728j.f(i28);
            } else {
                i17 = i34;
                iArr12[i17] = i17;
            }
            if (zE3) {
                for (int i35 = 0; i35 < i29; i35++) {
                    iArr11[i17][i35] = (iArr12[i17] & ((1 << iArr[r33]) - 1)) >> iArr[i35];
                }
            } else {
                int i36 = 0;
                while (i36 < i29) {
                    int i37 = i36;
                    iArr11[i17][i37] = c6728j.f(iArr8[i36] + 1);
                    i36 = i37 + 1;
                }
            }
            i34 = i17 + 1;
            i28 = 6;
        }
        int[] iArr13 = new int[i21];
        int i38 = 1;
        int i39 = 0;
        while (i39 < i18) {
            iArr13[iArr12[i39]] = -1;
            int[] iArr14 = iArr13;
            int i40 = 0;
            int i41 = 0;
            while (i40 < 16) {
                if (zArr2[i40]) {
                    if (i40 == i22) {
                        iArr14[iArr12[i39]] = iArr11[i39][i41];
                    }
                    i41++;
                }
                i40++;
                i22 = 1;
            }
            if (i39 > 0) {
                int i42 = 0;
                while (true) {
                    if (i42 >= i39) {
                        i38++;
                        break;
                    }
                    int i43 = i42;
                    if (iArr14[iArr12[i39]] == iArr14[iArr12[i42]]) {
                        break;
                    }
                    i42 = i43 + 1;
                }
            }
            i39++;
            iArr13 = iArr14;
            i22 = 1;
        }
        int[] iArr15 = iArr13;
        int iF4 = c6728j.f(4);
        if (i38 < 2 || iF4 == 0) {
            return new k(bVar, null, dVar, null, null);
        }
        int[] iArr16 = new int[i38];
        for (int i44 = 0; i44 < i38; i44++) {
            iArr16[i44] = c6728j.f(iF4);
        }
        int[] iArr17 = new int[i21];
        int i45 = 0;
        while (i45 < i18) {
            int[] iArr18 = iArr17;
            iArr18[Math.min(iArr12[i45], iF3)] = i45;
            i45++;
            iArr17 = iArr18;
        }
        int[] iArr19 = iArr17;
        AbstractC2011u.a aVarT = AbstractC2011u.t();
        int i46 = 0;
        while (i46 <= iF3) {
            int i47 = i38;
            int[] iArr20 = iArr7;
            int iMin = Math.min(iArr15[i46], i47 - 1);
            aVarT.a(new a(iArr19[i46], iMin >= 0 ? iArr16[iMin] : -1));
            i46++;
            i38 = i47;
            iArr7 = iArr20;
            iArr16 = iArr16;
        }
        int[] iArr21 = iArr7;
        AbstractC2011u abstractC2011uK = aVarT.k();
        if (((a) abstractC2011uK.get(0)).f61241b == -1) {
            return new k(bVar, null, dVar, null, null);
        }
        int i48 = 1;
        while (true) {
            if (i48 > iF3) {
                i10 = -1;
                i11 = -1;
                break;
            }
            i10 = -1;
            if (((a) abstractC2011uK.get(i48)).f61241b != -1) {
                i11 = i48;
                break;
            }
            i48++;
        }
        if (i11 == i10) {
            return new k(bVar, null, dVar, null, null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr3 = (boolean[][]) Array.newInstance((Class<?>) cls2, i18, i18);
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i18, i18);
        int i49 = 1;
        while (i49 < i18) {
            boolean[][] zArr5 = zArr4;
            for (int i50 = 0; i50 < i49; i50++) {
                boolean[] zArr6 = zArr3[i49];
                boolean[] zArr7 = zArr5[i49];
                boolean zE6 = c6728j.e();
                zArr7[i50] = zE6;
                zArr6[i50] = zE6;
            }
            i49++;
            zArr4 = zArr5;
        }
        boolean[][] zArr8 = zArr4;
        for (int i51 = 1; i51 < i18; i51++) {
            int i52 = 0;
            while (i52 < iF) {
                int[] iArr22 = iArr12;
                int i53 = 0;
                while (true) {
                    if (i53 < i51) {
                        boolean[] zArr9 = zArr8[i51];
                        if (zArr9[i53] && zArr8[i53][i52]) {
                            zArr9[i52] = true;
                            break;
                        }
                        i53++;
                    }
                }
                i52++;
                iArr12 = iArr22;
            }
        }
        int[] iArr23 = iArr12;
        int[] iArr24 = new int[i21];
        for (int i54 = 0; i54 < i18; i54++) {
            int i55 = 0;
            for (int i56 = 0; i56 < i54; i56++) {
                i55 += zArr3[i54][i56] ? 1 : 0;
            }
            iArr24[iArr23[i54]] = i55;
        }
        int i57 = 0;
        for (int i58 = 0; i58 < i18; i58++) {
            if (iArr24[iArr23[i58]] == 0) {
                i57++;
            }
        }
        if (i57 > 1) {
            return new k(bVar, null, dVar, null, null);
        }
        int[] iArr25 = new int[i18];
        int[] iArr26 = new int[i20];
        if (c6728j.e()) {
            iArr2 = iArr24;
            int i59 = 0;
            while (i59 < i18) {
                int i60 = i59;
                iArr25[i60] = c6728j.f(3);
                i59 = i60 + 1;
            }
        } else {
            iArr2 = iArr24;
            Arrays.fill(iArr25, 0, i18, iF2);
        }
        int i61 = 0;
        while (i61 < i20) {
            int i62 = i61;
            boolean[][] zArr10 = zArr3;
            int[] iArr27 = iArr25;
            int iMax = 0;
            for (int i63 = 0; i63 < iArr6[i62]; i63++) {
                iMax = Math.max(iMax, iArr27[((a) abstractC2011uK.get(iArr5[i62][i63])).f61240a]);
            }
            iArr26[i62] = iMax + 1;
            i61 = i62 + 1;
            iArr25 = iArr27;
            zArr3 = zArr10;
        }
        boolean[][] zArr11 = zArr3;
        if (c6728j.e()) {
            int i64 = 0;
            while (i64 < iF) {
                int i65 = i64 + 1;
                int i66 = i65;
                while (i66 < i18) {
                    if (zArr11[i66][i64]) {
                        i16 = i64;
                        c6728j.m(3);
                    } else {
                        i16 = i64;
                    }
                    i66++;
                    i64 = i16;
                }
                i64 = i65;
            }
        }
        c6728j.l();
        int i67 = c6728j.i() + 1;
        AbstractC2011u.a aVarT2 = AbstractC2011u.t();
        aVarT2.a(cVarQ);
        if (i67 > 1) {
            aVarT2.a(cVarQ2);
            for (int i68 = 2; i68 < i67; i68++) {
                cVarQ2 = q(c6728j, c6728j.e(), iF2, cVarQ2);
                aVarT2.a(cVarQ2);
            }
        }
        AbstractC2011u abstractC2011uK2 = aVarT2.k();
        int i69 = c6728j.i() + i20;
        if (i69 > i20) {
            return new k(bVar, null, dVar, null, null);
        }
        int iF5 = c6728j.f(2);
        boolean[][] zArr12 = (boolean[][]) Array.newInstance((Class<?>) cls2, i69, i21);
        int[] iArr28 = new int[i69];
        int i70 = 0;
        int[] iArr29 = new int[i69];
        int i71 = 0;
        while (i71 < i20) {
            iArr28[i71] = i70;
            iArr29[i71] = iArr21[i71];
            if (iF5 == 0) {
                i15 = i71;
                zArr = zArr12;
                abstractC2011u = abstractC2011uK2;
                iArr4 = iArr28;
                Arrays.fill(zArr12[i15], i70, iArr6[i15], true);
                iArr4[i15] = iArr6[i15];
            } else {
                abstractC2011u = abstractC2011uK2;
                i15 = i71;
                zArr = zArr12;
                iArr4 = iArr28;
                if (iF5 == 1) {
                    int i72 = iArr21[i15];
                    for (int i73 = 0; i73 < iArr6[i15]; i73++) {
                        zArr[i15][i73] = iArr5[i15][i73] == i72;
                    }
                    iArr4[i15] = 1;
                } else {
                    i70 = 0;
                    zArr[0][0] = true;
                    iArr4[0] = 1;
                    i71 = i15 + 1;
                    zArr12 = zArr;
                    iArr28 = iArr4;
                    abstractC2011uK2 = abstractC2011u;
                }
            }
            i70 = 0;
            i71 = i15 + 1;
            zArr12 = zArr;
            iArr28 = iArr4;
            abstractC2011uK2 = abstractC2011u;
        }
        AbstractC2011u abstractC2011u2 = abstractC2011uK2;
        boolean[][] zArr13 = zArr12;
        int[] iArr30 = iArr28;
        int[] iArr31 = new int[i21];
        int i74 = 2;
        int[] iArr32 = new int[2];
        iArr32[1] = i21;
        iArr32[i70] = i69;
        boolean[][] zArr14 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr32);
        int i75 = 1;
        int i76 = 0;
        while (i75 < i69) {
            if (iF5 == i74) {
                for (int i77 = 0; i77 < iArr6[i75]; i77++) {
                    zArr13[i75][i77] = c6728j.e();
                    int i78 = iArr30[i75];
                    boolean z11 = zArr13[i75][i77];
                    iArr30[i75] = i78 + (z11 ? 1 : 0);
                    if (z11) {
                        iArr29[i75] = iArr5[i75][i77];
                    }
                }
            }
            if (i76 == 0) {
                i12 = 0;
                if (iArr5[i75][0] == 0 && zArr13[i75][0]) {
                    for (int i79 = 1; i79 < iArr6[i75]; i79++) {
                        if (iArr5[i75][i79] == i11 && zArr13[i75][i11]) {
                            i76 = i75;
                        }
                    }
                }
            } else {
                i12 = 0;
            }
            int i80 = i12;
            while (i80 < iArr6[i75]) {
                if (i67 > 1) {
                    zArr14[i75][i80] = zArr13[i75][i80];
                    i14 = i11;
                    iArr3 = iArr31;
                    i13 = i67;
                    int iD = R9.b.d(i67, RoundingMode.CEILING);
                    if (!zArr14[i75][i80]) {
                        int i81 = ((a) abstractC2011uK.get(iArr5[i75][i80])).f61240a;
                        int i82 = i12;
                        while (true) {
                            if (i82 >= i80) {
                                break;
                            }
                            int i83 = i81;
                            if (zArr8[i83][((a) abstractC2011uK.get(iArr5[i75][i82])).f61240a]) {
                                zArr14[i75][i80] = true;
                                break;
                            }
                            i82++;
                            i81 = i83;
                        }
                    }
                    if (zArr14[i75][i80]) {
                        if (i76 <= 0 || i75 != i76) {
                            c6728j.m(iD);
                        } else {
                            iArr3[i80] = c6728j.f(iD);
                        }
                    }
                } else {
                    i13 = i67;
                    i14 = i11;
                    iArr3 = iArr31;
                }
                i80++;
                i11 = i14;
                iArr31 = iArr3;
                i67 = i13;
            }
            int i84 = i67;
            int i85 = i11;
            int[] iArr33 = iArr31;
            if (iArr30[i75] == 1 && iArr2[iArr29[i75]] > 0) {
                c6728j.l();
            }
            i75++;
            i11 = i85;
            iArr31 = iArr33;
            i67 = i84;
            i74 = 2;
        }
        int[] iArr34 = iArr31;
        if (i76 == 0) {
            return new k(bVar, null, dVar, null, null);
        }
        f fVarS = s(c6728j, i18);
        c6728j.m(2);
        for (int i86 = 1; i86 < i18; i86++) {
            if (iArr2[iArr23[i86]] == 0) {
                c6728j.l();
            }
        }
        E(c6728j, i69, iArr26, iArr6, zArr14);
        K(c6728j, i18, zArr11);
        if (c6728j.e()) {
            c6728j.b();
            jVarX = x(c6728j, i18, i20, iArr26);
        } else {
            jVarX = null;
        }
        return new k(bVar, abstractC2011uK, new d(abstractC2011u2, iArr34), fVarS, jVarX);
    }
}
