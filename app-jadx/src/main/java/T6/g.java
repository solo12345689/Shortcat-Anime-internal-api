package T6;

import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f17217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f17218f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f17219g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f17220h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double f17221i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f17222j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f17223k;

    public g(ReadableMap config) {
        AbstractC5504s.h(config, "config");
        this.f17219g = -1L;
        this.f17222j = 1;
        this.f17223k = 1;
        a(config);
    }

    @Override // T6.e
    public void a(ReadableMap config) {
        AbstractC5504s.h(config, "config");
        this.f17217e = config.getDouble("velocity");
        this.f17218f = config.getDouble("deceleration");
        this.f17219g = -1L;
        this.f17220h = 0.0d;
        this.f17221i = 0.0d;
        int i10 = config.hasKey("iterations") ? config.getInt("iterations") : 1;
        this.f17222j = i10;
        this.f17223k = 1;
        this.f17204a = i10 == 0;
    }

    @Override // T6.e
    public void b(long j10) {
        B b10 = this.f17205b;
        if (b10 == null) {
            throw new IllegalArgumentException("Animated value should not be null");
        }
        long j11 = j10 / ((long) 1000000);
        if (this.f17219g == -1) {
            this.f17219g = j11 - ((long) 16);
            double d10 = this.f17220h;
            if (d10 == this.f17221i) {
                this.f17220h = b10.f17194f;
            } else {
                b10.f17194f = d10;
            }
            this.f17221i = b10.f17194f;
        }
        double d11 = this.f17220h;
        double d12 = this.f17217e;
        double d13 = 1;
        double d14 = this.f17218f;
        double dExp = d11 + ((d12 / (d13 - d14)) * (d13 - Math.exp((-(d13 - d14)) * (j11 - this.f17219g))));
        if (Math.abs(this.f17221i - dExp) < 0.1d) {
            int i10 = this.f17222j;
            if (i10 != -1 && this.f17223k >= i10) {
                this.f17204a = true;
                return;
            } else {
                this.f17219g = -1L;
                this.f17223k++;
            }
        }
        this.f17221i = dExp;
        b10.f17194f = dExp;
    }
}
