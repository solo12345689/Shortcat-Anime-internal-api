package g7;

import android.view.Choreographer;
import com.facebook.react.bridge.UiThreadUtil;
import g7.InterfaceC4859b;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: g7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4858a implements InterfaceC4859b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4858a f47364a = new C4858a();

    /* JADX INFO: renamed from: g7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class C0761a implements InterfaceC4859b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Choreographer f47365a;

        public C0761a() {
            Choreographer choreographer = Choreographer.getInstance();
            AbstractC5504s.g(choreographer, "getInstance(...)");
            this.f47365a = choreographer;
        }

        @Override // g7.InterfaceC4859b.a
        public void a(Choreographer.FrameCallback callback) {
            AbstractC5504s.h(callback, "callback");
            this.f47365a.postFrameCallback(callback);
        }

        @Override // g7.InterfaceC4859b.a
        public void b(Choreographer.FrameCallback callback) {
            AbstractC5504s.h(callback, "callback");
            this.f47365a.removeFrameCallback(callback);
        }
    }

    private C4858a() {
    }

    public static final C4858a b() {
        return f47364a;
    }

    @Override // g7.InterfaceC4859b
    public InterfaceC4859b.a a() {
        UiThreadUtil.assertOnUiThread();
        return new C0761a();
    }
}
