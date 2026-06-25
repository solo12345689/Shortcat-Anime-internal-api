package U2;

import java.util.ArrayList;
import java.util.List;
import q2.C6080L;
import t2.AbstractC6624k;
import t2.C6609I;
import u2.AbstractC6726h;

/* JADX INFO: renamed from: U2.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2243d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19001e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f19002f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f19003g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f19004h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f19005i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f19006j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f19007k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f19008l;

    private C2243d(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f10, String str) {
        this.f18997a = list;
        this.f18998b = i10;
        this.f18999c = i11;
        this.f19000d = i12;
        this.f19001e = i13;
        this.f19002f = i14;
        this.f19003g = i15;
        this.f19004h = i16;
        this.f19005i = i17;
        this.f19006j = i18;
        this.f19007k = f10;
        this.f19008l = str;
    }

    private static byte[] a(C6609I c6609i) {
        int iU = c6609i.U();
        int iG = c6609i.g();
        c6609i.c0(iU);
        return AbstractC6624k.j(c6609i.f(), iG, iU);
    }

    public static C2243d b(C6609I c6609i) throws C6080L {
        String strF;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10;
        int i16;
        int i17;
        try {
            c6609i.c0(4);
            int iM = (c6609i.M() & 3) + 1;
            if (iM == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iM2 = c6609i.M() & 31;
            for (int i18 = 0; i18 < iM2; i18++) {
                arrayList.add(a(c6609i));
            }
            int iM3 = c6609i.M();
            for (int i19 = 0; i19 < iM3; i19++) {
                arrayList.add(a(c6609i));
            }
            if (iM2 > 0) {
                AbstractC6726h.m mVarC = AbstractC6726h.C((byte[]) arrayList.get(0), AbstractC6726h.f61236a.length, ((byte[]) arrayList.get(0)).length);
                int i20 = mVarC.f61303f;
                int i21 = mVarC.f61304g;
                int i22 = mVarC.f61306i + 8;
                int i23 = mVarC.f61307j + 8;
                int i24 = mVarC.f61314q;
                int i25 = mVarC.f61315r;
                int i26 = mVarC.f61316s;
                int i27 = mVarC.f61317t;
                float f11 = mVarC.f61305h;
                strF = AbstractC6624k.f(mVarC.f61298a, mVarC.f61299b, mVarC.f61300c);
                i14 = i26;
                i15 = i27;
                f10 = f11;
                i13 = i23;
                i16 = i24;
                i17 = i25;
                i10 = i20;
                i11 = i21;
                i12 = i22;
            } else {
                strF = null;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                i15 = 16;
                f10 = 1.0f;
                i16 = -1;
                i17 = -1;
            }
            return new C2243d(arrayList, iM, i10, i11, i12, i13, i16, i17, i14, i15, f10, strF);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw C6080L.a("Error parsing AVC config", e10);
        }
    }
}
