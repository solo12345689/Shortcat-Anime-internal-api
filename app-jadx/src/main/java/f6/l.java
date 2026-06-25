package f6;

import be.AbstractC3048a;
import com.revenuecat.purchases.hybridcommon.ui.HybridPurchaseLogicBridge;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a */
    private final C5.a f46942a;

    /* JADX INFO: renamed from: b */
    private final a f46943b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends Enum {

        /* JADX INFO: renamed from: a */
        public static final a f46944a = new a(HybridPurchaseLogicBridge.RESULT_SUCCESS, 0);

        /* JADX INFO: renamed from: b */
        public static final a f46945b = new a("NEAREST", 1);

        /* JADX INFO: renamed from: c */
        public static final a f46946c = new a("MISSING", 2);

        /* JADX INFO: renamed from: d */
        private static final /* synthetic */ a[] f46947d;

        /* JADX INFO: renamed from: e */
        private static final /* synthetic */ EnumEntries f46948e;

        static {
            a[] aVarArrA = a();
            f46947d = aVarArrA;
            f46948e = AbstractC3048a.a(aVarArrA);
        }

        private a(String str, int i10) {
            super(str, i10);
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f46944a, f46945b, f46946c};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f46947d.clone();
        }
    }

    public l(C5.a aVar, a type) {
        AbstractC5504s.h(type, "type");
        this.f46942a = aVar;
        this.f46943b = type;
    }

    public final C5.a a() {
        return this.f46942a;
    }

    public final a b() {
        return this.f46943b;
    }
}
