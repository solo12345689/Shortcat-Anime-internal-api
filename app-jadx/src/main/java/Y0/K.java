package Y0;

import Ud.AbstractC2279u;
import b1.AbstractC2968a;
import i1.InterfaceC5011d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final K f22604a = new K();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        boolean a();

        float b(InterfaceC5011d interfaceC5011d);

        String c();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f22605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f22606b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f22607c;

        public b(String str, float f10) {
            this.f22605a = str;
            this.f22606b = f10;
        }

        @Override // Y0.K.a
        public boolean a() {
            return this.f22607c;
        }

        @Override // Y0.K.a
        public float b(InterfaceC5011d interfaceC5011d) {
            return this.f22606b;
        }

        @Override // Y0.K.a
        public String c() {
            return this.f22605a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC5504s.c(c(), bVar.c()) && this.f22606b == bVar.f22606b;
        }

        public int hashCode() {
            return (c().hashCode() * 31) + Float.hashCode(this.f22606b);
        }

        public String toString() {
            return "FontVariation.Setting(axisName='" + c() + "', value=" + this.f22606b + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f22608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f22609b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f22610c;

        public c(String str, int i10) {
            this.f22608a = str;
            this.f22609b = i10;
        }

        @Override // Y0.K.a
        public boolean a() {
            return this.f22610c;
        }

        @Override // Y0.K.a
        public float b(InterfaceC5011d interfaceC5011d) {
            return this.f22609b;
        }

        @Override // Y0.K.a
        public String c() {
            return this.f22608a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC5504s.c(c(), cVar.c()) && this.f22609b == cVar.f22609b;
        }

        public int hashCode() {
            return (c().hashCode() * 31) + this.f22609b;
        }

        public String toString() {
            return "FontVariation.Setting(axisName='" + c() + "', value=" + this.f22609b + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f22611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f22612b;

        public d(a... aVarArr) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean z10 = false;
            for (a aVar : aVarArr) {
                String strC = aVar.c();
                Object arrayList = linkedHashMap.get(strC);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(strC, arrayList);
                }
                ((List) arrayList).add(aVar);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (list.size() != 1) {
                    throw new IllegalArgumentException(('\'' + str + "' must be unique. Actual [ [" + AbstractC2279u.w0(list, null, null, null, 0, null, null, 63, null) + ']').toString());
                }
                AbstractC2279u.D(arrayList2, list);
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            this.f22611a = arrayList3;
            int size = arrayList3.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                if (((a) arrayList3.get(i10)).a()) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            this.f22612b = z10;
        }

        public final boolean a() {
            return this.f22612b;
        }

        public final List b() {
            return this.f22611a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && AbstractC5504s.c(this.f22611a, ((d) obj).f22611a);
        }

        public int hashCode() {
            return this.f22611a.hashCode();
        }
    }

    private K() {
    }

    public final d a(L l10, int i10, a... aVarArr) {
        kotlin.jvm.internal.T t10 = new kotlin.jvm.internal.T(3);
        t10.a(c(l10.v()));
        t10.a(b(i10));
        t10.b(aVarArr);
        return new d((a[]) t10.d(new a[t10.c()]));
    }

    public final a b(float f10) {
        boolean z10 = false;
        if (0.0f <= f10 && f10 <= 1.0f) {
            z10 = true;
        }
        if (!z10) {
            AbstractC2968a.a("'ital' must be in 0.0f..1.0f. Actual: " + f10);
        }
        return new b("ital", f10);
    }

    public final a c(int i10) {
        boolean z10 = false;
        if (1 <= i10 && i10 < 1001) {
            z10 = true;
        }
        if (!z10) {
            AbstractC2968a.a("'wght' value must be in [1, 1000]. Actual: " + i10);
        }
        return new c("wght", i10);
    }
}
