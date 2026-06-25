package T;

import K0.InterfaceC1794j;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import ie.InterfaceC5082a;
import kotlin.jvm.internal.AbstractC5504s;
import s0.InterfaceC6389t0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f16748a = AbstractC5504s.c(Build.DEVICE, "layoutlib");

    /* JADX INFO: Access modifiers changed from: private */
    public static final g c(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof g) {
                return (g) childAt;
            }
        }
        g gVar = new g(viewGroup.getContext());
        viewGroup.addView(gVar);
        return gVar;
    }

    public static final InterfaceC1794j d(B.k kVar, boolean z10, float f10, InterfaceC6389t0 interfaceC6389t0, InterfaceC5082a interfaceC5082a) {
        return f16748a ? new androidx.compose.material.ripple.c(kVar, z10, f10, interfaceC6389t0, interfaceC5082a, null) : new androidx.compose.material.ripple.b(kVar, z10, f10, interfaceC6389t0, interfaceC5082a, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewGroup e(View view) {
        Object obj = view;
        while (!(obj instanceof ViewGroup)) {
            ViewParent parent = ((View) obj).getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + obj + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            obj = parent;
        }
        return (ViewGroup) obj;
    }
}
