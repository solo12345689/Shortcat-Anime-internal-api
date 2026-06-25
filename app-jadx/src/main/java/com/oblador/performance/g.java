package com.oblador.performance;

import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f43985b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue f43986a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final g f43987a = new g();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface b {
    }

    public static g c() {
        return a.f43987a;
    }

    protected void a() {
        if (f43985b.isEmpty()) {
            return;
        }
        Iterator it = this.f43986a.iterator();
        while (it.hasNext()) {
            if (((com.oblador.performance.a) it.next()).d()) {
                it.remove();
            }
        }
    }

    protected void addListener(b bVar) {
        List list = f43985b;
        if (list.contains(bVar)) {
            return;
        }
        list.add(bVar);
    }

    protected Queue b() {
        return this.f43986a;
    }

    protected void removeListener(b bVar) {
        List list = f43985b;
        if (list.contains(bVar)) {
            list.remove(bVar);
        }
    }

    private g() {
        this.f43986a = new ConcurrentLinkedQueue();
    }
}
