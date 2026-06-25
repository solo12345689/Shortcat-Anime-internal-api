.class public LF3/a$d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF3/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field final a:LF3/a$a$a;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x1a

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    new-instance v0, LF3/a$c$a;

    .line 11
    .line 12
    invoke-direct {v0}, LF3/a$c$a;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, LF3/a$d;->a:LF3/a$a$a;

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance v0, LF3/a$b$a;

    .line 19
    .line 20
    invoke-direct {v0}, LF3/a$b$a;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, LF3/a$d;->a:LF3/a$a$a;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public a()LF3/a;
    .locals 2

    .line 1
    new-instance v0, LF3/a;

    .line 2
    .line 3
    iget-object v1, p0, LF3/a$d;->a:LF3/a$a$a;

    .line 4
    .line 5
    invoke-interface {v1}, LF3/a$a$a;->build()LF3/a$a;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, LF3/a;-><init>(LF3/a$a;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public b(I)LF3/a$d;
    .locals 1

    .line 1
    iget-object v0, p0, LF3/a$d;->a:LF3/a$a$a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LF3/a$a$a;->e(I)LF3/a$a$a;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public c(I)LF3/a$d;
    .locals 1

    .line 1
    iget-object v0, p0, LF3/a$d;->a:LF3/a$a$a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LF3/a$a$a;->c(I)LF3/a$a$a;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public d(I)LF3/a$d;
    .locals 1

    .line 1
    iget-object v0, p0, LF3/a$d;->a:LF3/a$a$a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LF3/a$a$a;->d(I)LF3/a$a$a;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method
