package O1;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f12902i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f12903j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private LayoutInflater f12904k;

    public c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.f12903j = i10;
        this.f12902i = i10;
        this.f12904k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // O1.a
    public View f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f12904k.inflate(this.f12903j, viewGroup, false);
    }

    @Override // O1.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f12904k.inflate(this.f12902i, viewGroup, false);
    }
}
