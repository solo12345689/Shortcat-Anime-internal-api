package l0;

import Zd.i;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface k extends i.b {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final b f52346h0 = b.f52347a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public static Object a(k kVar, Object obj, Function2 function2) {
            return i.b.a.a(kVar, obj, function2);
        }

        public static i.b b(k kVar, i.c cVar) {
            return i.b.a.b(kVar, cVar);
        }

        public static Zd.i c(k kVar, i.c cVar) {
            return i.b.a.c(kVar, cVar);
        }

        public static Zd.i d(k kVar, Zd.i iVar) {
            return i.b.a.d(kVar, iVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements i.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f52347a = new b();

        private b() {
        }
    }

    float E();

    @Override // Zd.i.b
    default i.c getKey() {
        return f52346h0;
    }
}
