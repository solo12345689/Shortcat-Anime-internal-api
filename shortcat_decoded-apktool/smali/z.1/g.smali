.class final Lz/g;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lz/m;


# instance fields
.field private final a:Lkotlin/jvm/functions/Function1;

.field private final b:Lz/k;

.field private final c:Lx/N;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz/g;->a:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    new-instance p1, Lz/g$b;

    .line 7
    .line 8
    invoke-direct {p1, p0}, Lz/g$b;-><init>(Lz/g;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lz/g;->b:Lz/k;

    .line 12
    .line 13
    new-instance p1, Lx/N;

    .line 14
    .line 15
    invoke-direct {p1}, Lx/N;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lz/g;->c:Lx/N;

    .line 19
    .line 20
    return-void
.end method

.method public static final synthetic b(Lz/g;)Lz/k;
    .locals 0

    .line 1
    iget-object p0, p0, Lz/g;->b:Lz/k;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic c(Lz/g;)Lx/N;
    .locals 0

    .line 1
    iget-object p0, p0, Lz/g;->c:Lx/N;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public a(Lx/L;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lz/g$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, p2, v1}, Lz/g$a;-><init>(Lz/g;Lx/L;Lkotlin/jvm/functions/Function2;LZd/e;)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0, p3}, LGf/P;->e(Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

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

.method public final d()Lkotlin/jvm/functions/Function1;
    .locals 1

    .line 1
    iget-object v0, p0, Lz/g;->a:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object v0
.end method
