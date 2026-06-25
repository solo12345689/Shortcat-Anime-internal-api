package Cd;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f3069b = new h("Idle", 0, "idle");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f3070c = new h("Checking", 1, "checking");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f3071d = new h("Downloading", 2, "downloading");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f3072e = new h("Restarting", 3, "restarting");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ h[] f3073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f3074g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3075a;

    static {
        h[] hVarArrA = a();
        f3073f = hVarArrA;
        f3074g = AbstractC3048a.a(hVarArrA);
    }

    private h(String str, int i10, String str2) {
        this.f3075a = str2;
    }

    private static final /* synthetic */ h[] a() {
        return new h[]{f3069b, f3070c, f3071d, f3072e};
    }

    public static EnumEntries b() {
        return f3074g;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f3073f.clone();
    }
}
