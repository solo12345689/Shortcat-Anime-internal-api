package I0;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: I0.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1689o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1689o f8720a = new EnumC1689o("Width", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC1689o f8721b = new EnumC1689o("Height", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC1689o[] f8722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f8723d;

    static {
        EnumC1689o[] enumC1689oArrA = a();
        f8722c = enumC1689oArrA;
        f8723d = AbstractC3048a.a(enumC1689oArrA);
    }

    private EnumC1689o(String str, int i10) {
    }

    private static final /* synthetic */ EnumC1689o[] a() {
        return new EnumC1689o[]{f8720a, f8721b};
    }

    public static EnumC1689o valueOf(String str) {
        return (EnumC1689o) Enum.valueOf(EnumC1689o.class, str);
    }

    public static EnumC1689o[] values() {
        return (EnumC1689o[]) f8722c.clone();
    }
}
