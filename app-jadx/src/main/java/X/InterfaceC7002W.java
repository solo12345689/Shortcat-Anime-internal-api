package x;

import android.os.Build;
import android.view.View;
import i1.InterfaceC5011d;

/* JADX INFO: renamed from: x.W, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC7002W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f63292a = a.f63293a;

    /* JADX INFO: renamed from: x.W$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f63293a = new a();

        private a() {
        }

        public final InterfaceC7002W a() {
            if (AbstractC6991K.d(0, 1, null)) {
                return Build.VERSION.SDK_INT == 28 ? X.f63294b : Y.f63297b;
            }
            throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }

    InterfaceC7001V a(View view, boolean z10, long j10, float f10, float f11, boolean z11, InterfaceC5011d interfaceC5011d, float f12);

    boolean b();
}
