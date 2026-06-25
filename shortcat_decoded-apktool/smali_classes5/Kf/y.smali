.class final LKf/y;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LJf/f;


# instance fields
.field private final a:LZd/i;

.field private final b:Ljava/lang/Object;

.field private final c:Lkotlin/jvm/functions/Function2;


# direct methods
.method public constructor <init>(LJf/f;LZd/i;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LKf/y;->a:LZd/i;

    .line 5
    .line 6
    invoke-static {p2}, LLf/L;->g(LZd/i;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    iput-object p2, p0, LKf/y;->b:Ljava/lang/Object;

    .line 11
    .line 12
    new-instance p2, LKf/y$a;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-direct {p2, p1, v0}, LKf/y$a;-><init>(LJf/f;LZd/e;)V

    .line 16
    .line 17
    .line 18
    iput-object p2, p0, LKf/y;->c:Lkotlin/jvm/functions/Function2;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public emit(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LKf/y;->a:LZd/i;

    .line 2
    .line 3
    iget-object v1, p0, LKf/y;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, LKf/y;->c:Lkotlin/jvm/functions/Function2;

    .line 6
    .line 7
    invoke-static {v0, p1, v1, v2, p2}, LKf/f;->b(LZd/i;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    if-ne p1, p2, :cond_0

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 19
    .line 20
    return-object p1
.end method
