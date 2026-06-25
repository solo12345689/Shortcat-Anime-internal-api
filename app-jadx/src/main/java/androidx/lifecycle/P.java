package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.W;
import he.AbstractC4945a;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.AbstractC5504s;
import m2.AbstractC5628a;
import pe.InterfaceC6014d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class P extends W.e implements W.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Application f30181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final W.c f30182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Bundle f30183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AbstractC2857k f30184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private P3.f f30185f;

    public P(Application application, P3.i owner, Bundle bundle) {
        AbstractC5504s.h(owner, "owner");
        this.f30185f = owner.getSavedStateRegistry();
        this.f30184e = owner.getLifecycle();
        this.f30183d = bundle;
        this.f30181b = application;
        this.f30182c = application != null ? W.a.f30210c.a(application) : new W.a();
    }

    @Override // androidx.lifecycle.W.e
    public void a(U viewModel) {
        AbstractC5504s.h(viewModel, "viewModel");
        if (this.f30184e != null) {
            P3.f fVar = this.f30185f;
            AbstractC5504s.e(fVar);
            AbstractC2857k abstractC2857k = this.f30184e;
            AbstractC5504s.e(abstractC2857k);
            C2855i.a(viewModel, fVar, abstractC2857k);
        }
    }

    public final U b(String key, Class modelClass) {
        U uD;
        Application application;
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(modelClass, "modelClass");
        AbstractC2857k abstractC2857k = this.f30184e;
        if (abstractC2857k == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = AbstractC2847a.class.isAssignableFrom(modelClass);
        Constructor constructorC = (!zIsAssignableFrom || this.f30181b == null) ? Q.c(modelClass, Q.f30199b) : Q.c(modelClass, Q.f30198a);
        if (constructorC == null) {
            return this.f30181b != null ? this.f30182c.create(modelClass) : W.d.Companion.a().create(modelClass);
        }
        P3.f fVar = this.f30185f;
        AbstractC5504s.e(fVar);
        K kB = C2855i.b(fVar, abstractC2857k, key, this.f30183d);
        if (!zIsAssignableFrom || (application = this.f30181b) == null) {
            uD = Q.d(modelClass, constructorC, kB.b());
        } else {
            AbstractC5504s.e(application);
            uD = Q.d(modelClass, constructorC, application, kB.b());
        }
        uD.addCloseable("androidx.lifecycle.savedstate.vm.tag", kB);
        return uD;
    }

    @Override // androidx.lifecycle.W.c
    public U create(InterfaceC6014d modelClass, AbstractC5628a extras) {
        AbstractC5504s.h(modelClass, "modelClass");
        AbstractC5504s.h(extras, "extras");
        return create(AbstractC4945a.b(modelClass), extras);
    }

    @Override // androidx.lifecycle.W.c
    public U create(Class modelClass, AbstractC5628a extras) {
        AbstractC5504s.h(modelClass, "modelClass");
        AbstractC5504s.h(extras, "extras");
        String str = (String) extras.a(W.f30208c);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.a(L.f30172a) == null || extras.a(L.f30173b) == null) {
            if (this.f30184e != null) {
                return b(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.a(W.a.f30212e);
        boolean zIsAssignableFrom = AbstractC2847a.class.isAssignableFrom(modelClass);
        Constructor constructorC = (!zIsAssignableFrom || application == null) ? Q.c(modelClass, Q.f30199b) : Q.c(modelClass, Q.f30198a);
        return constructorC == null ? this.f30182c.create(modelClass, extras) : (!zIsAssignableFrom || application == null) ? Q.d(modelClass, constructorC, L.b(extras)) : Q.d(modelClass, constructorC, application, L.b(extras));
    }

    @Override // androidx.lifecycle.W.c
    public U create(Class modelClass) {
        AbstractC5504s.h(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return b(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
