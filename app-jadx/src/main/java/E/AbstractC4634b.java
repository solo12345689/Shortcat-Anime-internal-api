package e;

import P3.m;
import Y.AbstractC2460y;
import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.AbstractActivityC2640j;
import androidx.compose.ui.platform.C2737v0;
import androidx.lifecycle.Z;
import androidx.lifecycle.a0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: e.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4634b {

    /* JADX INFO: renamed from: a */
    private static final ViewGroup.LayoutParams f45761a = new ViewGroup.LayoutParams(-2, -2);

    public static final void a(AbstractActivityC2640j abstractActivityC2640j, AbstractC2460y abstractC2460y, Function2 function2) {
        View childAt = ((ViewGroup) abstractActivityC2640j.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        C2737v0 c2737v0 = childAt instanceof C2737v0 ? (C2737v0) childAt : null;
        if (c2737v0 != null) {
            c2737v0.setParentCompositionContext(abstractC2460y);
            c2737v0.setContent(function2);
            return;
        }
        C2737v0 c2737v02 = new C2737v0(abstractActivityC2640j, null, 0, 6, null);
        c2737v02.setParentCompositionContext(abstractC2460y);
        c2737v02.setContent(function2);
        c(abstractActivityC2640j);
        abstractActivityC2640j.setContentView(c2737v02, f45761a);
    }

    public static /* synthetic */ void b(AbstractActivityC2640j abstractActivityC2640j, AbstractC2460y abstractC2460y, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            abstractC2460y = null;
        }
        a(abstractActivityC2640j, abstractC2460y, function2);
    }

    private static final void c(AbstractActivityC2640j abstractActivityC2640j) {
        View decorView = abstractActivityC2640j.getWindow().getDecorView();
        if (Z.a(decorView) == null) {
            Z.b(decorView, abstractActivityC2640j);
        }
        if (a0.a(decorView) == null) {
            a0.b(decorView, abstractActivityC2640j);
        }
        if (m.a(decorView) == null) {
            m.b(decorView, abstractActivityC2640j);
        }
    }
}
