package Td;

import be.AbstractC3048a;
import com.revenuecat.purchases.hybridcommon.ui.HybridPurchaseLogicBridge;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Td.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2155f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC2155f f17447a = new EnumC2155f("WARNING", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC2155f f17448b = new EnumC2155f(HybridPurchaseLogicBridge.RESULT_ERROR, 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC2155f f17449c = new EnumC2155f("HIDDEN", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC2155f[] f17450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f17451e;

    static {
        EnumC2155f[] enumC2155fArrA = a();
        f17450d = enumC2155fArrA;
        f17451e = AbstractC3048a.a(enumC2155fArrA);
    }

    private EnumC2155f(String str, int i10) {
    }

    private static final /* synthetic */ EnumC2155f[] a() {
        return new EnumC2155f[]{f17447a, f17448b, f17449c};
    }

    public static EnumC2155f valueOf(String str) {
        return (EnumC2155f) Enum.valueOf(EnumC2155f.class, str);
    }

    public static EnumC2155f[] values() {
        return (EnumC2155f[]) f17450d.clone();
    }
}
