package Md;

import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class n {
    public static final boolean a(View view) {
        AbstractC5504s.h(view, "<this>");
        return view.getGlobalVisibleRect(new Rect());
    }

    public static final float b(View view) {
        AbstractC5504s.h(view, "<this>");
        Rect rect = new Rect();
        if (!view.getGlobalVisibleRect(rect)) {
            return 0.0f;
        }
        int iHeight = rect.height() * rect.width();
        int height = view.getHeight() * view.getWidth();
        if (height == 0) {
            return 0.0f;
        }
        return (iHeight * 100.0f) / height;
    }
}
