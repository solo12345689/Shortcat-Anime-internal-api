package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class e0 extends ContextWrapper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f25389c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ArrayList f25390d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f25391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources.Theme f25392b;

    private e0(Context context) {
        super(context);
        if (!r0.c()) {
            this.f25391a = new g0(this, context.getResources());
            this.f25392b = null;
            return;
        }
        r0 r0Var = new r0(this, context.getResources());
        this.f25391a = r0Var;
        Resources.Theme themeNewTheme = r0Var.newTheme();
        this.f25392b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    private static boolean a(Context context) {
        return ((context instanceof e0) || (context.getResources() instanceof g0) || (context.getResources() instanceof r0) || !r0.c()) ? false : true;
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f25389c) {
            try {
                ArrayList arrayList = f25390d;
                if (arrayList == null) {
                    f25390d = new ArrayList();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference weakReference = (WeakReference) f25390d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f25390d.remove(size);
                        }
                    }
                    for (int size2 = f25390d.size() - 1; size2 >= 0; size2--) {
                        WeakReference weakReference2 = (WeakReference) f25390d.get(size2);
                        e0 e0Var = weakReference2 != null ? (e0) weakReference2.get() : null;
                        if (e0Var != null && e0Var.getBaseContext() == context) {
                            return e0Var;
                        }
                    }
                }
                e0 e0Var2 = new e0(context);
                f25390d.add(new WeakReference(e0Var2));
                return e0Var2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f25391a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f25391a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f25392b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        Resources.Theme theme = this.f25392b;
        if (theme == null) {
            super.setTheme(i10);
        } else {
            theme.applyStyle(i10, true);
        }
    }
}
