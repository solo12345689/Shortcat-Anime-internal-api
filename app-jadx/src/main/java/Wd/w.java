package wd;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class w {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u f63157a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u updateDirective) {
            super(null);
            AbstractC5504s.h(updateDirective, "updateDirective");
            this.f63157a = updateDirective;
        }

        public final u a() {
            return this.f63157a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC5504s.c(this.f63157a, ((a) obj).f63157a);
        }

        public int hashCode() {
            return this.f63157a.hashCode();
        }

        public String toString() {
            return "DirectiveUpdateResponsePart(updateDirective=" + this.f63157a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final yd.q f63158a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(yd.q update) {
            super(null);
            AbstractC5504s.h(update, "update");
            this.f63158a = update;
        }

        public final yd.q a() {
            return this.f63158a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC5504s.c(this.f63158a, ((b) obj).f63158a);
        }

        public int hashCode() {
            return this.f63158a.hashCode();
        }

        public String toString() {
            return "ManifestUpdateResponsePart(update=" + this.f63158a + ")";
        }
    }

    public /* synthetic */ w(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private w() {
    }
}
