package com.facebook.react.views.scroll;

import Ud.AbstractC2279u;
import Ud.a0;
import android.graphics.Rect;
import android.view.ViewGroup;
import h7.C4914b;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class x extends v {

    /* JADX INFO: renamed from: j */
    private final boolean f38173j;

    /* JADX INFO: renamed from: k */
    private final d f38174k;

    /* JADX INFO: renamed from: l */
    private Set f38175l;

    /* JADX INFO: renamed from: m */
    private Set f38176m;

    /* JADX INFO: renamed from: n */
    private Set f38177n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(ViewGroup scrollView) {
        super(scrollView);
        AbstractC5504s.h(scrollView, "scrollView");
        boolean z10 = false;
        if (!(scrollView instanceof k) && (scrollView instanceof j)) {
            z10 = true;
        }
        this.f38173j = z10;
        this.f38174k = new d(z10);
        this.f38175l = new LinkedHashSet();
        this.f38176m = new LinkedHashSet();
        this.f38177n = new LinkedHashSet();
    }

    private final void u(r rVar) {
        Q7.a aVar;
        Rect containerRelativeRect = rVar.getContainerRelativeRect();
        Q7.a aVar2 = Q7.a.f14377d;
        Rect rectD = d();
        if (t.b(containerRelativeRect, l())) {
            rectD = l();
            aVar = (g() == null || j().hasWindowFocus()) ? Q7.a.f14375b : Q7.a.f14376c;
        } else if (t.b(containerRelativeRect, i())) {
            aVar = Q7.a.f14376c;
            rectD = i();
        } else {
            aVar = (e() <= 0.0d || !t.b(containerRelativeRect, f())) ? aVar2 : null;
        }
        if (aVar != null) {
            rVar.i(aVar, rectD);
        }
        if (aVar == Q7.a.f14375b) {
            this.f38175l.add(rVar.getVirtualViewID());
            this.f38176m.remove(rVar.getVirtualViewID());
            this.f38177n.add(rVar.getVirtualViewID());
        } else if (aVar == Q7.a.f14376c) {
            this.f38175l.add(rVar.getVirtualViewID());
            this.f38176m.add(rVar.getVirtualViewID());
            this.f38177n.remove(rVar.getVirtualViewID());
        } else if (aVar == aVar2) {
            this.f38175l.remove(rVar.getVirtualViewID());
            this.f38176m.remove(rVar.getVirtualViewID());
            this.f38177n.remove(rVar.getVirtualViewID());
        } else {
            this.f38175l.add(rVar.getVirtualViewID());
            this.f38176m.remove(rVar.getVirtualViewID());
            this.f38177n.remove(rVar.getVirtualViewID());
        }
    }

    private final void v() {
        Set setW = k().w(l());
        Set setW2 = k().w(i());
        Set setW3 = k().w(f());
        if (t.a() && C4914b.B()) {
            AbstractC7283a.b("VirtualViewContainerStateExperimental:updateModes", "V: " + this.f38177n + ", P: " + this.f38176m + ", HPV: " + this.f38175l);
        }
        Set setJ = a0.j(setW2, setW);
        if (t.a() && C4914b.B()) {
            AbstractC7283a.b("VirtualViewContainerStateExperimental:updateModes", "V': " + setW + ", P': " + setJ + ", HPV': " + setW3);
        }
        Set setJ2 = a0.j(setW, this.f38177n);
        Set setJ3 = a0.j(setJ, this.f38176m);
        Set set = setW3;
        Set setJ4 = a0.j(this.f38175l, set);
        if (t.a() && C4914b.B()) {
            AbstractC7283a.b("VirtualViewContainerStateExperimental:updateModes", "toV: " + setJ2 + ", toP: " + setJ3 + ", toH: " + setJ4);
        }
        Iterator it = setJ2.iterator();
        while (it.hasNext()) {
            r rVarR = k().r((String) it.next());
            if (rVarR != null) {
                rVarR.i(Q7.a.f14375b, l());
            }
        }
        Iterator it2 = setJ3.iterator();
        while (it2.hasNext()) {
            r rVarR2 = k().r((String) it2.next());
            if (rVarR2 != null) {
                rVarR2.i(Q7.a.f14376c, i());
            }
        }
        Iterator it3 = setJ4.iterator();
        while (it3.hasNext()) {
            r rVarR3 = k().r((String) it3.next());
            if (rVarR3 != null) {
                rVarR3.i(Q7.a.f14377d, d());
            }
        }
        this.f38177n = setW;
        this.f38176m = AbstractC2279u.e1(setJ);
        this.f38175l = AbstractC2279u.e1(set);
    }

    @Override // com.facebook.react.views.scroll.v
    public void m(r virtualView) {
        AbstractC5504s.h(virtualView, "virtualView");
        if (k().add(virtualView)) {
            if (t.a() && C4914b.B()) {
                AbstractC7283a.b("VirtualViewContainerStateExperimental:add", "virtualViewID=" + virtualView.getVirtualViewID());
            }
        } else if (t.a() && C4914b.B()) {
            AbstractC7283a.b("VirtualViewContainerStateExperimental:update", "virtualViewID=" + virtualView.getVirtualViewID());
        }
        p(virtualView);
    }

    @Override // com.facebook.react.views.scroll.v
    protected void p(r rVar) {
        r();
        if (rVar != null) {
            u(rVar);
        } else {
            v();
        }
    }

    @Override // com.facebook.react.views.scroll.v
    /* JADX INFO: renamed from: t */
    public d k() {
        return this.f38174k;
    }
}
