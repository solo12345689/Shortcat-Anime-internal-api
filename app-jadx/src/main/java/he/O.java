package He;

import app.notifee.core.event.LogEvent;
import be.AbstractC3048a;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class O {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f8499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final O f8500c = new O("IGNORE", 0, "ignore");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final O f8501d = new O("WARN", 1, LogEvent.LEVEL_WARN);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final O f8502e = new O("STRICT", 2, "strict");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ O[] f8503f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f8504g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8505a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        O[] oArrA = a();
        f8503f = oArrA;
        f8504g = AbstractC3048a.a(oArrA);
        f8499b = new a(null);
    }

    private O(String str, int i10, String str2) {
        this.f8505a = str2;
    }

    private static final /* synthetic */ O[] a() {
        return new O[]{f8500c, f8501d, f8502e};
    }

    public static O valueOf(String str) {
        return (O) Enum.valueOf(O.class, str);
    }

    public static O[] values() {
        return (O[]) f8503f.clone();
    }

    public final String b() {
        return this.f8505a;
    }

    public final boolean c() {
        return this == f8500c;
    }

    public final boolean h() {
        return this == f8501d;
    }
}
