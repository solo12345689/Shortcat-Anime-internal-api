package P0;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AbstractC5504s;
import s0.InterfaceC6341b1;
import s0.O;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final InterfaceC6341b1 a(InterfaceC6341b1.a aVar, Resources resources, int i10) {
        Drawable drawable = resources.getDrawable(i10, null);
        AbstractC5504s.f(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        return O.c(((BitmapDrawable) drawable).getBitmap());
    }
}
