.class public LVh/g;
.super Lai/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:LYh/f;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lai/a;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LYh/f;

    .line 5
    .line 6
    invoke-direct {v0}, LYh/f;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LVh/g;->a:LYh/f;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public c(LYh/a;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method

.method public e(LZh/f;)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic f()LYh/a;
    .locals 1

    .line 1
    invoke-virtual {p0}, LVh/g;->j()LYh/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public i(Lai/h;)Lai/c;
    .locals 0

    .line 1
    invoke-interface {p1}, Lai/h;->getIndex()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, Lai/c;->b(I)Lai/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public j()LYh/f;
    .locals 1

    .line 1
    iget-object v0, p0, LVh/g;->a:LYh/f;

    .line 2
    .line 3
    return-object v0
.end method
