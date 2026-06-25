.class abstract La3/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La3/e$a;
    }
.end annotation


# instance fields
.field protected final a:LU2/O;


# direct methods
.method protected constructor <init>(LU2/O;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La3/e;->a:LU2/O;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lt2/I;J)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, La3/e;->b(Lt2/I;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2, p3}, La3/e;->c(Lt2/I;J)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    return p1
.end method

.method protected abstract b(Lt2/I;)Z
.end method

.method protected abstract c(Lt2/I;J)Z
.end method
