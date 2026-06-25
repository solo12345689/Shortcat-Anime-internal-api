.class public LR8/e;
.super LS8/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LR8/e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:LR8/r;

.field private final b:Z

.field private final c:Z

.field private final d:[I

.field private final e:I

.field private final f:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LR8/n0;

    .line 2
    .line 3
    invoke-direct {v0}, LR8/n0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LR8/e;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(LR8/r;ZZ[II[I)V
    .locals 0

    .line 1
    invoke-direct {p0}, LS8/a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LR8/e;->a:LR8/r;

    .line 5
    .line 6
    iput-boolean p2, p0, LR8/e;->b:Z

    .line 7
    .line 8
    iput-boolean p3, p0, LR8/e;->c:Z

    .line 9
    .line 10
    iput-object p4, p0, LR8/e;->d:[I

    .line 11
    .line 12
    iput p5, p0, LR8/e;->e:I

    .line 13
    .line 14
    iput-object p6, p0, LR8/e;->f:[I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public c()I
    .locals 1

    .line 1
    iget v0, p0, LR8/e;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public d()[I
    .locals 1

    .line 1
    iget-object v0, p0, LR8/e;->d:[I

    .line 2
    .line 3
    return-object v0
.end method

.method public e()[I
    .locals 1

    .line 1
    iget-object v0, p0, LR8/e;->f:[I

    .line 2
    .line 3
    return-object v0
.end method

.method public f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LR8/e;->b:Z

    .line 2
    .line 3
    return v0
.end method

.method public i()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LR8/e;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public final l()LR8/r;
    .locals 1

    .line 1
    iget-object v0, p0, LR8/e;->a:LR8/r;

    .line 2
    .line 3
    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    invoke-static {p1}, LS8/c;->a(Landroid/os/Parcel;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, LR8/e;->a:LR8/r;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-static {p1, v2, v1, p2, v3}, LS8/c;->p(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 10
    .line 11
    .line 12
    const/4 p2, 0x2

    .line 13
    invoke-virtual {p0}, LR8/e;->f()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static {p1, p2, v1}, LS8/c;->c(Landroid/os/Parcel;IZ)V

    .line 18
    .line 19
    .line 20
    const/4 p2, 0x3

    .line 21
    invoke-virtual {p0}, LR8/e;->i()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-static {p1, p2, v1}, LS8/c;->c(Landroid/os/Parcel;IZ)V

    .line 26
    .line 27
    .line 28
    const/4 p2, 0x4

    .line 29
    invoke-virtual {p0}, LR8/e;->d()[I

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {p1, p2, v1, v3}, LS8/c;->k(Landroid/os/Parcel;I[IZ)V

    .line 34
    .line 35
    .line 36
    const/4 p2, 0x5

    .line 37
    invoke-virtual {p0}, LR8/e;->c()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-static {p1, p2, v1}, LS8/c;->j(Landroid/os/Parcel;II)V

    .line 42
    .line 43
    .line 44
    const/4 p2, 0x6

    .line 45
    invoke-virtual {p0}, LR8/e;->e()[I

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-static {p1, p2, v1, v3}, LS8/c;->k(Landroid/os/Parcel;I[IZ)V

    .line 50
    .line 51
    .line 52
    invoke-static {p1, v0}, LS8/c;->b(Landroid/os/Parcel;I)V

    .line 53
    .line 54
    .line 55
    return-void
.end method
