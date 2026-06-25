package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e.a f35699b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f35700a = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements e.a {
        a() {
        }

        @Override // com.bumptech.glide.load.data.e.a
        public Class a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.e.a
        public e b(Object obj) {
            return new b(obj);
        }
    }

    public synchronized e a(Object obj) {
        e.a aVar;
        try {
            o5.k.e(obj);
            aVar = (e.a) this.f35700a.get(obj.getClass());
            if (aVar == null) {
                Iterator it = this.f35700a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    e.a aVar2 = (e.a) it.next();
                    if (aVar2.a().isAssignableFrom(obj.getClass())) {
                        aVar = aVar2;
                        break;
                    }
                }
            }
            if (aVar == null) {
                aVar = f35699b;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar.b(obj);
    }

    public synchronized void b(e.a aVar) {
        this.f35700a.put(aVar.a(), aVar);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f35701a;

        b(Object obj) {
            this.f35701a = obj;
        }

        @Override // com.bumptech.glide.load.data.e
        public Object a() {
            return this.f35701a;
        }

        @Override // com.bumptech.glide.load.data.e
        public void b() {
        }
    }
}
