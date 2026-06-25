package androidx.compose.ui.graphics;

import android.graphics.ColorFilter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.C6340b0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f26763b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ColorFilter f26764a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ d b(a aVar, long j10, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                i10 = c.f26737b.z();
            }
            return aVar.a(j10, i10);
        }

        public final d a(long j10, int i10) {
            return new C6340b0(j10, i10, (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public d(ColorFilter colorFilter) {
        this.f26764a = colorFilter;
    }

    public final ColorFilter a() {
        return this.f26764a;
    }
}
