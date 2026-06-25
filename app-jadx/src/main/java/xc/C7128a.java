package xc;

import Td.L;
import expo.modules.kotlin.views.p;
import ie.InterfaceC5082a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import pc.C5972b;
import pc.C5974d;
import pc.M;
import pe.C6029s;
import pe.InterfaceC6014d;
import pe.InterfaceC6027q;
import wc.AbstractC6959b;

/* JADX INFO: renamed from: xc.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxc/a;", "Lgc/c;", "<init>", "()V", "Lgc/e;", "n", "()Lgc/e;", "expo-linear-gradient_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C7128a extends gc.c {

    /* JADX INFO: renamed from: xc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0969a implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0969a f64318a = new C0969a();

        C0969a() {
        }

        public final void a(C7129b view, int[] colors) {
            AbstractC5504s.h(view, "view");
            AbstractC5504s.h(colors, "colors");
            view.setColors(colors);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C7129b) obj, (int[]) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: xc.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f64319a = new b();

        b() {
        }

        public final void a(C7129b view, float[] fArr) {
            AbstractC5504s.h(view, "view");
            if (fArr != null) {
                view.setLocations(fArr);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C7129b) obj, (float[]) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: xc.a$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f64320a = new c();

        c() {
        }

        public final void a(C7129b view, Pair pair) {
            AbstractC5504s.h(view, "view");
            view.c(pair != null ? ((Number) pair.c()).floatValue() : 0.5f, pair != null ? ((Number) pair.d()).floatValue() : 0.0f);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C7129b) obj, (Pair) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: xc.a$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f64321a = new d();

        d() {
        }

        public final void a(C7129b view, Pair pair) {
            AbstractC5504s.h(view, "view");
            view.b(pair != null ? ((Number) pair.c()).floatValue() : 0.5f, pair != null ? ((Number) pair.d()).floatValue() : 1.0f);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C7129b) obj, (Pair) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: xc.a$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f64322a = new e();

        e() {
        }

        public final void a(C7129b view, float[] fArr) {
            AbstractC5504s.h(view, "view");
            if (fArr == null) {
                float[] fArr2 = new float[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    fArr2[i10] = 0.0f;
                }
                fArr = fArr2;
            }
            view.setBorderRadii(fArr);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C7129b) obj, (float[]) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: xc.a$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f64323a = new f();

        f() {
        }

        public final void a(C7129b view, Boolean bool) {
            AbstractC5504s.h(view, "view");
            view.setDither(bool != null ? bool.booleanValue() : true);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C7129b) obj, (Boolean) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: xc.a$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f64324a = new g();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(C7129b.class);
        }
    }

    /* JADX INFO: renamed from: xc.a$h */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f64325a = new h();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(int[].class);
        }
    }

    /* JADX INFO: renamed from: xc.a$i */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class i implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f64326a = new i();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.f(float[].class);
        }
    }

    /* JADX INFO: renamed from: xc.a$j */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class j implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f64327a = new j();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            C6029s.a aVar = C6029s.f56013c;
            Class cls = Float.TYPE;
            return O.h(Pair.class, aVar.d(O.o(cls)), aVar.d(O.o(cls)));
        }
    }

    /* JADX INFO: renamed from: xc.a$k */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class k implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f64328a = new k();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            C6029s.a aVar = C6029s.f56013c;
            Class cls = Float.TYPE;
            return O.h(Pair.class, aVar.d(O.o(cls)), aVar.d(O.o(cls)));
        }
    }

    /* JADX INFO: renamed from: xc.a$l */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class l implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f64329a = new l();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.f(float[].class);
        }
    }

    /* JADX INFO: renamed from: xc.a$m */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class m implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f64330a = new m();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.f(Boolean.class);
        }
    }

    @Override // gc.c
    public gc.e n() throws Throwable {
        Class cls;
        X3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            try {
                gc.d dVar = new gc.d(this);
                dVar.s("ExpoLinearGradient");
                p pVar = new p(O.b(C7129b.class), new M(O.b(C7129b.class), false, g.f64324a, 2, null), dVar.m());
                AbstractC6959b.g(pVar);
                C0969a c0969a = C0969a.f64318a;
                Map mapH = pVar.h();
                C5974d c5974d = C5974d.f55938a;
                C5972b c5972b = (C5972b) c5974d.a().get(new Pair(O.b(int[].class), Boolean.FALSE));
                if (c5972b == null) {
                    c5972b = new C5972b(new M(O.b(int[].class), false, h.f64325a), null);
                }
                mapH.put("colors", new expo.modules.kotlin.views.c("colors", c5972b, c0969a));
                b bVar = b.f64319a;
                Map mapH2 = pVar.h();
                InterfaceC6014d interfaceC6014dB = O.b(float[].class);
                Boolean bool = Boolean.TRUE;
                C5972b c5972b2 = (C5972b) c5974d.a().get(new Pair(interfaceC6014dB, bool));
                if (c5972b2 == null) {
                    cls = Boolean.class;
                    c5972b2 = new C5972b(new M(O.b(float[].class), true, i.f64326a), null);
                } else {
                    cls = Boolean.class;
                }
                mapH2.put("locations", new expo.modules.kotlin.views.c("locations", c5972b2, bVar));
                c cVar = c.f64320a;
                Map mapH3 = pVar.h();
                C5972b c5972b3 = (C5972b) c5974d.a().get(new Pair(O.b(Pair.class), bool));
                if (c5972b3 == null) {
                    c5972b3 = new C5972b(new M(O.b(Pair.class), true, j.f64327a), null);
                }
                mapH3.put("startPoint", new expo.modules.kotlin.views.c("startPoint", c5972b3, cVar));
                d dVar2 = d.f64321a;
                Map mapH4 = pVar.h();
                C5972b c5972b4 = (C5972b) c5974d.a().get(new Pair(O.b(Pair.class), bool));
                if (c5972b4 == null) {
                    c5972b4 = new C5972b(new M(O.b(Pair.class), true, k.f64328a), null);
                }
                mapH4.put("endPoint", new expo.modules.kotlin.views.c("endPoint", c5972b4, dVar2));
                e eVar = e.f64322a;
                Map mapH5 = pVar.h();
                C5972b c5972b5 = (C5972b) c5974d.a().get(new Pair(O.b(float[].class), bool));
                if (c5972b5 == null) {
                    c5972b5 = new C5972b(new M(O.b(float[].class), true, l.f64329a), null);
                }
                mapH5.put("borderRadii", new expo.modules.kotlin.views.c("borderRadii", c5972b5, eVar));
                f fVar = f.f64323a;
                Map mapH6 = pVar.h();
                C5972b c5972b6 = (C5972b) c5974d.a().get(new Pair(O.b(cls), bool));
                if (c5972b6 == null) {
                    c5972b6 = new C5972b(new M(O.b(cls), true, m.f64330a), null);
                }
                mapH6.put("dither", new expo.modules.kotlin.views.c("dither", c5972b6, fVar));
                dVar.y(pVar.c());
                gc.e eVarU = dVar.u();
                X3.a.f();
                return eVarU;
            } catch (Throwable th2) {
                th = th2;
                X3.a.f();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
