package Jf;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C f9516a = new C("START", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C f9517b = new C("STOP", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C f9518c = new C("STOP_AND_RESET_REPLAY_CACHE", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ C[] f9519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f9520e;

    static {
        C[] cArrA = a();
        f9519d = cArrA;
        f9520e = AbstractC3048a.a(cArrA);
    }

    private C(String str, int i10) {
    }

    private static final /* synthetic */ C[] a() {
        return new C[]{f9516a, f9517b, f9518c};
    }

    public static C valueOf(String str) {
        return (C) Enum.valueOf(C.class, str);
    }

    public static C[] values() {
        return (C[]) f9519d.clone();
    }
}
