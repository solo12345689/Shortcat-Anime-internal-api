package Y0;

import Y0.K;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o0 f22708a = new o0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ThreadLocal f22709b = new ThreadLocal();

    private o0() {
    }

    public final Typeface a(Typeface typeface, K.d dVar, Context context) {
        if (typeface == null) {
            return null;
        }
        if (dVar.b().isEmpty()) {
            return typeface;
        }
        Paint paint = (Paint) f22709b.get();
        if (paint == null) {
            paint = new Paint();
            f22709b.set(paint);
        }
        paint.setFontVariationSettings(null);
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(Y.e(dVar, context));
        return paint.getTypeface();
    }
}
