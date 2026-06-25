package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class g0 extends Y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f25404b;

    public g0(Context context, Resources resources) {
        super(resources);
        this.f25404b = new WeakReference(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i10) {
        Drawable drawableA = a(i10);
        Context context = (Context) this.f25404b.get();
        if (drawableA != null && context != null) {
            X.g().w(context, i10, drawableA);
        }
        return drawableA;
    }
}
