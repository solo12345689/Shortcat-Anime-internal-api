package com.swmansion.gesturehandler.react;

import Qa.D;
import Qa.v;
import Td.r;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.C;
import com.facebook.react.uimanager.L;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class o implements D {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f44319a;

        static {
            int[] iArr = new int[C.values().length];
            try {
                iArr[C.f37390d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C.f37389c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C.f37388b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C.f37391e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f44319a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Qa.D
    public v a(View view) {
        AbstractC5504s.h(view, "view");
        C pointerEvents = view instanceof L ? ((L) view).getPointerEvents() : C.f37391e;
        if (!view.isEnabled()) {
            if (pointerEvents == C.f37391e) {
                return v.f14730b;
            }
            if (pointerEvents == C.f37390d) {
                return v.f14729a;
            }
        }
        int i10 = a.f44319a[pointerEvents.ordinal()];
        if (i10 == 1) {
            return v.f14731c;
        }
        if (i10 == 2) {
            return v.f14730b;
        }
        if (i10 == 3) {
            return v.f14729a;
        }
        if (i10 == 4) {
            return v.f14732d;
        }
        throw new r();
    }

    @Override // Qa.D
    public boolean b(ViewGroup view) {
        AbstractC5504s.h(view, "view");
        if (view.getClipChildren()) {
            return true;
        }
        if (view instanceof com.facebook.react.views.scroll.k) {
            return !AbstractC5504s.c(((com.facebook.react.views.scroll.k) view).getOverflow(), "visible");
        }
        if (view instanceof com.facebook.react.views.scroll.j) {
            return !AbstractC5504s.c(((com.facebook.react.views.scroll.j) view).getOverflow(), "visible");
        }
        if (view instanceof com.facebook.react.views.view.g) {
            return AbstractC5504s.c(((com.facebook.react.views.view.g) view).getOverflow(), "hidden");
        }
        return false;
    }

    @Override // Qa.D
    public View c(ViewGroup parent, int i10) {
        AbstractC5504s.h(parent, "parent");
        if (parent instanceof com.facebook.react.views.view.g) {
            View childAt = parent.getChildAt(((com.facebook.react.views.view.g) parent).getZIndexMappedChildIndex(i10));
            AbstractC5504s.e(childAt);
            return childAt;
        }
        View childAt2 = parent.getChildAt(i10);
        AbstractC5504s.e(childAt2);
        return childAt2;
    }
}
