package se;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: se.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class C6493i extends AbstractC6477a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f59507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f59508b;

    public C6493i(Function1 compute) {
        AbstractC5504s.h(compute, "compute");
        this.f59507a = compute;
        this.f59508b = new ConcurrentHashMap();
    }

    @Override // se.AbstractC6477a
    public Object a(Class key) {
        AbstractC5504s.h(key, "key");
        ConcurrentHashMap concurrentHashMap = this.f59508b;
        Object obj = concurrentHashMap.get(key);
        if (obj != null) {
            return obj;
        }
        Object objInvoke = this.f59507a.invoke(key);
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(key, objInvoke);
        return objPutIfAbsent == null ? objInvoke : objPutIfAbsent;
    }
}
