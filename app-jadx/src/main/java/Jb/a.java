package Jb;

import android.graphics.Bitmap;
import com.bumptech.glide.load.data.d;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements com.bumptech.glide.load.data.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f9476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f9477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f9478d;

    public a(String str, int i10, int i11, float f10) {
        this.f9475a = str;
        this.f9476b = i10;
        this.f9477c = i11;
        this.f9478d = f10;
    }

    @Override // com.bumptech.glide.load.data.d
    public Class a() {
        return Bitmap.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public S4.a d() {
        return S4.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(com.bumptech.glide.g priority, d.a callback) {
        AbstractC5504s.h(priority, "priority");
        AbstractC5504s.h(callback, "callback");
        Bitmap bitmapD = b.d(b.f9479a, this.f9475a, this.f9476b, this.f9477c, this.f9478d, false, 16, null);
        if (bitmapD == null) {
            callback.c(new c(this.f9475a));
        } else {
            callback.f(bitmapD);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }
}
