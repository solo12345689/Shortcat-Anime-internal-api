package di;

import android.util.Log;
import ci.g;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45749a;

    public c(String str) {
        this.f45749a = str;
    }

    private int c(Level level) {
        int iIntValue = level.intValue();
        if (iIntValue < 800) {
            return iIntValue < 500 ? 2 : 3;
        }
        if (iIntValue < 900) {
            return 4;
        }
        return iIntValue < 1000 ? 5 : 6;
    }

    @Override // ci.g
    public void a(Level level, String str, Throwable th2) {
        if (level != Level.OFF) {
            Log.println(c(level), this.f45749a, str + "\n" + Log.getStackTraceString(th2));
        }
    }

    @Override // ci.g
    public void b(Level level, String str) {
        if (level != Level.OFF) {
            Log.println(c(level), this.f45749a, str);
        }
    }
}
