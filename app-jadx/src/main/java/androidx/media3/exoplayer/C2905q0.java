package androidx.media3.exoplayer;

import java.util.Objects;
import t2.AbstractC6614a;

/* JADX INFO: renamed from: androidx.media3.exoplayer.q0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2905q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f31188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f31189c;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.q0$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f31190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f31191b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f31192c;

        public C2905q0 d() {
            return new C2905q0(this);
        }

        public b e(long j10) {
            AbstractC6614a.a(j10 >= 0 || j10 == -9223372036854775807L);
            this.f31192c = j10;
            return this;
        }

        public b f(long j10) {
            this.f31190a = j10;
            return this;
        }

        public b g(float f10) {
            AbstractC6614a.a(f10 > 0.0f || f10 == -3.4028235E38f);
            this.f31191b = f10;
            return this;
        }

        public b() {
            this.f31190a = -9223372036854775807L;
            this.f31191b = -3.4028235E38f;
            this.f31192c = -9223372036854775807L;
        }

        private b(C2905q0 c2905q0) {
            this.f31190a = c2905q0.f31187a;
            this.f31191b = c2905q0.f31188b;
            this.f31192c = c2905q0.f31189c;
        }
    }

    public b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2905q0)) {
            return false;
        }
        C2905q0 c2905q0 = (C2905q0) obj;
        return this.f31187a == c2905q0.f31187a && this.f31188b == c2905q0.f31188b && this.f31189c == c2905q0.f31189c;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.f31187a), Float.valueOf(this.f31188b), Long.valueOf(this.f31189c));
    }

    private C2905q0(b bVar) {
        this.f31187a = bVar.f31190a;
        this.f31188b = bVar.f31191b;
        this.f31189c = bVar.f31192c;
    }
}
