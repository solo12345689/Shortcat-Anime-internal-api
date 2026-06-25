package io.sentry.cache.tape;

import java.io.Closeable;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c implements Iterable, Closeable {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void a(Object obj, OutputStream outputStream);

        Object b(byte[] bArr);
    }

    public static c w(d dVar, a aVar) {
        return new b(dVar, aVar);
    }

    public static c z() {
        return new io.sentry.cache.tape.a();
    }

    public abstract void B0(int i10);

    public List D(int i10) {
        int iMin = Math.min(i10, size());
        ArrayList arrayList = new ArrayList(iMin);
        Iterator it = iterator();
        for (int i11 = 0; i11 < iMin; i11++) {
            arrayList.add(it.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public abstract void b(Object obj);

    public void clear() {
        B0(size());
    }

    public List l() {
        return D(size());
    }

    public abstract int size();
}
