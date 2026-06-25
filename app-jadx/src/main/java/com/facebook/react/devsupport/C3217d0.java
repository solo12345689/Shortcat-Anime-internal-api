package com.facebook.react.devsupport;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.EditText;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.facebook.react.devsupport.d0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3217d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f36729b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f36730a;

    /* JADX INFO: renamed from: com.facebook.react.devsupport.d0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C3217d0 c3217d0) {
        c3217d0.f36730a = false;
    }

    public final boolean b(int i10, View view) {
        if (i10 == 46 && !(view instanceof EditText)) {
            if (this.f36730a) {
                this.f36730a = false;
                return true;
            }
            this.f36730a = true;
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.react.devsupport.c0
                @Override // java.lang.Runnable
                public final void run() {
                    C3217d0.c(this.f36726a);
                }
            }, 200L);
        }
        return false;
    }
}
