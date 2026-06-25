.class final LJf/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LJf/e;


# instance fields
.field private final a:LJf/e;

.field public final b:Lkotlin/jvm/functions/Function1;

.field public final c:Lkotlin/jvm/functions/Function2;


# direct methods
.method public constructor <init>(LJf/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LJf/d;->a:LJf/e;

    .line 5
    .line 6
    iput-object p2, p0, LJf/d;->b:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    iput-object p3, p0, LJf/d;->c:Lkotlin/jvm/functions/Function2;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public collect(LJf/f;LZd/e;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lkotlin/jvm/internal/N;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, LKf/p;->a:LLf/E;

    .line 7
    .line 8
    iput-object v1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v1, p0, LJf/d;->a:LJf/e;

    .line 11
    .line 12
    new-instance v2, LJf/d$a;

    .line 13
    .line 14
    invoke-direct {v2, p0, v0, p1}, LJf/d$a;-><init>(LJf/d;Lkotlin/jvm/internal/N;LJf/f;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v1, v2, p2}, LJf/e;->collect(LJf/f;LZd/e;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    if-ne p1, p2, :cond_0

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 29
    .line 30
    return-object p1
.end method
