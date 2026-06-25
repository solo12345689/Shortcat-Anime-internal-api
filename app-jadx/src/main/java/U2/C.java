package U2;

import java.util.Collections;
import java.util.List;
import q2.C6080L;
import t2.AbstractC6624k;
import t2.C6609I;
import u2.AbstractC6726h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f18887f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f18888g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f18889h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f18890i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f18891j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f18892k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f18893l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f18894m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f18895n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f18896o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f18897p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AbstractC6726h.k f18898q;

    private C(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, float f10, int i22, String str, AbstractC6726h.k kVar) {
        this.f18882a = list;
        this.f18883b = i10;
        this.f18884c = i11;
        this.f18885d = i12;
        this.f18886e = i13;
        this.f18887f = i14;
        this.f18888g = i15;
        this.f18889h = i16;
        this.f18890i = i17;
        this.f18891j = i18;
        this.f18892k = i19;
        this.f18893l = i20;
        this.f18894m = i21;
        this.f18895n = f10;
        this.f18896o = i22;
        this.f18897p = str;
        this.f18898q = kVar;
    }

    public static C a(C6609I c6609i) {
        return b(c6609i, false, null);
    }

    private static C b(C6609I c6609i, boolean z10, AbstractC6726h.k kVar) throws C6080L {
        boolean z11;
        int i10;
        AbstractC6726h.g gVarT;
        int i11;
        try {
            if (z10) {
                c6609i.c0(4);
            } else {
                c6609i.c0(21);
            }
            int iM = c6609i.M() & 3;
            int iM2 = c6609i.M();
            int iG = c6609i.g();
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                z11 = true;
                if (i13 >= iM2) {
                    break;
                }
                c6609i.c0(1);
                int iU = c6609i.U();
                for (int i15 = 0; i15 < iU; i15++) {
                    int iU2 = c6609i.U();
                    i14 += iU2 + 4;
                    c6609i.c0(iU2);
                }
                i13++;
            }
            c6609i.b0(iG);
            byte[] bArr = new byte[i14];
            AbstractC6726h.k kVar2 = kVar;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            int i23 = -1;
            int i24 = -1;
            int i25 = -1;
            int i26 = -1;
            int i27 = -1;
            float f10 = 1.0f;
            String strH = null;
            int i28 = 0;
            int i29 = 0;
            while (i28 < iM2) {
                int iM3 = c6609i.M() & 63;
                int iU3 = c6609i.U();
                int i30 = i12;
                AbstractC6726h.k kVarY = kVar2;
                while (i30 < iU3) {
                    int iU4 = c6609i.U();
                    boolean z12 = z11;
                    byte[] bArr2 = AbstractC6726h.f61236a;
                    int i31 = iM;
                    System.arraycopy(bArr2, i12, bArr, i29, bArr2.length);
                    int length = i29 + bArr2.length;
                    System.arraycopy(c6609i.f(), c6609i.g(), bArr, length, iU4);
                    if (iM3 == 32 && i30 == 0) {
                        kVarY = AbstractC6726h.y(bArr, length, length + iU4);
                        i10 = iM2;
                    } else {
                        if (iM3 == 33 && i30 == 0) {
                            AbstractC6726h.C0914h c0914hU = AbstractC6726h.u(bArr, length, length + iU4, kVarY);
                            i16 = c0914hU.f61270b + 1;
                            i17 = c0914hU.f61276h;
                            int i32 = c0914hU.f61277i;
                            int i33 = c0914hU.f61278j;
                            i10 = iM2;
                            int i34 = c0914hU.f61279k;
                            i21 = c0914hU.f61273e + 8;
                            i22 = c0914hU.f61274f + 8;
                            int i35 = c0914hU.f61282n;
                            int i36 = c0914hU.f61283o;
                            int i37 = c0914hU.f61284p;
                            float f11 = c0914hU.f61280l;
                            int i38 = c0914hU.f61281m;
                            AbstractC6726h.c cVar = c0914hU.f61271c;
                            if (cVar != null) {
                                i11 = i38;
                                strH = AbstractC6624k.h(cVar.f61245a, cVar.f61246b, cVar.f61247c, cVar.f61248d, cVar.f61249e, cVar.f61250f);
                            } else {
                                i11 = i38;
                            }
                            f10 = f11;
                            i27 = i11;
                            i24 = i36;
                            i25 = i37;
                            i20 = i34;
                            i23 = i35;
                            i19 = i33;
                            i18 = i32;
                        } else {
                            i10 = iM2;
                            if (iM3 == 39 && i30 == 0 && (gVarT = AbstractC6726h.t(bArr, length, length + iU4)) != null && kVarY != null) {
                                i12 = 0;
                                i26 = gVarT.f61263d == ((AbstractC6726h.a) kVarY.f61291b.get(0)).f61241b ? 4 : 5;
                            }
                        }
                        i12 = 0;
                    }
                    i29 = length + iU4;
                    c6609i.c0(iU4);
                    i30++;
                    z11 = z12;
                    iM = i31;
                    iM2 = i10;
                }
                i28++;
                kVar2 = kVarY;
            }
            return new C(i14 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iM + 1, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, f10, i27, strH, kVar2);
        } catch (ArrayIndexOutOfBoundsException e10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error parsing");
            sb2.append(z10 ? "L-HEVC config" : "HEVC config");
            throw C6080L.a(sb2.toString(), e10);
        }
    }

    public static C c(C6609I c6609i, AbstractC6726h.k kVar) {
        return b(c6609i, true, kVar);
    }
}
