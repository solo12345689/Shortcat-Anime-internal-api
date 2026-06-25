package A2;

import P9.AbstractC2013w;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final P f150i = new b().h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC2013w f151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f155e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f156f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f157g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f158h;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Double f160b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Double f161c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private AbstractC2013w f159a = AbstractC2013w.B(1, 5);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f162d = true;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f163e = true;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f164f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f165g = true;

        public P h() {
            return new P(this);
        }

        public b i(boolean z10) {
            this.f163e = z10;
            return this;
        }

        public b j(boolean z10) {
            this.f164f = z10;
            return this;
        }

        public b k(boolean z10) {
            this.f162d = z10;
            return this;
        }

        public b l(boolean z10) {
            this.f165g = z10;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof P)) {
            return false;
        }
        P p10 = (P) obj;
        return this.f151a.equals(p10.f151a) && this.f156f == p10.f156f && Objects.equals(this.f152b, p10.f152b) && Objects.equals(this.f153c, p10.f153c) && this.f154d == p10.f154d && this.f157g == p10.f157g && this.f158h == p10.f158h;
    }

    public int hashCode() {
        return Objects.hash(this.f151a, this.f152b, this.f153c, Boolean.valueOf(this.f154d), Boolean.valueOf(this.f156f), Boolean.valueOf(this.f157g), Boolean.valueOf(this.f158h));
    }

    private P(b bVar) {
        this.f151a = bVar.f159a;
        this.f152b = bVar.f160b;
        this.f153c = bVar.f161c;
        this.f154d = bVar.f162d;
        this.f155e = !bVar.f163e;
        this.f156f = bVar.f163e;
        this.f157g = bVar.f164f;
        this.f158h = bVar.f165g;
    }
}
