.class final Lexpo/modules/updates/UpdatesPackage$c$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/updates/UpdatesPackage$c;->j(Landroid/content/Context;ZLZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Landroid/content/Context;

.field final synthetic c:Z


# direct methods
.method constructor <init>(Landroid/content/Context;ZLZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/updates/UpdatesPackage$c$c;->b:Landroid/content/Context;

    .line 2
    .line 3
    iput-boolean p2, p0, Lexpo/modules/updates/UpdatesPackage$c$c;->c:Z

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 2

    .line 1
    new-instance p1, Lexpo/modules/updates/UpdatesPackage$c$c;

    .line 2
    .line 3
    iget-object v0, p0, Lexpo/modules/updates/UpdatesPackage$c$c;->b:Landroid/content/Context;

    .line 4
    .line 5
    iget-boolean v1, p0, Lexpo/modules/updates/UpdatesPackage$c$c;->c:Z

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lexpo/modules/updates/UpdatesPackage$c$c;-><init>(Landroid/content/Context;ZLZd/e;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lexpo/modules/updates/UpdatesPackage$c$c;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lexpo/modules/updates/UpdatesPackage$c$c;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lexpo/modules/updates/UpdatesPackage$c$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/updates/UpdatesPackage$c$c;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lexpo/modules/updates/UpdatesPackage$c$c;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    sget-object p1, Lexpo/modules/updates/UpdatesPackage;->a:Lexpo/modules/updates/UpdatesPackage$a;

    .line 12
    .line 13
    invoke-virtual {p1}, Lexpo/modules/updates/UpdatesPackage$a;->a()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    iget-object p1, p0, Lexpo/modules/updates/UpdatesPackage$c$c;->b:Landroid/content/Context;

    .line 20
    .line 21
    iget-boolean v0, p0, Lexpo/modules/updates/UpdatesPackage$c$c;->c:Z

    .line 22
    .line 23
    invoke-static {p1, v0}, Lexpo/modules/updates/f;->b(Landroid/content/Context;Z)V

    .line 24
    .line 25
    .line 26
    invoke-static {}, Lexpo/modules/updates/f;->a()Lexpo/modules/updates/c;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-interface {p1}, Lexpo/modules/updates/c;->b()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    :cond_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 34
    .line 35
    return-object p1

    .line 36
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 37
    .line 38
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p1
.end method
