package g1;

import java.util.ArrayList;
import java.util.List;
import k1.AbstractC5436a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: g1.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4831k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47287b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C4831k f47288c = new C4831k(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C4831k f47289d = new C4831k(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final C4831k f47290e = new C4831k(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f47291a;

    /* JADX INFO: renamed from: g1.k$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C4831k a(List list) {
            Integer numValueOf = 0;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                numValueOf = Integer.valueOf(numValueOf.intValue() | ((C4831k) list.get(i10)).e());
            }
            return new C4831k(numValueOf.intValue());
        }

        public final C4831k b() {
            return C4831k.f47290e;
        }

        public final C4831k c() {
            return C4831k.f47288c;
        }

        public final C4831k d() {
            return C4831k.f47289d;
        }

        private a() {
        }
    }

    public C4831k(int i10) {
        this.f47291a = i10;
    }

    public final boolean d(C4831k c4831k) {
        int i10 = this.f47291a;
        return (c4831k.f47291a | i10) == i10;
    }

    public final int e() {
        return this.f47291a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4831k) && this.f47291a == ((C4831k) obj).f47291a;
    }

    public int hashCode() {
        return this.f47291a;
    }

    public String toString() {
        if (this.f47291a == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.f47291a & f47289d.f47291a) != 0) {
            arrayList.add("Underline");
        }
        if ((this.f47291a & f47290e.f47291a) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + AbstractC5436a.e(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
