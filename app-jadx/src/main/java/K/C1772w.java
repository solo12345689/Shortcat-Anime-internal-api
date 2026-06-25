package K;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: K.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1772w {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f10341g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final C1772w f10342h = new C1772w(null, null, null, null, null, null, 63, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f10343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f10344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f10345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function1 f10346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Function1 f10347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Function1 f10348f;

    /* JADX INFO: renamed from: K.w$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1772w a() {
            return C1772w.f10342h;
        }

        private a() {
        }
    }

    public C1772w(Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16) {
        this.f10343a = function1;
        this.f10344b = function12;
        this.f10345c = function13;
        this.f10346d = function14;
        this.f10347e = function15;
        this.f10348f = function16;
    }

    public final Function1 b() {
        return this.f10343a;
    }

    public final Function1 c() {
        return this.f10344b;
    }

    public final Function1 d() {
        return this.f10345c;
    }

    public final Function1 e() {
        return this.f10346d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1772w)) {
            return false;
        }
        C1772w c1772w = (C1772w) obj;
        return this.f10343a == c1772w.f10343a && this.f10344b == c1772w.f10344b && this.f10345c == c1772w.f10345c && this.f10346d == c1772w.f10346d && this.f10347e == c1772w.f10347e && this.f10348f == c1772w.f10348f;
    }

    public final Function1 f() {
        return this.f10347e;
    }

    public final Function1 g() {
        return this.f10348f;
    }

    public int hashCode() {
        Function1 function1 = this.f10343a;
        int iHashCode = (function1 != null ? function1.hashCode() : 0) * 31;
        Function1 function12 = this.f10344b;
        int iHashCode2 = (iHashCode + (function12 != null ? function12.hashCode() : 0)) * 31;
        Function1 function13 = this.f10345c;
        int iHashCode3 = (iHashCode2 + (function13 != null ? function13.hashCode() : 0)) * 31;
        Function1 function14 = this.f10346d;
        int iHashCode4 = (iHashCode3 + (function14 != null ? function14.hashCode() : 0)) * 31;
        Function1 function15 = this.f10347e;
        int iHashCode5 = (iHashCode4 + (function15 != null ? function15.hashCode() : 0)) * 31;
        Function1 function16 = this.f10348f;
        return iHashCode5 + (function16 != null ? function16.hashCode() : 0);
    }

    public /* synthetic */ C1772w(Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : function1, (i10 & 2) != 0 ? null : function12, (i10 & 4) != 0 ? null : function13, (i10 & 8) != 0 ? null : function14, (i10 & 16) != 0 ? null : function15, (i10 & 32) != 0 ? null : function16);
    }
}
