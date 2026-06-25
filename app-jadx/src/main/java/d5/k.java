package d5;

import U4.v;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class k extends j {
    private k(Drawable drawable) {
        super(drawable);
    }

    static v c(Drawable drawable) {
        if (drawable != null) {
            return new k(drawable);
        }
        return null;
    }

    @Override // U4.v
    public Class a() {
        return this.f45018a.getClass();
    }

    @Override // U4.v
    public int getSize() {
        return Math.max(1, this.f45018a.getIntrinsicWidth() * this.f45018a.getIntrinsicHeight() * 4);
    }

    @Override // U4.v
    public void recycle() {
    }
}
