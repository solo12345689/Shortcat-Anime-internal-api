package K0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: K0.l0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1799l0 implements q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f10777b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f10778c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Function1 f10779d = a.f10781a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1795j0 f10780a;

    /* JADX INFO: renamed from: K0.l0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f10781a = new a();

        a() {
            super(1);
        }

        public final void a(C1799l0 c1799l0) {
            if (c1799l0.J0()) {
                c1799l0.b().q0();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C1799l0) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: K0.l0$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Function1 a() {
            return C1799l0.f10779d;
        }

        private b() {
        }
    }

    public C1799l0(InterfaceC1795j0 interfaceC1795j0) {
        this.f10780a = interfaceC1795j0;
    }

    @Override // K0.q0
    public boolean J0() {
        return this.f10780a.getNode().isAttached();
    }

    public final InterfaceC1795j0 b() {
        return this.f10780a;
    }
}
