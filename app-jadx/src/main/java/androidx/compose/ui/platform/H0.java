package androidx.compose.ui.platform;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class H0 {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f27231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f27232b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, View view2) {
            super(1);
            this.f27231a = view;
            this.f27232b = view2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(View view) {
            return Boolean.valueOf(H0.i(this.f27231a, view, view.getNextFocusForwardId()) == this.f27232b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f27233a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10) {
            super(1);
            this.f27233a = i10;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(View view) {
            return Boolean.valueOf(view.getId() == this.f27233a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(View view, ArrayList arrayList, int i10) {
        if (Build.VERSION.SDK_INT < 26) {
            e(view, arrayList, view.isInTouchMode());
        } else {
            view.addFocusables(arrayList, i10, view.isInTouchMode() ? 1 : 0);
        }
    }

    private static final void e(View view, ArrayList arrayList, boolean z10) {
        boolean z11 = view.getVisibility() == 0 && view.isFocusable() && view.isEnabled() && view.getWidth() > 0 && view.getHeight() > 0 && (!z10 || view.isFocusableInTouchMode());
        if (!(view instanceof ViewGroup)) {
            if (z11) {
                arrayList.add(view);
                return;
            }
            return;
        }
        int size = arrayList.size();
        ViewGroup viewGroup = (ViewGroup) view;
        boolean z12 = viewGroup.getDescendantFocusability() == 131072;
        if (z11 && z12) {
            arrayList.add(view);
        }
        if (viewGroup.getDescendantFocusability() != 393216) {
            int childCount = viewGroup.getChildCount();
            View[] viewArr = new View[childCount];
            for (int i10 = 0; i10 < childCount; i10++) {
                viewArr[i10] = viewGroup.getChildAt(i10);
            }
            K0.f27246a.d(viewArr, viewGroup, viewGroup.getLayoutDirection() == 1);
            for (int i11 = 0; i11 < childCount; i11++) {
                e(viewArr[i11], arrayList, z10);
            }
        }
        if (z11 && !z12 && size == arrayList.size()) {
            arrayList.add(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View f(View view, View view2, int i10) {
        int nextFocusForwardId;
        if (i10 == 1) {
            if (view.getId() == -1) {
                return null;
            }
            return g(view2, view, new a(view2, view));
        }
        if (i10 == 2 && (nextFocusForwardId = view.getNextFocusForwardId()) != -1) {
            return i(view2, view, nextFocusForwardId);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final android.view.View g(android.view.View r4, android.view.View r5, kotlin.jvm.functions.Function1 r6) {
        /*
            r0 = 0
            r1 = r0
        L2:
            android.view.View r1 = h(r5, r6, r1)
            if (r1 != 0) goto L1d
            if (r5 != r4) goto Lb
            goto L1d
        Lb:
            android.view.ViewParent r1 = r5.getParent()
            if (r1 == 0) goto L1c
            boolean r2 = r1 instanceof android.view.View
            if (r2 != 0) goto L16
            goto L1c
        L16:
            android.view.View r1 = (android.view.View) r1
            r3 = r1
            r1 = r5
            r5 = r3
            goto L2
        L1c:
            return r0
        L1d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.H0.g(android.view.View, android.view.View, kotlin.jvm.functions.Function1):android.view.View");
    }

    private static final View h(View view, Function1 function1, View view2) {
        View viewH;
        if (((Boolean) function1.invoke(view)).booleanValue()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != view2 && (viewH = h(childAt, function1, view2)) != null) {
                return viewH;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View i(View view, View view2, int i10) {
        return g(view, view2, new b(i10));
    }
}
