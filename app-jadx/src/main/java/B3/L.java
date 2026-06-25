package B3;

import android.util.SparseArray;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.Collections;
import java.util.List;
import t2.C6609I;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface L {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f1137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f1138c;

        public a(String str, int i10, byte[] bArr) {
            this.f1136a = str;
            this.f1137b = i10;
            this.f1138c = bArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f1140b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f1141c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f1142d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f1143e;

        public b(int i10, String str, int i11, List list, byte[] bArr) {
            this.f1139a = i10;
            this.f1140b = str;
            this.f1141c = i11;
            this.f1142d = list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list);
            this.f1143e = bArr;
        }

        public int a() {
            int i10 = this.f1141c;
            if (i10 == 2) {
                return 2048;
            }
            if (i10 != 3) {
                return 0;
            }
            return IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface c {
        SparseArray a();

        L b(int i10, b bVar);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f1144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f1145b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f1146c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f1147d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f1148e;

        public d(int i10, int i11) {
            this(Integer.MIN_VALUE, i10, i11);
        }

        private void d() {
            if (this.f1147d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void a() {
            int i10 = this.f1147d;
            this.f1147d = i10 == Integer.MIN_VALUE ? this.f1145b : i10 + this.f1146c;
            this.f1148e = this.f1144a + this.f1147d;
        }

        public String b() {
            d();
            return this.f1148e;
        }

        public int c() {
            d();
            return this.f1147d;
        }

        public d(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                str = i10 + "/";
            } else {
                str = "";
            }
            this.f1144a = str;
            this.f1145b = i11;
            this.f1146c = i12;
            this.f1147d = Integer.MIN_VALUE;
            this.f1148e = "";
        }
    }

    void a(t2.O o10, U2.r rVar, d dVar);

    void b(C6609I c6609i, int i10);

    void c();
}
