package Ea;

import Td.L;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.f0;
import ie.InterfaceC5082a;
import ie.r;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f5826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.facebook.react.views.view.g f5827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3284b0 f5828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f5829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private EditText f5830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Aa.b f5831f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private TextWatcher f5832g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterfaceC5082a f5833h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final View.OnLayoutChangeListener f5834i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Function1 f5835j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final r f5836k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalFocusChangeListener f5837l;

    public g(View view, com.facebook.react.views.view.g eventPropagationView, C3284b0 c3284b0) {
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(eventPropagationView, "eventPropagationView");
        this.f5826a = view;
        this.f5827b = eventPropagationView;
        this.f5828c = c3284b0;
        this.f5829d = f0.f(view);
        this.f5831f = h.a();
        this.f5834i = new View.OnLayoutChangeListener() { // from class: Ea.b
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                g.j(this.f5820a, view2, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        };
        this.f5835j = new Function1() { // from class: Ea.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.m(this.f5821a, (String) obj);
            }
        };
        this.f5836k = new r() { // from class: Ea.d
            @Override // ie.r
            public final Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return g.k(this.f5822a, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Double) obj3).doubleValue(), ((Double) obj4).doubleValue(), ((Double) obj5).doubleValue(), ((Double) obj6).doubleValue());
            }
        };
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener = new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: Ea.e
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(View view2, View view3) {
                g.h(this.f5823a, view2, view3);
            }
        };
        this.f5837l = onGlobalFocusChangeListener;
        view.getViewTreeObserver().addOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
    }

    private final void g(Aa.b bVar) {
        if (AbstractC5504s.c(bVar, this.f5831f)) {
            return;
        }
        this.f5831f = bVar;
        Ba.g.a(this.f5828c, this.f5827b.getId(), new Aa.a(this.f5829d, this.f5827b.getId(), bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(g gVar, View view, View view2) {
        if (view2 == null || view != null) {
            EditText editText = gVar.f5830e;
            if (editText != null) {
                editText.removeOnLayoutChangeListener(gVar.f5834i);
            }
            final EditText editText2 = gVar.f5830e;
            if (editText2 != null) {
                final TextWatcher textWatcher = gVar.f5832g;
                editText2.post(new Runnable() { // from class: Ea.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.i(editText2, textWatcher);
                    }
                });
            }
            InterfaceC5082a interfaceC5082a = gVar.f5833h;
            if (interfaceC5082a != null) {
                interfaceC5082a.invoke();
            }
            gVar.f5830e = null;
        }
        if (view2 instanceof EditText) {
            EditText editText3 = (EditText) view2;
            gVar.f5830e = editText3;
            editText3.addOnLayoutChangeListener(gVar.f5834i);
            gVar.l();
            gVar.f5832g = Ba.c.d(editText3, gVar.f5835j);
            gVar.f5833h = Ba.c.b(editText3, gVar.f5836k);
            Ka.a.f10969a.c(editText3);
            Ka.c cVar = Ka.c.f10972a;
            C3284b0 c3284b0 = gVar.f5828c;
            List listG = cVar.g(c3284b0 != null ? Ba.f.b(c3284b0) : null);
            int iIndexOf = listG.indexOf(view2);
            C3284b0 c3284b02 = gVar.f5828c;
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("current", iIndexOf);
            writableMapCreateMap.putInt("count", listG.size());
            L l10 = L.f17438a;
            Ba.g.b(c3284b02, "KeyboardController::focusDidSet", writableMapCreateMap);
        }
        if (view2 == null) {
            gVar.g(h.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(EditText editText, TextWatcher textWatcher) {
        editText.removeTextChangedListener(textWatcher);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(g gVar, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        gVar.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L k(g gVar, int i10, int i11, double d10, double d11, double d12, double d13) {
        EditText editText = gVar.f5830e;
        if (editText == null) {
            return L.f17438a;
        }
        gVar.l();
        Ba.g.a(gVar.f5828c, gVar.f5827b.getId(), new Aa.c(gVar.f5829d, gVar.f5827b.getId(), new Aa.d(editText.getId(), d10, d11, d12, d13, i10, i11)));
        return L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L m(g gVar, String text) {
        AbstractC5504s.h(text, "text");
        gVar.l();
        Ba.g.a(gVar.f5828c, gVar.f5827b.getId(), new Aa.e(gVar.f5829d, gVar.f5827b.getId(), text));
        return L.f17438a;
    }

    public final void f() {
        this.f5826a.getViewTreeObserver().removeOnGlobalFocusChangeListener(this.f5837l);
    }

    public final void l() {
        EditText editText = this.f5830e;
        if (editText == null) {
            return;
        }
        int[] iArrB = Ba.i.b(editText);
        g(new Aa.b(Ba.d.a(editText.getX()), Ba.d.a(editText.getY()), Ba.d.a(editText.getWidth()), Ba.d.a(editText.getHeight()), Ba.d.a(iArrB[0]), Ba.d.a(iArrB[1]), editText.getId(), Ba.c.g(editText)));
    }
}
