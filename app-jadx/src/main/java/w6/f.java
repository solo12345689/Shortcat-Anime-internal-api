package w6;

import C5.h;
import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static f f62938a;

    private f() {
    }

    public static f b() {
        if (f62938a == null) {
            f62938a = new f();
        }
        return f62938a;
    }

    @Override // C5.h
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(Bitmap bitmap) {
        bitmap.recycle();
    }
}
