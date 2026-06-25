package se;

import Ee.AbstractC1527f;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class Z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ConcurrentMap f59465a = new ConcurrentHashMap();

    public static final De.k a(Class cls) {
        AbstractC5504s.h(cls, "<this>");
        ClassLoader classLoaderJ = AbstractC1527f.j(cls);
        k1 k1Var = new k1(classLoaderJ);
        ConcurrentMap concurrentMap = f59465a;
        WeakReference weakReference = (WeakReference) concurrentMap.get(k1Var);
        if (weakReference != null) {
            De.k kVar = (De.k) weakReference.get();
            if (kVar != null) {
                return kVar;
            }
            concurrentMap.remove(k1Var, weakReference);
        }
        De.k kVarA = De.k.f3706c.a(classLoaderJ);
        while (true) {
            try {
                ConcurrentMap concurrentMap2 = f59465a;
                WeakReference weakReference2 = (WeakReference) concurrentMap2.putIfAbsent(k1Var, new WeakReference(kVarA));
                if (weakReference2 == null) {
                    return kVarA;
                }
                De.k kVar2 = (De.k) weakReference2.get();
                if (kVar2 != null) {
                    return kVar2;
                }
                concurrentMap2.remove(k1Var, weakReference2);
            } finally {
                k1Var.a(null);
            }
        }
    }
}
