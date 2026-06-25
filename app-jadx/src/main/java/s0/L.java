package s0;

import android.graphics.Bitmap;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class L implements InterfaceC6341b1 {

    /* JADX INFO: renamed from: b */
    private final Bitmap f58901b;

    public L(Bitmap bitmap) {
        this.f58901b = bitmap;
    }

    @Override // s0.InterfaceC6341b1
    public void a() {
        this.f58901b.prepareToDraw();
    }

    @Override // s0.InterfaceC6341b1
    public int b() {
        Bitmap.Config config = this.f58901b.getConfig();
        AbstractC5504s.e(config);
        return O.e(config);
    }

    public final Bitmap c() {
        return this.f58901b;
    }

    @Override // s0.InterfaceC6341b1
    public int getHeight() {
        return this.f58901b.getHeight();
    }

    @Override // s0.InterfaceC6341b1
    public int getWidth() {
        return this.f58901b.getWidth();
    }
}
