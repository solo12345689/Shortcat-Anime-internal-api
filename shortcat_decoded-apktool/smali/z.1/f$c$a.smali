.class final Lz/f$c$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz/f$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Lz/E;

.field final synthetic d:Lz/f;

.field final synthetic e:Lz/d;

.field final synthetic f:LGf/C0;


# direct methods
.method constructor <init>(Lz/E;Lz/f;Lz/d;LGf/C0;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz/f$c$a;->c:Lz/E;

    .line 2
    .line 3
    iput-object p2, p0, Lz/f$c$a;->d:Lz/f;

    .line 4
    .line 5
    iput-object p3, p0, Lz/f$c$a;->e:Lz/d;

    .line 6
    .line 7
    iput-object p4, p0, Lz/f$c$a;->f:LGf/C0;

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
.method public final a(Lz/p;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lz/f$c$a;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lz/f$c$a;

    .line 6
    .line 7
    sget-object p2, LTd/L;->a:LTd/L;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lz/f$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 6

    .line 1
    new-instance v0, Lz/f$c$a;

    .line 2
    .line 3
    iget-object v1, p0, Lz/f$c$a;->c:Lz/E;

    .line 4
    .line 5
    iget-object v2, p0, Lz/f$c$a;->d:Lz/f;

    .line 6
    .line 7
    iget-object v3, p0, Lz/f$c$a;->e:Lz/d;

    .line 8
    .line 9
    iget-object v4, p0, Lz/f$c$a;->f:LGf/C0;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lz/f$c$a;-><init>(Lz/E;Lz/f;Lz/d;LGf/C0;LZd/e;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lz/f$c$a;->b:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lz/p;

    .line 2
    .line 3
    check-cast p2, LZd/e;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lz/f$c$a;->a(Lz/p;LZd/e;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lz/f$c$a;->a:I

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
    goto :goto_0

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
    iget-object p1, p0, Lz/f$c$a;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, Lz/p;

    .line 30
    .line 31
    iget-object v1, p0, Lz/f$c$a;->c:Lz/E;

    .line 32
    .line 33
    iget-object v3, p0, Lz/f$c$a;->d:Lz/f;

    .line 34
    .line 35
    iget-object v4, p0, Lz/f$c$a;->e:Lz/d;

    .line 36
    .line 37
    invoke-static {v3, v4}, Lz/f;->E1(Lz/f;Lz/d;)F

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    invoke-virtual {v1, v3}, Lz/E;->j(F)V

    .line 42
    .line 43
    .line 44
    iget-object v1, p0, Lz/f$c$a;->c:Lz/E;

    .line 45
    .line 46
    new-instance v3, Lz/f$c$a$a;

    .line 47
    .line 48
    iget-object v4, p0, Lz/f$c$a;->d:Lz/f;

    .line 49
    .line 50
    iget-object v5, p0, Lz/f$c$a;->f:LGf/C0;

    .line 51
    .line 52
    invoke-direct {v3, v4, v1, v5, p1}, Lz/f$c$a$a;-><init>(Lz/f;Lz/E;LGf/C0;Lz/p;)V

    .line 53
    .line 54
    .line 55
    new-instance p1, Lz/f$c$a$b;

    .line 56
    .line 57
    iget-object v4, p0, Lz/f$c$a;->d:Lz/f;

    .line 58
    .line 59
    iget-object v5, p0, Lz/f$c$a;->c:Lz/E;

    .line 60
    .line 61
    iget-object v6, p0, Lz/f$c$a;->e:Lz/d;

    .line 62
    .line 63
    invoke-direct {p1, v4, v5, v6}, Lz/f$c$a$b;-><init>(Lz/f;Lz/E;Lz/d;)V

    .line 64
    .line 65
    .line 66
    iput v2, p0, Lz/f$c$a;->a:I

    .line 67
    .line 68
    invoke-virtual {v1, v3, p1, p0}, Lz/E;->h(Lkotlin/jvm/functions/Function1;Lie/a;LZd/e;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    if-ne p1, v0, :cond_2

    .line 73
    .line 74
    return-object v0

    .line 75
    :cond_2
    :goto_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 76
    .line 77
    return-object p1
.end method
