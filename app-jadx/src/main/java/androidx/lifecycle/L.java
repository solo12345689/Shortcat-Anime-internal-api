package androidx.lifecycle;

import P3.f;
import android.os.Bundle;
import androidx.lifecycle.AbstractC2857k;
import androidx.lifecycle.W;
import kotlin.jvm.internal.AbstractC5504s;
import m2.AbstractC5628a;
import pe.InterfaceC6014d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class L {

    /* JADX INFO: renamed from: a */
    public static final AbstractC5628a.c f30172a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC5628a.c f30173b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC5628a.c f30174c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements W.c {
        a() {
        }

        @Override // androidx.lifecycle.W.c
        public U create(InterfaceC6014d modelClass, AbstractC5628a extras) {
            AbstractC5504s.h(modelClass, "modelClass");
            AbstractC5504s.h(extras, "extras");
            return new O();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements AbstractC5628a.c {
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements AbstractC5628a.c {
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements AbstractC5628a.c {
    }

    static {
        AbstractC5628a.C0826a c0826a = AbstractC5628a.f53047b;
        f30172a = new b();
        f30173b = new c();
        f30174c = new d();
    }

    private static final I a(P3.i iVar, Y y10, String str, Bundle bundle) {
        N nD = d(iVar);
        O oE = e(y10);
        I i10 = (I) oE.a().get(str);
        if (i10 != null) {
            return i10;
        }
        I iA = I.f30165c.a(nD.c(str), bundle);
        oE.a().put(str, iA);
        return iA;
    }

    public static final I b(AbstractC5628a abstractC5628a) {
        AbstractC5504s.h(abstractC5628a, "<this>");
        P3.i iVar = (P3.i) abstractC5628a.a(f30172a);
        if (iVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        Y y10 = (Y) abstractC5628a.a(f30173b);
        if (y10 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) abstractC5628a.a(f30174c);
        String str = (String) abstractC5628a.a(W.f30208c);
        if (str != null) {
            return a(iVar, y10, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    public static final void c(P3.i iVar) {
        AbstractC5504s.h(iVar, "<this>");
        AbstractC2857k.b currentState = iVar.getLifecycle().getCurrentState();
        if (currentState != AbstractC2857k.b.f30236b && currentState != AbstractC2857k.b.f30237c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (iVar.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            N n10 = new N(iVar.getSavedStateRegistry(), (Y) iVar);
            iVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", n10);
            iVar.getLifecycle().addObserver(new J(n10));
        }
    }

    public static final N d(P3.i iVar) {
        AbstractC5504s.h(iVar, "<this>");
        f.b bVarB = iVar.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        N n10 = bVarB instanceof N ? (N) bVarB : null;
        if (n10 != null) {
            return n10;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final O e(Y y10) {
        AbstractC5504s.h(y10, "<this>");
        return (O) W.b.c(W.f30207b, y10, new a(), null, 4, null).b("androidx.lifecycle.internal.SavedStateHandlesVM", kotlin.jvm.internal.O.b(O.class));
    }
}
