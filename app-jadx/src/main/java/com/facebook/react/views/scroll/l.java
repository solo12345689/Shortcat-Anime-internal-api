package com.facebook.react.views.scroll;

import L1.B;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.C2746a;
import com.facebook.react.AbstractC3247l;
import com.facebook.react.bridge.AssertionException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.D;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends C2746a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f38113d;

    public l() {
        String simpleName = l.class.getSimpleName();
        AbstractC5504s.g(simpleName, "getSimpleName(...)");
        this.f38113d = simpleName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void n(View view, AccessibilityEvent accessibilityEvent) {
        Object tag = view.getTag(AbstractC3247l.f36908b);
        Integer numValueOf = null;
        ReadableMap readableMap = tag instanceof ReadableMap ? (ReadableMap) tag : null;
        if (readableMap == null) {
            return;
        }
        accessibilityEvent.setItemCount(readableMap.getInt("itemCount"));
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        View childAt = viewGroup != null ? viewGroup.getChildAt(0) : null;
        ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
        if (viewGroup2 == null) {
            return;
        }
        int childCount = viewGroup2.getChildCount();
        Integer numValueOf2 = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt2 = viewGroup2.getChildAt(i10);
            if (!(view instanceof h)) {
                return;
            }
            AbstractC5504s.e(childAt2);
            boolean zC = ((h) view).c(childAt2);
            Object tag2 = childAt2.getTag(AbstractC3247l.f36909c);
            AbstractC5504s.f(tag2, "null cannot be cast to non-null type com.facebook.react.bridge.ReadableMap");
            ReadableMap readableMap2 = (ReadableMap) tag2;
            if (!(childAt2 instanceof ViewGroup)) {
                return;
            }
            ((ViewGroup) childAt2).getChildCount();
            if (zC) {
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(readableMap2.getInt("itemIndex"));
                }
                numValueOf2 = Integer.valueOf(readableMap2.getInt("itemIndex"));
            }
            if (numValueOf != null && numValueOf2 != null) {
                accessibilityEvent.setFromIndex(numValueOf.intValue());
                accessibilityEvent.setToIndex(numValueOf2.intValue());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void o(View view, B b10) {
        D.b bVarC = D.b.f37415a.c(view);
        if (bVarC != null) {
            D.c cVar = D.f37394u;
            Context context = view.getContext();
            AbstractC5504s.g(context, "getContext(...)");
            cVar.m(b10, bVarC, context);
        }
        Object tag = view.getTag(AbstractC3247l.f36908b);
        ReadableMap readableMap = tag instanceof ReadableMap ? (ReadableMap) tag : null;
        if (readableMap != null) {
            b10.B0(B.f.a(readableMap.getInt("rowCount"), readableMap.getInt("columnCount"), readableMap.getBoolean("hierarchical")));
        }
        if (view instanceof h) {
            b10.c1(((h) view).getScrollEnabled());
        }
    }

    @Override // androidx.core.view.C2746a
    public void f(View host, AccessibilityEvent event) {
        AbstractC5504s.h(host, "host");
        AbstractC5504s.h(event, "event");
        super.f(host, event);
        if (host instanceof h) {
            n(host, event);
            return;
        }
        ReactSoftExceptionLogger.logSoftException(this.f38113d, new AssertionException("ReactScrollViewAccessibilityDelegate should only be used with ReactAccessibleScrollView, not with class: " + host.getClass().getSimpleName()));
    }

    @Override // androidx.core.view.C2746a
    public void g(View host, B info) {
        AbstractC5504s.h(host, "host");
        AbstractC5504s.h(info, "info");
        super.g(host, info);
        if (host instanceof h) {
            o(host, info);
            return;
        }
        ReactSoftExceptionLogger.logSoftException(this.f38113d, new AssertionException("ReactScrollViewAccessibilityDelegate should only be used with ReactAccessibleScrollView, not with class: " + host.getClass().getSimpleName()));
    }
}
