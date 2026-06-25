.class public final LR8/T;
.super LS8/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LR8/T;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:I

.field private final b:I

.field private final c:I

.field private final d:[Lcom/google/android/gms/common/api/Scope;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LR8/U;

    .line 2
    .line 3
    invoke-direct {v0}, LR8/U;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LR8/T;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    return-void
.end method

.method constructor <init>(III[Lcom/google/android/gms/common/api/Scope;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LS8/a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LR8/T;->a:I

    .line 5
    .line 6
    iput p2, p0, LR8/T;->b:I

    .line 7
    .line 8
    iput p3, p0, LR8/T;->c:I

    .line 9
    .line 10
    iput-object p4, p0, LR8/T;->d:[Lcom/google/android/gms/common/api/Scope;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    iget v0, p0, LR8/T;->a:I

    .line 2
    .line 3
    invoke-static {p1}, LS8/c;->a(Landroid/os/Parcel;)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-static {p1, v2, v0}, LS8/c;->j(Landroid/os/Parcel;II)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x2

    .line 12
    iget v2, p0, LR8/T;->b:I

    .line 13
    .line 14
    invoke-static {p1, v0, v2}, LS8/c;->j(Landroid/os/Parcel;II)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x3

    .line 18
    iget v2, p0, LR8/T;->c:I

    .line 19
    .line 20
    invoke-static {p1, v0, v2}, LS8/c;->j(Landroid/os/Parcel;II)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, LR8/T;->d:[Lcom/google/android/gms/common/api/Scope;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    const/4 v3, 0x4

    .line 27
    invoke-static {p1, v3, v0, p2, v2}, LS8/c;->s(Landroid/os/Parcel;I[Landroid/os/Parcelable;IZ)V

    .line 28
    .line 29
    .line 30
    invoke-static {p1, v1}, LS8/c;->b(Landroid/os/Parcel;I)V

    .line 31
    .line 32
    .line 33
    return-void
.end method
