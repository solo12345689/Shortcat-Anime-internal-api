package F3;

import android.media.AudioAttributes;
import android.os.Build;
import android.util.SparseIntArray;
import com.revenuecat.purchases.common.verification.SigningManager;
import java.util.Objects;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SparseIntArray f6276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f6277c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0072a f6278a;

    /* JADX INFO: renamed from: F3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private interface InterfaceC0072a {

        /* JADX INFO: renamed from: F3.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public interface InterfaceC0073a {
            InterfaceC0072a build();

            InterfaceC0073a c(int i10);

            InterfaceC0073a d(int i10);

            InterfaceC0073a e(int i10);
        }

        int w();

        int x();

        int y();

        int z();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b implements InterfaceC0072a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AudioAttributes f6279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6280b;

        /* JADX INFO: renamed from: F3.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static class C0074a implements InterfaceC0072a.InterfaceC0073a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final AudioAttributes.Builder f6281a = new AudioAttributes.Builder();

            C0074a() {
            }

            @Override // F3.a.InterfaceC0072a.InterfaceC0073a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0074a e(int i10) {
                this.f6281a.setContentType(i10);
                return this;
            }

            @Override // F3.a.InterfaceC0072a.InterfaceC0073a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C0074a c(int i10) {
                this.f6281a.setFlags(i10);
                return this;
            }

            @Override // F3.a.InterfaceC0072a.InterfaceC0073a
            public InterfaceC0072a build() {
                return new b(this.f6281a.build());
            }

            @Override // F3.a.InterfaceC0072a.InterfaceC0073a
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public C0074a d(int i10) {
                if (i10 == 16) {
                    i10 = 12;
                }
                this.f6281a.setUsage(i10);
                return this;
            }
        }

        b(AudioAttributes audioAttributes) {
            this(audioAttributes, -1);
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return Objects.equals(this.f6279a, ((b) obj).f6279a);
            }
            return false;
        }

        public int hashCode() {
            return ((AudioAttributes) AbstractC6614a.e(this.f6279a)).hashCode();
        }

        public String toString() {
            return "AudioAttributesCompat: audioattributes=" + this.f6279a;
        }

        @Override // F3.a.InterfaceC0072a
        public int w() {
            return ((AudioAttributes) AbstractC6614a.e(this.f6279a)).getFlags();
        }

        @Override // F3.a.InterfaceC0072a
        public int x() {
            return ((AudioAttributes) AbstractC6614a.e(this.f6279a)).getUsage();
        }

        @Override // F3.a.InterfaceC0072a
        public int y() {
            return ((AudioAttributes) AbstractC6614a.e(this.f6279a)).getContentType();
        }

        @Override // F3.a.InterfaceC0072a
        public int z() {
            int i10 = this.f6280b;
            return i10 != -1 ? i10 : a.e(w(), x());
        }

        b(AudioAttributes audioAttributes, int i10) {
            this.f6279a = audioAttributes;
            this.f6280b = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c extends b {

        /* JADX INFO: renamed from: F3.a$c$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static class C0075a extends b.C0074a {
            C0075a() {
            }

            @Override // F3.a.b.C0074a, F3.a.InterfaceC0072a.InterfaceC0073a
            public InterfaceC0072a build() {
                return new c(this.f6281a.build());
            }

            @Override // F3.a.b.C0074a
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public C0075a d(int i10) {
                this.f6281a.setUsage(i10);
                return this;
            }
        }

        c(AudioAttributes audioAttributes) {
            super(audioAttributes, -1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final InterfaceC0072a.InterfaceC0073a f6282a;

        public d() {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f6282a = new c.C0075a();
            } else {
                this.f6282a = new b.C0074a();
            }
        }

        public a a() {
            return new a(this.f6282a.build());
        }

        public d b(int i10) {
            this.f6282a.e(i10);
            return this;
        }

        public d c(int i10) {
            this.f6282a.c(i10);
            return this;
        }

        public d d(int i10) {
            this.f6282a.d(i10);
            return this;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6276b = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
        f6277c = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    }

    a(InterfaceC0072a interfaceC0072a) {
        this.f6278a = interfaceC0072a;
    }

    static int e(int i10, int i11) {
        if ((i10 & 1) == 1) {
            return 7;
        }
        if ((i10 & 4) == 4) {
            return 6;
        }
        switch (i11) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            default:
                return 3;
            case 13:
                return 1;
        }
    }

    public static a f(Object obj) {
        return Build.VERSION.SDK_INT >= 26 ? new a(new c((AudioAttributes) obj)) : new a(new b((AudioAttributes) obj));
    }

    public int a() {
        return this.f6278a.y();
    }

    public int b() {
        return this.f6278a.w();
    }

    public int c() {
        return this.f6278a.z();
    }

    public int d() {
        return this.f6278a.x();
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f6278a.equals(((a) obj).f6278a);
        }
        return false;
    }

    public int hashCode() {
        return this.f6278a.hashCode();
    }

    public String toString() {
        return this.f6278a.toString();
    }
}
