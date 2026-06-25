package p9;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import h2.C4896a;
import h2.C4897b;
import h2.C4898c;

/* JADX INFO: renamed from: p9.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5946a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeInterpolator f55826a = new LinearInterpolator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TimeInterpolator f55827b = new C4897b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TimeInterpolator f55828c = new C4896a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final TimeInterpolator f55829d = new C4898c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final TimeInterpolator f55830e = new DecelerateInterpolator();

    public static float a(float f10, float f11, float f12) {
        return f10 + (f12 * (f11 - f10));
    }

    public static float b(float f10, float f11, float f12, float f13, float f14) {
        return f14 <= f12 ? f10 : f14 >= f13 ? f11 : a(f10, f11, (f14 - f12) / (f13 - f12));
    }

    public static int c(int i10, int i11, float f10) {
        return i10 + Math.round(f10 * (i11 - i10));
    }
}
