package af;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: af.E, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC2612E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC2612E f23956a = new EnumC2612E("PRETTY", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC2612E f23957b = new EnumC2612E("DEBUG", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC2612E f23958c = new EnumC2612E("NONE", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC2612E[] f23959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f23960e;

    static {
        EnumC2612E[] enumC2612EArrA = a();
        f23959d = enumC2612EArrA;
        f23960e = AbstractC3048a.a(enumC2612EArrA);
    }

    private EnumC2612E(String str, int i10) {
    }

    private static final /* synthetic */ EnumC2612E[] a() {
        return new EnumC2612E[]{f23956a, f23957b, f23958c};
    }

    public static EnumC2612E valueOf(String str) {
        return (EnumC2612E) Enum.valueOf(EnumC2612E.class, str);
    }

    public static EnumC2612E[] values() {
        return (EnumC2612E[]) f23959d.clone();
    }
}
