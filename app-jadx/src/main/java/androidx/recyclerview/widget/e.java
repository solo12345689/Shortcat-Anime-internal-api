package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class e implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final ThreadLocal f32103e = new ThreadLocal();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static Comparator f32104f = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f32106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f32107c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList f32105a = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList f32108d = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f32116d;
            if ((recyclerView == null) != (cVar2.f32116d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z10 = cVar.f32113a;
            if (z10 != cVar2.f32113a) {
                return z10 ? -1 : 1;
            }
            int i10 = cVar2.f32114b - cVar.f32114b;
            if (i10 != 0) {
                return i10;
            }
            int i11 = cVar.f32115c - cVar2.f32115c;
            if (i11 != 0) {
                return i11;
            }
            return 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b implements RecyclerView.p.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f32110b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int[] f32111c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f32112d;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p.c
        public void a(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i11 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i12 = this.f32112d;
            int i13 = i12 * 2;
            int[] iArr = this.f32111c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f32111c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i13 >= iArr.length) {
                int[] iArr3 = new int[i12 * 4];
                this.f32111c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f32111c;
            iArr4[i13] = i10;
            iArr4[i13 + 1] = i11;
            this.f32112d++;
        }

        void b() {
            int[] iArr = this.f32111c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f32112d = 0;
        }

        void c(RecyclerView recyclerView, boolean z10) {
            this.f32112d = 0;
            int[] iArr = this.f32111c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.p pVar = recyclerView.f31789n;
            if (recyclerView.f31787m == null || pVar == null || !pVar.y0()) {
                return;
            }
            if (z10) {
                if (!recyclerView.f31778e.p()) {
                    pVar.u(recyclerView.f31787m.e(), this);
                }
            } else if (!recyclerView.p0()) {
                pVar.t(this.f32109a, this.f32110b, recyclerView.f31754H0, this);
            }
            int i10 = this.f32112d;
            if (i10 > pVar.f31895m) {
                pVar.f31895m = i10;
                pVar.f31896n = z10;
                recyclerView.f31776c.P();
            }
        }

        boolean d(int i10) {
            if (this.f32111c != null) {
                int i11 = this.f32112d * 2;
                for (int i12 = 0; i12 < i11; i12 += 2) {
                    if (this.f32111c[i12] == i10) {
                        return true;
                    }
                }
            }
            return false;
        }

        void e(int i10, int i11) {
            this.f32109a = i10;
            this.f32110b = i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f32113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f32114b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f32115c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public RecyclerView f32116d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f32117e;

        c() {
        }

        public void a() {
            this.f32113a = false;
            this.f32114b = 0;
            this.f32115c = 0;
            this.f32116d = null;
            this.f32117e = 0;
        }
    }

    e() {
    }

    private void b() {
        c cVar;
        int size = this.f32105a.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView = (RecyclerView) this.f32105a.get(i11);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f31752G0.c(recyclerView, false);
                i10 += recyclerView.f31752G0.f32112d;
            }
        }
        this.f32108d.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f32105a.get(i13);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f31752G0;
                int iAbs = Math.abs(bVar.f32109a) + Math.abs(bVar.f32110b);
                for (int i14 = 0; i14 < bVar.f32112d * 2; i14 += 2) {
                    if (i12 >= this.f32108d.size()) {
                        cVar = new c();
                        this.f32108d.add(cVar);
                    } else {
                        cVar = (c) this.f32108d.get(i12);
                    }
                    int[] iArr = bVar.f32111c;
                    int i15 = iArr[i14 + 1];
                    cVar.f32113a = i15 <= iAbs;
                    cVar.f32114b = iAbs;
                    cVar.f32115c = i15;
                    cVar.f32116d = recyclerView2;
                    cVar.f32117e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.f32108d, f32104f);
    }

    private void c(c cVar, long j10) {
        RecyclerView.E eI = i(cVar.f32116d, cVar.f32117e, cVar.f32113a ? Long.MAX_VALUE : j10);
        if (eI == null || eI.f31841b == null || !eI.t() || eI.u()) {
            return;
        }
        h((RecyclerView) eI.f31841b.get(), j10);
    }

    private void d(long j10) {
        for (int i10 = 0; i10 < this.f32108d.size(); i10++) {
            c cVar = (c) this.f32108d.get(i10);
            if (cVar.f32116d == null) {
                return;
            }
            c(cVar, j10);
            cVar.a();
        }
    }

    static boolean e(RecyclerView recyclerView, int i10) {
        int iJ = recyclerView.f31779f.j();
        for (int i11 = 0; i11 < iJ; i11++) {
            RecyclerView.E eI0 = RecyclerView.i0(recyclerView.f31779f.i(i11));
            if (eI0.f31842c == i10 && !eI0.u()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j10) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.f31747E && recyclerView.f31779f.j() != 0) {
            recyclerView.a1();
        }
        b bVar = recyclerView.f31752G0;
        bVar.c(recyclerView, true);
        if (bVar.f32112d != 0) {
            try {
                G1.n.a("RV Nested Prefetch");
                recyclerView.f31754H0.f(recyclerView.f31787m);
                for (int i10 = 0; i10 < bVar.f32112d * 2; i10 += 2) {
                    i(recyclerView, bVar.f32111c[i10], j10);
                }
            } finally {
                G1.n.b();
            }
        }
    }

    private RecyclerView.E i(RecyclerView recyclerView, int i10, long j10) {
        if (e(recyclerView, i10)) {
            return null;
        }
        RecyclerView.v vVar = recyclerView.f31776c;
        try {
            recyclerView.K0();
            RecyclerView.E eN = vVar.N(i10, false, j10);
            if (eN != null) {
                if (!eN.t() || eN.u()) {
                    vVar.a(eN, false);
                } else {
                    vVar.G(eN.f31840a);
                }
            }
            recyclerView.M0(false);
            return eN;
        } catch (Throwable th2) {
            recyclerView.M0(false);
            throw th2;
        }
    }

    public void a(RecyclerView recyclerView) {
        this.f32105a.add(recyclerView);
    }

    void f(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow() && this.f32106b == 0) {
            this.f32106b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f31752G0.e(i10, i11);
    }

    void g(long j10) {
        b();
        d(j10);
    }

    public void j(RecyclerView recyclerView) {
        this.f32105a.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            G1.n.a("RV Prefetch");
            if (!this.f32105a.isEmpty()) {
                int size = this.f32105a.size();
                long jMax = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = (RecyclerView) this.f32105a.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f32107c);
                }
            }
        } finally {
            this.f32106b = 0L;
            G1.n.b();
        }
    }
}
