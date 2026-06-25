package I0;

import ke.AbstractC5466a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5502p;

/* JADX INFO: renamed from: I0.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1676b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C1685k f8687a = new C1685k(a.f8689a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C1685k f8688b = new C1685k(C0114b.f8690a);

    /* JADX INFO: renamed from: I0.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class a extends AbstractC5502p implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f8689a = new a();

        a() {
            super(2, AbstractC5466a.class, "min", "min(II)I", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return j(((Number) obj).intValue(), ((Number) obj2).intValue());
        }

        public final Integer j(int i10, int i11) {
            return Integer.valueOf(Math.min(i10, i11));
        }
    }

    /* JADX INFO: renamed from: I0.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class C0114b extends AbstractC5502p implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0114b f8690a = new C0114b();

        C0114b() {
            super(2, AbstractC5466a.class, "max", "max(II)I", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return j(((Number) obj).intValue(), ((Number) obj2).intValue());
        }

        public final Integer j(int i10, int i11) {
            return Integer.valueOf(Math.max(i10, i11));
        }
    }

    public static final C1685k a() {
        return f8687a;
    }

    public static final C1685k b() {
        return f8688b;
    }

    public static final int c(AbstractC1675a abstractC1675a, int i10, int i11) {
        return ((Number) abstractC1675a.a().invoke(Integer.valueOf(i10), Integer.valueOf(i11))).intValue();
    }
}
