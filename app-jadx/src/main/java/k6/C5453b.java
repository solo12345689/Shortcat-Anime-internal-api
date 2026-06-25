package k6;

import android.graphics.PointF;
import android.graphics.Rect;
import android.net.Uri;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import l6.InterfaceC5557b;

/* JADX INFO: renamed from: k6.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5453b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5453b f52133a = new C5453b();

    private C5453b() {
    }

    public static final InterfaceC5557b.a a(Map componentAttribution, Map shortcutAttribution, Map map, Map map2, Rect rect, String str, PointF pointF, Map map3, Object obj, boolean z10, Uri uri) {
        AbstractC5504s.h(componentAttribution, "componentAttribution");
        AbstractC5504s.h(shortcutAttribution, "shortcutAttribution");
        InterfaceC5557b.a aVar = new InterfaceC5557b.a();
        if (rect != null) {
            aVar.f52557h = rect.width();
            aVar.f52558i = rect.height();
        }
        aVar.f52559j = str;
        if (pointF != null) {
            aVar.f52560k = Float.valueOf(pointF.x);
            aVar.f52561l = Float.valueOf(pointF.y);
        }
        aVar.f52555f = obj;
        aVar.f52562m = z10;
        aVar.f52556g = uri;
        aVar.f52552c = map;
        aVar.f52553d = map3;
        aVar.f52551b = shortcutAttribution;
        aVar.f52550a = componentAttribution;
        aVar.f52554e = map2;
        return aVar;
    }
}
