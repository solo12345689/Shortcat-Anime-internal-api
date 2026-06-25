package Cd;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f3045b = new f("StartStartup", 0, "startStartup");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f3046c = new f("EndStartup", 1, "endStartup");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f3047d = new f("Check", 2, "check");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f3048e = new f("CheckCompleteUnavailable", 3, "checkCompleteUnavailable");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f3049f = new f("CheckCompleteAvailable", 4, "checkCompleteAvailable");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f f3050g = new f("CheckError", 5, "checkError");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f f3051h = new f("Download", 6, "download");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f f3052i = new f("DownloadProgress", 7, "downloadProgress");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final f f3053j = new f("DownloadComplete", 8, "downloadComplete");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final f f3054k = new f("DownloadError", 9, "downloadError");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final f f3055l = new f("Restart", 10, "restart");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ f[] f3056m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f3057n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3058a;

    static {
        f[] fVarArrA = a();
        f3056m = fVarArrA;
        f3057n = AbstractC3048a.a(fVarArrA);
    }

    private f(String str, int i10, String str2) {
        this.f3058a = str2;
    }

    private static final /* synthetic */ f[] a() {
        return new f[]{f3045b, f3046c, f3047d, f3048e, f3049f, f3050g, f3051h, f3052i, f3053j, f3054k, f3055l};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f3056m.clone();
    }
}
