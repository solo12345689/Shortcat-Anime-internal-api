package W0;

import V0.AbstractC2287c;
import android.text.SegmentFinder;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f20599a = new a();

    /* JADX INFO: renamed from: W0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0360a extends SegmentFinder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f20600a;

        C0360a(f fVar) {
            this.f20600a = fVar;
        }

        public int nextEndBoundary(int i10) {
            return this.f20600a.c(i10);
        }

        public int nextStartBoundary(int i10) {
            return this.f20600a.a(i10);
        }

        public int previousEndBoundary(int i10) {
            return this.f20600a.d(i10);
        }

        public int previousStartBoundary(int i10) {
            return this.f20600a.b(i10);
        }
    }

    private a() {
    }

    public final SegmentFinder a(f fVar) {
        return AbstractC2287c.a(new C0360a(fVar));
    }
}
