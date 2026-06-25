package K0;

import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: renamed from: K0.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1782d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f10681a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Function1 f10682b = b.f10684a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function1 f10683c = c.f10685a;

    /* JADX INFO: renamed from: K0.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements J0.k {
        a() {
        }

        @Override // J0.k
        public Object j(J0.c cVar) {
            return cVar.a().invoke();
        }
    }

    /* JADX INFO: renamed from: K0.d$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f10684a = new b();

        b() {
            super(1);
        }

        public final void a(C1780c c1780c) {
            c1780c.H1();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C1780c) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: K0.d$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f10685a = new c();

        c() {
            super(1);
        }

        public final void a(C1780c c1780c) {
            c1780c.K1();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C1780c) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(C1780c c1780c) {
        e.c cVarP = AbstractC1796k.n(c1780c).t0().p();
        AbstractC5504s.f(cVarP, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return ((E0) cVarP).E1();
    }
}
