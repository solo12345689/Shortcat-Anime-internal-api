package r;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.b;
import androidx.fragment.app.AbstractActivityC2842v;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC2836o;
import androidx.lifecycle.B;
import androidx.lifecycle.W;
import y1.AbstractC7194b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class l extends DialogInterfaceOnCancelListenerC2836o {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final Handler f58286q = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final Runnable f58287r = new a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    g f58288s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f58289t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f58290u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ImageView f58291v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    TextView f58292w;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l.this.R();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements DialogInterface.OnClickListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            l.this.f58288s.U(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c implements B {
        c() {
        }

        @Override // androidx.lifecycle.B
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Integer num) {
            l lVar = l.this;
            lVar.f58286q.removeCallbacks(lVar.f58287r);
            l.this.T(num.intValue());
            l.this.U(num.intValue());
            l lVar2 = l.this;
            lVar2.f58286q.postDelayed(lVar2.f58287r, 2000L);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class d implements B {
        d() {
        }

        @Override // androidx.lifecycle.B
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CharSequence charSequence) {
            l lVar = l.this;
            lVar.f58286q.removeCallbacks(lVar.f58287r);
            l.this.V(charSequence);
            l lVar2 = l.this;
            lVar2.f58286q.postDelayed(lVar2.f58287r, 2000L);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class e {
        static void a(Drawable drawable) {
            if (drawable instanceof AnimatedVectorDrawable) {
                ((AnimatedVectorDrawable) drawable).start();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class f {
        static int a() {
            return p.f58302a;
        }
    }

    private void N() {
        AbstractActivityC2842v activity = getActivity();
        if (activity == null) {
            return;
        }
        g gVar = (g) new W(activity).a(g.class);
        this.f58288s = gVar;
        gVar.n().h(this, new c());
        this.f58288s.l().h(this, new d());
    }

    private Drawable O(int i10, int i11) {
        int i12;
        Context context = getContext();
        if (context == null) {
            Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
            return null;
        }
        if (i10 == 0 && i11 == 1) {
            i12 = r.f58305b;
        } else if (i10 == 1 && i11 == 2) {
            i12 = r.f58304a;
        } else if (i10 == 2 && i11 == 1) {
            i12 = r.f58305b;
        } else {
            if (i10 != 1 || i11 != 3) {
                return null;
            }
            i12 = r.f58305b;
        }
        return AbstractC7194b.e(context, i12);
    }

    private int P(int i10) {
        Context context = getContext();
        AbstractActivityC2842v activity = getActivity();
        if (context == null || activity == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i10, typedValue, true);
        TypedArray typedArrayObtainStyledAttributes = activity.obtainStyledAttributes(typedValue.data, new int[]{i10});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    static l Q() {
        return new l();
    }

    private boolean S(int i10, int i11) {
        if (i10 == 0 && i11 == 1) {
            return false;
        }
        if (i10 == 1 && i11 == 2) {
            return true;
        }
        return i10 == 2 && i11 == 1;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2836o
    public Dialog E(Bundle bundle) {
        b.a aVar = new b.a(requireContext());
        aVar.setTitle(this.f58288s.s());
        View viewInflate = LayoutInflater.from(aVar.getContext()).inflate(t.f58310a, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(s.f58309d);
        if (textView != null) {
            CharSequence charSequenceR = this.f58288s.r();
            if (TextUtils.isEmpty(charSequenceR)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(charSequenceR);
            }
        }
        TextView textView2 = (TextView) viewInflate.findViewById(s.f58306a);
        if (textView2 != null) {
            CharSequence charSequenceK = this.f58288s.k();
            if (TextUtils.isEmpty(charSequenceK)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(charSequenceK);
            }
        }
        this.f58291v = (ImageView) viewInflate.findViewById(s.f58308c);
        this.f58292w = (TextView) viewInflate.findViewById(s.f58307b);
        aVar.f(r.b.c(this.f58288s.a()) ? getString(u.f58311a) : this.f58288s.q(), new b());
        aVar.setView(viewInflate);
        androidx.appcompat.app.b bVarCreate = aVar.create();
        bVarCreate.setCanceledOnTouchOutside(false);
        return bVarCreate;
    }

    void R() {
        Context context = getContext();
        if (context == null) {
            Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
        } else {
            this.f58288s.S(1);
            this.f58288s.Q(context.getString(u.f58313c));
        }
    }

    void T(int i10) {
        int iM;
        Drawable drawableO;
        if (this.f58291v == null || (drawableO = O((iM = this.f58288s.m()), i10)) == null) {
            return;
        }
        this.f58291v.setImageDrawable(drawableO);
        if (S(iM, i10)) {
            e.a(drawableO);
        }
        this.f58288s.R(i10);
    }

    void U(int i10) {
        TextView textView = this.f58292w;
        if (textView != null) {
            textView.setTextColor(i10 == 2 ? this.f58289t : this.f58290u);
        }
    }

    void V(CharSequence charSequence) {
        TextView textView = this.f58292w;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2836o, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.f58288s.O(true);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2836o, androidx.fragment.app.AbstractComponentCallbacksC2838q
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        N();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f58289t = P(f.a());
        } else {
            Context context = getContext();
            this.f58289t = context != null ? AbstractC7194b.c(context, q.f58303a) : 0;
        }
        this.f58290u = P(R.attr.textColorSecondary);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public void onPause() {
        super.onPause();
        this.f58286q.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public void onResume() {
        super.onResume();
        this.f58288s.R(0);
        this.f58288s.S(1);
        this.f58288s.Q(getString(u.f58313c));
    }
}
