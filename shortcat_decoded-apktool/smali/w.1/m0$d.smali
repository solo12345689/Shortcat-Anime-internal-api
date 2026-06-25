.class final Lw/m0$d;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/m0;->c(Lw/k;Lw/d;JLkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/N;

.field final synthetic b:Ljava/lang/Object;

.field final synthetic c:Lw/d;

.field final synthetic d:Lw/q;

.field final synthetic e:Lw/k;

.field final synthetic f:F

.field final synthetic g:Lkotlin/jvm/functions/Function1;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/N;Ljava/lang/Object;Lw/d;Lw/q;Lw/k;FLkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw/m0$d;->a:Lkotlin/jvm/internal/N;

    .line 2
    .line 3
    iput-object p2, p0, Lw/m0$d;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lw/m0$d;->c:Lw/d;

    .line 6
    .line 7
    iput-object p4, p0, Lw/m0$d;->d:Lw/q;

    .line 8
    .line 9
    iput-object p5, p0, Lw/m0$d;->e:Lw/k;

    .line 10
    .line 11
    iput p6, p0, Lw/m0$d;->f:F

    .line 12
    .line 13
    iput-object p7, p0, Lw/m0$d;->g:Lkotlin/jvm/functions/Function1;

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 12

    .line 1
    iget-object v0, p0, Lw/m0$d;->a:Lkotlin/jvm/internal/N;

    .line 2
    .line 3
    new-instance v1, Lw/h;

    .line 4
    .line 5
    iget-object v2, p0, Lw/m0$d;->b:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Lw/m0$d;->c:Lw/d;

    .line 8
    .line 9
    invoke-interface {v3}, Lw/d;->e()Lw/s0;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    iget-object v4, p0, Lw/m0$d;->d:Lw/q;

    .line 14
    .line 15
    iget-object v5, p0, Lw/m0$d;->c:Lw/d;

    .line 16
    .line 17
    invoke-interface {v5}, Lw/d;->g()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v7

    .line 21
    new-instance v11, Lw/m0$d$a;

    .line 22
    .line 23
    iget-object v5, p0, Lw/m0$d;->e:Lw/k;

    .line 24
    .line 25
    invoke-direct {v11, v5}, Lw/m0$d$a;-><init>(Lw/k;)V

    .line 26
    .line 27
    .line 28
    const/4 v10, 0x1

    .line 29
    move-wide v8, p1

    .line 30
    move-wide v5, p1

    .line 31
    invoke-direct/range {v1 .. v11}, Lw/h;-><init>(Ljava/lang/Object;Lw/s0;Lw/q;JLjava/lang/Object;JZLie/a;)V

    .line 32
    .line 33
    .line 34
    move-wide v2, v5

    .line 35
    iget v4, p0, Lw/m0$d;->f:F

    .line 36
    .line 37
    iget-object v5, p0, Lw/m0$d;->c:Lw/d;

    .line 38
    .line 39
    iget-object v6, p0, Lw/m0$d;->e:Lw/k;

    .line 40
    .line 41
    iget-object v7, p0, Lw/m0$d;->g:Lkotlin/jvm/functions/Function1;

    .line 42
    .line 43
    invoke-static/range {v1 .. v7}, Lw/m0;->a(Lw/h;JFLw/d;Lw/k;Lkotlin/jvm/functions/Function1;)V

    .line 44
    .line 45
    .line 46
    iput-object v1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 47
    .line 48
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-virtual {p0, v0, v1}, Lw/m0$d;->a(J)V

    .line 8
    .line 9
    .line 10
    sget-object p1, LTd/L;->a:LTd/L;

    .line 11
    .line 12
    return-object p1
.end method
