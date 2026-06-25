.class public abstract Lc9/i;
.super Lc9/d;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lc9/j;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "com.google.android.gms.auth.blockstore.internal.IDeleteBytesCallback"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lc9/d;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method protected final c(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 0

    .line 1
    const/4 p3, 0x1

    .line 2
    if-ne p1, p3, :cond_0

    .line 3
    .line 4
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 5
    .line 6
    invoke-static {p2, p1}, Lc9/e;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 11
    .line 12
    invoke-static {p2}, Lc9/e;->d(Landroid/os/Parcel;)Z

    .line 13
    .line 14
    .line 15
    move-result p4

    .line 16
    invoke-virtual {p0, p2}, Lc9/d;->e(Landroid/os/Parcel;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p0, p1, p4}, Lc9/j;->z1(Lcom/google/android/gms/common/api/Status;Z)V

    .line 20
    .line 21
    .line 22
    return p3

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    return p1
.end method
