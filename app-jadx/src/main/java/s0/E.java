package s0;

import android.graphics.Canvas;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class E {

    /* JADX INFO: renamed from: a */
    private static final Canvas f58875a = new Canvas();

    public static final InterfaceC6364j0 a(InterfaceC6341b1 interfaceC6341b1) {
        C6335D c6335d = new C6335D();
        c6335d.y(new Canvas(O.b(interfaceC6341b1)));
        return c6335d;
    }

    public static final InterfaceC6364j0 b(Canvas canvas) {
        C6335D c6335d = new C6335D();
        c6335d.y(canvas);
        return c6335d;
    }

    public static final Canvas d(InterfaceC6364j0 interfaceC6364j0) {
        AbstractC5504s.f(interfaceC6364j0, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas");
        return ((C6335D) interfaceC6364j0).a();
    }
}
