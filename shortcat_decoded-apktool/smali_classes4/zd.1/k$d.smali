.class public final Lzd/k$d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lzd/j$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzd/k;->e(Lzd/k$b;LZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private a:Z

.field final synthetic b:Lub/e;

.field final synthetic c:Lzd/k$b;

.field final synthetic d:Lzd/k;


# direct methods
.method constructor <init>(Lub/e;Lzd/k$b;Lzd/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lzd/k$d;->b:Lub/e;

    .line 2
    .line 3
    iput-object p2, p0, Lzd/k$d;->c:Lzd/k$b;

    .line 4
    .line 5
    iput-object p3, p0, Lzd/k$d;->d:Lzd/k;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a(LCd/e;)V
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lzd/k$d;->a:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lzd/k$d;->d:Lzd/k;

    .line 11
    .line 12
    invoke-static {v0}, Lzd/k;->d(Lzd/k;)Lzd/j$b;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0, p1}, Lzd/j$b;->a(LCd/e;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/Exception;

    .line 21
    .line 22
    const-string v0, "Cannot set state after procedure completion"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1
.end method

.method public b()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lzd/k$d;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lzd/k$d;->d:Lzd/k;

    .line 6
    .line 7
    invoke-static {v0}, Lzd/k;->d(Lzd/k;)Lzd/j$b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Lzd/j$b;->b()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    new-instance v0, Ljava/lang/Exception;

    .line 16
    .line 17
    const-string v1, "Cannot reset state after procedure completion"

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw v0
.end method

.method public c()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lzd/k$d;->a:Z

    .line 3
    .line 4
    iget-object v0, p0, Lzd/k$d;->b:Lub/e;

    .line 5
    .line 6
    invoke-interface {v0}, Lub/e;->a()J

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lzd/k$d;->c:Lzd/k$b;

    .line 10
    .line 11
    invoke-virtual {v0}, Lzd/k$b;->a()LGf/x;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, LTd/L;->a:LTd/L;

    .line 16
    .line 17
    invoke-interface {v0, v1}, LGf/x;->O(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public d()LCd/h;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lzd/k$d;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lzd/k$d;->d:Lzd/k;

    .line 6
    .line 7
    invoke-static {v0}, Lzd/k;->d(Lzd/k;)Lzd/j$b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Lzd/j$b;->d()LCd/h;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    new-instance v0, Ljava/lang/Exception;

    .line 17
    .line 18
    const-string v1, "Cannot get state after procedure completion"

    .line 19
    .line 20
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw v0
.end method
