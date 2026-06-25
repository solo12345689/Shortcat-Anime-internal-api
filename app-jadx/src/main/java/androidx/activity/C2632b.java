package androidx.activity;

import android.window.BackEvent;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: androidx.activity.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2632b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f24204e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f24205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f24206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f24207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f24208d;

    /* JADX INFO: renamed from: androidx.activity.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C2632b(float f10, float f11, float f12, int i10) {
        this.f24205a = f10;
        this.f24206b = f11;
        this.f24207c = f12;
        this.f24208d = i10;
    }

    public final float a() {
        return this.f24207c;
    }

    public String toString() {
        return "BackEventCompat{touchX=" + this.f24205a + ", touchY=" + this.f24206b + ", progress=" + this.f24207c + ", swipeEdge=" + this.f24208d + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2632b(BackEvent backEvent) {
        AbstractC5504s.h(backEvent, "backEvent");
        C2631a c2631a = C2631a.f24203a;
        this(c2631a.d(backEvent), c2631a.e(backEvent), c2631a.b(backEvent), c2631a.c(backEvent));
    }
}
