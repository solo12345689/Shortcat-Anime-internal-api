package l6;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f52655a = new k("VITO_V2", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f52656b = new k("VITO_V1", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f52657c = new k("DRAWEE", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f52658d = new k("OTHER", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ k[] f52659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f52660f;

    static {
        k[] kVarArrA = a();
        f52659e = kVarArrA;
        f52660f = AbstractC3048a.a(kVarArrA);
    }

    private k(String str, int i10) {
    }

    private static final /* synthetic */ k[] a() {
        return new k[]{f52655a, f52656b, f52657c, f52658d};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f52659e.clone();
    }
}
