package E;

import Td.L;
import java.util.List;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f4010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v[] f4011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E f4012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f4013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f4014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f4015f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f4016g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f4017h;

    public x(int i10, v[] vVarArr, E e10, List list, boolean z10, int i11) {
        this.f4010a = i10;
        this.f4011b = vVarArr;
        this.f4012c = e10;
        this.f4013d = list;
        this.f4014e = z10;
        this.f4015f = i11;
        int iMax = 0;
        for (v vVar : vVarArr) {
            iMax = Math.max(iMax, vVar.p());
        }
        this.f4016g = iMax;
        this.f4017h = AbstractC5874j.e(iMax + this.f4015f, 0);
    }

    public final int a() {
        return this.f4010a;
    }

    public final v[] b() {
        return this.f4011b;
    }

    public final int c() {
        return this.f4016g;
    }

    public final int d() {
        return this.f4017h;
    }

    public final boolean e() {
        return this.f4011b.length == 0;
    }

    public final v[] f(int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        v[] vVarArr = this.f4011b;
        int length = vVarArr.length;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i17 < length) {
            v vVar = vVarArr[i17];
            int i20 = i18 + 1;
            int iD = C1282c.d(((C1282c) this.f4013d.get(i18)).g());
            int i21 = this.f4012c.a()[i19];
            boolean z10 = this.f4014e;
            int i22 = z10 ? this.f4010a : i19;
            if (z10) {
                i13 = i19;
                i16 = i10;
                i14 = i11;
                i15 = i12;
            } else {
                i13 = this.f4010a;
                i14 = i11;
                i15 = i12;
                i16 = i10;
            }
            vVar.t(i16, i21, i14, i15, i22, i13);
            L l10 = L.f17438a;
            i19 += iD;
            i17++;
            i18 = i20;
        }
        return this.f4011b;
    }
}
