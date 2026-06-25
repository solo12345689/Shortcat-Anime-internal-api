package T6;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f17231l = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f17232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double[] f17233f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f17234g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f17235h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f17236i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f17237j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f17238k;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public j(ReadableMap config) {
        AbstractC5504s.h(config, "config");
        this.f17232e = -1L;
        this.f17233f = new double[0];
        this.f17236i = 1;
        this.f17237j = 1;
        a(config);
    }

    @Override // T6.e
    public void a(ReadableMap config) {
        int size;
        AbstractC5504s.h(config, "config");
        ReadableArray array = config.getArray("frames");
        if (array != null && this.f17233f.length != (size = array.size())) {
            double[] dArr = new double[size];
            for (int i10 = 0; i10 < size; i10++) {
                dArr[i10] = array.getDouble(i10);
            }
            this.f17233f = dArr;
        }
        this.f17234g = (config.hasKey("toValue") && config.getType("toValue") == ReadableType.Number) ? config.getDouble("toValue") : 0.0d;
        int i11 = (config.hasKey("iterations") && config.getType("iterations") == ReadableType.Number) ? config.getInt("iterations") : 1;
        this.f17236i = i11;
        this.f17237j = 1;
        this.f17204a = i11 == 0;
        this.f17232e = -1L;
    }

    @Override // T6.e
    public void b(long j10) {
        double d10;
        B b10 = this.f17205b;
        if (b10 == null) {
            throw new IllegalArgumentException("Animated value should not be null");
        }
        if (this.f17232e < 0) {
            this.f17232e = j10;
            if (this.f17237j == 1) {
                this.f17235h = b10.f17194f;
            }
        }
        int iRound = (int) Math.round(((j10 - this.f17232e) / ((long) 1000000)) / 16.666666666666668d);
        if (iRound < 0) {
            String str = "Calculated frame index should never be lower than 0. Called with frameTimeNanos " + j10 + " and mStartFrameTimeNanos " + this.f17232e;
            if (Y6.a.f22860b) {
                throw new IllegalStateException(str.toString());
            }
            if (this.f17238k < 100) {
                AbstractC7283a.I("ReactNative", str);
                this.f17238k++;
                return;
            }
            return;
        }
        if (this.f17204a) {
            return;
        }
        double[] dArr = this.f17233f;
        if (iRound >= dArr.length - 1) {
            int i10 = this.f17236i;
            if (i10 == -1 || this.f17237j < i10) {
                double d11 = this.f17235h;
                d10 = d11 + (dArr[dArr.length - 1] * (this.f17234g - d11));
                this.f17232e = -1L;
                this.f17237j++;
            } else {
                d10 = this.f17234g;
                this.f17204a = true;
            }
        } else {
            double d12 = this.f17235h;
            d10 = d12 + (dArr[iRound] * (this.f17234g - d12));
        }
        b10.f17194f = d10;
    }
}
