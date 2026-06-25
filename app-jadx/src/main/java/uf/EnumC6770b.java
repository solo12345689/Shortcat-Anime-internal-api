package uf;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: uf.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC6770b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC6770b f61510a = new EnumC6770b("FOR_SUBTYPING", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC6770b f61511b = new EnumC6770b("FOR_INCORPORATION", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC6770b f61512c = new EnumC6770b("FROM_EXPRESSION", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC6770b[] f61513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f61514e;

    static {
        EnumC6770b[] enumC6770bArrA = a();
        f61513d = enumC6770bArrA;
        f61514e = AbstractC3048a.a(enumC6770bArrA);
    }

    private EnumC6770b(String str, int i10) {
    }

    private static final /* synthetic */ EnumC6770b[] a() {
        return new EnumC6770b[]{f61510a, f61511b, f61512c};
    }

    public static EnumC6770b valueOf(String str) {
        return (EnumC6770b) Enum.valueOf(EnumC6770b.class, str);
    }

    public static EnumC6770b[] values() {
        return (EnumC6770b[]) f61513d.clone();
    }
}
