package ze;

import Ud.AbstractC2279u;
import java.util.Iterator;
import java.util.List;
import je.InterfaceC5371a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: ze.h */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC7374h extends Iterable, InterfaceC5371a {

    /* JADX INFO: renamed from: k0 */
    public static final a f66223k0 = a.f66224a;

    /* JADX INFO: renamed from: ze.h$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ a f66224a = new a();

        /* JADX INFO: renamed from: b */
        private static final InterfaceC7374h f66225b = new C1000a();

        /* JADX INFO: renamed from: ze.h$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C1000a implements InterfaceC7374h {
            C1000a() {
            }

            public Void b(Xe.c fqName) {
                AbstractC5504s.h(fqName, "fqName");
                return null;
            }

            @Override // ze.InterfaceC7374h
            public /* bridge */ /* synthetic */ InterfaceC7369c h(Xe.c cVar) {
                return (InterfaceC7369c) b(cVar);
            }

            @Override // ze.InterfaceC7374h
            public boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            public Iterator iterator() {
                return AbstractC2279u.m().iterator();
            }

            @Override // ze.InterfaceC7374h
            public boolean k0(Xe.c cVar) {
                return b.b(this, cVar);
            }

            public String toString() {
                return com.amazon.a.a.n.a.a.g.f34487a;
            }
        }

        private a() {
        }

        public final InterfaceC7374h a(List annotations) {
            AbstractC5504s.h(annotations, "annotations");
            return annotations.isEmpty() ? f66225b : new C7375i(annotations);
        }

        public final InterfaceC7374h b() {
            return f66225b;
        }
    }

    /* JADX INFO: renamed from: ze.h$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public static InterfaceC7369c a(InterfaceC7374h interfaceC7374h, Xe.c fqName) {
            Object next;
            AbstractC5504s.h(fqName, "fqName");
            Iterator it = interfaceC7374h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AbstractC5504s.c(((InterfaceC7369c) next).f(), fqName)) {
                    break;
                }
            }
            return (InterfaceC7369c) next;
        }

        public static boolean b(InterfaceC7374h interfaceC7374h, Xe.c fqName) {
            AbstractC5504s.h(fqName, "fqName");
            return interfaceC7374h.h(fqName) != null;
        }
    }

    InterfaceC7369c h(Xe.c cVar);

    boolean isEmpty();

    boolean k0(Xe.c cVar);
}
