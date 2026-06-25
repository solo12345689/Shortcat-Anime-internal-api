package xf;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6014d;

/* JADX INFO: renamed from: xf.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC7174z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f64576a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f64577b = new AtomicInteger(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(AbstractC7174z abstractC7174z, String it) {
        AbstractC5504s.h(it, "it");
        return abstractC7174z.f64577b.getAndIncrement();
    }

    public final Map b() {
        return this.f64576a;
    }

    public abstract int c(ConcurrentHashMap concurrentHashMap, String str, Function1 function1);

    public final C7162n d(InterfaceC6014d kClass) {
        AbstractC5504s.h(kClass, "kClass");
        return new C7162n(f(kClass));
    }

    public final int e(String keyQualifiedName) {
        AbstractC5504s.h(keyQualifiedName, "keyQualifiedName");
        return c(this.f64576a, keyQualifiedName, new C7173y(this));
    }

    public final int f(InterfaceC6014d kClass) {
        AbstractC5504s.h(kClass, "kClass");
        String strU = kClass.u();
        AbstractC5504s.e(strU);
        return e(strU);
    }

    protected final Collection h() {
        Collection collectionValues = this.f64576a.values();
        AbstractC5504s.g(collectionValues, "<get-values>(...)");
        return collectionValues;
    }
}
