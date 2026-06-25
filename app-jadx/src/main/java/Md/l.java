package Md;

import Fd.C1579s;
import Td.L;
import android.app.Activity;
import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.util.Rational;
import android.view.View;
import androidx.media3.ui.PlayerView;
import expo.modules.video.VideoView;
import expo.modules.video.enums.ContentFit;
import ie.InterfaceC5082a;
import kotlin.jvm.internal.AbstractC5504s;
import q2.l0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class l {
    /* JADX WARN: Removed duplicated region for block: B:33:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final android.app.Activity r5, boolean r6, android.util.Rational r7) throws Fd.C1579s {
        /*
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.AbstractC5504s.h(r5, r0)
            r0 = 0
            if (r7 == 0) goto L20
            float r1 = r7.floatValue()
            double r1 = (double) r1
            r3 = 4601209024398258277(0x3fdac73abc947065, double:0.41841)
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 > 0) goto L20
            r3 = 4612564220354725151(0x40031eb851eb851f, double:2.39)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L20
            goto L21
        L20:
            r7 = r0
        L21:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L49
            expo.modules.video.VideoView$a r2 = expo.modules.video.VideoView.INSTANCE
            boolean r2 = r2.a(r5)
            if (r2 == 0) goto L49
            android.app.PictureInPictureParams$Builder r2 = Id.f.a()
            if (r7 == 0) goto L38
            Md.f.a(r2, r7)
        L38:
            r7 = 31
            if (r1 < r7) goto L3f
            Md.g.a(r2, r6)
        L3f:
            Md.j r6 = new Md.j
            r6.<init>()
            r5 = 1
            r7 = 0
            k(r7, r6, r5, r0)
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Md.l.c(android.app.Activity, boolean, android.util.Rational):void");
    }

    public static /* synthetic */ void d(Activity activity, boolean z10, Rational rational, int i10, Object obj) throws C1579s {
        if ((i10 & 4) != 0) {
            rational = null;
        }
        c(activity, z10, rational);
    }

    public static final L e(Activity activity, PictureInPictureParams.Builder builder) {
        activity.setPictureInPictureParams(builder.build());
        return L.f17438a;
    }

    public static final void f(final Activity activity, final Rect rectHint) throws C1579s {
        AbstractC5504s.h(activity, "activity");
        AbstractC5504s.h(rectHint, "rectHint");
        if (Build.VERSION.SDK_INT < 26 || !VideoView.INSTANCE.a(activity)) {
            return;
        }
        k(false, new InterfaceC5082a() { // from class: Md.k
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return l.g(activity, rectHint);
            }
        }, 1, null);
    }

    public static final L g(Activity activity, Rect rect) {
        activity.setPictureInPictureParams(Id.f.a().setSourceRectHint(rect).build());
        return L.f17438a;
    }

    public static final Rational h(l0 videoSize, int i10, int i11, ContentFit contentFit) {
        AbstractC5504s.h(videoSize, "videoSize");
        AbstractC5504s.h(contentFit, "contentFit");
        Rational rational = contentFit == ContentFit.CONTAIN ? new Rational(videoSize.f56923a, videoSize.f56924b) : new Rational(i10, i11);
        Rational rational2 = new Rational(239, 100);
        Rational rational3 = new Rational(100, 239);
        return rational.floatValue() > rational2.floatValue() ? rational2 : rational.floatValue() < rational3.floatValue() ? rational3 : rational;
    }

    public static final Rect i(PlayerView playerView) {
        AbstractC5504s.h(playerView, "playerView");
        Rect rect = new Rect();
        View videoSurfaceView = playerView.getVideoSurfaceView();
        if (videoSurfaceView != null) {
            videoSurfaceView.getGlobalVisibleRect(rect);
        }
        int[] iArr = new int[2];
        View videoSurfaceView2 = playerView.getVideoSurfaceView();
        if (videoSurfaceView2 != null) {
            videoSurfaceView2.getLocationOnScreen(iArr);
        }
        int i10 = rect.bottom - rect.top;
        int i11 = iArr[1];
        rect.top = i11;
        rect.bottom = i11 + i10;
        return rect;
    }

    public static final void j(boolean z10, InterfaceC5082a block) throws C1579s {
        AbstractC5504s.h(block, "block");
        try {
            block.invoke();
        } catch (IllegalStateException unused) {
            Log.e("ExpoVideo", "Current activity does not support picture-in-picture. Make sure you have configured the `expo-video` config plugin correctly.");
            if (z10) {
                throw new C1579s();
            }
        }
    }

    public static /* synthetic */ void k(boolean z10, InterfaceC5082a interfaceC5082a, int i10, Object obj) throws C1579s {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        j(z10, interfaceC5082a);
    }
}
