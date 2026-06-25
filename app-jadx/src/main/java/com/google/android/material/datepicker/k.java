package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.I;
import androidx.core.view.L0;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC2836o;
import androidx.fragment.app.U;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import j.AbstractC5323a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o9.AbstractC5838a;
import o9.AbstractC5840c;
import o9.AbstractC5841d;
import o9.AbstractC5842e;
import o9.AbstractC5844g;
import o9.AbstractC5846i;
import o9.AbstractC5847j;
import o9.AbstractC5848k;
import y9.ViewOnTouchListenerC7212a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class k<S> extends DialogInterfaceOnCancelListenerC2836o {

    /* JADX INFO: renamed from: r0 */
    static final Object f42389r0 = "CONFIRM_BUTTON_TAG";

    /* JADX INFO: renamed from: s0 */
    static final Object f42390s0 = "CANCEL_BUTTON_TAG";

    /* JADX INFO: renamed from: t0 */
    static final Object f42391t0 = "TOGGLE_BUTTON_TAG";

    /* JADX INFO: renamed from: A */
    private boolean f42392A;

    /* JADX INFO: renamed from: B */
    private int f42393B;

    /* JADX INFO: renamed from: C */
    private int f42394C;

    /* JADX INFO: renamed from: D */
    private CharSequence f42395D;

    /* JADX INFO: renamed from: E */
    private int f42396E;

    /* JADX INFO: renamed from: F */
    private CharSequence f42397F;

    /* JADX INFO: renamed from: G */
    private int f42398G;

    /* JADX INFO: renamed from: H */
    private CharSequence f42399H;

    /* JADX INFO: renamed from: I */
    private int f42400I;

    /* JADX INFO: renamed from: X */
    private CharSequence f42401X;

    /* JADX INFO: renamed from: Y */
    private TextView f42402Y;

    /* JADX INFO: renamed from: Z */
    private TextView f42403Z;

    /* JADX INFO: renamed from: l0 */
    private CheckableImageButton f42404l0;

    /* JADX INFO: renamed from: m0 */
    private H9.h f42405m0;

    /* JADX INFO: renamed from: n0 */
    private Button f42406n0;

    /* JADX INFO: renamed from: o0 */
    private boolean f42407o0;

    /* JADX INFO: renamed from: p0 */
    private CharSequence f42408p0;

    /* JADX INFO: renamed from: q0 */
    private CharSequence f42410q0;

    /* JADX INFO: renamed from: u */
    private int f42414u;

    /* JADX INFO: renamed from: v */
    private q f42415v;

    /* JADX INFO: renamed from: w */
    private com.google.android.material.datepicker.a f42416w;

    /* JADX INFO: renamed from: x */
    private i f42417x;

    /* JADX INFO: renamed from: y */
    private int f42418y;

    /* JADX INFO: renamed from: z */
    private CharSequence f42419z;

    /* JADX INFO: renamed from: q */
    private final LinkedHashSet f42409q = new LinkedHashSet();

    /* JADX INFO: renamed from: r */
    private final LinkedHashSet f42411r = new LinkedHashSet();

    /* JADX INFO: renamed from: s */
    private final LinkedHashSet f42412s = new LinkedHashSet();

    /* JADX INFO: renamed from: t */
    private final LinkedHashSet f42413t = new LinkedHashSet();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements I {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f42420a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ View f42421b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f42422c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f42423d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f42424e;

        a(int i10, View view, int i11, int i12, int i13) {
            this.f42420a = i10;
            this.f42421b = view;
            this.f42422c = i11;
            this.f42423d = i12;
            this.f42424e = i13;
        }

        @Override // androidx.core.view.I
        public L0 d(View view, L0 l02) {
            A1.b bVarF = l02.f(L0.p.i());
            if (this.f42420a >= 0) {
                this.f42421b.getLayoutParams().height = this.f42420a + bVarF.f105b;
                View view2 = this.f42421b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f42421b;
            view3.setPadding(this.f42422c + bVarF.f104a, this.f42423d + bVarF.f105b, this.f42424e + bVarF.f106c, view3.getPaddingBottom());
            return l02;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends p {
        b() {
        }
    }

    public static /* synthetic */ void N(k kVar, View view) {
        kVar.Q();
        throw null;
    }

    private static Drawable O(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, AbstractC5323a.b(context, AbstractC5841d.f54754b));
        stateListDrawable.addState(new int[0], AbstractC5323a.b(context, AbstractC5841d.f54755c));
        return stateListDrawable;
    }

    private void P(Window window) {
        if (this.f42407o0) {
            return;
        }
        View viewFindViewById = requireView().findViewById(AbstractC5842e.f54794g);
        com.google.android.material.internal.c.a(window, true, com.google.android.material.internal.p.d(viewFindViewById), null);
        int paddingTop = viewFindViewById.getPaddingTop();
        AbstractC2747a0.w0(viewFindViewById, new a(viewFindViewById.getLayoutParams().height, viewFindViewById, viewFindViewById.getPaddingLeft(), paddingTop, viewFindViewById.getPaddingRight()));
        this.f42407o0 = true;
    }

    private d Q() {
        android.support.v4.media.session.b.a(getArguments().getParcelable("DATE_SELECTOR_KEY"));
        return null;
    }

    private static CharSequence R(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String[] strArrSplit = TextUtils.split(String.valueOf(charSequence), "\n");
        return strArrSplit.length > 1 ? strArrSplit[0] : charSequence;
    }

    private String S() {
        Q();
        requireContext();
        throw null;
    }

    private static int U(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(AbstractC5840c.f54706Z);
        int i10 = m.h().f42433d;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(AbstractC5840c.f54710b0) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(AbstractC5840c.f54716e0));
    }

    private int V(Context context) {
        int i10 = this.f42414u;
        if (i10 != 0) {
            return i10;
        }
        Q();
        throw null;
    }

    private void W(Context context) {
        this.f42404l0.setTag(f42391t0);
        this.f42404l0.setImageDrawable(O(context));
        this.f42404l0.setChecked(this.f42393B != 0);
        AbstractC2747a0.k0(this.f42404l0, null);
        e0(this.f42404l0);
        this.f42404l0.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k.N(this.f42388a, view);
            }
        });
    }

    static boolean X(Context context) {
        return a0(context, R.attr.windowFullscreen);
    }

    private boolean Y() {
        return getResources().getConfiguration().orientation == 2;
    }

    static boolean Z(Context context) {
        return a0(context, AbstractC5838a.f54672y0);
    }

    static boolean a0(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(E9.b.f(context, AbstractC5838a.f54636g0, i.class.getCanonicalName()), new int[]{i10});
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z10;
    }

    private void b0() {
        int iV = V(requireContext());
        Q();
        i iVarO = i.O(null, iV, this.f42416w, null);
        this.f42417x = iVarO;
        q qVarY = iVarO;
        if (this.f42393B == 1) {
            Q();
            qVarY = l.y(null, iV, this.f42416w);
        }
        this.f42415v = qVarY;
        d0();
        c0(T());
        U uS = getChildFragmentManager().s();
        uS.o(AbstractC5842e.f54811x, this.f42415v);
        uS.j();
        this.f42415v.w(new b());
    }

    private void d0() {
        this.f42402Y.setText((this.f42393B == 1 && Y()) ? this.f42410q0 : this.f42408p0);
    }

    private void e0(CheckableImageButton checkableImageButton) {
        this.f42404l0.setContentDescription(this.f42393B == 1 ? checkableImageButton.getContext().getString(AbstractC5846i.f54865w) : checkableImageButton.getContext().getString(AbstractC5846i.f54867y));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2836o
    public final Dialog E(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), V(requireContext()));
        Context context = dialog.getContext();
        this.f42392A = X(context);
        this.f42405m0 = new H9.h(context, null, AbstractC5838a.f54636g0, AbstractC5847j.f54897z);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC5848k.f54973J2, AbstractC5838a.f54636g0, AbstractC5847j.f54897z);
        int color = typedArrayObtainStyledAttributes.getColor(AbstractC5848k.f54981K2, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f42405m0.R(context);
        this.f42405m0.d0(ColorStateList.valueOf(color));
        this.f42405m0.c0(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    public String T() {
        Q();
        getContext();
        throw null;
    }

    void c0(String str) {
        this.f42403Z.setContentDescription(S());
        this.f42403Z.setText(str);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2836o, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f42412s.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2836o, androidx.fragment.app.AbstractComponentCallbacksC2838q
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f42414u = bundle.getInt("OVERRIDE_THEME_RES_ID");
        android.support.v4.media.session.b.a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f42416w = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        android.support.v4.media.session.b.a(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f42418y = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f42419z = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f42393B = bundle.getInt("INPUT_MODE_KEY");
        this.f42394C = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f42395D = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f42396E = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f42397F = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f42398G = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f42399H = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f42400I = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f42401X = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f42419z;
        if (text == null) {
            text = requireContext().getResources().getText(this.f42418y);
        }
        this.f42408p0 = text;
        this.f42410q0 = R(text);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f42392A ? AbstractC5844g.f54837u : AbstractC5844g.f54836t, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f42392A) {
            viewInflate.findViewById(AbstractC5842e.f54811x).setLayoutParams(new LinearLayout.LayoutParams(U(context), -2));
        } else {
            viewInflate.findViewById(AbstractC5842e.f54812y).setLayoutParams(new LinearLayout.LayoutParams(U(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(AbstractC5842e.f54764B);
        this.f42403Z = textView;
        textView.setAccessibilityLiveRegion(1);
        this.f42404l0 = (CheckableImageButton) viewInflate.findViewById(AbstractC5842e.f54765C);
        this.f42402Y = (TextView) viewInflate.findViewById(AbstractC5842e.f54766D);
        W(context);
        this.f42406n0 = (Button) viewInflate.findViewById(AbstractC5842e.f54791d);
        Q();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2836o, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f42413t.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2836o, androidx.fragment.app.AbstractComponentCallbacksC2838q
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f42414u);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        a.b bVar = new a.b(this.f42416w);
        i iVar = this.f42417x;
        m mVarJ = iVar == null ? null : iVar.J();
        if (mVarJ != null) {
            bVar.b(mVarJ.f42435f);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f42418y);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f42419z);
        bundle.putInt("INPUT_MODE_KEY", this.f42393B);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f42394C);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f42395D);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f42396E);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f42397F);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f42398G);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f42399H);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f42400I);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f42401X);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2836o, androidx.fragment.app.AbstractComponentCallbacksC2838q
    public void onStart() {
        super.onStart();
        Window window = I().getWindow();
        if (this.f42392A) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f42405m0);
            P(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(AbstractC5840c.f54714d0);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f42405m0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ViewOnTouchListenerC7212a(I(), rect));
        }
        b0();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2836o, androidx.fragment.app.AbstractComponentCallbacksC2838q
    public void onStop() {
        this.f42415v.x();
        super.onStop();
    }
}
