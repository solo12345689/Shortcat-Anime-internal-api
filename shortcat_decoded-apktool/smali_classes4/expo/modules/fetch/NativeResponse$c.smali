.class final Lexpo/modules/fetch/NativeResponse$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/fetch/NativeResponse;->S1(LBb/p;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lexpo/modules/fetch/NativeResponse;

.field final synthetic c:LBb/p;


# direct methods
.method constructor <init>(Lexpo/modules/fetch/NativeResponse;LBb/p;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/fetch/NativeResponse$c;->b:Lexpo/modules/fetch/NativeResponse;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/fetch/NativeResponse$c;->c:LBb/p;

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

.method public static synthetic a(LBb/p;Lkotlin/jvm/functions/Function1;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/fetch/NativeResponse$c;->i(LBb/p;Lkotlin/jvm/functions/Function1;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final i(LBb/p;Lkotlin/jvm/functions/Function1;)Z
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 2

    .line 1
    new-instance p1, Lexpo/modules/fetch/NativeResponse$c;

    .line 2
    .line 3
    iget-object v0, p0, Lexpo/modules/fetch/NativeResponse$c;->b:Lexpo/modules/fetch/NativeResponse;

    .line 4
    .line 5
    iget-object v1, p0, Lexpo/modules/fetch/NativeResponse$c;->c:LBb/p;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lexpo/modules/fetch/NativeResponse$c;-><init>(Lexpo/modules/fetch/NativeResponse;LBb/p;LZd/e;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lexpo/modules/fetch/NativeResponse$c;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lexpo/modules/fetch/NativeResponse$c;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lexpo/modules/fetch/NativeResponse$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/fetch/NativeResponse$c;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lexpo/modules/fetch/NativeResponse$c;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lexpo/modules/fetch/NativeResponse$c;->b:Lexpo/modules/fetch/NativeResponse;

    .line 12
    .line 13
    invoke-static {p1}, Lexpo/modules/fetch/NativeResponse;->Y(Lexpo/modules/fetch/NativeResponse;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object v0, p0, Lexpo/modules/fetch/NativeResponse$c;->c:LBb/p;

    .line 18
    .line 19
    new-instance v1, Lexpo/modules/fetch/a;

    .line 20
    .line 21
    invoke-direct {v1, v0}, Lexpo/modules/fetch/a;-><init>(LBb/p;)V

    .line 22
    .line 23
    .line 24
    invoke-static {p1, v1}, LUd/u;->K(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    .line 25
    .line 26
    .line 27
    sget-object p1, LTd/L;->a:LTd/L;

    .line 28
    .line 29
    return-object p1

    .line 30
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 31
    .line 32
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 33
    .line 34
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1
.end method
