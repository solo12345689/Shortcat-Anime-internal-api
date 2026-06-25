package Qe;

import gf.EnumC4882e;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class s {

    /* JADX INFO: renamed from: a */
    public static final b f14900a = new b(null);

    /* JADX INFO: renamed from: b */
    private static final d f14901b = new d(EnumC4882e.BOOLEAN);

    /* JADX INFO: renamed from: c */
    private static final d f14902c = new d(EnumC4882e.CHAR);

    /* JADX INFO: renamed from: d */
    private static final d f14903d = new d(EnumC4882e.BYTE);

    /* JADX INFO: renamed from: e */
    private static final d f14904e = new d(EnumC4882e.SHORT);

    /* JADX INFO: renamed from: f */
    private static final d f14905f = new d(EnumC4882e.INT);

    /* JADX INFO: renamed from: g */
    private static final d f14906g = new d(EnumC4882e.FLOAT);

    /* JADX INFO: renamed from: h */
    private static final d f14907h = new d(EnumC4882e.LONG);

    /* JADX INFO: renamed from: i */
    private static final d f14908i = new d(EnumC4882e.DOUBLE);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends s {

        /* JADX INFO: renamed from: j */
        private final s f14909j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s elementType) {
            super(null);
            AbstractC5504s.h(elementType, "elementType");
            this.f14909j = elementType;
        }

        public final s i() {
            return this.f14909j;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a() {
            return s.f14901b;
        }

        public final d b() {
            return s.f14903d;
        }

        public final d c() {
            return s.f14902c;
        }

        public final d d() {
            return s.f14908i;
        }

        public final d e() {
            return s.f14906g;
        }

        public final d f() {
            return s.f14905f;
        }

        public final d g() {
            return s.f14907h;
        }

        public final d h() {
            return s.f14904e;
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends s {

        /* JADX INFO: renamed from: j */
        private final String f14910j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String internalName) {
            super(null);
            AbstractC5504s.h(internalName, "internalName");
            this.f14910j = internalName;
        }

        public final String i() {
            return this.f14910j;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d extends s {

        /* JADX INFO: renamed from: j */
        private final EnumC4882e f14911j;

        public d(EnumC4882e enumC4882e) {
            super(null);
            this.f14911j = enumC4882e;
        }

        public final EnumC4882e i() {
            return this.f14911j;
        }
    }

    public /* synthetic */ s(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public String toString() {
        return u.f14912a.d(this);
    }

    private s() {
    }
}
