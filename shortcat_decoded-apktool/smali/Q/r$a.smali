.class final LQ/r$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ/r;->l(LQ/w;LQ/j;LQ/k$a;)LQ/k$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LQ/j;

.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:LQ/w;

.field final synthetic e:Lkotlin/Lazy;


# direct methods
.method constructor <init>(LQ/j;IILQ/w;Lkotlin/Lazy;)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ/r$a;->a:LQ/j;

    .line 2
    .line 3
    iput p2, p0, LQ/r$a;->b:I

    .line 4
    .line 5
    iput p3, p0, LQ/r$a;->c:I

    .line 6
    .line 7
    iput-object p4, p0, LQ/r$a;->d:LQ/w;

    .line 8
    .line 9
    iput-object p5, p0, LQ/r$a;->e:Lkotlin/Lazy;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a()LQ/k$a;
    .locals 7

    .line 1
    iget-object v0, p0, LQ/r$a;->a:LQ/j;

    .line 2
    .line 3
    iget-object v1, p0, LQ/r$a;->e:Lkotlin/Lazy;

    .line 4
    .line 5
    invoke-static {v1}, LQ/r;->d(Lkotlin/Lazy;)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget v2, p0, LQ/r$a;->b:I

    .line 10
    .line 11
    iget v3, p0, LQ/r$a;->c:I

    .line 12
    .line 13
    iget-object v4, p0, LQ/r$a;->d:LQ/w;

    .line 14
    .line 15
    invoke-interface {v4}, LQ/w;->a()Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    iget-object v5, p0, LQ/r$a;->d:LQ/w;

    .line 20
    .line 21
    invoke-interface {v5}, LQ/w;->e()LQ/e;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    sget-object v6, LQ/e;->a:LQ/e;

    .line 26
    .line 27
    if-ne v5, v6, :cond_0

    .line 28
    .line 29
    const/4 v5, 0x1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v5, 0x0

    .line 32
    :goto_0
    invoke-static/range {v0 .. v5}, LQ/r;->b(LQ/j;IIIZZ)LQ/k$a;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LQ/r$a;->a()LQ/k$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
