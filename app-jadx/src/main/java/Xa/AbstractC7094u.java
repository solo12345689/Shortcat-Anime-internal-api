package xa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xa.AbstractC7091q;

/* JADX INFO: renamed from: xa.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC7094u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC7094u f64270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC7094u f64271b;

    /* JADX INFO: renamed from: xa.u$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b extends AbstractC7094u {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Class f64272c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

        private b() {
            super();
        }

        static List f(Object obj, long j10) {
            return (List) c0.A(obj, j10);
        }

        private static List g(Object obj, long j10, int i10) {
            List listF = f(obj, j10);
            if (listF.isEmpty()) {
                List c7092s = listF instanceof InterfaceC7093t ? new C7092s(i10) : new ArrayList(i10);
                c0.O(obj, j10, c7092s);
                return c7092s;
            }
            if (f64272c.isAssignableFrom(listF.getClass())) {
                ArrayList arrayList = new ArrayList(listF.size() + i10);
                arrayList.addAll(listF);
                c0.O(obj, j10, arrayList);
                return arrayList;
            }
            if (!(listF instanceof b0)) {
                return listF;
            }
            C7092s c7092s2 = new C7092s(listF.size() + i10);
            c7092s2.addAll((b0) listF);
            c0.O(obj, j10, c7092s2);
            return c7092s2;
        }

        @Override // xa.AbstractC7094u
        void c(Object obj, long j10) {
            Object objUnmodifiableList;
            List list = (List) c0.A(obj, j10);
            if (list instanceof InterfaceC7093t) {
                objUnmodifiableList = ((InterfaceC7093t) list).J();
            } else if (f64272c.isAssignableFrom(list.getClass())) {
                return;
            } else {
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            c0.O(obj, j10, objUnmodifiableList);
        }

        @Override // xa.AbstractC7094u
        void d(Object obj, Object obj2, long j10) {
            List listF = f(obj2, j10);
            List listG = g(obj, j10, listF.size());
            int size = listG.size();
            int size2 = listF.size();
            if (size > 0 && size2 > 0) {
                listG.addAll(listF);
            }
            if (size > 0) {
                listF = listG;
            }
            c0.O(obj, j10, listF);
        }

        @Override // xa.AbstractC7094u
        List e(Object obj, long j10) {
            return g(obj, j10, 10);
        }
    }

    /* JADX INFO: renamed from: xa.u$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c extends AbstractC7094u {
        private c() {
            super();
        }

        static AbstractC7091q.b f(Object obj, long j10) {
            return (AbstractC7091q.b) c0.A(obj, j10);
        }

        @Override // xa.AbstractC7094u
        void c(Object obj, long j10) {
            f(obj, j10).q();
        }

        @Override // xa.AbstractC7094u
        void d(Object obj, Object obj2, long j10) {
            AbstractC7091q.b bVarF = f(obj, j10);
            AbstractC7091q.b bVarF2 = f(obj2, j10);
            int size = bVarF.size();
            int size2 = bVarF2.size();
            if (size > 0 && size2 > 0) {
                if (!bVarF.C()) {
                    bVarF = bVarF.E(size2 + size);
                }
                bVarF.addAll(bVarF2);
            }
            if (size > 0) {
                bVarF2 = bVarF;
            }
            c0.O(obj, j10, bVarF2);
        }

        @Override // xa.AbstractC7094u
        List e(Object obj, long j10) {
            AbstractC7091q.b bVarF = f(obj, j10);
            if (bVarF.C()) {
                return bVarF;
            }
            int size = bVarF.size();
            AbstractC7091q.b bVarE = bVarF.E(size == 0 ? 10 : size * 2);
            c0.O(obj, j10, bVarE);
            return bVarE;
        }
    }

    static {
        f64270a = new b();
        f64271b = new c();
    }

    static AbstractC7094u a() {
        return f64270a;
    }

    static AbstractC7094u b() {
        return f64271b;
    }

    abstract void c(Object obj, long j10);

    abstract void d(Object obj, Object obj2, long j10);

    abstract List e(Object obj, long j10);

    private AbstractC7094u() {
    }
}
