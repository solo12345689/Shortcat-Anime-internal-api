package z6;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: z6.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC7300n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC7300n f65734a = new EnumC7300n("ALWAYS", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC7300n f65735b = new EnumC7300n("AUTO", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC7300n f65736c = new EnumC7300n("NEVER", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC7300n[] f65737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f65738e;

    static {
        EnumC7300n[] enumC7300nArrA = a();
        f65737d = enumC7300nArrA;
        f65738e = AbstractC3048a.a(enumC7300nArrA);
    }

    private EnumC7300n(String str, int i10) {
    }

    private static final /* synthetic */ EnumC7300n[] a() {
        return new EnumC7300n[]{f65734a, f65735b, f65736c};
    }

    public static EnumC7300n valueOf(String str) {
        return (EnumC7300n) Enum.valueOf(EnumC7300n.class, str);
    }

    public static EnumC7300n[] values() {
        return (EnumC7300n[]) f65737d.clone();
    }
}
