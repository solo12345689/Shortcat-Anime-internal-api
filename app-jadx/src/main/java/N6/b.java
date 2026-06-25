package N6;

import android.graphics.Bitmap;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f12683a = new b();

    private b() {
    }

    public static final boolean a(a aVar, C5.a aVar2) {
        if (aVar == null || aVar2 == null) {
            return false;
        }
        Object objC = aVar2.C();
        AbstractC5504s.g(objC, "get(...)");
        Bitmap bitmap = (Bitmap) objC;
        if (aVar.a()) {
            bitmap.setHasAlpha(true);
        }
        aVar.b(bitmap);
        return true;
    }
}
