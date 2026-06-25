package io.sentry.internal.modules;

import io.sentry.ILogger;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f50759e;

    public a(List list, ILogger iLogger) {
        super(iLogger);
        this.f50759e = list;
    }

    @Override // io.sentry.internal.modules.d
    protected Map b() {
        TreeMap treeMap = new TreeMap();
        Iterator it = this.f50759e.iterator();
        while (it.hasNext()) {
            Map mapA = ((b) it.next()).a();
            if (mapA != null) {
                treeMap.putAll(mapA);
            }
        }
        return treeMap;
    }
}
