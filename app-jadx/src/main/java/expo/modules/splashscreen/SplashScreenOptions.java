package expo.modules.splashscreen;

import jc.InterfaceC5363a;
import jc.InterfaceC5364b;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR(\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lexpo/modules/splashscreen/SplashScreenOptions;", "Ljc/b;", "<init>", "()V", "", "duration", "J", "getDuration", "()J", "getDuration$annotations", "", "fade", "Z", "getFade", "()Z", "setFade", "(Z)V", "getFade$annotations", "expo-splash-screen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SplashScreenOptions implements InterfaceC5364b {
    private final long duration = 400;
    private boolean fade = true;

    public final long getDuration() {
        return this.duration;
    }

    public final boolean getFade() {
        return this.fade;
    }

    public final void setFade(boolean z10) {
        this.fade = z10;
    }

    @InterfaceC5363a
    public static /* synthetic */ void getDuration$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getFade$annotations() {
    }
}
