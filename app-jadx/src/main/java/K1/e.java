package K1;

import androidx.core.util.Pools$SimplePool;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class e extends Pools$SimplePool {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f10844c;

    public e(int i10) {
        super(i10);
        this.f10844c = new Object();
    }

    @Override // androidx.core.util.Pools$SimplePool, K1.d
    public boolean a(Object instance) {
        boolean zA;
        AbstractC5504s.h(instance, "instance");
        synchronized (this.f10844c) {
            zA = super.a(instance);
        }
        return zA;
    }

    @Override // androidx.core.util.Pools$SimplePool, K1.d
    public Object b() {
        Object objB;
        synchronized (this.f10844c) {
            objB = super.b();
        }
        return objB;
    }
}
