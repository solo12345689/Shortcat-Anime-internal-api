package af;

import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import be.AbstractC3048a;
import java.util.ArrayList;
import java.util.Set;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class v extends Enum {

    /* JADX INFO: renamed from: b */
    public static final a f24012b;

    /* JADX INFO: renamed from: c */
    public static final Set f24013c;

    /* JADX INFO: renamed from: d */
    public static final Set f24014d;

    /* JADX INFO: renamed from: e */
    public static final v f24015e = new v("VISIBILITY", 0, true);

    /* JADX INFO: renamed from: f */
    public static final v f24016f = new v("MODALITY", 1, true);

    /* JADX INFO: renamed from: g */
    public static final v f24017g = new v("OVERRIDE", 2, true);

    /* JADX INFO: renamed from: h */
    public static final v f24018h = new v("ANNOTATIONS", 3, false);

    /* JADX INFO: renamed from: i */
    public static final v f24019i = new v("INNER", 4, true);

    /* JADX INFO: renamed from: j */
    public static final v f24020j = new v("MEMBER_KIND", 5, true);

    /* JADX INFO: renamed from: k */
    public static final v f24021k = new v("DATA", 6, true);

    /* JADX INFO: renamed from: l */
    public static final v f24022l = new v("INLINE", 7, true);

    /* JADX INFO: renamed from: m */
    public static final v f24023m = new v("EXPECT", 8, true);

    /* JADX INFO: renamed from: n */
    public static final v f24024n = new v("ACTUAL", 9, true);

    /* JADX INFO: renamed from: o */
    public static final v f24025o = new v("CONST", 10, true);

    /* JADX INFO: renamed from: p */
    public static final v f24026p = new v("LATEINIT", 11, true);

    /* JADX INFO: renamed from: q */
    public static final v f24027q = new v("FUN", 12, true);

    /* JADX INFO: renamed from: r */
    public static final v f24028r = new v("VALUE", 13, true);

    /* JADX INFO: renamed from: s */
    private static final /* synthetic */ v[] f24029s;

    /* JADX INFO: renamed from: t */
    private static final /* synthetic */ EnumEntries f24030t;

    /* JADX INFO: renamed from: a */
    private final boolean f24031a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        v[] vVarArrA = a();
        f24029s = vVarArrA;
        f24030t = AbstractC3048a.a(vVarArrA);
        f24012b = new a(null);
        v[] vVarArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (v vVar : vVarArrValues) {
            if (vVar.f24031a) {
                arrayList.add(vVar);
            }
        }
        f24013c = AbstractC2279u.f1(arrayList);
        f24014d = AbstractC2273n.i1(values());
    }

    private v(String str, int i10, boolean z10) {
        super(str, i10);
        this.f24031a = z10;
    }

    private static final /* synthetic */ v[] a() {
        return new v[]{f24015e, f24016f, f24017g, f24018h, f24019i, f24020j, f24021k, f24022l, f24023m, f24024n, f24025o, f24026p, f24027q, f24028r};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f24029s.clone();
    }
}
