package Jd;

import Fd.G;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import expo.modules.video.player.VideoPlayer;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC5504s;
import ub.C6752d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    private final WeakReference f9490a;

    /* JADX INFO: renamed from: b */
    private c f9491b;

    /* JADX INFO: renamed from: c */
    private boolean f9492c;

    /* JADX INFO: renamed from: d */
    private final WeakReference f9493d;

    public d(WeakReference player, Ub.d appContext) {
        AbstractC5504s.h(player, "player");
        AbstractC5504s.h(appContext, "appContext");
        this.f9490a = player;
        this.f9493d = new WeakReference(appContext);
    }

    private final Ub.d a() throws cc.e {
        Ub.d dVar = (Ub.d) this.f9493d.get();
        if (dVar != null) {
            return dVar;
        }
        throw new cc.e();
    }

    public final c b() {
        return this.f9491b;
    }

    public final boolean c() {
        return this.f9492c;
    }

    @Override // android.content.ServiceConnection
    public void onBindingDied(ComponentName componentName) {
        this.f9492c = false;
        C6752d c6752dU = a().u();
        if (c6752dU != null) {
            C6752d.c(c6752dU, G.a("Expo-video has lost connection to the playback service binder", "This will cause issues with now playing notification and sustaining background playback."), null, 2, null);
        }
        super.onBindingDied(componentName);
    }

    @Override // android.content.ServiceConnection
    public void onNullBinding(ComponentName componentName) {
        AbstractC5504s.h(componentName, "componentName");
        this.f9492c = false;
        C6752d c6752dU = a().u();
        if (c6752dU != null) {
            C6752d.c(c6752dU, G.b("Expo Video could not bind to the playback service", null, 2, null), null, 2, null);
        }
        super.onNullBinding(componentName);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder binder) {
        AbstractC5504s.h(componentName, "componentName");
        AbstractC5504s.h(binder, "binder");
        VideoPlayer videoPlayer = (VideoPlayer) this.f9490a.get();
        if (videoPlayer == null) {
            return;
        }
        c cVar = binder instanceof c ? (c) binder : null;
        if (cVar == null) {
            C6752d c6752dU = a().u();
            if (c6752dU != null) {
                C6752d.c(c6752dU, G.b("Expo-video could not bind to the playback service", null, 2, null), null, 2, null);
                return;
            }
            return;
        }
        this.f9492c = true;
        this.f9491b = cVar;
        cVar.a().K(a());
        cVar.a().J(videoPlayer);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        AbstractC5504s.h(componentName, "componentName");
        this.f9491b = null;
        this.f9492c = false;
    }
}
