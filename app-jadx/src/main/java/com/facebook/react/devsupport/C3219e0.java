package com.facebook.react.devsupport;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.react.AbstractC3247l;
import com.facebook.react.AbstractC3249n;
import com.facebook.react.bridge.ReactContext;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import z5.AbstractC7283a;

/* JADX INFO: renamed from: com.facebook.react.devsupport.e0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3219e0 extends FrameLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f36734d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f36735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.facebook.react.modules.debug.h f36736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f36737c;

    /* JADX INFO: renamed from: com.facebook.react.devsupport.e0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.e0$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f36738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f36739b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f36740c;

        public b() {
        }

        public final void a() {
            this.f36738a = false;
            C3219e0.this.post(this);
        }

        public final void b() {
            this.f36738a = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f36738a) {
                return;
            }
            this.f36739b += C3219e0.this.f36736b.d() - C3219e0.this.f36736b.g();
            this.f36740c += C3219e0.this.f36736b.c();
            C3219e0 c3219e0 = C3219e0.this;
            c3219e0.c(c3219e0.f36736b.e(), C3219e0.this.f36736b.f(), this.f36739b, this.f36740c, C3219e0.this.f36736b.j());
            C3219e0.this.f36736b.k();
            C3219e0.this.postDelayed(this, 500L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3219e0(ReactContext reactContext) {
        super(reactContext);
        AbstractC5504s.e(reactContext);
        View.inflate(reactContext, AbstractC3249n.f37098c, this);
        View viewFindViewById = findViewById(AbstractC3247l.f36922p);
        AbstractC5504s.f(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        this.f36735a = (TextView) viewFindViewById;
        com.facebook.react.modules.debug.h hVar = new com.facebook.react.modules.debug.h(reactContext);
        this.f36736b = hVar;
        this.f36737c = new b();
        c(0.0d, 0.0d, 0, 0, hVar.j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(double d10, double d11, int i10, int i11, boolean z10) {
        kotlin.jvm.internal.U u10 = kotlin.jvm.internal.U.f52264a;
        Locale locale = Locale.US;
        String str = String.format(locale, "UI: %.1f fps\n%d dropped so far\n%d stutters (4+) so far", Arrays.copyOf(new Object[]{Double.valueOf(d10), Integer.valueOf(i10), Integer.valueOf(i11)}, 3));
        AbstractC5504s.g(str, "format(...)");
        if (!z10) {
            String str2 = String.format(locale, "\nJS: %.1f fps", Arrays.copyOf(new Object[]{Double.valueOf(d11)}, 1));
            AbstractC5504s.g(str2, "format(...)");
            str = str + str2;
        }
        this.f36735a.setText(str);
        AbstractC7283a.b("ReactNative", str);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f36736b.k();
        com.facebook.react.modules.debug.h.m(this.f36736b, 0.0d, 1, null);
        this.f36737c.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f36736b.o();
        this.f36737c.b();
    }
}
