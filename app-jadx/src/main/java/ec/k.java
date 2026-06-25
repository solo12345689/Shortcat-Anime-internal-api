package ec;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f45888b = new k("Int8Array", 0, 0, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f45889c = new k("Int16Array", 1, 0, 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f45890d = new k("Int32Array", 2, 0, 1, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f45891e = new k("Uint8Array", 3, 0, 1, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k f45892f = new k("Uint8ClampedArray", 4, 0, 1, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k f45893g = new k("Uint16Array", 5, 0, 1, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final k f45894h = new k("Uint32Array", 6, 0, 1, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final k f45895i = new k("Float32Array", 7, 0, 1, null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final k f45896j = new k("Float64Array", 8, 0, 1, null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final k f45897k = new k("BigInt64Array", 9, 0, 1, null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final k f45898l = new k("BigUint64Array", 10, 0, 1, null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ k[] f45899m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f45900n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f45901a;

    static {
        k[] kVarArrA = a();
        f45899m = kVarArrA;
        f45900n = AbstractC3048a.a(kVarArrA);
    }

    private k(String str, int i10, int i11) {
        this.f45901a = i11;
    }

    private static final /* synthetic */ k[] a() {
        return new k[]{f45888b, f45889c, f45890d, f45891e, f45892f, f45893g, f45894h, f45895i, f45896j, f45897k, f45898l};
    }

    public static EnumEntries b() {
        return f45900n;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f45899m.clone();
    }

    public final int c() {
        return this.f45901a;
    }

    /* synthetic */ k(String str, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, (i12 & 1) != 0 ? h.b() : i11);
    }
}
