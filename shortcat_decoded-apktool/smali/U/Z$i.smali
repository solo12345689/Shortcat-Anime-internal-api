.class final LU/Z$i;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/Z;->g(Lw/i;ZLY/m;I)LY/h2;
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


# direct methods
.method constructor <init>(Lw/a;ZLw/i;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU/Z$i;->b:Lw/a;

    .line 2
    .line 3
    iput-boolean p2, p0, LU/Z$i;->c:Z

    .line 4
    .line 5
    iput-object p3, p0, LU/Z$i;->d:Lw/i;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 3

    .line 1
    new-instance p1, LU/Z$i;

    .line 2
    .line 3
    iget-object v0, p0, LU/Z$i;->b:Lw/a;

    .line 4
    .line 5
    iget-boolean v1, p0, LU/Z$i;->c:Z

    .line 6
    .line 7
    iget-object v2, p0, LU/Z$i;->d:Lw/i;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, LU/Z$i;-><init>(Lw/a;ZLw/i;LZd/e;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LU/Z$i;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, LU/Z$i;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, LU/Z$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, LU/Z$i;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

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
    iget v1, p0, LU/Z$i;->a:I

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
    goto :goto_1

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, LU/Z$i;->b:Lw/a;

    .line 28
    .line 29
    iget-boolean p1, p0, LU/Z$i;->c:Z

    .line 30
    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    const/high16 p1, 0x3f800000    # 1.0f

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    const p1, 0x3f4ccccd    # 0.8f

    .line 37
    .line 38
    .line 39
    :goto_0
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iget-object v3, p0, LU/Z$i;->d:Lw/i;

    .line 44
    .line 45
    iput v2, p0, LU/Z$i;->a:I

    .line 46
    .line 47
    const/4 v4, 0x0

    .line 48
    const/4 v5, 0x0

    .line 49
    const/16 v7, 0xc

    .line 50
    .line 51
    const/4 v8, 0x0

    .line 52
    move-object v6, p0

    .line 53
    move-object v2, p1

    .line 54
    invoke-static/range {v1 .. v8}, Lw/a;->f(Lw/a;Ljava/lang/Object;Lw/i;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LZd/e;ILjava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-ne p1, v0, :cond_3

    .line 59
    .line 60
    return-object v0

    .line 61
    :cond_3
    :goto_1
    sget-object p1, LTd/L;->a:LTd/L;

    .line 62
    .line 63
    return-object p1
.end method
