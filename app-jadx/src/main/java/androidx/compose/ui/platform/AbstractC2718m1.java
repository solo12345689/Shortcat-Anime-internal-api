package androidx.compose.ui.platform;

import R0.C2092a;
import R0.C2099h;
import android.view.View;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: androidx.compose.ui.platform.m1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2718m1 {
    public static final C2712k1 a(List list, int i10) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((C2712k1) list.get(i11)).d() == i10) {
                return (C2712k1) list.get(i11);
            }
        }
        return null;
    }

    public static final Float b(SemanticsConfiguration semanticsConfiguration) {
        Function1 function1;
        ArrayList arrayList = new ArrayList();
        C2092a c2092a = (C2092a) R0.m.a(semanticsConfiguration, R0.l.f14981a.h());
        if (c2092a == null || (function1 = (Function1) c2092a.a()) == null || !((Boolean) function1.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (Float) arrayList.get(0);
    }

    public static final U0.T0 c(SemanticsConfiguration semanticsConfiguration) {
        Function1 function1;
        ArrayList arrayList = new ArrayList();
        C2092a c2092a = (C2092a) R0.m.a(semanticsConfiguration, R0.l.f14981a.i());
        if (c2092a == null || (function1 = (Function1) c2092a.a()) == null || !((Boolean) function1.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (U0.T0) arrayList.get(0);
    }

    public static final View d(C2681a0 c2681a0, int i10) {
        Object next;
        Iterator<T> it = c2681a0.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((K0.J) ((Map.Entry) next).getKey()).y() == i10) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (androidx.compose.ui.viewinterop.b) entry.getValue();
        }
        return null;
    }

    public static final String e(int i10) {
        C2099h.a aVar = C2099h.f14960b;
        if (C2099h.m(i10, aVar.a())) {
            return "android.widget.Button";
        }
        if (C2099h.m(i10, aVar.c())) {
            return "android.widget.CheckBox";
        }
        if (C2099h.m(i10, aVar.f())) {
            return "android.widget.RadioButton";
        }
        if (C2099h.m(i10, aVar.e())) {
            return "android.widget.ImageView";
        }
        if (C2099h.m(i10, aVar.d())) {
            return "android.widget.Spinner";
        }
        if (C2099h.m(i10, aVar.i())) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
}
