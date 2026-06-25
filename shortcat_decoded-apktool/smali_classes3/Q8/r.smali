.class public abstract LQ8/r;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQ8/r$a;
    }
.end annotation


# instance fields
.field private final a:[LO8/c;

.field private final b:Z

.field private final c:I


# direct methods
.method protected constructor <init>([LO8/c;ZI)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LQ8/r;->a:[LO8/c;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    :cond_0
    iput-boolean v0, p0, LQ8/r;->b:Z

    .line 13
    .line 14
    iput p3, p0, LQ8/r;->c:I

    .line 15
    .line 16
    return-void
.end method

.method public static a()LQ8/r$a;
    .locals 2

    .line 1
    new-instance v0, LQ8/r$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LQ8/r$a;-><init>(LQ8/X;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method


# virtual methods
.method protected abstract b(LP8/a$b;Ln9/j;)V
.end method

.method public c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LQ8/r;->b:Z

    .line 2
    .line 3
    return v0
.end method

.method public final d()I
    .locals 1

    .line 1
    iget v0, p0, LQ8/r;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public final e()[LO8/c;
    .locals 1

    .line 1
    iget-object v0, p0, LQ8/r;->a:[LO8/c;

    .line 2
    .line 3
    return-object v0
.end method
