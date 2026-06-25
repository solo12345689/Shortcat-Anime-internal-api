package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n extends RecyclerView.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    RecyclerView f32147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Scroller f32148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RecyclerView.t f32149c = new a();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends RecyclerView.t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f32150a = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, int i10) {
            super.a(recyclerView, i10);
            if (i10 == 0 && this.f32150a) {
                this.f32150a = false;
                n.this.j();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, int i10, int i11) {
            if (i10 == 0 && i11 == 0) {
                return;
            }
            this.f32150a = true;
        }
    }

    private void e() {
        this.f32147a.e1(this.f32149c);
        this.f32147a.setOnFlingListener(null);
    }

    private void h() {
        if (this.f32147a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f32147a.k(this.f32149c);
        this.f32147a.setOnFlingListener(this);
    }

    private boolean i(RecyclerView.p pVar, int i10, int i11) {
        RecyclerView.z zVarD;
        int iG;
        if (!(pVar instanceof RecyclerView.z.b) || (zVarD = d(pVar)) == null || (iG = g(pVar, i10, i11)) == -1) {
            return false;
        }
        zVarD.p(iG);
        pVar.N1(zVarD);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public boolean a(int i10, int i11) {
        RecyclerView.p layoutManager = this.f32147a.getLayoutManager();
        if (layoutManager == null || this.f32147a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f32147a.getMinFlingVelocity();
        return (Math.abs(i11) > minFlingVelocity || Math.abs(i10) > minFlingVelocity) && i(layoutManager, i10, i11);
    }

    public void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f32147a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            e();
        }
        this.f32147a = recyclerView;
        if (recyclerView != null) {
            h();
            this.f32148b = new Scroller(this.f32147a.getContext(), new DecelerateInterpolator());
            j();
        }
    }

    public abstract int[] c(RecyclerView.p pVar, View view);

    protected abstract RecyclerView.z d(RecyclerView.p pVar);

    public abstract View f(RecyclerView.p pVar);

    public abstract int g(RecyclerView.p pVar, int i10, int i11);

    void j() {
        RecyclerView.p layoutManager;
        View viewF;
        RecyclerView recyclerView = this.f32147a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewF = f(layoutManager)) == null) {
            return;
        }
        int[] iArrC = c(layoutManager, viewF);
        int i10 = iArrC[0];
        if (i10 == 0 && iArrC[1] == 0) {
            return;
        }
        this.f32147a.s1(i10, iArrC[1]);
    }
}
