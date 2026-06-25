.class public final Lexpo/modules/updates/UpdatesModule$k;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/updates/UpdatesModule;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lexpo/modules/updates/UpdatesModule;


# direct methods
.method public constructor <init>(LZd/e;Lexpo/modules/updates/UpdatesModule;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lexpo/modules/updates/UpdatesModule$k;->b:Lexpo/modules/updates/UpdatesModule;

    .line 2
    .line 3
    const/4 p2, 0x3

    .line 4
    invoke-direct {p0, p2, p1}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a(LGf/O;[Ljava/lang/Object;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p1, Lexpo/modules/updates/UpdatesModule$k;

    .line 2
    .line 3
    iget-object p2, p0, Lexpo/modules/updates/UpdatesModule$k;->b:Lexpo/modules/updates/UpdatesModule;

    .line 4
    .line 5
    invoke-direct {p1, p3, p2}, Lexpo/modules/updates/UpdatesModule$k;-><init>(LZd/e;Lexpo/modules/updates/UpdatesModule;)V

    .line 6
    .line 7
    .line 8
    sget-object p2, LTd/L;->a:LTd/L;

    .line 9
    .line 10
    invoke-virtual {p1, p2}, Lexpo/modules/updates/UpdatesModule$k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LGf/O;

    .line 2
    .line 3
    check-cast p2, [Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p3, LZd/e;

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2, p3}, Lexpo/modules/updates/UpdatesModule$k;->a(LGf/O;[Ljava/lang/Object;LZd/e;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
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
    iget v1, p0, Lexpo/modules/updates/UpdatesModule$k;->a:I

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
    sget-object p1, Lexpo/modules/updates/UpdatesModule;->d:Lexpo/modules/updates/UpdatesModule$a;

    .line 28
    .line 29
    iget-object v1, p0, Lexpo/modules/updates/UpdatesModule$k;->b:Lexpo/modules/updates/UpdatesModule;

    .line 30
    .line 31
    invoke-static {v1}, Lexpo/modules/updates/UpdatesModule;->x(Lexpo/modules/updates/UpdatesModule;)Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const-string v3, "getFilesDir(...)"

    .line 40
    .line 41
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    sget-object v3, Lexpo/modules/updates/UpdatesModule$b;->a:Lexpo/modules/updates/UpdatesModule$b;

    .line 45
    .line 46
    iput v2, p0, Lexpo/modules/updates/UpdatesModule$k;->a:I

    .line 47
    .line 48
    invoke-virtual {p1, v1, v3, p0}, Lexpo/modules/updates/UpdatesModule$a;->a(Ljava/io/File;Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-ne p1, v0, :cond_2

    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_2
    :goto_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 56
    .line 57
    return-object p1
.end method
