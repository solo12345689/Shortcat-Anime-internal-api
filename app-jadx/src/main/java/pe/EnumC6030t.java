package pe;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: pe.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC6030t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC6030t f56018a = new EnumC6030t("INVARIANT", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC6030t f56019b = new EnumC6030t("IN", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC6030t f56020c = new EnumC6030t("OUT", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC6030t[] f56021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f56022e;

    static {
        EnumC6030t[] enumC6030tArrA = a();
        f56021d = enumC6030tArrA;
        f56022e = AbstractC3048a.a(enumC6030tArrA);
    }

    private EnumC6030t(String str, int i10) {
    }

    private static final /* synthetic */ EnumC6030t[] a() {
        return new EnumC6030t[]{f56018a, f56019b, f56020c};
    }

    public static EnumC6030t valueOf(String str) {
        return (EnumC6030t) Enum.valueOf(EnumC6030t.class, str);
    }

    public static EnumC6030t[] values() {
        return (EnumC6030t[]) f56021d.clone();
    }
}
