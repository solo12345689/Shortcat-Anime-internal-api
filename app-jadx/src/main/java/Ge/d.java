package Ge;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f7455a = new d("FROM_IDE", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f7456b = new d("FROM_BACKEND", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f7457c = new d("FROM_TEST", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f7458d = new d("FROM_BUILTINS", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f7459e = new d("WHEN_CHECK_DECLARATION_CONFLICTS", 4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f7460f = new d("WHEN_CHECK_OVERRIDES", 5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f7461g = new d("FOR_SCRIPT", 6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f7462h = new d("FROM_REFLECTION", 7);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f7463i = new d("WHEN_RESOLVE_DECLARATION", 8);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d f7464j = new d("WHEN_GET_DECLARATION_SCOPE", 9);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final d f7465k = new d("WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS", 10);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final d f7466l = new d("FOR_ALREADY_TRACKED", 11);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d f7467m = new d("WHEN_GET_ALL_DESCRIPTORS", 12);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final d f7468n = new d("WHEN_TYPING", 13);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f7469o = new d("WHEN_GET_SUPER_MEMBERS", 14);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d f7470p = new d("FOR_NON_TRACKED_SCOPE", 15);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final d f7471q = new d("FROM_SYNTHETIC_SCOPE", 16);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f7472r = new d("FROM_DESERIALIZATION", 17);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f7473s = new d("FROM_JAVA_LOADER", 18);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f7474t = new d("WHEN_GET_LOCAL_VARIABLE", 19);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final d f7475u = new d("WHEN_FIND_BY_FQNAME", 20);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final d f7476v = new d("WHEN_GET_COMPANION_OBJECT", 21);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final d f7477w = new d("FOR_DEFAULT_IMPORTS", 22);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final /* synthetic */ d[] f7478x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f7479y;

    static {
        d[] dVarArrB = b();
        f7478x = dVarArrB;
        f7479y = AbstractC3048a.a(dVarArrB);
    }

    private d(String str, int i10) {
    }

    private static final /* synthetic */ d[] b() {
        return new d[]{f7455a, f7456b, f7457c, f7458d, f7459e, f7460f, f7461g, f7462h, f7463i, f7464j, f7465k, f7466l, f7467m, f7468n, f7469o, f7470p, f7471q, f7472r, f7473s, f7474t, f7475u, f7476v, f7477w};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f7478x.clone();
    }

    @Override // Ge.b
    public a a() {
        return null;
    }
}
