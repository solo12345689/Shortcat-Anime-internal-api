package G;

import androidx.compose.ui.layout.s;
import i1.AbstractC5022o;
import i1.C5021n;
import i1.EnumC5027t;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.e;

/* JADX INFO: renamed from: G.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1591e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f6834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f6835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f6836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e.b f6837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e.c f6838g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final EnumC5027t f6839h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f6840i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f6841j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f6842k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int[] f6843l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f6844m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f6845n;

    public /* synthetic */ C1591e(int i10, int i11, List list, long j10, Object obj, z.q qVar, e.b bVar, e.c cVar, EnumC5027t enumC5027t, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, list, j10, obj, qVar, bVar, cVar, enumC5027t, z10);
    }

    private final int d(androidx.compose.ui.layout.s sVar) {
        return this.f6841j ? sVar.P0() : sVar.W0();
    }

    private final long e(int i10) {
        int[] iArr = this.f6843l;
        int i11 = i10 * 2;
        return AbstractC5022o.a(iArr[i11], iArr[i11 + 1]);
    }

    public final void a(int i10) {
        this.f6844m = getOffset() + i10;
        int length = this.f6843l.length;
        for (int i11 = 0; i11 < length; i11++) {
            boolean z10 = this.f6841j;
            if ((z10 && i11 % 2 == 1) || (!z10 && i11 % 2 == 0)) {
                int[] iArr = this.f6843l;
                iArr[i11] = iArr[i11] + i10;
            }
        }
    }

    public final int b() {
        return this.f6842k;
    }

    public Object c() {
        return this.f6836e;
    }

    public final int f() {
        return this.f6833b;
    }

    public final void g(s.a aVar) {
        s.a aVar2;
        int iK;
        int iL;
        if (this.f6845n == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first");
        }
        int size = this.f6834c.size();
        int i10 = 0;
        while (i10 < size) {
            androidx.compose.ui.layout.s sVar = (androidx.compose.ui.layout.s) this.f6834c.get(i10);
            long jE = e(i10);
            if (this.f6840i) {
                if (this.f6841j) {
                    iK = C5021n.k(jE);
                } else {
                    iK = (this.f6845n - C5021n.k(jE)) - d(sVar);
                }
                if (this.f6841j) {
                    iL = (this.f6845n - C5021n.l(jE)) - d(sVar);
                } else {
                    iL = C5021n.l(jE);
                }
                jE = AbstractC5022o.a(iK, iL);
            }
            long jO = C5021n.o(jE, this.f6835d);
            if (this.f6841j) {
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

    @Override // G.f
    public int getIndex() {
        return this.f6832a;
    }

    @Override // G.f
    public int getOffset() {
        return this.f6844m;
    }

    public final void h(int i10, int i11, int i12) {
        int iW0;
        this.f6844m = i10;
        this.f6845n = this.f6841j ? i12 : i11;
        List list = this.f6834c;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            androidx.compose.ui.layout.s sVar = (androidx.compose.ui.layout.s) list.get(i13);
            int i14 = i13 * 2;
            if (this.f6841j) {
                int[] iArr = this.f6843l;
                e.b bVar = this.f6837f;
                if (bVar == null) {
                    throw new IllegalArgumentException("null horizontalAlignment");
                }
                iArr[i14] = bVar.a(sVar.W0(), i11, this.f6839h);
                this.f6843l[i14 + 1] = i10;
                iW0 = sVar.P0();
            } else {
                int[] iArr2 = this.f6843l;
                iArr2[i14] = i10;
                int i15 = i14 + 1;
                e.c cVar = this.f6838g;
                if (cVar == null) {
                    throw new IllegalArgumentException("null verticalAlignment");
                }
                iArr2[i15] = cVar.a(sVar.P0(), i12);
                iW0 = sVar.W0();
            }
            i10 += iW0;
        }
    }

    private C1591e(int i10, int i11, List list, long j10, Object obj, z.q qVar, e.b bVar, e.c cVar, EnumC5027t enumC5027t, boolean z10) {
        this.f6832a = i10;
        this.f6833b = i11;
        this.f6834c = list;
        this.f6835d = j10;
        this.f6836e = obj;
        this.f6837f = bVar;
        this.f6838g = cVar;
        this.f6839h = enumC5027t;
        this.f6840i = z10;
        this.f6841j = qVar == z.q.Vertical;
        int size = list.size();
        int iMax = 0;
        for (int i12 = 0; i12 < size; i12++) {
            androidx.compose.ui.layout.s sVar = (androidx.compose.ui.layout.s) list.get(i12);
            iMax = Math.max(iMax, !this.f6841j ? sVar.P0() : sVar.W0());
        }
        this.f6842k = iMax;
        this.f6843l = new int[this.f6834c.size() * 2];
        this.f6845n = Integer.MIN_VALUE;
    }
}
