package c7;

import android.app.Activity;
import android.util.Pair;
import android.view.View;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import r7.InterfaceC6274a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface f extends JSExceptionHandler {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void onResume();
    }

    static /* synthetic */ void G(f fVar, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openDebugger");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        fVar.v(str);
    }

    void A(ReactContext reactContext);

    void B();

    default String C() {
        return null;
    }

    InterfaceC6274a D();

    boolean E();

    void F();

    void H(ReactContext reactContext);

    Activity a();

    View b(String str);

    void c(boolean z10);

    U6.g d(String str);

    void e(View view);

    void f();

    void g();

    ReactContext getCurrentReactContext();

    void h(String str, a aVar);

    void i(boolean z10);

    String j();

    String k();

    void l();

    boolean m();

    void n(h hVar);

    boolean o();

    void p();

    Pair r(Pair pair);

    void s(boolean z10);

    g t();

    String u();

    void v(String str);

    void w(String str, e eVar);

    j x();

    void y();

    k[] z();

    default void q(String str) {
    }
}
