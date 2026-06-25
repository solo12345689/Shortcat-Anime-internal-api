package H6;

import android.graphics.Bitmap;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class s implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f8005a;

    public s() {
        Set setB = y5.m.b();
        AbstractC5504s.g(setB, "newIdentityHashSet(...)");
        this.f8005a = setB;
    }

    @Override // B5.f
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Bitmap get(int i10) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, (int) Math.ceil(((double) i10) / 2.0d), Bitmap.Config.RGB_565);
        AbstractC5504s.g(bitmapCreateBitmap, "createBitmap(...)");
        this.f8005a.add(bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    @Override // B5.f, C5.h
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void a(Bitmap value) {
        AbstractC5504s.h(value, "value");
        this.f8005a.remove(value);
        value.recycle();
    }
}
