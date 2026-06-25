package expo.modules.kotlin.views;

import Td.L;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import pc.C5972b;
import rb.AbstractC6300a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class c extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function2 f46205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f46206d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String name, C5972b propType, Function2 setter) {
        super(name, propType);
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(propType, "propType");
        AbstractC5504s.h(setter, "setter");
        this.f46205c = setter;
        this.f46206d = propType.g().b();
    }

    @Override // expo.modules.kotlin.views.a
    public void c(Dynamic prop, View onView, Ub.d dVar) throws cc.v {
        CodedException unexpectedException;
        AbstractC5504s.h(prop, "prop");
        AbstractC5504s.h(onView, "onView");
        try {
            d().invoke(onView, C5972b.c(b(), prop, dVar, false, 4, null));
            L l10 = L.f17438a;
        } catch (Throwable th2) {
            if (th2 instanceof CodedException) {
                unexpectedException = (CodedException) th2;
            } else if (th2 instanceof AbstractC6300a) {
                AbstractC6300a abstractC6300a = (AbstractC6300a) th2;
                String strA = abstractC6300a.a();
                AbstractC5504s.g(strA, "getCode(...)");
                unexpectedException = new CodedException(strA, abstractC6300a.getMessage(), abstractC6300a.getCause());
            } else {
                unexpectedException = new UnexpectedException(th2);
            }
            throw new cc.v(a(), O.b(onView.getClass()), unexpectedException);
        }
    }

    protected final Function2 d() {
        return this.f46205c;
    }
}
