package F;

import Y.C0;
import Y.U1;
import Y.h2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;
import oe.C5870f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements h2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f6107e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0 f6110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f6111d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C5870f b(int i10, int i11, int i12) {
            int i13 = (i10 / i11) * i11;
            return AbstractC5874j.x(Math.max(i13 - i12, 0), i13 + i11 + i12);
        }

        private a() {
        }
    }

    public y(int i10, int i11, int i12) {
        this.f6108a = i11;
        this.f6109b = i12;
        this.f6110c = U1.h(f6107e.b(i10, i11, i12), U1.q());
        this.f6111d = i10;
    }

    private void l(C5870f c5870f) {
        this.f6110c.setValue(c5870f);
    }

    @Override // Y.h2
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C5870f getValue() {
        return (C5870f) this.f6110c.getValue();
    }

    public final void n(int i10) {
        if (i10 != this.f6111d) {
            this.f6111d = i10;
            l(f6107e.b(i10, this.f6108a, this.f6109b));
        }
    }
}
