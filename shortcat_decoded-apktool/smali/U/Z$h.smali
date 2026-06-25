.class final LU/Z$h;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/Z;->f(Lw/i;ZLie/a;LY/m;II)LY/h2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lw/a;

.field final synthetic c:Z

.field final synthetic d:Lw/i;

.field final synthetic e:Lie/a;


# direct methods
.method constructor <init>(Lw/a;ZLw/i;Lie/a;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU/Z$h;->b:Lw/a;

    .line 2
    .line 3
    iput-boolean p2, p0, LU/Z$h;->c:Z

    .line 4
    .line 5
    iput-object p3, p0, LU/Z$h;->d:Lw/i;

    .line 6
    .line 7
    iput-object p4, p0, LU/Z$h;->e:Lie/a;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 6

    .line 1
    new-instance v0, LU/Z$h;

    .line 2
    .line 3
    iget-object v1, p0, LU/Z$h;->b:Lw/a;

    .line 4
    .line 5
    iget-boolean v2, p0, LU/Z$h;->c:Z

    .line 6
    .line 7
    iget-object v3, p0, LU/Z$h;->d:Lw/i;

    .line 8
    .line 9
    iget-object v4, p0, LU/Z$h;->e:Lie/a;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, LU/Z$h;-><init>(Lw/a;ZLw/i;Lie/a;LZd/e;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LU/Z$h;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, LU/Z$h;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, LU/Z$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, LU/Z$h;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, LU/Z$h;->a:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    move-object v6, p0

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p1

    .line 25
    :cond_1
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, LU/Z$h;->b:Lw/a;

    .line 29
    .line 30
    iget-boolean p1, p0, LU/Z$h;->c:Z

    .line 31
    .line 32
    if-eqz p1, :cond_2

    .line 33
    .line 34
    const/high16 p1, 0x3f800000    # 1.0f

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    const/4 p1, 0x0

    .line 38
    :goto_0
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iget-object v3, p0, LU/Z$h;->d:Lw/i;

    .line 43
    .line 44
    iput v2, p0, LU/Z$h;->a:I

    .line 45
    .line 46
    const/4 v4, 0x0

    .line 47
    const/4 v5, 0x0

    .line 48
    const/16 v7, 0xc

    .line 49
    .line 50
    const/4 v8, 0x0

    .line 51
    move-object v6, p0

    .line 52
    move-object v2, p1

    .line 53
    invoke-static/range {v1 .. v8}, Lw/a;->f(Lw/a;Ljava/lang/Object;Lw/i;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LZd/e;ILjava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-ne p1, v0, :cond_3

    .line 58
    .line 59
    return-object v0

    .line 60
    :cond_3
    :goto_1
    iget-object p1, v6, LU/Z$h;->e:Lie/a;

    .line 61
    .line 62
    invoke-interface {p1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    sget-object p1, LTd/L;->a:LTd/L;

    .line 66
    .line 67
    return-object p1
.end method
