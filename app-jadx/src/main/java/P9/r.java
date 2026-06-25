package P9;

import P9.AbstractC2012v;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class r extends AbstractC2012v implements Map {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC2012v.a {
        @Override // P9.AbstractC2012v.a
        /* JADX INFO: renamed from: k */
        public r a() {
            return c();
        }

        @Override // P9.AbstractC2012v.a
        /* JADX INFO: renamed from: l */
        public r c() {
            int i10 = this.f13735c;
            if (i10 == 0) {
                return r.v();
            }
            if (this.f13733a != null) {
                if (this.f13736d) {
                    this.f13734b = Arrays.copyOf(this.f13734b, i10 * 2);
                }
                AbstractC2012v.a.j(this.f13734b, this.f13735c, this.f13733a);
            }
            this.f13736d = true;
            return new M(this.f13734b, this.f13735c);
        }

        @Override // P9.AbstractC2012v.a
        /* JADX INFO: renamed from: m */
        public a f(Object obj, Object obj2) {
            super.f(obj, obj2);
            return this;
        }

        @Override // P9.AbstractC2012v.a
        /* JADX INFO: renamed from: n */
        public a g(Map.Entry entry) {
            super.g(entry);
            return this;
        }

        @Override // P9.AbstractC2012v.a
        /* JADX INFO: renamed from: o */
        public a h(Iterable iterable) {
            super.h(iterable);
            return this;
        }

        @Override // P9.AbstractC2012v.a
        /* JADX INFO: renamed from: p */
        public a i(Map map) {
            super.i(map);
            return this;
        }
    }

    r() {
    }

    public static a q() {
        return new a();
    }

    public static r v() {
        return M.f13592j;
    }

    @Override // P9.AbstractC2012v
    /* JADX INFO: renamed from: t */
    public final AbstractC2013w g() {
        throw new AssertionError("should never be called");
    }

    public abstract r u();

    @Override // P9.AbstractC2012v, java.util.Map
    /* JADX INFO: renamed from: w */
    public AbstractC2013w values() {
        return u().keySet();
    }
}
