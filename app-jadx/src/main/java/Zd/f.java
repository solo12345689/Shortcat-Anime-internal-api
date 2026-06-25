package Zd;

import Zd.i;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public interface f extends i.b {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final b f23273S = b.f23274a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public static i.b a(f fVar, i.c key) {
            i.b bVarB;
            AbstractC5504s.h(key, "key");
            if (!(key instanceof Zd.b)) {
                if (f.f23273S != key) {
                    return null;
                }
                AbstractC5504s.f(fVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return fVar;
            }
            Zd.b bVar = (Zd.b) key;
            if (!bVar.a(fVar.getKey()) || (bVarB = bVar.b(fVar)) == null) {
                return null;
            }
            return bVarB;
        }

        public static i b(f fVar, i.c key) {
            AbstractC5504s.h(key, "key");
            if (!(key instanceof Zd.b)) {
                return f.f23273S == key ? j.f23275a : fVar;
            }
            Zd.b bVar = (Zd.b) key;
            return (!bVar.a(fVar.getKey()) || bVar.b(fVar) == null) ? fVar : j.f23275a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements i.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f23274a = new b();

        private b() {
        }
    }

    void k0(e eVar);

    e u1(e eVar);
}
