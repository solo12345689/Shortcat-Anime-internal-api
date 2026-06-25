package C0;

import android.view.KeyEvent;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final KeyEvent f2483a;

    private /* synthetic */ b(KeyEvent keyEvent) {
        this.f2483a = keyEvent;
    }

    public static final /* synthetic */ b a(KeyEvent keyEvent) {
        return new b(keyEvent);
    }

    public static boolean c(KeyEvent keyEvent, Object obj) {
        return (obj instanceof b) && AbstractC5504s.c(keyEvent, ((b) obj).f());
    }

    public static int d(KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    public static String e(KeyEvent keyEvent) {
        return "KeyEvent(nativeKeyEvent=" + keyEvent + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f2483a, obj);
    }

    public final /* synthetic */ KeyEvent f() {
        return this.f2483a;
    }

    public int hashCode() {
        return d(this.f2483a);
    }

    public String toString() {
        return e(this.f2483a);
    }

    public static KeyEvent b(KeyEvent keyEvent) {
        return keyEvent;
    }
}
