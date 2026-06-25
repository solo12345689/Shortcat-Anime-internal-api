package ve;

import Xe.b;
import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f62284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f62285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q f62286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q f62287f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ q[] f62288g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f62289h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Xe.b f62290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Xe.f f62291b;

    static {
        b.a aVar = Xe.b.f21759d;
        f62284c = new q("UBYTEARRAY", 0, b.a.b(aVar, "kotlin/UByteArray", false, 2, null));
        f62285d = new q("USHORTARRAY", 1, b.a.b(aVar, "kotlin/UShortArray", false, 2, null));
        f62286e = new q("UINTARRAY", 2, b.a.b(aVar, "kotlin/UIntArray", false, 2, null));
        f62287f = new q("ULONGARRAY", 3, b.a.b(aVar, "kotlin/ULongArray", false, 2, null));
        q[] qVarArrA = a();
        f62288g = qVarArrA;
        f62289h = AbstractC3048a.a(qVarArrA);
    }

    private q(String str, int i10, Xe.b bVar) {
        this.f62290a = bVar;
        this.f62291b = bVar.h();
    }

    private static final /* synthetic */ q[] a() {
        return new q[]{f62284c, f62285d, f62286e, f62287f};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f62288g.clone();
    }

    public final Xe.f b() {
        return this.f62291b;
    }
}
