package androidx.compose.ui.platform;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u1 f27500a = new u1("Shown", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u1 f27501b = new u1("Hidden", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ u1[] f27502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f27503d;

    static {
        u1[] u1VarArrA = a();
        f27502c = u1VarArrA;
        f27503d = AbstractC3048a.a(u1VarArrA);
    }

    private u1(String str, int i10) {
    }

    private static final /* synthetic */ u1[] a() {
        return new u1[]{f27500a, f27501b};
    }

    public static u1 valueOf(String str) {
        return (u1) Enum.valueOf(u1.class, str);
    }

    public static u1[] values() {
        return (u1[]) f27502c.clone();
    }
}
