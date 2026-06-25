package h2;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: h2.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractInterpolatorC4899d implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f47592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f47593b;

    protected AbstractInterpolatorC4899d(float[] fArr) {
        this.f47592a = fArr;
        this.f47593b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f47592a;
        int iMin = Math.min((int) ((fArr.length - 1) * f10), fArr.length - 2);
        float f11 = this.f47593b;
        float f12 = (f10 - (iMin * f11)) / f11;
        float[] fArr2 = this.f47592a;
        float f13 = fArr2[iMin];
        return f13 + (f12 * (fArr2[iMin + 1] - f13));
    }
}
