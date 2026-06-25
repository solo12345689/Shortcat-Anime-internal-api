package b5;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class T implements U4.v, U4.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f33123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final U4.v f33124b;

    private T(Resources resources, U4.v vVar) {
        this.f33123a = (Resources) o5.k.e(resources);
        this.f33124b = (U4.v) o5.k.e(vVar);
    }

    public static U4.v c(Resources resources, U4.v vVar) {
        if (vVar == null) {
            return null;
        }
        return new T(resources, vVar);
    }

    @Override // U4.v
    public Class a() {
        return BitmapDrawable.class;
    }

    @Override // U4.v
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f33123a, (Bitmap) this.f33124b.get());
    }

    @Override // U4.v
    public int getSize() {
        return this.f33124b.getSize();
    }

    @Override // U4.r
    public void initialize() {
        U4.v vVar = this.f33124b;
        if (vVar instanceof U4.r) {
            ((U4.r) vVar).initialize();
        }
    }

    @Override // U4.v
    public void recycle() {
        this.f33124b.recycle();
    }
}
