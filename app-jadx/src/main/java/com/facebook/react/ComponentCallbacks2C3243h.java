package com.facebook.react;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.facebook.react.bridge.MemoryPressureListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: com.facebook.react.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComponentCallbacks2C3243h implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList f36888a;

    public ComponentCallbacks2C3243h(Context context) {
        AbstractC5504s.h(context, "context");
        this.f36888a = new CopyOnWriteArrayList();
        context.getApplicationContext().registerComponentCallbacks(this);
    }

    private final void c(int i10) {
        Iterator it = this.f36888a.iterator();
        AbstractC5504s.g(it, "iterator(...)");
        while (it.hasNext()) {
            ((MemoryPressureListener) it.next()).handleMemoryPressure(i10);
        }
    }

    public final void a(MemoryPressureListener listener) {
        AbstractC5504s.h(listener, "listener");
        if (this.f36888a.contains(listener)) {
            return;
        }
        this.f36888a.add(listener);
    }

    public final void b(Context context) {
        AbstractC5504s.h(context, "context");
        context.getApplicationContext().unregisterComponentCallbacks(this);
    }

    public final void d(MemoryPressureListener listener) {
        AbstractC5504s.h(listener, "listener");
        this.f36888a.remove(listener);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        AbstractC5504s.h(newConfig, "newConfig");
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        c(i10);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }
}
