package d2;

import android.text.Editable;
import androidx.emoji2.text.n;

/* JADX INFO: renamed from: d2.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C4558b extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f44987a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Editable.Factory f44988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Class f44989c;

    private C4558b() {
        try {
            f44989c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C4558b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f44988b == null) {
            synchronized (f44987a) {
                try {
                    if (f44988b == null) {
                        f44988b = new C4558b();
                    }
                } finally {
                }
            }
        }
        return f44988b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class cls = f44989c;
        return cls != null ? n.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
