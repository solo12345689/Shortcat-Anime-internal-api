package com.swmansion.gesturehandler.react;

import Qa.AbstractC2081d;
import Qa.r;
import android.view.MotionEvent;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.gesturehandler.react.c;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactApplicationContext f44284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Pa.i f44285b;

    public d(ReactApplicationContext reactApplicationContext) {
        AbstractC5504s.h(reactApplicationContext, "reactApplicationContext");
        this.f44284a = reactApplicationContext;
        this.f44285b = new Pa.i();
    }

    private final void d(AbstractC2081d abstractC2081d) {
        AbstractC2081d.c cVarA;
        if (abstractC2081d.T() < 0 || abstractC2081d.S() != 4 || (cVarA = e.f44286a.a(abstractC2081d)) == null) {
            return;
        }
        int iF = abstractC2081d.F();
        if (iF == 1) {
            i(c.a.c(c.f44279d, abstractC2081d, cVarA.c(abstractC2081d), false, 4, null));
            return;
        }
        if (iF == 2) {
            h(c.f44279d.b(abstractC2081d, cVarA.c(abstractC2081d), true));
        } else if (iF == 3) {
            g("onGestureHandlerEvent", c.f44279d.a(cVarA.c(abstractC2081d)));
        } else {
            if (iF != 4) {
                return;
            }
            g("onGestureHandlerEvent", c.f44279d.a(cVarA.c(abstractC2081d)));
        }
    }

    private final void e(AbstractC2081d abstractC2081d, int i10, int i11) {
        AbstractC2081d.c cVarA;
        if (abstractC2081d.T() >= 0 && (cVarA = e.f44286a.a(abstractC2081d)) != null) {
            int iF = abstractC2081d.F();
            if (iF == 1) {
                i(m.f44310d.b(abstractC2081d, i10, i11, cVarA.c(abstractC2081d)));
                return;
            }
            if (iF == 2 || iF == 3) {
                g("onGestureHandlerStateChange", m.f44310d.a(cVarA.c(abstractC2081d), i10, i11));
            } else {
                if (iF != 4) {
                    return;
                }
                g("onGestureHandlerStateChange", m.f44310d.a(cVarA.c(abstractC2081d), i10, i11));
            }
        }
    }

    private final void f(AbstractC2081d abstractC2081d) {
        if (abstractC2081d.T() < 0) {
            return;
        }
        if (abstractC2081d.S() == 2 || abstractC2081d.S() == 4 || abstractC2081d.S() == 0 || abstractC2081d.W() != null) {
            int iF = abstractC2081d.F();
            if (iF == 1) {
                i(n.f44315c.b(abstractC2081d));
            } else {
                if (iF != 4) {
                    return;
                }
                g("onGestureHandlerEvent", n.f44315c.a(abstractC2081d));
            }
        }
    }

    private final void g(String str, WritableMap writableMap) {
        a.a(this.f44284a).emit(str, writableMap);
    }

    private final void h(c cVar) {
        Pa.h.a(this.f44284a, cVar);
    }

    private final void i(com.facebook.react.uimanager.events.d dVar) {
        this.f44285b.a(dVar, this.f44284a);
    }

    @Override // Qa.r
    public void a(AbstractC2081d handler, int i10, int i11) {
        AbstractC5504s.h(handler, "handler");
        e(handler, i10, i11);
    }

    @Override // Qa.r
    public void b(AbstractC2081d handler, MotionEvent event) {
        AbstractC5504s.h(handler, "handler");
        AbstractC5504s.h(event, "event");
        d(handler);
    }

    @Override // Qa.r
    public void c(AbstractC2081d handler) {
        AbstractC5504s.h(handler, "handler");
        f(handler);
    }
}
