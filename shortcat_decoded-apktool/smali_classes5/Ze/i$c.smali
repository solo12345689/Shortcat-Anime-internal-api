.class public abstract LZe/i$c;
.super LZe/i$b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LZe/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZe/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation


# instance fields
.field private b:LZe/h;

.field private c:Z


# direct methods
.method protected constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, LZe/i$b;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, LZe/h;->g()LZe/h;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, LZe/i$c;->b:LZe/h;

    .line 9
    .line 10
    return-void
.end method

.method static synthetic m(LZe/i$c;)LZe/h;
    .locals 0

    .line 1
    invoke-direct {p0}, LZe/i$c;->n()LZe/h;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private n()LZe/h;
    .locals 1

    .line 1
    iget-object v0, p0, LZe/i$c;->b:LZe/h;

    .line 2
    .line 3
    invoke-virtual {v0}, LZe/h;->q()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, LZe/i$c;->c:Z

    .line 8
    .line 9
    iget-object v0, p0, LZe/i$c;->b:LZe/h;

    .line 10
    .line 11
    return-object v0
.end method

.method private p()V
    .locals 1

    .line 1
    iget-boolean v0, p0, LZe/i$c;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LZe/i$c;->b:LZe/h;

    .line 6
    .line 7
    invoke-virtual {v0}, LZe/h;->b()LZe/h;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, LZe/i$c;->b:LZe/h;

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, LZe/i$c;->c:Z

    .line 15
    .line 16
    :cond_0
    return-void
.end method


# virtual methods
.method protected final q(LZe/i$d;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LZe/i$c;->p()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LZe/i$c;->b:LZe/h;

    .line 5
    .line 6
    invoke-static {p1}, LZe/i$d;->s(LZe/i$d;)LZe/h;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v0, p1}, LZe/h;->r(LZe/h;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
