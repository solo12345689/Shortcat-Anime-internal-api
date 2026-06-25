package Y;

import Zd.i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Y.t0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2446t0 extends i.b {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final b f22548R = b.f22549a;

    /* JADX INFO: renamed from: Y.t0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public static Object a(InterfaceC2446t0 interfaceC2446t0, Object obj, Function2 function2) {
            return i.b.a.a(interfaceC2446t0, obj, function2);
        }

        public static i.b b(InterfaceC2446t0 interfaceC2446t0, i.c cVar) {
            return i.b.a.b(interfaceC2446t0, cVar);
        }

        public static Zd.i c(InterfaceC2446t0 interfaceC2446t0, i.c cVar) {
            return i.b.a.c(interfaceC2446t0, cVar);
        }

        public static Zd.i d(InterfaceC2446t0 interfaceC2446t0, Zd.i iVar) {
            return i.b.a.d(interfaceC2446t0, iVar);
        }
    }

    /* JADX INFO: renamed from: Y.t0$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements i.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f22549a = new b();

        private b() {
        }
    }

    Object A1(Function1 function1, Zd.e eVar);

    @Override // Zd.i.b
    default i.c getKey() {
        return f22548R;
    }
}
