package Ue;

import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a {

    /* JADX INFO: renamed from: f */
    public static final C0336a f19523f = new C0336a(null);

    /* JADX INFO: renamed from: a */
    private final int[] f19524a;

    /* JADX INFO: renamed from: b */
    private final int f19525b;

    /* JADX INFO: renamed from: c */
    private final int f19526c;

    /* JADX INFO: renamed from: d */
    private final int f19527d;

    /* JADX INFO: renamed from: e */
    private final List f19528e;

    /* JADX INFO: renamed from: Ue.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0336a {
        public /* synthetic */ C0336a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0336a() {
        }
    }

    public a(int... numbers) {
        List listM;
        AbstractC5504s.h(numbers, "numbers");
        this.f19524a = numbers;
        Integer numH0 = AbstractC2273n.h0(numbers, 0);
        this.f19525b = numH0 != null ? numH0.intValue() : -1;
        Integer numH02 = AbstractC2273n.h0(numbers, 1);
        this.f19526c = numH02 != null ? numH02.intValue() : -1;
        Integer numH03 = AbstractC2273n.h0(numbers, 2);
        this.f19527d = numH03 != null ? numH03.intValue() : -1;
        if (numbers.length <= 3) {
            listM = AbstractC2279u.m();
        } else {
            if (numbers.length > 1024) {
                throw new IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + numbers.length + com.amazon.a.a.o.c.a.b.f34706a);
            }
            listM = AbstractC2279u.b1(AbstractC2273n.d(numbers).subList(3, numbers.length));
        }
        this.f19528e = listM;
    }

    public final int a() {
        return this.f19525b;
    }

    public final int b() {
        return this.f19526c;
    }

    public final boolean c(int i10, int i11, int i12) {
        int i13 = this.f19525b;
        if (i13 > i10) {
            return true;
        }
        if (i13 < i10) {
            return false;
        }
        int i14 = this.f19526c;
        if (i14 > i11) {
            return true;
        }
        return i14 >= i11 && this.f19527d >= i12;
    }

    public final boolean d(a version) {
        AbstractC5504s.h(version, "version");
        return c(version.f19525b, version.f19526c, version.f19527d);
    }

    public final boolean e(int i10, int i11, int i12) {
        int i13 = this.f19525b;
        if (i13 < i10) {
            return true;
        }
        if (i13 > i10) {
            return false;
        }
        int i14 = this.f19526c;
        if (i14 < i11) {
            return true;
        }
        return i14 <= i11 && this.f19527d <= i12;
    }

    public boolean equals(Object obj) {
        if (obj == null || !AbstractC5504s.c(getClass(), obj.getClass())) {
            return false;
        }
        a aVar = (a) obj;
        return this.f19525b == aVar.f19525b && this.f19526c == aVar.f19526c && this.f19527d == aVar.f19527d && AbstractC5504s.c(this.f19528e, aVar.f19528e);
    }

    protected final boolean f(a ourVersion) {
        AbstractC5504s.h(ourVersion, "ourVersion");
        int i10 = this.f19525b;
        return i10 == 0 ? ourVersion.f19525b == 0 && this.f19526c == ourVersion.f19526c : i10 == ourVersion.f19525b && this.f19526c <= ourVersion.f19526c;
    }

    public final int[] g() {
        return this.f19524a;
    }

    public int hashCode() {
        int i10 = this.f19525b;
        int i11 = i10 + (i10 * 31) + this.f19526c;
        int i12 = i11 + (i11 * 31) + this.f19527d;
        return i12 + (i12 * 31) + this.f19528e.hashCode();
    }

    public String toString() {
        int[] iArrG = g();
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArrG) {
            if (i10 == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList.isEmpty() ? "unknown" : AbstractC2279u.w0(arrayList, ".", null, null, 0, null, null, 62, null);
    }
}
