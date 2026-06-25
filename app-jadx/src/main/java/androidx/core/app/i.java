package androidx.core.app;

import Td.InterfaceC2154e;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.view.AbstractC2783t;
import androidx.lifecycle.AbstractC2857k;
import androidx.lifecycle.C2865t;
import androidx.lifecycle.G;
import kotlin.jvm.internal.AbstractC5504s;
import t.i0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i extends Activity implements androidx.lifecycle.r, AbstractC2783t.a {
    private final i0 extraDataMap = new i0(0, 1, null);
    private final C2865t lifecycleRegistry = new C2865t(this);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        if (r4.equals("--list-dumpables") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0043, code lost:
    
        if (r4.equals("--dump-dumpable") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004d, code lost:
    
        return false;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean h(java.lang.String[] r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L5e
            int r1 = r4.length
            if (r1 != 0) goto L7
            goto L5e
        L7:
            r4 = r4[r0]
            int r1 = r4.hashCode()
            r2 = 1
            switch(r1) {
                case -645125871: goto L4e;
                case 100470631: goto L3d;
                case 472614934: goto L34;
                case 1159329357: goto L23;
                case 1455016274: goto L12;
                default: goto L11;
            }
        L11:
            goto L5e
        L12:
            java.lang.String r1 = "--autofill"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L1b
            goto L5e
        L1b:
            int r4 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r4 < r1) goto L22
            return r2
        L22:
            return r0
        L23:
            java.lang.String r1 = "--contentcapture"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L2c
            goto L5e
        L2c:
            int r4 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r4 < r1) goto L33
            return r2
        L33:
            return r0
        L34:
            java.lang.String r1 = "--list-dumpables"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L46
            goto L5e
        L3d:
            java.lang.String r1 = "--dump-dumpable"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L46
            goto L5e
        L46:
            int r4 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r4 < r1) goto L4d
            return r2
        L4d:
            return r0
        L4e:
            java.lang.String r1 = "--translation"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L57
            goto L5e
        L57:
            int r4 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r4 < r1) goto L5e
            return r2
        L5e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.i.h(java.lang.String[]):boolean");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        AbstractC5504s.h(event, "event");
        View decorView = getWindow().getDecorView();
        AbstractC5504s.g(decorView, "getDecorView(...)");
        if (AbstractC2783t.d(decorView, event)) {
            return true;
        }
        return AbstractC2783t.e(this, decorView, this, event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        AbstractC5504s.h(event, "event");
        View decorView = getWindow().getDecorView();
        AbstractC5504s.g(decorView, "getDecorView(...)");
        if (AbstractC2783t.d(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    @InterfaceC2154e
    public <T extends a> T getExtraData(Class<T> extraDataClass) {
        AbstractC5504s.h(extraDataClass, "extraDataClass");
        android.support.v4.media.session.b.a(this.extraDataMap.get(extraDataClass));
        return null;
    }

    public AbstractC2857k getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        G.INSTANCE.c(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        AbstractC5504s.h(outState, "outState");
        this.lifecycleRegistry.l(AbstractC2857k.b.f30237c);
        super.onSaveInstanceState(outState);
    }

    @InterfaceC2154e
    public void putExtraData(a extraData) {
        AbstractC5504s.h(extraData, "extraData");
        throw null;
    }

    protected final boolean shouldDumpInternalState(String[] strArr) {
        return !h(strArr);
    }

    @Override // androidx.core.view.AbstractC2783t.a
    public boolean superDispatchKeyEvent(KeyEvent event) {
        AbstractC5504s.h(event, "event");
        return super.dispatchKeyEvent(event);
    }
}
