package af;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: af.C, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC2610C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC2610C f23946a = new EnumC2610C("RENDER_OVERRIDE", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC2610C f23947b = new EnumC2610C("RENDER_OPEN", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC2610C f23948c = new EnumC2610C("RENDER_OPEN_OVERRIDE", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC2610C[] f23949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f23950e;

    static {
        EnumC2610C[] enumC2610CArrA = a();
        f23949d = enumC2610CArrA;
        f23950e = AbstractC3048a.a(enumC2610CArrA);
    }

    private EnumC2610C(String str, int i10) {
    }

    private static final /* synthetic */ EnumC2610C[] a() {
        return new EnumC2610C[]{f23946a, f23947b, f23948c};
    }

    public static EnumC2610C valueOf(String str) {
        return (EnumC2610C) Enum.valueOf(EnumC2610C.class, str);
    }

    public static EnumC2610C[] values() {
        return (EnumC2610C[]) f23949d.clone();
    }
}
