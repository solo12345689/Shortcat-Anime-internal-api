package com.facebook.react.devsupport;

import android.content.Context;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.facebook.react.devsupport.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3232s implements InterfaceC3213b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f36817a = new a(null);

    /* JADX INFO: renamed from: com.facebook.react.devsupport.s$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // com.facebook.react.devsupport.InterfaceC3213b0
    public c7.f a(Context applicationContext, u0 reactInstanceManagerHelper, String str, boolean z10, c7.j jVar, c7.c cVar, int i10, Map map, U6.h hVar, c7.d dVar, c7.i iVar, boolean z11) {
        AbstractC5504s.h(applicationContext, "applicationContext");
        AbstractC5504s.h(reactInstanceManagerHelper, "reactInstanceManagerHelper");
        return Y6.a.f22863e ? new t0(applicationContext) : z11 ? new C3210a(applicationContext, reactInstanceManagerHelper, str, z10, jVar, cVar, i10, map, hVar, dVar, iVar) : new C0();
    }

    @Override // com.facebook.react.devsupport.InterfaceC3213b0
    public c7.f b(Context applicationContext, u0 reactInstanceManagerHelper, String str, boolean z10, c7.j jVar, c7.c cVar, int i10, Map map, U6.h hVar, c7.d dVar, c7.i iVar) {
        AbstractC5504s.h(applicationContext, "applicationContext");
        AbstractC5504s.h(reactInstanceManagerHelper, "reactInstanceManagerHelper");
        if (!z10) {
            return new C0();
        }
        try {
            String str2 = "com.facebook.react.devsupport.BridgeDevSupportManager";
            AbstractC5504s.g(str2, "toString(...)");
            Object objNewInstance = Class.forName(str2).getConstructor(Context.class, u0.class, String.class, Boolean.TYPE, c7.j.class, c7.c.class, Integer.TYPE, Map.class, U6.h.class, c7.d.class, c7.i.class).newInstance(applicationContext, reactInstanceManagerHelper, str, Boolean.TRUE, jVar, cVar, Integer.valueOf(i10), map, hVar, dVar, iVar);
            AbstractC5504s.f(objNewInstance, "null cannot be cast to non-null type com.facebook.react.devsupport.interfaces.DevSupportManager");
            return (c7.f) objNewInstance;
        } catch (Exception unused) {
            return new t0(applicationContext);
        }
    }
}
