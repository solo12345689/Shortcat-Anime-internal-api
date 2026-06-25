package F;

import F.InterfaceC1533d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: renamed from: F.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1542m {

    /* JADX INFO: renamed from: F.m$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {

        /* JADX INFO: renamed from: F.m$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0064a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0064a f6061a = new C0064a();

            C0064a() {
                super(1);
            }

            public final Void a(int i10) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).intValue());
            }
        }

        Function1 getKey();

        default Function1 getType() {
            return C0064a.f6061a;
        }
    }

    public final Object f(int i10) {
        InterfaceC1533d.a aVar = g().get(i10);
        return ((a) aVar.c()).getType().invoke(Integer.valueOf(i10 - aVar.b()));
    }

    public abstract InterfaceC1533d g();

    public final int h() {
        return g().getSize();
    }

    public final Object i(int i10) {
        Object objInvoke;
        InterfaceC1533d.a aVar = g().get(i10);
        int iB = i10 - aVar.b();
        Function1 key = ((a) aVar.c()).getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(iB))) == null) ? F.a(i10) : objInvoke;
    }
}
