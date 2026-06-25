package com.th3rdwave.safeareacontext;

import Td.L;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.InterfaceC3282a0;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.J;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends com.facebook.react.views.view.g implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a */
    private o f44863a;

    /* JADX INFO: renamed from: b */
    private a f44864b;

    /* JADX INFO: renamed from: c */
    private m f44865c;

    /* JADX INFO: renamed from: d */
    private View f44866d;

    /* JADX INFO: renamed from: e */
    private InterfaceC3282a0 f44867e;

    public k(Context context) {
        super(context);
        this.f44863a = o.f44880a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View D() {
        for (ViewParent parent = getParent(); parent != 0; parent = parent.getParent()) {
            if (parent instanceof f) {
                return (View) parent;
            }
        }
        return this;
    }

    private final boolean E() {
        a aVarE;
        View view = this.f44866d;
        if (view == null || (aVarE = h.e(view)) == null || AbstractC5504s.c(this.f44864b, aVarE)) {
            return false;
        }
        this.f44864b = aVarE;
        F();
        return true;
    }

    private final void F() {
        a aVar = this.f44864b;
        if (aVar != null) {
            m mVar = this.f44865c;
            if (mVar == null) {
                l lVar = l.f44869b;
                mVar = new m(lVar, lVar, lVar, lVar);
            }
            InterfaceC3282a0 stateWrapper = getStateWrapper();
            if (stateWrapper != null) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putMap("insets", q.b(aVar));
                stateWrapper.updateState(writableMapCreateMap);
                return;
            }
            n nVar = new n(aVar, this.f44863a, mVar);
            ReactContext reactContextA = r.a(this);
            final UIManagerModule uIManagerModule = (UIManagerModule) reactContextA.getNativeModule(UIManagerModule.class);
            if (uIManagerModule != null) {
                uIManagerModule.setViewLocalData(getId(), nVar);
                reactContextA.runOnNativeModulesQueueThread(new Runnable() { // from class: com.th3rdwave.safeareacontext.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.G(uIManagerModule);
                    }
                });
                H();
            }
        }
    }

    public static final void G(UIManagerModule uIManagerModule) {
        uIManagerModule.getUIImplementation().m(-1);
    }

    private final void H() {
        final J j10 = new J();
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition conditionNewCondition = reentrantLock.newCondition();
        long jNanoTime = System.nanoTime();
        r.a(this).runOnNativeModulesQueueThread(new Runnable() { // from class: com.th3rdwave.safeareacontext.j
            @Override // java.lang.Runnable
            public final void run() {
                k.I(reentrantLock, j10, conditionNewCondition);
            }
        });
        reentrantLock.lock();
        long jNanoTime2 = 0;
        while (!j10.f52255a && jNanoTime2 < 500000000) {
            try {
                try {
                    conditionNewCondition.awaitNanos(500000000L);
                } catch (InterruptedException unused) {
                    j10.f52255a = true;
                }
                jNanoTime2 += System.nanoTime() - jNanoTime;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        L l10 = L.f17438a;
        reentrantLock.unlock();
        if (jNanoTime2 >= 500000000) {
            Log.w("SafeAreaView", "Timed out waiting for layout.");
        }
    }

    public static final void I(ReentrantLock reentrantLock, J j10, Condition condition) {
        reentrantLock.lock();
        try {
            if (!j10.f52255a) {
                j10.f52255a = true;
                condition.signal();
            }
            L l10 = L.f17438a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final InterfaceC3282a0 getStateWrapper() {
        return this.f44867e;
    }

    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        ViewTreeObserver viewTreeObserver;
        super.onAttachedToWindow();
        View viewD = D();
        this.f44866d = viewD;
        if (viewD != null && (viewTreeObserver = viewD.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnPreDrawListener(this);
        }
        E();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver;
        super.onDetachedFromWindow();
        View view = this.f44866d;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        this.f44866d = null;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        boolean zE = E();
        if (zE) {
            requestLayout();
        }
        return !zE;
    }

    public final void setEdges(m edges) {
        AbstractC5504s.h(edges, "edges");
        this.f44865c = edges;
        F();
    }

    public final void setMode(o mode) {
        AbstractC5504s.h(mode, "mode");
        this.f44863a = mode;
        F();
    }

    public final void setStateWrapper(InterfaceC3282a0 interfaceC3282a0) {
        this.f44867e = interfaceC3282a0;
    }
}
