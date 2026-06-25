package We;

import Ud.AbstractC2279u;
import Ud.L;
import Ud.S;
import Ve.a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class f implements Ue.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f20870d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f20871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final List f20872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Map f20873g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f20874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f20875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f20876c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20877a;

        static {
            int[] iArr = new int[a.e.c.EnumC0357c.values().length];
            try {
                iArr[a.e.c.EnumC0357c.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.e.c.EnumC0357c.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.e.c.EnumC0357c.DESC_TO_CLASS_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f20877a = iArr;
        }
    }

    static {
        String strW0 = AbstractC2279u.w0(AbstractC2279u.p('k', 'o', 't', 'l', 'i', 'n'), "", null, null, 0, null, null, 62, null);
        f20871e = strW0;
        List listP = AbstractC2279u.p(strW0 + "/Any", strW0 + "/Nothing", strW0 + "/Unit", strW0 + "/Throwable", strW0 + "/Number", strW0 + "/Byte", strW0 + "/Double", strW0 + "/Float", strW0 + "/Int", strW0 + "/Long", strW0 + "/Short", strW0 + "/Boolean", strW0 + "/Char", strW0 + "/CharSequence", strW0 + "/String", strW0 + "/Comparable", strW0 + "/Enum", strW0 + "/Array", strW0 + "/ByteArray", strW0 + "/DoubleArray", strW0 + "/FloatArray", strW0 + "/IntArray", strW0 + "/LongArray", strW0 + "/ShortArray", strW0 + "/BooleanArray", strW0 + "/CharArray", strW0 + "/Cloneable", strW0 + "/Annotation", strW0 + "/collections/Iterable", strW0 + "/collections/MutableIterable", strW0 + "/collections/Collection", strW0 + "/collections/MutableCollection", strW0 + "/collections/List", strW0 + "/collections/MutableList", strW0 + "/collections/Set", strW0 + "/collections/MutableSet", strW0 + "/collections/Map", strW0 + "/collections/MutableMap", strW0 + "/collections/Map.Entry", strW0 + "/collections/MutableMap.MutableEntry", strW0 + "/collections/Iterator", strW0 + "/collections/MutableIterator", strW0 + "/collections/ListIterator", strW0 + "/collections/MutableListIterator");
        f20872f = listP;
        Iterable<L> iterableH1 = AbstractC2279u.h1(listP);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5874j.e(S.e(AbstractC2279u.x(iterableH1, 10)), 16));
        for (L l10 : iterableH1) {
            linkedHashMap.put((String) l10.d(), Integer.valueOf(l10.c()));
        }
        f20873g = linkedHashMap;
    }

    public f(String[] strings, Set localNameIndices, List records) {
        AbstractC5504s.h(strings, "strings");
        AbstractC5504s.h(localNameIndices, "localNameIndices");
        AbstractC5504s.h(records, "records");
        this.f20874a = strings;
        this.f20875b = localNameIndices;
        this.f20876c = records;
    }

    @Override // Ue.d
    public boolean a(int i10) {
        return this.f20875b.contains(Integer.valueOf(i10));
    }

    @Override // Ue.d
    public String b(int i10) {
        return getString(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    @Override // Ue.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getString(int r15) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: We.f.getString(int):java.lang.String");
    }
}
