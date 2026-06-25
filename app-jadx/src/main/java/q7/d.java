package Q7;

import android.graphics.Rect;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.B;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadableMap b(Rect rect) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        B b10 = B.f37368a;
        writableMapCreateMap.putDouble("x", b10.e(rect.left));
        writableMapCreateMap.putDouble("y", b10.e(rect.top));
        writableMapCreateMap.putDouble("width", b10.e(rect.width()));
        writableMapCreateMap.putDouble("height", b10.e(rect.height()));
        return writableMapCreateMap;
    }
}
