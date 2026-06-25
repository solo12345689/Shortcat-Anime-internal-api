package H9;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i {
    static e a(int i10) {
        return i10 != 0 ? i10 != 1 ? b() : new f() : new k();
    }

    static e b() {
        return new k();
    }

    static g c() {
        return new g();
    }

    public static void d(View view, float f10) {
        Drawable background = view.getBackground();
        if (background instanceof h) {
            ((h) background).c0(f10);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof h) {
            f(view, (h) background);
        }
    }

    public static void f(View view, h hVar) {
        if (hVar.T()) {
            hVar.h0(com.google.android.material.internal.p.f(view));
        }
    }
}
