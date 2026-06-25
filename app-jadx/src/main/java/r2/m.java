package r2;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;
import t2.AbstractC6614a;
import t2.AbstractC6616c;
import t2.AbstractC6635w;
import t2.C6626m;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AudioManager f58433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Context f58434b;

    public static /* synthetic */ void a(Context context, C6626m c6626m) {
        f58433a = (AudioManager) context.getSystemService("audio");
        c6626m.f();
    }

    public static int b(AudioManager audioManager, g gVar) {
        return Build.VERSION.SDK_INT >= 26 ? audioManager.abandonAudioFocusRequest(gVar.c()) : audioManager.abandonAudioFocus(gVar.f());
    }

    public static synchronized AudioManager c(Context context) {
        try {
            final Context applicationContext = context.getApplicationContext();
            if (f58434b != applicationContext) {
                f58433a = null;
            }
            AudioManager audioManager = f58433a;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                final C6626m c6626m = new C6626m();
                AbstractC6616c.a().execute(new Runnable() { // from class: r2.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        m.a(applicationContext, c6626m);
                    }
                });
                c6626m.b();
                return (AudioManager) AbstractC6614a.e(f58433a);
            }
            AudioManager audioManager2 = (AudioManager) applicationContext.getSystemService("audio");
            f58433a = audioManager2;
            return (AudioManager) AbstractC6614a.e(audioManager2);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static int d(AudioManager audioManager, int i10) {
        return audioManager.getStreamMaxVolume(i10);
    }

    public static int e(AudioManager audioManager, int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            return audioManager.getStreamMinVolume(i10);
        }
        return 0;
    }

    public static int f(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            AbstractC6635w.j("AudioManagerCompat", "Could not retrieve stream volume for stream type " + i10, e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    public static boolean g(AudioManager audioManager, int i10) {
        return audioManager.isStreamMute(i10);
    }

    public static int h(AudioManager audioManager, g gVar) {
        return Build.VERSION.SDK_INT >= 26 ? audioManager.requestAudioFocus(gVar.c()) : audioManager.requestAudioFocus(gVar.f(), gVar.b().c(), gVar.e());
    }
}
