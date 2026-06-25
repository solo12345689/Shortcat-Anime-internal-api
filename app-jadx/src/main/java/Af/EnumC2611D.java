package af;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: af.D, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC2611D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC2611D f23951a = new EnumC2611D("ALL", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC2611D f23952b = new EnumC2611D("ONLY_NON_SYNTHESIZED", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC2611D f23953c = new EnumC2611D("NONE", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC2611D[] f23954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f23955e;

    static {
        EnumC2611D[] enumC2611DArrA = a();
        f23954d = enumC2611DArrA;
        f23955e = AbstractC3048a.a(enumC2611DArrA);
    }

    private EnumC2611D(String str, int i10) {
    }

    private static final /* synthetic */ EnumC2611D[] a() {
        return new EnumC2611D[]{f23951a, f23952b, f23953c};
    }

    public static EnumC2611D valueOf(String str) {
        return (EnumC2611D) Enum.valueOf(EnumC2611D.class, str);
    }

    public static EnumC2611D[] values() {
        return (EnumC2611D[]) f23954d.clone();
    }
}
