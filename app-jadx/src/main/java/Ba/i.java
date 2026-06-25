package Ba;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.L0;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i {

    /* JADX INFO: renamed from: a */
    private static final int[] f1592a = new int[2];

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v10) {
            AbstractC5504s.h(v10, "v");
            v10.removeOnAttachStateChangeListener(this);
            v10.requestApplyInsets();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v10) {
            AbstractC5504s.h(v10, "v");
        }
    }

    public static final void a(View view, Rect rect) {
        AbstractC5504s.h(view, "<this>");
        AbstractC5504s.h(rect, "rect");
        if (!view.isAttachedToWindow()) {
            Fa.a.d(Fa.a.f6597a, "View.copyBoundsInWindow", "Can not copy bounds as view is not attached to window", null, 4, null);
            return;
        }
        rect.set(0, 0, view.getWidth(), view.getHeight());
        int[] iArr = f1592a;
        view.getLocationInWindow(iArr);
        rect.offset(iArr[0], iArr[1]);
    }

    public static final int[] b(View view) {
        AbstractC5504s.h(view, "<this>");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static final L0 c(View view, L0 insets, boolean z10, boolean z11) {
        AbstractC5504s.h(view, "<this>");
        AbstractC5504s.h(insets, "insets");
        if (Build.VERSION.SDK_INT < 30) {
            L0 l0W = AbstractC2747a0.W(view, insets);
            AbstractC5504s.g(l0W, "onApplyWindowInsets(...)");
            L0 l0S = l0W.s(l0W.k(), z10 ? 0 : l0W.m(), l0W.l(), l0W.j());
            AbstractC5504s.g(l0S, "replaceSystemWindowInsets(...)");
            return l0S;
        }
        A1.b bVarF = insets.f(L0.p.i());
        AbstractC5504s.g(bVarF, "getInsets(...)");
        A1.b bVarF2 = insets.f(L0.p.g());
        AbstractC5504s.g(bVarF2, "getInsets(...)");
        A1.b bVarF3 = insets.f(L0.p.d());
        AbstractC5504s.g(bVarF3, "getInsets(...)");
        int i10 = z10 ? 0 : bVarF.f105b;
        int i11 = bVarF3.f107d;
        if (i11 <= 0) {
            i11 = bVarF2.f107d;
        }
        L0.a aVar = new L0.a(insets);
        int i12 = L0.p.i();
        int i13 = bVarF.f104a;
        int i14 = bVarF.f106c;
        if (z11) {
            i11 = bVarF.f107d;
        }
        L0 l0A = aVar.b(i12, A1.b.c(i13, i10, i14, i11)).a();
        AbstractC5504s.g(l0A, "build(...)");
        L0 l0W2 = AbstractC2747a0.W(view, l0A);
        AbstractC5504s.g(l0W2, "onApplyWindowInsets(...)");
        return l0W2;
    }

    public static final void d(View view) {
        AbstractC5504s.h(view, "<this>");
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new a());
        }
    }
}
