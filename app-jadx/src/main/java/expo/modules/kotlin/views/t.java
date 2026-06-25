package expo.modules.kotlin.views;

import Td.L;
import Td.z;
import Ud.S;
import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import he.AbstractC4945a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import rb.AbstractC6300a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Ub.r f46241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f46242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f46243c;

    public t(Ub.r moduleHolder, r definition, String str) {
        AbstractC5504s.h(moduleHolder, "moduleHolder");
        AbstractC5504s.h(definition, "definition");
        this.f46241a = moduleHolder;
        this.f46242b = definition;
        this.f46243c = str;
    }

    public final View a(Context context) {
        AbstractC5504s.h(context, "context");
        return this.f46242b.a(context, this.f46241a.g().i());
    }

    public final Map b() {
        String[] strArrA;
        Map mapC = S.c();
        b bVarC = this.f46242b.c();
        if (bVarC != null && (strArrA = bVarC.a()) != null) {
            for (String str : strArrA) {
                mapC.put(bc.i.a(str), S.f(z.a("registrationName", str)));
            }
        }
        return S.b(mapC);
    }

    public final Ub.r c() {
        return this.f46241a;
    }

    public final String d() {
        String str = this.f46243c;
        if (str != null) {
            return str;
        }
        return this.f46241a.h() + "_" + this.f46242b.d();
    }

    public final Map e() {
        return this.f46242b.g();
    }

    public final q f() {
        this.f46242b.i();
        return null;
    }

    public final void g(View view) {
        CodedException unexpectedException;
        CodedException codedException;
        AbstractC5504s.h(view, "view");
        try {
            Function1 function1E = this.f46242b.e();
            if (function1E != null) {
                function1E.invoke(view);
            }
        } catch (Throwable th2) {
            if (f.a(view)) {
                return;
            }
            if (th2 instanceof CodedException) {
                codedException = (CodedException) th2;
            } else {
                if (th2 instanceof AbstractC6300a) {
                    AbstractC6300a abstractC6300a = (AbstractC6300a) th2;
                    String strA = abstractC6300a.a();
                    AbstractC5504s.g(strA, "getCode(...)");
                    unexpectedException = new CodedException(strA, abstractC6300a.getMessage(), abstractC6300a.getCause());
                } else {
                    unexpectedException = new UnexpectedException(th2);
                }
                codedException = unexpectedException;
            }
            Ub.f.a().b("❌ '" + view + "' wasn't able to destroy itself", codedException);
            this.f46242b.l(view, codedException);
        }
    }

    public final void h(View view) {
        CodedException unexpectedException;
        CodedException unexpectedException2;
        AbstractC5504s.h(view, "view");
        Function1 function1F = this.f46242b.f();
        if (function1F != null) {
            try {
                function1F.invoke(view);
                L l10 = L.f17438a;
            } catch (Throwable th2) {
                try {
                    if (th2 instanceof CodedException) {
                        unexpectedException2 = (CodedException) th2;
                    } else if (th2 instanceof AbstractC6300a) {
                        String strA = ((AbstractC6300a) th2).a();
                        AbstractC5504s.g(strA, "getCode(...)");
                        unexpectedException2 = new CodedException(strA, ((AbstractC6300a) th2).getMessage(), ((AbstractC6300a) th2).getCause());
                    } else {
                        unexpectedException2 = new UnexpectedException(th2);
                    }
                    throw new cc.t(AbstractC4945a.e(view.getClass()), unexpectedException2);
                } catch (Throwable th3) {
                    if (f.a(view)) {
                        return;
                    }
                    if (th3 instanceof CodedException) {
                        unexpectedException = (CodedException) th3;
                    } else if (th3 instanceof AbstractC6300a) {
                        AbstractC6300a abstractC6300a = (AbstractC6300a) th3;
                        String strA2 = abstractC6300a.a();
                        AbstractC5504s.g(strA2, "getCode(...)");
                        unexpectedException = new CodedException(strA2, abstractC6300a.getMessage(), abstractC6300a.getCause());
                    } else {
                        unexpectedException = new UnexpectedException(th3);
                    }
                    Ub.f.a().b("❌ Error occurred when invoking 'onViewDidUpdateProps' on '" + view.getClass().getSimpleName() + "'", unexpectedException);
                    this.f46242b.l(view, unexpectedException);
                }
            }
        }
    }

    public final void i(Ub.r rVar) {
        AbstractC5504s.h(rVar, "<set-?>");
        this.f46241a = rVar;
    }

    public final List j(View view, ReadableMap propsMap) {
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(propsMap, "propsMap");
        Map mapE = e();
        ArrayList arrayList = new ArrayList();
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = propsMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            a aVar = (a) mapE.get(strNextKey);
            if (aVar != null) {
                try {
                    aVar.c(propsMap.getDynamic(strNextKey), view, this.f46241a.g().i());
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }
        return arrayList;
    }
}
