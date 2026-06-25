package H7;

import be.AbstractC3048a;
import java.util.Locale;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f8135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f8136b = new v("VISIBLE", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f8137c = new v("HIDDEN", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f8138d = new v("SCROLL", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ v[] f8139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f8140f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v a(String overflow) {
            AbstractC5504s.h(overflow, "overflow");
            String lowerCase = overflow.toLowerCase(Locale.ROOT);
            AbstractC5504s.g(lowerCase, "toLowerCase(...)");
            int iHashCode = lowerCase.hashCode();
            if (iHashCode == -1217487446) {
                if (lowerCase.equals("hidden")) {
                    return v.f8137c;
                }
                return null;
            }
            if (iHashCode == -907680051) {
                if (lowerCase.equals("scroll")) {
                    return v.f8138d;
                }
                return null;
            }
            if (iHashCode == 466743410 && lowerCase.equals("visible")) {
                return v.f8136b;
            }
            return null;
        }

        private a() {
        }
    }

    static {
        v[] vVarArrA = a();
        f8139e = vVarArrA;
        f8140f = AbstractC3048a.a(vVarArrA);
        f8135a = new a(null);
    }

    private v(String str, int i10) {
    }

    private static final /* synthetic */ v[] a() {
        return new v[]{f8136b, f8137c, f8138d};
    }

    public static final v b(String str) {
        return f8135a.a(str);
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f8139e.clone();
    }
}
