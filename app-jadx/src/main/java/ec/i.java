package ec;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f45867f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final i f45874m;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final i f45881t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final /* synthetic */ i[] f45884w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f45885x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f45886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f45863b = new i("UNKNOWN", 0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f45864c = new i("DOUBLE", 1, 0, 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f45865d = new i("INT", 2, 0, 1, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f45866e = new i("LONG", 3, 0, 1, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i f45868g = new i("BOOLEAN", 5, 0, 1, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i f45869h = new i("FLOAT", 6, 0, 1, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final i f45870i = new i("WRITEABLE_ARRAY", 7, 0, 1, null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final i f45871j = new i("WRITEABLE_MAP", 8, 0, 1, null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final i f45872k = new i("JS_MODULE", 9, 0, 1, null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final i f45873l = new i("SHARED_OBJECT", 10, 0, 1, null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final i f45875n = new i("JS_ARRAY_BUFFER", 12, 0, 1, null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final i f45876o = new i("NATIVE_ARRAY_BUFFER", 13, 0, 1, null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final i f45877p = new i("MAP", 14, 0, 1, null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final i f45878q = new i("COLLECTION", 15, 0, 1, null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final i f45879r = new i("DOUBLE_ARRAY", 16, 0, 1, null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final i f45880s = new i("INT_ARRAY", 17, 0, 1, null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final i f45882u = new i("FLOAT_ARRAY", 19, 0, 1, null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final i f45883v = new i("BOOLEAN_ARRAY", 20, 0, 1, null);

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        f45867f = new i("STRING", 4, 0, 1, defaultConstructorMarker);
        f45874m = new i("JS_TYPED_ARRAY", 11, 0, 1, defaultConstructorMarker);
        f45881t = new i("LONG_ARRAY", 18, 0, 1, defaultConstructorMarker);
        i[] iVarArrA = a();
        f45884w = iVarArrA;
        f45885x = AbstractC3048a.a(iVarArrA);
    }

    private i(String str, int i10, int i11) {
        this.f45886a = i11;
    }

    private static final /* synthetic */ i[] a() {
        return new i[]{f45863b, f45864c, f45865d, f45866e, f45867f, f45868g, f45869h, f45870i, f45871j, f45872k, f45873l, f45874m, f45875n, f45876o, f45877p, f45878q, f45879r, f45880s, f45881t, f45882u, f45883v};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f45884w.clone();
    }

    public final int b() {
        return this.f45886a;
    }

    /* synthetic */ i(String str, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, (i12 & 1) != 0 ? j.b() : i11);
    }
}
