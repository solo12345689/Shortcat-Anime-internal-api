package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.T;
import androidx.core.view.AbstractC2747a0;
import androidx.core.widget.NestedScrollView;
import i.AbstractC4956a;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class AlertController {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    NestedScrollView f24285A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private Drawable f24287C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private ImageView f24288D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private TextView f24289E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private TextView f24290F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private View f24291G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    ListAdapter f24292H;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f24294J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f24295K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    int f24296L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    int f24297M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    int f24298N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f24299O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f24300P;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    Handler f24302R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final r f24305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Window f24306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f24307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f24308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CharSequence f24309f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ListView f24310g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f24311h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f24312i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f24313j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f24314k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f24315l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f24316m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Button f24318o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f24319p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    Message f24320q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f24321r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    Button f24322s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private CharSequence f24323t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    Message f24324u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Drawable f24325v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    Button f24326w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private CharSequence f24327x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    Message f24328y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Drawable f24329z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f24317n = false;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f24286B = 0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    int f24293I = -1;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f24301Q = 0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final View.OnClickListener f24303S = new a();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f24330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f24331b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.j.f48271c2);
            this.f24331b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i.j.f48276d2, -1);
            this.f24330a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i.j.f48281e2, -1);
        }

        public void a(boolean z10, boolean z11) {
            if (z11 && z10) {
                return;
            }
            setPadding(getPaddingLeft(), z10 ? getPaddingTop() : this.f24330a, getPaddingRight(), z11 ? getPaddingBottom() : this.f24331b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            Message messageObtain = (view != alertController.f24318o || (message3 = alertController.f24320q) == null) ? (view != alertController.f24322s || (message2 = alertController.f24324u) == null) ? (view != alertController.f24326w || (message = alertController.f24328y) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f24302R.obtainMessage(1, alertController2.f24305b).sendToTarget();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f24333A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f24334B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public int f24335C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public int f24336D;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public boolean[] f24338F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public boolean f24339G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public boolean f24340H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public DialogInterface.OnMultiChoiceClickListener f24342J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public Cursor f24343K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public String f24344L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public String f24345M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public AdapterView.OnItemSelectedListener f24346N;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f24348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LayoutInflater f24349b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Drawable f24351d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CharSequence f24353f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public View f24354g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CharSequence f24355h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public CharSequence f24356i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Drawable f24357j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f24358k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CharSequence f24359l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Drawable f24360m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f24361n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public CharSequence f24362o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Drawable f24363p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public DialogInterface.OnClickListener f24364q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public DialogInterface.OnCancelListener f24366s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public DialogInterface.OnDismissListener f24367t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public DialogInterface.OnKeyListener f24368u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public CharSequence[] f24369v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public ListAdapter f24370w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public DialogInterface.OnClickListener f24371x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f24372y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public View f24373z;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f24350c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f24352e = 0;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public boolean f24337E = false;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public int f24341I = -1;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public boolean f24347O = true;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f24365r = true;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a extends ArrayAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ RecycleListView f24374a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.f24374a = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = b.this.f24338F;
                if (zArr != null && zArr[i10]) {
                    this.f24374a.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class C0423b extends CursorAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f24376a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f24377b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ RecycleListView f24378c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ AlertController f24379d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0423b(Context context, Cursor cursor, boolean z10, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z10);
                this.f24378c = recycleListView;
                this.f24379d = alertController;
                Cursor cursor2 = getCursor();
                this.f24376a = cursor2.getColumnIndexOrThrow(b.this.f24344L);
                this.f24377b = cursor2.getColumnIndexOrThrow(b.this.f24345M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f24376a));
                this.f24378c.setItemChecked(cursor.getPosition(), cursor.getInt(this.f24377b) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return b.this.f24349b.inflate(this.f24379d.f24297M, viewGroup, false);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class c implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ AlertController f24381a;

            c(AlertController alertController) {
                this.f24381a = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                b.this.f24371x.onClick(this.f24381a.f24305b, i10);
                if (b.this.f24340H) {
                    return;
                }
                this.f24381a.f24305b.dismiss();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class d implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ RecycleListView f24383a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AlertController f24384b;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f24383a = recycleListView;
                this.f24384b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                boolean[] zArr = b.this.f24338F;
                if (zArr != null) {
                    zArr[i10] = this.f24383a.isItemChecked(i10);
                }
                b.this.f24342J.onClick(this.f24384b.f24305b, i10, this.f24383a.isItemChecked(i10));
            }
        }

        public b(Context context) {
            this.f24348a = context;
            this.f24349b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        private void b(AlertController alertController) {
            b bVar;
            AlertController alertController2;
            ListAdapter dVar;
            RecycleListView recycleListView = (RecycleListView) this.f24349b.inflate(alertController.f24296L, (ViewGroup) null);
            if (!this.f24339G) {
                bVar = this;
                alertController2 = alertController;
                int i10 = bVar.f24340H ? alertController2.f24298N : alertController2.f24299O;
                if (bVar.f24343K != null) {
                    dVar = new SimpleCursorAdapter(bVar.f24348a, i10, bVar.f24343K, new String[]{bVar.f24344L}, new int[]{R.id.text1});
                } else {
                    dVar = bVar.f24370w;
                    if (dVar == null) {
                        dVar = new d(bVar.f24348a, i10, R.id.text1, bVar.f24369v);
                    }
                }
            } else if (this.f24343K == null) {
                bVar = this;
                dVar = bVar.new a(this.f24348a, alertController.f24297M, R.id.text1, this.f24369v, recycleListView);
                recycleListView = recycleListView;
                alertController2 = alertController;
            } else {
                bVar = this;
                alertController2 = alertController;
                dVar = bVar.new C0423b(bVar.f24348a, bVar.f24343K, false, recycleListView, alertController2);
            }
            alertController2.f24292H = dVar;
            alertController2.f24293I = bVar.f24341I;
            if (bVar.f24371x != null) {
                recycleListView.setOnItemClickListener(new c(alertController2));
            } else if (bVar.f24342J != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController2));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = bVar.f24346N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (bVar.f24340H) {
                recycleListView.setChoiceMode(1);
            } else if (bVar.f24339G) {
                recycleListView.setChoiceMode(2);
            }
            alertController2.f24310g = recycleListView;
        }

        public void a(AlertController alertController) {
            AlertController alertController2;
            View view = this.f24354g;
            if (view != null) {
                alertController.k(view);
            } else {
                CharSequence charSequence = this.f24353f;
                if (charSequence != null) {
                    alertController.p(charSequence);
                }
                Drawable drawable = this.f24351d;
                if (drawable != null) {
                    alertController.m(drawable);
                }
                int i10 = this.f24350c;
                if (i10 != 0) {
                    alertController.l(i10);
                }
                int i11 = this.f24352e;
                if (i11 != 0) {
                    alertController.l(alertController.c(i11));
                }
            }
            CharSequence charSequence2 = this.f24355h;
            if (charSequence2 != null) {
                alertController.n(charSequence2);
            }
            CharSequence charSequence3 = this.f24356i;
            if (charSequence3 == null && this.f24357j == null) {
                alertController2 = alertController;
            } else {
                alertController.j(-1, charSequence3, this.f24358k, null, this.f24357j);
                alertController2 = alertController;
            }
            CharSequence charSequence4 = this.f24359l;
            if (charSequence4 != null || this.f24360m != null) {
                alertController2.j(-2, charSequence4, this.f24361n, null, this.f24360m);
            }
            CharSequence charSequence5 = this.f24362o;
            if (charSequence5 != null || this.f24363p != null) {
                alertController2.j(-3, charSequence5, this.f24364q, null, this.f24363p);
            }
            if (this.f24369v != null || this.f24343K != null || this.f24370w != null) {
                b(alertController2);
            }
            View view2 = this.f24373z;
            if (view2 != null) {
                if (this.f24337E) {
                    alertController2.s(view2, this.f24333A, this.f24334B, this.f24335C, this.f24336D);
                    return;
                } else {
                    alertController2.r(view2);
                    return;
                }
            }
            int i12 = this.f24372y;
            if (i12 != 0) {
                alertController2.q(i12);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference f24386a;

        public c(DialogInterface dialogInterface) {
            this.f24386a = new WeakReference(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f24386a.get(), message.what);
            } else {
                if (i10 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class d extends ArrayAdapter {
        public d(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, r rVar, Window window) {
        this.f24304a = context;
        this.f24305b = rVar;
        this.f24306c = window;
        this.f24302R = new c(rVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, i.j.f48155F, AbstractC4956a.f47964k, 0);
        this.f24294J = typedArrayObtainStyledAttributes.getResourceId(i.j.f48160G, 0);
        this.f24295K = typedArrayObtainStyledAttributes.getResourceId(i.j.f48170I, 0);
        this.f24296L = typedArrayObtainStyledAttributes.getResourceId(i.j.f48180K, 0);
        this.f24297M = typedArrayObtainStyledAttributes.getResourceId(i.j.f48185L, 0);
        this.f24298N = typedArrayObtainStyledAttributes.getResourceId(i.j.f48195N, 0);
        this.f24299O = typedArrayObtainStyledAttributes.getResourceId(i.j.f48175J, 0);
        this.f24300P = typedArrayObtainStyledAttributes.getBoolean(i.j.f48190M, true);
        this.f24307d = typedArrayObtainStyledAttributes.getDimensionPixelSize(i.j.f48165H, 0);
        typedArrayObtainStyledAttributes.recycle();
        rVar.k(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    private ViewGroup h(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int i() {
        int i10 = this.f24295K;
        return i10 == 0 ? this.f24294J : this.f24301Q == 1 ? i10 : this.f24294J;
    }

    private void o(ViewGroup viewGroup, View view, int i10, int i11) {
        View viewFindViewById = this.f24306c.findViewById(i.f.f48086w);
        View viewFindViewById2 = this.f24306c.findViewById(i.f.f48085v);
        AbstractC2747a0.y0(view, i10, i11);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    private void t(ViewGroup viewGroup) {
        int i10;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f24318o = button;
        button.setOnClickListener(this.f24303S);
        if (TextUtils.isEmpty(this.f24319p) && this.f24321r == null) {
            this.f24318o.setVisibility(8);
            i10 = 0;
        } else {
            this.f24318o.setText(this.f24319p);
            Drawable drawable = this.f24321r;
            if (drawable != null) {
                int i11 = this.f24307d;
                drawable.setBounds(0, 0, i11, i11);
                this.f24318o.setCompoundDrawables(this.f24321r, null, null, null);
            }
            this.f24318o.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f24322s = button2;
        button2.setOnClickListener(this.f24303S);
        if (TextUtils.isEmpty(this.f24323t) && this.f24325v == null) {
            this.f24322s.setVisibility(8);
        } else {
            this.f24322s.setText(this.f24323t);
            Drawable drawable2 = this.f24325v;
            if (drawable2 != null) {
                int i12 = this.f24307d;
                drawable2.setBounds(0, 0, i12, i12);
                this.f24322s.setCompoundDrawables(this.f24325v, null, null, null);
            }
            this.f24322s.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f24326w = button3;
        button3.setOnClickListener(this.f24303S);
        if (TextUtils.isEmpty(this.f24327x) && this.f24329z == null) {
            this.f24326w.setVisibility(8);
        } else {
            this.f24326w.setText(this.f24327x);
            Drawable drawable3 = this.f24329z;
            if (drawable3 != null) {
                int i13 = this.f24307d;
                drawable3.setBounds(0, 0, i13, i13);
                this.f24326w.setCompoundDrawables(this.f24329z, null, null, null);
            }
            this.f24326w.setVisibility(0);
            i10 |= 4;
        }
        if (y(this.f24304a)) {
            if (i10 == 1) {
                b(this.f24318o);
            } else if (i10 == 2) {
                b(this.f24322s);
            } else if (i10 == 4) {
                b(this.f24326w);
            }
        }
        if (i10 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void u(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f24306c.findViewById(i.f.f48087x);
        this.f24285A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f24285A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.f24290F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f24309f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f24285A.removeView(this.f24290F);
        if (this.f24310g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f24285A.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.f24285A);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f24310g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    private void v(ViewGroup viewGroup) {
        View viewInflate = this.f24311h;
        if (viewInflate == null) {
            viewInflate = this.f24312i != 0 ? LayoutInflater.from(this.f24304a).inflate(this.f24312i, viewGroup, false) : null;
        }
        boolean z10 = viewInflate != null;
        if (!z10 || !a(viewInflate)) {
            this.f24306c.setFlags(131072, 131072);
        }
        if (!z10) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f24306c.findViewById(i.f.f48078o);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f24317n) {
            frameLayout.setPadding(this.f24313j, this.f24314k, this.f24315l, this.f24316m);
        }
        if (this.f24310g != null) {
            ((LinearLayout.LayoutParams) ((T.a) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    private void w(ViewGroup viewGroup) {
        if (this.f24291G != null) {
            viewGroup.addView(this.f24291G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f24306c.findViewById(i.f.f48062P).setVisibility(8);
            return;
        }
        this.f24288D = (ImageView) this.f24306c.findViewById(R.id.icon);
        if (TextUtils.isEmpty(this.f24308e) || !this.f24300P) {
            this.f24306c.findViewById(i.f.f48062P).setVisibility(8);
            this.f24288D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f24306c.findViewById(i.f.f48074k);
        this.f24289E = textView;
        textView.setText(this.f24308e);
        int i10 = this.f24286B;
        if (i10 != 0) {
            this.f24288D.setImageResource(i10);
            return;
        }
        Drawable drawable = this.f24287C;
        if (drawable != null) {
            this.f24288D.setImageDrawable(drawable);
        } else {
            this.f24289E.setPadding(this.f24288D.getPaddingLeft(), this.f24288D.getPaddingTop(), this.f24288D.getPaddingRight(), this.f24288D.getPaddingBottom());
            this.f24288D.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void x() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.f24306c.findViewById(i.f.f48084u);
        View viewFindViewById4 = viewFindViewById3.findViewById(i.f.f48063Q);
        View viewFindViewById5 = viewFindViewById3.findViewById(i.f.f48077n);
        View viewFindViewById6 = viewFindViewById3.findViewById(i.f.f48075l);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(i.f.f48079p);
        v(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(i.f.f48063Q);
        View viewFindViewById8 = viewGroup.findViewById(i.f.f48077n);
        View viewFindViewById9 = viewGroup.findViewById(i.f.f48075l);
        ViewGroup viewGroupH = h(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupH2 = h(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupH3 = h(viewFindViewById9, viewFindViewById6);
        u(viewGroupH2);
        t(viewGroupH3);
        w(viewGroupH);
        boolean z10 = viewGroup.getVisibility() != 8;
        boolean z11 = (viewGroupH == null || viewGroupH.getVisibility() == 8) ? 0 : 1;
        boolean z12 = (viewGroupH3 == null || viewGroupH3.getVisibility() == 8) ? false : true;
        if (!z12 && viewGroupH2 != null && (viewFindViewById2 = viewGroupH2.findViewById(i.f.f48058L)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z11 != 0) {
            NestedScrollView nestedScrollView = this.f24285A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (this.f24309f == null && this.f24310g == null) ? null : viewGroupH.findViewById(i.f.f48061O);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupH2 != null && (viewFindViewById = viewGroupH2.findViewById(i.f.f48059M)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.f24310g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z11, z12);
        }
        if (!z10) {
            View view = this.f24310g;
            if (view == null) {
                view = this.f24285A;
            }
            if (view != null) {
                o(viewGroupH2, view, z11 | (z12 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f24310g;
        if (listView2 == null || (listAdapter = this.f24292H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i10 = this.f24293I;
        if (i10 > -1) {
            listView2.setItemChecked(i10, true);
            listView2.setSelection(i10);
        }
    }

    private static boolean y(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC4956a.f47963j, typedValue, true);
        return typedValue.data != 0;
    }

    public int c(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f24304a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView d() {
        return this.f24310g;
    }

    public void e() {
        this.f24305b.setContentView(i());
        x();
    }

    public boolean f(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f24285A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public boolean g(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f24285A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public void j(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f24302R.obtainMessage(i10, onClickListener);
        }
        if (i10 == -3) {
            this.f24327x = charSequence;
            this.f24328y = message;
            this.f24329z = drawable;
        } else if (i10 == -2) {
            this.f24323t = charSequence;
            this.f24324u = message;
            this.f24325v = drawable;
        } else {
            if (i10 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f24319p = charSequence;
            this.f24320q = message;
            this.f24321r = drawable;
        }
    }

    public void k(View view) {
        this.f24291G = view;
    }

    public void l(int i10) {
        this.f24287C = null;
        this.f24286B = i10;
        ImageView imageView = this.f24288D;
        if (imageView != null) {
            if (i10 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f24288D.setImageResource(this.f24286B);
            }
        }
    }

    public void m(Drawable drawable) {
        this.f24287C = drawable;
        this.f24286B = 0;
        ImageView imageView = this.f24288D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f24288D.setImageDrawable(drawable);
            }
        }
    }

    public void n(CharSequence charSequence) {
        this.f24309f = charSequence;
        TextView textView = this.f24290F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void p(CharSequence charSequence) {
        this.f24308e = charSequence;
        TextView textView = this.f24289E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(int i10) {
        this.f24311h = null;
        this.f24312i = i10;
        this.f24317n = false;
    }

    public void r(View view) {
        this.f24311h = view;
        this.f24312i = 0;
        this.f24317n = false;
    }

    public void s(View view, int i10, int i11, int i12, int i13) {
        this.f24311h = view;
        this.f24312i = 0;
        this.f24317n = true;
        this.f24313j = i10;
        this.f24314k = i11;
        this.f24315l = i12;
        this.f24316m = i13;
    }
}
