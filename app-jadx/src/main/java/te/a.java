package Te;

import Ud.AbstractC2279u;
import Ud.O;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.C5870f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends Ue.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0301a f17480g = new C0301a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f17481h = new a(1, 0, 7);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f17482i = new a(new int[0]);

    /* JADX INFO: renamed from: Te.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0301a {
        public /* synthetic */ C0301a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(InputStream stream) {
            AbstractC5504s.h(stream, "stream");
            DataInputStream dataInputStream = new DataInputStream(stream);
            C5870f c5870f = new C5870f(1, dataInputStream.readInt());
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(c5870f, 10));
            Iterator it = c5870f.iterator();
            while (it.hasNext()) {
                ((O) it).nextInt();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] iArrA1 = AbstractC2279u.a1(arrayList);
            return new a(Arrays.copyOf(iArrA1, iArrA1.length));
        }

        private C0301a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int... numbers) {
        super(Arrays.copyOf(numbers, numbers.length));
        AbstractC5504s.h(numbers, "numbers");
    }

    public boolean h() {
        return f(f17481h);
    }
}
