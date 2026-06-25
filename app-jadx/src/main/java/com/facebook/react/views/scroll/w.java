package com.facebook.react.views.scroll;

import Ud.AbstractC2279u;
import android.graphics.Rect;
import android.view.ViewGroup;
import h7.C4914b;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC5504s;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class w extends v {

    /* JADX INFO: renamed from: j */
    private final Collection f38172j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(ViewGroup scrollView) {
        super(scrollView);
        AbstractC5504s.h(scrollView, "scrollView");
        this.f38172j = new LinkedHashSet();
    }

    @Override // com.facebook.react.views.scroll.v
    protected Collection k() {
        return this.f38172j;
    }

    @Override // com.facebook.react.views.scroll.v
    protected void p(r rVar) {
        j().getDrawingRect(l());
        if (l().isEmpty()) {
            if (t.a() && C4914b.B()) {
                AbstractC7283a.b("VirtualViewContainerStateClassic:updateModes", "scrollView visibleRect is empty");
                return;
            }
            return;
        }
        i().set(l());
        i().inset((int) (((double) (-i().width())) * h()), (int) (((double) (-i().height())) * h()));
        if (e() > 0.0d) {
            f().set(i());
            f().inset((int) (((double) (-l().width())) * e()), (int) (((double) (-l().height())) * e()));
        }
        for (r rVar2 : rVar != null ? AbstractC2279u.e(rVar) : AbstractC2279u.e1(k())) {
            Rect containerRelativeRect = rVar2.getContainerRelativeRect();
            Q7.a aVar = Q7.a.f14377d;
            Rect rectD = d();
            if (t.b(containerRelativeRect, l())) {
                rectD = l();
                aVar = (g() == null || j().hasWindowFocus()) ? Q7.a.f14375b : Q7.a.f14376c;
            } else if (t.b(containerRelativeRect, i())) {
                aVar = Q7.a.f14376c;
                rectD = i();
            } else if (e() > 0.0d && t.b(containerRelativeRect, f())) {
                aVar = null;
            }
            if (aVar != null) {
                rVar2.i(aVar, rectD);
                if (t.a() && C4914b.B()) {
                    AbstractC7283a.b("VirtualViewContainerStateClassic:updateModes", "virtualView=" + rVar2.getVirtualViewID() + " mode=" + aVar + "  rect=" + containerRelativeRect + " thresholdRect=" + rectD);
                }
            }
        }
    }
}
