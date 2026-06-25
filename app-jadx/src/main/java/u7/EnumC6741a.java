package u7;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: u7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC6741a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC6741a f61402a = new EnumC6741a("DEFAULT", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC6741a f61403b = new EnumC6741a("RELOAD", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC6741a f61404c = new EnumC6741a("FORCE_CACHE", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC6741a f61405d = new EnumC6741a("ONLY_IF_CACHED", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumC6741a[] f61406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f61407f;

    static {
        EnumC6741a[] enumC6741aArrA = a();
        f61406e = enumC6741aArrA;
        f61407f = AbstractC3048a.a(enumC6741aArrA);
    }

    private EnumC6741a(String str, int i10) {
    }

    private static final /* synthetic */ EnumC6741a[] a() {
        return new EnumC6741a[]{f61402a, f61403b, f61404c, f61405d};
    }

    public static EnumC6741a valueOf(String str) {
        return (EnumC6741a) Enum.valueOf(EnumC6741a.class, str);
    }

    public static EnumC6741a[] values() {
        return (EnumC6741a[]) f61406e.clone();
    }
}
