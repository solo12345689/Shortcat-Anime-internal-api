package b5;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: b5.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C3005g implements U4.v, U4.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bitmap f33163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V4.d f33164b;

    public C3005g(Bitmap bitmap, V4.d dVar) {
        this.f33163a = (Bitmap) o5.k.f(bitmap, "Bitmap must not be null");
        this.f33164b = (V4.d) o5.k.f(dVar, "BitmapPool must not be null");
    }

    public static C3005g c(Bitmap bitmap, V4.d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new C3005g(bitmap, dVar);
    }

    @Override // U4.v
    public Class a() {
        return Bitmap.class;
    }

    @Override // U4.v
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f33163a;
    }

    @Override // U4.v
    public int getSize() {
        return o5.l.i(this.f33163a);
    }

    @Override // U4.r
    public void initialize() {
        this.f33163a.prepareToDraw();
    }

    @Override // U4.v
    public void recycle() {
        this.f33164b.c(this.f33163a);
    }
}
