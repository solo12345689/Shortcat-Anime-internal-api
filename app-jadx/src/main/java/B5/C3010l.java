package b5;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: renamed from: b5.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C3010l extends AbstractC3006h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f33167b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(S4.f.f15942a);

    @Override // S4.f
    public void b(MessageDigest messageDigest) {
        messageDigest.update(f33167b);
    }

    @Override // b5.AbstractC3006h
    protected Bitmap c(V4.d dVar, Bitmap bitmap, int i10, int i11) {
        return Y.b(dVar, bitmap, i10, i11);
    }

    @Override // S4.f
    public boolean equals(Object obj) {
        return obj instanceof C3010l;
    }

    @Override // S4.f
    public int hashCode() {
        return -670243078;
    }
}
