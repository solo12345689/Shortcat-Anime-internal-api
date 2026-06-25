package androidx.compose.ui.platform;

import Y.AbstractC2389a;
import Y.AbstractC2460y;
import Y.InterfaceC2457x;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class O1 {

    /* JADX INFO: renamed from: a */
    private static final ViewGroup.LayoutParams f27336a = new ViewGroup.LayoutParams(-2, -2);

    public static final AbstractC2389a a(K0.J j10) {
        return new K0.K0(j10);
    }

    private static final InterfaceC2457x b(AndroidComposeView androidComposeView, AbstractC2460y abstractC2460y, Function2 function2) {
        if (T0.b() && androidComposeView.getTag(l0.l.f52358K) == null) {
            androidComposeView.setTag(l0.l.f52358K, Collections.newSetFromMap(new WeakHashMap()));
        }
        Object tag = androidComposeView.getView().getTag(l0.l.f52359L);
        L1 l12 = tag instanceof L1 ? (L1) tag : null;
        if (l12 == null) {
            l12 = new L1(androidComposeView, Y.C.a(new K0.K0(androidComposeView.getRoot()), abstractC2460y));
            androidComposeView.getView().setTag(l0.l.f52359L, l12);
        }
        l12.h(function2);
        if (!AbstractC5504s.c(androidComposeView.getCoroutineContext(), abstractC2460y.j())) {
            androidComposeView.setCoroutineContext(abstractC2460y.j());
        }
        return l12;
    }

    public static final InterfaceC2457x c(AbstractC2680a abstractC2680a, AbstractC2460y abstractC2460y, Function2 function2) {
        L0.f27282a.b();
        AndroidComposeView androidComposeView = null;
        if (abstractC2680a.getChildCount() > 0) {
            View childAt = abstractC2680a.getChildAt(0);
            if (childAt instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) childAt;
            }
        } else {
            abstractC2680a.removeAllViews();
        }
        if (androidComposeView == null) {
            androidComposeView = new AndroidComposeView(abstractC2680a.getContext(), abstractC2460y.j());
            abstractC2680a.addView(androidComposeView.getView(), f27336a);
        }
        return b(androidComposeView, abstractC2460y, function2);
    }
}
