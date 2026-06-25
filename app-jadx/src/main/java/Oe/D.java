package Oe;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D f13154a = new D("SOURCE", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final D f13155b = new D("BINARY", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ D[] f13156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f13157d;

    static {
        D[] dArrA = a();
        f13156c = dArrA;
        f13157d = AbstractC3048a.a(dArrA);
    }

    private D(String str, int i10) {
    }

    private static final /* synthetic */ D[] a() {
        return new D[]{f13154a, f13155b};
    }

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) f13156c.clone();
    }
}
