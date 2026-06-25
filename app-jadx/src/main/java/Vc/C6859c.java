package vc;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6023m;

/* JADX INFO: renamed from: vc.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C6859c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f62042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f62043b;

    public C6859c(View view, Function1 function1) {
        AbstractC5504s.h(view, "view");
        this.f62042a = function1;
        this.f62043b = new WeakReference(view);
    }

    public final InterfaceC6858b a(View thisRef, InterfaceC6023m property) {
        AbstractC5504s.h(thisRef, "thisRef");
        AbstractC5504s.h(property, "property");
        return b(property);
    }

    public final InterfaceC6858b b(InterfaceC6023m property) {
        AbstractC5504s.h(property, "property");
        View view = (View) this.f62043b.get();
        if (view != null) {
            return new C6857a(property.getName(), view, this.f62042a);
        }
        throw new IllegalStateException("Can't send the '" + property.getName() + "' event from the view that is deallocated");
    }
}
