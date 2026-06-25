package xd;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: xd.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC7131b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC7131b f64340b = new EnumC7131b("None", 0, "None");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC7131b f64341c = new EnumC7131b("NoUpdatesAvailable", 1, "NoUpdatesAvailable");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC7131b f64342d = new EnumC7131b("UpdateAssetsNotAvailable", 2, "UpdateAssetsNotAvailable");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumC7131b f64343e = new EnumC7131b("UpdateServerUnreachable", 3, "UpdateServerUnreachable");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final EnumC7131b f64344f = new EnumC7131b("UpdateHasInvalidSignature", 4, "UpdateHasInvalidSignature");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumC7131b f64345g = new EnumC7131b("UpdateCodeSigningError", 5, "UpdateCodeSigningError");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC7131b f64346h = new EnumC7131b("UpdateFailedToLoad", 6, "UpdateFailedToLoad");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final EnumC7131b f64347i = new EnumC7131b("AssetsFailedToLoad", 7, "AssetsFailedToLoad");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final EnumC7131b f64348j = new EnumC7131b("JSRuntimeError", 8, "JSRuntimeError");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final EnumC7131b f64349k = new EnumC7131b("InitializationError", 9, "InitializationError");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final EnumC7131b f64350l = new EnumC7131b("Unknown", 10, "Unknown");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ EnumC7131b[] f64351m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f64352n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f64353a;

    static {
        EnumC7131b[] enumC7131bArrA = a();
        f64351m = enumC7131bArrA;
        f64352n = AbstractC3048a.a(enumC7131bArrA);
    }

    private EnumC7131b(String str, int i10, String str2) {
        this.f64353a = str2;
    }

    private static final /* synthetic */ EnumC7131b[] a() {
        return new EnumC7131b[]{f64340b, f64341c, f64342d, f64343e, f64344f, f64345g, f64346h, f64347i, f64348j, f64349k, f64350l};
    }

    public static EnumC7131b valueOf(String str) {
        return (EnumC7131b) Enum.valueOf(EnumC7131b.class, str);
    }

    public static EnumC7131b[] values() {
        return (EnumC7131b[]) f64351m.clone();
    }

    public final String b() {
        return this.f64353a;
    }
}
