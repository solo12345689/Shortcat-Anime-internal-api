package W6;

import be.AbstractC3048a;
import com.revenuecat.purchases.hybridcommon.ui.HybridPurchaseLogicBridge;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f20777a = new a("WARNING", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f20778b = new a(HybridPurchaseLogicBridge.RESULT_ERROR, 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ a[] f20779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f20780d;

    static {
        a[] aVarArrA = a();
        f20779c = aVarArrA;
        f20780d = AbstractC3048a.a(aVarArrA);
    }

    private a(String str, int i10) {
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f20777a, f20778b};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f20779c.clone();
    }
}
