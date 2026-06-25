package Wf;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Wf.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC2357a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC2357a f20890a = new EnumC2357a("NONE", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC2357a f20891b = new EnumC2357a("ALL_JSON_OBJECTS", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC2357a f20892c = new EnumC2357a("POLYMORPHIC", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC2357a[] f20893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f20894e;

    static {
        EnumC2357a[] enumC2357aArrA = a();
        f20893d = enumC2357aArrA;
        f20894e = AbstractC3048a.a(enumC2357aArrA);
    }

    private EnumC2357a(String str, int i10) {
    }

    private static final /* synthetic */ EnumC2357a[] a() {
        return new EnumC2357a[]{f20890a, f20891b, f20892c};
    }

    public static EnumC2357a valueOf(String str) {
        return (EnumC2357a) Enum.valueOf(EnumC2357a.class, str);
    }

    public static EnumC2357a[] values() {
        return (EnumC2357a[]) f20893d.clone();
    }
}
