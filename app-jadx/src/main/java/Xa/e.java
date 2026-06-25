package Xa;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import j.AbstractC5323a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e {
    public static final Drawable a(Context context, String str) {
        AbstractC5504s.h(context, "context");
        if (str == null) {
            return null;
        }
        int identifier = context.getResources().getIdentifier(str, "drawable", context.getPackageName());
        if (identifier > 0) {
            return AbstractC5323a.b(context, identifier);
        }
        int identifier2 = context.getResources().getIdentifier(str, "drawable", "android");
        if (identifier2 > 0) {
            return AbstractC5323a.b(context, identifier2);
        }
        Log.w("TabScreen", "TabScreen could not resolve drawable resource with the name " + str);
        return null;
    }
}
