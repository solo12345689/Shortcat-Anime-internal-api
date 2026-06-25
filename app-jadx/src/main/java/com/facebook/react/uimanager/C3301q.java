package com.facebook.react.uimanager;

import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.v;
import h7.C4914b;
import kotlin.jvm.internal.AbstractC5504s;
import z5.AbstractC7283a;

/* JADX INFO: renamed from: com.facebook.react.uimanager.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3301q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewGroup f37810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f37811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float[] f37812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f37813d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f37814e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.facebook.react.uimanager.events.w f37815f;

    public C3301q(ViewGroup viewGroup) {
        AbstractC5504s.h(viewGroup, "viewGroup");
        this.f37810a = viewGroup;
        this.f37811b = -1;
        this.f37812c = new float[2];
        this.f37814e = Long.MIN_VALUE;
        this.f37815f = new com.facebook.react.uimanager.events.w();
    }

    private final void a(MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        if (this.f37811b == -1) {
            AbstractC7283a.I("ReactNative", "Can't cancel already finished gesture. Is a child View trying to start a gesture from an UP/CANCEL event?");
            return;
        }
        Q6.a.b(!this.f37813d, "Expected to not have already sent a cancel for this gesture");
        EventDispatcher eventDispatcher2 = (EventDispatcher) Q6.a.c(eventDispatcher);
        v.a aVar = com.facebook.react.uimanager.events.v.f37669f;
        int iF = f0.f(this.f37810a);
        int i10 = this.f37811b;
        com.facebook.react.uimanager.events.x xVar = com.facebook.react.uimanager.events.x.f37683f;
        long j10 = this.f37814e;
        float[] fArr = this.f37812c;
        eventDispatcher2.d(aVar.a(iF, i10, xVar, motionEvent, j10, fArr[0], fArr[1], this.f37815f));
    }

    private final int b(MotionEvent motionEvent) {
        return C3286c0.c(motionEvent.getX(), motionEvent.getY(), this.f37810a, this.f37812c, null);
    }

    private final void e(int i10, int i11, ReactContext reactContext) {
        UIManager uIManagerG;
        if (reactContext == null || (uIManagerG = f0.g(reactContext, 2)) == null) {
            return;
        }
        uIManagerG.markActiveTouchForTag(i10, i11);
    }

    private final void i(int i10, int i11, ReactContext reactContext) {
        UIManager uIManagerG;
        if (reactContext == null || (uIManagerG = f0.g(reactContext, 2)) == null) {
            return;
        }
        uIManagerG.sweepActiveTouchForTag(i10, i11);
    }

    public final void c(MotionEvent ev, EventDispatcher eventDispatcher) {
        AbstractC5504s.h(ev, "ev");
        AbstractC5504s.h(eventDispatcher, "eventDispatcher");
        d(ev, eventDispatcher, null);
    }

    public final void d(MotionEvent ev, EventDispatcher eventDispatcher, ReactContext reactContext) {
        AbstractC5504s.h(ev, "ev");
        AbstractC5504s.h(eventDispatcher, "eventDispatcher");
        int action = ev.getAction() & 255;
        if (action == 0) {
            if (this.f37811b != -1) {
                AbstractC7283a.m("ReactNative", "Got DOWN touch before receiving UP or CANCEL from last gesture");
            }
            this.f37813d = false;
            this.f37814e = ev.getEventTime();
            this.f37811b = b(ev);
            e(f0.f(this.f37810a), this.f37811b, reactContext);
            v.a aVar = com.facebook.react.uimanager.events.v.f37669f;
            int iF = f0.f(this.f37810a);
            int i10 = this.f37811b;
            com.facebook.react.uimanager.events.x xVar = com.facebook.react.uimanager.events.x.f37680c;
            long j10 = this.f37814e;
            float[] fArr = this.f37812c;
            eventDispatcher.d(aVar.a(iF, i10, xVar, ev, j10, fArr[0], fArr[1], this.f37815f));
            return;
        }
        if (this.f37813d) {
            return;
        }
        int i11 = this.f37811b;
        if (i11 == -1) {
            AbstractC7283a.m("ReactNative", "Unexpected state: received touch event but didn't get starting ACTION_DOWN for this gesture before");
            return;
        }
        if (action == 1) {
            b(ev);
            int iF2 = f0.f(this.f37810a);
            v.a aVar2 = com.facebook.react.uimanager.events.v.f37669f;
            int i12 = this.f37811b;
            com.facebook.react.uimanager.events.x xVar2 = com.facebook.react.uimanager.events.x.f37681d;
            long j11 = this.f37814e;
            float[] fArr2 = this.f37812c;
            eventDispatcher.d(aVar2.a(iF2, i12, xVar2, ev, j11, fArr2[0], fArr2[1], this.f37815f));
            i(iF2, this.f37811b, reactContext);
            this.f37811b = -1;
            this.f37814e = Long.MIN_VALUE;
            return;
        }
        if (action == 2) {
            b(ev);
            v.a aVar3 = com.facebook.react.uimanager.events.v.f37669f;
            int iF3 = f0.f(this.f37810a);
            int i13 = this.f37811b;
            com.facebook.react.uimanager.events.x xVar3 = com.facebook.react.uimanager.events.x.f37682e;
            long j12 = this.f37814e;
            float[] fArr3 = this.f37812c;
            eventDispatcher.d(aVar3.a(iF3, i13, xVar3, ev, j12, fArr3[0], fArr3[1], this.f37815f));
            return;
        }
        if (action == 5) {
            v.a aVar4 = com.facebook.react.uimanager.events.v.f37669f;
            int iF4 = f0.f(this.f37810a);
            int i14 = this.f37811b;
            com.facebook.react.uimanager.events.x xVar4 = com.facebook.react.uimanager.events.x.f37680c;
            long j13 = this.f37814e;
            float[] fArr4 = this.f37812c;
            eventDispatcher.d(aVar4.a(iF4, i14, xVar4, ev, j13, fArr4[0], fArr4[1], this.f37815f));
            return;
        }
        if (action == 6) {
            v.a aVar5 = com.facebook.react.uimanager.events.v.f37669f;
            int iF5 = f0.f(this.f37810a);
            int i15 = this.f37811b;
            com.facebook.react.uimanager.events.x xVar5 = com.facebook.react.uimanager.events.x.f37681d;
            long j14 = this.f37814e;
            float[] fArr5 = this.f37812c;
            eventDispatcher.d(aVar5.a(iF5, i15, xVar5, ev, j14, fArr5[0], fArr5[1], this.f37815f));
            return;
        }
        if (action == 3) {
            if (this.f37815f.c(ev.getDownTime())) {
                a(ev, eventDispatcher);
            } else {
                AbstractC7283a.m("ReactNative", "Received an ACTION_CANCEL touch event for which we have no corresponding ACTION_DOWN");
            }
            i(f0.f(this.f37810a), this.f37811b, reactContext);
            this.f37811b = -1;
            this.f37814e = Long.MIN_VALUE;
            return;
        }
        AbstractC7283a.I("ReactNative", "Warning : touch event was ignored. Action=" + action + " Target=" + i11);
    }

    public final void f(MotionEvent androidEvent, EventDispatcher eventDispatcher) {
        AbstractC5504s.h(androidEvent, "androidEvent");
        AbstractC5504s.h(eventDispatcher, "eventDispatcher");
        this.f37813d = false;
    }

    public final void g(MotionEvent androidEvent, EventDispatcher eventDispatcher) {
        AbstractC5504s.h(androidEvent, "androidEvent");
        AbstractC5504s.h(eventDispatcher, "eventDispatcher");
        h(androidEvent, eventDispatcher, null);
    }

    public final void h(MotionEvent androidEvent, EventDispatcher eventDispatcher, ReactContext reactContext) {
        AbstractC5504s.h(androidEvent, "androidEvent");
        AbstractC5504s.h(eventDispatcher, "eventDispatcher");
        if (this.f37813d) {
            return;
        }
        a(androidEvent, eventDispatcher);
        this.f37813d = true;
        if (this.f37811b != -1 && C4914b.J()) {
            i(f0.f(this.f37810a), this.f37811b, reactContext);
        }
        this.f37811b = -1;
    }
}
