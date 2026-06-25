package com.swmansion.gesturehandler.react;

import Qa.AbstractC2081d;
import android.util.SparseArray;
import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements Qa.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray f44294a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray f44295b = new SparseArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray f44296c = new SparseArray();

    private final synchronized void d(final AbstractC2081d abstractC2081d) {
        try {
            Integer num = (Integer) this.f44295b.get(abstractC2081d.T());
            if (num != null) {
                this.f44295b.remove(abstractC2081d.T());
                ArrayList arrayList = (ArrayList) this.f44296c.get(num.intValue());
                if (arrayList != null) {
                    synchronized (arrayList) {
                        arrayList.remove(abstractC2081d);
                    }
                    if (arrayList.size() == 0) {
                        this.f44296c.remove(num.intValue());
                    }
                }
            }
            if (abstractC2081d.W() != null) {
                UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.gesturehandler.react.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        i.e(abstractC2081d);
                    }
                });
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(AbstractC2081d abstractC2081d) {
        abstractC2081d.q();
    }

    private final synchronized void k(int i10, AbstractC2081d abstractC2081d) {
        try {
            if (this.f44295b.get(abstractC2081d.T()) != null) {
                throw new IllegalStateException(("Handler " + abstractC2081d + " already attached").toString());
            }
            this.f44295b.put(abstractC2081d.T(), Integer.valueOf(i10));
            Object obj = this.f44296c.get(i10);
            if (obj == null) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(abstractC2081d);
                this.f44296c.put(i10, arrayList);
            } else {
                synchronized (obj) {
                    ((ArrayList) obj).add(abstractC2081d);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // Qa.j
    public synchronized ArrayList a(View view) {
        AbstractC5504s.h(view, "view");
        return i(view.getId());
    }

    public final synchronized boolean c(int i10, int i11, int i12) {
        boolean z10;
        AbstractC2081d abstractC2081d = (AbstractC2081d) this.f44294a.get(i10);
        if (abstractC2081d != null) {
            d(abstractC2081d);
            abstractC2081d.u0(i12);
            k(i11, abstractC2081d);
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    public final synchronized void f() {
        this.f44294a.clear();
        this.f44295b.clear();
        this.f44296c.clear();
    }

    public final synchronized void g(int i10) {
        AbstractC2081d abstractC2081d = (AbstractC2081d) this.f44294a.get(i10);
        if (abstractC2081d != null) {
            d(abstractC2081d);
            this.f44294a.remove(i10);
        }
    }

    public final synchronized AbstractC2081d h(int i10) {
        return (AbstractC2081d) this.f44294a.get(i10);
    }

    public final synchronized ArrayList i(int i10) {
        return (ArrayList) this.f44296c.get(i10);
    }

    public final synchronized void j(AbstractC2081d handler) {
        AbstractC5504s.h(handler, "handler");
        this.f44294a.put(handler.T(), handler);
    }
}
