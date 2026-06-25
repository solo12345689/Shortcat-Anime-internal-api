package com.flagcat.shortcat;

import android.os.Build;
import android.os.Bundle;
import com.facebook.react.C3279t;
import com.facebook.react.ReactActivity;
import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint;
import gd.d;
import ib.C5066o;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0003¨\u0006\u0010"}, d2 = {"Lcom/flagcat/shortcat/MainActivity;", "Lcom/facebook/react/ReactActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "LTd/L;", "onCreate", "(Landroid/os/Bundle;)V", "", "Y", "()Ljava/lang/String;", "Lcom/facebook/react/t;", "W", "()Lcom/facebook/react/t;", "a", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MainActivity extends ReactActivity {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends com.facebook.react.defaults.a {
        a(MainActivity mainActivity, String str, boolean z10) {
            super(mainActivity, str, z10);
        }
    }

    @Override // com.facebook.react.ReactActivity
    protected C3279t W() {
        return new C5066o(this, true, new a(this, Y(), DefaultNewArchitectureEntryPoint.getFabricEnabled()));
    }

    protected String Y() {
        return "main";
    }

    @Override // com.facebook.react.ReactActivity, q7.InterfaceC6143a
    public void a() {
        if (Build.VERSION.SDK_INT > 30) {
            super.a();
        } else {
            if (moveTaskToBack(false)) {
                return;
            }
            super.a();
        }
    }

    @Override // com.facebook.react.ReactActivity, androidx.fragment.app.AbstractActivityC2842v, androidx.activity.AbstractActivityC2640j, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        d.f47434a.k(this);
        super.onCreate(null);
    }
}
