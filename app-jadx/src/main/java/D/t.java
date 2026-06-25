package D;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.ui.layout.s;
import i1.AbstractC5022o;
import i1.C5021n;
import i1.EnumC5027t;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.e;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements l, F.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f3473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f3474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e.b f3475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e.c f3476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final EnumC5027t f3477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f3478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f3479h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f3480i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f3481j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f3482k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Object f3483l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f3484m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LazyLayoutItemAnimator f3485n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final long f3486o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f3487p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f3488q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f3489r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f3490s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f3491t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f3492u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f3493v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f3494w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f3495x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f3496y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final int[] f3497z;

    public /* synthetic */ t(int i10, List list, boolean z10, e.b bVar, e.c cVar, EnumC5027t enumC5027t, boolean z11, int i11, int i12, int i13, long j10, Object obj, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, list, z10, bVar, cVar, enumC5027t, z11, i11, i12, i13, j10, obj, obj2, lazyLayoutItemAnimator, j11);
    }

    private final int c(long j10) {
        return j() ? C5021n.l(j10) : C5021n.k(j10);
    }

    private final int d(androidx.compose.ui.layout.s sVar) {
        return j() ? sVar.P0() : sVar.W0();
    }

    public final void a(int i10, boolean z10) {
        if (e()) {
            return;
        }
        this.f3487p = getOffset() + i10;
        int length = this.f3497z.length;
        for (int i11 = 0; i11 < length; i11++) {
            if ((j() && i11 % 2 == 1) || (!j() && i11 % 2 == 0)) {
                int[] iArr = this.f3497z;
                iArr[i11] = iArr[i11] + i10;
            }
        }
        if (z10) {
            int iG = g();
            for (int i12 = 0; i12 < iG; i12++) {
                this.f3485n.d(getKey(), i12);
            }
        }
    }

    public final int b() {
        return this.f3492u;
    }

    public boolean e() {
        return this.f3493v;
    }

    @Override // F.w
    public int f() {
        return this.f3490s;
    }

    @Override // F.w
    public int g() {
        return this.f3473b.size();
    }

    @Override // D.l, F.w
    public int getIndex() {
        return this.f3472a;
    }

    @Override // F.w
    public Object getKey() {
        return this.f3483l;
    }

    @Override // D.l
    public int getOffset() {
        return this.f3487p;
    }

    @Override // D.l
    public int getSize() {
        return this.f3488q;
    }

    @Override // F.w
    public void h(boolean z10) {
        this.f3493v = z10;
    }

    @Override // F.w
    public long i() {
        return this.f3486o;
    }

    @Override // F.w
    public boolean j() {
        return this.f3474c;
    }

    @Override // F.w
    public void k(int i10, int i11, int i12, int i13) {
        q(i10, i12, i13);
    }

    @Override // F.w
    public int l() {
        return this.f3491t;
    }

    @Override // F.w
    public Object m(int i10) {
        return ((androidx.compose.ui.layout.s) this.f3473b.get(i10)).j();
    }

    @Override // F.w
    public long n(int i10) {
        int[] iArr = this.f3497z;
        int i11 = i10 * 2;
        return AbstractC5022o.a(iArr[i11], iArr[i11 + 1]);
    }

    @Override // F.w
    public int o() {
        return this.f3489r;
    }

    public final void p(s.a aVar, boolean z10) {
        s.a aVar2;
        int iK;
        int iL;
        if (this.f3494w == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first");
        }
        int iG = g();
        int i10 = 0;
        while (i10 < iG) {
            androidx.compose.ui.layout.s sVar = (androidx.compose.ui.layout.s) this.f3473b.get(i10);
            d(sVar);
            long jN = n(i10);
            this.f3485n.d(getKey(), i10);
            if (this.f3478g) {
                if (j()) {
                    iK = C5021n.k(jN);
                } else {
                    iK = (this.f3494w - C5021n.k(jN)) - d(sVar);
                }
                if (j()) {
                    iL = (this.f3494w - C5021n.l(jN)) - d(sVar);
                } else {
                    iL = C5021n.l(jN);
                }
                jN = AbstractC5022o.a(iK, iL);
            }
            long jO = C5021n.o(jN, this.f3482k);
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

    public final void q(int i10, int i11, int i12) {
        int iW0;
        this.f3487p = i10;
        this.f3494w = j() ? i12 : i11;
        List list = this.f3473b;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            androidx.compose.ui.layout.s sVar = (androidx.compose.ui.layout.s) list.get(i13);
            int i14 = i13 * 2;
            if (j()) {
                int[] iArr = this.f3497z;
                e.b bVar = this.f3475d;
                if (bVar == null) {
                    throw new IllegalArgumentException("null horizontalAlignment when isVertical == true");
                }
                iArr[i14] = bVar.a(sVar.W0(), i11, this.f3477f);
                this.f3497z[i14 + 1] = i10;
                iW0 = sVar.P0();
            } else {
                int[] iArr2 = this.f3497z;
                iArr2[i14] = i10;
                int i15 = i14 + 1;
                e.c cVar = this.f3476e;
                if (cVar == null) {
                    throw new IllegalArgumentException("null verticalAlignment when isVertical == false");
                }
                iArr2[i15] = cVar.a(sVar.P0(), i12);
                iW0 = sVar.W0();
            }
            i10 += iW0;
        }
        this.f3495x = -this.f3479h;
        this.f3496y = this.f3494w + this.f3480i;
    }

    public final void r(int i10) {
        this.f3494w = i10;
        this.f3496y = i10 + this.f3480i;
    }

    private t(int i10, List list, boolean z10, e.b bVar, e.c cVar, EnumC5027t enumC5027t, boolean z11, int i11, int i12, int i13, long j10, Object obj, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j11) {
        this.f3472a = i10;
        this.f3473b = list;
        this.f3474c = z10;
        this.f3475d = bVar;
        this.f3476e = cVar;
        this.f3477f = enumC5027t;
        this.f3478g = z11;
        this.f3479h = i11;
        this.f3480i = i12;
        this.f3481j = i13;
        this.f3482k = j10;
        this.f3483l = obj;
        this.f3484m = obj2;
        this.f3485n = lazyLayoutItemAnimator;
        this.f3486o = j11;
        this.f3490s = 1;
        this.f3494w = Integer.MIN_VALUE;
        int size = list.size();
        int iP0 = 0;
        int iMax = 0;
        for (int i14 = 0; i14 < size; i14++) {
            androidx.compose.ui.layout.s sVar = (androidx.compose.ui.layout.s) list.get(i14);
            iP0 += j() ? sVar.P0() : sVar.W0();
            iMax = Math.max(iMax, !j() ? sVar.P0() : sVar.W0());
        }
        this.f3488q = iP0;
        this.f3491t = AbstractC5874j.e(getSize() + this.f3481j, 0);
        this.f3492u = iMax;
        this.f3497z = new int[this.f3473b.size() * 2];
    }
}
