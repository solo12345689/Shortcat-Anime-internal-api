package com.facebook.react.devsupport;

import android.content.Context;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: com.facebook.react.devsupport.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3210a extends Y {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3210a(Context applicationContext, u0 reactInstanceManagerHelper, String str, boolean z10, c7.j jVar, c7.c cVar, int i10, Map map, U6.h hVar, c7.d dVar, c7.i iVar) {
        super(applicationContext, reactInstanceManagerHelper, str, z10, jVar, cVar, i10, map, hVar, dVar, iVar);
        AbstractC5504s.h(applicationContext, "applicationContext");
        AbstractC5504s.h(reactInstanceManagerHelper, "reactInstanceManagerHelper");
    }

    @Override // c7.f
    public void B() {
        UiThreadUtil.assertOnUiThread();
        p();
        x0().reload("BridgelessDevSupportManager.handleReloadJS()");
    }

    @Override // com.facebook.react.devsupport.Y
    protected String z0() {
        return "Bridgeless";
    }
}
