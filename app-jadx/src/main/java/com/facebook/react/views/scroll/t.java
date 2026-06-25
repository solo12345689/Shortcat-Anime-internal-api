package com.facebook.react.views.scroll;

import android.graphics.Rect;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f38161a;

    static {
        f38161a = Y6.a.f22860b || Y6.a.f22861c || Y6.a.f22862d;
    }

    public static final boolean a() {
        return f38161a;
    }

    public static final boolean b(Rect rect1, Rect rect2) {
        AbstractC5504s.h(rect1, "rect1");
        AbstractC5504s.h(rect2, "rect2");
        return rect1.top < rect2.bottom && rect2.top < rect1.bottom && rect1.left < rect2.right && rect2.left < rect1.right;
    }
}
