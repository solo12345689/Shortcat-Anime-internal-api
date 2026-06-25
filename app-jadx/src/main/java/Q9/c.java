package q9;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.internal.g;
import q9.b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static void a(C6164a c6164a, View view) {
        b(c6164a, view, null);
    }

    public static void b(C6164a c6164a, View view, FrameLayout frameLayout) {
        f(c6164a, view, frameLayout);
        if (c6164a.m() != null) {
            c6164a.m().setForeground(c6164a);
        } else {
            view.getOverlay().add(c6164a);
        }
    }

    public static SparseArray c(Context context, g gVar) {
        SparseArray sparseArray = new SparseArray(gVar.size());
        for (int i10 = 0; i10 < gVar.size(); i10++) {
            int iKeyAt = gVar.keyAt(i10);
            b.a aVar = (b.a) gVar.valueAt(i10);
            sparseArray.put(iKeyAt, aVar != null ? C6164a.h(context, aVar) : null);
        }
        return sparseArray;
    }

    public static g d(SparseArray sparseArray) {
        g gVar = new g();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int iKeyAt = sparseArray.keyAt(i10);
            C6164a c6164a = (C6164a) sparseArray.valueAt(i10);
            gVar.put(iKeyAt, c6164a != null ? c6164a.w() : null);
        }
        return gVar;
    }

    public static void e(C6164a c6164a, View view) {
        if (c6164a == null) {
            return;
        }
        if (c6164a.m() != null) {
            c6164a.m().setForeground(null);
        } else {
            view.getOverlay().remove(c6164a);
        }
    }

    public static void f(C6164a c6164a, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        c6164a.setBounds(rect);
        c6164a.Z(view, frameLayout);
    }

    public static void g(Rect rect, float f10, float f11, float f12, float f13) {
        rect.set((int) (f10 - f12), (int) (f11 - f13), (int) (f10 + f12), (int) (f11 + f13));
    }
}
