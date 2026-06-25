package Z5;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: Z5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class C0399a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f23175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f23176b;
    }

    private static boolean a(int i10) {
        return i10 == 0 || i10 == -2;
    }

    public static void b(C0399a c0399a, float f10, ViewGroup.LayoutParams layoutParams, int i10, int i11) {
        if (f10 <= 0.0f || layoutParams == null) {
            return;
        }
        if (a(layoutParams.height)) {
            c0399a.f23176b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c0399a.f23175a) - i10) / f10) + i11), c0399a.f23176b), 1073741824);
        } else if (a(layoutParams.width)) {
            c0399a.f23175a = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c0399a.f23176b) - i11) * f10) + i10), c0399a.f23175a), 1073741824);
        }
    }
}
