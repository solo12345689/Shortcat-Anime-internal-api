package H6;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class u implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f8011a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f8012b = new k();

    private Object b(Object obj) {
        if (obj == null) {
            return obj;
        }
        synchronized (this) {
            this.f8011a.remove(obj);
        }
        return obj;
    }

    @Override // H6.A
    public Object get(int i10) {
        return b(this.f8012b.a(i10));
    }

    @Override // H6.A
    public Object pop() {
        return b(this.f8012b.f());
    }

    @Override // H6.A
    public void put(Object obj) {
        boolean zAdd;
        synchronized (this) {
            zAdd = this.f8011a.add(obj);
        }
        if (zAdd) {
            this.f8012b.e(a(obj), obj);
        }
    }
}
