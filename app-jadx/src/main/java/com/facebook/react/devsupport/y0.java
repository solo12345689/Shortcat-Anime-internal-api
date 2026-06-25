package com.facebook.react.devsupport;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import b7.C3026a;
import c7.j;
import com.facebook.react.AbstractC3247l;
import com.facebook.react.AbstractC3249n;
import dg.C;
import dg.C4618A;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class y0 extends LinearLayout implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c7.f f36857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ListView f36858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j.a f36859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final View.OnClickListener f36860d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a extends AsyncTask {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0615a f36861b = new C0615a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final dg.x f36862c = dg.x.f45605e.a("application/json; charset=utf-8");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c7.f f36863a;

        /* JADX INFO: renamed from: com.facebook.react.devsupport.y0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0615a {
            public /* synthetic */ C0615a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final JSONObject b(c7.k kVar) {
                return new JSONObject(Ud.S.l(Td.z.a("file", kVar.getFile()), Td.z.a("methodName", kVar.getMethod()), Td.z.a("lineNumber", Integer.valueOf(kVar.a())), Td.z.a("column", Integer.valueOf(kVar.getColumn()))));
            }

            private C0615a() {
            }
        }

        public a(c7.f devSupportManager) {
            AbstractC5504s.h(devSupportManager, "devSupportManager");
            this.f36863a = devSupportManager;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(c7.k... stackFrames) {
            String string;
            C4618A c4618aA;
            int i10;
            AbstractC5504s.h(stackFrames, "stackFrames");
            try {
                string = Uri.parse(this.f36863a.u()).buildUpon().path("/open-stack-frame").query(null).build().toString();
                AbstractC5504s.g(string, "toString(...)");
                c4618aA = C3026a.f33222a.a();
            } catch (Exception e10) {
                AbstractC7283a.n("ReactNative", "Could not open stack frame", e10);
            }
            for (c7.k kVar : stackFrames) {
                C0615a c0615a = f36861b;
                if (kVar == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                String string2 = c0615a.b(kVar).toString();
                AbstractC5504s.g(string2, "toString(...)");
                c4618aA.a(new C.a().m(string).h(dg.D.f45262a.a(f36862c, string2)).b()).b();
                return null;
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b extends BaseAdapter {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f36864c = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f36865a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c7.k[] f36866b;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        /* JADX INFO: renamed from: com.facebook.react.devsupport.y0$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static final class C0616b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final TextView f36867a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final TextView f36868b;

            public C0616b(View v10) {
                AbstractC5504s.h(v10, "v");
                View viewFindViewById = v10.findViewById(AbstractC3247l.f36930x);
                AbstractC5504s.g(viewFindViewById, "findViewById(...)");
                this.f36867a = (TextView) viewFindViewById;
                View viewFindViewById2 = v10.findViewById(AbstractC3247l.f36929w);
                AbstractC5504s.g(viewFindViewById2, "findViewById(...)");
                this.f36868b = (TextView) viewFindViewById2;
            }

            public final TextView a() {
                return this.f36868b;
            }

            public final TextView b() {
                return this.f36867a;
            }
        }

        public b(String title, c7.k[] stack) {
            AbstractC5504s.h(title, "title");
            AbstractC5504s.h(stack, "stack");
            this.f36865a = title;
            this.f36866b = stack;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            return false;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f36866b.length + 1;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            return i10 == 0 ? this.f36865a : this.f36866b[i10 - 1];
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i10) {
            return i10 == 0 ? 0 : 1;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup parent) {
            TextView textView;
            AbstractC5504s.h(parent, "parent");
            if (i10 == 0) {
                if (view != null) {
                    textView = (TextView) view;
                } else {
                    View viewInflate = LayoutInflater.from(parent.getContext()).inflate(AbstractC3249n.f37101f, parent, false);
                    AbstractC5504s.f(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
                    textView = (TextView) viewInflate;
                }
                textView.setText(new Df.p("\\x1b\\[[0-9;]*m").i(this.f36865a, ""));
                return textView;
            }
            if (view == null) {
                view = LayoutInflater.from(parent.getContext()).inflate(AbstractC3249n.f37100e, parent, false);
                AbstractC5504s.e(view);
                view.setTag(new C0616b(view));
            }
            c7.k kVar = this.f36866b[i10 - 1];
            Object tag = view.getTag();
            AbstractC5504s.f(tag, "null cannot be cast to non-null type com.facebook.react.devsupport.RedBoxContentView.StackAdapter.FrameViewHolder");
            C0616b c0616b = (C0616b) tag;
            c0616b.b().setText(kVar.getMethod());
            c0616b.a().setText(D0.f36618a.c(kVar));
            c0616b.b().setTextColor(kVar.b() ? -5592406 : -1);
            c0616b.a().setTextColor(kVar.b() ? -8355712 : -5000269);
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 2;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i10) {
            return i10 > 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements j.a {
        c() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(Context context, c7.f devSupportManager, c7.j jVar) {
        super(context);
        AbstractC5504s.h(devSupportManager, "devSupportManager");
        this.f36857a = devSupportManager;
        this.f36859c = new c();
        this.f36860d = new View.OnClickListener() { // from class: com.facebook.react.devsupport.v0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y0.h(this.f36853a, view);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(y0 y0Var, View view) {
        y0Var.f36857a.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(y0 y0Var, View view) {
        y0Var.f36857a.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(y0 y0Var, View view) {
        y0Var.getClass();
    }

    public final void d() {
        LayoutInflater.from(getContext()).inflate(AbstractC3249n.f37102g, this);
        ListView listView = (ListView) findViewById(AbstractC3247l.f36900A);
        listView.setOnItemClickListener(this);
        this.f36858b = listView;
        ((Button) findViewById(AbstractC3247l.f36932z)).setOnClickListener(new View.OnClickListener() { // from class: com.facebook.react.devsupport.w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y0.e(this.f36854a, view);
            }
        });
        ((Button) findViewById(AbstractC3247l.f36931y)).setOnClickListener(new View.OnClickListener() { // from class: com.facebook.react.devsupport.x0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y0.f(this.f36856a, view);
            }
        });
    }

    public final void g() {
        String strK = this.f36857a.k();
        c7.k[] kVarArrZ = this.f36857a.z();
        if (kVarArrZ == null) {
            kVarArrZ = new c7.k[0];
        }
        if (this.f36857a.t() == null) {
            throw new IllegalStateException("Required value was null.");
        }
        c7.f fVar = this.f36857a;
        Pair pairCreate = Pair.create(strK, kVarArrZ);
        AbstractC5504s.g(pairCreate, "create(...)");
        Pair pairR = fVar.r(pairCreate);
        if (pairR == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Object first = pairR.first;
        AbstractC5504s.g(first, "first");
        Object second = pairR.second;
        AbstractC5504s.g(second, "second");
        i((String) first, (c7.k[]) second);
        this.f36857a.x();
    }

    public final void i(String title, c7.k[] stack) {
        AbstractC5504s.h(title, "title");
        AbstractC5504s.h(stack, "stack");
        ListView listView = this.f36858b;
        if (listView == null) {
            AbstractC5504s.u("stackView");
            listView = null;
        }
        listView.setAdapter((ListAdapter) new b(title, stack));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        AbstractC5504s.h(view, "view");
        a aVar = new a(this.f36857a);
        Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
        c7.k[] kVarArr = new c7.k[1];
        ListView listView = this.f36858b;
        if (listView == null) {
            AbstractC5504s.u("stackView");
            listView = null;
        }
        Object item = listView.getAdapter().getItem(i10);
        AbstractC5504s.f(item, "null cannot be cast to non-null type com.facebook.react.devsupport.interfaces.StackFrame");
        kVarArr[0] = item;
        aVar.executeOnExecutor(executor, kVarArr);
    }
}
