package l6;

import app.notifee.core.event.LogEvent;
import be.AbstractC3048a;
import com.revenuecat.purchases.hybridcommon.ui.HybridPurchaseLogicBridge;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f52565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final e[] f52566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f52567d = new e("UNKNOWN", 0, -1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f52568e = new e("REQUESTED", 1, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f52569f = new e("INTERMEDIATE_AVAILABLE", 2, 2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f52570g = new e(HybridPurchaseLogicBridge.RESULT_SUCCESS, 3, 3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f52571h = new e(HybridPurchaseLogicBridge.RESULT_ERROR, 4, 5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f52572i = new e("EMPTY_EVENT", 5, 7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e f52573j = new e("RELEASED", 6, 8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ e[] f52574k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f52575l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f52576a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52577a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.f52568e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.f52570g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.f52569f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.f52571h.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e.f52573j.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f52577a = iArr;
        }
    }

    static {
        e[] eVarArrA = a();
        f52574k = eVarArrA;
        f52575l = AbstractC3048a.a(eVarArrA);
        f52565b = new a(null);
        f52566c = values();
    }

    private e(String str, int i10, int i11) {
        this.f52576a = i11;
    }

    private static final /* synthetic */ e[] a() {
        return new e[]{f52567d, f52568e, f52569f, f52570g, f52571h, f52572i, f52573j};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f52574k.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        int i10 = b.f52577a[ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "unknown" : "released" : LogEvent.LEVEL_ERROR : "intermediate_available" : com.amazon.device.simplesignin.a.a.a.f35185s : "requested";
    }
}
