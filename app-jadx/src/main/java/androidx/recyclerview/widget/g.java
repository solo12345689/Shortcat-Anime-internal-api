package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class g extends RecyclerView.z {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected PointF f32129k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final DisplayMetrics f32130l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f32132n;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final LinearInterpolator f32127i = new LinearInterpolator();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final DecelerateInterpolator f32128j = new DecelerateInterpolator();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f32131m = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected int f32133o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected int f32134p = 0;

    public g(Context context) {
        this.f32130l = context.getResources().getDisplayMetrics();
    }

    private float A() {
        if (!this.f32131m) {
            this.f32132n = v(this.f32130l);
            this.f32131m = true;
        }
        return this.f32132n;
    }

    private int y(int i10, int i11) {
        int i12 = i10 - i11;
        if (i10 * i12 <= 0) {
            return 0;
        }
        return i12;
    }

    protected int B() {
        PointF pointF = this.f32129k;
        if (pointF == null) {
            return 0;
        }
        float f10 = pointF.y;
        if (f10 == 0.0f) {
            return 0;
        }
        return f10 > 0.0f ? 1 : -1;
    }

    protected void C(RecyclerView.z.a aVar) {
        PointF pointFA = a(f());
        if (pointFA == null || (pointFA.x == 0.0f && pointFA.y == 0.0f)) {
            aVar.b(f());
            r();
            return;
        }
        i(pointFA);
        this.f32129k = pointFA;
        this.f32133o = (int) (pointFA.x * 10000.0f);
        this.f32134p = (int) (pointFA.y * 10000.0f);
        aVar.d((int) (this.f32133o * 1.2f), (int) (this.f32134p * 1.2f), (int) (x(ColorExtractionConstants.MAX_PIXEL_SAMPLES) * 1.2f), this.f32127i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    protected void l(int i10, int i11, RecyclerView.A a10, RecyclerView.z.a aVar) {
        if (c() == 0) {
            r();
            return;
        }
        this.f32133o = y(this.f32133o, i10);
        int iY = y(this.f32134p, i11);
        this.f32134p = iY;
        if (this.f32133o == 0 && iY == 0) {
            C(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    protected void n() {
        this.f32134p = 0;
        this.f32133o = 0;
        this.f32129k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    protected void o(View view, RecyclerView.A a10, RecyclerView.z.a aVar) {
        int iT = t(view, z());
        int iU = u(view, B());
        int iW = w((int) Math.sqrt((iT * iT) + (iU * iU)));
        if (iW > 0) {
            aVar.d(-iT, -iU, iW, this.f32128j);
        }
    }

    public int s(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == -1) {
            return i12 - i10;
        }
        if (i14 != 0) {
            if (i14 == 1) {
                return i13 - i11;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i15 = i12 - i10;
        if (i15 > 0) {
            return i15;
        }
        int i16 = i13 - i11;
        if (i16 < 0) {
            return i16;
        }
        return 0;
    }

    public int t(View view, int i10) {
        RecyclerView.p pVarE = e();
        if (pVarE == null || !pVarE.p()) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        return s(pVarE.V(view) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, pVarE.Y(view) + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, pVarE.i0(), pVarE.s0() - pVarE.j0(), i10);
    }

    public int u(View view, int i10) {
        RecyclerView.p pVarE = e();
        if (pVarE == null || !pVarE.q()) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        return s(pVarE.Z(view) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, pVarE.T(view) + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin, pVarE.k0(), pVarE.b0() - pVarE.h0(), i10);
    }

    protected float v(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    protected int w(int i10) {
        return (int) Math.ceil(((double) x(i10)) / 0.3356d);
    }

    protected int x(int i10) {
        return (int) Math.ceil(Math.abs(i10) * A());
    }

    protected int z() {
        PointF pointF = this.f32129k;
        if (pointF == null) {
            return 0;
        }
        float f10 = pointF.x;
        if (f10 == 0.0f) {
            return 0;
        }
        return f10 > 0.0f ? 1 : -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    protected void m() {
    }
}
