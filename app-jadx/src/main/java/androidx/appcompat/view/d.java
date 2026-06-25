package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class d extends ContextWrapper {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Configuration f24563f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f24564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Resources.Theme f24565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LayoutInflater f24566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Configuration f24567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Resources f24568e;

    public d(Context context, int i10) {
        super(context);
        this.f24564a = i10;
    }

    private Resources b() {
        if (this.f24568e == null) {
            Configuration configuration = this.f24567d;
            if (configuration == null || (Build.VERSION.SDK_INT >= 26 && e(configuration))) {
                this.f24568e = super.getResources();
            } else {
                this.f24568e = createConfigurationContext(this.f24567d).getResources();
            }
        }
        return this.f24568e;
    }

    private void d() {
        boolean z10 = this.f24565b == null;
        if (z10) {
            this.f24565b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f24565b.setTo(theme);
            }
        }
        f(this.f24565b, this.f24564a, z10);
    }

    private static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f24563f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f24563f = configuration2;
        }
        return configuration.equals(f24563f);
    }

    public void a(Configuration configuration) {
        if (this.f24568e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f24567d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f24567d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f24564a;
    }

    protected void f(Resources.Theme theme, int i10, boolean z10) {
        theme.applyStyle(i10, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f24566c == null) {
            this.f24566c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f24566c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f24565b;
        if (theme != null) {
            return theme;
        }
        if (this.f24564a == 0) {
            this.f24564a = i.i.f48128e;
        }
        d();
        return this.f24565b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (this.f24564a != i10) {
            this.f24564a = i10;
            d();
        }
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f24565b = theme;
    }
}
