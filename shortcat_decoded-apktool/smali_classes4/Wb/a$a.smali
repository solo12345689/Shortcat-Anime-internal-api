.class final LWb/a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LWb/a;-><init>(Lic/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:I

.field final synthetic d:LWb/a;


# direct methods
.method constructor <init>(LWb/a;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LWb/a$a;->d:LWb/a;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 1

    .line 1
    new-instance p1, LWb/a$a;

    .line 2
    .line 3
    iget-object v0, p0, LWb/a$a;->d:LWb/a;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, LWb/a$a;-><init>(LWb/a;LZd/e;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LWb/a$a;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, LWb/a$a;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, LWb/a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, LWb/a$a;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, LWb/a$a;->c:I

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
    iget-object v0, p0, LWb/a$a;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, LWb/a;

    .line 15
    .line 16
    iget-object v0, p0, LWb/a$a;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, LVb/a;

    .line 19
    .line 20
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_1
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, LWb/a$a;->d:LWb/a;

    .line 36
    .line 37
    iput-object p1, p0, LWb/a$a;->a:Ljava/lang/Object;

    .line 38
    .line 39
    iput-object p1, p0, LWb/a$a;->b:Ljava/lang/Object;

    .line 40
    .line 41
    iput v2, p0, LWb/a$a;->c:I

    .line 42
    .line 43
    new-instance v1, LGf/p;

    .line 44
    .line 45
    invoke-static {p0}, Lae/b;->c(LZd/e;)LZd/e;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-direct {v1, v3, v2}, LGf/p;-><init>(LZd/e;I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, LGf/p;->C()V

    .line 53
    .line 54
    .line 55
    new-instance v2, LWb/a$a$a;

    .line 56
    .line 57
    invoke-direct {v2, v1, p1, p1}, LWb/a$a$a;-><init>(LGf/n;LVb/a;LWb/a;)V

    .line 58
    .line 59
    .line 60
    invoke-interface {p1, v2}, LVb/a;->a(LVb/e;)V

    .line 61
    .line 62
    .line 63
    new-instance v3, LWb/a$a$b;

    .line 64
    .line 65
    invoke-direct {v3, p1, v2}, LWb/a$a$b;-><init>(LVb/a;LWb/a$a$a;)V

    .line 66
    .line 67
    .line 68
    invoke-interface {v1, v3}, LGf/n;->p(Lkotlin/jvm/functions/Function1;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, LGf/p;->v()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    if-ne p1, v1, :cond_2

    .line 80
    .line 81
    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/h;->c(LZd/e;)V

    .line 82
    .line 83
    .line 84
    :cond_2
    if-ne p1, v0, :cond_3

    .line 85
    .line 86
    return-object v0

    .line 87
    :cond_3
    :goto_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 88
    .line 89
    return-object p1
.end method
