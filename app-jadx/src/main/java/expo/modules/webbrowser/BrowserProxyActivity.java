package expo.modules.webbrowser;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.browser.customtabs.d;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000b\u0010\u0003J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\tR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0015"}, d2 = {"Lexpo/modules/webbrowser/BrowserProxyActivity;", "Landroid/app/Activity;", "<init>", "()V", "LTd/L;", "b", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onPause", "outState", "onSaveInstanceState", "onRestoreInstanceState", "", "a", "Z", "hasLaunchedCustomTab", "wasPaused", "c", "expo-web-browser_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BrowserProxyActivity extends Activity {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static WeakReference f46781d = new WeakReference(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean hasLaunchedCustomTab;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean wasPaused;

    /* JADX INFO: renamed from: expo.modules.webbrowser.BrowserProxyActivity$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WeakReference a() {
            return BrowserProxyActivity.f46781d;
        }

        private Companion() {
        }
    }

    private final void b() {
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.addFlags(603979776);
            startActivity(launchIntentForPackage);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            return;
        }
        String stringExtra = getIntent().getStringExtra("expo.modules.webbrowser.EXTRA_URL");
        Intent intent = Build.VERSION.SDK_INT >= 33 ? (Intent) getIntent().getParcelableExtra("expo.modules.webbrowser.EXTRA_CUSTOM_TABS_INTENT_DATA", Intent.class) : (Intent) getIntent().getParcelableExtra("expo.modules.webbrowser.EXTRA_CUSTOM_TABS_INTENT_DATA");
        if (stringExtra == null || intent == null) {
            finish();
            return;
        }
        d dVarA = new d.C0430d().a();
        AbstractC5504s.g(dVarA, "build(...)");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            dVarA.f25542a.putExtras(extras);
        }
        String str = intent.getPackage();
        if (str != null) {
            dVarA.f25542a.setPackage(str);
        }
        dVarA.a(this, Uri.parse(stringExtra));
        f46781d = new WeakReference(this);
        this.hasLaunchedCustomTab = true;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.wasPaused = true;
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        AbstractC5504s.h(savedInstanceState, "savedInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
        this.hasLaunchedCustomTab = savedInstanceState.getBoolean("hasLaunchedCustomTab", false);
        this.wasPaused = savedInstanceState.getBoolean("wasPaused", false);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.hasLaunchedCustomTab && this.wasPaused) {
            b();
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        AbstractC5504s.h(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean("hasLaunchedCustomTab", this.hasLaunchedCustomTab);
        outState.putBoolean("wasPaused", this.wasPaused);
    }
}
