package Xe;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f21894a = new k("BEGINNING", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f21895b = new k("MIDDLE", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f21896c = new k("AFTER_DOT", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ k[] f21897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f21898e;

    static {
        k[] kVarArrA = a();
        f21897d = kVarArrA;
        f21898e = AbstractC3048a.a(kVarArrA);
    }

    private k(String str, int i10) {
    }

    private static final /* synthetic */ k[] a() {
        return new k[]{f21894a, f21895b, f21896c};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f21897d.clone();
    }
}
