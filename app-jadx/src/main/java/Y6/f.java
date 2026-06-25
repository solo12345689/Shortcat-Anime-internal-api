package y6;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends Enum {

    /* JADX INFO: renamed from: a */
    public static final a f64861a;

    /* JADX INFO: renamed from: b */
    public static final f f64862b = new f("LOW", 0);

    /* JADX INFO: renamed from: c */
    public static final f f64863c = new f("MEDIUM", 1);

    /* JADX INFO: renamed from: d */
    public static final f f64864d = new f("HIGH", 2);

    /* JADX INFO: renamed from: e */
    private static final /* synthetic */ f[] f64865e;

    /* JADX INFO: renamed from: f */
    private static final /* synthetic */ EnumEntries f64866f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(f priority1, f priority2) {
            AbstractC5504s.h(priority1, "priority1");
            AbstractC5504s.h(priority2, "priority2");
            return priority1.ordinal() > priority2.ordinal() ? priority1 : priority2;
        }

        private a() {
        }
    }

    static {
        f[] fVarArrA = a();
        f64865e = fVarArrA;
        f64866f = AbstractC3048a.a(fVarArrA);
        f64861a = new a(null);
    }

    private f(String str, int i10) {
        super(str, i10);
    }

    private static final /* synthetic */ f[] a() {
        return new f[]{f64862b, f64863c, f64864d};
    }

    public static final f b(f fVar, f fVar2) {
        return f64861a.a(fVar, fVar2);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f64865e.clone();
    }
}
