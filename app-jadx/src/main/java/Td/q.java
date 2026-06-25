package Td;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f17461a = new q("SYNCHRONIZED", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f17462b = new q("PUBLICATION", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f17463c = new q("NONE", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ q[] f17464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f17465e;

    static {
        q[] qVarArrA = a();
        f17464d = qVarArrA;
        f17465e = AbstractC3048a.a(qVarArrA);
    }

    private q(String str, int i10) {
    }

    private static final /* synthetic */ q[] a() {
        return new q[]{f17461a, f17462b, f17463c};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f17464d.clone();
    }
}
