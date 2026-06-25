package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f52263a;

    public T(int i10) {
        this.f52263a = new ArrayList(i10);
    }

    public void a(Object obj) {
        this.f52263a.add(obj);
    }

    public void b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList arrayList = this.f52263a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f52263a, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            this.f52263a.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                this.f52263a.add(it.next());
            }
            return;
        }
        if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                this.f52263a.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public int c() {
        return this.f52263a.size();
    }

    public Object[] d(Object[] objArr) {
        return this.f52263a.toArray(objArr);
    }
}
