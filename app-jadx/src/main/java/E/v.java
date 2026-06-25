package E;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.ui.layout.s;
import i1.AbstractC5022o;
import i1.AbstractC5026s;
import i1.C5021n;
import i1.EnumC5027t;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements InterfaceC1290k, F.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f3983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f3984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f3985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f3986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final EnumC5027t f3987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f3988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f3989h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f3990i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f3991j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f3992k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final LazyLayoutItemAnimator f3993l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f3994m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f3995n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f3996o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f3997p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f3998q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f3999r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f4000s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f4001t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final long f4002u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f4003v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f4004w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f4005x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f4006y;

    public /* synthetic */ v(int i10, Object obj, boolean z10, int i11, int i12, boolean z11, EnumC5027t enumC5027t, int i13, int i14, List list, long j10, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j11, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, obj, z10, i11, i12, z11, enumC5027t, i13, i14, list, j10, obj2, lazyLayoutItemAnimator, j11, i15, i16);
    }

    private final int e(long j10) {
        return j() ? C5021n.l(j10) : C5021n.k(j10);
    }

    private final int q(androidx.compose.ui.layout.s sVar) {
        return j() ? sVar.P0() : sVar.W0();
    }

    @Override // E.InterfaceC1290k
    public long a() {
        return this.f4002u;
    }

    @Override // E.InterfaceC1290k
    public int b() {
        return this.f4004w;
    }

    @Override // E.InterfaceC1290k
    public long c() {
        return this.f4003v;
    }

    public final void d(int i10) {
        if (r()) {
            return;
        }
        long jC = c();
        int iK = j() ? C5021n.k(jC) : C5021n.k(jC) + i10;
        boolean zJ = j();
        int iL = C5021n.l(jC);
        if (zJ) {
            iL += i10;
        }
        this.f4003v = AbstractC5022o.a(iK, iL);
        int iG = g();
        for (int i11 = 0; i11 < iG; i11++) {
            this.f3993l.d(getKey(), i11);
        }
    }

    @Override // F.w
    public int f() {
        return this.f3996o;
    }

    @Override // F.w
    public int g() {
        return this.f3990i.size();
    }

    @Override // E.InterfaceC1290k
    public int getColumn() {
        return this.f4005x;
    }

    @Override // E.InterfaceC1290k, F.w
    public int getIndex() {
        return this.f3982a;
    }

    @Override // F.w
    public Object getKey() {
        return this.f3983b;
    }

    @Override // F.w
    public void h(boolean z10) {
        this.f4006y = z10;
    }

    @Override // F.w
    public long i() {
        return this.f3994m;
    }

    @Override // F.w
    public boolean j() {
        return this.f3984c;
    }

    @Override // F.w
    public void k(int i10, int i11, int i12, int i13) {
        t(i10, i11, i12, i13, -1, -1);
    }

    @Override // F.w
    public int l() {
        return this.f3998q;
    }

    @Override // F.w
    public Object m(int i10) {
        return ((androidx.compose.ui.layout.s) this.f3990i.get(i10)).j();
    }

    @Override // F.w
    public long n(int i10) {
        return c();
    }

    @Override // F.w
    public int o() {
        return this.f3995n;
    }

    public final int p() {
        return this.f3997p;
    }

    public boolean r() {
        return this.f4006y;
    }

    public final void s(s.a aVar) {
        s.a aVar2;
        int iK;
        int iL;
        if (this.f3999r == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first");
        }
        int iG = g();
        int i10 = 0;
        while (i10 < iG) {
            androidx.compose.ui.layout.s sVar = (androidx.compose.ui.layout.s) this.f3990i.get(i10);
            q(sVar);
            long jC = c();
            this.f3993l.d(getKey(), i10);
            if (this.f3986e) {
                if (j()) {
                    iK = C5021n.k(jC);
                } else {
                    iK = (this.f3999r - C5021n.k(jC)) - q(sVar);
                }
                if (j()) {
                    iL = (this.f3999r - C5021n.l(jC)) - q(sVar);
                } else {
                    iL = C5021n.l(jC);
                }
                jC = AbstractC5022o.a(iK, iL);
            }
            long jO = C5021n.o(jC, this.f3991j);
            if (j()) {
                aVar2 = aVar;
                s.a.y0(aVar2, sVar, jO, 0.0f, null, 6, null);
            } else {
                aVar2 = aVar;
                s.a.l0(aVar2, sVar, jO, 0.0f, null, 6, null);
            }
            i10++;
            aVar = aVar2;
        }
    }

    public final void t(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f3999r = j() ? i13 : i12;
        if (!j()) {
            i12 = i13;
        }
        if (j() && this.f3987f == EnumC5027t.f48574b) {
            i11 = (i12 - i11) - this.f3985d;
        }
        this.f4003v = j() ? AbstractC5022o.a(i11, i10) : AbstractC5022o.a(i10, i11);
        this.f4004w = i14;
        this.f4005x = i15;
        this.f4000s = -this.f3988g;
        this.f4001t = this.f3999r + this.f3989h;
    }

    public final void u(int i10) {
        this.f3999r = i10;
        this.f4001t = i10 + this.f3989h;
    }

    private v(int i10, Object obj, boolean z10, int i11, int i12, boolean z11, EnumC5027t enumC5027t, int i13, int i14, List list, long j10, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j11, int i15, int i16) {
        this.f3982a = i10;
        this.f3983b = obj;
        this.f3984c = z10;
        this.f3985d = i11;
        this.f3986e = z11;
        this.f3987f = enumC5027t;
        this.f3988g = i13;
        this.f3989h = i14;
        this.f3990i = list;
        this.f3991j = j10;
        this.f3992k = obj2;
        this.f3993l = lazyLayoutItemAnimator;
        this.f3994m = j11;
        this.f3995n = i15;
        this.f3996o = i16;
        this.f3999r = Integer.MIN_VALUE;
        int size = list.size();
        int iMax = 0;
        for (int i17 = 0; i17 < size; i17++) {
            androidx.compose.ui.layout.s sVar = (androidx.compose.ui.layout.s) list.get(i17);
            iMax = Math.max(iMax, j() ? sVar.P0() : sVar.W0());
        }
        this.f3997p = iMax;
        this.f3998q = AbstractC5874j.e(i12 + iMax, 0);
        this.f4002u = j() ? AbstractC5026s.a(this.f3985d, iMax) : AbstractC5026s.a(iMax, this.f3985d);
        this.f4003v = C5021n.f48560b.b();
        this.f4004w = -1;
        this.f4005x = -1;
    }
}
