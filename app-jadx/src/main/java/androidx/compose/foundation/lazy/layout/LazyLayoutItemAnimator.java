package androidx.compose.foundation.lazy.layout;

import F.AbstractC1543n;
import F.w;
import F.x;
import Gf.O;
import K0.InterfaceC1806t;
import K0.Y;
import Td.L;
import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.V0;
import i1.AbstractC5022o;
import i1.AbstractC5026s;
import i1.C5009b;
import i1.C5021n;
import i1.C5025r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import s0.Z0;
import t.C6550P;
import t.Q;
import t.d0;
import t.f0;
import u0.InterfaceC6708c;
import v0.AbstractC6813e;
import v0.C6811c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class LazyLayoutItemAnimator {

    /* JADX INFO: renamed from: b */
    private androidx.compose.foundation.lazy.layout.c f26250b;

    /* JADX INFO: renamed from: c */
    private int f26251c;

    /* JADX INFO: renamed from: j */
    private InterfaceC1806t f26258j;

    /* JADX INFO: renamed from: a */
    private final C6550P f26249a = d0.b();

    /* JADX INFO: renamed from: d */
    private final Q f26252d = f0.b();

    /* JADX INFO: renamed from: e */
    private final List f26253e = new ArrayList();

    /* JADX INFO: renamed from: f */
    private final List f26254f = new ArrayList();

    /* JADX INFO: renamed from: g */
    private final List f26255g = new ArrayList();

    /* JADX INFO: renamed from: h */
    private final List f26256h = new ArrayList();

    /* JADX INFO: renamed from: i */
    private final List f26257i = new ArrayList();

    /* JADX INFO: renamed from: k */
    private final androidx.compose.ui.e f26259k = new DisplayingDisappearingItemsElement(this);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\n*\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;", "LK0/Y;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$a;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "animator", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", "c", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$a;", "node", "LTd/L;", "h", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$a;)V", "Landroidx/compose/ui/platform/V0;", "inspectableProperties", "(Landroidx/compose/ui/platform/V0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final /* data */ class DisplayingDisappearingItemsElement extends Y {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final LazyLayoutItemAnimator animator;

        public DisplayingDisappearingItemsElement(LazyLayoutItemAnimator lazyLayoutItemAnimator) {
            this.animator = lazyLayoutItemAnimator;
        }

        @Override // K0.Y
        /* JADX INFO: renamed from: c */
        public a create() {
            return new a(this.animator);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DisplayingDisappearingItemsElement) && AbstractC5504s.c(this.animator, ((DisplayingDisappearingItemsElement) other).animator);
        }

        @Override // K0.Y
        /* JADX INFO: renamed from: h */
        public void update(a node) {
            node.E1(this.animator);
        }

        public int hashCode() {
            return this.animator.hashCode();
        }

        @Override // K0.Y
        public void inspectableProperties(V0 v02) {
            v02.d("DisplayingDisappearingItemsElement");
        }

        public String toString() {
            return "DisplayingDisappearingItemsElement(animator=" + this.animator + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a extends e.c implements InterfaceC1806t {

        /* JADX INFO: renamed from: a */
        private LazyLayoutItemAnimator f26261a;

        public a(LazyLayoutItemAnimator lazyLayoutItemAnimator) {
            this.f26261a = lazyLayoutItemAnimator;
        }

        public final void E1(LazyLayoutItemAnimator lazyLayoutItemAnimator) {
            if (AbstractC5504s.c(this.f26261a, lazyLayoutItemAnimator) || !getNode().isAttached()) {
                return;
            }
            this.f26261a.n();
            lazyLayoutItemAnimator.f26258j = this;
            this.f26261a = lazyLayoutItemAnimator;
        }

        @Override // K0.InterfaceC1806t
        public void draw(InterfaceC6708c interfaceC6708c) {
            List list = this.f26261a.f26257i;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                androidx.compose.foundation.lazy.layout.b bVar = (androidx.compose.foundation.lazy.layout.b) list.get(i10);
                C6811c c6811cE = bVar.e();
                if (c6811cE != null) {
                    float fK = C5021n.k(bVar.d());
                    float fK2 = fK - C5021n.k(c6811cE.x());
                    float fL = C5021n.l(bVar.d()) - C5021n.l(c6811cE.x());
                    interfaceC6708c.n1().a().d(fK2, fL);
                    try {
                        AbstractC6813e.a(interfaceC6708c, c6811cE);
                    } finally {
                        interfaceC6708c.n1().a().d(-fK2, -fL);
                    }
                }
            }
            interfaceC6708c.B1();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC5504s.c(this.f26261a, ((a) obj).f26261a);
        }

        public int hashCode() {
            return this.f26261a.hashCode();
        }

        @Override // androidx.compose.ui.e.c
        public void onAttach() {
            this.f26261a.f26258j = this;
        }

        @Override // androidx.compose.ui.e.c
        public void onDetach() {
            this.f26261a.n();
        }

        public String toString() {
            return "DisplayingDisappearingItemsNode(animator=" + this.f26261a + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class b {

        /* JADX INFO: renamed from: b */
        private C5009b f26263b;

        /* JADX INFO: renamed from: c */
        private int f26264c;

        /* JADX INFO: renamed from: d */
        private int f26265d;

        /* JADX INFO: renamed from: f */
        private int f26267f;

        /* JADX INFO: renamed from: g */
        private int f26268g;

        /* JADX INFO: renamed from: a */
        private androidx.compose.foundation.lazy.layout.b[] f26262a = AbstractC1543n.f6062a;

        /* JADX INFO: renamed from: e */
        private int f26266e = 1;

        public b() {
        }

        private final boolean h() {
            for (androidx.compose.foundation.lazy.layout.b bVar : this.f26262a) {
            }
            return false;
        }

        public static /* synthetic */ void l(b bVar, w wVar, O o10, Z0 z02, int i10, int i11, int i12, int i13, Object obj) {
            if ((i13 & 32) != 0) {
                i12 = LazyLayoutItemAnimator.this.e(wVar);
            }
            bVar.k(wVar, o10, z02, i10, i11, i12);
        }

        public final androidx.compose.foundation.lazy.layout.b[] a() {
            return this.f26262a;
        }

        public final C5009b b() {
            return this.f26263b;
        }

        public final int c() {
            return this.f26264c;
        }

        public final int d() {
            return this.f26265d;
        }

        public final int e() {
            return this.f26268g;
        }

        public final int f() {
            return this.f26267f;
        }

        public final int g() {
            return this.f26266e;
        }

        public final void i(int i10) {
            this.f26265d = i10;
        }

        public final void j(int i10) {
            this.f26266e = i10;
        }

        public final void k(w wVar, O o10, Z0 z02, int i10, int i11, int i12) {
            if (!h()) {
                this.f26267f = i10;
                this.f26268g = i11;
            }
            int length = this.f26262a.length;
            for (int iG = wVar.g(); iG < length; iG++) {
                androidx.compose.foundation.lazy.layout.b bVar = this.f26262a[iG];
            }
            if (this.f26262a.length != wVar.g()) {
                Object[] objArrCopyOf = Arrays.copyOf(this.f26262a, wVar.g());
                AbstractC5504s.g(objArrCopyOf, "copyOf(this, newSize)");
                this.f26262a = (androidx.compose.foundation.lazy.layout.b[]) objArrCopyOf;
            }
            this.f26263b = C5009b.a(wVar.i());
            this.f26264c = i12;
            this.f26265d = wVar.o();
            this.f26266e = wVar.f();
            int iG2 = wVar.g();
            for (int i13 = 0; i13 < iG2; i13++) {
                AbstractC1543n.b(wVar.m(i13));
                androidx.compose.foundation.lazy.layout.b bVar2 = this.f26262a[i13];
                this.f26262a[i13] = null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements Comparator {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ androidx.compose.foundation.lazy.layout.c f26270a;

        public c(androidx.compose.foundation.lazy.layout.c cVar) {
            this.f26270a = cVar;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Xd.a.d(Integer.valueOf(this.f26270a.c(((w) obj).getKey())), Integer.valueOf(this.f26270a.c(((w) obj2).getKey())));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements Comparator {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ androidx.compose.foundation.lazy.layout.c f26271a;

        public d(androidx.compose.foundation.lazy.layout.c cVar) {
            this.f26271a = cVar;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Xd.a.d(Integer.valueOf(this.f26271a.c(((w) obj).getKey())), Integer.valueOf(this.f26271a.c(((w) obj2).getKey())));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e implements Comparator {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ androidx.compose.foundation.lazy.layout.c f26272a;

        public e(androidx.compose.foundation.lazy.layout.c cVar) {
            this.f26272a = cVar;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Xd.a.d(Integer.valueOf(this.f26272a.c(((w) obj2).getKey())), Integer.valueOf(this.f26272a.c(((w) obj).getKey())));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f implements Comparator {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ androidx.compose.foundation.lazy.layout.c f26273a;

        public f(androidx.compose.foundation.lazy.layout.c cVar) {
            this.f26273a = cVar;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Xd.a.d(Integer.valueOf(this.f26273a.c(((w) obj2).getKey())), Integer.valueOf(this.f26273a.c(((w) obj).getKey())));
        }
    }

    public final int e(w wVar) {
        long jN = wVar.n(0);
        return !wVar.j() ? C5021n.l(jN) : C5021n.k(jN);
    }

    private final boolean f(w wVar) {
        int iG = wVar.g();
        for (int i10 = 0; i10 < iG; i10++) {
            AbstractC1543n.b(wVar.m(i10));
        }
        return false;
    }

    private final int g(w wVar) {
        long jN = wVar.n(0);
        return wVar.j() ? C5021n.l(jN) : C5021n.k(jN);
    }

    private final void j(w wVar, int i10, b bVar) {
        long jN = wVar.n(0);
        if (wVar.j()) {
            C5021n.h(jN, 0, i10, 1, null);
        } else {
            C5021n.h(jN, i10, 0, 2, null);
        }
        for (androidx.compose.foundation.lazy.layout.b bVar2 : bVar.a()) {
        }
    }

    static /* synthetic */ void k(LazyLayoutItemAnimator lazyLayoutItemAnimator, w wVar, int i10, b bVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            Object objE = lazyLayoutItemAnimator.f26249a.e(wVar.getKey());
            AbstractC5504s.e(objE);
            bVar = (b) objE;
        }
        lazyLayoutItemAnimator.j(wVar, i10, bVar);
    }

    private final void m(Object obj) {
        androidx.compose.foundation.lazy.layout.b[] bVarArrA;
        b bVar = (b) this.f26249a.u(obj);
        if (bVar == null || (bVarArrA = bVar.a()) == null) {
            return;
        }
        for (androidx.compose.foundation.lazy.layout.b bVar2 : bVarArrA) {
        }
    }

    private final void o(w wVar, boolean z10) {
        Object objE = this.f26249a.e(wVar.getKey());
        AbstractC5504s.e(objE);
        for (androidx.compose.foundation.lazy.layout.b bVar : ((b) objE).a()) {
        }
    }

    static /* synthetic */ void p(LazyLayoutItemAnimator lazyLayoutItemAnimator, w wVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        lazyLayoutItemAnimator.o(wVar, z10);
    }

    private final int q(int[] iArr, w wVar) {
        int iO = wVar.o();
        int iF = wVar.f() + iO;
        int iMax = 0;
        while (iO < iF) {
            int iL = iArr[iO] + wVar.l();
            iArr[iO] = iL;
            iMax = Math.max(iMax, iL);
            iO++;
        }
        return iMax;
    }

    public final androidx.compose.foundation.lazy.layout.b d(Object obj, int i10) {
        androidx.compose.foundation.lazy.layout.b[] bVarArrA;
        b bVar = (b) this.f26249a.e(obj);
        if (bVar == null || (bVarArrA = bVar.a()) == null) {
            return null;
        }
        return bVarArrA[i10];
    }

    public final long h() {
        long jA = C5025r.f48570b.a();
        List list = this.f26257i;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.compose.foundation.lazy.layout.b bVar = (androidx.compose.foundation.lazy.layout.b) list.get(i10);
            C6811c c6811cE = bVar.e();
            if (c6811cE != null) {
                jA = AbstractC5026s.a(Math.max(C5025r.g(jA), C5021n.k(bVar.h()) + C5025r.g(c6811cE.w())), Math.max(C5025r.f(jA), C5021n.l(bVar.h()) + C5025r.f(c6811cE.w())));
            }
        }
        return jA;
    }

    public final androidx.compose.ui.e i() {
        return this.f26259k;
    }

    public final void l(int i10, int i11, int i12, List list, androidx.compose.foundation.lazy.layout.c cVar, x xVar, boolean z10, boolean z11, int i13, boolean z12, int i14, int i15, O o10, Z0 z02) {
        int[] iArr;
        int i16;
        int[] iArr2;
        int i17;
        int[] iArr3;
        long[] jArr;
        Object[] objArr;
        int i18;
        long[] jArr2;
        Object[] objArr2;
        long[] jArr3;
        long[] jArr4;
        androidx.compose.foundation.lazy.layout.c cVar2 = this.f26250b;
        this.f26250b = cVar;
        int size = list.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size) {
                if (this.f26249a.h()) {
                    n();
                    return;
                }
            } else if (f((w) list.get(i19))) {
                break;
            } else {
                i19++;
            }
        }
        int i20 = this.f26251c;
        w wVar = (w) AbstractC2279u.o0(list);
        this.f26251c = wVar != null ? wVar.getIndex() : 0;
        if (z10) {
            AbstractC5022o.a(0, i10);
        } else {
            AbstractC5022o.a(i10, 0);
        }
        boolean z13 = z11 || !z12;
        C6550P c6550p = this.f26249a;
        Object[] objArr3 = c6550p.f60044b;
        long[] jArr5 = c6550p.f60043a;
        int length = jArr5.length - 2;
        if (length >= 0) {
            int i21 = 0;
            while (true) {
                long j10 = jArr5[i21];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i22 = 8 - ((~(i21 - length)) >>> 31);
                    int i23 = 0;
                    while (i23 < i22) {
                        if ((j10 & 255) < 128) {
                            jArr4 = jArr5;
                            this.f26252d.h(objArr3[(i21 << 3) + i23]);
                        } else {
                            jArr4 = jArr5;
                        }
                        j10 >>= 8;
                        i23++;
                        jArr5 = jArr4;
                    }
                    jArr3 = jArr5;
                    if (i22 != 8) {
                        break;
                    }
                } else {
                    jArr3 = jArr5;
                }
                int i24 = i21;
                if (i24 == length) {
                    break;
                }
                i21 = i24 + 1;
                jArr5 = jArr3;
            }
        }
        int size2 = list.size();
        for (int i25 = 0; i25 < size2; i25++) {
            w wVar2 = (w) list.get(i25);
            this.f26252d.y(wVar2.getKey());
            if (f(wVar2)) {
                b bVar = (b) this.f26249a.e(wVar2.getKey());
                int iC = cVar2 != null ? cVar2.c(wVar2.getKey()) : -1;
                boolean z14 = iC == -1 && cVar2 != null;
                if (bVar == null) {
                    b bVar2 = new b();
                    b.l(bVar2, wVar2, o10, z02, i14, i15, 0, 32, null);
                    this.f26249a.x(wVar2.getKey(), bVar2);
                    if (wVar2.getIndex() == iC || iC == -1) {
                        long jN = wVar2.n(0);
                        j(wVar2, wVar2.j() ? C5021n.l(jN) : C5021n.k(jN), bVar2);
                        if (z14) {
                            androidx.compose.foundation.lazy.layout.b[] bVarArrA = bVar2.a();
                            for (androidx.compose.foundation.lazy.layout.b bVar3 : bVarArrA) {
                            }
                        }
                    } else if (iC < i20) {
                        this.f26253e.add(wVar2);
                    } else {
                        this.f26254f.add(wVar2);
                    }
                } else if (z13) {
                    b.l(bVar, wVar2, o10, z02, i14, i15, 0, 32, null);
                    for (androidx.compose.foundation.lazy.layout.b bVar4 : bVar.a()) {
                    }
                    if (z14) {
                        for (androidx.compose.foundation.lazy.layout.b bVar5 : bVar.a()) {
                        }
                    }
                    p(this, wVar2, false, 2, null);
                }
            } else {
                m(wVar2.getKey());
            }
        }
        int[] iArr4 = new int[i13];
        for (int i26 = 0; i26 < i13; i26++) {
            iArr4[i26] = 0;
        }
        if (!z13 || cVar2 == null) {
            iArr = iArr4;
            i16 = 8;
        } else {
            if (this.f26253e.isEmpty()) {
                iArr = iArr4;
                i16 = 8;
            } else {
                List list2 = this.f26253e;
                if (list2.size() > 1) {
                    AbstractC2279u.B(list2, new e(cVar2));
                }
                List list3 = this.f26253e;
                int size3 = list3.size();
                int i27 = 0;
                while (i27 < size3) {
                    w wVar3 = (w) list3.get(i27);
                    k(this, wVar3, i14 - q(iArr4, wVar3), null, 4, null);
                    p(this, wVar3, false, 2, null);
                    i27++;
                    iArr4 = iArr4;
                }
                int[] iArr5 = iArr4;
                i16 = 8;
                AbstractC2273n.x(iArr5, 0, 0, 0, 6, null);
                iArr = iArr5;
            }
            if (!this.f26254f.isEmpty()) {
                List list4 = this.f26254f;
                if (list4.size() > 1) {
                    AbstractC2279u.B(list4, new c(cVar2));
                }
                List list5 = this.f26254f;
                int i28 = 0;
                for (int size4 = list5.size(); i28 < size4; size4 = size4) {
                    w wVar4 = (w) list5.get(i28);
                    k(this, wVar4, (i15 + q(iArr, wVar4)) - wVar4.l(), null, 4, null);
                    p(this, wVar4, false, 2, null);
                    i28++;
                }
                AbstractC2273n.x(iArr, 0, 0, 0, 6, null);
            }
        }
        Q q10 = this.f26252d;
        Object[] objArr4 = q10.f60055b;
        long[] jArr6 = q10.f60054a;
        int length2 = jArr6.length - 2;
        if (length2 >= 0) {
            int i29 = 0;
            while (true) {
                long j11 = jArr6[i29];
                int i30 = i16;
                iArr2 = iArr;
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i31 = 8 - ((~(i29 - length2)) >>> 31);
                    long j12 = j11;
                    int i32 = 0;
                    while (i32 < i31) {
                        if ((j12 & 255) < 128) {
                            Object obj = objArr4[(i29 << 3) + i32];
                            Object objE = this.f26249a.e(obj);
                            AbstractC5504s.e(objE);
                            b bVar6 = (b) objE;
                            int iC2 = cVar.c(obj);
                            jArr2 = jArr6;
                            bVar6.j(Math.min(i13, bVar6.g()));
                            objArr2 = objArr4;
                            bVar6.i(Math.min(i13 - bVar6.g(), bVar6.d()));
                            if (iC2 == -1) {
                                for (androidx.compose.foundation.lazy.layout.b bVar7 : bVar6.a()) {
                                }
                                m(obj);
                            } else {
                                C5009b c5009bB = bVar6.b();
                                AbstractC5504s.e(c5009bB);
                                w wVarA = xVar.a(iC2, bVar6.d(), bVar6.g(), c5009bB.r());
                                wVarA.h(true);
                                for (androidx.compose.foundation.lazy.layout.b bVar8 : bVar6.a()) {
                                }
                                if (cVar2 == null || iC2 != cVar2.c(obj)) {
                                    bVar6.k(wVarA, o10, z02, i14, i15, bVar6.c());
                                    if (iC2 < this.f26251c) {
                                        this.f26255g.add(wVarA);
                                    } else {
                                        this.f26256h.add(wVarA);
                                    }
                                } else {
                                    m(obj);
                                }
                            }
                        } else {
                            jArr2 = jArr6;
                            objArr2 = objArr4;
                        }
                        j12 >>= i30;
                        i32++;
                        jArr6 = jArr2;
                        objArr4 = objArr2;
                    }
                    jArr = jArr6;
                    objArr = objArr4;
                    i18 = i30;
                    if (i31 != i18) {
                        break;
                    }
                } else {
                    jArr = jArr6;
                    objArr = objArr4;
                    i18 = i30;
                }
                if (i29 == length2) {
                    break;
                }
                i29++;
                i16 = i18;
                iArr = iArr2;
                jArr6 = jArr;
                objArr4 = objArr;
            }
        } else {
            iArr2 = iArr;
        }
        if (this.f26255g.isEmpty()) {
            i17 = i11;
            iArr3 = iArr2;
        } else {
            List list6 = this.f26255g;
            if (list6.size() > 1) {
                AbstractC2279u.B(list6, new f(cVar));
            }
            List list7 = this.f26255g;
            int size5 = list7.size();
            int i33 = 0;
            while (i33 < size5) {
                w wVar5 = (w) list7.get(i33);
                Object objE2 = this.f26249a.e(wVar5.getKey());
                AbstractC5504s.e(objE2);
                b bVar9 = (b) objE2;
                int[] iArr6 = iArr2;
                wVar5.k((z11 ? g((w) AbstractC2279u.m0(list)) : bVar9.f()) - q(iArr6, wVar5), bVar9.c(), i11, i12);
                if (z13) {
                    o(wVar5, true);
                }
                i33++;
                iArr2 = iArr6;
            }
            i17 = i11;
            iArr3 = iArr2;
            AbstractC2273n.x(iArr2, 0, 0, 0, 6, null);
        }
        if (!this.f26256h.isEmpty()) {
            List list8 = this.f26256h;
            if (list8.size() > 1) {
                AbstractC2279u.B(list8, new d(cVar));
            }
            List list9 = this.f26256h;
            int size6 = list9.size();
            for (int i34 = 0; i34 < size6; i34++) {
                w wVar6 = (w) list9.get(i34);
                Object objE3 = this.f26249a.e(wVar6.getKey());
                AbstractC5504s.e(objE3);
                b bVar10 = (b) objE3;
                wVar6.k((z11 ? g((w) AbstractC2279u.y0(list)) : bVar10.e() - wVar6.l()) + q(iArr3, wVar6), bVar10.c(), i17, i12);
                if (z13) {
                    o(wVar6, true);
                }
            }
        }
        List list10 = this.f26255g;
        AbstractC2279u.Z(list10);
        L l10 = L.f17438a;
        list.addAll(0, list10);
        list.addAll(this.f26256h);
        this.f26253e.clear();
        this.f26254f.clear();
        this.f26255g.clear();
        this.f26256h.clear();
        this.f26252d.m();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n() {
        /*
            r14 = this;
            t.P r0 = r14.f26249a
            boolean r0 = r0.i()
            if (r0 == 0) goto L5e
            t.P r0 = r14.f26249a
            java.lang.Object[] r1 = r0.f60045c
            long[] r0 = r0.f60043a
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L59
            r3 = 0
            r4 = r3
        L15:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L54
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L2f:
            if (r9 >= r7) goto L52
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4e
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$b r10 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b) r10
            androidx.compose.foundation.lazy.layout.b[] r10 = r10.a()
            int r11 = r10.length
            r12 = r3
        L47:
            if (r12 >= r11) goto L4e
            r13 = r10[r12]
            int r12 = r12 + 1
            goto L47
        L4e:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L2f
        L52:
            if (r7 != r8) goto L59
        L54:
            if (r4 == r2) goto L59
            int r4 = r4 + 1
            goto L15
        L59:
            t.P r0 = r14.f26249a
            r0.k()
        L5e:
            androidx.compose.foundation.lazy.layout.c$a r0 = androidx.compose.foundation.lazy.layout.c.f26284a
            r14.f26250b = r0
            r0 = -1
            r14.f26251c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.n():void");
    }
}
