package i0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import je.InterfaceC5371a;
import je.InterfaceC5375e;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: i0.P, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C4972P extends AbstractC4973Q implements Iterator, InterfaceC5371a {

    /* JADX INFO: renamed from: i0.P$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Map.Entry, InterfaceC5375e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f48441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f48442b;

        a() {
            Map.Entry entryF = C4972P.this.f();
            AbstractC5504s.e(entryF);
            this.f48441a = entryF.getKey();
            Map.Entry entryF2 = C4972P.this.f();
            AbstractC5504s.e(entryF2);
            this.f48442b = entryF2.getValue();
        }

        public void a(Object obj) {
            this.f48442b = obj;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f48441a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f48442b;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            C4972P c4972p = C4972P.this;
            if (c4972p.g().g() != ((AbstractC4973Q) c4972p).f48446c) {
                throw new ConcurrentModificationException();
            }
            Object value = getValue();
            c4972p.g().put(getKey(), obj);
            a(obj);
            return value;
        }
    }

    public C4972P(C4963G c4963g, Iterator it) {
        super(c4963g, it);
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        e();
        if (f() != null) {
            return new a();
        }
        throw new IllegalStateException();
    }
}
