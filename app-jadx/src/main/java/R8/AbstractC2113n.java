package R8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: R8.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2113n {

    /* JADX INFO: renamed from: R8.n$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f15343a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f15344b;

        /* synthetic */ a(Object obj, byte[] bArr) {
            AbstractC2115p.l(obj);
            this.f15344b = obj;
            this.f15343a = new ArrayList();
        }

        public a a(String str, Object obj) {
            AbstractC2115p.l(str);
            int length = str.length();
            String strValueOf = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(length + 1 + strValueOf.length());
            sb2.append(str);
            sb2.append(com.amazon.a.a.o.b.f.f34695b);
            sb2.append(strValueOf);
            this.f15343a.add(sb2.toString());
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f15344b.getClass().getSimpleName());
            sb2.append('{');
            List list = this.f15343a;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append((String) list.get(i10));
                if (i10 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a c(Object obj) {
        return new a(obj, null);
    }
}
