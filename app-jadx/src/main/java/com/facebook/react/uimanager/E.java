package com.facebook.react.uimanager;

import Ud.AbstractC2279u;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.AbstractC3247l;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final E f37520a = new E();

    private E() {
    }

    public static final void b(View view) {
        AbstractC5504s.h(view, "view");
        Boolean bool = (Boolean) view.getTag(AbstractC3247l.f36926t);
        if (bool != null) {
            view.setFocusable(bool.booleanValue());
        }
        if (((View) view.getTag(AbstractC3247l.f36913g)) != null) {
            view.setTag(AbstractC3247l.f36913g, null);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                AbstractC5504s.g(childAt, "getChildAt(...)");
                b(childAt);
            }
        }
    }

    public static final void d(View view) {
        AbstractC5504s.h(view, "view");
        Boolean bool = (Boolean) view.getTag(AbstractC3247l.f36926t);
        if (bool != null) {
            view.setFocusable(bool.booleanValue());
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                AbstractC5504s.g(childAt, "getChildAt(...)");
                d(childAt);
            }
        }
    }

    public final void a(View view, View parent, List axOrderList, View[] result) {
        int iR0;
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(parent, "parent");
        AbstractC5504s.h(axOrderList, "axOrderList");
        AbstractC5504s.h(result, "result");
        Object tag = view.getTag(AbstractC3247l.f36906G);
        view.setTag(AbstractC3247l.f36913g, parent);
        if (AbstractC2279u.e0(axOrderList, tag) && (iR0 = AbstractC2279u.r0(axOrderList, tag)) != -1) {
            result[iR0] = view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                AbstractC5504s.g(childAt, "getChildAt(...)");
                a(childAt, parent, axOrderList, result);
            }
        }
    }

    public final void c(View view, List axOrderList) {
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(axOrderList, "axOrderList");
        if (!AbstractC2279u.e0(axOrderList, view.getTag(AbstractC3247l.f36906G))) {
            if (view.getTag(AbstractC3247l.f36926t) == null) {
                view.setTag(AbstractC3247l.f36926t, Boolean.valueOf(view.isFocusable()));
            }
            view.setFocusable(false);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                AbstractC5504s.g(childAt, "getChildAt(...)");
                c(childAt, axOrderList);
            }
        }
    }
}
