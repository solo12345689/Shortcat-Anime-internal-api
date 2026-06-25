package com.th3rdwave.safeareacontext;

import Td.z;
import Ud.S;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.B;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class q {
    public static final Map a(a insets) {
        AbstractC5504s.h(insets, "insets");
        return S.l(z.a("top", Float.valueOf(B.g(insets.d()))), z.a("right", Float.valueOf(B.g(insets.c()))), z.a("bottom", Float.valueOf(B.g(insets.a()))), z.a("left", Float.valueOf(B.g(insets.b()))));
    }

    public static final WritableMap b(a insets) {
        AbstractC5504s.h(insets, "insets");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("top", B.g(insets.d()));
        writableMapCreateMap.putDouble("right", B.g(insets.c()));
        writableMapCreateMap.putDouble("bottom", B.g(insets.a()));
        writableMapCreateMap.putDouble("left", B.g(insets.b()));
        return writableMapCreateMap;
    }

    public static final Map c(c rect) {
        AbstractC5504s.h(rect, "rect");
        return S.l(z.a("x", Float.valueOf(B.g(rect.c()))), z.a("y", Float.valueOf(B.g(rect.d()))), z.a("width", Float.valueOf(B.g(rect.b()))), z.a("height", Float.valueOf(B.g(rect.a()))));
    }

    public static final WritableMap d(c rect) {
        AbstractC5504s.h(rect, "rect");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("x", B.g(rect.c()));
        writableMapCreateMap.putDouble("y", B.g(rect.d()));
        writableMapCreateMap.putDouble("width", B.g(rect.b()));
        writableMapCreateMap.putDouble("height", B.g(rect.a()));
        return writableMapCreateMap;
    }
}
