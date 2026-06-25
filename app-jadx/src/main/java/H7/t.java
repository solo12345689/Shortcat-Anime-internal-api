package H7;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f8114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f8115b = new t("ALL", 0) { // from class: H7.t.a
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // H7.t
        public int c() {
            return 8;
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f8116c = new t("LEFT", 1) { // from class: H7.t.i
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // H7.t
        public int c() {
            return 0;
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f8117d = new t("RIGHT", 2) { // from class: H7.t.j
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // H7.t
        public int c() {
            return 2;
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t f8118e = new t("TOP", 3) { // from class: H7.t.l
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // H7.t
        public int c() {
            return 1;
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t f8119f = new t("BOTTOM", 4) { // from class: H7.t.e
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // H7.t
        public int c() {
            return 3;
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final t f8120g = new t("START", 5) { // from class: H7.t.k
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // H7.t
        public int c() {
            return 4;
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final t f8121h = new t("END", 6) { // from class: H7.t.g
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // H7.t
        public int c() {
            return 5;
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final t f8122i = new t("HORIZONTAL", 7) { // from class: H7.t.h
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // H7.t
        public int c() {
            return 6;
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final t f8123j = new t("VERTICAL", 8) { // from class: H7.t.m
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // H7.t
        public int c() {
            return 7;
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final t f8124k = new t("BLOCK_START", 9) { // from class: H7.t.d
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // H7.t
        public int c() {
            return 11;
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final t f8125l = new t("BLOCK_END", 10) { // from class: H7.t.c
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // H7.t
        public int c() {
            return 10;
        }
    };

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final t f8126m = new t("BLOCK", 11) { // from class: H7.t.b
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // H7.t
        public int c() {
            return 9;
        }
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ t[] f8127n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f8128o;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f {
        public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t a(int i10) {
            switch (i10) {
                case 0:
                    return t.f8116c;
                case 1:
                    return t.f8118e;
                case 2:
                    return t.f8117d;
                case 3:
                    return t.f8119f;
                case 4:
                    return t.f8120g;
                case 5:
                    return t.f8121h;
                case 6:
                    return t.f8122i;
                case 7:
                    return t.f8123j;
                case 8:
                    return t.f8115b;
                case 9:
                    return t.f8126m;
                case 10:
                    return t.f8125l;
                case 11:
                    return t.f8124k;
                default:
                    throw new IllegalArgumentException("Unknown spacing type: " + i10);
            }
        }

        private f() {
        }
    }

    static {
        t[] tVarArrA = a();
        f8127n = tVarArrA;
        f8128o = AbstractC3048a.a(tVarArrA);
        f8114a = new f(null);
    }

    public /* synthetic */ t(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10);
    }

    private static final /* synthetic */ t[] a() {
        return new t[]{f8115b, f8116c, f8117d, f8118e, f8119f, f8120g, f8121h, f8122i, f8123j, f8124k, f8125l, f8126m};
    }

    public static EnumEntries b() {
        return f8128o;
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f8127n.clone();
    }

    public abstract int c();

    private t(String str, int i10) {
    }
}
