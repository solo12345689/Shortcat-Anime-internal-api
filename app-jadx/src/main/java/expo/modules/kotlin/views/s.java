package expo.modules.kotlin.views;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f46237a = new s("SIMPLE", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f46238b = new s("GROUP", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ s[] f46239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f46240d;

    static {
        s[] sVarArrA = a();
        f46239c = sVarArrA;
        f46240d = AbstractC3048a.a(sVarArrA);
    }

    private s(String str, int i10) {
    }

    private static final /* synthetic */ s[] a() {
        return new s[]{f46237a, f46238b};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f46239c.clone();
    }
}
