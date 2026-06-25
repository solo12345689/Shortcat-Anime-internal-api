.class final LB4/a$e;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB4/a;->h(LG4/h;Ljava/lang/Object;LG4/m;Lv4/b;LZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LB4/a;

.field final synthetic c:Lkotlin/jvm/internal/N;

.field final synthetic d:Lkotlin/jvm/internal/N;

.field final synthetic e:LG4/h;

.field final synthetic f:Ljava/lang/Object;

.field final synthetic g:Lkotlin/jvm/internal/N;

.field final synthetic h:Lv4/b;


# direct methods
.method constructor <init>(LB4/a;Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;LG4/h;Ljava/lang/Object;Lkotlin/jvm/internal/N;Lv4/b;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LB4/a$e;->b:LB4/a;

    .line 2
    .line 3
    iput-object p2, p0, LB4/a$e;->c:Lkotlin/jvm/internal/N;

    .line 4
    .line 5
    iput-object p3, p0, LB4/a$e;->d:Lkotlin/jvm/internal/N;

    .line 6
    .line 7
    iput-object p4, p0, LB4/a$e;->e:LG4/h;

    .line 8
    .line 9
    iput-object p5, p0, LB4/a$e;->f:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p6, p0, LB4/a$e;->g:Lkotlin/jvm/internal/N;

    .line 12
    .line 13
    iput-object p7, p0, LB4/a$e;->h:Lv4/b;

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1, p8}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 9

    .line 1
    new-instance v0, LB4/a$e;

    .line 2
    .line 3
    iget-object v1, p0, LB4/a$e;->b:LB4/a;

    .line 4
    .line 5
    iget-object v2, p0, LB4/a$e;->c:Lkotlin/jvm/internal/N;

    .line 6
    .line 7
    iget-object v3, p0, LB4/a$e;->d:Lkotlin/jvm/internal/N;

    .line 8
    .line 9
    iget-object v4, p0, LB4/a$e;->e:LG4/h;

    .line 10
    .line 11
    iget-object v5, p0, LB4/a$e;->f:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v6, p0, LB4/a$e;->g:Lkotlin/jvm/internal/N;

    .line 14
    .line 15
    iget-object v7, p0, LB4/a$e;->h:Lv4/b;

    .line 16
    .line 17
    move-object v8, p2

    .line 18
    invoke-direct/range {v0 .. v8}, LB4/a$e;-><init>(LB4/a;Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;LG4/h;Ljava/lang/Object;Lkotlin/jvm/internal/N;Lv4/b;LZd/e;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LB4/a$e;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, LB4/a$e;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, LB4/a$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, LB4/a$e;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

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
    iget v1, p0, LB4/a$e;->a:I

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
    return-object p1

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
    iget-object v1, p0, LB4/a$e;->b:LB4/a;

    .line 28
    .line 29
    iget-object p1, p0, LB4/a$e;->c:Lkotlin/jvm/internal/N;

    .line 30
    .line 31
    iget-object p1, p1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p1, LA4/m;

    .line 34
    .line 35
    iget-object v3, p0, LB4/a$e;->d:Lkotlin/jvm/internal/N;

    .line 36
    .line 37
    iget-object v3, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v3, Lv4/a;

    .line 40
    .line 41
    iget-object v4, p0, LB4/a$e;->e:LG4/h;

    .line 42
    .line 43
    iget-object v5, p0, LB4/a$e;->f:Ljava/lang/Object;

    .line 44
    .line 45
    iget-object v6, p0, LB4/a$e;->g:Lkotlin/jvm/internal/N;

    .line 46
    .line 47
    iget-object v6, v6, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v6, LG4/m;

    .line 50
    .line 51
    iget-object v7, p0, LB4/a$e;->h:Lv4/b;

    .line 52
    .line 53
    iput v2, p0, LB4/a$e;->a:I

    .line 54
    .line 55
    move-object v8, p0

    .line 56
    move-object v2, p1

    .line 57
    invoke-static/range {v1 .. v8}, LB4/a;->b(LB4/a;LA4/m;Lv4/a;LG4/h;Ljava/lang/Object;LG4/m;Lv4/b;LZd/e;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    if-ne p1, v0, :cond_2

    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_2
    return-object p1
.end method
