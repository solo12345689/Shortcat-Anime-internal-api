package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.C2650d;
import androidx.appcompat.widget.C2652f;
import androidx.appcompat.widget.C2653g;
import androidx.appcompat.widget.C2654h;
import androidx.appcompat.widget.C2658l;
import androidx.appcompat.widget.C2662p;
import androidx.appcompat.widget.C2664s;
import androidx.appcompat.widget.C2667v;
import androidx.appcompat.widget.C2668w;
import androidx.appcompat.widget.C2670y;
import androidx.appcompat.widget.D;
import androidx.appcompat.widget.H;
import androidx.appcompat.widget.e0;
import androidx.core.view.AbstractC2747a0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import t.i0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class[] f24514b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f24515c = {R.attr.onClick};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f24516d = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f24517e = {R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f24518f = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String[] f24519g = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final i0 f24520h = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f24521a = new Object[2];

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f24522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f24523b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Method f24524c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Context f24525d;

        public a(View view, String str) {
            this.f24522a = view;
            this.f24523b = str;
        }

        private void a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f24523b, View.class)) != null) {
                        this.f24524c = method;
                        this.f24525d = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id2 = this.f24522a.getId();
            if (id2 == -1) {
                str = "";
            } else {
                str = " with id '" + this.f24522a.getContext().getResources().getResourceEntryName(id2) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f24523b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f24522a.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f24524c == null) {
                a(this.f24522a.getContext());
            }
            try {
                this.f24524c.invoke(this.f24525d, view);
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("Could not execute method for android:onClick", e11);
            }
        }
    }

    private void a(Context context, View view, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f24516d);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            AbstractC2747a0.l0(view, typedArrayObtainStyledAttributes.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f24517e);
        if (typedArrayObtainStyledAttributes2.hasValue(0)) {
            AbstractC2747a0.n0(view, typedArrayObtainStyledAttributes2.getString(0));
        }
        typedArrayObtainStyledAttributes2.recycle();
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f24518f);
        if (typedArrayObtainStyledAttributes3.hasValue(0)) {
            AbstractC2747a0.x0(view, typedArrayObtainStyledAttributes3.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes3.recycle();
    }

    private void b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && view.hasOnClickListeners()) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f24515c);
            String string = typedArrayObtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private View s(Context context, String str, String str2) {
        String str3;
        i0 i0Var = f24520h;
        Constructor constructor = (Constructor) i0Var.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f24514b);
            i0Var.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f24521a);
    }

    private View t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f24521a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return s(context, str, null);
            }
            int i10 = 0;
            while (true) {
                String[] strArr = f24519g;
                if (i10 >= strArr.length) {
                    return null;
                }
                View viewS = s(context, str, strArr[i10]);
                if (viewS != null) {
                    return viewS;
                }
                i10++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f24521a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private static Context u(Context context, AttributeSet attributeSet, boolean z10, boolean z11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.j.f48199N3, 0, 0);
        int resourceId = z10 ? typedArrayObtainStyledAttributes.getResourceId(i.j.f48204O3, 0) : 0;
        if (z11 && resourceId == 0 && (resourceId = typedArrayObtainStyledAttributes.getResourceId(i.j.f48209P3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes.recycle();
        return (resourceId == 0 || ((context instanceof androidx.appcompat.view.d) && ((androidx.appcompat.view.d) context).c() == resourceId)) ? context : new androidx.appcompat.view.d(context, resourceId);
    }

    private void v(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    protected C2650d c(Context context, AttributeSet attributeSet) {
        return new C2650d(context, attributeSet);
    }

    protected C2652f d(Context context, AttributeSet attributeSet) {
        return new C2652f(context, attributeSet);
    }

    protected C2653g e(Context context, AttributeSet attributeSet) {
        return new C2653g(context, attributeSet);
    }

    protected C2654h f(Context context, AttributeSet attributeSet) {
        return new C2654h(context, attributeSet);
    }

    protected C2658l g(Context context, AttributeSet attributeSet) {
        return new C2658l(context, attributeSet);
    }

    protected C2662p h(Context context, AttributeSet attributeSet) {
        return new C2662p(context, attributeSet);
    }

    protected androidx.appcompat.widget.r i(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.r(context, attributeSet);
    }

    protected C2664s j(Context context, AttributeSet attributeSet) {
        return new C2664s(context, attributeSet);
    }

    protected C2667v k(Context context, AttributeSet attributeSet) {
        return new C2667v(context, attributeSet);
    }

    protected C2668w l(Context context, AttributeSet attributeSet) {
        return new C2668w(context, attributeSet);
    }

    protected C2670y m(Context context, AttributeSet attributeSet) {
        return new C2670y(context, attributeSet);
    }

    protected androidx.appcompat.widget.A n(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.A(context, attributeSet);
    }

    protected D o(Context context, AttributeSet attributeSet) {
        return new D(context, attributeSet);
    }

    protected H p(Context context, AttributeSet attributeSet) {
        return new H(context, attributeSet);
    }

    protected View q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    public final View r(View view, String str, Context context, AttributeSet attributeSet, boolean z10, boolean z11, boolean z12, boolean z13) {
        Context context2;
        View viewL;
        context2 = (!z10 || view == null) ? context : view.getContext();
        if (z11 || z12) {
            context2 = u(context2, attributeSet, z11, z12);
        }
        if (z13) {
            context2 = e0.b(context2);
        }
        str.getClass();
        switch (str) {
            case "RatingBar":
                viewL = l(context2, attributeSet);
                v(viewL, str);
                break;
            case "CheckedTextView":
                viewL = f(context2, attributeSet);
                v(viewL, str);
                break;
            case "MultiAutoCompleteTextView":
                viewL = j(context2, attributeSet);
                v(viewL, str);
                break;
            case "TextView":
                viewL = o(context2, attributeSet);
                v(viewL, str);
                break;
            case "ImageButton":
                viewL = h(context2, attributeSet);
                v(viewL, str);
                break;
            case "SeekBar":
                viewL = m(context2, attributeSet);
                v(viewL, str);
                break;
            case "Spinner":
                viewL = n(context2, attributeSet);
                v(viewL, str);
                break;
            case "RadioButton":
                viewL = k(context2, attributeSet);
                v(viewL, str);
                break;
            case "ToggleButton":
                viewL = p(context2, attributeSet);
                v(viewL, str);
                break;
            case "ImageView":
                viewL = i(context2, attributeSet);
                v(viewL, str);
                break;
            case "AutoCompleteTextView":
                viewL = c(context2, attributeSet);
                v(viewL, str);
                break;
            case "CheckBox":
                viewL = e(context2, attributeSet);
                v(viewL, str);
                break;
            case "EditText":
                viewL = g(context2, attributeSet);
                v(viewL, str);
                break;
            case "Button":
                viewL = d(context2, attributeSet);
                v(viewL, str);
                break;
            default:
                viewL = q(context2, str, attributeSet);
                break;
        }
        if (viewL == null && context != context2) {
            viewL = t(context2, str, attributeSet);
        }
        if (viewL != null) {
            b(viewL, attributeSet);
            a(context2, viewL, attributeSet);
        }
        return viewL;
    }
}
