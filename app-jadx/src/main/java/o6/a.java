package O6;

import E6.e;
import E6.g;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements D6.a {
    @Override // D6.a
    public boolean a(e image) {
        AbstractC5504s.h(image, "image");
        return image instanceof g;
    }

    @Override // D6.a
    public Drawable b(e image) {
        AbstractC5504s.h(image, "image");
        g gVar = image instanceof g ? (g) image : null;
        if (gVar != null) {
            return gVar.s1();
        }
        return null;
    }
}
