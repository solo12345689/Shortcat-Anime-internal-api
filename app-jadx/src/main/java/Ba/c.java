package Ba;

import Td.L;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.facebook.react.views.scroll.k;
import com.facebook.react.views.textinput.C3320j;
import ie.InterfaceC5082a;
import ie.r;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.N;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final InterfaceC5082a b(EditText editText, r action) {
        AbstractC5504s.h(editText, "<this>");
        AbstractC5504s.h(action, "action");
        final e eVar = new e(editText, action);
        eVar.j();
        return new InterfaceC5082a() { // from class: Ba.b
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return c.c(eVar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L c(e eVar) {
        eVar.i();
        return L.f17438a;
    }

    public static final TextWatcher d(EditText editText, Function1 action) throws IllegalAccessException {
        AbstractC5504s.h(editText, "<this>");
        AbstractC5504s.h(action, "action");
        a aVar = new a(new N(), action);
        try {
            Field declaredField = C3320j.class.getDeclaredField("mListeners");
            AbstractC5504s.g(declaredField, "getDeclaredField(...)");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(editText);
            ArrayList arrayList = obj instanceof ArrayList ? (ArrayList) obj : null;
            if (arrayList != null) {
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (!(it.next() instanceof TextWatcher)) {
                        }
                    }
                }
                arrayList.add(0, aVar);
                return aVar;
            }
            Fa.a.d(Fa.a.f6597a, editText.getClass().getSimpleName(), "Can not attach listener because `fieldValue` does not belong to `ArrayList<TextWatcher>`", null, 4, null);
            return aVar;
        } catch (ClassCastException e10) {
            Fa.a.d(Fa.a.f6597a, editText.getClass().getSimpleName(), "Can not attach listener because casting failed: " + e10.getMessage(), null, 4, null);
            return aVar;
        } catch (IllegalArgumentException e11) {
            Fa.a.d(Fa.a.f6597a, editText.getClass().getSimpleName(), "Can not attach listener to be the first in the list: " + e11.getMessage() + ". Attaching to the end...", null, 4, null);
            editText.addTextChangedListener(aVar);
            return aVar;
        } catch (NoSuchFieldException e12) {
            Fa.a.d(Fa.a.f6597a, editText.getClass().getSimpleName(), "Can not attach listener because field `mListeners` not found: " + e12.getMessage() + ". Attaching to the end...", null, 4, null);
            editText.addTextChangedListener(aVar);
            return aVar;
        }
    }

    public static final void e(EditText editText) {
        if (editText instanceof C3320j) {
            ((C3320j) editText).N();
        } else if (editText != null) {
            editText.requestFocus();
        }
    }

    public static final String f(EditText editText) {
        if (editText == null) {
            return "default";
        }
        int inputType = editText.getInputType() & 15;
        int inputType2 = editText.getInputType() & 4080;
        return inputType2 == 32 ? "email-address" : inputType2 == 16 ? "url" : inputType2 == 144 ? "visible-password" : inputType == 2 ? ((editText.getInputType() & 8192) == 0 || (editText.getInputType() & 4096) != 0) ? (editText.getInputType() & 4096) != 0 ? "numeric" : "number-pad" : "decimal-pad" : inputType == 3 ? "phone-pad" : "default";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.widget.EditText, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public static final int g(EditText editText) {
        AbstractC5504s.h(editText, "<this>");
        while (editText != 0) {
            Object parent = editText.getParent();
            editText = parent instanceof View ? (View) parent : 0;
            if (editText instanceof k) {
                k kVar = (k) editText;
                if (kVar.getScrollEnabled()) {
                    return kVar.getId();
                }
            }
        }
        return -1;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f1583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f1584b;

        a(N n10, Function1 function1) {
            this.f1583a = n10;
            this.f1584b = function1;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            String strValueOf = String.valueOf(charSequence);
            if (AbstractC5504s.c(strValueOf, this.f1583a.f52259a)) {
                return;
            }
            this.f1583a.f52259a = strValueOf;
            this.f1584b.invoke(strValueOf);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
