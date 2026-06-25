package Ka;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;
import oe.C5868d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a */
    public static final c f10972a = new c();

    private c() {
    }

    private final EditText b(View view, int i10) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return null;
        }
        int iIndexOfChild = viewGroup.indexOfChild(view);
        int i11 = i10 > 0 ? iIndexOfChild + 1 : iIndexOfChild - 1;
        int childCount = i10 > 0 ? viewGroup.getChildCount() : -1;
        while (i11 != childCount) {
            View childAt = viewGroup.getChildAt(i11);
            AbstractC5504s.e(childAt);
            EditText editTextD = d(childAt, i10);
            if (editTextD != null) {
                return editTextD;
            }
            i11 += i10;
        }
        return b(viewGroup, i10);
    }

    private final EditText c(ViewGroup viewGroup, int i10) {
        int childCount = viewGroup.getChildCount();
        C5868d c5868dX = i10 > 0 ? AbstractC5874j.x(0, childCount) : AbstractC5874j.s(childCount - 1, 0);
        int iF = c5868dX.f();
        int i11 = c5868dX.i();
        int iL = c5868dX.l();
        if ((iL <= 0 || iF > i11) && (iL >= 0 || i11 > iF)) {
            return null;
        }
        while (true) {
            View childAt = viewGroup.getChildAt(iF);
            AbstractC5504s.e(childAt);
            EditText editTextD = d(childAt, i10);
            if (editTextD != null) {
                return editTextD;
            }
            if (iF == i11) {
                return null;
            }
            iF += iL;
        }
    }

    private final EditText d(View view, int i10) {
        if (i(view)) {
            AbstractC5504s.f(view, "null cannot be cast to non-null type android.widget.EditText");
            return (EditText) view;
        }
        if (view instanceof ViewGroup) {
            return c((ViewGroup) view, i10);
        }
        return null;
    }

    private final EditText e(View view) {
        return b(view, 1);
    }

    private final EditText f(View view) {
        return b(view, -1);
    }

    private static final void h(List list, View view) {
        if (f10972a.i(view)) {
            AbstractC5504s.f(view, "null cannot be cast to non-null type android.widget.EditText");
            list.add((EditText) view);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                h(list, viewGroup.getChildAt(i10));
            }
        }
    }

    private final boolean i(View view) {
        return (view instanceof EditText) && ((EditText) view).isEnabled();
    }

    public static final void k(EditText editText) {
        Ba.c.e(editText);
    }

    public final List g(View view) {
        ArrayList arrayList = new ArrayList();
        h(arrayList, view);
        return arrayList;
    }

    public final void j(String direction, View view) {
        AbstractC5504s.h(direction, "direction");
        AbstractC5504s.h(view, "view");
        final EditText editTextE = AbstractC5504s.c(direction, "next") ? e(view) : f(view);
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: Ka.b
            @Override // java.lang.Runnable
            public final void run() {
                c.k(editTextE);
            }
        });
    }
}
