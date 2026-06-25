package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.K;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2797a implements K {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class AbstractC0501a implements K.a {
        protected static void f(Iterable iterable, List list) {
            AbstractC2816u.a(iterable);
            if (!(iterable instanceof InterfaceC2820y)) {
                if (iterable instanceof U) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    g(iterable, list);
                    return;
                }
            }
            List listG = ((InterfaceC2820y) iterable).g();
            android.support.v4.media.session.b.a(list);
            list.size();
            Iterator it = listG.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (next == null) {
                    new StringBuilder().append("Element at index ");
                    throw null;
                }
                if (next instanceof AbstractC2802f) {
                    throw null;
                }
                if (next instanceof byte[]) {
                    AbstractC2802f.f((byte[]) next);
                    throw null;
                }
                throw null;
            }
        }

        private static void g(Iterable iterable, List list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
        }

        protected static g0 h(K k10) {
            return new g0(k10);
        }
    }

    protected static void b(Iterable iterable, List list) {
        AbstractC0501a.f(iterable, list);
    }

    abstract int f(a0 a0Var);

    g0 g() {
        return new g0(this);
    }

    public void h(OutputStream outputStream) {
        AbstractC2805i abstractC2805iY = AbstractC2805i.Y(outputStream, AbstractC2805i.C(d()));
        e(abstractC2805iY);
        abstractC2805iY.V();
    }
}
