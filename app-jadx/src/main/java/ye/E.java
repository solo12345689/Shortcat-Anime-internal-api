package ye;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f65059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final E f65060b = new E("FINAL", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final E f65061c = new E("SEALED", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final E f65062d = new E("OPEN", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final E f65063e = new E("ABSTRACT", 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ E[] f65064f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f65065g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final E a(boolean z10, boolean z11, boolean z12) {
            return z10 ? E.f65061c : z11 ? E.f65063e : z12 ? E.f65062d : E.f65060b;
        }

        private a() {
        }
    }

    static {
        E[] eArrA = a();
        f65064f = eArrA;
        f65065g = AbstractC3048a.a(eArrA);
        f65059a = new a(null);
    }

    private E(String str, int i10) {
    }

    private static final /* synthetic */ E[] a() {
        return new E[]{f65060b, f65061c, f65062d, f65063e};
    }

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    public static E[] values() {
        return (E[]) f65064f.clone();
    }
}
