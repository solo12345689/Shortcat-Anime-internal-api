.class final Lvd/a$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvd/a;->i(Lexpo/modules/updates/db/UpdatesDatabase;LZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lvd/a;

.field final synthetic c:Lrd/a;

.field final synthetic d:Lexpo/modules/updates/db/UpdatesDatabase;

.field final synthetic e:Lyd/d;

.field final synthetic f:Lorg/json/JSONObject;


# direct methods
.method constructor <init>(Lvd/a;Lrd/a;Lexpo/modules/updates/db/UpdatesDatabase;Lyd/d;Lorg/json/JSONObject;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lvd/a$d;->b:Lvd/a;

    .line 2
    .line 3
    iput-object p2, p0, Lvd/a$d;->c:Lrd/a;

    .line 4
    .line 5
    iput-object p3, p0, Lvd/a$d;->d:Lexpo/modules/updates/db/UpdatesDatabase;

    .line 6
    .line 7
    iput-object p4, p0, Lvd/a$d;->e:Lyd/d;

    .line 8
    .line 9
    iput-object p5, p0, Lvd/a$d;->f:Lorg/json/JSONObject;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 7

    .line 1
    new-instance v0, Lvd/a$d;

    .line 2
    .line 3
    iget-object v1, p0, Lvd/a$d;->b:Lvd/a;

    .line 4
    .line 5
    iget-object v2, p0, Lvd/a$d;->c:Lrd/a;

    .line 6
    .line 7
    iget-object v3, p0, Lvd/a$d;->d:Lexpo/modules/updates/db/UpdatesDatabase;

    .line 8
    .line 9
    iget-object v4, p0, Lvd/a$d;->e:Lyd/d;

    .line 10
    .line 11
    iget-object v5, p0, Lvd/a$d;->f:Lorg/json/JSONObject;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Lvd/a$d;-><init>(Lvd/a;Lrd/a;Lexpo/modules/updates/db/UpdatesDatabase;Lyd/d;Lorg/json/JSONObject;LZd/e;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lvd/a$d;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lvd/a$d;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lvd/a$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lvd/a$d;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

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
    iget v1, p0, Lvd/a$d;->a:I

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
    goto :goto_0

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
    iget-object v1, p0, Lvd/a$d;->b:Lvd/a;

    .line 29
    .line 30
    move p1, v2

    .line 31
    iget-object v2, p0, Lvd/a$d;->c:Lrd/a;

    .line 32
    .line 33
    iget-object v3, p0, Lvd/a$d;->d:Lexpo/modules/updates/db/UpdatesDatabase;

    .line 34
    .line 35
    iget-object v4, p0, Lvd/a$d;->e:Lyd/d;

    .line 36
    .line 37
    iget-object v5, p0, Lvd/a$d;->f:Lorg/json/JSONObject;

    .line 38
    .line 39
    iput p1, p0, Lvd/a$d;->a:I

    .line 40
    .line 41
    move-object v6, p0

    .line 42
    invoke-virtual/range {v1 .. v6}, Lvd/a;->g(Lrd/a;Lexpo/modules/updates/db/UpdatesDatabase;Lyd/d;Lorg/json/JSONObject;LZd/e;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-ne p1, v0, :cond_2

    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_2
    :goto_0
    check-cast p1, Ljava/io/File;

    .line 50
    .line 51
    new-instance v0, Lkotlin/Pair;

    .line 52
    .line 53
    iget-object v1, v6, Lvd/a$d;->c:Lrd/a;

    .line 54
    .line 55
    invoke-direct {v0, v1, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-object v0
.end method
