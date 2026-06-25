.class public abstract LP9/r;
.super LP9/v;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/util/Map;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP9/r$a;
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LP9/v;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static q()LP9/r$a;
    .locals 1

    .line 1
    new-instance v0, LP9/r$a;

    .line 2
    .line 3
    invoke-direct {v0}, LP9/r$a;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static v()LP9/r;
    .locals 1

    .line 1
    sget-object v0, LP9/M;->j:LP9/M;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method bridge synthetic g()LP9/s;
    .locals 1

    .line 1
    invoke-virtual {p0}, LP9/r;->t()LP9/w;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic p()LP9/s;
    .locals 1

    .line 1
    invoke-virtual {p0}, LP9/r;->w()LP9/w;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method final t()LP9/w;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/AssertionError;

    .line 2
    .line 3
    const-string v1, "should never be called"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public abstract u()LP9/r;
.end method

.method public bridge synthetic values()Ljava/util/Collection;
    .locals 1

    .line 1
    invoke-virtual {p0}, LP9/r;->w()LP9/w;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public w()LP9/w;
    .locals 1

    .line 1
    invoke-virtual {p0}, LP9/r;->u()LP9/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LP9/v;->j()LP9/w;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
