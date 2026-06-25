package q2;

import android.os.Bundle;
import java.util.Objects;
import t2.AbstractC6614a;

/* JADX INFO: renamed from: q2.p */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6101p {

    /* JADX INFO: renamed from: e */
    public static final C6101p f56928e = new b(0).e();

    /* JADX INFO: renamed from: f */
    private static final String f56929f = t2.a0.H0(0);

    /* JADX INFO: renamed from: g */
    private static final String f56930g = t2.a0.H0(1);

    /* JADX INFO: renamed from: h */
    private static final String f56931h = t2.a0.H0(2);

    /* JADX INFO: renamed from: i */
    private static final String f56932i = t2.a0.H0(3);

    /* JADX INFO: renamed from: a */
    public final int f56933a;

    /* JADX INFO: renamed from: b */
    public final int f56934b;

    /* JADX INFO: renamed from: c */
    public final int f56935c;

    /* JADX INFO: renamed from: d */
    public final String f56936d;

    /* JADX INFO: renamed from: q2.p$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final int f56937a;

        /* JADX INFO: renamed from: b */
        private int f56938b;

        /* JADX INFO: renamed from: c */
        private int f56939c;

        /* JADX INFO: renamed from: d */
        private String f56940d;

        public b(int i10) {
            this.f56937a = i10;
        }

        public C6101p e() {
            AbstractC6614a.a(this.f56938b <= this.f56939c);
            return new C6101p(this);
        }

        public b f(int i10) {
            this.f56939c = i10;
            return this;
        }

        public b g(int i10) {
            this.f56938b = i10;
            return this;
        }

        public b h(String str) {
            AbstractC6614a.a(this.f56937a != 0 || str == null);
            this.f56940d = str;
            return this;
        }
    }

    /* synthetic */ C6101p(b bVar, a aVar) {
        this(bVar);
    }

    public static C6101p a(Bundle bundle) {
        int i10 = bundle.getInt(f56929f, 0);
        int i11 = bundle.getInt(f56930g, 0);
        int i12 = bundle.getInt(f56931h, 0);
        return new b(i10).g(i11).f(i12).h(bundle.getString(f56932i)).e();
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        int i10 = this.f56933a;
        if (i10 != 0) {
            bundle.putInt(f56929f, i10);
        }
        int i11 = this.f56934b;
        if (i11 != 0) {
            bundle.putInt(f56930g, i11);
        }
        int i12 = this.f56935c;
        if (i12 != 0) {
            bundle.putInt(f56931h, i12);
        }
        String str = this.f56936d;
        if (str != null) {
            bundle.putString(f56932i, str);
        }
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6101p)) {
            return false;
        }
        C6101p c6101p = (C6101p) obj;
        return this.f56933a == c6101p.f56933a && this.f56934b == c6101p.f56934b && this.f56935c == c6101p.f56935c && Objects.equals(this.f56936d, c6101p.f56936d);
    }

    public int hashCode() {
        int i10 = (((((527 + this.f56933a) * 31) + this.f56934b) * 31) + this.f56935c) * 31;
        String str = this.f56936d;
        return i10 + (str == null ? 0 : str.hashCode());
    }

    private C6101p(b bVar) {
        this.f56933a = bVar.f56937a;
        this.f56934b = bVar.f56938b;
        this.f56935c = bVar.f56939c;
        this.f56936d = bVar.f56940d;
    }
}
