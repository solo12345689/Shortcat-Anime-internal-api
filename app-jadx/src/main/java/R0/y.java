package R0;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f15083a = new y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final B f15084b = new B("TestTagsAsResourceId", false, b.f15088a, null, 8, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final B f15085c = new B("AccessibilityClassName", true, a.f15087a, null, 8, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f15086d = 8;

    private y() {
    }

    public final B a() {
        return f15085c;
    }

    public final B b() {
        return f15084b;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f15087a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            return str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f15088a = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Boolean) obj, ((Boolean) obj2).booleanValue());
        }

        public final Boolean a(Boolean bool, boolean z10) {
            return bool;
        }
    }
}
