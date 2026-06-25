package J6;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import s5.InterfaceC6433d;
import s5.i;
import y5.k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class a extends K6.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f9447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f9448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC6433d f9449e;

    public a(int i10, int i11) {
        k.b(Boolean.valueOf(i10 > 0));
        k.b(Boolean.valueOf(i11 > 0));
        this.f9447c = i10;
        this.f9448d = i11;
    }

    @Override // K6.a, K6.d
    public InterfaceC6433d b() {
        if (this.f9449e == null) {
            this.f9449e = new i(String.format(null, "i%dr%d", Integer.valueOf(this.f9447c), Integer.valueOf(this.f9448d)));
        }
        return this.f9449e;
    }

    @Override // K6.a
    public void d(Bitmap bitmap) {
        NativeBlurFilter.a(bitmap, this.f9447c, this.f9448d);
    }
}
