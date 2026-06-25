package He;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5502p;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class D {

    /* JADX INFO: renamed from: d */
    public static final b f8426d = new b(null);

    /* JADX INFO: renamed from: e */
    private static final D f8427e = new D(B.b(null, 1, null), a.f8431a);

    /* JADX INFO: renamed from: a */
    private final G f8428a;

    /* JADX INFO: renamed from: b */
    private final Function1 f8429b;

    /* JADX INFO: renamed from: c */
    private final boolean f8430c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class a extends AbstractC5502p implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final a f8431a = new a();

        a() {
            super(1, B.class, "getDefaultReportLevelForAnnotation", "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: j */
        public final O invoke(Xe.c p02) {
            AbstractC5504s.h(p02, "p0");
            return B.d(p02);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final D a() {
            return D.f8427e;
        }

        private b() {
        }
    }

    public D(G jsr305, Function1 getReportLevelForAnnotation) {
        AbstractC5504s.h(jsr305, "jsr305");
        AbstractC5504s.h(getReportLevelForAnnotation, "getReportLevelForAnnotation");
        this.f8428a = jsr305;
        this.f8429b = getReportLevelForAnnotation;
        this.f8430c = jsr305.f() || getReportLevelForAnnotation.invoke(B.e()) == O.f8500c;
    }

    public final boolean b() {
        return this.f8430c;
    }

    public final Function1 c() {
        return this.f8429b;
    }

    public final G d() {
        return this.f8428a;
    }

    public String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f8428a + ", getReportLevelForAnnotation=" + this.f8429b + ')';
    }
}
