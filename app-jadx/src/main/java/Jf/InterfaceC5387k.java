package jf;

import Ud.a0;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: jf.k */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC5387k extends InterfaceC5390n {

    /* JADX INFO: renamed from: a */
    public static final a f51797a = a.f51798a;

    /* JADX INFO: renamed from: jf.k$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ a f51798a = new a();

        /* JADX INFO: renamed from: b */
        private static final Function1 f51799b = C5386j.f51796a;

        private a() {
        }

        public static final boolean a(Xe.f it) {
            AbstractC5504s.h(it, "it");
            return true;
        }

        public final Function1 c() {
            return f51799b;
        }
    }

    /* JADX INFO: renamed from: jf.k$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends AbstractC5388l {

        /* JADX INFO: renamed from: b */
        public static final b f51800b = new b();

        private b() {
        }

        @Override // jf.AbstractC5388l, jf.InterfaceC5387k
        public Set b() {
            return a0.d();
        }

        @Override // jf.AbstractC5388l, jf.InterfaceC5387k
        public Set d() {
            return a0.d();
        }

        @Override // jf.AbstractC5388l, jf.InterfaceC5387k
        public Set f() {
            return a0.d();
        }
    }

    Collection a(Xe.f fVar, Ge.b bVar);

    Set b();

    Collection c(Xe.f fVar, Ge.b bVar);

    Set d();

    Set f();
}
