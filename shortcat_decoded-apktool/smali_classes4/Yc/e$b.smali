.class final LYc/e$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYc/e;->c(LPc/a;Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LYc/e;

.field final synthetic c:LPc/a;

.field final synthetic d:Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;


# direct methods
.method constructor <init>(LYc/e;LPc/a;Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LYc/e$b;->b:LYc/e;

    .line 2
    .line 3
    iput-object p2, p0, LYc/e$b;->c:LPc/a;

    .line 4
    .line 5
    iput-object p3, p0, LYc/e$b;->d:Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;

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
    new-instance p1, LYc/e$b;

    .line 2
    .line 3
    iget-object v0, p0, LYc/e$b;->b:LYc/e;

    .line 4
    .line 5
    iget-object v1, p0, LYc/e$b;->c:LPc/a;

    .line 6
    .line 7
    iget-object v2, p0, LYc/e$b;->d:Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, LYc/e$b;-><init>(LYc/e;LPc/a;Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;LZd/e;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LYc/e$b;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, LYc/e$b;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, LYc/e$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, LYc/e$b;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

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
    iget v1, p0, LYc/e$b;->a:I

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
    iget-object p1, p0, LYc/e$b;->b:LYc/e;

    .line 28
    .line 29
    iget-object v1, p0, LYc/e$b;->c:LPc/a;

    .line 30
    .line 31
    iget-object v3, p0, LYc/e$b;->d:Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;

    .line 32
    .line 33
    iput v2, p0, LYc/e$b;->a:I

    .line 34
    .line 35
    invoke-virtual {p1, v1, v3, p0}, LYc/e;->e(LPc/a;Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;LZd/e;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-ne p1, v0, :cond_2

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_2
    :goto_0
    check-cast p1, Landroid/app/Notification;

    .line 43
    .line 44
    iget-object v0, p0, LYc/e$b;->b:LYc/e;

    .line 45
    .line 46
    invoke-virtual {v0}, LYc/e;->h()Landroid/content/Context;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-static {v0}, Landroidx/core/app/q;->i(Landroid/content/Context;)Landroidx/core/app/q;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget-object v1, p0, LYc/e$b;->c:LPc/a;

    .line 55
    .line 56
    invoke-virtual {v1}, LPc/a;->a()LPc/g;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v1}, LPc/g;->b()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iget-object v2, p0, LYc/e$b;->b:LYc/e;

    .line 65
    .line 66
    iget-object v3, p0, LYc/e$b;->c:LPc/a;

    .line 67
    .line 68
    invoke-virtual {v3}, LPc/a;->a()LPc/g;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {v2, v3}, LYc/e;->k(LPc/g;)I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    invoke-virtual {v0, v1, v2, p1}, Landroidx/core/app/q;->q(Ljava/lang/String;ILandroid/app/Notification;)V

    .line 77
    .line 78
    .line 79
    sget-object p1, LTd/L;->a:LTd/L;

    .line 80
    .line 81
    return-object p1
.end method
