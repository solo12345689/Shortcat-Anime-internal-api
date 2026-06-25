package d5;

import U4.r;
import U4.v;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import f5.C4776c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j implements v, r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Drawable f45018a;

    public j(Drawable drawable) {
        this.f45018a = (Drawable) o5.k.e(drawable);
    }

    @Override // U4.v
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Drawable get() {
        Drawable.ConstantState constantState = this.f45018a.getConstantState();
        return constantState == null ? this.f45018a : constantState.newDrawable();
    }

    public void initialize() {
        Drawable drawable = this.f45018a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof C4776c) {
            ((C4776c) drawable).e().prepareToDraw();
        }
    }
}
