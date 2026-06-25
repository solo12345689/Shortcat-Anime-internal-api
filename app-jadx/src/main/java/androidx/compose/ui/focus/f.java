package androidx.compose.ui.focus;

import C0.a;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.focus.d;
import androidx.compose.ui.focus.e;
import androidx.compose.ui.platform.AndroidComposeView;
import i1.EnumC5027t;
import r0.C6226h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final C6226h a(View view, View view2) {
        e.a aVar = e.f26661a;
        view.getLocationInWindow(aVar.a());
        int i10 = aVar.a()[0];
        int i11 = aVar.a()[1];
        view2.getLocationInWindow(aVar.a());
        float f10 = i10 - aVar.a()[0];
        float f11 = i11 - aVar.a()[1];
        return new C6226h(f10, f11, view.getWidth() + f10, view.getHeight() + f11);
    }

    public static final boolean b(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof AndroidComposeView) {
            return ((AndroidComposeView) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    public static final Integer c(int i10) {
        d.a aVar = d.f26651b;
        if (d.l(i10, aVar.h())) {
            return 33;
        }
        if (d.l(i10, aVar.a())) {
            return 130;
        }
        if (d.l(i10, aVar.d())) {
            return 17;
        }
        if (d.l(i10, aVar.g())) {
            return 66;
        }
        if (d.l(i10, aVar.e())) {
            return 2;
        }
        return d.l(i10, aVar.f()) ? 1 : null;
    }

    public static final d d(int i10) {
        if (i10 == 1) {
            return d.i(d.f26651b.f());
        }
        if (i10 == 2) {
            return d.i(d.f26651b.e());
        }
        if (i10 == 17) {
            return d.i(d.f26651b.d());
        }
        if (i10 == 33) {
            return d.i(d.f26651b.h());
        }
        if (i10 == 66) {
            return d.i(d.f26651b.g());
        }
        if (i10 != 130) {
            return null;
        }
        return d.i(d.f26651b.a());
    }

    public static final d e(KeyEvent keyEvent) {
        long jA = C0.d.a(keyEvent);
        a.C0028a c0028a = C0.a.f2332b;
        if (C0.a.r(jA, c0028a.j())) {
            return d.i(d.f26651b.f());
        }
        if (C0.a.r(jA, c0028a.i())) {
            return d.i(d.f26651b.e());
        }
        if (C0.a.r(jA, c0028a.n())) {
            return d.i(C0.d.f(keyEvent) ? d.f26651b.f() : d.f26651b.e());
        }
        if (C0.a.r(jA, c0028a.e())) {
            return d.i(d.f26651b.g());
        }
        if (C0.a.r(jA, c0028a.d())) {
            return d.i(d.f26651b.d());
        }
        if (C0.a.r(jA, c0028a.f()) || C0.a.r(jA, c0028a.m())) {
            return d.i(d.f26651b.h());
        }
        if (C0.a.r(jA, c0028a.c()) || C0.a.r(jA, c0028a.l())) {
            return d.i(d.f26651b.a());
        }
        if (C0.a.r(jA, c0028a.b()) || C0.a.r(jA, c0028a.g()) || C0.a.r(jA, c0028a.k())) {
            return d.i(d.f26651b.b());
        }
        if (C0.a.r(jA, c0028a.a()) || C0.a.r(jA, c0028a.h())) {
            return d.i(d.f26651b.c());
        }
        return null;
    }

    public static final EnumC5027t f(int i10) {
        if (i10 == 0) {
            return EnumC5027t.f48573a;
        }
        if (i10 != 1) {
            return null;
        }
        return EnumC5027t.f48574b;
    }
}
