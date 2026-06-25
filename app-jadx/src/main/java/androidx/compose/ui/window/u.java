package androidx.compose.ui.window;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f27897a = new u("Inherit", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f27898b = new u("SecureOn", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f27899c = new u("SecureOff", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ u[] f27900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f27901e;

    static {
        u[] uVarArrA = a();
        f27900d = uVarArrA;
        f27901e = AbstractC3048a.a(uVarArrA);
    }

    private u(String str, int i10) {
    }

    private static final /* synthetic */ u[] a() {
        return new u[]{f27897a, f27898b, f27899c};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f27900d.clone();
    }
}
