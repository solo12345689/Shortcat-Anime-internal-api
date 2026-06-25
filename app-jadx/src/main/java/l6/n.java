package l6;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f52662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final n[] f52663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f52664d = new n("UNKNOWN", 0, -1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n f52665e = new n("VISIBLE", 1, 1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n f52666f = new n("INVISIBLE", 2, 2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ n[] f52667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f52668h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f52669a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        n[] nVarArrA = a();
        f52667g = nVarArrA;
        f52668h = AbstractC3048a.a(nVarArrA);
        f52662b = new a(null);
        f52663c = values();
    }

    private n(String str, int i10, int i11) {
        this.f52669a = i11;
    }

    private static final /* synthetic */ n[] a() {
        return new n[]{f52664d, f52665e, f52666f};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f52667g.clone();
    }
}
