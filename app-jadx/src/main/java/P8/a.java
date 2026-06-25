package P8;

import P8.f;
import Q8.InterfaceC2056d;
import Q8.InterfaceC2064l;
import R8.AbstractC2102c;
import R8.AbstractC2115p;
import R8.C2103d;
import R8.InterfaceC2109j;
import android.content.Context;
import android.os.Looper;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a */
    private final AbstractC0216a f13549a;

    /* JADX INFO: renamed from: b */
    private final g f13550b;

    /* JADX INFO: renamed from: c */
    private final String f13551c;

    /* JADX INFO: renamed from: P8.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class AbstractC0216a extends e {
        public f a(Context context, Looper looper, C2103d c2103d, Object obj, f.a aVar, f.b bVar) {
            return b(context, looper, c2103d, obj, aVar, bVar);
        }

        public f b(Context context, Looper looper, C2103d c2103d, Object obj, InterfaceC2056d interfaceC2056d, InterfaceC2064l interfaceC2064l) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class c {
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface d {

        /* JADX INFO: renamed from: O */
        public static final C0217a f13552O = new C0217a(null);

        /* JADX INFO: renamed from: P8.a$d$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0217a implements d {
            /* synthetic */ C0217a(m mVar) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class e {
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface f extends b {
        boolean A();

        void b(String str);

        boolean c();

        String d();

        void disconnect();

        boolean e();

        boolean f();

        Set h();

        void i(AbstractC2102c.e eVar);

        void j(AbstractC2102c.InterfaceC0263c interfaceC0263c);

        int k();

        O8.c[] l();

        String m();

        void n(InterfaceC2109j interfaceC2109j, Set set);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g extends c {
    }

    public a(String str, AbstractC0216a abstractC0216a, g gVar) {
        AbstractC2115p.m(abstractC0216a, "Cannot construct an Api with a null ClientBuilder");
        AbstractC2115p.m(gVar, "Cannot construct an Api with a null ClientKey");
        this.f13551c = str;
        this.f13549a = abstractC0216a;
        this.f13550b = gVar;
    }

    public final AbstractC0216a a() {
        return this.f13549a;
    }

    public final c b() {
        return this.f13550b;
    }

    public final String c() {
        return this.f13551c;
    }
}
