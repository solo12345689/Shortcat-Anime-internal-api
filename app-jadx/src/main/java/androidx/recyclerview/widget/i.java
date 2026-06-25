package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final RecyclerView.p f32136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Rect f32138c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends i {
        a(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.i
        public int d(View view) {
            return this.f32136a.Y(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f32136a.X(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f32136a.W(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int g(View view) {
            return this.f32136a.V(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int h() {
            return this.f32136a.s0();
        }

        @Override // androidx.recyclerview.widget.i
        public int i() {
            return this.f32136a.s0() - this.f32136a.j0();
        }

        @Override // androidx.recyclerview.widget.i
        public int j() {
            return this.f32136a.j0();
        }

        @Override // androidx.recyclerview.widget.i
        public int k() {
            return this.f32136a.t0();
        }

        @Override // androidx.recyclerview.widget.i
        public int l() {
            return this.f32136a.c0();
        }

        @Override // androidx.recyclerview.widget.i
        public int m() {
            return this.f32136a.i0();
        }

        @Override // androidx.recyclerview.widget.i
        public int n() {
            return (this.f32136a.s0() - this.f32136a.i0()) - this.f32136a.j0();
        }

        @Override // androidx.recyclerview.widget.i
        public int p(View view) {
            this.f32136a.r0(view, true, this.f32138c);
            return this.f32138c.right;
        }

        @Override // androidx.recyclerview.widget.i
        public int q(View view) {
            this.f32136a.r0(view, true, this.f32138c);
            return this.f32138c.left;
        }

        @Override // androidx.recyclerview.widget.i
        public void r(int i10) {
            this.f32136a.G0(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends i {
        b(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.i
        public int d(View view) {
            return this.f32136a.T(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f32136a.W(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f32136a.X(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int g(View view) {
            return this.f32136a.Z(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int h() {
            return this.f32136a.b0();
        }

        @Override // androidx.recyclerview.widget.i
        public int i() {
            return this.f32136a.b0() - this.f32136a.h0();
        }

        @Override // androidx.recyclerview.widget.i
        public int j() {
            return this.f32136a.h0();
        }

        @Override // androidx.recyclerview.widget.i
        public int k() {
            return this.f32136a.c0();
        }

        @Override // androidx.recyclerview.widget.i
        public int l() {
            return this.f32136a.t0();
        }

        @Override // androidx.recyclerview.widget.i
        public int m() {
            return this.f32136a.k0();
        }

        @Override // androidx.recyclerview.widget.i
        public int n() {
            return (this.f32136a.b0() - this.f32136a.k0()) - this.f32136a.h0();
        }

        @Override // androidx.recyclerview.widget.i
        public int p(View view) {
            this.f32136a.r0(view, true, this.f32138c);
            return this.f32138c.bottom;
        }

        @Override // androidx.recyclerview.widget.i
        public int q(View view) {
            this.f32136a.r0(view, true, this.f32138c);
            return this.f32138c.top;
        }

        @Override // androidx.recyclerview.widget.i
        public void r(int i10) {
            this.f32136a.H0(i10);
        }
    }

    /* synthetic */ i(RecyclerView.p pVar, a aVar) {
        this(pVar);
    }

    public static i a(RecyclerView.p pVar) {
        return new a(pVar);
    }

    public static i b(RecyclerView.p pVar, int i10) {
        if (i10 == 0) {
            return a(pVar);
        }
        if (i10 == 1) {
            return c(pVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static i c(RecyclerView.p pVar) {
        return new b(pVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.f32137b) {
            return 0;
        }
        return n() - this.f32137b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i10);

    public void s() {
        this.f32137b = n();
    }

    private i(RecyclerView.p pVar) {
        this.f32137b = Integer.MIN_VALUE;
        this.f32138c = new Rect();
        this.f32136a = pVar;
    }
}
