package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f32119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f32120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f32121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f32122e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f32125h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f32126i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f32118a = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f32123f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f32124g = 0;

    f() {
    }

    boolean a(RecyclerView.A a10) {
        int i10 = this.f32120c;
        return i10 >= 0 && i10 < a10.b();
    }

    View b(RecyclerView.v vVar) {
        View viewO = vVar.o(this.f32120c);
        this.f32120c += this.f32121d;
        return viewO;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f32119b + ", mCurrentPosition=" + this.f32120c + ", mItemDirection=" + this.f32121d + ", mLayoutDirection=" + this.f32122e + ", mStartLine=" + this.f32123f + ", mEndLine=" + this.f32124g + '}';
    }
}
