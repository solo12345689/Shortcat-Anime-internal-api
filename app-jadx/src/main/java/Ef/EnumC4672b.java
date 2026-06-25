package ef;

import be.AbstractC3048a;
import com.revenuecat.purchases.hybridcommon.ui.HybridPurchaseLogicBridge;
import kotlin.enums.EnumEntries;

/* JADX INFO: renamed from: ef.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC4672b extends Enum {

    /* JADX INFO: renamed from: a */
    public static final EnumC4672b f45973a = new EnumC4672b("WARNING", 0);

    /* JADX INFO: renamed from: b */
    public static final EnumC4672b f45974b = new EnumC4672b(HybridPurchaseLogicBridge.RESULT_ERROR, 1);

    /* JADX INFO: renamed from: c */
    public static final EnumC4672b f45975c = new EnumC4672b("HIDDEN", 2);

    /* JADX INFO: renamed from: d */
    private static final /* synthetic */ EnumC4672b[] f45976d;

    /* JADX INFO: renamed from: e */
    private static final /* synthetic */ EnumEntries f45977e;

    static {
        EnumC4672b[] enumC4672bArrA = a();
        f45976d = enumC4672bArrA;
        f45977e = AbstractC3048a.a(enumC4672bArrA);
    }

    private EnumC4672b(String str, int i10) {
        super(str, i10);
    }

    private static final /* synthetic */ EnumC4672b[] a() {
        return new EnumC4672b[]{f45973a, f45974b, f45975c};
    }

    public static EnumC4672b valueOf(String str) {
        return (EnumC4672b) Enum.valueOf(EnumC4672b.class, str);
    }

    public static EnumC4672b[] values() {
        return (EnumC4672b[]) f45976d.clone();
    }
}
