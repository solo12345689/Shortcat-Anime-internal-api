package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f31267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f31268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f31269c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f31270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f31271b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f31272c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f31273d;

        private c() {
        }

        public void a(float f10, float f11, boolean z10) {
            this.f31270a = f10;
            this.f31271b = f11;
            this.f31272c = z10;
            if (this.f31273d) {
                return;
            }
            this.f31273d = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f31273d = false;
            AspectRatioFrameLayout.a(AspectRatioFrameLayout.this);
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31269c = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, G3.D.f7084a, 0, 0);
            try {
                this.f31269c = typedArrayObtainStyledAttributes.getInt(G3.D.f7086b, 0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f31267a = new c();
    }

    static /* synthetic */ b a(AspectRatioFrameLayout aspectRatioFrameLayout) {
        aspectRatioFrameLayout.getClass();
        return null;
    }

    public int getResizeMode() {
        return this.f31269c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        float f10;
        float f11;
        super.onMeasure(i10, i11);
        if (this.f31268b <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f12 = measuredWidth;
        float f13 = measuredHeight;
        float f14 = f12 / f13;
        float f15 = (this.f31268b / f14) - 1.0f;
        if (Math.abs(f15) <= 0.01f) {
            this.f31267a.a(this.f31268b, f14, false);
            return;
        }
        int i12 = this.f31269c;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    f10 = this.f31268b;
                } else if (i12 == 4) {
                    if (f15 > 0.0f) {
                        f10 = this.f31268b;
                    } else {
                        f11 = this.f31268b;
                    }
                }
                measuredWidth = (int) (f13 * f10);
            } else {
                f11 = this.f31268b;
            }
            measuredHeight = (int) (f12 / f11);
        } else if (f15 > 0.0f) {
            f11 = this.f31268b;
            measuredHeight = (int) (f12 / f11);
        } else {
            f10 = this.f31268b;
            measuredWidth = (int) (f13 * f10);
        }
        this.f31267a.a(this.f31268b, f14, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f10) {
        if (this.f31268b != f10) {
            this.f31268b = f10;
            requestLayout();
        }
    }

    public void setResizeMode(int i10) {
        if (this.f31269c != i10) {
            this.f31269c = i10;
            requestLayout();
        }
    }

    public void setAspectRatioListener(b bVar) {
    }
}
