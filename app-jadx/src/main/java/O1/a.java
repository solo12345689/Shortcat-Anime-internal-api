package O1;

import O1.b;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f12891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f12892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Cursor f12893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Context f12894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f12895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected C0203a f12896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected DataSetObserver f12897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected O1.b f12898h;

    /* JADX INFO: renamed from: O1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class C0203a extends ContentObserver {
        C0203a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            a.this.h();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f12891a = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f12891a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z10) {
        e(context, cursor, z10 ? 1 : 2);
    }

    @Override // O1.b.a
    public void a(Cursor cursor) {
        Cursor cursorI = i(cursor);
        if (cursorI != null) {
            cursorI.close();
        }
    }

    @Override // O1.b.a
    public Cursor c() {
        return this.f12893c;
    }

    @Override // O1.b.a
    public abstract CharSequence convertToString(Cursor cursor);

    public abstract void d(View view, Context context, Cursor cursor);

    void e(Context context, Cursor cursor, int i10) {
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f12892b = true;
        } else {
            this.f12892b = false;
        }
        boolean z10 = cursor != null;
        this.f12893c = cursor;
        this.f12891a = z10;
        this.f12894d = context;
        this.f12895e = z10 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i10 & 2) == 2) {
            this.f12896f = new C0203a();
            this.f12897g = new b();
        } else {
            this.f12896f = null;
            this.f12897g = null;
        }
        if (z10) {
            C0203a c0203a = this.f12896f;
            if (c0203a != null) {
                cursor.registerContentObserver(c0203a);
            }
            DataSetObserver dataSetObserver = this.f12897g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View f(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f12891a || (cursor = this.f12893c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f12891a) {
            return null;
        }
        this.f12893c.moveToPosition(i10);
        if (view == null) {
            view = f(this.f12894d, this.f12893c, viewGroup);
        }
        d(view, this.f12894d, this.f12893c);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f12898h == null) {
            this.f12898h = new O1.b(this);
        }
        return this.f12898h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f12891a || (cursor = this.f12893c) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f12893c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        Cursor cursor;
        if (this.f12891a && (cursor = this.f12893c) != null && cursor.moveToPosition(i10)) {
            return this.f12893c.getLong(this.f12895e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f12891a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f12893c.moveToPosition(i10)) {
            if (view == null) {
                view = g(this.f12894d, this.f12893c, viewGroup);
            }
            d(view, this.f12894d, this.f12893c);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i10);
    }

    protected void h() {
        Cursor cursor;
        if (!this.f12892b || (cursor = this.f12893c) == null || cursor.isClosed()) {
            return;
        }
        this.f12891a = this.f12893c.requery();
    }

    public Cursor i(Cursor cursor) {
        Cursor cursor2 = this.f12893c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0203a c0203a = this.f12896f;
            if (c0203a != null) {
                cursor2.unregisterContentObserver(c0203a);
            }
            DataSetObserver dataSetObserver = this.f12897g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f12893c = cursor;
        if (cursor == null) {
            this.f12895e = -1;
            this.f12891a = false;
            notifyDataSetInvalidated();
            return cursor2;
        }
        C0203a c0203a2 = this.f12896f;
        if (c0203a2 != null) {
            cursor.registerContentObserver(c0203a2);
        }
        DataSetObserver dataSetObserver2 = this.f12897g;
        if (dataSetObserver2 != null) {
            cursor.registerDataSetObserver(dataSetObserver2);
        }
        this.f12895e = cursor.getColumnIndexOrThrow("_id");
        this.f12891a = true;
        notifyDataSetChanged();
        return cursor2;
    }
}
